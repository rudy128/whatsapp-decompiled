package X;

/* renamed from: X.731  reason: invalid class name */
public class AnonymousClass731 {
    public final AnonymousClass18K A00;
    public final AnonymousClass00H A01;
    public final C18030ve A02;
    public volatile Boolean A03;

    public static boolean A02(AnonymousClass731 r2) {
        if (r2.A03 == null) {
            synchronized (r2) {
                r2.A03 = AnonymousClass3MZ.A15(r2.A02, 2755);
            }
        }
        return Boolean.TRUE.equals(r2.A03);
    }

    public AnonymousClass731(C18030ve r1, AnonymousClass18K r2, AnonymousClass00H r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public static int A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935 || hashCode != 3005871 || !str.equals("auto")) {
                return 3;
            }
            return 1;
        } else if (str.equals("on")) {
            return 2;
        } else {
            return 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r7 == 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass731 r5, java.lang.String r6, int r7, int r8, long r9, boolean r11, boolean r12) {
        /*
            boolean r0 = A02(r5)
            if (r0 == 0) goto L_0x0064
            X.64M r4 = new X.64M
            r4.<init>()
            r2 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.A09 = r0
            X.C138896xs.A00(r5, r4)
            int r0 = X.C72453Mb.A04(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A07 = r0
            r0 = 100
            r1 = 0
            if (r7 == r0) goto L_0x0027
            r0 = 1
            if (r7 != 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A05 = r0
            int r0 = A00(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0A = r0
            if (r12 == 0) goto L_0x003b
            r2 = 1
        L_0x003b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.A0D = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4.A0C = r0
            double r2 = (double) r9
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r4.A06 = r0
            r0 = 0
            r4.A0H = r0
            r4.A0E = r0
            X.18K r0 = r5.A00
            r0.CC4(r4)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass731.A01(X.731, java.lang.String, int, int, long, boolean, boolean):void");
    }

    public void A03(int i) {
        if (A02(this)) {
            AnonymousClass64M r1 = new AnonymousClass64M();
            r1.A09 = C17880vN.A0h();
            if (i == 1 || i == 2 || i == 3) {
                ((C138896xs) this.A01.get()).A01();
            }
            C138896xs.A00(this, r1);
            r1.A08 = Integer.valueOf(i);
            this.A00.CC4(r1);
        }
    }

    public void A04(boolean z, int i) {
        if (A02(this)) {
            AnonymousClass64M r1 = new AnonymousClass64M();
            C138896xs.A00(this, r1);
            r1.A02 = AnonymousClass000.A0i();
            r1.A09 = C17880vN.A0k();
            r1.A0B = Integer.valueOf(C72453Mb.A03(z ? 1 : 0));
            r1.A0F = C17880vN.A0n(i);
            this.A00.CC4(r1);
        }
    }
}
