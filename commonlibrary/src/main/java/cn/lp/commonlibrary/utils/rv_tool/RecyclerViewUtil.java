package cn.lp.commonlibrary.utils.rv_tool;

import android.graphics.drawable.Drawable;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.lp.commonlibrary.R;

/**
 * Created by lp on 2017/7/19.
 */

public class RecyclerViewUtil {

    /**
     * 添加默认1dp高的水平分割线
     *
     * @param recyclerView
     * @param linearLayoutManager
     */
    public static void setDefaultDivider(RecyclerView recyclerView,
        LinearLayoutManager linearLayoutManager) {
        setDivider(recyclerView, linearLayoutManager, R.drawable.shape_defalut_divider);
    }

    public static void setDivider(RecyclerView recyclerView,
        LinearLayoutManager linearLayoutManager, Drawable dividerDrawable) {
        DividerItemDecoration decoration = new DividerItemDecoration(recyclerView.getContext(),
            linearLayoutManager.getOrientation());
        decoration.setDrawable(dividerDrawable);
        recyclerView.addItemDecoration(decoration);
    }

    public static void setDivider(RecyclerView recyclerView,
        LinearLayoutManager linearLayoutManager, int drawableResId) {
        Drawable drawable = recyclerView.getResources().getDrawable(drawableResId);
        setDivider(recyclerView, linearLayoutManager, drawable);
    }

    public static void setNestedScrolling(RecyclerView recyclerView) {
        ViewCompat.setNestedScrollingEnabled(recyclerView, false);
    }
}
