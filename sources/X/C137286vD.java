package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* renamed from: X.6vD  reason: invalid class name and case insensitive filesystem */
public abstract class C137286vD {
    public static final void A00(View view, C18000vb r5) {
        int i;
        boolean A17 = C18070vi.A17(r5, view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (AnonymousClass3MY.A1b(r5)) {
            layoutParams2.addRule(0, 0);
            i = 11;
        } else {
            layoutParams2.addRule(A17 ? 1 : 0, 0);
            i = 9;
        }
        layoutParams2.addRule(i);
    }

    public static final void A01(View view, C18000vb r5) {
        boolean A17 = C18070vi.A17(r5, view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (AnonymousClass3MY.A1b(r5)) {
            layoutParams2.addRule(11, 0);
            layoutParams2.addRule(0, 2131435142);
            return;
        }
        layoutParams2.addRule(9, 0);
        layoutParams2.addRule(A17 ? 1 : 0, 2131435142);
    }
}
