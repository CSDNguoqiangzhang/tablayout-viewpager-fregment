package com.example.main.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.main.R;
import com.example.main.item_fragment.ItemFragment;
import com.example.main.item_fragment.ItemFragment2;
import com.example.main.item_fragment.ItemFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

public class followFragment extends Fragment {
    private List<Fragment> mFragments;
    private ItemFragmentAdapter imAdapter;
    private ViewPager viewpager;
    private Context con;
    private TabLayout tablayout2;
    private String[] names = {"我关注的人", "关注我的人"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.activity_guanzhu, container, false);
        con = getActivity();
        viewpager = view1.findViewById(R.id.viewpager2);
        tablayout2 = view1.findViewById(R.id.tablayout2);
        init();
        return view1;
    }

    private void init() {

        mFragments = new ArrayList<>();
        mFragments.add(new ItemFragment());
        mFragments.add(new ItemFragment2());
        imAdapter = new ItemFragmentAdapter(getChildFragmentManager(), names, mFragments, con);
        viewpager.setAdapter(imAdapter);
        tablayout2.setupWithViewPager(viewpager);


    }
}
