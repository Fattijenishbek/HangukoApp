package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red","빨간색"));
        words.add(new Word("green","초록색"));
        words.add(new Word("brown","갈색"));
        words.add(new Word("orange","주화색"));
        words.add(new Word("yellow","노란색"));
        words.add(new Word("blue","파란색"));
        words.add(new Word("purple","보라색"));
        words.add(new Word("pink","분호색"));
        words.add(new Word("white","하얀색"));
        words.add(new Word("black","검정열"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.rootView2);

        listView.setAdapter(adapter);
    }
}