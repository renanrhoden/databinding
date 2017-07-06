package com.ilegra.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class User extends BaseObservable {
    private final String firstName;
    private final String lastName;
    private boolean visible;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        visible = true;
    }

    @Bindable
    public boolean isVisible() {
        return visible;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    @Bindable
    public void setVisible(boolean visible) {
        notifyPropertyChanged(BR.visible);
        this.visible = visible;
    }
    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext())
                .load(imageUrl)
                .into(view);
    }

    public String getImageUrl() {
        return "https://www.android.com/static/2016/img/share/andy-lg.png";
    }

    public void setImageUrl(String imageUrl) {
        //this.imageUrl = imageUrl;
    }

}
