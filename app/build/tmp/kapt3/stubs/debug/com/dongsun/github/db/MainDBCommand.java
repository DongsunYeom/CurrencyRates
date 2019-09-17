package com.dongsun.github.db;

import java.lang.System;

/**
 * * Room data access object for accessing the [TableCountry] table.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/dongsun/github/db/MainDBCommand;", "", "insert", "", "posts", "", "Lcom/dongsun/github/db/TableCountry;", "reposByName", "Landroidx/lifecycle/LiveData;", "app_debug"})
public abstract interface MainDBCommand {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dongsun.github.db.TableCountry> posts);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM countrys ORDER BY name ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dongsun.github.db.TableCountry>> reposByName();
}