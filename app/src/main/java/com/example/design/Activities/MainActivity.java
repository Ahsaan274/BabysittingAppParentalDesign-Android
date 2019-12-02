package com.example.design.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.design.Adapters.ViewPagerAdapter;
import com.example.design.Fragment.homeFragment;
import com.example.design.Fragment.liveFragment;
import com.example.design.Fragment.upcomingFragment;
import com.example.design.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new homeFragment(), "Home");
        adapter.AddFragment(new upcomingFragment(), "Upcoming");
        adapter.AddFragment(new liveFragment(), "Live");
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home);
        tabLayout.setupWithViewPager(viewPager);
    }
}