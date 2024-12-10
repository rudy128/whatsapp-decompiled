package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class BM3 extends C40611uz {
    public static final int[] A03;
    public int A00;
    public Drawable A01;
    public final Rect A02 = AnonymousClass3MW.A07();

    public void A05(Rect rect, View view, C38021qZ r7, RecyclerView recyclerView) {
        Drawable drawable = this.A01;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.A00 == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    static {
        int[] A1X = BE6.A1X();
        A1X[0] = 16843284;
        A03 = A1X;
    }

    public BM3(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A03);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.A01 = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.A00 = 1;
    }

    public void A04(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.getLayoutManager() != null && this.A01 != null) {
            int i3 = this.A00;
            canvas.save();
            boolean z = recyclerView.A0N;
            int i4 = 0;
            if (i3 == 1) {
                if (z) {
                    i2 = recyclerView.getPaddingLeft();
                    width = C72463Mc.A09(recyclerView);
                    canvas.clipRect(i2, recyclerView.getPaddingTop(), width, C108985cd.A05(recyclerView));
                } else {
                    width = recyclerView.getWidth();
                    i2 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i4 < childCount) {
                    View childAt = recyclerView.getChildAt(i4);
                    Rect rect = this.A02;
                    RecyclerView.A09(childAt, rect);
                    int round = rect.bottom + Math.round(childAt.getTranslationY());
                    this.A01.setBounds(i2, round - this.A01.getIntrinsicHeight(), width, round);
                    this.A01.draw(canvas);
                    i4++;
                }
            } else {
                if (z) {
                    i = recyclerView.getPaddingTop();
                    height = C108985cd.A05(recyclerView);
                    canvas.clipRect(recyclerView.getPaddingLeft(), i, C72463Mc.A09(recyclerView), height);
                } else {
                    height = recyclerView.getHeight();
                    i = 0;
                }
                int childCount2 = recyclerView.getChildCount();
                while (i4 < childCount2) {
                    View childAt2 = recyclerView.getChildAt(i4);
                    Rect rect2 = this.A02;
                    RecyclerView.A09(childAt2, rect2);
                    int round2 = rect2.right + Math.round(childAt2.getTranslationX());
                    this.A01.setBounds(round2 - this.A01.getIntrinsicWidth(), i, round2, height);
                    this.A01.draw(canvas);
                    i4++;
                }
            }
            canvas.restore();
        }
    }
}
