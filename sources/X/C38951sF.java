package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1sF  reason: invalid class name and case insensitive filesystem */
public class C38951sF {
    public C38891s5 A00;
    public C38891s5 A01;
    public C38941sE A02;
    public C39101sU A03;
    public ArrayList A04;
    public ArrayList A05;
    public ArrayList A06;
    public boolean A07;
    public boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cb, code lost:
        if ((r11 instanceof X.AnonymousClass1s8) == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if ((r11 instanceof X.C38911sB) == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d5, code lost:
        r0 = r1.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r23 == 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C38891s5 r21, X.C38951sF r22, int r23) {
        /*
            r0 = r22
            java.util.ArrayList r0 = r0.A04
            r20 = r0
            int r19 = r20.size()
            r6 = 0
            r12 = 0
        L_0x000d:
            r0 = r19
            if (r12 >= r0) goto L_0x00d9
            r0 = r20
            java.lang.Object r2 = r0.get(r12)
            X.2pn r2 = (X.C61502pn) r2
            X.1s7 r11 = r2.A00
            boolean r0 = r11 instanceof X.AnonymousClass27R
            r4 = 0
            r1 = r21
            r14 = r23
            if (r0 == 0) goto L_0x00c7
            int r0 = r11.A01
            if (r0 != r14) goto L_0x00cd
            if (r23 != 0) goto L_0x00d5
        L_0x002b:
            X.1s8 r0 = r1.A0c
        L_0x002d:
            X.1s9 r1 = r0.A04
            X.1s9 r3 = r0.A03
            X.1s9 r13 = r11.A04
            java.util.List r0 = r13.A08
            boolean r1 = r0.contains(r1)
            X.1s9 r10 = r11.A03
            java.util.List r0 = r10.A08
            boolean r0 = r0.contains(r3)
            long r17 = r11.A05()
            if (r1 == 0) goto L_0x00a9
            if (r0 == 0) goto L_0x009c
            long r8 = X.C61502pn.A01(r13, r2, r4)
            long r15 = X.C61502pn.A00(r10, r2, r4)
            long r8 = r8 - r17
            int r2 = r10.A00
            int r0 = -r2
            long r0 = (long) r0
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x005d
            long r0 = (long) r2
            long r8 = r8 + r0
        L_0x005d:
            long r2 = -r15
            long r2 = r2 - r17
            int r0 = r13.A00
            long r0 = (long) r0
            long r2 = r2 - r0
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x0069
            long r2 = r2 - r0
        L_0x0069:
            X.1s3 r11 = r11.A02
            if (r23 != 0) goto L_0x0099
            float r11 = r11.A02
        L_0x006f:
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x007e
            float r4 = (float) r2
            float r4 = r4 / r11
            float r3 = (float) r8
            float r2 = r14 - r11
            float r3 = r3 / r2
            float r4 = r4 + r3
            long r4 = (long) r4
        L_0x007e:
            float r8 = (float) r4
            float r3 = r8 * r11
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            long r4 = (long) r3
            float r14 = r14 - r11
            float r8 = r8 * r14
            float r8 = r8 + r2
            long r2 = (long) r8
            long r4 = r4 + r17
            long r4 = r4 + r2
            long r0 = r0 + r4
        L_0x008d:
            int r2 = r10.A00
            long r2 = (long) r2
            long r0 = r0 - r2
        L_0x0091:
            long r6 = java.lang.Math.max(r6, r0)
            int r12 = r12 + 1
            goto L_0x000d
        L_0x0099:
            float r11 = r11.A06
            goto L_0x006f
        L_0x009c:
            int r0 = r13.A00
            long r0 = (long) r0
            long r1 = X.C61502pn.A01(r13, r2, r0)
            int r0 = r13.A00
            long r3 = (long) r0
            long r3 = r3 + r17
            goto L_0x00b9
        L_0x00a9:
            if (r0 == 0) goto L_0x00be
            int r0 = r10.A00
            long r0 = (long) r0
            long r8 = X.C61502pn.A00(r10, r2, r0)
            int r0 = r10.A00
            int r0 = -r0
            long r3 = (long) r0
            long r3 = r3 + r17
            long r1 = -r8
        L_0x00b9:
            long r0 = java.lang.Math.max(r1, r3)
            goto L_0x0091
        L_0x00be:
            int r0 = r13.A00
            long r0 = (long) r0
            long r2 = r11.A05()
            long r0 = r0 + r2
            goto L_0x008d
        L_0x00c7:
            if (r23 != 0) goto L_0x00d0
            boolean r0 = r11 instanceof X.AnonymousClass1s8
            if (r0 != 0) goto L_0x002b
        L_0x00cd:
            r0 = 0
            goto L_0x0091
        L_0x00d0:
            boolean r0 = r11 instanceof X.C38911sB
            if (r0 != 0) goto L_0x00d5
            goto L_0x00cd
        L_0x00d5:
            X.1sB r0 = r1.A0d
            goto L_0x002d
        L_0x00d9:
            int r0 = (int) r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38951sF.A00(X.1s5, X.1sF, int):int");
    }

    private void A01(C38871s3 r3, Integer num, Integer num2, int i, int i2) {
        C38941sE r1 = this.A02;
        r1.A05 = num;
        r1.A06 = num2;
        r1.A00 = i;
        r1.A04 = i2;
        this.A03.BjX(r3, r1);
        r3.A0A(r1.A03);
        r3.A09(r1.A02);
        r3.A0h = r1.A07;
        int i3 = r1.A01;
        r3.A07 = i3;
        boolean z = false;
        if (i3 > 0) {
            z = true;
        }
        r3.A0h = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0222, code lost:
        if (r4.A0C == 0) goto L_0x0212;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0008 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C38891s5 r26, X.C38951sF r27) {
        /*
            r0 = r26
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r18 = r0.iterator()
        L_0x0008:
            boolean r0 = r18.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0225
            java.lang.Object r4 = r18.next()
            X.1s3 r4 = (X.C38871s3) r4
            java.lang.Integer[] r0 = r4.A0q
            r8 = r0[r1]
            r5 = 1
            r7 = r0[r5]
            int r2 = r4.A0N
            r0 = 8
            if (r2 == r0) goto L_0x00f4
            float r6 = r4.A04
            r17 = 1065353216(0x3f800000, float:1.0)
            r9 = 2
            int r0 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r8 != r0) goto L_0x0031
            r4.A0D = r9
        L_0x0031:
            float r3 = r4.A03
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x003d
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r7 != r0) goto L_0x003d
            r4.A0C = r9
        L_0x003d:
            float r10 = r4.A01
            r0 = 0
            r2 = 3
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            java.lang.Integer r10 = X.AnonymousClass00R.A0C
            if (r8 != r10) goto L_0x0208
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r7 == r0) goto L_0x0051
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r7 != r0) goto L_0x0208
        L_0x0051:
            r4.A0D = r2
        L_0x0053:
            java.lang.Integer r13 = X.AnonymousClass00R.A0C
            if (r8 != r13) goto L_0x0069
            int r0 = r4.A0D
            if (r0 != r5) goto L_0x0069
            X.1sC r0 = r4.A0W
            X.1sC r0 = r0.A03
            if (r0 == 0) goto L_0x0067
            X.1sC r0 = r4.A0X
            X.1sC r0 = r0.A03
            if (r0 != 0) goto L_0x0069
        L_0x0067:
            java.lang.Integer r8 = X.AnonymousClass00R.A01
        L_0x0069:
            if (r7 != r13) goto L_0x007d
            int r0 = r4.A0C
            if (r0 != r5) goto L_0x007d
            X.1sC r0 = r4.A0Y
            X.1sC r0 = r0.A03
            if (r0 == 0) goto L_0x007b
            X.1sC r0 = r4.A0S
            X.1sC r0 = r0.A03
            if (r0 != 0) goto L_0x007d
        L_0x007b:
            java.lang.Integer r7 = X.AnonymousClass00R.A01
        L_0x007d:
            X.1s8 r10 = r4.A0c
            r10.A07 = r8
            int r12 = r4.A0D
            r10.A00 = r12
            X.1sB r0 = r4.A0d
            r25 = r0
            r0.A07 = r7
            int r15 = r4.A0C
            r0.A00 = r15
            java.lang.Integer r14 = X.AnonymousClass00R.A0N
            r19 = r27
            if (r8 == r14) goto L_0x009d
            java.lang.Integer r11 = X.AnonymousClass00R.A00
            if (r8 == r11) goto L_0x009d
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r8 != r0) goto L_0x00f8
        L_0x009d:
            if (r7 == r14) goto L_0x00a7
            java.lang.Integer r11 = X.AnonymousClass00R.A00
            if (r7 == r11) goto L_0x00a7
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r7 != r0) goto L_0x00f8
        L_0x00a7:
            int r1 = r4.A03()
            if (r8 != r14) goto L_0x00bd
            int r1 = r26.A03()
            X.1sC r0 = r4.A0W
            int r0 = r0.A01
            int r1 = r1 - r0
            X.1sC r0 = r4.A0X
            int r0 = r0.A01
            int r1 = r1 - r0
            java.lang.Integer r8 = X.AnonymousClass00R.A00
        L_0x00bd:
            int r2 = r4.A02()
            if (r7 != r14) goto L_0x00d3
            int r2 = r26.A02()
            X.1sC r0 = r4.A0Y
            int r0 = r0.A01
            int r2 = r2 - r0
            X.1sC r0 = r4.A0S
            int r0 = r0.A01
            int r2 = r2 - r0
            java.lang.Integer r7 = X.AnonymousClass00R.A00
        L_0x00d3:
            r20 = r4
            r21 = r8
            r22 = r7
            r23 = r1
            r24 = r2
            r19.A01(r20, r21, r22, r23, r24)
            X.1sA r1 = r10.A05
            int r0 = r4.A03()
            r1.A01(r0)
            r0 = r25
            X.1sA r1 = r0.A05
            int r0 = r4.A02()
            r1.A01(r0)
        L_0x00f4:
            r4.A0i = r5
            goto L_0x0008
        L_0x00f8:
            r16 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r13) goto L_0x0135
            if (r7 == r0) goto L_0x0100
            if (r7 != r11) goto L_0x0135
        L_0x0100:
            if (r12 != r2) goto L_0x011f
            if (r7 != r0) goto L_0x0111
            r22 = r0
            r24 = r1
            r20 = r4
            r21 = r0
            r23 = r1
            r19.A01(r20, r21, r22, r23, r24)
        L_0x0111:
            int r2 = r4.A02()
            float r1 = (float) r2
            float r0 = r4.A01
            float r1 = r1 * r0
            float r1 = r1 + r16
            int r1 = (int) r1
        L_0x011c:
            r8 = r11
        L_0x011d:
            r7 = r11
            goto L_0x00d3
        L_0x011f:
            if (r12 != r5) goto L_0x01cf
            r24 = r1
            r20 = r4
            r21 = r0
            r22 = r7
            r23 = r1
            r19.A01(r20, r21, r22, r23, r24)
            X.1sA r1 = r10.A05
            int r0 = r4.A03()
            goto L_0x01b0
        L_0x0135:
            if (r7 != r13) goto L_0x015f
            if (r8 == r0) goto L_0x013b
            if (r8 != r11) goto L_0x015f
        L_0x013b:
            if (r15 != r2) goto L_0x019c
            if (r8 != r0) goto L_0x014c
            r22 = r0
            r24 = r1
            r20 = r4
            r21 = r0
            r23 = r1
            r19.A01(r20, r21, r22, r23, r24)
        L_0x014c:
            int r1 = r4.A03()
            float r6 = r4.A01
            int r2 = r4.A08
            r0 = -1
            if (r2 != r0) goto L_0x0159
            float r6 = r17 / r6
        L_0x0159:
            float r3 = (float) r1
        L_0x015a:
            float r3 = r3 * r6
            float r3 = r3 + r16
            int r2 = (int) r3
            goto L_0x011c
        L_0x015f:
            if (r8 != r13) goto L_0x0008
            if (r7 != r13) goto L_0x0008
            if (r12 == r5) goto L_0x0186
            if (r15 == r5) goto L_0x0186
            if (r15 != r9) goto L_0x0008
            if (r12 != r9) goto L_0x0008
            r0 = r26
            java.lang.Integer[] r2 = r0.A0q
            r0 = r2[r1]
            if (r0 != r11) goto L_0x0008
            r0 = r2[r5]
            if (r0 != r11) goto L_0x0008
            int r0 = r26.A03()
            float r0 = (float) r0
            float r6 = r6 * r0
            float r6 = r6 + r16
            int r1 = (int) r6
            int r0 = r26.A02()
            float r6 = (float) r0
            goto L_0x015a
        L_0x0186:
            r22 = r0
            r24 = r1
            r20 = r4
            r21 = r0
            r23 = r1
            r19.A01(r20, r21, r22, r23, r24)
            X.1sA r1 = r10.A05
            int r0 = r4.A03()
            r1.A00 = r0
            goto L_0x01a8
        L_0x019c:
            if (r15 != r5) goto L_0x01b4
            r10 = r1
            r5 = r19
            r6 = r4
            r7 = r8
            r8 = r0
            r9 = r1
            r5.A01(r6, r7, r8, r9, r10)
        L_0x01a8:
            r0 = r25
            X.1sA r1 = r0.A05
            int r0 = r4.A02()
        L_0x01b0:
            r1.A00 = r0
            goto L_0x0008
        L_0x01b4:
            if (r15 != r9) goto L_0x01eb
            r0 = r26
            java.lang.Integer[] r0 = r0.A0q
            r0 = r0[r5]
            if (r0 == r11) goto L_0x01c0
            if (r0 != r14) goto L_0x0008
        L_0x01c0:
            int r1 = r4.A03()
            int r0 = r26.A02()
            float r0 = (float) r0
            float r3 = r3 * r0
            float r3 = r3 + r16
            int r2 = (int) r3
            goto L_0x011d
        L_0x01cf:
            if (r12 != r9) goto L_0x01f6
            r0 = r26
            java.lang.Integer[] r0 = r0.A0q
            r0 = r0[r1]
            if (r0 == r11) goto L_0x01db
            if (r0 != r14) goto L_0x0008
        L_0x01db:
            int r0 = r26.A03()
            float r0 = (float) r0
            float r6 = r6 * r0
            float r6 = r6 + r16
            int r1 = (int) r6
            int r2 = r4.A02()
            r8 = r11
            goto L_0x00d3
        L_0x01eb:
            X.1sC[] r6 = r4.A0n
            r3 = r6[r9]
            X.1sC r3 = r3.A03
            if (r3 == 0) goto L_0x0204
            r2 = r6[r2]
            goto L_0x0200
        L_0x01f6:
            X.1sC[] r3 = r4.A0n
            r2 = r3[r1]
            X.1sC r2 = r2.A03
            if (r2 == 0) goto L_0x0204
            r2 = r3[r5]
        L_0x0200:
            X.1sC r2 = r2.A03
            if (r2 != 0) goto L_0x0008
        L_0x0204:
            r8 = r0
            r2 = 0
            goto L_0x00d3
        L_0x0208:
            if (r7 != r10) goto L_0x0216
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r8 == r0) goto L_0x0212
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r8 != r0) goto L_0x0216
        L_0x0212:
            r4.A0C = r2
            goto L_0x0053
        L_0x0216:
            if (r8 != r10) goto L_0x0053
            if (r7 != r10) goto L_0x0053
            int r0 = r4.A0D
            if (r0 != 0) goto L_0x0220
            r4.A0D = r2
        L_0x0220:
            int r0 = r4.A0C
            if (r0 != 0) goto L_0x0053
            goto L_0x0212
        L_0x0225:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38951sF.A02(X.1s5, X.1sF):void");
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [X.2pn, java.lang.Object] */
    private void A03(AnonymousClass1s9 r19, AnonymousClass1s9 r20, C61502pn r21, ArrayList arrayList, int i) {
        AnonymousClass1s9 r8;
        int i2;
        C61502pn r9 = r21;
        AnonymousClass1s7 r3 = r19.A05;
        if (r3.A06 == null) {
            C38891s5 r1 = this.A00;
            if (r3 != r1.A0c && r3 != r1.A0d) {
                ArrayList arrayList2 = arrayList;
                if (r21 == null) {
                    ? obj = new Object();
                    obj.A01 = null;
                    obj.A02 = new ArrayList();
                    C61502pn.A03++;
                    obj.A00 = r3;
                    obj.A01 = r3;
                    arrayList2.add(obj);
                    r9 = obj;
                }
                r3.A06 = r9;
                r9.A02.add(r3);
                r9.A01 = r3;
                AnonymousClass1s9 r5 = r3.A04;
                Iterator it = r5.A07.iterator();
                while (true) {
                    r8 = r20;
                    i2 = i;
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass1s6 r7 = (AnonymousClass1s6) it.next();
                    if (r7 instanceof AnonymousClass1s9) {
                        A03((AnonymousClass1s9) r7, r8, r9, arrayList2, i2);
                    }
                }
                AnonymousClass1s9 r4 = r3.A03;
                for (AnonymousClass1s6 r72 : r4.A07) {
                    if (r72 instanceof AnonymousClass1s9) {
                        A03((AnonymousClass1s9) r72, r8, r9, arrayList2, i2);
                    }
                }
                if (i2 == 1 && (r3 instanceof C38911sB)) {
                    for (AnonymousClass1s6 r13 : ((C38911sB) r3).A00.A07) {
                        if (r13 instanceof AnonymousClass1s9) {
                            A03((AnonymousClass1s9) r13, r8, r9, arrayList2, 1);
                        }
                    }
                }
                for (AnonymousClass1s9 A032 : r5.A08) {
                    A03(A032, r8, r9, arrayList2, i2);
                }
                for (AnonymousClass1s9 A033 : r4.A08) {
                    A03(A033, r8, r9, arrayList2, i2);
                }
                if (i2 == 1 && (r3 instanceof C38911sB)) {
                    for (AnonymousClass1s9 A034 : ((C38911sB) r3).A00.A08) {
                        A03(A034, r8, r9, arrayList2, 1);
                    }
                }
            }
        }
    }

    private void A04(AnonymousClass1s7 r15, ArrayList arrayList, int i) {
        ArrayList arrayList2;
        int i2;
        AnonymousClass1s9 r9;
        AnonymousClass1s9 r3;
        AnonymousClass1s9 r10 = r15.A04;
        Iterator it = r10.A07.iterator();
        while (true) {
            arrayList2 = arrayList;
            i2 = i;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass1s6 r32 = (AnonymousClass1s6) it.next();
            if (r32 instanceof AnonymousClass1s9) {
                r3 = (AnonymousClass1s9) r32;
            } else if (r32 instanceof AnonymousClass1s7) {
                r3 = ((AnonymousClass1s7) r32).A04;
            }
            A03(r3, r15.A03, (C61502pn) null, arrayList2, i2);
        }
        for (AnonymousClass1s6 r92 : r15.A03.A07) {
            if (r92 instanceof AnonymousClass1s9) {
                r9 = (AnonymousClass1s9) r92;
            } else if (r92 instanceof AnonymousClass1s7) {
                r9 = ((AnonymousClass1s7) r92).A03;
            }
            A03(r9, r10, (C61502pn) null, arrayList2, i2);
        }
        if (i2 == 1) {
            for (AnonymousClass1s6 r33 : ((C38911sB) r15).A00.A07) {
                if (r33 instanceof AnonymousClass1s9) {
                    A03((AnonymousClass1s9) r33, (AnonymousClass1s9) null, (C61502pn) null, arrayList2, 1);
                }
            }
        }
    }

    public void A05() {
        AnonymousClass1s7 r1;
        ArrayList arrayList = this.A05;
        arrayList.clear();
        C38891s5 r3 = this.A01;
        AnonymousClass1s8 r12 = r3.A0c;
        r12.A07();
        C38911sB r0 = r3.A0d;
        r0.A07();
        arrayList.add(r12);
        arrayList.add(r0);
        Iterator it = r3.A00.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C38871s3 r5 = (C38871s3) it.next();
            if (r5 instanceof AnonymousClass27L) {
                r1 = new AnonymousClass1s7(r5);
                r5.A0c.A07();
                r5.A0d.A07();
                r1.A01 = ((AnonymousClass27L) r5).A01;
            } else {
                if (r5.A0G()) {
                    AnonymousClass27R r13 = r5.A0a;
                    if (r13 == null) {
                        r13 = new AnonymousClass27R(r5, 0);
                        r5.A0a = r13;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r13);
                } else {
                    arrayList.add(r5.A0c);
                }
                if (r5.A0H()) {
                    AnonymousClass27R r14 = r5.A0b;
                    if (r14 == null) {
                        r14 = new AnonymousClass27R(r5, 1);
                        r5.A0b = r14;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r14);
                } else {
                    arrayList.add(r5.A0d);
                }
                if (r5 instanceof AnonymousClass27N) {
                    r1 = new AnonymousClass1s7(r5);
                }
            }
            arrayList.add(r1);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AnonymousClass1s7) it2.next()).A07();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AnonymousClass1s7 r15 = (AnonymousClass1s7) it3.next();
            if (r15.A02 != r3) {
                r15.A0B();
            }
        }
        ArrayList arrayList2 = this.A04;
        arrayList2.clear();
        C61502pn.A03 = 0;
        C38891s5 r16 = this.A00;
        A04(r16.A0c, arrayList2, 0);
        A04(r16.A0d, arrayList2, 1);
        this.A07 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r7 == r0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        if (r6 == r0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        r4.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r4.A01(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r21 = this;
            r11 = r21
            X.1s5 r0 = r11.A00
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r10 = r0.iterator()
        L_0x000a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r12 = r10.next()
            X.1s3 r12 = (X.C38871s3) r12
            boolean r0 = r12.A0i
            if (r0 != 0) goto L_0x000a
            java.lang.Integer[] r0 = r12.A0q
            r9 = 0
            r7 = r0[r9]
            r3 = 1
            r6 = r0[r3]
            int r2 = r12.A0D
            int r1 = r12.A0C
            java.lang.Integer r14 = X.AnonymousClass00R.A01
            if (r7 == r14) goto L_0x0030
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r7 != r0) goto L_0x00a2
            if (r2 != r3) goto L_0x00a2
        L_0x0030:
            r8 = 1
        L_0x0031:
            if (r6 == r14) goto L_0x0039
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r6 != r0) goto L_0x003a
            if (r1 != r3) goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            X.1s8 r0 = r12.A0c
            X.1sA r5 = r0.A05
            boolean r1 = r5.A0B
            X.1sB r2 = r12.A0d
            X.1sA r4 = r2.A05
            boolean r0 = r4.A0B
            if (r1 == 0) goto L_0x0066
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r13 = X.AnonymousClass00R.A00
            int r15 = r5.A02
            int r0 = r4.A02
            r14 = r13
            r16 = r0
            r11.A01(r12, r13, r14, r15, r16)
        L_0x0056:
            r12.A0i = r3
        L_0x0058:
            boolean r0 = r12.A0i
            if (r0 == 0) goto L_0x000a
            X.1sA r1 = r2.A01
            if (r1 == 0) goto L_0x000a
            int r0 = r12.A07
            r1.A01(r0)
            goto L_0x000a
        L_0x0066:
            if (r0 == 0) goto L_0x0058
            if (r8 == 0) goto L_0x0058
            int r1 = r5.A02
            java.lang.Integer r18 = X.AnonymousClass00R.A00
            int r0 = r4.A02
            r15 = r11
            r16 = r12
            r17 = r14
            r19 = r1
            r20 = r0
            r15.A01(r16, r17, r18, r19, r20)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r4 = r5
            int r1 = r12.A03()
            if (r7 != r0) goto L_0x009e
            goto L_0x009b
        L_0x0086:
            if (r9 == 0) goto L_0x0058
            java.lang.Integer r13 = X.AnonymousClass00R.A00
            int r15 = r5.A02
            int r0 = r4.A02
            r16 = r0
            r11.A01(r12, r13, r14, r15, r16)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            int r1 = r12.A02()
            if (r6 != r0) goto L_0x009e
        L_0x009b:
            r4.A00 = r1
            goto L_0x0058
        L_0x009e:
            r4.A01(r1)
            goto L_0x0056
        L_0x00a2:
            r8 = 0
            goto L_0x0031
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38951sF.A06():void");
    }
}
