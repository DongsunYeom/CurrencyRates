package com.dongsun.github.ui;

import java.lang.System;

/**
 * * ViewModel for the [SearchRepositoriesActivity] screen.
 * * The ViewModel works with the [DataRepository] to get the data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/dongsun/github/ui/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "networkErrors", "Landroidx/lifecycle/LiveData;", "", "getNetworkErrors", "()Landroidx/lifecycle/LiveData;", "queryLiveData", "Landroidx/lifecycle/MutableLiveData;", "repos", "", "Lcom/dongsun/github/db/TableCountry;", "getRepos", "repository", "Lcom/dongsun/github/repository/DataRepository;", "result", "Lcom/dongsun/github/model/SearchResult;", "lastQueryValue", "listScrolled", "", "visibleItemCount", "", "lastVisibleItemPosition", "totalItemCount", "searchRepo", "queryString", "Companion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.dongsun.github.repository.DataRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> queryLiveData = null;
    private final androidx.lifecycle.LiveData<com.dongsun.github.model.SearchResult> result = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.dongsun.github.db.TableCountry>> repos = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> networkErrors = null;
    private static final int VISIBLE_THRESHOLD = 5;
    public static final com.dongsun.github.ui.MainViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dongsun.github.db.TableCountry>> getRepos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getNetworkErrors() {
        return null;
    }
    
    /**
     * * Search a repository based on a query string.
     */
    public final void searchRepo(@org.jetbrains.annotations.NotNull()
    java.lang.String queryString) {
    }
    
    public final void listScrolled(int visibleItemCount, int lastVisibleItemPosition, int totalItemCount) {
    }
    
    /**
     * * Get the last query value.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String lastQueryValue() {
        return null;
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dongsun/github/ui/MainViewModel$Companion;", "", "()V", "VISIBLE_THRESHOLD", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}