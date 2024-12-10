package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.CxA  reason: case insensitive filesystem */
public abstract class C26297CxA {
    public static final CB8 A00;
    public static final CB8 A01;
    public static final CB8 A02 = new Object();
    public static final Class A03;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.CB8] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[Catch:{ all -> 0x003b }] */
    static {
        /*
            java.lang.String r0 = "com.google.protobuf.GeneratedMessage"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0007 }
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            A03 = r0
            r5 = 0
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = X.BEB.A0Z(r0)     // Catch:{ all -> 0x001a }
            X.CB8 r0 = (X.CB8) r0     // Catch:{ all -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r0 = r5
        L_0x001b:
            A00 = r0
            r4 = 1
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x003b
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x003b }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003b }
            r2 = 0
            java.lang.reflect.Constructor r1 = X.BE6.A0w(r3, r0, r1, r2)     // Catch:{ all -> 0x003b }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x003b }
            X.AnonymousClass8BR.A1L(r0, r2, r4)     // Catch:{ all -> 0x003b }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x003b }
            X.CB8 r0 = (X.CB8) r0     // Catch:{ all -> 0x003b }
            r5 = r0
        L_0x003b:
            A01 = r5
            X.CB8 r0 = new X.CB8
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26297CxA.<clinit>():void");
    }

    public static void A08(EAC eac, E5P e5p, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            for (int i2 = 0; i2 < list.size(); i2++) {
                dJg.A00.A0C((EDY) list.get(i2), eac, i);
            }
        }
    }

    public static void A09(E5P e5p, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (list instanceof EE2) {
                EE2 ee2 = (EE2) list;
                while (i2 < list.size()) {
                    Object BXq = ee2.BXq(i2);
                    boolean z = BXq instanceof String;
                    C23301Bep bep = dJg.A00;
                    if (z) {
                        bep.A08(i, (String) BXq);
                    } else {
                        bep.A0B((DSP) BXq, i);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dJg.A00.A08(i, C17880vN.A0w(list, i2));
                i2++;
            }
        }
    }

    public static void A0A(E5P e5p, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            for (int i2 = 0; i2 < list.size(); i2++) {
                dJg.A00.A0B((DSP) list.get(i2), i);
            }
        }
    }

    public static void A0B(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A0A(BEA.A0I(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dJg.A00.A07(i, BEA.A0I(list, i2));
                i2++;
            }
        }
    }

    public static void A0C(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A04(Float.floatToRawIntBits(BE9.A05(list, i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dJg.A00.A06(i, Float.floatToRawIntBits(BE9.A05(list, i2)));
                i2++;
            }
        }
    }

    public static void A0D(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C23301Bep.A01(BE9.A0M(list, i4));
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A09(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C26164Ctd.A06(dJg.A00, i, BE9.A0M(list, i2));
                i2++;
            }
        }
    }

    public static void A0E(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C23301Bep.A01(BE9.A0M(list, i4));
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A09(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C26164Ctd.A06(dJg.A00, i, BE9.A0M(list, i2));
                i2++;
            }
        }
    }

    public static void A0F(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C23301Bep.A01(BEB.A0D(list, i4));
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A09(BEB.A0D(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C26164Ctd.A06(dJg.A00, i, BEB.A0D(list, i2));
                i2++;
            }
        }
    }

    public static void A0G(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A0A(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dJg.A00.A07(i, BE9.A0M(list, i2));
                i2++;
            }
        }
    }

    public static void A0H(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A0A(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dJg.A00.A07(i, BE9.A0M(list, i2));
                i2++;
            }
        }
    }

    public static void A0I(E5P e5p, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i3 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A0n = AnonymousClass001.A0n(list, i5);
                    if (A0n >= 0) {
                        boolean z2 = C23301Bep.A01;
                        i2 = BEB.A02(A0n);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                bep.A03(i4);
                while (i3 < list.size()) {
                    int A0n2 = AnonymousClass001.A0n(list, i3);
                    if (A0n2 >= 0) {
                        bep.A03(A0n2);
                    } else {
                        bep.A09((long) A0n2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                dJg.A00.A05(i, AnonymousClass001.A0n(list, i3));
                i3++;
            }
        }
    }

    public static void A0J(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A0n = AnonymousClass001.A0n(list, i4);
                    boolean z2 = C23301Bep.A01;
                    i3 += BEB.A02(A0n);
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A03(AnonymousClass001.A0n(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23301Bep bep2 = dJg.A00;
                int A0n2 = AnonymousClass001.A0n(list, i2);
                bep2.A03(i << 3);
                bep2.A03(A0n2);
                i2++;
            }
        }
    }

    public static void A0K(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A0n = AnonymousClass001.A0n(list, i4);
                    int i5 = (A0n >> 31) ^ (A0n << 1);
                    boolean z2 = C23301Bep.A01;
                    i3 += BEB.A02(i5);
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    int A0n2 = AnonymousClass001.A0n(list, i2);
                    bep.A03((A0n2 >> 31) ^ (A0n2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C26164Ctd.A05(dJg.A00, AnonymousClass001.A0n(list, i2), i);
                i2++;
            }
        }
    }

    public static void A0L(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A04(AnonymousClass001.A0n(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dJg.A00.A06(i, AnonymousClass001.A0n(list, i2));
                i2++;
            }
        }
    }

    public static void A0M(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A04(AnonymousClass001.A0n(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dJg.A00.A06(i, AnonymousClass001.A0n(list, i2));
                i2++;
            }
        }
    }

    public static void A0N(E5P e5p, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i3 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A0n = AnonymousClass001.A0n(list, i5);
                    if (A0n >= 0) {
                        boolean z2 = C23301Bep.A01;
                        i2 = BEB.A02(A0n);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                bep.A03(i4);
                while (i3 < list.size()) {
                    int A0n2 = AnonymousClass001.A0n(list, i3);
                    if (A0n2 >= 0) {
                        bep.A03(A0n2);
                    } else {
                        bep.A09((long) A0n2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                dJg.A00.A05(i, AnonymousClass001.A0n(list, i3));
                i3++;
            }
        }
    }

    public static void A0O(E5P e5p, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C26925DJg dJg = (C26925DJg) e5p;
            int i2 = 0;
            if (z) {
                C23301Bep bep = dJg.A00;
                C26164Ctd.A04(bep, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                bep.A03(i3);
                while (i2 < list.size()) {
                    bep.A02(AnonymousClass000.A1Y(list.get(i2)) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23301Bep bep2 = dJg.A00;
                boolean A1Y = AnonymousClass000.A1Y(list.get(i2));
                bep2.A03(i << 3);
                bep2.A02(A1Y ? (byte) 1 : 0);
                i2++;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, X.Cmt] */
    public static void A0P(Object obj, Object obj2) {
        C23293Beh beh = (C23293Beh) obj;
        C25839Cmt cmt = beh.zzjp;
        C25839Cmt cmt2 = ((C23293Beh) obj2).zzjp;
        C25839Cmt cmt3 = cmt;
        if (!cmt2.equals(C25839Cmt.A05)) {
            int i = cmt.A00 + cmt2.A00;
            int[] copyOf = Arrays.copyOf(cmt.A03, i);
            System.arraycopy(cmt2.A03, 0, copyOf, cmt.A00, cmt2.A00);
            Object[] copyOf2 = Arrays.copyOf(cmt.A04, i);
            System.arraycopy(cmt2.A04, 0, copyOf2, cmt.A00, cmt2.A00);
            ? obj3 = new Object();
            obj3.A01 = -1;
            obj3.A00 = i;
            obj3.A03 = copyOf;
            obj3.A04 = copyOf2;
            obj3.A02 = true;
            cmt3 = obj3;
        }
        beh.zzjp = cmt3;
    }

    public static int A00(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C23301Bep.A01(BE9.A0M(list, i2));
        }
        return i;
    }

    public static int A01(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C23301Bep.A01(BE9.A0M(list, i2));
        }
        return i;
    }

    public static int A02(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C23301Bep.A01(BEB.A0D(list, i2));
        }
        return i;
    }

    public static int A03(List list) {
        int i;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int A0n = AnonymousClass001.A0n(list, i3);
            boolean z = C23301Bep.A01;
            if (A0n >= 0) {
                i = BEB.A02(A0n);
            } else {
                i = 10;
            }
            i2 += i;
        }
        return i2;
    }

    public static int A04(List list) {
        int i;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int A0n = AnonymousClass001.A0n(list, i3);
            boolean z = C23301Bep.A01;
            if (A0n >= 0) {
                i = BEB.A02(A0n);
            } else {
                i = 10;
            }
            i2 += i;
        }
        return i2;
    }

    public static int A05(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int A0n = AnonymousClass001.A0n(list, i2);
            boolean z = C23301Bep.A01;
            i += BEB.A02(A0n);
        }
        return i;
    }

    public static int A06(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int A0n = AnonymousClass001.A0n(list, i2);
            int i3 = (A0n >> 31) ^ (A0n << 1);
            boolean z = C23301Bep.A01;
            i += BEB.A02(i3);
        }
        return i;
    }

    public static int A07(List list, int i) {
        int length;
        int length2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int A022 = C26164Ctd.A02(i) * size;
        if (list instanceof EE2) {
            EE2 ee2 = (EE2) list;
            while (i2 < size) {
                Object BXq = ee2.BXq(i2);
                if (BXq instanceof DSP) {
                    length2 = ((DSP) BXq).A02();
                } else {
                    String str = (String) BXq;
                    try {
                        length2 = C25908CoM.A00(str);
                    } catch (C24406C2d unused) {
                        length2 = str.getBytes(C25461CgE.A00).length;
                    }
                }
                A022 = C26164Ctd.A03(length2, A022);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof DSP) {
                    length = ((DSP) obj).A02();
                } else {
                    String str2 = (String) obj;
                    try {
                        length = C25908CoM.A00(str2);
                    } catch (C24406C2d unused2) {
                        length = str2.getBytes(C25461CgE.A00).length;
                    }
                }
                A022 = C26164Ctd.A03(length, A022);
                i2++;
            }
        }
        return A022;
    }
}
