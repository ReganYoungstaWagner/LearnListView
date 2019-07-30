package com.regan.learnlistview.stuff;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.regan.learnlistview.R;

public class CustomListAdap extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] textArray;

    //to store the list of countries
    private final String[] infoArray;


    public CustomListAdap(Activity context, String[] textArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam) {
        super(context, R.layout.listview_row, textArrayParam);

        this.context = context;
        this.imageIDarray = imageIDArrayParam;
        this.textArray = textArrayParam;
        this.infoArray = infoArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row, null, true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.textview1);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infotextview2);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageview1);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(textArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);

        return rowView;
    }

}
