package suheil.aoc.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class secActivityy extends AppCompatActivity {
private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_activityy);
        tv=findViewById(R.id.tv);
        Intent intent=getIntent();
        String first=intent.getStringExtra("firstName");
        String last=intent.getStringExtra("lastName");

        if(first!=null&&last!=null) {
            tv.setText(first + " " + last);
            Toast.makeText(this,"done!!",Toast.LENGTH_LONG).show();



        }
    }
}