package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","하나",R.drawable.number_one));
        words.add(new Word("two","둘",R.drawable.number_two));
        words.add(new Word("three","셋",R.drawable.number_three));
        words.add(new Word("four","넷",R.drawable.number_four));
        words.add(new Word("five","다섯",R.drawable.number_five));
        words.add(new Word("six","여섯",R.drawable.number_six));
        words.add(new Word("seven","일곱",R.drawable.number_seven));
        words.add(new Word("eight","여덟",R.drawable.number_eight));
        words.add(new Word("nine","아홉",R.drawable.number_nine));
        words.add(new Word("ten","열",R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}