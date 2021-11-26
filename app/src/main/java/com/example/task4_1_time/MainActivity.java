package com.example.task4_1_time;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlertDialog dialog;
    String date = "";
    String time = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert");
        builder.setMessage("Click OK to continue, or Cancel to stop.");
        builder.setPositiveButton("Ok", null);
        builder.setNegativeButton("Cancel", null);
        dialog = builder.create();

    }

    public void onAlert(View v) {
        dialog.show();
    }

    public void onTime(View v) {
        DialogFragment timeAlert = new Time();
        timeAlert.show(getSupportFragmentManager(), "TIME");
    }

    public void onDate(View v) {
        DialogFragment dateAlert = new Date();
        dateAlert.show(getSupportFragmentManager(), "DATE");
    }

    public void showDateTime(String dateText, String timeText) {
        if (dateText != null) {
            date = dateText;
        }

        if (timeText != null) {
            time = timeText;
        }

        Toast.makeText(this, date + " " + time, Toast.LENGTH_SHORT).show();
    }
}