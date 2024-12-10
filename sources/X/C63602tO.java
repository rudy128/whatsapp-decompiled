package X;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.2tO  reason: invalid class name and case insensitive filesystem */
public final class C63602tO {
    public static final String[] A0B = {"e1.whatsapp.net.", "e2.whatsapp.net.", "e3.whatsapp.net.", "e4.whatsapp.net.", "e5.whatsapp.net.", "e6.whatsapp.net.", "e7.whatsapp.net.", "e8.whatsapp.net.", "e9.whatsapp.net.", "e10.whatsapp.net.", "e11.whatsapp.net.", "e12.whatsapp.net.", "e13.whatsapp.net.", "e14.whatsapp.net.", "e15.whatsapp.net.", "e16.whatsapp.net."};
    public int A00 = 0;
    public int A01;
    public final Random A02;
    public final int A03;
    public final int A04;
    public final C22631Cp A05;
    public final C18030ve A06;
    public final C88074Yf A07;
    public final String A08;
    public final List A09;
    public final List A0A;

    private C61692q6 A00(String str, int i, long j, boolean z, boolean z2) {
        C61692q6 A042 = this.A05.A04(str, j, z, z2);
        A042.A01 = i;
        C17900vP.A0f("ConnectionSequence/tryResolveDomainName; host=", str, AnonymousClass000.A10());
        return A042;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        return new X.C61692q6(r2, r1, r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0147, code lost:
        r5 = A00(r13, 80, r15, r17, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0157, code lost:
        r5.A02 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0159, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0173, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017d, code lost:
        return A00(r13, r4, r8, r2, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C61692q6 A03() {
        /*
            r19 = this;
            r6 = r19
            int r3 = r6.A00
            java.lang.String r13 = "g-fallback.whatsapp.net"
            r5 = 443(0x1bb, float:6.21E-43)
            r8 = 80
            java.lang.String r7 = "g.whatsapp.net"
            r1 = 3
            r2 = 1
            r11 = 0
            switch(r3) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00aa;
                case 3: goto L_0x0097;
                case 4: goto L_0x0089;
                case 5: goto L_0x0193;
                case 6: goto L_0x017e;
                case 7: goto L_0x015a;
                case 8: goto L_0x004b;
                case 9: goto L_0x0150;
                case 10: goto L_0x0041;
                case 11: goto L_0x0137;
                case 12: goto L_0x0028;
                case 13: goto L_0x0127;
                case 14: goto L_0x0122;
                case 15: goto L_0x00f1;
                case 16: goto L_0x0021;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unrecognized state "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0021:
            java.lang.String r0 = "Cannot retrieve address past end"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0028:
            X.4Yf r1 = r6.A07
            if (r1 == 0) goto L_0x003a
            boolean r0 = X.AnonymousClass4HS.A00(r1)
            if (r0 != 0) goto L_0x003a
            int r4 = r1.A00
            java.lang.String r13 = r1.A03
            boolean r11 = r1.A06
            goto L_0x0173
        L_0x003a:
            java.lang.String r0 = "User proxy should not be null or empty in this state."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0041:
            X.1Cp r0 = r6.A05
            X.2q6 r5 = X.C22631Cp.A01(r0, r7, r11, r11)
            r5.A01 = r8
            goto L_0x0157
        L_0x004b:
            java.util.List r4 = r6.A09
            int r0 = r6.A01
            java.lang.Object r0 = r4.get(r0)
            X.2mm r0 = (X.C59722mm) r0
            java.net.InetAddress r2 = r0.A03
            if (r2 == 0) goto L_0x0087
            java.lang.Short r0 = r0.A02
            if (r0 == 0) goto L_0x0087
            short r0 = r0.shortValue()
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress
            r1.<init>(r2, r0)
        L_0x0066:
            X.C17960vV.A07(r1)
            r0 = 4
            X.2cU r3 = new X.2cU
            r3.<init>(r0, r11)
            java.net.InetAddress r2 = r1.getAddress()
            int r1 = r1.getPort()
            int r0 = r6.A01
            java.lang.Object r0 = r4.get(r0)
            X.2mm r0 = (X.C59722mm) r0
            boolean r0 = r0.A05
            X.2q6 r5 = new X.2q6
            r5.<init>(r3, r2, r1, r0)
            return r5
        L_0x0087:
            r1 = 0
            goto L_0x0066
        L_0x0089:
            X.2cU r2 = new X.2cU
            r2.<init>(r1, r11)
            java.lang.String r0 = r6.A08
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r0)
            int r0 = r6.A04
            goto L_0x00a4
        L_0x0097:
            X.2cU r2 = new X.2cU
            r2.<init>(r1, r11)
            java.lang.String r0 = r6.A08
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r0)
            int r0 = r6.A03
        L_0x00a4:
            X.2q6 r5 = new X.2q6
            r5.<init>(r2, r1, r0, r11)
            return r5
        L_0x00aa:
            X.2cU r4 = new X.2cU
            r4.<init>(r1, r11)
            java.util.List r3 = r6.A0A
            int r0 = r6.A01
            java.lang.Object r0 = r3.get(r0)
            X.2mm r0 = (X.C59722mm) r0
            java.net.InetAddress r2 = r0.A03
            int r0 = r6.A01
            java.lang.Object r0 = r3.get(r0)
            X.2mm r0 = (X.C59722mm) r0
            java.lang.Short r0 = r0.A02
            short r1 = r0.shortValue()
            int r0 = r6.A01
            java.lang.Object r0 = r3.get(r0)
            X.2mm r0 = (X.C59722mm) r0
            boolean r0 = r0.A05
            X.2q6 r5 = new X.2q6
            r5.<init>(r4, r2, r1, r0)
            return r5
        L_0x00d9:
            r0 = 0
            X.C17960vV.A07(r0)
            X.2cU r0 = new X.2cU
            r0.<init>(r1, r11)
            java.lang.String r1 = "getAddress"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x00ea:
            java.lang.String r0 = "Must call moveToNext first"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00f1:
            r8 = 5222(0x1466, float:7.318E-42)
            java.util.Random r0 = r6.A02
            boolean r0 = r0.nextBoolean()
            if (r0 == 0) goto L_0x00fd
            r8 = 443(0x1bb, float:6.21E-43)
        L_0x00fd:
            X.0ve r4 = r6.A06
            r0 = 8754(0x2232, float:1.2267E-41)
            X.0vf r3 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r3, r4, r0)
            long r9 = (long) r0
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0110
            r9 = 8000(0x1f40, double:3.9525E-320)
        L_0x0110:
            r12 = r11
            X.2q6 r5 = r6.A00(r7, r8, r9, r11, r12)
            r0 = 8753(0x2231, float:1.2266E-41)
            int r0 = X.C18020vd.A00(r3, r4, r0)
            if (r0 >= 0) goto L_0x011f
            r0 = 15000(0x3a98, float:2.102E-41)
        L_0x011f:
            r5.A00 = r0
            return r5
        L_0x0122:
            r15 = 0
            r17 = 0
            goto L_0x0147
        L_0x0127:
            r4 = 5222(0x1466, float:7.318E-42)
            java.util.Random r0 = r6.A02
            boolean r0 = r0.nextBoolean()
            if (r0 == 0) goto L_0x0133
            r4 = 443(0x1bb, float:6.21E-43)
        L_0x0133:
            r8 = 0
            r2 = 0
            goto L_0x0175
        L_0x0137:
            java.lang.String[] r3 = A0B
            java.util.Random r1 = r6.A02
            r0 = 16
            int r0 = r1.nextInt(r0)
            r13 = r3[r0]
            r15 = 0
            r17 = 1
        L_0x0147:
            r12 = r6
            r14 = r8
            r18 = r11
            X.2q6 r5 = r12.A00(r13, r14, r15, r17, r18)
            goto L_0x0157
        L_0x0150:
            r9 = 0
            r12 = r11
            X.2q6 r5 = r6.A00(r7, r8, r9, r11, r12)
        L_0x0157:
            r5.A02 = r2
            return r5
        L_0x015a:
            r4 = 5222(0x1466, float:7.318E-42)
            java.util.Random r3 = r6.A02
            boolean r0 = r3.nextBoolean()
            if (r0 == 0) goto L_0x0166
            r4 = 443(0x1bb, float:6.21E-43)
        L_0x0166:
            java.lang.String[] r1 = A0B
            r0 = 16
            int r0 = r3.nextInt(r0)
            r13 = r1[r0]
            if (r4 != r5) goto L_0x0173
            r11 = 1
        L_0x0173:
            r8 = 0
        L_0x0175:
            r5 = r6
            r6 = r13
            r7 = r4
            r10 = r2
            X.2q6 r5 = r5.A00(r6, r7, r8, r10, r11)
            return r5
        L_0x017e:
            r1 = 5222(0x1466, float:7.318E-42)
            java.util.Random r0 = r6.A02
            boolean r0 = r0.nextBoolean()
            if (r0 == 0) goto L_0x018a
            r1 = 443(0x1bb, float:6.21E-43)
        L_0x018a:
            X.1Cp r0 = r6.A05
            X.2q6 r5 = X.C22631Cp.A01(r0, r7, r11, r11)
            r5.A01 = r1
            return r5
        L_0x0193:
            r8 = 5222(0x1466, float:7.318E-42)
            java.util.Random r0 = r6.A02
            boolean r0 = r0.nextBoolean()
            if (r0 == 0) goto L_0x019f
            r8 = 443(0x1bb, float:6.21E-43)
        L_0x019f:
            r9 = 0
            r12 = r11
            X.2q6 r5 = r6.A00(r7, r8, r9, r11, r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63602tO.A03():X.2q6");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (android.text.TextUtils.isEmpty(r8.A08) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r8.A00 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (android.text.TextUtils.isEmpty(r8.A08) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A06, 8752) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r8.A00 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r1 >= r8.A09.size()) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        r8.A00 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        r8.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r8.A00 == 16) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05() {
        /*
            r8 = this;
            int r0 = r8.A00
            r2 = 3
            r7 = 9
            r6 = 0
            r5 = 15
            r4 = 5
            r3 = 16
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x008b;
                case 2: goto L_0x0036;
                case 3: goto L_0x005e;
                case 4: goto L_0x004c;
                case 5: goto L_0x0060;
                case 6: goto L_0x0080;
                case 7: goto L_0x0083;
                case 8: goto L_0x006f;
                case 9: goto L_0x0086;
                case 10: goto L_0x0089;
                case 11: goto L_0x008b;
                case 12: goto L_0x008b;
                case 13: goto L_0x008e;
                case 14: goto L_0x0091;
                case 15: goto L_0x005b;
                default: goto L_0x000e;
            }
        L_0x000e:
            int r0 = r8.A00
            if (r0 == r3) goto L_0x0013
            r6 = 1
        L_0x0013:
            return r6
        L_0x0014:
            X.4Yf r0 = r8.A07
            if (r0 == 0) goto L_0x0021
            boolean r0 = X.AnonymousClass4HS.A00(r0)
            if (r0 != 0) goto L_0x0021
            r0 = 12
            goto L_0x0092
        L_0x0021:
            java.util.List r0 = r8.A0A
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002b
            r0 = 2
            goto L_0x0092
        L_0x002b:
            java.lang.String r0 = r8.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x004c
        L_0x0033:
            r8.A00 = r2
            goto L_0x000e
        L_0x0036:
            int r0 = r8.A01
            int r1 = r0 + 1
            r8.A01 = r1
            java.util.List r0 = r8.A0A
            int r0 = r0.size()
            if (r1 < r0) goto L_0x000e
            java.lang.String r0 = r8.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0033
        L_0x004c:
            X.0ve r2 = r8.A06
            r1 = 8752(0x2230, float:1.2264E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x005b
            r8.A00 = r5
            goto L_0x000e
        L_0x005b:
            r8.A00 = r4
            goto L_0x000e
        L_0x005e:
            r0 = 4
            goto L_0x0092
        L_0x0060:
            java.util.List r0 = r8.A09
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007d
            r0 = 8
            r8.A00 = r0
            r8.A01 = r6
            goto L_0x000e
        L_0x006f:
            int r0 = r8.A01
            int r1 = r0 + 1
            r8.A01 = r1
            java.util.List r0 = r8.A09
            int r0 = r0.size()
            if (r1 < r0) goto L_0x000e
        L_0x007d:
            r8.A00 = r7
            goto L_0x000e
        L_0x0080:
            r0 = 10
            goto L_0x0092
        L_0x0083:
            r0 = 11
            goto L_0x0092
        L_0x0086:
            r0 = 13
            goto L_0x0092
        L_0x0089:
            r0 = 7
            goto L_0x0092
        L_0x008b:
            r8.A00 = r3
            goto L_0x000e
        L_0x008e:
            r0 = 14
            goto L_0x0092
        L_0x0091:
            r0 = 6
        L_0x0092:
            r8.A00 = r0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63602tO.A05():boolean");
    }

    public C63602tO(C22631Cp r4, C18030ve r5, C88074Yf r6, String str, List list, Random random) {
        List list2;
        this.A05 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = str;
        this.A02 = random;
        this.A0A = AnonymousClass000.A13();
        this.A09 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C59722mm r1 = (C59722mm) it.next();
            if (r1.A04) {
                list2 = this.A0A;
            } else {
                list2 = this.A09;
            }
            list2.add(r1);
        }
        boolean nextBoolean = random.nextBoolean();
        int i = 443;
        this.A03 = nextBoolean ? 443 : 5222;
        this.A04 = nextBoolean ? 5222 : i;
    }

    public static Integer A01(int i) {
        int i2;
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                i2 = 2;
                break;
            case 2:
            case 3:
            case 4:
                i2 = 1;
                break;
            case 6:
            case 10:
                i2 = 5;
                break;
            case 7:
            case 11:
                i2 = 6;
                break;
            case 8:
                i2 = 3;
                break;
            case 13:
            case 14:
                i2 = 4;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public int A02() {
        return this.A00;
    }

    public void A04(int i) {
        this.A00 = i;
    }
}
