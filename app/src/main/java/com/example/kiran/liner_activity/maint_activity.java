package com.example.kiran.liner_activity;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Kiran on 29-10-2015.
 */
public class maint_activity extends Activity{
    /*
    What is the Bundle?
    android.os.Bundle is a class that is used to store and passing data between Activity or across application state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout_example);

    }
}
