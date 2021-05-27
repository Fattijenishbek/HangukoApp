package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Good morning","안녕아세요 / 은 아침"));
        words.add(new Word("Hello","안녕"));
        words.add(new Word("My name is …","제 이름은..."));
        words.add(new Word("Do you speak English?","영어로 말합니까?"));
        words.add(new Word("What’s your name?","이름이 뭐십니까"));
        words.add(new Word("How are you?","어떻게 지냈어요?"));
        words.add(new Word("Fine, thank you","종아요, 감사합니다!"));
        words.add(new Word("Nice to meet you","만나서 반가워좋요"));
        words.add(new Word("Sorry, I don’t understand","죄송합니다, 이해가 안 뙜어요"));
        words.add(new Word("Goodbye","안녕히 가세요 / 안녕히 게세지"));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}