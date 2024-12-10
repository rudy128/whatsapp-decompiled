package X;

import java.util.HashSet;

/* renamed from: X.0QR  reason: invalid class name */
public final class AnonymousClass0QR {
    public C06970a9 A00;
    public AnonymousClass0XW A01;
    public AnonymousClass0KF A02;
    public C01850Ad A03;
    public C06970a9 A04;
    public final AnonymousClass0XW A05;
    public final AnonymousClass0XV A06;
    public final AnonymousClass0BQ A07;

    public static final int A00(C17450ug r2) {
        int i = 1;
        if (r2 instanceof C17440uf) {
            i = 3;
        }
        if (r2 instanceof C17380uZ) {
            i |= 4;
        }
        if (r2 instanceof C17420ud) {
            i |= 8;
        }
        if ((r2 instanceof C17410uc) || (r2 instanceof C17430ue)) {
            i |= 32;
        }
        if (r2 instanceof C17390ua) {
            i |= 256;
        }
        if (r2 instanceof C17360uX) {
            i |= 64;
        }
        if (r2 instanceof C17400ub) {
            return i | 128;
        }
        return i;
    }

    public static int A01(AnonymousClass0XV r0, int i) {
        return r0.A0S.A01.A00 & i;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0XW, X.09G] */
    public static final AnonymousClass0XW A02(C17450ug r2, AnonymousClass0XW r3) {
        AnonymousClass0XW r1;
        if (r2 instanceof AnonymousClass0WA) {
            AnonymousClass0XW A012 = ((AnonymousClass0WA) r2).A01();
            A012.A01 = C04970Ps.A01(A012);
            r1 = A012;
        } else {
            ? r12 = new AnonymousClass0XW();
            r12.A01 = A00(r2);
            r12.A00 = r2;
            r12.A02 = new HashSet();
            r1 = r12;
        }
        if (!r1.A07) {
            r1.A06 = true;
            AnonymousClass0XW r0 = r3.A02;
            if (r0 != null) {
                r0.A04 = r1;
                r1.A02 = r0;
            }
            r3.A02 = r1;
            r1.A04 = r3;
            return r1;
        }
        throw AnonymousClass000.A0n("A ModifierNodeElement cannot return an already attached node from create() ");
    }

    public static final AnonymousClass0XW A03(AnonymousClass0XW r3) {
        AnonymousClass0XW r2 = r3.A02;
        AnonymousClass0XW r1 = r3.A04;
        if (r2 != null) {
            r2.A04 = r1;
            r3.A02 = null;
        }
        if (r1 != null) {
            r1.A02 = r2;
            r3.A04 = null;
        }
        C18070vi.A0b(r1);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.0Ih, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.0Ih, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cd, code lost:
        if (r2 != r3) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012f, code lost:
        r19 = X.AnonymousClass000.A1P(r20 % 2);
        r4 = -r5;
        r30 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0138, code lost:
        if (r4 > r5) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013c, code lost:
        if (r4 == r30) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013e, code lost:
        if (r4 == r5) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014a, code lost:
        if (r9[(r4 + 1) + r12] >= r9[(r4 - 1) + r12]) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014c, code lost:
        r3 = r9[(r4 + 1) + r12];
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0152, code lost:
        r1 = r26 - ((r24 - r2) - r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0157, code lost:
        if (r5 == 0) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0159, code lost:
        r18 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015b, code lost:
        if (r2 == r3) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015d, code lost:
        r18 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015f, code lost:
        if (r2 <= r13) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0163, code lost:
        if (r1 <= r25) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0165, code lost:
        r0 = r6.A02;
        r15 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0189, code lost:
        if (X.AnonymousClass0PC.A00((X.C17450ug) r0.A01[r15 + (r2 - 1)], (X.C17450ug) r6.A01.A01[r15 + (r1 - 1)]) == 0) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018b, code lost:
        r2 = r2 - 1;
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0190, code lost:
        r9[r4 + r12] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0194, code lost:
        if (r19 == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0196, code lost:
        r15 = r20 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019a, code lost:
        if (r15 < r30) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019c, code lost:
        if (r15 > r5) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a1, code lost:
        if (r11[r15 + r12] < r2) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a3, code lost:
        r7[0] = r2;
        r7[1] = r1;
        r7[2] = r3;
        r7[3] = r18;
        r7[4] = 1;
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ed, code lost:
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f1, code lost:
        r3 = r9[(r4 - 1) + r12];
        r2 = r3 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(X.C06970a9 r34, X.C06970a9 r35, X.AnonymousClass0XW r36, int r37, boolean r38) {
        /*
            r33 = this;
            r32 = r33
            r0 = r32
            X.0KF r6 = r0.A02
            r4 = r34
            r3 = r35
            r2 = r36
            r1 = r37
            r0 = r38
            if (r6 != 0) goto L_0x01fe
            X.0KF r6 = new X.0KF
            r7 = r4
            r8 = r3
            r9 = r2
            r10 = r32
            r11 = r1
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r10.A02 = r6
        L_0x0020:
            int r0 = r4.A00
            int r29 = r0 - r37
            int r0 = r3.A00
            int r28 = r0 - r37
            int r0 = r29 + r28
            int r0 = r0 + 1
            int r3 = r0 / 2
            int r0 = r3 * 3
            X.0Ih r8 = new X.0Ih
            r8.<init>()
            int[] r0 = new int[r0]
            r8.A01 = r0
            int r0 = r3 * 4
            X.0Ih r10 = new X.0Ih
            r10.<init>()
            int[] r0 = new int[r0]
            r10.A01 = r0
            r2 = 0
            r1 = r29
            r0 = r28
            r10.A02(r2, r1, r2, r0)
            int r0 = r3 * 2
            int r27 = r0 + 1
            r0 = r27
            int[] r11 = new int[r0]
            int[] r9 = new int[r0]
            r0 = 5
            int[] r7 = new int[r0]
        L_0x0059:
            int r0 = r10.A00
            if (r0 == 0) goto L_0x020a
            int[] r1 = r10.A01
            int r0 = r0 + -1
            r10.A00 = r0
            r26 = r1[r0]
            int r0 = r0 + -1
            r10.A00 = r0
            r25 = r1[r0]
            int r0 = r0 + -1
            r10.A00 = r0
            r24 = r1[r0]
            int r0 = r0 + -1
            r10.A00 = r0
            r13 = r1[r0]
            int r23 = r24 - r13
            int r22 = r26 - r25
            r21 = 0
            r14 = 1
            r0 = r23
            if (r0 < r14) goto L_0x0059
            r0 = r22
            if (r0 < r14) goto L_0x0059
            int r0 = r23 + r22
            int r0 = r0 + 1
            int r0 = r0 / 2
            r31 = r0
            int r12 = r27 / 2
            int r0 = r12 + 1
            r11[r0] = r13
            r9[r0] = r24
            r5 = 0
        L_0x0097:
            r0 = r31
            if (r5 >= r0) goto L_0x0059
            int r20 = r23 - r22
            int r0 = java.lang.Math.abs(r20)
            int r0 = r0 % 2
            boolean r19 = X.AnonymousClass000.A1T(r0, r14)
            int r4 = -r5
            r18 = r4
        L_0x00aa:
            if (r4 > r5) goto L_0x012f
            r0 = r18
            if (r4 == r0) goto L_0x00be
            if (r4 == r5) goto L_0x0127
            int r0 = r4 + 1
            int r0 = r0 + r12
            r1 = r11[r0]
            int r0 = r4 + -1
            int r0 = r0 + r12
            r0 = r11[r0]
            if (r1 <= r0) goto L_0x0127
        L_0x00be:
            int r0 = r4 + 1
            int r0 = r0 + r12
            r3 = r11[r0]
            r2 = r3
        L_0x00c4:
            int r0 = r2 - r13
            int r1 = r25 + r0
            int r1 = r1 - r4
            if (r5 == 0) goto L_0x00cf
            int r17 = r1 + -1
            if (r2 == r3) goto L_0x00d1
        L_0x00cf:
            r17 = r1
        L_0x00d1:
            r0 = r24
            if (r2 >= r0) goto L_0x00ff
            r0 = r26
            if (r1 >= r0) goto L_0x00ff
            X.0a9 r0 = r6.A02
            int r15 = r6.A00
            int r16 = r15 + r2
            java.lang.Object[] r0 = r0.A01
            r16 = r0[r16]
            r0 = r16
            X.0ug r0 = (X.C17450ug) r0
            r16 = r0
            X.0a9 r0 = r6.A01
            int r15 = r15 + r1
            java.lang.Object[] r0 = r0.A01
            r15 = r0[r15]
            X.0ug r15 = (X.C17450ug) r15
            r0 = r16
            int r0 = X.AnonymousClass0PC.A00(r0, r15)
            if (r0 == 0) goto L_0x00ff
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L_0x00d1
        L_0x00ff:
            int r0 = r4 + r12
            r11[r0] = r2
            if (r19 == 0) goto L_0x0124
            int r15 = r20 - r4
            int r0 = r18 + 1
            if (r15 < r0) goto L_0x0124
            int r0 = r5 + -1
            if (r15 > r0) goto L_0x0124
            int r15 = r15 + r12
            r0 = r9[r15]
            if (r0 > r2) goto L_0x0124
            r7[r21] = r3
            r7[r14] = r17
            r0 = 2
            r7[r0] = r2
            r0 = 3
            r7[r0] = r1
            r0 = 4
            r7[r0] = r21
            r5 = 0
            goto L_0x01b1
        L_0x0124:
            int r4 = r4 + 2
            goto L_0x00aa
        L_0x0127:
            int r0 = r4 + -1
            int r0 = r0 + r12
            r3 = r11[r0]
            int r2 = r3 + 1
            goto L_0x00c4
        L_0x012f:
            int r0 = r20 % 2
            boolean r19 = X.AnonymousClass000.A1P(r0)
            int r4 = -r5
            r30 = r4
        L_0x0138:
            if (r4 > r5) goto L_0x01fa
            r0 = r30
            if (r4 == r0) goto L_0x014c
            if (r4 == r5) goto L_0x01f1
            int r0 = r4 + 1
            int r0 = r0 + r12
            r1 = r9[r0]
            int r0 = r4 + -1
            int r0 = r0 + r12
            r0 = r9[r0]
            if (r1 >= r0) goto L_0x01f1
        L_0x014c:
            int r0 = r4 + 1
            int r0 = r0 + r12
            r3 = r9[r0]
            r2 = r3
        L_0x0152:
            int r0 = r24 - r2
            int r0 = r0 - r4
            int r1 = r26 - r0
            if (r5 == 0) goto L_0x015d
            int r18 = r1 + 1
            if (r2 == r3) goto L_0x015f
        L_0x015d:
            r18 = r1
        L_0x015f:
            if (r2 <= r13) goto L_0x0190
            r0 = r25
            if (r1 <= r0) goto L_0x0190
            int r16 = r2 + -1
            int r17 = r1 + -1
            X.0a9 r0 = r6.A02
            int r15 = r6.A00
            int r16 = r15 + r16
            java.lang.Object[] r0 = r0.A01
            r16 = r0[r16]
            r0 = r16
            X.0ug r0 = (X.C17450ug) r0
            r16 = r0
            X.0a9 r0 = r6.A01
            int r15 = r15 + r17
            java.lang.Object[] r0 = r0.A01
            r15 = r0[r15]
            X.0ug r15 = (X.C17450ug) r15
            r0 = r16
            int r0 = X.AnonymousClass0PC.A00(r0, r15)
            if (r0 == 0) goto L_0x0190
            int r2 = r2 + -1
            int r1 = r1 + -1
            goto L_0x015f
        L_0x0190:
            int r0 = r4 + r12
            r9[r0] = r2
            if (r19 == 0) goto L_0x01ed
            int r15 = r20 - r4
            r0 = r30
            if (r15 < r0) goto L_0x01ed
            if (r15 > r5) goto L_0x01ed
            int r15 = r15 + r12
            r0 = r11[r15]
            if (r0 < r2) goto L_0x01ed
            r7[r21] = r2
            r7[r14] = r1
            r0 = 2
            r7[r0] = r3
            r0 = 3
            r7[r0] = r18
            r0 = 4
            r7[r0] = r14
            r5 = 1
        L_0x01b1:
            r0 = 2
            r4 = r7[r0]
            r3 = r7[r21]
            int r4 = r4 - r3
            r0 = 3
            r2 = r7[r0]
            r1 = r7[r14]
            int r2 = r2 - r1
            int r0 = java.lang.Math.min(r4, r2)
            if (r0 <= 0) goto L_0x01ce
            if (r2 == r4) goto L_0x01e9
            if (r5 != 0) goto L_0x01cb
            if (r2 <= r4) goto L_0x01e6
            int r1 = r1 + 1
        L_0x01cb:
            r8.A01(r3, r1, r0)
        L_0x01ce:
            r2 = r7[r21]
            r1 = r7[r14]
            r0 = r25
            r10.A02(r13, r2, r0, r1)
            r0 = 2
            r3 = r7[r0]
            r0 = 3
            r2 = r7[r0]
            r1 = r26
            r0 = r24
            r10.A02(r3, r0, r2, r1)
            goto L_0x0059
        L_0x01e6:
            int r3 = r3 + 1
            goto L_0x01cb
        L_0x01e9:
            r8.A01(r3, r1, r4)
            goto L_0x01ce
        L_0x01ed:
            int r4 = r4 + 2
            goto L_0x0138
        L_0x01f1:
            int r0 = r4 + -1
            int r0 = r0 + r12
            r3 = r9[r0]
            int r2 = r3 + -1
            goto L_0x0152
        L_0x01fa:
            int r5 = r5 + 1
            goto L_0x0097
        L_0x01fe:
            r6.A03 = r2
            r6.A00 = r1
            r6.A02 = r4
            r6.A01 = r3
            r6.A04 = r0
            goto L_0x0020
        L_0x020a:
            int r2 = r8.A00
            int r0 = r2 % 3
            if (r0 != 0) goto L_0x026a
            r1 = 3
            if (r2 <= r1) goto L_0x0218
            r0 = 0
            int r2 = r2 - r1
            X.C03470Ih.A00(r8, r0, r2)
        L_0x0218:
            r2 = 0
            r1 = r29
            r0 = r28
            r8.A01(r1, r0, r2)
            r7 = 0
            r5 = 0
            r4 = 0
        L_0x0223:
            int r0 = r8.A00
            if (r7 >= r0) goto L_0x0254
            int[] r3 = r8.A01
            r2 = r3[r7]
            int r0 = r7 + 2
            r1 = r3[r0]
            int r2 = r2 - r1
            int r0 = r7 + 1
            r0 = r3[r0]
            int r0 = r0 - r1
            int r7 = r7 + 3
        L_0x0237:
            if (r5 >= r2) goto L_0x023f
            r6.A00()
            int r5 = r5 + 1
            goto L_0x0237
        L_0x023f:
            if (r4 >= r0) goto L_0x0247
            r6.A01(r4)
            int r4 = r4 + 1
            goto L_0x023f
        L_0x0247:
            int r0 = r1 + -1
            if (r1 <= 0) goto L_0x0223
            r6.A02(r5, r4)
            int r5 = r5 + 1
            int r4 = r4 + 1
            r1 = r0
            goto L_0x0247
        L_0x0254:
            r0 = r32
            X.0XW r0 = r0.A05
            X.0XW r2 = r0.A04
            r1 = 0
        L_0x025b:
            if (r2 == 0) goto L_0x0269
            X.08i r0 = X.AnonymousClass0PC.A00
            if (r2 == r0) goto L_0x0269
            int r0 = r2.A01
            r1 = r1 | r0
            r2.A00 = r1
            X.0XW r2 = r2.A04
            goto L_0x025b
        L_0x0269:
            return
        L_0x026a:
            java.lang.String r0 = "Array size not a multiple of 3"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QR.A04(X.0a9, X.0a9, X.0XW, int, boolean):void");
    }

    public static final void A05(C17450ug r1, C17450ug r2, AnonymousClass0XW r3) {
        if ((r1 instanceof AnonymousClass0WA) && (r2 instanceof AnonymousClass0WA)) {
            AnonymousClass0PC.A02(r3, (AnonymousClass0WA) r2);
        } else if (r3 instanceof AnonymousClass09G) {
            AnonymousClass09G r12 = (AnonymousClass09G) r3;
            if (r12.A07) {
                AnonymousClass09G.A00(r12);
            }
            r12.A00 = r2;
            r12.A01 = A00(r2);
            if (r12.A07) {
                AnonymousClass09G.A01(r12, false);
            }
        } else {
            throw AnonymousClass000.A0n("Unknown Modifier.Node type");
        }
        if (r3.A07) {
            C04970Ps.A03(r3);
        } else {
            r3.A08 = true;
        }
    }

    public static final /* synthetic */ void A06(AnonymousClass0XW r2, AnonymousClass0QR r3, C01850Ad r4) {
        AnonymousClass0BQ r0;
        while (true) {
            r2 = r2.A04;
            if (r2 == null) {
                return;
            }
            if (r2 == AnonymousClass0PC.A00) {
                AnonymousClass0XV A0I = r3.A06.A0I();
                if (A0I != null) {
                    r0 = A0I.A0H();
                } else {
                    r0 = null;
                }
                r4.A1H(r0);
                r3.A03 = r4;
                return;
            } else if ((2 & r2.A01) == 0) {
                r2.A0H(r4);
            } else {
                return;
            }
        }
    }

    public final void A09() {
        for (AnonymousClass0XW r1 = this.A01; r1 != null; r1 = r1.A02) {
            r1.A0F();
            if (r1.A06) {
                C04970Ps.A02(r1);
            }
            if (r1.A08) {
                C04970Ps.A03(r1);
            }
            r1.A06 = false;
            r1.A08 = false;
        }
    }

    public final void A0A() {
        AnonymousClass0BQ r0;
        AnonymousClass0BR r1;
        C01850Ad r4 = this.A07;
        AnonymousClass0XW r3 = this.A05;
        while (true) {
            r3 = r3.A04;
            if (r3 == null) {
                break;
            }
            C17670v2 A022 = AnonymousClass0QV.A02(r3);
            if (A022 != null) {
                if (r3.A0A() != null) {
                    C01850Ad A0A = r3.A0A();
                    C18070vi.A0z(A0A, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    AnonymousClass0BR r12 = (AnonymousClass0BR) A0A;
                    C17670v2 A1O = r12.A1O();
                    r12.A1Q(A022);
                    r1 = r12;
                    if (A1O != r3) {
                        r12.A11();
                        r1 = r12;
                    }
                } else {
                    AnonymousClass0BR r13 = new AnonymousClass0BR(A022, this.A06);
                    r3.A0H(r13);
                    r1 = r13;
                }
                r4.A1H(r1);
                r1.A1G(r4);
                r4 = r1;
            } else {
                r3.A0H(r4);
            }
        }
        AnonymousClass0XV A0I = this.A06.A0I();
        if (A0I != null) {
            r0 = A0I.A0H();
        } else {
            r0 = null;
        }
        r4.A1H(r0);
        this.A03 = r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v3, types: [int] */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C17090tj r21) {
        /*
            r20 = this;
            r8 = r20
            X.0XW r0 = r8.A01
            X.08i r3 = X.AnonymousClass0PC.A00
            if (r0 == r3) goto L_0x0124
            r0.A04 = r3
            r3.A02 = r0
            X.0a9 r9 = r8.A00
            r13 = 0
            if (r9 == 0) goto L_0x0051
            int r5 = r9.A00
        L_0x0013:
            X.0a9 r10 = r8.A04
            r4 = 16
            if (r10 != 0) goto L_0x001f
            X.0ug[] r0 = new X.C17450ug[r4]
            X.0a9 r10 = X.C06970a9.A02(r0)
        L_0x001f:
            r0 = r21
            X.AnonymousClass0PC.A01(r10, r0)
            int r1 = r10.A00
            r2 = 0
            java.lang.String r7 = "expected prior modifier list to be non-empty"
            r6 = 1
            if (r1 != r5) goto L_0x0058
            X.0XW r11 = r3.A02
            r12 = 0
        L_0x002f:
            if (r11 == 0) goto L_0x00db
            if (r12 >= r5) goto L_0x00db
            if (r9 == 0) goto L_0x0053
            java.lang.Object[] r0 = r9.A01
            r4 = r0[r12]
            X.0ug r4 = (X.C17450ug) r4
            java.lang.Object[] r0 = r10.A01
            r1 = r0[r12]
            X.0ug r1 = (X.C17450ug) r1
            int r0 = X.AnonymousClass0PC.A00(r4, r1)
            if (r0 == 0) goto L_0x00d9
            if (r0 != r6) goto L_0x004c
            A05(r4, r1, r11)
        L_0x004c:
            X.0XW r11 = r11.A02
            int r12 = r12 + 1
            goto L_0x002f
        L_0x0051:
            r5 = 0
            goto L_0x0013
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r7)
            throw r0
        L_0x0058:
            X.0XV r6 = r8.A06
            X.0to r0 = r6.A08
            r19 = 1
            if (r0 != 0) goto L_0x0087
            r19 = 0
            if (r5 != 0) goto L_0x0087
            r1 = r3
        L_0x0065:
            int r0 = r10.A00
            if (r13 >= r0) goto L_0x0076
            java.lang.Object[] r0 = r10.A01
            r0 = r0[r13]
            X.0ug r0 = (X.C17450ug) r0
            X.0XW r1 = A02(r0, r1)
            int r13 = r13 + 1
            goto L_0x0065
        L_0x0076:
            X.0XW r0 = r8.A05
            X.0XW r4 = r0.A04
            r1 = 0
        L_0x007b:
            if (r4 == 0) goto L_0x00eb
            if (r4 == r3) goto L_0x00eb
            int r0 = r4.A01
            r1 = r1 | r0
            r4.A00 = r1
            X.0XW r4 = r4.A04
            goto L_0x007b
        L_0x0087:
            if (r1 != 0) goto L_0x00c5
            if (r9 == 0) goto L_0x00c0
            X.0XW r5 = r3.A02
            r4 = 0
        L_0x008e:
            if (r5 == 0) goto L_0x00ac
            int r0 = r9.A00
            if (r4 >= r0) goto L_0x00ac
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x00a3
            r1 = -1
            r0 = 2
            X.C04970Ps.A04(r5, r1, r0)
            r5.A0G()
            r5.A0D()
        L_0x00a3:
            X.0XW r0 = A03(r5)
            X.0XW r5 = r0.A02
            int r4 = r4 + 1
            goto L_0x008e
        L_0x00ac:
            X.0BQ r1 = r8.A07
            X.0XV r0 = r6.A0I()
            if (r0 == 0) goto L_0x00be
            X.0BQ r0 = r0.A0H()
        L_0x00b8:
            r1.A1H(r0)
            r8.A03 = r1
            goto L_0x00ec
        L_0x00be:
            r0 = r2
            goto L_0x00b8
        L_0x00c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r7)
            throw r0
        L_0x00c5:
            if (r9 != 0) goto L_0x00cd
            X.0ug[] r0 = new X.C17450ug[r4]
            X.0a9 r9 = X.C06970a9.A02(r0)
        L_0x00cd:
            r14 = r8
            r15 = r9
            r16 = r10
            r17 = r3
            r18 = r13
            r14.A04(r15, r16, r17, r18, r19)
            goto L_0x00eb
        L_0x00d9:
            X.0XW r11 = r11.A04
        L_0x00db:
            if (r12 >= r5) goto L_0x00ec
            if (r9 == 0) goto L_0x011f
            if (r11 == 0) goto L_0x0118
            X.0XV r0 = r8.A06
            X.0to r0 = r0.A08
            if (r0 == 0) goto L_0x00e8
            r13 = 1
        L_0x00e8:
            r8.A04(r9, r10, r11, r12, r13)
        L_0x00eb:
            r13 = 1
        L_0x00ec:
            r8.A00 = r10
            if (r9 == 0) goto L_0x00f4
            r9.A08()
            r2 = r9
        L_0x00f4:
            r8.A04 = r2
            X.0XW r2 = r3.A02
            if (r2 != 0) goto L_0x00fc
            X.0XW r2 = r8.A05
        L_0x00fc:
            r1 = 0
            r2.A04 = r1
            r3.A02 = r1
            r0 = -1
            r3.A00 = r0
            r3.A0H(r1)
            if (r2 == r3) goto L_0x0111
            r8.A01 = r2
            if (r13 == 0) goto L_0x0110
            r8.A0A()
        L_0x0110:
            return
        L_0x0111:
            java.lang.String r0 = "trimChain did not update the head"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0118:
            java.lang.String r0 = "structuralUpdate requires a non-null tail"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x011f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r7)
            throw r0
        L_0x0124:
            java.lang.String r0 = "padChain called on already padded chain"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QR.A0B(X.0tj):void");
    }

    public AnonymousClass0QR(AnonymousClass0XV r2) {
        this.A06 = r2;
        AnonymousClass0BQ r0 = new AnonymousClass0BQ(r2);
        this.A07 = r0;
        this.A03 = r0;
        C014208k A1O = r0.A1O();
        this.A05 = A1O;
        this.A01 = A1O;
    }

    public final AnonymousClass0BQ A07() {
        return this.A07;
    }

    public final C01850Ad A08() {
        return this.A03;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[");
        AnonymousClass0XW r3 = this.A01;
        AnonymousClass0XW r2 = this.A05;
        if (r3 != r2) {
            while (true) {
                if (r3 != null && r3 != r2) {
                    A10.append(String.valueOf(r3));
                    if (r3.A02 == r2) {
                        break;
                    }
                    A10.append(",");
                    r3 = r3.A02;
                } else {
                    break;
                }
            }
            String obj = A10.toString();
            C18070vi.A0X(obj);
            return obj;
        }
        A10.append("]");
        String obj2 = A10.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }
}
