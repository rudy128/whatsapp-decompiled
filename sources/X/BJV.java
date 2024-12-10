package X;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;

public abstract class BJV extends C41501wV {
    public int A00 = 0;
    public C25070CWd A01;

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        int i2;
        int i3 = i;
        if (this instanceof BiQ) {
            BiQ biQ = (BiQ) this;
            List A0C = coordinatorLayout.A0C(view);
            int size = A0C.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                View view2 = (View) A0C.get(i4);
                if (!(view2 instanceof AppBarLayout)) {
                    i4++;
                } else if (view2 != null) {
                    C37891qK r3 = (C37891qK) view.getLayoutParams();
                    Rect rect = biQ.A02;
                    rect.set(coordinatorLayout.getPaddingLeft() + r3.leftMargin, view2.getBottom() + r3.topMargin, C72463Mc.A09(coordinatorLayout) - r3.rightMargin, ((coordinatorLayout.getHeight() + view2.getBottom()) - coordinatorLayout.getPaddingBottom()) - r3.bottomMargin);
                    AnonymousClass1HO r2 = coordinatorLayout.A02;
                    if (r2 != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                        rect.left += r2.A03();
                        rect.right -= r2.A04();
                    }
                    Rect rect2 = biQ.A03;
                    int i5 = r3.A02;
                    if (i5 == 0) {
                        i5 = 8388659;
                    }
                    Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i3);
                    int A0Q = biQ.A0Q(view2);
                    view.layout(rect2.left, rect2.top - A0Q, rect2.right, rect2.bottom - A0Q);
                    i2 = rect2.top - view2.getBottom();
                }
            }
            coordinatorLayout.A0F(view, i);
            i2 = 0;
            biQ.A01 = i2;
        } else {
            coordinatorLayout.A0F(view, i);
        }
        C25070CWd cWd = this.A01;
        if (cWd == null) {
            cWd = new C25070CWd(view);
            this.A01 = cWd;
        }
        View view3 = cWd.A03;
        cWd.A01 = view3.getTop();
        cWd.A00 = view3.getLeft();
        this.A01.A00();
        int i6 = this.A00;
        if (i6 == 0) {
            return true;
        }
        C25070CWd cWd2 = this.A01;
        if (cWd2.A02 != i6) {
            cWd2.A02 = i6;
            cWd2.A00();
        }
        this.A00 = 0;
        return true;
    }
}
