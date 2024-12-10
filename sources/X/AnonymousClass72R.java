package X;

/* renamed from: X.72R  reason: invalid class name */
public final class AnonymousClass72R {
    public final A8Q A00;
    public final AnonymousClass18K A01;
    public final C189399jB A02;
    public final AnonymousClass10I A03;
    public final C36921og A04;

    public final void A06(Integer num, Integer num2, String str, int i, int i2, boolean z) {
        Integer num3;
        Integer num4;
        int i3 = i2;
        if (i2 == 0) {
            num3 = A00(num2);
        } else {
            num3 = null;
        }
        int i4 = 1;
        if (i3 == 1) {
            num4 = A00(num2);
        } else {
            num4 = null;
            if (i2 == 0) {
                i4 = 0;
            }
        }
        this.A03.CGF(new C146637Qa(this, (Integer) null, num3, num4, Integer.valueOf(i4), num, str, (String) null, i, true, z));
    }

    public final void A07(Integer num, Integer num2, String str, int i, boolean z, boolean z2) {
        this.A03.CGF(new C146637Qa(this, num, (Integer) null, (Integer) null, (Integer) null, num2, str, (String) null, i, z, z2));
    }

    public static final Integer A00(Integer num) {
        int intValue;
        int i;
        if (num == null || (intValue = num.intValue()) < 0) {
            return null;
        }
        int i2 = 1;
        if (intValue != 0) {
            if (intValue == 1) {
                i = 2;
            } else {
                i2 = 10;
                if (intValue <= 10) {
                    i = 3;
                } else if (intValue <= 50) {
                    i = 4;
                } else if (intValue <= 100) {
                    i = 5;
                } else if (intValue <= 500) {
                    i = 6;
                } else if (intValue <= 1000) {
                    i = 7;
                } else if (intValue <= 10000) {
                    i = 8;
                } else if (intValue <= 100000) {
                    i = 9;
                } else if (intValue > 1000000) {
                    i = 11;
                }
            }
            return Integer.valueOf(i);
        }
        return Integer.valueOf(i2);
    }

    private final void A01(C1417376t r13, int i) {
        int i2;
        Integer valueOf;
        if (r13 != null) {
            C36921og r1 = this.A04;
            int i3 = r13.A02;
            Double d = r13.A03;
            String str = r13.A07;
            String str2 = r13.A09;
            String str3 = r13.A0A;
            String str4 = r13.A08;
            String str5 = r13.A06;
            String str6 = r13.A05;
            switch (i) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 11;
                    break;
                case 5:
                    i2 = 13;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 5;
                    break;
                case 8:
                    i2 = 8;
                    break;
                case 9:
                    i2 = 12;
                    break;
                case 10:
                    i2 = 7;
                    break;
                case 12:
                    i2 = 20;
                    break;
                case 13:
                    i2 = 22;
                    break;
                case 15:
                case 17:
                    i2 = 21;
                    break;
                case 18:
                    i2 = 17;
                    break;
                case 20:
                    i2 = 15;
                    break;
                case 21:
                    i2 = 16;
                    break;
                case 23:
                    i2 = 14;
                    break;
                case 24:
                    i2 = 19;
                    break;
                case 25:
                    i2 = 18;
                    break;
                default:
                    valueOf = null;
                    break;
            }
            valueOf = Integer.valueOf(i2);
            r1.A01(d, valueOf, str, str2, str3, str4, str5, str6, i3, r13.A01);
        }
    }

    public final void A02(int i) {
        this.A03.CGF(new AnonymousClass7RP(this, i, 24));
    }

    public final void A03(C1417376t r3, int i) {
        if (r3 != null) {
            AnonymousClass63O r1 = new AnonymousClass63O();
            r1.A03 = r3.A04;
            if (i == 0) {
                r1.A04 = r3.A0B;
            }
            r1.A01 = Integer.valueOf(r3.A00);
            r1.A02 = Integer.valueOf(i);
            this.A01.CC7(r1);
        }
        A01(r3, i);
    }

    public final void A04(C1417376t r3, int i) {
        if (r3 != null) {
            A03(r3, i);
            return;
        }
        AnonymousClass63O r1 = new AnonymousClass63O();
        r1.A02 = Integer.valueOf(i);
        this.A01.CC7(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1 != 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C1417376t r5, int r6, boolean r7) {
        /*
            r4 = this;
            X.63O r3 = new X.63O
            r3.<init>()
            if (r5 == 0) goto L_0x0019
            java.lang.String r0 = r5.A04
            r3.A03 = r0
            java.lang.String r0 = r5.A0B
            r3.A04 = r0
            int r1 = r5.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A01 = r0
            if (r1 == 0) goto L_0x0021
        L_0x0019:
            r0 = 15
            if (r6 == r0) goto L_0x0036
            r0 = 17
            if (r6 == r0) goto L_0x0036
        L_0x0021:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r3.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.A02 = r0
            X.18K r0 = r4.A01
            r0.CC7(r3)
            r4.A01(r5, r6)
            return
        L_0x0036:
            X.1og r0 = r4.A04
            X.00H r0 = r0.A00
            java.util.Iterator r2 = X.C17890vO.A0h(r0)
        L_0x003e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r1 = r2.next()
            X.AM5 r1 = (X.AM5) r1
            r0 = 5
            X.AM5.A01(r1, r0)
            X.AM5.A00(r1)
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72R.A05(X.76t, int, boolean):void");
    }

    public AnonymousClass72R(A8Q a8q, AnonymousClass18K r2, C189399jB r3, C36921og r4, AnonymousClass10I r5) {
        C18070vi.A0w(r5, r2, r3, a8q, r4);
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = a8q;
        this.A04 = r4;
    }
}
