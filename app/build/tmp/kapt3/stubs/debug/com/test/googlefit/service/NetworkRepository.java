package com.test.googlefit.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/test/googlefit/service/NetworkRepository;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "mRequestQueue", "Lcom/android/volley/RequestQueue;", "mStringRequest", "Lcom/android/volley/toolbox/StringRequest;", "sendAndRequestResponse", "", "context", "Landroid/content/Context;", "base", "dataView", "Lcom/dongsun/github/ui/MainDataListener;", "app_debug"})
public final class NetworkRepository {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BASE_URL = "https://api.exchangeratesapi.io/";
    private com.android.volley.RequestQueue mRequestQueue;
    private com.android.volley.toolbox.StringRequest mStringRequest;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    public final void sendAndRequestResponse(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.dongsun.github.ui.MainDataListener dataView) {
    }
    
    public NetworkRepository() {
        super();
    }
}