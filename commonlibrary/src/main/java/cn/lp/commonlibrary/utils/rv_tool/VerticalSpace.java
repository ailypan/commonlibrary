package cn.lp.commonlibrary.utils.rv_tool;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * 垂直方向的空白
 * Created by lp on 2017/7/11.
 */
public class VerticalSpace extends RecyclerView.ItemDecoration {

    private int space;

    public VerticalSpace(int space) {
        this.space = space;
    }

    public VerticalSpace(Resources resources, int dimenResId) {
        this.space = resources.getDimensionPixelSize(dimenResId);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
        RecyclerView.State state) {

        if (parent.getChildAdapterPosition(view) != 0) {
            outRect.top = space;
        }
    }
}
