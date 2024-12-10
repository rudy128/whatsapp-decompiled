package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.CxE  reason: case insensitive filesystem */
public abstract class C26301CxE {
    public static final CBJ A00;
    public static final CBJ A01;
    public static final CBJ A02 = new Object();
    public static final Class A03;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.CBJ] */
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
            X.CBJ r0 = (X.CBJ) r0     // Catch:{ all -> 0x001a }
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
            X.CBJ r0 = (X.CBJ) r0     // Catch:{ all -> 0x003b }
            r5 = r0
        L_0x003b:
            A01 = r5
            X.CBJ r0 = new X.CBJ
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26301CxE.<clinit>():void");
    }

    public static void A0C(E9H e9h, List list, int i) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (list instanceof EE3) {
                EE3 ee3 = (EE3) list;
                while (i2 < list.size()) {
                    Object CTH = ee3.CTH(i2);
                    boolean z = CTH instanceof String;
                    C23450BhF bhF = dkf.A00;
                    if (z) {
                        bhF.A08(i, (String) CTH);
                    } else {
                        bhF.A0B((DSO) CTH, i);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                dkf.A00.A08(i, C17880vN.A0w(list, i2));
                i2++;
            }
        }
    }

    public static void A0D(E9H e9h, List list, int i) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            for (int i2 = 0; i2 < list.size(); i2++) {
                dkf.A00.A0B((DSO) list.get(i2), i);
            }
        }
    }

    public static void A0E(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A0A(BEA.A0I(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                long A0I = BEA.A0I(list, i2);
                bhF2.A05((i << 3) | 1);
                bhF2.A0A(A0I);
                i2++;
            }
        }
    }

    public static void A0F(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A06(Float.floatToRawIntBits(BE9.A05(list, i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                int floatToRawIntBits = Float.floatToRawIntBits(BE9.A05(list, i2));
                bhF2.A05((i << 3) | 5);
                bhF2.A06(floatToRawIntBits);
                i2++;
            }
        }
    }

    public static void A0G(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C23450BhF.A02(BE9.A0M(list, i4));
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A09(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                long A0M = BE9.A0M(list, i2);
                bhF2.A05(i << 3);
                bhF2.A09(A0M);
                i2++;
            }
        }
    }

    public static void A0H(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C23450BhF.A02(BE9.A0M(list, i4));
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A09(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                long A0M = BE9.A0M(list, i2);
                bhF2.A05(i << 3);
                bhF2.A09(A0M);
                i2++;
            }
        }
    }

    public static void A0I(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C23450BhF.A02(BEB.A0D(list, i4));
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A09(BEB.A0D(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                long A0D = BEB.A0D(list, i2);
                bhF2.A05(i << 3);
                bhF2.A09(A0D);
                i2++;
            }
        }
    }

    public static void A0J(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A0A(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                long A0M = BE9.A0M(list, i2);
                bhF2.A05((i << 3) | 1);
                bhF2.A0A(A0M);
                i2++;
            }
        }
    }

    public static void A0K(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A0A(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                long A0M = BE9.A0M(list, i2);
                bhF2.A05((i << 3) | 1);
                bhF2.A0A(A0M);
                i2++;
            }
        }
    }

    public static void A0L(E9H e9h, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i3 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A0n = AnonymousClass001.A0n(list, i5);
                    if (A0n >= 0) {
                        boolean z2 = C23450BhF.A05;
                        i2 = BEB.A02(A0n);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                bhF.A05(i4);
                while (i3 < list.size()) {
                    int A0n2 = AnonymousClass001.A0n(list, i3);
                    if (A0n2 >= 0) {
                        bhF.A05(A0n2);
                    } else {
                        bhF.A09((long) A0n2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                dkf.A00.A07(i, AnonymousClass001.A0n(list, i3));
                i3++;
            }
        }
    }

    public static void A0M(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A0n = AnonymousClass001.A0n(list, i4);
                    boolean z2 = C23450BhF.A05;
                    i3 += BEB.A02(A0n);
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A05(AnonymousClass001.A0n(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                int A0n2 = AnonymousClass001.A0n(list, i2);
                bhF2.A05(i << 3);
                bhF2.A05(A0n2);
                i2++;
            }
        }
    }

    public static void A0N(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 = C25876Cnk.A05(AnonymousClass001.A0n(list, i4), i3);
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    int A0n = AnonymousClass001.A0n(list, i2);
                    bhF.A05((A0n >> 31) ^ (A0n << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                int A0n2 = AnonymousClass001.A0n(list, i2);
                bhF2.A05(i << 3);
                bhF2.A05((A0n2 >> 31) ^ (A0n2 << 1));
                i2++;
            }
        }
    }

    public static void A0O(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A06(AnonymousClass001.A0n(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                int A0n = AnonymousClass001.A0n(list, i2);
                bhF2.A05((i << 3) | 5);
                bhF2.A06(A0n);
                i2++;
            }
        }
    }

    public static void A0P(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A06(AnonymousClass001.A0n(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                int A0n = AnonymousClass001.A0n(list, i2);
                bhF2.A05((i << 3) | 5);
                bhF2.A06(A0n);
                i2++;
            }
        }
    }

    public static void A0Q(E9H e9h, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i3 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A0n = AnonymousClass001.A0n(list, i5);
                    if (A0n >= 0) {
                        boolean z2 = C23450BhF.A05;
                        i2 = BEB.A02(A0n);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                bhF.A05(i4);
                while (i3 < list.size()) {
                    int A0n2 = AnonymousClass001.A0n(list, i3);
                    if (A0n2 >= 0) {
                        bhF.A05(A0n2);
                    } else {
                        bhF.A09((long) A0n2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                dkf.A00.A07(i, AnonymousClass001.A0n(list, i3));
                i3++;
            }
        }
    }

    public static void A0R(E9H e9h, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            DKF dkf = (DKF) e9h;
            int i2 = 0;
            if (z) {
                C23450BhF bhF = dkf.A00;
                C25876Cnk.A06(bhF, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                bhF.A05(i3);
                while (i2 < list.size()) {
                    bhF.A04(AnonymousClass000.A1Y(list.get(i2)) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C23450BhF bhF2 = dkf.A00;
                boolean A1Y = AnonymousClass000.A1Y(list.get(i2));
                bhF2.A05(i << 3);
                bhF2.A04(A1Y ? (byte) 1 : 0);
                i2++;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, X.Cmu] */
    public static void A0S(Object obj, Object obj2) {
        C23484Bho bho = (C23484Bho) obj;
        C25840Cmu cmu = bho.zzb;
        C25840Cmu cmu2 = ((C23484Bho) obj2).zzb;
        C25840Cmu cmu3 = cmu;
        if (!cmu2.equals(C25840Cmu.A05)) {
            int i = cmu.A00 + cmu2.A00;
            int[] copyOf = Arrays.copyOf(cmu.A03, i);
            System.arraycopy(cmu2.A03, 0, copyOf, cmu.A00, cmu2.A00);
            Object[] copyOf2 = Arrays.copyOf(cmu.A04, i);
            System.arraycopy(cmu2.A04, 0, copyOf2, cmu.A00, cmu2.A00);
            ? obj3 = new Object();
            obj3.A01 = -1;
            obj3.A00 = i;
            obj3.A03 = copyOf;
            obj3.A04 = copyOf2;
            obj3.A02 = true;
            cmu3 = obj3;
        }
        bho.zzb = cmu3;
    }

    public static int A00(EAD ead, List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A04 = C25876Cnk.A04(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int A06 = DK6.A06(ead, (C28663EDa) list.get(i2));
            boolean z = C23450BhF.A05;
            A04 += BEB.A02(A06) + A06;
        }
        return A04;
    }

    public static int A01(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C23450BhF.A02(BE9.A0M(list, i2));
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
            i += C23450BhF.A02(BE9.A0M(list, i2));
        }
        return i;
    }

    public static int A03(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C23450BhF.A02(BEB.A0D(list, i2));
        }
        return i;
    }

    public static int A04(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C23447BhC) {
            C23447BhC bhC = (C23447BhC) list;
            i = 0;
            while (i4 < size) {
                C23447BhC.A00(bhC, i4);
                int i5 = bhC.A01[i4];
                boolean z = C23450BhF.A05;
                if (i5 >= 0) {
                    i3 = BEB.A02(i5);
                } else {
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            int i6 = 0;
            while (i4 < size) {
                int A0n = AnonymousClass001.A0n(list, i4);
                boolean z2 = C23450BhF.A05;
                if (A0n >= 0) {
                    i2 = BEB.A02(A0n);
                } else {
                    i2 = 10;
                }
                i6 = i + i2;
                i4++;
            }
        }
        return i;
    }

    public static int A05(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C23447BhC) {
            C23447BhC bhC = (C23447BhC) list;
            i = 0;
            while (i4 < size) {
                C23447BhC.A00(bhC, i4);
                int i5 = bhC.A01[i4];
                boolean z = C23450BhF.A05;
                if (i5 >= 0) {
                    i3 = BEB.A02(i5);
                } else {
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            int i6 = 0;
            while (i4 < size) {
                int A0n = AnonymousClass001.A0n(list, i4);
                boolean z2 = C23450BhF.A05;
                if (A0n >= 0) {
                    i2 = BEB.A02(A0n);
                } else {
                    i2 = 10;
                }
                i6 = i + i2;
                i4++;
            }
        }
        return i;
    }

    public static int A06(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C23447BhC) {
            C23447BhC bhC = (C23447BhC) list;
            i = 0;
            while (i2 < size) {
                C23447BhC.A00(bhC, i2);
                int i3 = bhC.A01[i2];
                boolean z = C23450BhF.A05;
                i += BEB.A02(i3);
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int A0n = AnonymousClass001.A0n(list, i2);
                boolean z2 = C23450BhF.A05;
                i4 = i + BEB.A02(A0n);
                i2++;
            }
        }
        return i;
    }

    public static int A07(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C23447BhC) {
            C23447BhC bhC = (C23447BhC) list;
            i = 0;
            while (i2 < size) {
                C23447BhC.A00(bhC, i2);
                i = C25876Cnk.A05(bhC.A01[i2], i);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = C25876Cnk.A05(AnonymousClass001.A0n(list, i2), i);
                i2++;
            }
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A08(java.util.List r5, int r6) {
        /*
            int r3 = r5.size()
            r2 = 0
            if (r3 != 0) goto L_0x0008
            return r2
        L_0x0008:
            int r4 = X.C25876Cnk.A04(r6)
            int r4 = r4 * r3
            boolean r0 = r5 instanceof X.EE3
            if (r0 == 0) goto L_0x003d
            X.EE3 r5 = (X.EE3) r5
        L_0x0013:
            if (r2 >= r3) goto L_0x0067
            java.lang.Object r1 = r5.CTH(r2)
            boolean r0 = r1 instanceof X.DSO
            if (r0 == 0) goto L_0x002e
            X.DSO r1 = (X.DSO) r1
            int r1 = r1.A01()
        L_0x0023:
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r4 = r4 + r0
            int r2 = r2 + 1
            goto L_0x0013
        L_0x002e:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = X.C25406Cf8.A00(r1)     // Catch:{ C2e -> 0x0035 }
            goto L_0x0023
        L_0x0035:
            java.nio.charset.Charset r0 = X.C25462CgF.A00
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
            goto L_0x0023
        L_0x003d:
            if (r2 >= r3) goto L_0x0067
            java.lang.Object r1 = r5.get(r2)
            boolean r0 = r1 instanceof X.DSO
            if (r0 == 0) goto L_0x0058
            X.DSO r1 = (X.DSO) r1
            int r1 = r1.A01()
        L_0x004d:
            boolean r0 = X.C23450BhF.A05
            int r0 = X.BEB.A02(r1)
            int r0 = r0 + r1
            int r4 = r4 + r0
            int r2 = r2 + 1
            goto L_0x003d
        L_0x0058:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = X.C25406Cf8.A00(r1)     // Catch:{ C2e -> 0x005f }
            goto L_0x004d
        L_0x005f:
            java.nio.charset.Charset r0 = X.C25462CgF.A00
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
            goto L_0x004d
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26301CxE.A08(java.util.List, int):int");
    }

    public static int A09(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A04 = size * C25876Cnk.A04(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int A012 = ((DSO) list.get(i2)).A01();
            boolean z = C23450BhF.A05;
            A04 += BEB.A02(A012) + A012;
        }
        return A04;
    }

    public static int A0A(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C25876Cnk.A04(i) + 4);
    }

    public static int A0B(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C25876Cnk.A04(i) + 8);
    }
}
