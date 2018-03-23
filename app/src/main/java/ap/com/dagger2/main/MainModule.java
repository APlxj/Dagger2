package ap.com.dagger2.main;

import dagger.Module;
import dagger.Provides;

/**
 * 类描述：
 * 创建人：swallow.li
 * 创建时间：
 * Email: swallow.li@kemai.cn
 * 修改备注：
 */
@Module
public class MainModule {

    MainView view;

    public MainModule(MainView view) {
        this.view = view;
    }

    @Provides
    MainView provideMainView() {
        return view;
    }
}
