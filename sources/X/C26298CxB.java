package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.CxB  reason: case insensitive filesystem */
public abstract class C26298CxB {
    public static final C25096CXo A00;
    public static final C25096CXo A01;
    public static final C25096CXo A02 = new Object();
    public static final Class A03;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.CXo] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[Catch:{ all -> 0x003b }] */
    static {
        /*
            java.lang.String r0 = "com.google.protobuf.GeneratedMessageV3"
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
            X.CXo r0 = (X.C25096CXo) r0     // Catch:{ all -> 0x001a }
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
            X.CXo r0 = (X.C25096CXo) r0     // Catch:{ all -> 0x003b }
            r5 = r0
        L_0x003b:
            A01 = r5
            X.CXo r0 = new X.CXo
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26298CxB.<clinit>():void");
    }

    public static Object A0A(E69 e69, C25096CXo cXo, Object obj, Object obj2, List list, int i) {
        if (e69 != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    Number number = (Number) list.get(i3);
                    int intValue = number.intValue();
                    if (e69.Bf4(intValue)) {
                        if (i3 != i2) {
                            list.set(i2, number);
                        }
                        i2++;
                    } else {
                        if (obj2 == null) {
                            obj2 = cXo.A00(obj);
                        }
                        ((C26042Cr6) obj2).A02(i << 3, Long.valueOf((long) intValue));
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                    return obj2;
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int A0H = C72453Mb.A0H(it);
                    if (!e69.Bf4(A0H)) {
                        if (obj2 == null) {
                            obj2 = cXo.A00(obj);
                        }
                        ((C26042Cr6) obj2).A02(i << 3, Long.valueOf((long) A0H));
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    public static void A0B(CVN cvn, List list, int i) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                codedOutputStream.A0H((DSQ) list.get(i2));
            }
        }
    }

    public static void A0C(CVN cvn, List list, int i) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof EE5) {
                EE5 ee5 = (EE5) list;
                while (i2 < list.size()) {
                    Object BXq = ee5.BXq(i2);
                    boolean z = BXq instanceof String;
                    CodedOutputStream codedOutputStream = cvn.A00;
                    if (z) {
                        C25878Cnp.A07(codedOutputStream, i);
                        codedOutputStream.A0K((String) BXq);
                    } else {
                        C25878Cnp.A07(codedOutputStream, i);
                        codedOutputStream.A0H((DSQ) BXq);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = cvn.A00;
                String A0w = C17880vN.A0w(list, i2);
                C25878Cnp.A07(codedOutputStream2, i);
                codedOutputStream2.A0K(A0w);
                i2++;
            }
        }
    }

    public static void A0D(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(AnonymousClass000.A1Y(list.get(i2)) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A0E(i, AnonymousClass000.A1Y(list.get(i2)));
                i2++;
            }
        }
    }

    public static void A0E(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(BEA.A0I(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A0C(i, BEA.A0I(list, i2));
                i2++;
            }
        }
    }

    public static void A0F(CVN cvn, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A0n = AnonymousClass001.A0n(list, i5);
                    if (A0n >= 0) {
                        boolean z2 = CodedOutputStream.A01;
                        i2 = BEB.A02(A0n);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                codedOutputStream.A08(i4);
                while (i3 < list.size()) {
                    int A0n2 = AnonymousClass001.A0n(list, i3);
                    if (A0n2 >= 0) {
                        codedOutputStream.A08(A0n2);
                    } else {
                        codedOutputStream.A0G((long) A0n2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cvn.A00.A0A(i, AnonymousClass001.A0n(list, i3));
                i3++;
            }
        }
    }

    public static void A0G(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(AnonymousClass001.A0n(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A09(i, AnonymousClass001.A0n(list, i2));
                i2++;
            }
        }
    }

    public static void A0H(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A0C(i, BE9.A0M(list, i2));
                i2++;
            }
        }
    }

    public static void A0I(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(Float.floatToRawIntBits(BE9.A05(list, i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A09(i, Float.floatToRawIntBits(BE9.A05(list, i2)));
                i2++;
            }
        }
    }

    public static void A0J(CVN cvn, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A0n = AnonymousClass001.A0n(list, i5);
                    if (A0n >= 0) {
                        boolean z2 = CodedOutputStream.A01;
                        i2 = BEB.A02(A0n);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                codedOutputStream.A08(i4);
                while (i3 < list.size()) {
                    int A0n2 = AnonymousClass001.A0n(list, i3);
                    if (A0n2 >= 0) {
                        codedOutputStream.A08(A0n2);
                    } else {
                        codedOutputStream.A0G((long) A0n2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cvn.A00.A0A(i, AnonymousClass001.A0n(list, i3));
                i3++;
            }
        }
    }

    public static void A0K(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A03(BE9.A0M(list, i4));
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0G(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A0D(i, BE9.A0M(list, i2));
                i2++;
            }
        }
    }

    public static void A0L(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(AnonymousClass001.A0n(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A09(i, AnonymousClass001.A0n(list, i2));
                i2++;
            }
        }
    }

    public static void A0M(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A0C(i, BE9.A0M(list, i2));
                i2++;
            }
        }
    }

    public static void A0N(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C25878Cnp.A06(AnonymousClass001.A0n(list, i4));
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    int A0n = AnonymousClass001.A0n(list, i2);
                    codedOutputStream.A08((A0n >> 31) ^ (A0n << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = cvn.A00;
                int A0n2 = AnonymousClass001.A0n(list, i2);
                codedOutputStream2.A0B(i, (A0n2 >> 31) ^ (A0n2 << 1));
                i2++;
            }
        }
    }

    public static void A0O(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A03(BEB.A0D(list, i4));
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0G(BEB.A0D(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A0D(i, BEB.A0D(list, i2));
                i2++;
            }
        }
    }

    public static void A0P(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A0n = AnonymousClass001.A0n(list, i4);
                    boolean z2 = CodedOutputStream.A01;
                    i3 += BEB.A02(A0n);
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A08(AnonymousClass001.A0n(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A0B(i, AnonymousClass001.A0n(list, i2));
                i2++;
            }
        }
    }

    public static void A0Q(CVN cvn, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = cvn.A00;
                C25878Cnp.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A03(BE9.A0M(list, i4));
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0G(BE9.A0M(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                cvn.A00.A0D(i, BE9.A0M(list, i2));
                i2++;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, X.Cr6] */
    public static void A0R(Object obj, Object obj2) {
        C23577Bm6 bm6 = (C23577Bm6) obj;
        C26042Cr6 cr6 = bm6.unknownFields;
        C26042Cr6 cr62 = ((C23577Bm6) obj2).unknownFields;
        C26042Cr6 cr63 = C26042Cr6.A04;
        C26042Cr6 cr64 = cr6;
        if (!cr63.equals(cr62)) {
            if (cr63.equals(cr6)) {
                int i = cr6.count + cr62.count;
                int[] copyOf = Arrays.copyOf(cr6.A02, i);
                System.arraycopy(cr62.A02, 0, copyOf, cr6.count, cr62.count);
                Object[] copyOf2 = Arrays.copyOf(cr6.A03, i);
                System.arraycopy(cr62.A03, 0, copyOf2, cr6.count, cr62.count);
                ? obj3 = new Object();
                obj3.A00 = -1;
                obj3.count = i;
                obj3.A02 = copyOf;
                obj3.A03 = copyOf2;
                obj3.A01 = true;
                cr64 = obj3;
            } else {
                cr64 = cr6;
                if (!cr62.equals(cr63)) {
                    if (cr6.A01) {
                        int i2 = cr6.count + cr62.count;
                        C26042Cr6.A00(cr6, i2);
                        System.arraycopy(cr62.A02, 0, cr6.A02, cr6.count, cr62.count);
                        System.arraycopy(cr62.A03, 0, cr6.A03, cr6.count, cr62.count);
                        cr6.count = i2;
                        cr64 = cr6;
                    } else {
                        throw C17880vN.A0y();
                    }
                }
            }
        }
        bm6.unknownFields = cr64;
    }

    public static int A00(EAO eao, List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A05 = C25878Cnp.A05(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int A0J = ((DNC) ((C28668EDk) list.get(i2))).A0J(eao);
            boolean z = CodedOutputStream.A01;
            A05 += BEB.A02(A0J) + A0J;
        }
        return A05;
    }

    public static int A01(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Bm7) {
            Bm7 bm7 = (Bm7) list;
            i = 0;
            while (i4 < size) {
                Bm7.A00(bm7, i4);
                int i5 = bm7.A01[i4];
                boolean z = CodedOutputStream.A01;
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
                boolean z2 = CodedOutputStream.A01;
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

    public static int A02(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Bm7) {
            Bm7 bm7 = (Bm7) list;
            i = 0;
            while (i4 < size) {
                Bm7.A00(bm7, i4);
                int i5 = bm7.A01[i4];
                boolean z = CodedOutputStream.A01;
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
                boolean z2 = CodedOutputStream.A01;
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

    public static int A03(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.A03(BE9.A0M(list, i2));
        }
        return i;
    }

    public static int A04(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Bm7) {
            Bm7 bm7 = (Bm7) list;
            i = 0;
            while (i2 < size) {
                Bm7.A00(bm7, i2);
                i += C25878Cnp.A06(bm7.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C25878Cnp.A06(AnonymousClass001.A0n(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A05(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.A03(BEB.A0D(list, i2));
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
        if (list instanceof Bm7) {
            Bm7 bm7 = (Bm7) list;
            i = 0;
            while (i2 < size) {
                Bm7.A00(bm7, i2);
                int i3 = bm7.A01[i2];
                boolean z = CodedOutputStream.A01;
                i += BEB.A02(i3);
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int A0n = AnonymousClass001.A0n(list, i2);
                boolean z2 = CodedOutputStream.A01;
                i4 = i + BEB.A02(A0n);
                i2++;
            }
        }
        return i;
    }

    public static int A07(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.A03(BE9.A0M(list, i2));
        }
        return i;
    }

    public static int A08(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A05 = size * C25878Cnp.A05(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int A022 = ((DSQ) list.get(i2)).A02();
            boolean z = CodedOutputStream.A01;
            A05 += BEB.A02(A022) + A022;
        }
        return A05;
    }

    public static int A09(List list, int i) {
        int A04;
        int A042;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int A05 = C25878Cnp.A05(i) * size;
        if (list instanceof EE5) {
            EE5 ee5 = (EE5) list;
            while (i2 < size) {
                Object BXq = ee5.BXq(i2);
                if (BXq instanceof DSQ) {
                    int A022 = ((DSQ) BXq).A02();
                    boolean z = CodedOutputStream.A01;
                    A042 = BEB.A02(A022) + A022;
                } else {
                    A042 = CodedOutputStream.A04((String) BXq);
                }
                A05 += A042;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof DSQ) {
                    int A023 = ((DSQ) obj).A02();
                    boolean z2 = CodedOutputStream.A01;
                    A04 = BEB.A02(A023) + A023;
                } else {
                    A04 = CodedOutputStream.A04((String) obj);
                }
                A05 += A04;
                i2++;
            }
        }
        return A05;
    }
}
