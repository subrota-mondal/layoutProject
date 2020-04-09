package com.example.viewstubandprogressbar;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ViewStubTestActivity extends AppCompatActivity implements View.OnClickListener {
    private View stub;
    private LazyLoading lazyLoading;
    private ProgressBar progressBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_stub_test);

        //stub = ((ViewStub) findViewById(R.id.vsHeader)).inflate();

        Button clickMe = (Button) findViewById(R.id.buttonClickMe);
        clickMe.setOnClickListener(this);
        Button cancel = (Button) findViewById(R.id.buttonCancel);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonClickMe) {
            lazyLoading = new LazyLoading();
            lazyLoading.execute();
        }
        else if (v.getId() == R.id.buttonCancel) {
            if( lazyLoading != null) {
            //if( !lazyLoading.isCancelled() ) {
                lazyLoading.cancel(true);
                lazyLoading = null;
                progressBar.setProgress(0);
                stub.setVisibility(View.GONE);
            }
        }
    }

    public class LazyLoading extends AsyncTask <Object, Integer, Boolean>{
        private int completed;

        @Override
        protected Boolean doInBackground(Object... params) {
            int l;
            // Do a large amount of computation
            for (int i = 0; i < 10; ++i) {
                for (int j = 0; j < 10000; ++j) {
                    for (int k = 0; k < 10000; ++k) {
                        l = i * j * k;
                }
                }

                if (lazyLoading.isCancelled())
                        return null;

                completed += 1;
                publishProgress();
            }

            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            if (stub == null) {
                completed = 0;
                stub = ((ViewStub) findViewById(R.id.vsHeader)).inflate();
                textView = ((TextView) stub.findViewById(R.id.textView));
                progressBar = ((ProgressBar) stub.findViewById(R.id.progressBar1));

                textView.setText("Importing");
                progressBar.setMax(10);
                progressBar.setProgress(completed);
                stub.setVisibility(View.VISIBLE);
            } else {
                stub.setVisibility(View.VISIBLE);
            }
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {

            //Toast.makeText(getBaseContext(), "Import completed", Toast.LENGTH_LONG).show();
            textView.setText("Imported");

           /*if( lazyLoading != null) {
                //if( !lazyLoading.isCancelled() ) {
                lazyLoading.cancel(true);
                lazyLoading = null;
                //progressBar.setProgress(0);
                //stub.setVisibility(View.GONE);
            }
*/
            //Toast.makeText(getBaseContext(), "Import completed", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            progressBar.setProgress(completed);
        }
    }
}
