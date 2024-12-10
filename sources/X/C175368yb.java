package X;

import android.content.Context;

/* renamed from: X.8yb  reason: invalid class name and case insensitive filesystem */
public class C175368yb extends C192079nl {
    public final AnonymousClass18O A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final AXS A03;
    public final AnonymousClass1QL A04;
    public final A6R A05;
    public final AZ6 A06;
    public final AnonymousClass1R2 A07;
    public final AnonymousClass118 A08;
    public final A8C A09;

    private String A00(AW0 aw0, C170318pf r25, boolean z) {
        AnonymousClass1R2 r8 = this.A07;
        AW0 aw02 = aw0;
        String A0U = r8.A0U(aw02);
        C170318pf r0 = r25;
        if (r25 == null) {
            return "";
        }
        int i = r0.A01;
        if (i == 403) {
            int i2 = aw02.A02;
            if (i2 == 405) {
                Context context = this.A08.A00;
                if (z) {
                    return context.getString(2131897061);
                }
                return C72473Md.A0j(context, A0U, 2131893488);
            } else if (!(i2 == 406 || i2 == 408 || i2 == 423 || i2 == 424)) {
                return "";
            }
        } else if (i != 423) {
            if (!(i == 424 && 408 == aw02.A02)) {
                return "";
            }
        } else if (422 != aw02.A02) {
            return "";
        }
        if (!z) {
            return AnonymousClass1R2.A0C(r8, r8.A0T(aw02), 2131894161, 2131894169, 2131894170, 2131894163, 2131894167, 2131894168, 2131894166, 2131894162, 2131894164, 2131894165, 2131894160, aw02.A05);
        }
        return A0U;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 != 418) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (android.text.TextUtils.isEmpty(r2.A0N) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(X.AW0 r5) {
        /*
            r4 = this;
            X.8pG r2 = r5.A0A
            X.8pf r2 = (X.C170318pf) r2
            r3 = 1
            java.lang.String r1 = r4.A00(r5, r2, r3)
            int r0 = r5.A03
            if (r0 != r3) goto L_0x0014
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            if (r2 == 0) goto L_0x0044
            X.9ue r0 = r2.A0H
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0039
            int r1 = r5.A02
            r0 = 20
            if (r1 == r0) goto L_0x0041
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x0041
            r0 = 415(0x19f, float:5.82E-43)
            if (r1 == r0) goto L_0x0041
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0041
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x0041
        L_0x0034:
            java.lang.String r0 = super.A01(r5)
            return r0
        L_0x0039:
            java.lang.String r0 = r2.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0044
        L_0x0041:
            java.lang.String r0 = r2.A0R
            return r0
        L_0x0044:
            boolean r0 = r5.A0H()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x0034
            X.1R2 r0 = r4.A07
            java.lang.String r0 = r0.A0U(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175368yb.A01(X.AW0):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        if (r1 != 417) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        if (r1 != 418) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(X.AW0 r16) {
        /*
            r15 = this;
            r5 = r16
            X.8pG r3 = r5.A0A
            X.8pf r3 = (X.C170318pf) r3
            r10 = 0
            java.lang.String r1 = r15.A00(r5, r3, r10)
            int r0 = r5.A03
            r9 = 1
            if (r0 != r9) goto L_0x0017
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0017
            return r1
        L_0x0017:
            if (r3 == 0) goto L_0x0071
            X.9ue r0 = r3.A0H
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x003b
            X.0ve r1 = r15.A02
            X.AXS r0 = r15.A03
            java.lang.String r0 = r0.A0G()
            boolean r0 = X.A8C.A04(r1, r0)
            if (r0 != 0) goto L_0x0089
            X.9ue r0 = r3.A0H
            java.lang.String r0 = r0.A0E
            boolean r0 = X.A8C.A05(r0)
            if (r0 == 0) goto L_0x0089
        L_0x0039:
            r0 = 0
            return r0
        L_0x003b:
            java.lang.String r0 = r3.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0071
            int r2 = r5.A02
            r0 = 12
            if (r2 != r0) goto L_0x0053
            X.A8C r0 = r15.A09
            X.118 r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131897476(0x7f122c84, float:1.9429843E38)
            goto L_0x0084
        L_0x0053:
            X.A8C r1 = r15.A09
            r0 = 405(0x195, float:5.68E-43)
            if (r2 != r0) goto L_0x0065
            X.118 r0 = r1.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897521(0x7f122cb1, float:1.9429934E38)
        L_0x0060:
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x0065:
            r0 = 406(0x196, float:5.69E-43)
            if (r2 != r0) goto L_0x0039
            X.118 r0 = r1.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897522(0x7f122cb2, float:1.9429936E38)
            goto L_0x0060
        L_0x0071:
            boolean r0 = r5.A0H()
            if (r0 == 0) goto L_0x009d
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x009d
            X.118 r0 = r15.A08
            android.content.Context r2 = r0.A00
            r0 = 2131893464(0x7f121cd8, float:1.9421705E38)
        L_0x0084:
            java.lang.String r0 = r2.getString(r0)
            return r0
        L_0x0089:
            int r1 = r5.A02
            r0 = 20
            if (r1 == r0) goto L_0x0234
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x01a4
            r0 = 415(0x19f, float:5.82E-43)
            r4 = 418(0x1a2, float:5.86E-43)
            r2 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x00a4
            if (r1 == r2) goto L_0x00b8
        L_0x009d:
            X.1R2 r0 = r15.A00
            java.lang.String r0 = r0.A0S(r5)
            return r0
        L_0x00a4:
            int r0 = r3.A01
            if (r0 == r4) goto L_0x00b8
            X.A8C r0 = r15.A09
            java.lang.String r2 = r3.A0R
            X.118 r0 = r0.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897537(0x7f122cc1, float:1.9429966E38)
            java.lang.String r0 = X.C17890vO.A0R(r1, r2, r9, r10, r0)
            return r0
        L_0x00b8:
            int r1 = r3.A01
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x020c
            if (r1 == r2) goto L_0x00c3
            if (r1 == r4) goto L_0x018c
            goto L_0x009d
        L_0x00c3:
            X.9ue r4 = r3.A0H
            X.9O4 r2 = r4.A0C
            java.lang.String r5 = "FAILURE"
            java.lang.String r6 = "SUCCESS"
            if (r2 == 0) goto L_0x012d
            java.lang.String r7 = r2.A09
            java.lang.String r0 = "INIT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00f9
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f9
            X.A8C r7 = r15.A09
            long r1 = r4.A01
            java.lang.String r0 = r4.A0E
            boolean r3 = X.A8C.A05(r0)
            X.118 r0 = r7.A01
            if (r3 == 0) goto L_0x01af
            android.content.Context r1 = r0.A00
            r0 = 2131897527(0x7f122cb7, float:1.9429946E38)
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x00f9:
            boolean r0 = r7.equals(r6)
            java.lang.String r1 = "ACCEPT"
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = r2.A08
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0114
            X.A8C r0 = r15.A09
            X.118 r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131897485(0x7f122c8d, float:1.942986E38)
            goto L_0x0084
        L_0x0114:
            boolean r0 = r7.equals(r5)
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = r2.A08
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0175
            X.A8C r0 = r15.A09
            X.118 r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131897484(0x7f122c8c, float:1.9429859E38)
            goto L_0x0084
        L_0x012d:
            X.9lx r2 = r4.A0B
            if (r2 == 0) goto L_0x0175
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "RESUME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x015c
            java.lang.String r0 = "PAUSE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0175
            java.lang.String r1 = r2.A03
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x01c3
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x015c
            X.A8C r0 = r15.A09
            X.118 r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131897479(0x7f122c87, float:1.9429849E38)
            goto L_0x0084
        L_0x015c:
            java.lang.String r1 = r2.A03
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x01ec
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x0175
            X.A8C r0 = r15.A09
            X.118 r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131897482(0x7f122c8a, float:1.9429855E38)
            goto L_0x0084
        L_0x0175:
            java.lang.String r1 = r4.A0D
            java.lang.String r0 = r4.A0I
            if (r1 == 0) goto L_0x018c
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x018c
            X.A8C r0 = r15.A09
            X.118 r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131897481(0x7f122c89, float:1.9429853E38)
            goto L_0x0084
        L_0x018c:
            X.A8C r2 = r15.A09
            X.9ue r0 = r3.A0H
            java.lang.String r0 = r0.A0H
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            X.118 r0 = r2.A01
            android.content.Context r2 = r0.A00
            r0 = 2131897477(0x7f122c85, float:1.9429845E38)
            if (r1 == 0) goto L_0x0084
            r0 = 2131897478(0x7f122c86, float:1.9429847E38)
            goto L_0x0084
        L_0x01a4:
            X.A8C r0 = r15.A09
            X.118 r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131897556(0x7f122cd4, float:1.9430005E38)
            goto L_0x0084
        L_0x01af:
            android.content.Context r6 = r0.A00
            r5 = 2131897526(0x7f122cb6, float:1.9429944E38)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            X.0vb r3 = r7.A02
            X.11P r0 = r7.A00
            java.lang.String r0 = X.A8C.A01(r0, r3, r1)
            java.lang.String r0 = X.C17880vN.A0q(r6, r0, r4, r10, r5)
            return r0
        L_0x01c3:
            X.A8C r5 = r15.A09
            long r0 = r2.A01
            long r2 = r2.A00
            X.118 r4 = r5.A01
            android.content.Context r11 = r4.A00
            r10 = 2131897480(0x7f122c88, float:1.942985E38)
            java.lang.Object[] r8 = X.AnonymousClass3MW.A1b()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r6
            X.0vb r5 = r5.A02
            X.11Y r4 = X.AnonymousClass11X.A00
            java.lang.String r1 = r4.A0B(r5, r0)
            r0 = 0
            r8[r0] = r1
            long r2 = r2 / r6
            java.lang.String r0 = r4.A0B(r5, r2)
            java.lang.String r0 = X.C17880vN.A0q(r11, r0, r8, r9, r10)
            return r0
        L_0x01ec:
            X.A8C r7 = r15.A09
            long r1 = r4.A04
            X.118 r0 = r7.A01
            android.content.Context r6 = r0.A00
            r5 = 2131897483(0x7f122c8b, float:1.9429857E38)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            X.11P r0 = r7.A00
            long r2 = X.A8C.A00(r0, r1)
            X.0vb r1 = r7.A02
            X.11Y r0 = X.AnonymousClass11X.A00
            java.lang.String r0 = r0.A0B(r1, r2)
            java.lang.String r0 = X.C17880vN.A0q(r6, r0, r4, r10, r5)
            return r0
        L_0x020c:
            X.A8C r8 = r15.A09
            X.1KN r7 = r5.A09
            X.9ue r0 = r3.A0H
            long r2 = r0.A01
            X.118 r0 = r8.A01
            android.content.Context r6 = r0.A00
            r5 = 2131897555(0x7f122cd3, float:1.9430003E38)
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1b()
            X.1KJ r0 = X.AnonymousClass1KL.A0B
            X.0vb r1 = r8.A02
            java.lang.String r0 = r0.BLc(r1, r7)
            r4[r10] = r0
            X.11P r0 = r8.A00
            java.lang.String r0 = X.A8C.A01(r0, r1, r2)
            java.lang.String r0 = X.C17880vN.A0q(r6, r0, r4, r9, r5)
            return r0
        L_0x0234:
            X.A8C r8 = r15.A09
            java.lang.String r13 = r3.A0R
            X.1KN r9 = r5.A09
            X.9ue r2 = r3.A0H
            java.lang.String r11 = r2.A0G
            long r0 = r2.A02
            long r2 = r2.A01
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            java.lang.String r7 = "Asia/Kolkata"
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r7)
            r5.setTimeInMillis(r0)
            r5.setTimeZone(r4)
            java.lang.String r6 = "ddMMyyyy"
            java.util.Locale r12 = java.util.Locale.US
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r6, r12)
            r1.setTimeZone(r4)
            java.util.Date r0 = r5.getTime()
            java.lang.String r5 = r1.format(r0)
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r7)
            r4.setTimeInMillis(r2)
            r4.setTimeZone(r0)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r6, r12)
            r1.setTimeZone(r0)
            java.util.Date r0 = r4.getTime()
            java.lang.String r0 = r1.format(r0)
            boolean r4 = r5.equals(r0)
            r7 = 1
            r14 = 0
            r10 = 2
            java.lang.String r1 = "MAX"
            X.118 r0 = r8.A01
            android.content.Context r6 = r0.A00
            boolean r0 = r1.equals(r11)
            if (r4 == 0) goto L_0x02c4
            r5 = 2131897557(0x7f122cd5, float:1.9430007E38)
            if (r0 == 0) goto L_0x029f
            r5 = 2131897558(0x7f122cd6, float:1.9430009E38)
        L_0x029f:
            r0 = 4
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r14] = r13
            X.1KJ r0 = X.AnonymousClass1KL.A0B
            X.0vb r1 = r8.A02
            java.lang.String r0 = r0.BLc(r1, r9)
            r4[r7] = r0
            java.lang.String r0 = r8.A08(r9, r11)
            java.lang.String r0 = r0.toLowerCase(r12)
            r4[r10] = r0
            X.11P r0 = r8.A00
            java.lang.String r1 = X.A8C.A01(r0, r1, r2)
            r0 = 3
            java.lang.String r0 = X.C17880vN.A0q(r6, r1, r4, r0, r5)
            return r0
        L_0x02c4:
            r5 = 2131897559(0x7f122cd7, float:1.943001E38)
            if (r0 == 0) goto L_0x02cc
            r5 = 2131897560(0x7f122cd8, float:1.9430013E38)
        L_0x02cc:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            X.1KJ r0 = X.AnonymousClass1KL.A0B
            X.0vb r1 = r8.A02
            java.lang.String r0 = r0.BLc(r1, r9)
            r4[r14] = r0
            X.11P r0 = r8.A00
            java.lang.String r0 = X.A8C.A01(r0, r1, r2)
            java.lang.String r0 = X.C17880vN.A0q(r6, r0, r4, r7, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175368yb.A02(X.AW0):java.lang.String");
    }

    public C175368yb(AnonymousClass18O r1, AnonymousClass11P r2, AnonymousClass118 r3, C18030ve r4, AXS axs, AnonymousClass1QL r6, A6R a6r, AZ6 az6, A8C a8c, AnonymousClass1R2 r10) {
        super(r10);
        this.A01 = r2;
        this.A02 = r4;
        this.A08 = r3;
        this.A00 = r1;
        this.A07 = r10;
        this.A09 = a8c;
        this.A04 = r6;
        this.A06 = az6;
        this.A05 = a6r;
        this.A03 = axs;
    }
}
