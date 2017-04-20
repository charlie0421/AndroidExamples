package io.android_tech.myexample.Thread;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Thread_Thread_12_Activity extends Activity implements View.OnClickListener {
    EditText edtNumber;
    Button btn1;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(io.android_tech.myexample.R.layout.activity_thread_thread_12);

        edtNumber = (EditText) findViewById(io.android_tech.myexample.R.id.edtNumber);
        btn1 = (Button) findViewById(io.android_tech.myexample.R.id.btn1);
        tvResult = (TextView) findViewById(io.android_tech.myexample.R.id.tvResult);

        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case io.android_tech.myexample.R.id.btn1:
                new FactorialTask().execute(Integer.parseInt(edtNumber.getText().toString()));
                break;
            default:
                break;
        }
    }

    class FactorialTask extends AsyncTask<Integer, Integer, Integer> {

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }

        @Override
        protected void onPostExecute(Integer result) {
            super.onPostExecute(result);

            tvResult.setText(result);
        }

        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected Integer doInBackground(Integer... params) {
            int result = 1;
            int num = params[0];

            for (int i = 1; i <= num; i++) {
                result = result * i;
            }

            return result;
        }
    }

}
