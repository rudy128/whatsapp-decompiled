package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class BM4 extends C40611uz {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public boolean A06;
    public final Rect A07 = AnonymousClass3MW.A07();

    public BM4(Context context) {
        TypedArray A002 = C27791Xo.A00(context, (AttributeSet) null, C27781Xn.A0R, new int[0], 2130970445, 2132084789);
        this.A00 = AnonymousClass1YT.A01(context, A002, 0).getDefaultColor();
        this.A04 = A002.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(2131167653));
        this.A02 = A002.getDimensionPixelOffset(2, 0);
        this.A01 = A002.getDimensionPixelOffset(1, 0);
        this.A06 = A002.getBoolean(4, true);
        A002.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.A05 = shapeDrawable;
        int i = this.A00;
        this.A00 = i;
        Drawable A022 = C27831Xu.A02(shapeDrawable);
        this.A05 = A022;
        C27831Xu.A0C(A022, i);
        this.A03 = 1;
    }

    public void A05(Rect rect, View view, C38021qZ r6, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
        if (A00(view, recyclerView)) {
            int i = this.A03;
            int i2 = this.A04;
            if (i == 1) {
                rect.bottom = i2;
            } else {
                rect.right = i2;
            }
        }
    }

    private boolean A00(View view, RecyclerView recyclerView) {
        int A002 = RecyclerView.A00(view);
        C38391rD r0 = recyclerView.A0B;
        boolean z = true;
        if (r0 == null || A002 != r0.A0Q() - 1) {
            z = false;
        }
        if (A002 == -1) {
            return false;
        }
        if (!z || this.A06) {
            return true;
        }
        return false;
    }

    public void A04(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i;
        int width;
        int i2;
        int i3;
        int i4;
        if (recyclerView.getLayoutManager() != null) {
            int i5 = this.A03;
            canvas.save();
            boolean z = recyclerView.A0N;
            int i6 = 0;
            if (i5 == 1) {
                if (z) {
                    i2 = recyclerView.getPaddingLeft();
                    width = C72463Mc.A09(recyclerView);
                    canvas.clipRect(i2, recyclerView.getPaddingTop(), width, C108985cd.A05(recyclerView));
                } else {
                    width = recyclerView.getWidth();
                    i2 = 0;
                }
                boolean z2 = true;
                if (recyclerView.getLayoutDirection() == 1) {
                    i3 = this.A01;
                } else {
                    z2 = false;
                    i3 = this.A02;
                }
                int i7 = i2 + i3;
                if (z2) {
                    i4 = this.A02;
                } else {
                    i4 = this.A01;
                }
                int i8 = width - i4;
                int childCount = recyclerView.getChildCount();
                while (i6 < childCount) {
                    View childAt = recyclerView.getChildAt(i6);
                    if (A00(childAt, recyclerView)) {
                        Rect rect = this.A07;
                        RecyclerView.A09(childAt, rect);
                        int round = rect.bottom + Math.round(childAt.getTranslationY());
                        this.A05.setBounds(i7, round - this.A04, i8, round);
                        this.A05.draw(canvas);
                    }
                    i6++;
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
                int i9 = i + this.A02;
                int i10 = height - this.A01;
                int childCount2 = recyclerView.getChildCount();
                while (i6 < childCount2) {
                    View childAt2 = recyclerView.getChildAt(i6);
                    if (A00(childAt2, recyclerView)) {
                        Rect rect2 = this.A07;
                        RecyclerView.A09(childAt2, rect2);
                        int round2 = rect2.right + Math.round(childAt2.getTranslationX());
                        this.A05.setBounds(round2 - this.A04, i9, round2, i10);
                        this.A05.draw(canvas);
                    }
                    i6++;
                }
            }
            canvas.restore();
        }
    }
}
