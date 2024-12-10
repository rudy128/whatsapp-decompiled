package X;

public final class A6O {
    public final C18030ve A00;
    public final AnonymousClass18K A01;

    public final void A03(C134696r0 r6, C196009uJ r7, String str) {
        String str2;
        C18070vi.A0d(str, 2);
        if (C18020vd.A05(C18040vf.A02, this.A00, 4725)) {
            C171108rB r1 = new C171108rB();
            Integer A0U = AnonymousClass8BS.A0U();
            r1.A02 = A0U;
            if (r7 != null) {
                r1.A01 = Integer.valueOf(A00(r7));
            }
            String str3 = null;
            if (r6 != null) {
                str2 = r6.A00;
            } else {
                str2 = null;
            }
            r1.A05 = str2;
            r1.A03 = str;
            AnonymousClass18K r2 = this.A01;
            r2.CC7(r1);
            C171188rJ r12 = new C171188rJ();
            r12.A02 = A0U;
            if (r7 != null) {
                r12.A01 = Integer.valueOf(A00(r7));
                r12.A03 = C108965cb.A0m(r7.A01.user);
            }
            if (r6 != null) {
                str3 = r6.A01;
            }
            r12.A04 = str3;
            r12.A05 = str;
            r2.CC7(r12);
        }
    }

    public static final int A00(C196009uJ r2) {
        int intValue = r2.A02.intValue();
        int i = 1;
        if (intValue != 0) {
            i = 2;
            if (intValue != 1) {
                throw AnonymousClass3MW.A14();
            }
        }
        return i;
    }

    public static final void A02(C171188rJ r1, C195409tI r2) {
        r1.A01 = Integer.valueOf(A00(r2.A01));
        r1.A04 = r2.A03;
        r1.A03 = C108965cb.A0m(r2.A02.user);
        r1.A06 = r2.A05;
    }

    public final void A04(C195409tI r3, int i) {
        A01(new C171108rB(), this, r3, 5, i);
    }

    public final void A05(C195409tI r3, int i) {
        A01(new C171108rB(), this, r3, 2, i);
    }

    public A6O(C18030ve r1, AnonymousClass18K r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public static void A01(C171108rB r4, A6O a6o, C195409tI r6, int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        r4.A02 = valueOf;
        Integer valueOf2 = Integer.valueOf(i2);
        r4.A00 = valueOf2;
        r4.A01 = Integer.valueOf(A00(r6.A01));
        r4.A05 = r6.A04;
        r4.A04 = r6.A05;
        AnonymousClass18K r1 = a6o.A01;
        r1.CC7(r4);
        C171188rJ r0 = new C171188rJ();
        r0.A02 = valueOf;
        r0.A00 = valueOf2;
        A02(r0, r6);
        r1.CC7(r0);
    }
}
