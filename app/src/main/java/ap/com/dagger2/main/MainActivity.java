package ap.com.dagger2.main;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import ap.com.dagger2.App.BaseActivity;
import ap.com.dagger2.R;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter mainPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
        init();
        mainPresenter.loadData();
        mainPresenter.save();
    }

    TextView msg;

    private void init() {
        msg = (TextView) findViewById(R.id.msg);
    }

    @Override
    public void updateUI() {
        msg.setText("依赖添加成功");
    }

    @Override
    public void save() {

    }

    @Override
    public void saveAndAdd() {

    }

    @Override
    public void delete() {

    }
}
