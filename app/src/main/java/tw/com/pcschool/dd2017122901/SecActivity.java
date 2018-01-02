package tw.com.pcschool.dd2017122901;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        TextView tv = findViewById(R.id.textView);
        Intent it = getIntent();
        String data = it.getStringExtra(Intent.EXTRA_TEXT);
        tv.setText(data);


    }
}
