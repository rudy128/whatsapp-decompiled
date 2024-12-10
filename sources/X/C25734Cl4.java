package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cl4  reason: case insensitive filesystem */
public class C25734Cl4 {
    public final int A00;
    public final int A01;
    public final C24490C6i A02;
    public final List A03;
    public final int[] A04;
    public final int[] A05;

    /* JADX WARNING: type inference failed for: r0v29, types: [java.lang.Object, X.CS6] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        r11 = r14.A02;
        r15 = r15 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f5, code lost:
        r2 = r14.A01;
        r15 = r15 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25734Cl4(X.C24490C6i r19, java.util.List r20, int[] r21, int[] r22) {
        /*
            r18 = this;
            r7 = 1
            r6 = r18
            r6.<init>()
            r0 = r20
            r6.A03 = r0
            r2 = r21
            r6.A05 = r2
            r1 = r22
            r6.A04 = r1
            r0 = 0
            java.util.Arrays.fill(r2, r0)
            java.util.Arrays.fill(r1, r0)
            r1 = r19
            r6.A02 = r1
            int r0 = r1.A01()
            r6.A01 = r0
            int r0 = r1.A00()
            r6.A00 = r0
            java.util.List r3 = r6.A03
            boolean r0 = r3.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0042
            java.lang.Object r1 = r3.get(r2)
            X.CS6 r1 = (X.CS6) r1
            if (r1 == 0) goto L_0x0042
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0042
            int r0 = r1.A02
            if (r0 == 0) goto L_0x0054
        L_0x0042:
            X.CS6 r0 = new X.CS6
            r0.<init>()
            r0.A01 = r2
            r0.A02 = r2
            r0.A03 = r2
            r0.A00 = r2
            r0.A04 = r2
            r3.add(r2, r0)
        L_0x0054:
            int r5 = r6.A01
            int r4 = r6.A00
            java.util.List r10 = r6.A03
            int r9 = X.AnonymousClass3MX.A02(r10, r7)
        L_0x005e:
            if (r9 < 0) goto L_0x0128
            java.lang.Object r8 = r10.get(r9)
            X.CS6 r8 = (X.CS6) r8
            int r12 = r8.A01
            int r0 = r8.A00
            int r12 = r12 + r0
            int r3 = r8.A02
            int r3 = r3 + r0
        L_0x006e:
            if (r5 <= r12) goto L_0x00b6
            r11 = r4
            r15 = r9
            int[] r1 = r6.A05
            int r2 = r5 + -1
            r0 = r1[r2]
            if (r0 == 0) goto L_0x007e
        L_0x007a:
            r5 = r2
            goto L_0x006e
        L_0x007c:
            if (r15 < 0) goto L_0x007a
        L_0x007e:
            java.lang.Object r14 = r10.get(r15)
            X.CS6 r14 = (X.CS6) r14
            int r0 = r14.A00
            int r13 = r14.A02
            int r13 = r13 + r0
            r17 = 8
            int r11 = r11 - r7
        L_0x008c:
            if (r11 < r13) goto L_0x00b1
            X.C6i r0 = r6.A02
            boolean r16 = r0.A04(r2, r11)
            if (r16 == 0) goto L_0x00ae
            boolean r0 = r0.A03(r2, r11)
            if (r0 != 0) goto L_0x009e
            r17 = 4
        L_0x009e:
            int r0 = r11 << 5
            r0 = r0 | 16
            r1[r2] = r0
            int[] r1 = r6.A04
            int r5 = r5 - r7
            int r0 = r5 << 5
            r0 = r0 | r17
            r1[r11] = r0
            goto L_0x007a
        L_0x00ae:
            int r11 = r11 + -1
            goto L_0x008c
        L_0x00b1:
            int r11 = r14.A02
            int r15 = r15 + -1
            goto L_0x007c
        L_0x00b6:
            if (r4 <= r3) goto L_0x00fa
            r2 = r5
            r15 = r9
            int[] r12 = r6.A04
            int r4 = r4 + -1
            r0 = r12[r4]
            if (r0 == 0) goto L_0x00c5
            goto L_0x00b6
        L_0x00c3:
            if (r15 < 0) goto L_0x00b6
        L_0x00c5:
            java.lang.Object r14 = r10.get(r15)
            X.CS6 r14 = (X.CS6) r14
            int r13 = r14.A01
            int r0 = r14.A00
            int r13 = r13 + r0
            r11 = 8
            int r2 = r2 - r7
        L_0x00d3:
            if (r2 < r13) goto L_0x00f5
            X.C6i r1 = r6.A02
            boolean r0 = r1.A04(r2, r4)
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r1.A03(r2, r4)
            if (r0 != 0) goto L_0x00e4
            r11 = 4
        L_0x00e4:
            int r0 = r2 << 5
            r0 = r0 | 16
            r12[r4] = r0
            int[] r1 = r6.A05
            int r0 = r4 << 5
            r0 = r0 | r11
            r1[r2] = r0
            goto L_0x00b6
        L_0x00f2:
            int r2 = r2 + -1
            goto L_0x00d3
        L_0x00f5:
            int r2 = r14.A01
            int r15 = r15 + -1
            goto L_0x00c3
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            int r0 = r8.A00
            if (r5 >= r0) goto L_0x0120
            int r4 = r8.A01
            int r4 = r4 + r5
            int r3 = r8.A02
            int r3 = r3 + r5
            X.C6i r0 = r6.A02
            boolean r0 = r0.A03(r4, r3)
            int r2 = X.C72453Mb.A04(r0)
            int[] r1 = r6.A05
            int r0 = r3 << 5
            r0 = r0 | r2
            r1[r4] = r0
            int[] r1 = r6.A04
            int r0 = r4 << 5
            r0 = r0 | r2
            r1[r3] = r0
            int r5 = r5 + 1
            goto L_0x00fb
        L_0x0120:
            int r5 = r8.A01
            int r4 = r8.A02
            int r9 = r9 + -1
            goto L_0x005e
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25734Cl4.<init>(X.C6i, java.util.List, int[], int[]):void");
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [java.lang.Object, X.C5N] */
    /* JADX WARNING: type inference failed for: r0v49, types: [java.lang.Object, X.C5N] */
    public void A01(C40451uj r18) {
        C26628D6y d6y;
        C40451uj r6 = r18;
        if (r6 instanceof C26628D6y) {
            d6y = (C26628D6y) r6;
        } else {
            d6y = new C26628D6y(r6);
        }
        ArrayList A13 = AnonymousClass000.A13();
        int i = this.A01;
        int i2 = this.A00;
        List list = this.A03;
        for (int size = list.size() - 1; size >= 0; size--) {
            CS6 cs6 = (CS6) list.get(size);
            int i3 = cs6.A00;
            int i4 = cs6.A01 + i3;
            int i5 = cs6.A02 + i3;
            if (i4 < i) {
                for (int i6 = (i - i4) - 1; i6 >= 0; i6--) {
                    int[] iArr = this.A05;
                    int i7 = iArr[i4 + i6] & 31;
                    if (i7 == 0) {
                        d6y.C34(i4 + i6, 1);
                        Iterator it = A13.iterator();
                        while (it.hasNext()) {
                            ((C5N) it.next()).A00--;
                        }
                    } else if (i7 == 4 || i7 == 8) {
                        int i8 = i4 + i6;
                        int i9 = iArr[i8] >> 5;
                        C5N A002 = A00(A13, i9, false);
                        d6y.Byk(i8, A002.A00 - 1);
                        if (i7 == 4) {
                            d6y.BoA(this.A02.A02(i4 + i6, i9), A002.A00 - 1, 1);
                        }
                    } else if (i7 == 16) {
                        int i10 = i4 + i6;
                        ? obj = new Object();
                        obj.A01 = i10;
                        obj.A00 = i10;
                        obj.A02 = true;
                        A13.add(obj);
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("unknown flag for pos ");
                        A10.append(i4 + i6);
                        BE6.A1J(A10);
                        throw AnonymousClass000.A0o(Long.toBinaryString((long) i7), A10);
                    }
                }
            }
            if (i5 < i2) {
                for (int i11 = (i2 - i5) - 1; i11 >= 0; i11--) {
                    int[] iArr2 = this.A04;
                    int i12 = iArr2[i5 + i11] & 31;
                    if (i12 == 0) {
                        d6y.Bw0(i4, 1);
                        Iterator it2 = A13.iterator();
                        while (it2.hasNext()) {
                            ((C5N) it2.next()).A00++;
                        }
                    } else if (i12 == 4 || i12 == 8) {
                        int i13 = iArr2[i5 + i11] >> 5;
                        d6y.Byk(A00(A13, i13, true).A00, i4);
                        if (i12 == 4) {
                            d6y.BoA(this.A02.A02(i13, i5 + i11), i4, 1);
                        }
                    } else if (i12 == 16) {
                        ? obj2 = new Object();
                        obj2.A01 = i5 + i11;
                        obj2.A00 = i4;
                        obj2.A02 = false;
                        A13.add(obj2);
                    } else {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("unknown flag for pos ");
                        A102.append(i5 + i11);
                        BE6.A1J(A102);
                        throw AnonymousClass000.A0o(Long.toBinaryString((long) i12), A102);
                    }
                }
            }
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                } else if ((this.A05[cs6.A01 + i3] & 31) == 2) {
                    int i14 = cs6.A01 + i3;
                    d6y.BoA(this.A02.A02(i14, cs6.A02 + i3), i14, 1);
                }
            }
            i = cs6.A01;
            i2 = cs6.A02;
        }
        d6y.A00();
    }

    public void A02(C38391rD r2) {
        A01(new C40461uk(r2));
    }

    public static C5N A00(List list, int i, boolean z) {
        int size = list.size() - 1;
        while (size >= 0) {
            C5N c5n = (C5N) list.get(size);
            if (c5n.A01 == i && c5n.A02 == z) {
                list.remove(size);
                while (size < list.size()) {
                    C5N c5n2 = (C5N) list.get(size);
                    int i2 = c5n2.A00;
                    int i3 = -1;
                    if (z) {
                        i3 = 1;
                    }
                    c5n2.A00 = i2 + i3;
                    size++;
                }
                return c5n;
            }
            size--;
        }
        return null;
    }
}
