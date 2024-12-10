package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

/* renamed from: X.9kw  reason: invalid class name and case insensitive filesystem */
public final class C190439kw {
    public final TextView A00;
    public final C18000vb A01;
    public final String A02;

    public final void A00() {
        TextView textView = this.A00;
        textView.setVisibility(8);
        AlphaAnimation A0H = C108985cd.A0H();
        A0H.setDuration(320);
        textView.startAnimation(A0H);
    }

    public C190439kw(View view, C18000vb r3, String str) {
        C18070vi.A0k(view, str);
        this.A01 = r3;
        this.A00 = AnonymousClass3Ma.A0E(view, 2131436543);
        this.A02 = str;
    }
}
