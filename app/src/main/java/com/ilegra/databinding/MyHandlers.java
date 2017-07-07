package com.ilegra.databinding;

import android.databinding.BaseObservable;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MyHandlers extends BaseObservable{

    public void onLoadImageClick(View view, ImageView imageView, User user){
        Picasso.with(view.getContext())
                .load(user.getImageUrl())
                .into(imageView);
    }
}
