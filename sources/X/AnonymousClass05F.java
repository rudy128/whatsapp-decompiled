package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.05F  reason: invalid class name */
public final class AnonymousClass05F extends ViewGroup {
    public final HashMap A00 = new HashMap();
    public final HashMap A01 = new HashMap();

    public void dispatchDraw(Canvas canvas) {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onDescendantInvalidated(View view, View view2) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (ViewGroup viewGroup : this.A01.keySet()) {
            viewGroup.layout(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
        }
    }

    public AnonymousClass05F(Context context) {
        super(context);
        setClipChildren(false);
    }

    public final HashMap getHolderToLayoutNode() {
        return this.A01;
    }

    public final HashMap getLayoutNodeToHolder() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw AnonymousClass000.A0k("widthMeasureSpec should be EXACTLY");
        } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            Iterator it = this.A01.keySet().iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("remeasure");
            }
        } else {
            throw AnonymousClass000.A0k("heightMeasureSpec should be EXACTLY");
        }
    }

    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AnonymousClass0XV r1 = (AnonymousClass0XV) this.A01.get(childAt);
            if (childAt.isLayoutRequested() && r1 != null) {
                AnonymousClass000.A1D(r1);
            }
        }
    }
}
