package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","아버지",R.drawable.family_father));
        words.add(new Word("mother","어머니",R.drawable.family_mother));
        words.add(new Word("son","아들",R.drawable.family_son));
        words.add(new Word("daughter","딸",R.drawable.family_daughter));
        words.add(new Word("brother","형/오빠",R.drawable.family_older_brother));
        words.add(new Word("sister","누나/언니",R.drawable.family_older_sister));
        words.add(new Word("siblings","형제자매",R.drawable.family_younger_sister));
        words.add(new Word("child","아이",R.drawable.family_younger_brother));
        words.add(new Word("grandmother","할머니",R.drawable.family_grandmother));
        words.add(new Word("grandfather","할아버색",R.drawable.family_grandfather));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}