package com.ilegra.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {
    private final String firstName;
    private final String lastName;
    private boolean visible;
    private int image = 0;

    @Bindable
    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
        notifyPropertyChanged(BR.padding);
    }

    private int padding = 0;


    public String[] getUrls() {
        return urls;
    }

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

    public String getImageUrl() {
        if(image < urls.length - 1){
            image++;
        } else {
            image = 0;
        }
        return urls[image];
    }

}
