package ap.com.dagger2.main;

import android.os.Bundle;

import ap.com.dagger2.App.BaseActivity;
import ap.com.dagger2.R;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
