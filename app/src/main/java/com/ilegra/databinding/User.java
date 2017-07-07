package com.ilegra.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class User extends BaseObservable {
    private final String firstName;
    private final String lastName;
    private boolean visible;
    public ObservableField<Drawable> androidImage;
    private int image = 0;
    private String[] urls = {
            "http://woikr.com/wp/wp-content/uploads/2011/02/chirag_androidified.png",
            "https://www1-lw.xda-cdn.com/files/2011/02/11.jpg",
            "http://img.talkandroid.com/uploads/2015/02/androidify_nba_update_portland_trail_blazers.png",
            "https://jonuy.files.wordpress.com/2011/02/androidify.png?w=300&h=300",
            "http://2.bp.blogspot.com/-DEH3eHSjMkE/TVlKIySmSlI/AAAAAAAAQWE/EDcAwLqC-So/s1600/android.png"};

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
        this.visible = visible;
        notifyPropertyChanged(BR.visible);
    }
    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext())
                .load(imageUrl)
                .into(view);
    }
    @BindingAdapter({"bind:font"})
    public static void setFont(TextView textView, String fontName){
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + fontName));
    }

    public String getImageUrl() {
        if(image < urls.length){
            image++;
        } else {
            image = 0;
        }
        return urls[image];
    }
}
