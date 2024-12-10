package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5lb  reason: invalid class name and case insensitive filesystem */
public final class C112515lb extends C40611uz {
    public final C18000vb A00;

    public void A05(Rect rect, View view, C38021qZ r10, RecyclerView recyclerView) {
        Integer num;
        C18070vi.A0d(rect, 0);
        boolean z = true;
        C18070vi.A0e(view, 1, recyclerView);
        int A002 = RecyclerView.A00(view);
        C38391rD r0 = recyclerView.A0B;
        if (r0 != null) {
            num = Integer.valueOf(r0.A0Q());
        } else {
            num = null;
        }
        C38251qy layoutManager = recyclerView.getLayoutManager();
        if (A002 != -1 && num != null && layoutManager != null) {
            boolean A1P = AnonymousClass000.A1P(A002);
            if (A002 != num.intValue() - 1) {
                z = false;
            }
            if (A1P || z) {
                if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new C38491rN(-2, -2));
                    }
                    view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), view.getLayoutParams().height));
                }
                int i = 1;
                if (layoutManager.A1I()) {
                    i = 0;
                }
                int A05 = (new AnonymousClass28F(layoutManager, i).A05() - AnonymousClass6W2.A00(view, layoutManager)) / 2;
                if (A05 <= 0) {
                    return;
                }
                if (layoutManager.A1I()) {
                    boolean A1b = AnonymousClass3MY.A1b(this.A00);
                    int i2 = 0;
                    if (A1b == A1P) {
                        i2 = A05;
                    }
                    rect.left = i2;
                    if (A1b != z) {
                        A05 = 0;
                    }
                    rect.right = A05;
                    return;
                }
                int i3 = 0;
                if (A1P) {
                    i3 = A05;
                }
                rect.top = i3;
                if (!z) {
                    A05 = 0;
                }
                rect.bottom = A05;
            }
        }
    }

    public C112515lb(C18000vb r1) {
        this.A00 = r1;
    }
}
