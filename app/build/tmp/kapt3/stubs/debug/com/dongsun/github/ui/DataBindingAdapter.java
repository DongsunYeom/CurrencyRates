package com.dongsun.github.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000201B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u001c\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001aJ\u0014\u0010+\u001a\u00020\u001d2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-J\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020$R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00062"}, d2 = {"Lcom/dongsun/github/ui/DataBindingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dongsun/github/ui/DataBindingAdapter$UserViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "arrayList", "", "Lcom/dongsun/github/db/TableCountry;", "getArrayList", "()Ljava/util/List;", "setArrayList", "(Ljava/util/List;)V", "currentRate", "", "Ljava/lang/Float;", "layoutInflater", "Landroid/view/LayoutInflater;", "onItemClickListener", "Lcom/dongsun/github/ui/DataBindingAdapter$OnItemClickListener;", "getOnItemClickListener$app_debug", "()Lcom/dongsun/github/ui/DataBindingAdapter$OnItemClickListener;", "setOnItemClickListener$app_debug", "(Lcom/dongsun/github/ui/DataBindingAdapter$OnItemClickListener;)V", "getItem", "position", "", "getItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "roundOffDecimal", "", "number", "", "setOnItemClickListener", "swapeItem", "fromPosition", "toPosition", "updateItems", "items", "", "updateRates", "value", "OnItemClickListener", "UserViewHolder", "app_debug"})
public final class DataBindingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dongsun.github.ui.DataBindingAdapter.UserViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.dongsun.github.db.TableCountry> arrayList;
    @org.jetbrains.annotations.Nullable()
    private com.dongsun.github.ui.DataBindingAdapter.OnItemClickListener onItemClickListener;
    private android.view.LayoutInflater layoutInflater;
    private java.lang.Float currentRate;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable()
    protected final java.util.List<com.dongsun.github.db.TableCountry> getArrayList() {
        return null;
    }
    
    protected final void setArrayList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dongsun.github.db.TableCountry> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dongsun.github.ui.DataBindingAdapter.OnItemClickListener getOnItemClickListener$app_debug() {
        return null;
    }
    
    public final void setOnItemClickListener$app_debug(@org.jetbrains.annotations.Nullable()
    com.dongsun.github.ui.DataBindingAdapter.OnItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dongsun.github.ui.DataBindingAdapter.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dongsun.github.ui.DataBindingAdapter.UserViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String roundOffDecimal(double number) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dongsun.github.db.TableCountry getItem(int position) {
        return null;
    }
    
    public final void updateItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dongsun.github.db.TableCountry> items) {
    }
    
    public final void updateRates(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void swapeItem(int fromPosition, int toPosition) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.dongsun.github.ui.DataBindingAdapter.OnItemClickListener onItemClickListener) {
    }
    
    public DataBindingAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/dongsun/github/ui/DataBindingAdapter$OnItemClickListener;", "", "onItemClick", "", "country", "Lcom/dongsun/github/db/TableCountry;", "position", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.dongsun.github.db.TableCountry country, int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/dongsun/github/ui/DataBindingAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "repoViewItemBinding", "Lcom/dongsun/github/databinding/ViewItemBinding;", "(Lcom/dongsun/github/ui/DataBindingAdapter;Lcom/dongsun/github/databinding/ViewItemBinding;)V", "getRepoViewItemBinding", "()Lcom/dongsun/github/databinding/ViewItemBinding;", "setRepoViewItemBinding", "(Lcom/dongsun/github/databinding/ViewItemBinding;)V", "app_debug"})
    public final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.dongsun.github.databinding.ViewItemBinding repoViewItemBinding;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dongsun.github.databinding.ViewItemBinding getRepoViewItemBinding() {
            return null;
        }
        
        public final void setRepoViewItemBinding(@org.jetbrains.annotations.NotNull()
        com.dongsun.github.databinding.ViewItemBinding p0) {
        }
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull()
        com.dongsun.github.databinding.ViewItemBinding repoViewItemBinding) {
            super(null);
        }
    }
}