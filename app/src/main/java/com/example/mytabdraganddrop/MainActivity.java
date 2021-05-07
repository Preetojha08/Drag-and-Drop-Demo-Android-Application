package com.example.mytabdraganddrop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jmedeisis.draglinearlayout.DragLinearLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView dd_tv1, dd_tv2, dd_tv3, dd_tv4, dd_tv5, dd_tv6;
    TextView dd_tv1_h,dd_tv2_h,dd_tv3_h,dd_tv4_h,dd_tv5_h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // For Vertical Text View

        dd_tv1 = (TextView) findViewById(R.id.textView_one_drag_drop);
        dd_tv2 = (TextView) findViewById(R.id.textView_two_drag_drop);
        dd_tv3 = (TextView) findViewById(R.id.textView_three_drag_drop);
        dd_tv4 = (TextView) findViewById(R.id.textView_four_drag_drop);
        dd_tv5 = (TextView) findViewById(R.id.textView_five_drag_drop);
        dd_tv6 = (TextView) findViewById(R.id.textView_six_drag_drop);

        DragLinearLayout dragLinearLayout = (DragLinearLayout) findViewById(R.id.drag_drop_layout);
        // set all children draggable except the first (the header)
        for (int i = 0; i < dragLinearLayout.getChildCount(); i++) {
            View view = dragLinearLayout.getChildAt(i);
            dragLinearLayout.setViewDraggable(view, view); // the child is its own drag handle
        }

    }

}