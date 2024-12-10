package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5lo  reason: invalid class name and case insensitive filesystem */
public class C112645lo extends C40611uz {
    public final int A00;
    public final Object A01;

    public C112645lo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A04(Canvas canvas, RecyclerView recyclerView) {
        if (this.A00 != 0) {
            super.A04(canvas, recyclerView);
            return;
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        C143087By r6 = (C143087By) this.A01;
        int i = paddingLeft + ((int) r6.A00);
        int width = (recyclerView.getWidth() - ((int) r6.A01)) - recyclerView.getPaddingRight();
        for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
            View childAt = recyclerView.getChildAt(i2);
            C38491rN r1 = (C38491rN) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + r1.bottomMargin;
            int intrinsicHeight = r6.A06.getIntrinsicHeight() + bottom;
            if (r1.A00() == 0 && r6.A0P == null) {
                r6.A06.setBounds(0, bottom, recyclerView.getWidth(), intrinsicHeight);
            } else {
                r6.A06.setBounds(i, bottom, width, intrinsicHeight);
            }
            r6.A06.draw(canvas);
        }
    }

    public void A05(Rect rect, View view, C38021qZ r9, RecyclerView recyclerView) {
        if (1 - this.A00 != 0) {
            super.A05(rect, view, r9, recyclerView);
            return;
        }
        C18070vi.A0n(rect, view, recyclerView);
        C130726ju r5 = (C130726ju) this.A01;
        if (r5.A00 != 0) {
            int A002 = RecyclerView.A00(view);
            int i = r5.A00;
            int i2 = A002 % i;
            int i3 = (r5.A03 - (r5.A04 * i)) / (i + 1);
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (A002 < i) {
                rect.top = r5.A01;
            }
            rect.bottom = r5.A01;
        }
    }
}
