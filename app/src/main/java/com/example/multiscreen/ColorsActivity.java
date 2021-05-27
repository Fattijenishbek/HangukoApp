package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red","빨간색",R.drawable.color_red));
        words.add(new Word("green","초록색",R.drawable.color_green));
        words.add(new Word("brown","갈색",R.drawable.color_brown));
        words.add(new Word("orange","주화색",R.drawable.color_dusty_yellow));
        words.add(new Word("yellow","노란색",R.drawable.color_mustard_yellow));
        words.add(new Word("blue","파란색"));
        words.add(new Word("purple","보라색"));
        words.add(new Word("pink","분호색"));
        words.add(new Word("white","하얀색",R.drawable.color_white));
        words.add(new Word("black","검정열",R.drawable.color_black));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}