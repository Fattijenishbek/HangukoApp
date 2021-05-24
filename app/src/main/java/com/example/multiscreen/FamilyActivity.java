package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","아버지"));
        words.add(new Word("mother","어머니"));
        words.add(new Word("son","아들"));
        words.add(new Word("daughter","딸"));
        words.add(new Word("brother","형/오빠"));
        words.add(new Word("sister","누나/언니"));
        words.add(new Word("siblings","형제자매"));
        words.add(new Word("child","아이"));
        words.add(new Word("grandmother","할머니"));
        words.add(new Word("grandfather","할아버색"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.rootView1);

        listView.setAdapter(adapter);

    }
}