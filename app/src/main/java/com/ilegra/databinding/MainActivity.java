package com.ilegra.databinding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ilegra.databinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private User user;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("Test", "User");
        binding.setUser(user);
    }
    public void hideButtton (View view) {
        if (binding.getUser().getFirstName().isEmpty()){
            binding.setUser(user);
        } else {
            binding.setUser(new User("", ""));
        }

    }
}
