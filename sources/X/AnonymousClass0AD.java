package X;

import java.util.List;

/* renamed from: X.0AD  reason: invalid class name */
public final class AnonymousClass0AD extends C03700Kb {
    public C16910tQ A00;
    public boolean A01 = true;
    public AnonymousClass0Hm A02;
    public boolean A03 = true;
    public boolean A04;
    public final C001100p A05 = new C001100p(2);
    public final AnonymousClass0XW A06;
    public final AnonymousClass0IG A07 = new AnonymousClass0IG();
    public final C06970a9 A08 = C06970a9.A02(new Long[16]);

    public void A00() {
        C06970a9 r0 = this.A00;
        int i = r0.A00;
        if (i > 0) {
            Object[] objArr = r0.A01;
            int i2 = 0;
            do {
                ((C03700Kb) objArr[i2]).A00();
                i2++;
            } while (i2 < i);
        }
        AnonymousClass0XW r4 = this.A06;
        C06970a9 r3 = null;
        while (r4 != null) {
            if (r4 instanceof C17690v4) {
                ((C17690v4) r4).Bnm();
            } else if ((r4.A01 & 16) != 0 && (r4 instanceof C014308l)) {
                int i3 = 0;
                for (AnonymousClass0XW r2 = ((C014308l) r4).A00; r2 != null; r2 = r2.A02) {
                    if ((r2.A01 & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            r4 = r2;
                        } else {
                            r3 = AnonymousClass001.A10(r3);
                            r4 = AnonymousClass000.A0d(r3, r4);
                            r3.A0F(r2);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            r4 = AnonymousClass0QV.A00(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010c, code lost:
        if (r1 == 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.C001100p r39, X.AnonymousClass0IF r40, X.C16910tQ r41, boolean r42) {
        /*
            r38 = this;
            r4 = r38
            r8 = r39
            r14 = r40
            r7 = r41
            r19 = r42
            r0 = r19
            boolean r18 = super.A03(r8, r14, r7, r0)
            X.0XW r10 = r4.A06
            boolean r0 = r10.A07
            r9 = 1
            if (r0 == 0) goto L_0x0219
            r6 = 16
            r5 = 0
        L_0x001a:
            boolean r0 = r10 instanceof X.C17690v4
            if (r0 == 0) goto L_0x00de
            X.0Ad r0 = X.AnonymousClass0QV.A04(r10, r6)
            r4.A00 = r0
        L_0x0024:
            X.0XW r10 = X.AnonymousClass0QV.A00(r5)
        L_0x0028:
            r3 = 0
            if (r10 != 0) goto L_0x001a
            int r17 = r8.A00()
        L_0x002f:
            r0 = r17
            if (r3 >= r0) goto L_0x0110
            long r5 = r8.A02(r3)
            java.lang.Object r2 = r8.A04(r3)
            X.0KX r2 = (X.AnonymousClass0KX) r2
            X.0IG r12 = r4.A07
            int r11 = r12.A00
            r1 = 0
        L_0x0042:
            if (r1 >= r11) goto L_0x00da
            long[] r0 = r12.A01
            r9 = r0[r1]
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0083
            java.util.List r12 = r2.A00()
            java.util.ArrayList r13 = X.AnonymousClass000.A14(r12)
            int r11 = r12.size()
            r10 = 0
        L_0x0059:
            if (r10 >= r11) goto L_0x0086
            java.lang.Object r9 = r12.get(r10)
            X.0IL r9 = (X.AnonymousClass0IL) r9
            long r0 = r9.A02
            r25 = r0
            X.0tQ r15 = r4.A00
            X.C18070vi.A0b(r15)
            long r0 = r9.A01
            long r23 = r15.Bht(r7, r0)
            long r15 = r9.A00
            X.0IL r0 = new X.0IL
            r21 = r25
            r25 = r15
            r20 = r0
            r20.<init>(r21, r23, r25)
            r13.add(r0)
            int r10 = r10 + 1
            goto L_0x0059
        L_0x0083:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0086:
            X.00p r10 = r4.A05
            X.0tQ r9 = r4.A00
            X.C18070vi.A0b(r9)
            long r0 = r2.A07
            long r31 = r9.Bht(r7, r0)
            X.0tQ r9 = r4.A00
            X.C18070vi.A0b(r9)
            long r0 = r2.A06
            long r27 = r9.Bht(r7, r0)
            long r0 = r2.A05
            r25 = r0
            long r0 = r2.A0A
            r29 = r0
            boolean r0 = r2.A0B
            r35 = r0
            long r15 = r2.A08
            boolean r0 = r2.A0C
            r36 = r0
            int r0 = r2.A04
            r22 = r0
            long r11 = r2.A09
            float r0 = r2.A03
            r20 = r0
            long r0 = r2.A00
            r37 = 0
            X.0KX r9 = new X.0KX
            r21 = r20
            r23 = r25
            r25 = r29
            r29 = r15
            r33 = r11
            r20 = r9
            r20.<init>(r21, r22, r23, r25, r27, r29, r31, r33, r35, r36, r37)
            r9.A02 = r13
            r9.A00 = r0
            X.0HS r0 = r2.A01
            r9.A01 = r0
            r10.A0A(r5, r9)
        L_0x00da:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x00de:
            int r0 = r10.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0024
            boolean r0 = r10 instanceof X.C014308l
            if (r0 == 0) goto L_0x0024
            r0 = r10
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x00ee:
            if (r2 == 0) goto L_0x010c
            int r0 = r2.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00fb
            int r1 = r1 + 1
            if (r1 != r9) goto L_0x00fe
            r10 = r2
        L_0x00fb:
            X.0XW r2 = r2.A02
            goto L_0x00ee
        L_0x00fe:
            X.0a9 r5 = X.AnonymousClass001.A10(r5)
            if (r10 == 0) goto L_0x0108
            r5.A0F(r10)
            r10 = 0
        L_0x0108:
            r5.A0F(r2)
            goto L_0x00fb
        L_0x010c:
            if (r1 != r9) goto L_0x0024
            goto L_0x0028
        L_0x0110:
            X.00p r6 = r4.A05
            int r0 = r6.A00()
            if (r0 != 0) goto L_0x0124
            X.0IG r1 = r4.A07
            r0 = 0
            r1.A00 = r0
            X.0a9 r0 = r4.A00
            r0.A08()
            r0 = 1
            return r0
        L_0x0124:
            r0 = 1
            X.0IG r10 = r4.A07
            int r9 = r10.A00
            int r9 = r9 - r0
        L_0x012a:
            r0 = -1
            if (r0 >= r9) goto L_0x0152
            long[] r0 = r10.A01
            r0 = r0[r9]
            int r0 = r8.A01(r0)
            if (r0 >= 0) goto L_0x014f
            r11 = r9
            int r7 = r10.A00
            if (r9 >= r7) goto L_0x014f
            r0 = 1
            int r5 = r7 - r0
        L_0x013f:
            if (r11 >= r5) goto L_0x014b
            long[] r3 = r10.A01
            int r2 = r11 + 1
            r0 = r3[r2]
            r3[r11] = r0
            r11 = r2
            goto L_0x013f
        L_0x014b:
            int r0 = r7 + -1
            r10.A00 = r0
        L_0x014f:
            int r9 = r9 + -1
            goto L_0x012a
        L_0x0152:
            int r0 = r6.A00()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            int r2 = r6.A00()
            r1 = 0
        L_0x0160:
            if (r1 >= r2) goto L_0x016c
            java.lang.Object r0 = r6.A04(r1)
            r5.add(r0)
            int r1 = r1 + 1
            goto L_0x0160
        L_0x016c:
            X.0Hm r3 = new X.0Hm
            r3.<init>(r14, r5)
            java.util.List r2 = r3.A03
            int r7 = r2.size()
            r6 = 0
        L_0x0178:
            if (r6 >= r7) goto L_0x018c
            java.lang.Object r5 = r2.get(r6)
            r0 = r5
            X.0KX r0 = (X.AnonymousClass0KX) r0
            long r0 = r0.A05
            boolean r0 = r14.A00(r0)
            if (r0 != 0) goto L_0x018d
            int r6 = r6 + 1
            goto L_0x0178
        L_0x018c:
            r5 = 0
        L_0x018d:
            X.0KX r5 = (X.AnonymousClass0KX) r5
            if (r5 == 0) goto L_0x01ac
            if (r42 != 0) goto L_0x01f6
            r0 = 0
            r4.A01 = r0
            r7 = 0
        L_0x0197:
            boolean r6 = r4.A04
            if (r7 == r6) goto L_0x01df
            int r1 = r3.A00
            r0 = 3
            if (r1 == r0) goto L_0x01a6
            r0 = 4
            if (r1 == r0) goto L_0x01a6
            r0 = 5
            if (r1 != r0) goto L_0x01df
        L_0x01a6:
            r0 = 5
            if (r7 == 0) goto L_0x01aa
            r0 = 4
        L_0x01aa:
            r3.A00 = r0
        L_0x01ac:
            if (r18 != 0) goto L_0x0216
            int r1 = r3.A00
            r0 = 3
            if (r1 != r0) goto L_0x0216
            X.0Hm r0 = r4.A02
            if (r0 == 0) goto L_0x0216
            java.util.List r11 = r0.A03
            int r1 = r11.size()
            int r0 = r2.size()
            if (r1 != r0) goto L_0x0216
            int r10 = r2.size()
            r9 = 0
        L_0x01c8:
            if (r9 >= r10) goto L_0x0214
            X.0KX r1 = X.AnonymousClass000.A0f(r11, r9)
            X.0KX r0 = X.AnonymousClass000.A0f(r2, r9)
            long r7 = r1.A06
            long r5 = r0.A06
            long r0 = X.AnonymousClass0QY.A03
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0216
            int r9 = r9 + 1
            goto L_0x01c8
        L_0x01df:
            int r1 = r3.A00
            r0 = 4
            if (r1 != r0) goto L_0x01ec
            if (r6 == 0) goto L_0x01ac
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x01ac
        L_0x01ea:
            r0 = 3
            goto L_0x01aa
        L_0x01ec:
            r0 = 5
            if (r1 != r0) goto L_0x01ac
            if (r7 == 0) goto L_0x01ac
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x01ac
            goto L_0x01ea
        L_0x01f6:
            boolean r7 = r4.A01
            if (r7 != 0) goto L_0x0197
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0202
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0197
        L_0x0202:
            X.0tQ r0 = r4.A00
            X.C18070vi.A0b(r0)
            long r0 = r0.BZM()
            boolean r0 = X.AnonymousClass0Oz.A02(r5, r0)
            r7 = r0 ^ 1
            r4.A01 = r7
            goto L_0x0197
        L_0x0214:
            r9 = 0
            goto L_0x0217
        L_0x0216:
            r9 = 1
        L_0x0217:
            r4.A02 = r3
        L_0x0219:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AD.A03(X.00p, X.0IF, X.0tQ, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089 A[LOOP:3: B:34:0x0089->B:38:0x0098, LOOP_START, PHI: r6 r8 
      PHI: (r6v1 X.0a9) = (r6v0 X.0a9), (r6v5 X.0a9) binds: [B:33:0x0087, B:38:0x0098] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v1 X.0XW) = (r8v0 X.0XW), (r8v6 X.0XW) binds: [B:33:0x0087, B:38:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C001100p r14, X.AnonymousClass0IF r15, X.C16910tQ r16, boolean r17) {
        /*
            r13 = this;
            X.00p r11 = r13.A05
            int r0 = r11.A00()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r1 = 0
            if (r0 != 0) goto L_0x00cb
            X.0XW r8 = r13.A06
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x00cb
            X.0Hm r7 = r13.A02
            X.C18070vi.A0b(r7)
            X.0tQ r0 = r13.A00
            X.C18070vi.A0b(r0)
            long r1 = r0.BZM()
            r10 = r8
            r6 = 0
            r9 = r6
        L_0x0024:
            r5 = 1
            if (r10 == 0) goto L_0x0066
            boolean r0 = r10 instanceof X.C17690v4
            if (r0 == 0) goto L_0x0037
            X.0v4 r10 = (X.C17690v4) r10
            X.0CQ r0 = X.AnonymousClass0CQ.Initial
            r10.C0v(r7, r0, r1)
        L_0x0032:
            X.0XW r10 = X.AnonymousClass0QV.A00(r9)
            goto L_0x0024
        L_0x0037:
            int r0 = r10.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0032
            boolean r0 = r10 instanceof X.C014308l
            if (r0 == 0) goto L_0x0032
            r0 = r10
            X.08l r0 = (X.C014308l) r0
            X.0XW r4 = r0.A00
            r3 = 0
        L_0x0047:
            if (r4 == 0) goto L_0x0063
            int r0 = r4.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0054
            int r3 = r3 + 1
            if (r3 != r5) goto L_0x0057
            r10 = r4
        L_0x0054:
            X.0XW r4 = r4.A02
            goto L_0x0047
        L_0x0057:
            X.0a9 r9 = X.AnonymousClass001.A10(r9)
            X.0XW r10 = X.AnonymousClass000.A0d(r9, r10)
            r9.A0F(r4)
            goto L_0x0054
        L_0x0063:
            if (r3 != r5) goto L_0x0032
            goto L_0x0024
        L_0x0066:
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0085
            X.0a9 r0 = r13.A00
            int r10 = r0.A00
            if (r10 <= 0) goto L_0x0085
            java.lang.Object[] r9 = r0.A01
            r4 = 0
        L_0x0073:
            r3 = r9[r4]
            X.0Kb r3 = (X.C03700Kb) r3
            X.0tQ r0 = r13.A00
            X.C18070vi.A0b(r0)
            r12 = r17
            r3.A04(r11, r15, r0, r12)
            int r4 = r4 + 1
            if (r4 < r10) goto L_0x0073
        L_0x0085:
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x00ca
        L_0x0089:
            boolean r0 = r8 instanceof X.C17690v4
            if (r0 == 0) goto L_0x009b
            X.0v4 r8 = (X.C17690v4) r8
            X.0CQ r0 = X.AnonymousClass0CQ.Main
            r8.C0v(r7, r0, r1)
        L_0x0094:
            X.0XW r8 = X.AnonymousClass0QV.A00(r6)
        L_0x0098:
            if (r8 == 0) goto L_0x00ca
            goto L_0x0089
        L_0x009b:
            int r0 = r8.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0094
            boolean r0 = r8 instanceof X.C014308l
            if (r0 == 0) goto L_0x0094
            r0 = r8
            X.08l r0 = (X.C014308l) r0
            X.0XW r4 = r0.A00
            r3 = 0
        L_0x00ab:
            if (r4 == 0) goto L_0x00c7
            int r0 = r4.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00b8
            int r3 = r3 + 1
            if (r3 != r5) goto L_0x00bb
            r8 = r4
        L_0x00b8:
            X.0XW r4 = r4.A02
            goto L_0x00ab
        L_0x00bb:
            X.0a9 r6 = X.AnonymousClass001.A10(r6)
            X.0XW r8 = X.AnonymousClass000.A0d(r6, r8)
            r6.A0F(r4)
            goto L_0x00b8
        L_0x00c7:
            if (r3 != r5) goto L_0x0094
            goto L_0x0098
        L_0x00ca:
            r1 = 1
        L_0x00cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AD.A04(X.00p, X.0IF, X.0tQ, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [int] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r0 = r12.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.AnonymousClass0IF r13) {
        /*
            r12 = this;
            X.00p r6 = r12.A05
            int r0 = r6.A00()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r5 = 0
            if (r0 != 0) goto L_0x007d
            X.0XW r11 = r12.A06
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x007d
            X.0Hm r10 = r12.A02
            X.C18070vi.A0b(r10)
            X.0tQ r0 = r12.A00
            X.C18070vi.A0b(r0)
            long r1 = r0.BZM()
            r9 = r11
            r8 = 0
        L_0x0023:
            r7 = 1
            if (r9 == 0) goto L_0x0065
            boolean r0 = r9 instanceof X.C17690v4
            if (r0 == 0) goto L_0x0036
            X.0v4 r9 = (X.C17690v4) r9
            X.0CQ r0 = X.AnonymousClass0CQ.Final
            r9.C0v(r10, r0, r1)
        L_0x0031:
            X.0XW r9 = X.AnonymousClass0QV.A00(r8)
            goto L_0x0023
        L_0x0036:
            int r0 = r9.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0031
            boolean r0 = r9 instanceof X.C014308l
            if (r0 == 0) goto L_0x0031
            r0 = r9
            X.08l r0 = (X.C014308l) r0
            X.0XW r4 = r0.A00
            r3 = 0
        L_0x0046:
            if (r4 == 0) goto L_0x0062
            int r0 = r4.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0053
            int r3 = r3 + 1
            if (r3 != r7) goto L_0x0056
            r9 = r4
        L_0x0053:
            X.0XW r4 = r4.A02
            goto L_0x0046
        L_0x0056:
            X.0a9 r8 = X.AnonymousClass001.A10(r8)
            X.0XW r9 = X.AnonymousClass000.A0d(r8, r9)
            r8.A0F(r4)
            goto L_0x0053
        L_0x0062:
            if (r3 != r7) goto L_0x0031
            goto L_0x0023
        L_0x0065:
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x007c
            X.0a9 r0 = r12.A00
            int r2 = r0.A00
            if (r2 <= 0) goto L_0x007c
            java.lang.Object[] r1 = r0.A01
        L_0x0071:
            r0 = r1[r5]
            X.0Kb r0 = (X.C03700Kb) r0
            r0.A05(r13)
            int r5 = r5 + 1
            if (r5 < r2) goto L_0x0071
        L_0x007c:
            r5 = 1
        L_0x007d:
            r12.A02(r13)
            r6.A07()
            r0 = 0
            r12.A00 = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AD.A05(X.0IF):boolean");
    }

    public AnonymousClass0AD(AnonymousClass0XW r3) {
        this.A06 = r3;
    }

    public void A02(AnonymousClass0IF r15) {
        super.A02(r15);
        AnonymousClass0Hm r8 = this.A02;
        if (r8 != null) {
            this.A04 = this.A01;
            List list = r8.A03;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass0KX A0f = AnonymousClass000.A0f(list, i);
                if (!A0f.A0B && (!r15.A00(A0f.A05) || !this.A01)) {
                    AnonymousClass0IG r10 = this.A07;
                    long j = A0f.A05;
                    int i2 = r10.A00;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            break;
                        }
                        long[] jArr = r10.A01;
                        if (j != jArr[i3]) {
                            i3++;
                        } else if (i3 < i2) {
                            int i4 = i2 - 1;
                            while (i3 < i4) {
                                int i5 = i3 + 1;
                                jArr[i3] = jArr[i5];
                                i3 = i5;
                            }
                            r10.A00 = i2 - 1;
                        }
                    }
                }
            }
            this.A01 = false;
            this.A03 = AnonymousClass000.A1T(r8.A00, 5);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Node(pointerInputFilter=");
        A10.append(this.A06);
        A10.append(", children=");
        A10.append(this.A00);
        A10.append(", pointerIds=");
        return AnonymousClass001.A1F(this.A07, A10);
    }
}
