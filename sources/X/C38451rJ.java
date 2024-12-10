package X;

import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;

/* renamed from: X.1rJ  reason: invalid class name and case insensitive filesystem */
public final class C38451rJ {
    public final C38231qw A00;
    public final Object A01 = new Object();
    public final boolean A02;

    public C38451rJ(C38231qw r2, boolean z) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A02 = z;
    }

    public final void A00(View view, boolean z) {
        if (this.A02) {
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            frameLayout.addView(view);
            frameLayout.setTag(2131429632, this.A01);
            this.A00.BBC(frameLayout, z);
            return;
        }
        this.A00.BBC(view, z);
    }

    public final void A01(View view, boolean z) {
        Object obj;
        if (view != null && this.A02) {
            View view2 = (View) view.getParent();
            if (view2 != null) {
                obj = view2.getTag(2131429632);
            } else {
                obj = null;
            }
            if (C18070vi.A18(obj, this.A01)) {
                int i = 8;
                if (z) {
                    i = 0;
                }
                view.setVisibility(i);
            }
        }
    }
}
