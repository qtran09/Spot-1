package idc.searchparty2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HelpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_screen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
