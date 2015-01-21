package info.lofei.smoothseekbardemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements SeekBar.OnSeekBarChangeListener {

    private SmoothSeekBar mSeekBar;

    private TextView mProgressInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        setListeners();
    }

    private void findViews() {
        mSeekBar = (SmoothSeekBar) findViewById(R.id.seekbar);
        mProgressInfoTextView = (TextView) findViewById(R.id.progress_info);
    }

    private void setListeners() {
        mSeekBar.setOnSeekBarChangeListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setProgress(View v) {
        if(v instanceof Button) {
            String text = ((Button)v).getText().toString();
            int progress = Integer.parseInt(text);
            // call it as usual as a normal SeekBar.
            mSeekBar.setProgress(progress);
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        mProgressInfoTextView.setText(String.valueOf(progress));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
