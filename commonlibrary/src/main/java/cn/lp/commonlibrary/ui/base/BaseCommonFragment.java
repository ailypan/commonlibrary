package cn.lp.commonlibrary.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trello.rxlifecycle2.components.support.RxFragment;

import androidx.annotation.Nullable;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.lp.commonlibrary.ui.base.mvp.UiView;

/**
 * 基础Fragment，建议继承此类再写一个BaseFragment
 */
public abstract class BaseCommonFragment extends RxFragment implements UiView {

    protected Activity mActivity;
    private Unbinder mUnBinder;

    @Override
    public void onAttach(Context context) {
        mActivity = (Activity) context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = null;
        if (getLayoutId() != 0) {
            view = inflater.inflate(getLayoutId(), container, false);
            mUnBinder = ButterKnife.bind(this, view);
        }
        return view;
    }

    /**
     * 设置视图资源id
     *
     * @return
     */
    protected abstract int getLayoutId();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mUnBinder != null) {
            mUnBinder.unbind();
        }
    }

    @Override
    public void startActivity(Class<? extends Activity> cls) {
        startActivity(new Intent(getActivity(), cls));
    }

    @Override
    public void startActivityForResult(Class<? extends Activity> cls, int requestCode) {
        startActivityForResult(new Intent(getActivity(), cls), requestCode);
    }

    @Override
    public void finishActivity() {
        try {
            getActivityView().finishActivity();
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Override
    public void showToast(int resId) {
        try {
            getActivityView().showToast(resId);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Override
    public void showToast(String text) {
        try {
            getActivityView().showToast(text);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Override
    public void showOneToast(int resId) {
        try {
            getActivityView().showOneToast(resId);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Override
    public void showOneToast(String text) {
        try {
            getActivityView().showOneToast(text);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Override
    public void showWaitingDialog(String text, boolean cancelable) {
        try {
            getActivityView().showWaitingDialog(text, cancelable);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Override
    public void showWaitingDialog(int stringRes, boolean cancelable) {
        try {
            getActivityView().showWaitingDialog(stringRes, cancelable);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Override
    public void dismissWaitingDialog() {
        try {
            getActivityView().dismissWaitingDialog();
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Override
    public boolean isActivityStarted() {
        try {
            return getActivityView().isActivityStarted();
        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean isActivityResumed() {
        try {
            return getActivityView().isActivityResumed();
        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
    }

    private UiView getActivityView() {
        return (UiView) mActivity;
    }
}
