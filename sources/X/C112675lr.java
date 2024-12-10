package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5lr  reason: invalid class name and case insensitive filesystem */
public class C112675lr extends C40611uz {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final C112355lL A03;

    private boolean A00(View view) {
        int i;
        int i2;
        int A07;
        if (view != null) {
            int A002 = RecyclerView.A00(view);
            C112355lL r1 = this.A03;
            if (A002 != -1) {
                C147387Sy r2 = r1.A0S;
                if (A002 < 0 || A002 >= r2.size()) {
                    i = -1;
                } else {
                    i = C108955ca.A07(r2, A002);
                }
                if (Integer.valueOf(i) != null && (i2 = A002 + 1) > 0 && i2 < r2.size()) {
                    if (i2 >= r2.size()) {
                        A07 = -1;
                    } else {
                        A07 = C108955ca.A07(r2, i2);
                    }
                    if (Integer.valueOf(A07) == null) {
                        return false;
                    }
                    if (A07 == 22 || A07 == 23 || A07 == 100) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public C112675lr(C112355lL r3, int i, int i2) {
        this.A03 = r3;
        this.A01 = i2;
        this.A00 = i;
        Paint A06 = AnonymousClass3MW.A06();
        this.A02 = A06;
        A06.setAntiAlias(true);
    }

    public void A04(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (A00(childAt)) {
                int bottom = childAt.getBottom() + AnonymousClass3MW.A0B(childAt).bottomMargin;
                int left = recyclerView.getLeft();
                int width = recyclerView.getWidth();
                Paint paint = this.A02;
                paint.setColor(this.A00);
                canvas.drawRect((float) left, (float) bottom, (float) width, (float) (this.A01 + bottom), paint);
            }
        }
    }

    public void A05(Rect rect, View view, C38021qZ r4, RecyclerView recyclerView) {
        if (A00(view)) {
            rect.bottom = this.A01;
        }
    }
}
