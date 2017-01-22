package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHost host = (TabHost)findViewById(R.id.tabhost);
        host.setup();

//        addTab(host, "Playing","Tab One", new Intent().setClass(this, nowplaying.class));
//        addTab(host, "My Music", "Tab Two", new Intent().setClass(this, mymusic.class));
//        addTab(host, "Music Shop", "Tab Three", new Intent().setClass(this, musicshop.class));


        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("正在播放");
        host.addTab(spec);
        host.setup();
        //Tab 2

        spec = host.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("个性推荐");
        host.addTab(spec);
        //Tab 3
        spec = host.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("我的音乐");
        host.addTab(spec);

        spec = host.newTabSpec("Tab Four");
        spec.setContent(R.id.tab4);
        spec.setIndicator("音乐商店");
        host.addTab(spec);

        //        跳转至商店activity
        TextView shop1 = (TextView) findViewById(R.id.t4_1);
        shop1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, musicshop.class);
                startActivity(numbersIntent);
            }
        });

        //        跳转至歌手信息activity
        TextView singer_info = (TextView) findViewById(R.id.singer);
        singer_info.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent singerIntent = new Intent(MainActivity.this, singer.class);
                startActivity(singerIntent);
            }
        });
        //        跳转至专辑信息activity
        TextView album_info = (TextView) findViewById(R.id.album);
        album_info.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, album.class);
                startActivity(albumIntent);
            }
        });

        //        跳转至推荐activity
        ImageView recom = (ImageView) findViewById(R.id.earphone);
        recom.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent recomIntent = new Intent(MainActivity.this, mymusic.class);
                startActivity(recomIntent);
            }
        });
    }
    public void addTab(TabHost host, String title, String tag, Intent intent) {
        TabHost.TabSpec spec = host.newTabSpec(tag);
        spec.setContent(intent);
        spec.setIndicator(title);
        host.addTab(spec);
    }

}
