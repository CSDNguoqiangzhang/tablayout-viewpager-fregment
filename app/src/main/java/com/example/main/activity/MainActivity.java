package com.example.main.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.main.R;
import com.example.main.fragment.ChatFragment;
import com.example.main.fragment.ConversationFragment;
import com.example.main.fragment.MainAdapter;
import com.example.main.fragment.followFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout mTabLayout;
    ViewPager mViewPager;
    List<Fragment> fragments;
    private MainAdapter adapter;
    String[] titile = {"聊天", "关注", "通话"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = (TabLayout) findViewById(R.id.tablayout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        fragments = new ArrayList<>();
        fragments.add(new ChatFragment());
        fragments.add(new followFragment());
        fragments.add(new ConversationFragment());
        adapter = new MainAdapter(getSupportFragmentManager(), fragments, titile);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);


    }


}
