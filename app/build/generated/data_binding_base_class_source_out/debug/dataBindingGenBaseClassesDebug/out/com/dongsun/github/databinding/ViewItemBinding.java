package com.dongsun.github.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dongsun.github.db.TableCountry;
import com.dongsun.github.ui.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewItemBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView image;

  @NonNull
  public final LinearLayout itemlayout;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView rate;

  @Bindable
  protected TableCountry mTableCountry;

  protected ViewItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView image, LinearLayout itemlayout, TextView name, TextView rate) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
    this.itemlayout = itemlayout;
    this.name = name;
    this.rate = rate;
  }

  public abstract void setTableCountry(@Nullable TableCountry tableCountry);

  @Nullable
  public TableCountry getTableCountry() {
    return mTableCountry;
  }

  @NonNull
  public static ViewItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewItemBinding>inflateInternal(inflater, com.dongsun.github.R.layout.view_item, root, attachToRoot, component);
  }

  @NonNull
  public static ViewItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewItemBinding>inflateInternal(inflater, com.dongsun.github.R.layout.view_item, null, false, component);
  }

  public static ViewItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ViewItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ViewItemBinding)bind(component, view, com.dongsun.github.R.layout.view_item);
  }
}
