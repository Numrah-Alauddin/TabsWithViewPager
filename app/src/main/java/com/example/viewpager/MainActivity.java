package com.example.viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ViewPager pager;
    FragmentAdapter adapter;
    ArrayList<Fragment> list;
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        list.add(new First());
        list.add(new Second());
        list.add(new Third());

        pager.setAdapter(adapter);
        tabs.setupWithViewPager(pager);

        tabs.getTabAt(0).setIcon(android.R.drawable.btn_star);
        tabs.getTabAt(1).setIcon(android.R.drawable.ic_menu_call);
        tabs.getTabAt(2).setIcon(android.R.drawable.ic_dialog_email);

    }

    private void init() {
        pager=findViewById(R.id.view_pager);
        list=new ArrayList<>();
        adapter=new FragmentAdapter(getSupportFragmentManager(),list);
        tabs=findViewById(R.id.tabs);
    }
}
