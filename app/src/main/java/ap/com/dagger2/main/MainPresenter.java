package ap.com.dagger2.main;

import javax.inject.Inject;

import ap.com.dagger2.main.MainView;

/**
 * 类描述：
 * 创建人：swallow.li
 * 创建时间：
 * Email: swallow.li@kemai.cn
 * 修改备注：
 */
public class MainPresenter {
    //MainContract是个接口，View是他的内部接口，这里看做View接口即可
    private MainView mView;

    @Inject
    public MainPresenter(MainView view) {
        mView = view;
    }

    public void loadData() {
        //调用model层方法，加载数据
        //回调方法成功时
        mView.updateUI();
    }

    public void save() {
        mView.save();
    }
}
