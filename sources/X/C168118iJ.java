package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.8iJ  reason: invalid class name and case insensitive filesystem */
public final class C168118iJ extends AnonymousClass8IS {
    public final int A00;
    public final View A01;
    public final C18000vb A02;
    public final C18030ve A03;
    public final C28931bI A04;
    public final C28931bI A05;
    public final C28931bI A06;
    public final C28931bI A07;
    public final C28931bI A08;
    public final C28931bI A09;
    public final C28931bI A0A;
    public final C28931bI A0B;

    public static C28931bI A00(View view, int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return new C28931bI(findViewById);
        }
        return null;
    }

    public static final void A01(C28931bI r1, C28931bI r2, String str) {
        TextView textView;
        if (str == null || str.length() == 0) {
            AnonymousClass3Ma.A1M(r1);
            AnonymousClass3Ma.A1M(r2);
            return;
        }
        if (r1 != null) {
            r1.A04(0);
        }
        if (r2 != null && (textView = (TextView) AnonymousClass3MY.A0I(r2, 0)) != null) {
            textView.setText(str);
        }
    }

    public C168118iJ(View view, C18000vb r7, C18030ve r8) {
        super(view);
        C28931bI r4;
        this.A02 = r7;
        this.A03 = r8;
        this.A01 = view.findViewById(2131428861);
        View findViewById = view.findViewById(2131428884);
        C28931bI r1 = null;
        if (findViewById != null) {
            r4 = new C28931bI(findViewById);
        } else {
            r4 = null;
        }
        this.A0B = r4;
        this.A0A = A00(view, 2131428883);
        C28931bI A002 = A00(view, 2131428882);
        this.A09 = A002;
        this.A08 = A00(view, 2131428881);
        this.A05 = A00(view, 2131428878);
        this.A04 = A00(view, 2131428877);
        C28931bI A003 = A00(view, 2131428880);
        this.A07 = A003;
        View findViewById2 = view.findViewById(2131428879);
        this.A06 = findViewById2 != null ? new C28931bI(findViewById2) : r1;
        this.A00 = AnonymousClass000.A0Y(view).getDimensionPixelSize(2131169533);
        if (r4 != null) {
            r4.A07(new C21110Aee(0));
        }
        if (A002 != null) {
            A002.A07(new C21110Aee(1));
        }
        if (A003 != null) {
            A003.A07(new C21110Aee(2));
        }
    }
}
