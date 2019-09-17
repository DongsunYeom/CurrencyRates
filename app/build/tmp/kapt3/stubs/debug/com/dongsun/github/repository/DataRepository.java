package com.dongsun.github.repository;

import java.lang.System;

/**
 * * Repository class that works with local and remote data sources.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/dongsun/github/repository/DataRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cache", "Lcom/dongsun/github/db/DBLocalCache;", "isRequestDone", "", "mContext", "networkErrors", "Landroidx/lifecycle/MutableLiveData;", "", "requestAndSaveData", "", "query", "requestMore", "search", "Lcom/dongsun/github/model/SearchResult;", "app_debug"})
public final class DataRepository {
    private final android.content.Context mContext = null;
    private final com.dongsun.github.db.DBLocalCache cache = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> networkErrors = null;
    private boolean isRequestDone;
    
    /**
     * * Search repositories whose names match the query.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.dongsun.github.model.SearchResult search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public final void requestMore(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final void requestAndSaveData(java.lang.String query) {
    }
    
    public DataRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}