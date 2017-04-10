package com.ex.study_fragment_2017_04_06_0001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.id_button_1:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.id_frame_layout_1, new ColorOneFragment()).commit();
                break;
            case R.id.id_button_2:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.id_frame_layout_2, new ColorTwoFragment()).commit();
                break;
            case R.id.id_button_3:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.id_frame_layout_3, new ColorThreeFragment()).commit();
                break;
        }
    }
}
