package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","하나"));
        words.add(new Word("two","둘"));
        words.add(new Word("three","셋"));
        words.add(new Word("four","넷"));
        words.add(new Word("five","다섯"));
        words.add(new Word("six","여섯"));
        words.add(new Word("seven","일곱"));
        words.add(new Word("eight","여덟"));
        words.add(new Word("nine","아홉"));
        words.add(new Word("ten","열"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.rootView);

        listView.setAdapter(adapter);

    }
}