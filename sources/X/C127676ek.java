package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.6ek  reason: invalid class name and case insensitive filesystem */
public final class C127676ek {
    public final View A00;
    public final View A01;

    public C127676ek(View view, View view2, View view3, FrameLayout frameLayout, AnonymousClass118 r9) {
        C18070vi.A0w(r9, view, view2, frameLayout, view3);
        this.A01 = view2;
        this.A00 = view3;
        view3.animate().cancel();
        view3.setAlpha(1.0f);
        view3.setVisibility(0);
        view2.setVisibility(8);
        frameLayout.removeAllViews();
        frameLayout.addView(view2, new FrameLayout.LayoutParams(-2, -2, 17));
        AnonymousClass4aO.A02(view);
        Context context = r9.A00;
        int A012 = AnonymousClass3Ma.A01(context, context.getResources(), 2130968944, 2131100005);
        view.setBackgroundColor(A012);
        view3.setBackgroundColor(A012);
    }
}
