package cn.lp.commonlibrary.ui.base.mvp;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.FragmentEvent;

/**
 * Created by lp on 2017/8/28.
 */

public interface BaseRxFragmentView extends UiView, LifecycleProvider<FragmentEvent> {

}
