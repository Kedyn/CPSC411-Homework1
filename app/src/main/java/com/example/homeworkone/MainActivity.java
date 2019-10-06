package com.example.homeworkone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        int total_rows = 11;

        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams root_params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        root.setLayoutParams(root_params);
        root.setOrientation(GridLayout.VERTICAL);
        root.setBackgroundColor(Color.BLACK);
        root.setColumnCount(5);
        root.setRowCount(total_rows);

        TextView text_view;
        GridLayout.Spec row_spec;
        GridLayout.Spec col_spec;
        GridLayout.LayoutParams column_params;

        for (int row = 0; row < total_rows; row++) {
            text_view = new TextView(this);
            text_view.setText(Integer.toString(row + 1));
            text_view.setTextSize(16);
            text_view.setBackgroundColor(Color.LTGRAY);
            text_view.setTextColor(Color.BLACK);
            text_view.setGravity(Gravity.CENTER);

            row_spec = GridLayout.spec(row,1,1f);
            col_spec = GridLayout.spec(0, 1f);
            column_params = new GridLayout.LayoutParams(row_spec, col_spec);
            column_params.setMargins(1,1,1,1);

            text_view.setLayoutParams(column_params);

            root.addView(text_view);
        }

        text_view = new TextView(this);
        text_view.setText("Rules void hello1(int hour)");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.BLACK);
        text_view.setTextColor(Color.WHITE);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(0,1,1f);
        col_spec = GridLayout.spec(1,4,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("properties");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.WHITE);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(1,2,1f);
        col_spec = GridLayout.spec(1,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("name");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.WHITE);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(1,1,1f);
        col_spec = GridLayout.spec(2,2,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("Day Hour Classification");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.WHITE);
        text_view.setTextColor(Color.BLACK);
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(1,1,1f);
        col_spec = GridLayout.spec(4,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("category");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.WHITE);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(2,1,1f);
        col_spec = GridLayout.spec(2,2,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("Day and Time");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.WHITE);
        text_view.setTextColor(Color.BLACK);
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(2,1,1f);
        col_spec = GridLayout.spec(4,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("Rule");
        text_view.setTextSize(16);
        text_view.setTypeface(null, Typeface.BOLD);
        text_view.setBackgroundColor(Color.CYAN);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(3,1,1f);
        col_spec = GridLayout.spec(1,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("C1");
        text_view.setTextSize(16);
        text_view.setTypeface(null, Typeface.BOLD);
        text_view.setBackgroundColor(Color.CYAN);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(3,1,1f);
        col_spec = GridLayout.spec(2,2,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("A1");
        text_view.setTextSize(16);
        text_view.setTypeface(null, Typeface.BOLD);
        text_view.setBackgroundColor(Color.CYAN);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(3,1,1f);
        col_spec = GridLayout.spec(4,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.CYAN);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(4,1,1f);
        col_spec = GridLayout.spec(1,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("min <= hour && hour <= max");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.CYAN);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(4,1,1f);
        col_spec = GridLayout.spec(2,2,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("System.out.println(greeting + \", World!\"");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.CYAN);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(4,1,1f);
        col_spec = GridLayout.spec(4,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.CYAN);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(5,1,1f);
        col_spec = GridLayout.spec(1,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("int min");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.CYAN);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(5,1,1f);
        col_spec = GridLayout.spec(2,1,2f); // For some reason having weight 1f makes the rest of this column smaller
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("int max");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.CYAN);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(5,1,1f);
        col_spec = GridLayout.spec(3,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("String greeting");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.CYAN);
        text_view.setTextColor(Color.BLACK);
        text_view.setGravity(Gravity.CENTER);

        row_spec = GridLayout.spec(5,1,1f);
        col_spec = GridLayout.spec(4,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("Rule");
        text_view.setTextSize(16);
        text_view.setTypeface(null, Typeface.BOLD);
        text_view.setBackgroundColor(Color.WHITE);
        text_view.setTextColor(Color.BLACK);
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(6,1,1f);
        col_spec = GridLayout.spec(1,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("From");
        text_view.setTextSize(16);
        text_view.setTypeface(null,Typeface.BOLD);
        text_view.setBackgroundColor(Color.YELLOW);
        text_view.setTextColor(Color.BLACK);
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(6,1,1f);
        col_spec = GridLayout.spec(2,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("To");
        text_view.setTextSize(16);
        text_view.setTypeface(null,Typeface.BOLD);
        text_view.setBackgroundColor(Color.YELLOW);
        text_view.setTextColor(Color.BLACK);
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(6,1,1f);
        col_spec = GridLayout.spec(3,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("Greeting");
        text_view.setTextSize(16);
        text_view.setTypeface(null,Typeface.BOLD);
        text_view.setBackgroundColor(Color.rgb(255,165,0));
        text_view.setTextColor(Color.BLACK);
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(6,1,1f);
        col_spec = GridLayout.spec(4,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("R10");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.WHITE);
        text_view.setTextColor(Color.BLACK);
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(7,1,1f);
        col_spec = GridLayout.spec(1,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("0");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.YELLOW);
        text_view.setGravity(Gravity.END);
        text_view.setPadding(0,0,10,0);

        row_spec = GridLayout.spec(7,1,1f);
        col_spec = GridLayout.spec(2,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("11");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.YELLOW);
        text_view.setGravity(Gravity.END);
        text_view.setPadding(0,0,10,0);

        row_spec = GridLayout.spec(7,1,1f);
        col_spec = GridLayout.spec(3,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("Good Morning");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.rgb(255,165,0));
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(7,1,1f);
        col_spec = GridLayout.spec(4,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("R20");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.WHITE);
        text_view.setTextColor(Color.BLACK);
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(8,1,1f);
        col_spec = GridLayout.spec(1,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("12");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.YELLOW);
        text_view.setGravity(Gravity.END);
        text_view.setPadding(0,0,10,0);

        row_spec = GridLayout.spec(8,1,1f);
        col_spec = GridLayout.spec(2,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("17");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.YELLOW);
        text_view.setGravity(Gravity.END);
        text_view.setPadding(0,0,10,0);

        row_spec = GridLayout.spec(8,1,1f);
        col_spec = GridLayout.spec(3,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("Good Afternoon");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.rgb(255,165,0));
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(8,1,1f);
        col_spec = GridLayout.spec(4,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("R30");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.WHITE);
        text_view.setTextColor(Color.BLACK);
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(9,1,1f);
        col_spec = GridLayout.spec(1,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("18");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.YELLOW);
        text_view.setGravity(Gravity.END);
        text_view.setPadding(0,0,10,0);

        row_spec = GridLayout.spec(9,1,1f);
        col_spec = GridLayout.spec(2,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("21");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.YELLOW);
        text_view.setGravity(Gravity.END);
        text_view.setPadding(0,0,10,0);

        row_spec = GridLayout.spec(9,1,1f);
        col_spec = GridLayout.spec(3,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("Good Evening");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.rgb(255,165,0));
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(9,1,1f);
        col_spec = GridLayout.spec(4,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("R40");
        text_view.setTextSize(16);
        text_view.setBackgroundColor(Color.WHITE);
        text_view.setTextColor(Color.BLACK);
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(10,1,1f);
        col_spec = GridLayout.spec(1,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("22");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.YELLOW);
        text_view.setGravity(Gravity.END);
        text_view.setPadding(0,0,10,0);

        row_spec = GridLayout.spec(10,1,1f);
        col_spec = GridLayout.spec(2,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("23");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.YELLOW);
        text_view.setGravity(Gravity.END);
        text_view.setPadding(0,0,10,0);

        row_spec = GridLayout.spec(10,1,1f);
        col_spec = GridLayout.spec(3,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        text_view = new TextView(this);
        text_view.setText("Good Night");
        text_view.setTextSize(16);
        text_view.setTextColor(Color.BLACK);
        text_view.setBackgroundColor(Color.rgb(255,165,0));
        text_view.setPadding(10,0,0,0);

        row_spec = GridLayout.spec(10,1,1f);
        col_spec = GridLayout.spec(4,1,1f);
        column_params = new GridLayout.LayoutParams(row_spec, col_spec);
        column_params.setMargins(2,2,2,2);

        text_view.setLayoutParams(column_params);

        root.addView(text_view);

        setContentView(root);
        // Comment previous line and uncomment the following to see the same effect with xml
        //setContentView(R.layout.table);
    }
}
