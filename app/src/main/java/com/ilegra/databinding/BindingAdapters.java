package com.ilegra.databinding;

import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class BindingAdapters {

    @BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext())
                .load(imageUrl)
                .into(view);
    }
    @BindingAdapter({"bind:font"})
    public static void setFont(TextView textView, String fontName){
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + fontName));
    }
    @BindingAdapter({"bind:font"})
    public static void setFont(Button button, String fontName){
        button.setTypeface(Typeface.createFromAsset(button.getContext().getAssets(), "fonts/" + fontName));
    }
    @BindingAdapter({"bind:pad"})
    public static void setPad(SeekBar seekBar, final User user){
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                user.setPadding(10*i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

}
