package com.example.myexample.Thread;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myexample.R;

public class Thread_Thread_03_Activity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_thread_03);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                int i = 0;
                while (true) {
                    Log.v("THREAD", "count=" + i++);
                }
            case R.id.btn2:
                Toast.makeText(this, "작업2", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
