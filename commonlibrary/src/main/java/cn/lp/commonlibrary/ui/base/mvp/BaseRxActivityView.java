package cn.lp.commonlibrary.ui.base.mvp;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;

/**
 * Created by lp on 2017/8/28.
 */

public interface BaseRxActivityView extends UiView, LifecycleProvider<ActivityEvent> {

}
