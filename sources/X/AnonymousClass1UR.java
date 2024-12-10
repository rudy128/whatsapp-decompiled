package X;

import java.util.HashMap;

/* renamed from: X.1UR  reason: invalid class name */
public class AnonymousClass1UR {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final HashMap A03;

    public void A02(AnonymousClass2HO r10) {
        r10.A04 = true;
        r10.A00 = true;
        A00(this, r10);
        AnonymousClass18K r2 = this.A02;
        C18180vt r1 = r10.samplingRate;
        r2.CC6(r10, new C18180vt(r1.A02 * 10, r1.A00 * 10, r1.A01 * 10, r1.A03 * 10, r1.A05));
    }

    public AnonymousClass1UR(AnonymousClass11P r2, C18030ve r3, AnonymousClass18K r4) {
        HashMap hashMap = new HashMap();
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = hashMap;
    }

    public static void A00(AnonymousClass1UR r8, AnonymousClass2HO r9) {
        HashMap hashMap = r8.A03;
        Long l = (Long) hashMap.get(r9);
        if (l != null) {
            long A012 = AnonymousClass11P.A01(r8.A00);
            r9.A0D = Long.valueOf(A012 - l.longValue());
            C18030ve r2 = r8.A01;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 9984) || C18020vd.A05(r1, r2, 5868)) {
                r9.A0J = l;
                r9.A0A = Long.valueOf(A012);
            }
            hashMap.remove(r9);
            return;
        }
        r9.A0D = -1L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C53372cQ r6, X.AnonymousClass2HO r7) {
        /*
            X.2n4 r4 = r6.A00
            X.A00 r0 = r4.A02
            r3 = 0
            if (r0 == 0) goto L_0x00ae
            r1 = 1
            int r1 = r1 << r3
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x00ad
            r3 = r3 | r1
            r2 = r3
            r3 = r1
        L_0x0010:
            r5 = 1
            X.A00 r0 = r4.A09
            if (r0 == 0) goto L_0x001d
            int r1 = r5 << r5
            r3 = r3 | r1
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x001d
            r2 = r2 | r1
        L_0x001d:
            r1 = 2
            X.A00 r0 = r4.A0A
            if (r0 == 0) goto L_0x002a
            int r1 = r5 << r1
            r3 = r3 | r1
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x002a
            r2 = r2 | r1
        L_0x002a:
            r1 = 3
            X.A00 r0 = r4.A07
            if (r0 == 0) goto L_0x0037
            int r1 = r5 << r1
            r3 = r3 | r1
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0037
            r2 = r2 | r1
        L_0x0037:
            r1 = 4
            X.A00 r0 = r4.A01
            if (r0 == 0) goto L_0x0044
            int r1 = r5 << r1
            r3 = r3 | r1
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0044
            r2 = r2 | r1
        L_0x0044:
            r1 = 5
            X.A00 r0 = r4.A03
            if (r0 == 0) goto L_0x0051
            int r1 = r5 << r1
            r3 = r3 | r1
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0051
            r2 = r2 | r1
        L_0x0051:
            r1 = 6
            X.A00 r0 = r4.A06
            if (r0 == 0) goto L_0x005e
            int r1 = r5 << r1
            r3 = r3 | r1
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x005e
            r2 = r2 | r1
        L_0x005e:
            r1 = 7
            X.A00 r0 = r4.A04
            if (r0 == 0) goto L_0x006b
            int r1 = r5 << r1
            r3 = r3 | r1
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x006b
            r2 = r2 | r1
        L_0x006b:
            r1 = 8
            X.A00 r0 = r4.A05
            if (r0 == 0) goto L_0x0079
            int r1 = r5 << r1
            r3 = r3 | r1
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0079
            r2 = r2 | r1
        L_0x0079:
            r1 = 9
            X.A00 r0 = r4.A00
            if (r0 == 0) goto L_0x0087
            int r1 = r5 << r1
            r3 = r3 | r1
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0087
            r2 = r2 | r1
        L_0x0087:
            r1 = 10
            X.A00 r0 = r4.A0C
            if (r0 == 0) goto L_0x0094
            int r5 = r5 << r1
            r3 = r3 | r5
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0094
            r2 = r2 | r5
        L_0x0094:
            long r0 = (long) r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A0F = r0
            long r0 = (long) r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A0C = r0
            X.9i3[] r0 = r6.A01
            int r0 = r0.length
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A0I = r0
            return
        L_0x00ad:
            r3 = r1
        L_0x00ae:
            r2 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UR.A01(X.2cQ, X.2HO):void");
    }
}
