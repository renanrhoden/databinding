package com.ilegra.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;
import android.util.Log;

public class User extends BaseObservable {
    private final String firstName;
    private final String lastName;
    private boolean visible;

    @Bindable
    public boolean isVisible() {
        return visible;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        visible = true;
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

}
