package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.0QF  reason: invalid class name */
public final class AnonymousClass0QF {
    public final Integer A00;
    public final C16120rk A01;
    public final C16130rl A02;
    public final C03410Hz A03;
    public final List A04;
    public final C03690Jn[] A05;
    public final AnonymousClass0XJ[] A06;

    public final void A07(C03280Hj r10, C24246By4 by4) {
        C03690Jn r1;
        int i = r10.A01;
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass0XJ r5 = this.A06[i2];
            C18070vi.A0b(r5);
            int[] iArr = r10.A03;
            Object BWC = AnonymousClass000.A0g(this.A04, i2).BWC();
            if (BWC instanceof C03690Jn) {
                r1 = (C03690Jn) BWC;
            } else {
                r1 = null;
            }
            int A002 = A00(r1, r5, by4, r10.A00);
            Integer num = this.A00;
            Integer num2 = AnonymousClass00R.A00;
            int i3 = iArr[i2];
            if (num == num2) {
                AnonymousClass0QZ.A03(r5, 0.0f, i3, A002);
            } else {
                AnonymousClass0QZ.A03(r5, 0.0f, A002, i3);
            }
        }
    }

    private final int A00(C03690Jn r5, AnonymousClass0XJ r6, C24246By4 by4, int i) {
        C03410Hz r3;
        int i2;
        if (r5 == null || (r3 = r5.A01) == null) {
            r3 = this.A03;
        }
        Integer num = this.A00;
        Integer num2 = AnonymousClass00R.A00;
        if (num == num2) {
            i2 = r6.A00;
        } else {
            i2 = r6.A01;
        }
        int i3 = i - i2;
        if (num == num2) {
            by4 = C24246By4.Ltr;
        }
        return r3.A00(by4, i3);
    }

    public static long A03(Integer num, long j) {
        int A022;
        int A002;
        int A032;
        int A012;
        if (num == AnonymousClass00R.A00) {
            A022 = Constraints.A03(j);
            A002 = Constraints.A01(j);
            A032 = Constraints.A02(j);
            A012 = Constraints.A00(j);
        } else {
            A022 = Constraints.A02(j);
            A002 = Constraints.A00(j);
            A032 = Constraints.A03(j);
            A012 = Constraints.A01(j);
        }
        return A01(A022, A002, A032, A012);
    }

    public static final long A04(Integer num, long j) {
        int A022;
        int A002;
        int A032;
        int A012;
        if (num == AnonymousClass00R.A00) {
            A022 = Constraints.A03(j);
            A002 = Constraints.A01(j);
            A032 = Constraints.A02(j);
            A012 = Constraints.A00(j);
        } else {
            A022 = Constraints.A02(j);
            A002 = Constraints.A00(j);
            A032 = Constraints.A03(j);
            A012 = Constraints.A01(j);
        }
        return C26229CvL.A03(A022, A002, A032, A012);
    }

    private final void A05(C17530uo r3, int[] iArr, int[] iArr2, int i) {
        if (this.A00 == AnonymousClass00R.A01) {
            C16130rl r0 = this.A02;
            if (r0 != null) {
                r0.BCb(iArr, iArr2, i);
                return;
            }
            throw AnonymousClass000.A0k("null verticalArrangement in Column");
        }
        C16120rk r1 = this.A01;
        if (r1 != null) {
            r1.BCc(r3.getLayoutDirection(), iArr, iArr2, i);
            return;
        }
        throw AnonymousClass000.A0k("null horizontalArrangement in Row");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0184, code lost:
        if (r14 == Integer.MAX_VALUE) goto L_0x0186;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C03280Hj A06(X.C17530uo r54, int r55, long r56) {
        /*
            r53 = this;
            r44 = 0
            r10 = r53
            java.lang.Integer r0 = r10.A00
            r51 = r0
            r1 = r56
            long r18 = A03(r0, r1)
            r1 = 0
            r52 = r54
            r0 = r52
            int r0 = r0.CG9(r1)
            long r0 = (long) r0
            r16 = r0
            r43 = 0
            r3 = 0
            r6 = 0
            r42 = 0
            r41 = 0
            r4 = 0
            r40 = 0
        L_0x0026:
            r11 = r55
            if (r3 >= r11) goto L_0x00b2
            java.util.List r0 = r10.A04
            java.lang.Object r5 = r0.get(r3)
            X.0ul r5 = (X.C17500ul) r5
            X.0Jn[] r0 = r10.A05
            r2 = r0[r3]
            if (r2 == 0) goto L_0x0045
            float r1 = r2.A00
            int r0 = (r1 > r43 ? 1 : (r1 == r43 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
            float r42 = r42 + r1
            int r41 = r41 + 1
        L_0x0042:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x0045:
            int r4 = androidx.compose.ui.unit.Constraints.A01(r18)
            X.0XJ[] r9 = r10.A06
            r8 = r9[r3]
            if (r8 != 0) goto L_0x006a
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r0) goto L_0x00a6
            r4 = 2147483647(0x7fffffff, float:NaN)
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x005a:
            r0 = r18
            long r0 = A01(0, r8, 0, androidx.compose.ui.unit.Constraints.A00(r0))
            r8 = r51
            long r0 = A04(r8, r0)
            X.0XJ r8 = r5.Bjb(r0)
        L_0x006a:
            r0 = r16
            int r12 = (int) r0
            long r4 = (long) r4
            long r4 = r4 - r6
            java.lang.Integer r11 = X.AnonymousClass00R.A00
            r0 = r51
            if (r0 != r11) goto L_0x00a3
            int r13 = r8.A01
        L_0x0077:
            long r0 = (long) r13
            long r4 = r4 - r0
            r14 = 0
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            r4 = 0
        L_0x0081:
            int r0 = (int) r4
            int r4 = java.lang.Math.min(r12, r0)
            int r13 = r13 + r4
            long r0 = (long) r13
            long r6 = r6 + r0
            r0 = r51
            if (r0 != r11) goto L_0x00a0
            int r1 = r8.A00
        L_0x008f:
            r0 = r40
            int r40 = java.lang.Math.max(r0, r1)
            if (r2 == 0) goto L_0x009d
            X.0Hz r0 = r2.A01
            if (r0 == 0) goto L_0x009d
            X.0Hz r0 = X.C03410Hz.A02
        L_0x009d:
            r9[r3] = r8
            goto L_0x0042
        L_0x00a0:
            int r1 = r8.A01
            goto L_0x008f
        L_0x00a3:
            int r13 = r8.A00
            goto L_0x0077
        L_0x00a6:
            long r0 = (long) r4
            long r0 = r0 - r6
            r11 = 0
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x00b0
            r0 = 0
        L_0x00b0:
            int r8 = (int) r0
            goto L_0x005a
        L_0x00b2:
            if (r41 != 0) goto L_0x00e4
            long r0 = (long) r4
            long r6 = r6 - r0
            r2 = 0
        L_0x00b7:
            long r0 = (long) r2
            long r6 = r6 + r0
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            r6 = 0
        L_0x00c1:
            int r1 = (int) r6
            int r0 = androidx.compose.ui.unit.Constraints.A03(r18)
            int r5 = java.lang.Math.max(r1, r0)
            int r1 = androidx.compose.ui.unit.Constraints.A02(r18)
            r0 = r44
            int r1 = java.lang.Math.max(r1, r0)
            r0 = r40
            int r7 = java.lang.Math.max(r0, r1)
            int[] r6 = new int[r11]
            r0 = 0
        L_0x00dd:
            if (r0 >= r11) goto L_0x01dc
            r6[r0] = r44
            int r0 = r0 + 1
            goto L_0x00dd
        L_0x00e4:
            int r0 = (r42 > r43 ? 1 : (r42 == r43 ? 0 : -1))
            if (r0 <= 0) goto L_0x0139
            int r12 = androidx.compose.ui.unit.Constraints.A01(r18)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == r0) goto L_0x0139
        L_0x00f1:
            int r0 = r41 + -1
            long r4 = (long) r0
            long r4 = r4 * r16
            long r2 = (long) r12
            long r2 = r2 - r6
            long r2 = r2 - r4
            r47 = 0
            int r0 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r0 >= 0) goto L_0x0101
            r2 = 0
        L_0x0101:
            int r0 = (r42 > r43 ? 1 : (r42 == r43 ? 0 : -1))
            if (r0 <= 0) goto L_0x0137
            float r9 = (float) r2
            float r9 = r9 / r42
        L_0x0108:
            r13 = 0
            r38 = r2
        L_0x010b:
            java.lang.String r37 = "weightedSize "
            java.lang.String r36 = "weightUnitSpace "
            java.lang.String r35 = "totalWeight "
            java.lang.String r34 = "remainingToTarget "
            java.lang.String r33 = "arrangementSpacingTotal "
            java.lang.String r32 = "fixedSpace "
            java.lang.String r31 = "weightChildrenCount "
            java.lang.String r30 = "arrangementSpacingPx "
            java.lang.String r29 = "targetSpace "
            java.lang.String r28 = "mainAxisMin "
            if (r13 >= r11) goto L_0x013e
            X.0Jn[] r0 = r10.A05
            r0 = r0[r13]
            if (r0 == 0) goto L_0x0135
            float r8 = r0.A00
        L_0x0129:
            float r14 = r9 * r8
            int r0 = X.C22339B3q.A01(r14)     // Catch:{ IllegalArgumentException -> 0x0203 }
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x0203 }
            long r38 = r38 - r0
            int r13 = r13 + 1
            goto L_0x010b
        L_0x0135:
            r8 = 0
            goto L_0x0129
        L_0x0137:
            r9 = 0
            goto L_0x0108
        L_0x0139:
            int r12 = androidx.compose.ui.unit.Constraints.A03(r18)
            goto L_0x00f1
        L_0x013e:
            r27 = 0
            r8 = 0
        L_0x0141:
            if (r8 >= r11) goto L_0x01c7
            X.0XJ[] r0 = r10.A06
            r26 = r0
            r0 = r0[r8]
            if (r0 != 0) goto L_0x01be
            java.util.List r0 = r10.A04
            java.lang.Object r25 = r0.get(r8)
            r0 = r25
            X.0ul r0 = (X.C17500ul) r0
            r25 = r0
            X.0Jn[] r0 = r10.A05
            r15 = r0[r8]
            if (r15 == 0) goto L_0x02f3
            float r0 = r15.A00
            r24 = r0
            int r0 = (r0 > r43 ? 1 : (r0 == r43 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f3
            int r23 = java.lang.Long.signum(r38)
            r0 = r23
            long r0 = (long) r0
            long r38 = r38 - r0
            float r22 = r9 * r24
            int r1 = X.C22339B3q.A01(r22)
            int r1 = r1 + r23
            r0 = r44
            int r14 = java.lang.Math.max(r0, r1)
            boolean r0 = r15.A02     // Catch:{ IllegalArgumentException -> 0x0273 }
            if (r0 == 0) goto L_0x0186
            r1 = r14
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r14 != r0) goto L_0x0187
        L_0x0186:
            r1 = 0
        L_0x0187:
            int r0 = androidx.compose.ui.unit.Constraints.A00(r18)     // Catch:{ IllegalArgumentException -> 0x0273 }
            r13 = r1
            r1 = r44
            long r20 = A01(r13, r14, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0273 }
            r0 = r20
            r13 = r51
            long r0 = A04(r13, r0)     // Catch:{ IllegalArgumentException -> 0x0273 }
            r13 = r25
            X.0XJ r13 = r13.Bjb(r0)
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            r0 = r51
            if (r0 != r1) goto L_0x01c4
            int r0 = r13.A01
        L_0x01a8:
            int r27 = r27 + r0
            r0 = r51
            if (r0 != r1) goto L_0x01c1
            int r1 = r13.A00
        L_0x01b0:
            r0 = r40
            int r40 = java.lang.Math.max(r0, r1)
            X.0Hz r0 = r15.A01
            if (r0 == 0) goto L_0x01bc
            X.0Hz r0 = X.C03410Hz.A02
        L_0x01bc:
            r26[r8] = r13
        L_0x01be:
            int r8 = r8 + 1
            goto L_0x0141
        L_0x01c1:
            int r1 = r13.A01
            goto L_0x01b0
        L_0x01c4:
            int r0 = r13.A00
            goto L_0x01a8
        L_0x01c7:
            r0 = r27
            long r0 = (long) r0
            long r0 = r0 + r4
            int r2 = androidx.compose.ui.unit.Constraints.A01(r18)
            long r2 = (long) r2
            long r2 = r2 - r6
            r45 = r0
            r49 = r2
            long r0 = X.C28851b7.A05(r45, r47, r49)
            int r2 = (int) r0
            goto L_0x00b7
        L_0x01dc:
            int[] r4 = new int[r11]
            r3 = 0
        L_0x01df:
            if (r3 >= r11) goto L_0x01f8
            X.0XJ[] r0 = r10.A06
            r2 = r0[r3]
            X.C18070vi.A0b(r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            r0 = r51
            if (r0 != r1) goto L_0x01f5
            int r0 = r2.A01
        L_0x01f0:
            r4[r3] = r0
            int r3 = r3 + 1
            goto L_0x01df
        L_0x01f5:
            int r0 = r2.A00
            goto L_0x01f0
        L_0x01f8:
            r0 = r52
            r10.A05(r0, r4, r6, r5)
            X.0Hj r0 = new X.0Hj
            r0.<init>(r6, r7, r5, r11)
            return r0
        L_0x0203:
            r11 = move-exception
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r0 = "This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax "
            r10.append(r0)
            int r0 = androidx.compose.ui.unit.Constraints.A01(r18)
            r10.append(r0)
            r0 = r28
            r10.append(r0)
            int r0 = androidx.compose.ui.unit.Constraints.A03(r18)
            r10.append(r0)
            r1 = r29
            r0 = r30
            X.AnonymousClass000.A1E(r1, r0, r10, r12)
            r0 = r16
            r10.append(r0)
            r12 = r31
            r1 = r32
            r0 = r41
            X.AnonymousClass000.A1E(r12, r1, r10, r0)
            r10.append(r6)
            r0 = r33
            r10.append(r0)
            r10.append(r4)
            r0 = r34
            r10.append(r0)
            r10.append(r2)
            r0 = r35
            r10.append(r0)
            r0 = r42
            r10.append(r0)
            r0 = r36
            r10.append(r0)
            r10.append(r9)
            java.lang.String r0 = "itemWeight "
            r10.append(r0)
            r10.append(r8)
            r0 = r37
            r10.append(r0)
            r10.append(r14)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0j(r10)
            java.lang.Throwable r0 = r0.initCause(r11)
            throw r0
        L_0x0273:
            r10 = move-exception
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax "
            r8.append(r0)
            int r0 = androidx.compose.ui.unit.Constraints.A01(r18)
            r8.append(r0)
            r0 = r28
            r8.append(r0)
            int r0 = androidx.compose.ui.unit.Constraints.A03(r18)
            r8.append(r0)
            r1 = r29
            r0 = r30
            X.AnonymousClass000.A1E(r1, r0, r8, r12)
            r0 = r16
            r8.append(r0)
            r11 = r31
            r1 = r32
            r0 = r41
            X.AnonymousClass000.A1E(r11, r1, r8, r0)
            r8.append(r6)
            r0 = r33
            r8.append(r0)
            r8.append(r4)
            r0 = r34
            r8.append(r0)
            r8.append(r2)
            r0 = r35
            r8.append(r0)
            r0 = r42
            r8.append(r0)
            r0 = r36
            r8.append(r0)
            r8.append(r9)
            java.lang.String r0 = "weight "
            r8.append(r0)
            r0 = r24
            r8.append(r0)
            r0 = r37
            r8.append(r0)
            r0 = r22
            r8.append(r0)
            java.lang.String r0 = "remainderUnit "
            r8.append(r0)
            r0 = r23
            r8.append(r0)
            java.lang.String r0 = "childMainAxisSize "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r8, r14)
            java.lang.Throwable r0 = r0.initCause(r10)
            throw r0
        L_0x02f3:
            java.lang.String r0 = "All weights <= 0 should have placeables"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QF.A06(X.0uo, int, long):X.0Hj");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.0Jn[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0QF(X.C16120rk r6, X.C16130rl r7, X.C03410Hz r8, java.lang.Integer r9, java.util.List r10, X.AnonymousClass0XJ[] r11) {
        /*
            r5 = this;
            r5.<init>()
            r5.A00 = r9
            r5.A01 = r6
            r5.A02 = r7
            r5.A03 = r8
            r5.A04 = r10
            r5.A06 = r11
            int r4 = r10.size()
            X.0Jn[] r3 = new X.C03690Jn[r4]
            r2 = 0
        L_0x0016:
            if (r2 >= r4) goto L_0x002c
            java.util.List r0 = r5.A04
            X.0tL r0 = X.AnonymousClass000.A0g(r0, r2)
            java.lang.Object r1 = r0.BWC()
            boolean r0 = r1 instanceof X.C03690Jn
            if (r0 != 0) goto L_0x0027
            r1 = 0
        L_0x0027:
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0016
        L_0x002c:
            r5.A05 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QF.<init>(X.0rk, X.0rl, X.0Hz, java.lang.Integer, java.util.List, X.0XJ[]):void");
    }

    public static long A01(int i, int i2, int i3, int i4) {
        return C26229CvL.A03(i, i2, i3, i4);
    }
}
