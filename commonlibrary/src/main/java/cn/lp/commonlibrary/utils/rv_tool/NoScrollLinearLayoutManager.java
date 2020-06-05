package cn.lp.commonlibrary.utils.rv_tool;

import android.content.Context;
import android.util.AttributeSet;

import androidx.recyclerview.widget.LinearLayoutManager;

/**
 * Created by lp on 2017/10/25.
 */

public class NoScrollLinearLayoutManager extends LinearLayoutManager {

    private boolean mNoScroll = false;

    public NoScrollLinearLayoutManager(Context context) {
        super(context);
    }

    public NoScrollLinearLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public NoScrollLinearLayoutManager(Context context, AttributeSet attrs, int defStyleAttr,
                                       int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public boolean isNoScroll() {
        return mNoScroll;
    }

    public void setNoScroll(boolean noScroll) {
        mNoScroll = noScroll;
    }

    public boolean canScrollVertically() {
        return (!mNoScroll) && super.canScrollVertically();
    }
}
