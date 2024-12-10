package X;

import android.view.View;

/* renamed from: X.5wi  reason: invalid class name and case insensitive filesystem */
public final class C116255wi extends C87294Va {
    public long A00 = -1;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass1VE A03;
    public final AnonymousClass1VF A04;
    public final AnonymousClass1V9 A05;
    public final AnonymousClass6RC A06 = AnonymousClass6RC.AR_EFFECTS;
    public final AnonymousClass11P A07;
    public final C18030ve A08;
    public final Integer A09 = AnonymousClass00R.A0C;
    public final boolean A0A;

    public void A09() {
        this.A01 = true;
    }

    public boolean A0B(View view, AnonymousClass72C r4) {
        View findViewById;
        C18070vi.A0d(r4, 0);
        if (super.A0B(view, r4) || !r4.A04 || !r4.A01 || view == null || (findViewById = view.findViewById(2131428761)) == null || view.getVisibility() != 0 || findViewById.getVisibility() != 0 || !findViewById.isEnabled()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0.isShown() != true) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(android.view.View r5, X.AnonymousClass72C r6) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r0 = 0
            if (r5 == 0) goto L_0x000e
            r0 = 2131428761(0x7f0b0599, float:1.8479176E38)
            android.view.View r0 = r5.findViewById(r0)
        L_0x000e:
            r3 = 1
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.isShown()
            r1 = 1
            if (r0 == r3) goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            boolean r0 = super.A0C(r5, r6)
            if (r0 == 0) goto L_0x0056
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0056
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0056
            if (r1 == 0) goto L_0x0056
            X.1VE r0 = r4.A03
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r0)
            java.lang.String r0 = "ar_tooltip_show_count"
            int r0 = X.C17890vO.A00(r1, r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0056
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0056
        L_0x003f:
            X.0ve r2 = r4.A08
            r1 = 10275(0x2823, float:1.4398E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0056
            X.1VF r1 = r4.A04
            X.1VG r0 = X.AnonymousClass1VG.TOOLTIP_AR_EFFECT
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0056
            return r3
        L_0x0056:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116255wi.A0C(android.view.View, X.72C):boolean");
    }

    public long A04() {
        return C108995ce.A06(this.A01 ? 1 : 0);
    }

    public C116255wi(AnonymousClass1VE r3, AnonymousClass1VF r4, AnonymousClass1V9 r5, AnonymousClass11P r6, C18030ve r7, boolean z) {
        this.A07 = r6;
        this.A08 = r7;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A0A = z;
    }

    public float A00() {
        return 32.0f;
    }

    public int A01() {
        return 2131428761;
    }

    public int A02() {
        return 2131886714;
    }

    public long A03() {
        return 10000;
    }

    public AnonymousClass6RC A05() {
        return this.A06;
    }

    public Integer A07() {
        return this.A09;
    }

    public void A08() {
        int i = 69;
        if (System.currentTimeMillis() - this.A00 > 10000) {
            i = 72;
        }
        this.A05.A00(i, 16);
    }

    public void A0A() {
        long currentTimeMillis = System.currentTimeMillis();
        this.A00 = currentTimeMillis;
        this.A03.A05(currentTimeMillis);
        this.A04.A01(AnonymousClass1VG.TOOLTIP_AR_EFFECT);
        this.A05.A00(66, 16);
        this.A02 = true;
    }
}
