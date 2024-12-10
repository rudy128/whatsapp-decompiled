package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer;
import com.whatsapp.util.Log;

/* renamed from: X.5hb  reason: invalid class name and case insensitive filesystem */
public final class C110985hb extends C24495C6n {
    public final /* synthetic */ FloatingViewDraggableContainer A00;

    public C110985hb(FloatingViewDraggableContainer floatingViewDraggableContainer) {
        this.A00 = floatingViewDraggableContainer;
    }

    public int A00(View view) {
        return this.A00.getWidth();
    }

    public int A01(View view) {
        return this.A00.getHeight();
    }

    public int A02(View view, int i) {
        int i2;
        int A05;
        FloatingViewDraggableContainer floatingViewDraggableContainer = this.A00;
        Rect rect = floatingViewDraggableContainer.getFloatingViewManager().A03;
        if (rect != null) {
            i2 = rect.left;
        } else {
            i2 = 0;
        }
        int i3 = (-i2) + floatingViewDraggableContainer.getFloatingViewMargins().A01;
        int width = floatingViewDraggableContainer.getWidth();
        C1409473r floatingViewManager = floatingViewDraggableContainer.getFloatingViewManager();
        Rect rect2 = floatingViewManager.A03;
        if (rect2 != null) {
            A05 = rect2.right;
        } else {
            A05 = floatingViewManager.A05();
        }
        int i4 = (width - A05) - floatingViewDraggableContainer.getFloatingViewMargins().A02;
        if (i3 <= i4) {
            return C28851b7.A03(i, i3, i4);
        }
        Log.e("FloatingViewDraggableContainer/clampViewPositionHorizontal: leftBound > rightBound");
        return i;
    }

    public int A03(View view, int i) {
        int i2;
        int A002;
        FloatingViewDraggableContainer floatingViewDraggableContainer = this.A00;
        Rect rect = floatingViewDraggableContainer.getFloatingViewManager().A03;
        if (rect != null) {
            i2 = rect.top;
        } else {
            i2 = 0;
        }
        int i3 = (-i2) + floatingViewDraggableContainer.getFloatingViewMargins().A03;
        int height = floatingViewDraggableContainer.getHeight();
        C1409473r floatingViewManager = floatingViewDraggableContainer.getFloatingViewManager();
        Rect rect2 = floatingViewManager.A03;
        if (rect2 != null) {
            A002 = rect2.bottom;
        } else {
            A002 = C1409473r.A00(floatingViewManager);
        }
        int i4 = (height - A002) - floatingViewDraggableContainer.getFloatingViewMargins().A00;
        if (i3 <= i4) {
            return C28851b7.A03(i, i3, i4);
        }
        Log.e("FloatingViewDraggableContainer/clampViewPositionVertical: topBound > bottomBound");
        return i;
    }

    public void A04(View view, float f, float f2) {
        FloatingViewDraggableContainer floatingViewDraggableContainer = this.A00;
        Point A06 = floatingViewDraggableContainer.getFloatingViewManager().A06(f, f2, true, false);
        if (A06 != null) {
            C26281Cwc cwc = floatingViewDraggableContainer.A00;
            if (cwc != null) {
                cwc.A0G(A06.x, A06.y);
            }
            floatingViewDraggableContainer.invalidate();
        }
    }

    public void A05(View view, int i) {
        FloatingViewDraggableContainer floatingViewDraggableContainer = this.A00;
        floatingViewDraggableContainer.A07 = C18070vi.A18(view, floatingViewDraggableContainer.getFloatingViewManager().A08());
    }

    public void A06(View view, int i, int i2) {
        FloatingViewDraggableContainer floatingViewDraggableContainer = this.A00;
        floatingViewDraggableContainer.getFloatingViewManager().A00 = i;
        floatingViewDraggableContainer.getFloatingViewManager().A02 = i2;
    }

    public boolean A07(View view, int i) {
        FloatingViewDraggableContainer floatingViewDraggableContainer = this.A00;
        if (!view.equals(floatingViewDraggableContainer.getFloatingViewManager().A08()) || floatingViewDraggableContainer.getFloatingViewManager().A05 == C122686Ri.FOCUS) {
            return false;
        }
        return true;
    }
}
