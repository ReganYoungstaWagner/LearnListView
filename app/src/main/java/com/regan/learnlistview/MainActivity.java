package com.regan.learnlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import com.regan.learnlistview.stuff.CustomListAdap;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] textArray = {"Hippo","Duck","Duck","Dog","Cow","Cow","Listen"};

    String[] infoArray = {
            "Cool Fatty Hippo",
            "Duck tastes great",
            "Ducks do waddle",
            "Dogs bark so loud",
            "Steers get yours",
            "Yuck Cow horns aren't edible",
            "Listen and Hear"
    };

    Integer[] imageIDarray = {R.drawable.hippo,
            R.drawable.duck_brown,
            R.drawable.duck_green,
            R.drawable.dog,
            R.drawable.cow_black,
            R.drawable.cow_brown,
            R.drawable.ic_hearing_black_24dp
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    CustomListAdap stuff = new CustomListAdap(this, textArray, infoArray, imageIDarray);

    listView =(ListView) findViewById(R.id.list_view);
    listView.setAdapter(stuff);
    }
}
