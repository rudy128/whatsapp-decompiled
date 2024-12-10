package X;

public abstract class A3J {
    public static final AnonymousClass8X7 A00(AnonymousClass212 r3) {
        C18070vi.A0d(r3, 0);
        AnonymousClass8X7 A00 = C166408cq.A00();
        AnonymousClass205 r1 = r3.A0v;
        AnonymousClass8X7.A02(r1.A00, A00, r1);
        A00.A0H(r1.A01);
        AnonymousClass1BI A0H = r3.A0H();
        if (A0H != null) {
            AnonymousClass8X7.A01(A0H, A00);
        }
        return A00;
    }

    public static final void A02(C18030ve r2, C164578Zj r3, AnonymousClass212 r4) {
        C179689Jj r0;
        int i;
        int i2;
        C18070vi.A0d(r2, 0);
        int i3 = r3.bitField0_;
        if ((i3 & 1) != 0 && (i2 = r3.messageAddOnDurationInSecs_) > 0) {
            r4.A19(i2);
        }
        if ((i3 & 2) != 0 && C18020vd.A05(C18040vf.A02, r2, 9108)) {
            int i4 = r3.messageAddOnExpiryType_;
            if (i4 == 1 || i4 != 2) {
                r0 = C179689Jj.STATIC;
            } else {
                r0 = C179689Jj.DEPENDENT_ON_PARENT;
            }
            int i5 = r0.value;
            if (i5 == C179689Jj.STATIC.value) {
                i = 1;
            } else {
                i = 0;
                if (i5 == C179689Jj.DEPENDENT_ON_PARENT.value) {
                    i = 2;
                }
            }
            r4.A00 = i;
        }
    }

    public static final AnonymousClass8WA A01(AnonymousClass212 r4) {
        C179689Jj r0;
        if (r4.A17() <= 0 || r4.A00 == 0) {
            return null;
        }
        AnonymousClass8WA r3 = (AnonymousClass8WA) C164578Zj.DEFAULT_INSTANCE.A0N();
        int A17 = r4.A17();
        C164578Zj r1 = (C164578Zj) C17880vN.A0G(r3);
        r1.bitField0_ |= 1;
        r1.messageAddOnDurationInSecs_ = A17;
        int i = r4.A00;
        if (i != 1) {
            if (i == 2) {
                r0 = C179689Jj.DEPENDENT_ON_PARENT;
            }
            return r3;
        }
        r0 = C179689Jj.STATIC;
        C164578Zj r12 = (C164578Zj) C17880vN.A0G(r3);
        r12.messageAddOnExpiryType_ = r0.value;
        r12.bitField0_ |= 2;
        return r3;
    }
}
