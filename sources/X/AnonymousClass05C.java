package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.05C  reason: invalid class name */
public class AnonymousClass05C extends ViewGroup {
    public boolean A00;

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public int getChildCount() {
        if (this.A00) {
            return super.getChildCount();
        }
        return 0;
    }

    public final void A00(View view, C16960tV r3, long j) {
        super.drawChild(AnonymousClass0M0.A00(r3), view, j);
    }

    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            C18070vi.A0z(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((AnonymousClass05A) childAt).A00) {
                this.A00 = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.A00 = false;
                }
            } else {
                i++;
            }
        }
    }
}
