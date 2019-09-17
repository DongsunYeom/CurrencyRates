package com.dongsun.github.db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class MainDBCommand_Impl implements MainDBCommand {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTableCountry;

  public MainDBCommand_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTableCountry = new EntityInsertionAdapter<TableCountry>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `countrys`(`name`,`rate`,`imgUrl`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TableCountry value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindDouble(2, value.getRate());
        if (value.getImgUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImgUrl());
        }
      }
    };
  }

  @Override
  public void insert(List<TableCountry> posts) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTableCountry.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<TableCountry>> reposByName() {
    final String _sql = "SELECT * FROM countrys ORDER BY name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<TableCountry>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<TableCountry> compute() {
        if (_observer == null) {
          _observer = new Observer("countrys") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfRate = _cursor.getColumnIndexOrThrow("rate");
          final int _cursorIndexOfImgUrl = _cursor.getColumnIndexOrThrow("imgUrl");
          final List<TableCountry> _result = new ArrayList<TableCountry>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TableCountry _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final double _tmpRate;
            _tmpRate = _cursor.getDouble(_cursorIndexOfRate);
            final String _tmpImgUrl;
            _tmpImgUrl = _cursor.getString(_cursorIndexOfImgUrl);
            _item = new TableCountry(_tmpName,_tmpRate,_tmpImgUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
