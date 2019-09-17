package com.dongsun.github.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class MainDatabase_Impl extends MainDatabase {
  private volatile MainDBCommand _mainDBCommand;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `countrys` (`name` TEXT NOT NULL, `rate` REAL NOT NULL, `imgUrl` TEXT, PRIMARY KEY(`name`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"4be4a44776b59952396ed5a9f2ec00cf\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `countrys`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCountrys = new HashMap<String, TableInfo.Column>(3);
        _columnsCountrys.put("name", new TableInfo.Column("name", "TEXT", true, 1));
        _columnsCountrys.put("rate", new TableInfo.Column("rate", "REAL", true, 0));
        _columnsCountrys.put("imgUrl", new TableInfo.Column("imgUrl", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCountrys = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCountrys = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCountrys = new TableInfo("countrys", _columnsCountrys, _foreignKeysCountrys, _indicesCountrys);
        final TableInfo _existingCountrys = TableInfo.read(_db, "countrys");
        if (! _infoCountrys.equals(_existingCountrys)) {
          throw new IllegalStateException("Migration didn't properly handle countrys(com.dongsun.github.db.TableCountry).\n"
                  + " Expected:\n" + _infoCountrys + "\n"
                  + " Found:\n" + _existingCountrys);
        }
      }
    }, "4be4a44776b59952396ed5a9f2ec00cf", "290e88457d6874b2b1f407cdd6bdaec0");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "countrys");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `countrys`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MainDBCommand mainTable() {
    if (_mainDBCommand != null) {
      return _mainDBCommand;
    } else {
      synchronized(this) {
        if(_mainDBCommand == null) {
          _mainDBCommand = new MainDBCommand_Impl(this);
        }
        return _mainDBCommand;
      }
    }
  }
}
