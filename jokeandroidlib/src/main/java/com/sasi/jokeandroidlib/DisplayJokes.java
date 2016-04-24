package com.sasi.jokeandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DisplayJokes extends AppCompatActivity {

    ListView lv_jokes;
    TextView tv_empty_view;
    String[] jokes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        lv_jokes = (ListView) findViewById(R.id.lv_jokes);
        tv_empty_view = (TextView) findViewById(R.id.tv_empty_view);
        lv_jokes.setEmptyView(tv_empty_view);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra("JOKES_ARRAY")) {
            jokes = intent.getStringArrayExtra("JOKES_ARRAY");
        }

        if (jokes != null && jokes.length > 0) {
            ArrayAdapter<String> jokesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, jokes);
            lv_jokes.setAdapter(jokesAdapter);

            lv_jokes.setVisibility(View.VISIBLE);
            tv_empty_view.setVisibility(View.GONE);
        } else {
            lv_jokes.setVisibility(View.GONE);
            tv_empty_view.setVisibility(View.VISIBLE);
        }

    }
}
