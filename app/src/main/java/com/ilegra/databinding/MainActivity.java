package com.ilegra.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        binding.setHandlers(new MyHandlers());
    }
}
