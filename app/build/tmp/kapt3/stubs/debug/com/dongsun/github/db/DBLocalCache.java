package com.dongsun.github.db;

import java.lang.System;

/**
 * * Class that handles the DAO local data source. This ensures that methods are triggered on the
 * * correct executor.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dongsun/github/db/DBLocalCache;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ioExecutor", "Ljava/util/concurrent/Executor;", "mainTable", "Lcom/dongsun/github/db/MainDBCommand;", "insert", "", "repos", "", "Lcom/dongsun/github/db/TableCountry;", "insertFinished", "Lkotlin/Function0;", "reposByName", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class DBLocalCache {
    private final com.dongsun.github.db.MainDBCommand mainTable = null;
    private final java.util.concurrent.Executor ioExecutor = null;
    
    /**
     * * Insert a list of repos in the database, on a background thread.
     */
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dongsun.github.db.TableCountry> repos, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> insertFinished) {
    }
    
    /**
     * * Request a LiveData<List<Repo>> from the Dao, based on a repo name. If the name contains
     *     * multiple words separated by spaces, then we're emulating the GitHub API behavior and allow
     *     * any characters between the words.
     *     * @param name repository name
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dongsun.github.db.TableCountry>> reposByName() {
        return null;
    }
    
    public DBLocalCache(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}