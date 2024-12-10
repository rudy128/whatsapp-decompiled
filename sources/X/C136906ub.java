package X;

/* renamed from: X.6ub  reason: invalid class name and case insensitive filesystem */
public final class C136906ub {
    public final AnonymousClass11C A00;
    public final C19830z4 A01;
    public final C18030ve A02;
    public final C25291Nq A03;
    public final AnonymousClass1SK A04;
    public final C18010vc A05;

    public final AnonymousClass6nF A00(Integer num, int i, boolean z) {
        int A0G;
        Float BNL;
        if (i != 1 && i != 23 && i != 37 && i != 42 && i != 57) {
            return null;
        }
        if (num != null && num.intValue() == 3) {
            C18030ve r4 = this.A02;
            int i2 = 2654;
            if (z) {
                i2 = 6032;
            }
            C18040vf r3 = C18040vf.A02;
            int A002 = C18020vd.A00(r3, r4, i2);
            int i3 = 2655;
            if (z) {
                i3 = 6029;
            }
            int A003 = C18020vd.A00(r3, r4, i3);
            if (500 <= A002 && A002 < 6001 && 20 <= A003 && A003 < 101) {
                if (z) {
                    if (C18020vd.A05(C18040vf.A01, r4, 6033)) {
                        int A004 = C18020vd.A00(r3, r4, 6030);
                        int A005 = C18020vd.A00(r3, r4, 6029);
                        int A006 = C18020vd.A00(r3, r4, 6032);
                        return new AnonymousClass6nF(A004, A005, A006, A006);
                    }
                } else if (C18020vd.A05(r3, r4, 2653)) {
                    int A007 = C18020vd.A00(r3, r4, 2656);
                    int A008 = C18020vd.A00(r3, r4, 2655);
                    int A009 = C18020vd.A00(r3, r4, 2654);
                    return new AnonymousClass6nF(A007, A008, A009, A009);
                }
            }
        }
        C18030ve r2 = this.A02;
        if (z) {
            return new C1194368c(r2);
        }
        AnonymousClass68e r32 = new AnonymousClass68e(r2);
        C18040vf r42 = C18040vf.A02;
        if (!C18020vd.A05(r42, r2, 700)) {
            return r32;
        }
        int A0010 = C18020vd.A00(r42, r2, 1574);
        int A0011 = C18020vd.A00(r42, r2, 1575);
        if (500 > A0010 || A0010 >= 4001 || 20 > A0011 || A0011 >= 101) {
            return r32;
        }
        if (num != null) {
            A0G = num.intValue();
        } else {
            A0G = this.A01.A0G();
        }
        if (!C18020vd.A05(r42, r2, 702) || A0G == 0) {
            if (!C18020vd.A05(r42, r2, 701)) {
                return r32;
            }
            if (C24191Jf.A02(this.A00, this.A05) < 2013 || (BNL = this.A04.BNL(0)) == null) {
                return r32;
            }
            float floatValue = BNL.floatValue();
            if (floatValue <= 20.0f || floatValue < ((float) C18020vd.A00(r42, r2, 1573))) {
                return r32;
            }
        } else if (A0G != 1) {
            return r32;
        }
        return new C1194468d(r2);
    }

    public final boolean A01(C62572rc r5, boolean z) {
        int max = Math.max(r5.A06, r5.A08);
        C18030ve r2 = this.A02;
        int i = 3068;
        if (z) {
            i = 6031;
        }
        return C108975cc.A1C(max, C18020vd.A00(C18040vf.A02, r2, i));
    }

    public final boolean A02(C134746r5 r5, boolean z) {
        int max = Math.max(r5.A00, r5.A01);
        C18030ve r2 = this.A02;
        int i = 3068;
        if (z) {
            i = 6031;
        }
        return C108975cc.A1C(max, C18020vd.A00(C18040vf.A02, r2, i));
    }

    public final boolean A03(boolean z) {
        int i;
        int A022 = C24191Jf.A02(this.A00, this.A05);
        C18030ve r2 = this.A02;
        C18040vf r1 = C18040vf.A02;
        if (A022 < C18020vd.A00(r1, r2, 4170)) {
            return false;
        }
        if (z) {
            r1 = C18040vf.A01;
            i = 6033;
        } else {
            i = 2653;
        }
        return C18020vd.A05(r1, r2, i);
    }

    public final boolean A04(boolean z) {
        C18030ve r2 = this.A02;
        int i = 3116;
        if (z) {
            i = 6269;
        }
        return C18020vd.A05(C18040vf.A01, r2, i);
    }

    public C136906ub(AnonymousClass11C r2, C19830z4 r3, C18030ve r4, C25291Nq r5, AnonymousClass1SK r6, C18010vc r7) {
        C18070vi.A0w(r4, r2, r6, r3, r7);
        C18070vi.A0d(r5, 6);
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A05 = r7;
        this.A03 = r5;
    }
}
