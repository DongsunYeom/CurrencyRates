package com.dongsun.github.databinding;
import com.dongsun.github.R;
import com.dongsun.github.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewItemBindingImpl extends ViewItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rate, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ViewItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.dongsun.github.ui.CircleImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.image.setTag(null);
        this.itemlayout.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.tableCountry == variableId) {
            setTableCountry((com.dongsun.github.db.TableCountry) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTableCountry(@Nullable com.dongsun.github.db.TableCountry TableCountry) {
        this.mTableCountry = TableCountry;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tableCountry);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String tableCountryName = null;
        java.lang.String tableCountryImgUrl = null;
        com.dongsun.github.db.TableCountry tableCountry = mTableCountry;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tableCountry != null) {
                    // read tableCountry.name
                    tableCountryName = tableCountry.getName();
                    // read tableCountry.imgUrl
                    tableCountryImgUrl = tableCountry.getImgUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.dongsun.github.ui.binding.BindingAdapters.loadImage(this.image, tableCountryImgUrl, getDrawableFromResource(image, R.drawable.default_flag));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, tableCountryName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tableCountry
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}