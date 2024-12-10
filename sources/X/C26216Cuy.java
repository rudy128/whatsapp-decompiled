package X;

import android.view.View;

/* renamed from: X.Cuy  reason: case insensitive filesystem */
public final class C26216Cuy {
    public boolean A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final Runnable A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.A01 != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A02(X.C26216Cuy r3) {
        /*
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            android.view.View r2 = r3.A03
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0010
            boolean r1 = r3.A01
            r0 = 8
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26216Cuy.A02(X.Cuy):void");
    }

    public static /* synthetic */ void A03(C26216Cuy cuy, Boolean bool) {
        C18070vi.A0d(cuy, 0);
        C18070vi.A0b(bool);
        cuy.A00 = bool.booleanValue();
    }

    public static /* synthetic */ void A04(C26216Cuy cuy, Boolean bool) {
        C18070vi.A0d(cuy, 0);
        C18070vi.A0b(bool);
        cuy.A01 = bool.booleanValue();
    }

    public C26216Cuy(View view, View view2) {
        C18070vi.A0j(view, view2);
        this.A02 = view;
        this.A03 = view2;
        if (AnonymousClass112.A02()) {
            D56 d56 = new D56(new DMm(this, 4), this, new DWE(this));
            D56 d562 = new D56(new DMm(this, 5), this, new DWF(this));
            view.setOnHoverListener(d562);
            view.setOnTouchListener(d562);
            View view3 = this.A03;
            view3.setOnHoverListener(d56);
            view3.setOnTouchListener(d56);
        }
        this.A04 = new C146427Pb(this, 9);
    }
}
