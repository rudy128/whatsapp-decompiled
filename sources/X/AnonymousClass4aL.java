package X;

import com.whatsapp.calling.controls.viewmodel.CallControlStateHolder$uiState$1;
import com.whatsapp.calling.controls.viewmodel.CallControlStateHolder$uiState$2;
import com.whatsapp.calling.controls.viewmodel.CallControlStateHolder$uiState$3;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4aL  reason: invalid class name */
public final class AnonymousClass4aL {
    public int A00;
    public C86534Sa A01;
    public AEW A02;
    public final AnonymousClass1DS A03;
    public final AnonymousClass1DS A04;
    public final C93624jH A05;
    public final C27301Vn A06;
    public final C219217x A07;
    public final C19830z4 A08;
    public final C41731wy A09;
    public final AnonymousClass1DC A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C23421Fz A0F;
    public final C26911Ty A0G;
    public final AnonymousClass1V9 A0H;
    public final C21141AfC A0I;
    public final C41731wy A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final C18600wl A0N;

    public AnonymousClass4aL(C26911Ty r8, AnonymousClass1V9 r9, C93624jH r10, C21141AfC afC, C27301Vn r12, C219217x r13, C19830z4 r14, AnonymousClass1DC r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, C18600wl r22) {
        AnonymousClass00H r5 = r17;
        AnonymousClass00H r2 = r18;
        AnonymousClass00H r1 = r16;
        C18070vi.A0w(r1, r5, r2, r15, afC);
        AnonymousClass00H r3 = r19;
        C72483Me.A16(r9, r13, r14, r3, 7);
        AnonymousClass00H r6 = r20;
        AnonymousClass00H r0 = r21;
        C18600wl r4 = r22;
        C18070vi.A0y(r6, r0, r12, r8, r4);
        this.A0B = r5;
        this.A0C = r2;
        this.A0A = r15;
        this.A0I = afC;
        this.A05 = r10;
        this.A0H = r9;
        this.A07 = r13;
        this.A08 = r14;
        this.A0K = r3;
        this.A0L = r6;
        this.A0M = r0;
        this.A06 = r12;
        this.A0G = r8;
        this.A0N = r4;
        Integer num = AnonymousClass00R.A0C;
        this.A0D = AnonymousClass1DF.A00(num, new AnonymousClass5DI(this));
        this.A0E = AnonymousClass1DF.A00(num, new AnonymousClass5DJ(this));
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A09 = A0o;
        this.A03 = A0o;
        AnonymousClass5WL A002 = ((C85914Pf) C18070vi.A0E(r1)).A00(false);
        Object value = ((C88054Yd) r2.get()).A04.getValue();
        CallControlStateHolder$uiState$1 callControlStateHolder$uiState$1 = new CallControlStateHolder$uiState$1(this, (C30391dr) null);
        C23421Fz[] r110 = new C23421Fz[2];
        AnonymousClass001.A1Q(A002, value, r110);
        this.A0F = AnonymousClass4I5.A00(r4, new C27183DXs((Object) AnonymousClass3MZ.A0L(new CallControlStateHolder$uiState$2(this, (C30391dr) null), new C28243Du4(new AnonymousClass57J((C30391dr) null, callControlStateHolder$uiState$1, r110))), (Object) new CallControlStateHolder$uiState$3(this, (C30391dr) null), 5));
        C41731wy A0o2 = AnonymousClass3MW.A0o();
        this.A0J = A0o2;
        this.A04 = A0o2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C18070vi.A18(r2, r1) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass4E9 A01(X.C86534Sa r25, X.AnonymousClass4aL r26, X.AnonymousClass4U2 r27) {
        /*
            r3 = r26
            X.4Sa r1 = r3.A01
            r11 = 0
            r0 = r25
            if (r1 == 0) goto L_0x0013
            com.whatsapp.jid.UserJid r2 = r1.A0A
            com.whatsapp.jid.UserJid r1 = r0.A0A
            boolean r2 = X.C18070vi.A18(r2, r1)
            if (r2 != 0) goto L_0x002f
        L_0x0013:
            X.1wy r2 = r3.A0J
            X.1Wu r1 = X.C27621Wu.A00
            r2.A0E(r1)
            X.1Ty r2 = r3.A0G
            com.whatsapp.jid.UserJid r1 = r0.A0A
            X.AEW r4 = r2.A08(r1)
            X.AEW r2 = r3.A02
            boolean r2 = X.C18070vi.A18(r2, r4)
            if (r2 != 0) goto L_0x002f
            r3.A02 = r4
            r3.A07()
        L_0x002f:
            r3.A01 = r0
            X.4PO r2 = X.AnonymousClass4XN.A04
            boolean r2 = r2.A00(r0)
            if (r2 == 0) goto L_0x01b3
            X.00H r2 = r3.A0M
            java.lang.Object r5 = r2.get()
            X.4XN r5 = (X.AnonymousClass4XN) r5
            boolean r2 = r0.A0L
            if (r2 == 0) goto L_0x01b1
            X.10w r2 = r0.A06
            java.util.Collection r2 = r2.values()
            X.1M9 r4 = r5.A00
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r2.iterator()
        L_0x0055:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x006f
            java.lang.Object r3 = r6.next()
            X.6qE r3 = (X.C134216qE) r3
            boolean r2 = r3.A0M
            if (r2 != 0) goto L_0x0055
            com.whatsapp.jid.UserJid r2 = r3.A0A
            X.1E7 r2 = r4.A0H(r2)
            X.AnonymousClass1D6.A02(r3, r2, r7)
            goto L_0x0055
        L_0x006f:
            r3 = 3
            java.util.List r6 = X.C98924rw.A00(r7, r3)
            java.util.ArrayList r2 = X.C29351c6.A0D(r6)
            java.util.Iterator r7 = r6.iterator()
        L_0x007c:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r6 = r7.next()
            X.1D6 r6 = (X.AnonymousClass1D6) r6
            java.lang.Object r13 = r6.second
            X.C18070vi.A0X(r13)
            X.1E7 r13 = (X.AnonymousClass1E7) r13
            java.lang.Object r6 = r6.first
            X.6qE r6 = (X.C134216qE) r6
            int r6 = r6.A04
            boolean r18 = X.C17890vO.A1R(r6)
            r17 = -1
            java.lang.Integer r14 = X.AnonymousClass00R.A00
            r15 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            X.4iR r12 = new X.4iR
            r12.<init>(r13, r14, r15, r17, r18)
            r2.add(r12)
            goto L_0x007c
        L_0x00ab:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r10 = r2.iterator()
        L_0x00b3:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00cf
            java.lang.Object r9 = r10.next()
            X.4iR r9 = (X.C93104iR) r9
            X.1E7 r6 = r9.A02
            com.whatsapp.jid.Jid r7 = X.AnonymousClass1E7.A01(r6)
            boolean r6 = r9.A04
            if (r6 == 0) goto L_0x00b3
            if (r7 == 0) goto L_0x00b3
            r8.add(r7)
            goto L_0x00b3
        L_0x00cf:
            boolean r7 = r8.isEmpty()
            r6 = 1
            r14 = 0
            if (r7 != 0) goto L_0x00e7
            int r7 = r8.size()
            if (r7 != r6) goto L_0x01ae
            java.lang.Object r7 = r8.get(r14)
            boolean r7 = X.C18070vi.A18(r7, r1)
            if (r7 == 0) goto L_0x01ae
        L_0x00e7:
            r9 = 1
        L_0x00e8:
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x00f3
            if (r1 == 0) goto L_0x00f3
            r8.add(r1)
        L_0x00f3:
            int r1 = r8.size()
            if (r1 != r6) goto L_0x019b
            X.1Me r4 = r5.A01
            java.lang.Object r1 = r8.get(r14)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.String r7 = r4.A0X(r1)
            r4 = 2131891836(0x7f12167c, float:1.9418403E38)
            if (r9 == 0) goto L_0x010d
            r4 = 2131894260(0x7f121ff4, float:1.942332E38)
        L_0x010d:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r14] = r7
            X.6IR r4 = X.C1402670q.A02(r1, r4)
        L_0x0115:
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0198
            if (r4 == 0) goto L_0x0198
            java.util.List r2 = X.C29431cG.A0v(r2, r3)
            X.4j0 r1 = X.C93454j0.A00
            X.4j2 r3 = new X.4j2
            r3.<init>(r1, r4, r2, r14)
        L_0x0128:
            X.5X1 r3 = (X.AnonymousClass5X1) r3
            X.4ix r4 = r5.A00(r0)
            X.0ve r5 = r5.A02
            r2 = 8524(0x214c, float:1.1945E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r5, r2)
            if (r1 == 0) goto L_0x0195
            boolean r1 = r0.A0Q
            if (r1 == 0) goto L_0x0195
            X.6qE r5 = r0.A07
            if (r5 == 0) goto L_0x0193
            int r2 = r5.A08
            r1 = 6
            boolean r1 = X.AnonymousClass000.A1T(r2, r1)
        L_0x0149:
            r19 = r1 ^ 1
            r15 = 2131231646(0x7f08039e, float:1.8079379E38)
            r21 = 0
            X.4j1 r10 = new X.4j1
            r13 = r11
            r17 = r14
            r18 = r14
            r12 = r11
            r16 = r14
            r20 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r5 == 0) goto L_0x0163
            boolean r14 = r5.A0I
        L_0x0163:
            r22 = 2131232421(0x7f0806a5, float:1.808095E38)
            X.4j1 r1 = new X.4j1
            r19 = r11
            r20 = r11
            r24 = r21
            r25 = r21
            r17 = r1
            r18 = r11
            r23 = r21
            r26 = r14
            r27 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.4ix r2 = new X.4ix
            r2.<init>(r10, r1)
        L_0x0182:
            X.5Wz r2 = (X.C106735Wz) r2
            boolean r1 = r0.A0Q
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x018d
            r0 = 1064682127(0x3f75c28f, float:0.96)
        L_0x018d:
            X.3mm r5 = new X.3mm
            r5.<init>(r4, r2, r3, r0)
            return r5
        L_0x0193:
            r1 = 1
            goto L_0x0149
        L_0x0195:
            X.4iy r2 = X.C93434iy.A00
            goto L_0x0182
        L_0x0198:
            X.4j3 r3 = X.C93484j3.A00
            goto L_0x0128
        L_0x019b:
            X.1Me r1 = r5.A01
            r20 = r6
            r15 = r4
            r16 = r1
            r17 = r8
            r18 = r6
            r19 = r14
            X.4ZN r4 = X.AnonymousClass74H.A04(r15, r16, r17, r18, r19, r20)
            goto L_0x0115
        L_0x01ae:
            r9 = 0
            goto L_0x00e8
        L_0x01b1:
            r5 = 0
            return r5
        L_0x01b3:
            X.00H r1 = r3.A0B
            java.lang.Object r4 = X.C18070vi.A0E(r1)
            X.0vd r4 = (X.C18020vd) r4
            r5 = 1
            X.C18070vi.A0d(r4, r5)
            boolean r1 = r0.A0J
            if (r1 != 0) goto L_0x01cb
            X.6qE r1 = r0.A07
            if (r1 == 0) goto L_0x0200
            boolean r1 = r1.A0F
            if (r1 != r5) goto L_0x0200
        L_0x01cb:
            boolean r1 = r0.A0G
            if (r1 != 0) goto L_0x0200
            r2 = 12603(0x313b, float:1.766E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r2)
            if (r1 == 0) goto L_0x0200
            X.00H r1 = r3.A0K
            java.lang.Object r2 = r1.get()
            X.4N2 r2 = (X.AnonymousClass4N2) r2
            X.0vl r1 = r2.A00
            java.lang.Object r3 = r1.getValue()
            X.5Wz r3 = (X.C106735Wz) r3
            X.0vl r1 = r2.A01
            java.lang.Object r2 = r1.getValue()
            X.5X1 r2 = (X.AnonymousClass5X1) r2
            boolean r1 = r0.A0Q
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x01fa
            r0 = 1064682127(0x3f75c28f, float:0.96)
        L_0x01fa:
            X.3mk r5 = new X.3mk
            r5.<init>(r3, r2, r0)
            return r5
        L_0x0200:
            X.00H r1 = r3.A0L
            java.lang.Object r2 = r1.get()
            X.4Zu r2 = (X.C88464Zu) r2
            int r4 = r3.A00
            X.4jH r1 = r3.A05
            X.A99 r1 = r1.A00
            if (r1 == 0) goto L_0x0212
            java.lang.String r11 = r1.A1B
        L_0x0212:
            X.AEW r1 = r3.A02
            X.4Y6 r3 = new X.4Y6
            r3.<init>(r1, r11)
            r6 = r27
            X.C18070vi.A0d(r6, r5)
            X.4Wh r1 = new X.4Wh
            r1.<init>(r0, r3, r6)
            boolean r3 = r0.A0K
            if (r3 == 0) goto L_0x025d
            boolean r3 = r0.A0P
            if (r3 != 0) goto L_0x025d
            r3 = 2131898283(0x7f122fab, float:1.943148E38)
            r0 = 2131231646(0x7f08039e, float:1.8079379E38)
            r4 = 0
            X.4iz r5 = new X.4iz
            r5.<init>(r3, r0, r4)
            r3 = 2131898125(0x7f122f0d, float:1.9431159E38)
            X.4iz r0 = new X.4iz
            r0.<init>(r3, r4, r4)
            X.4ix r4 = new X.4ix
            r4.<init>(r0, r5)
            X.5X1 r3 = X.C88464Zu.A01(r1, r2)
            X.4Sa r0 = r1.A00
            boolean r0 = r0.A0Q
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0253
            r2 = 1064682127(0x3f75c28f, float:0.96)
        L_0x0253:
            int r0 = X.C88464Zu.A00(r1)
            X.3ml r5 = new X.3ml
            r5.<init>(r4, r3, r2, r0)
            return r5
        L_0x025d:
            boolean r0 = r0.A0Q
            r14 = 0
            if (r0 == 0) goto L_0x0266
            float r14 = (float) r4
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r14 = r14 * r0
        L_0x0266:
            X.0vl r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            X.4j4 r0 = (X.C93494j4) r0
            X.5X0 r6 = A00(r0, r1)
            X.0vl r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            X.4j6 r0 = (X.C93514j6) r0
            X.5X0 r7 = A00(r0, r1)
            X.0vl r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            X.4j8 r0 = (X.C93534j8) r0
            X.5X0 r8 = A00(r0, r1)
            X.0vl r0 = r2.A09
            java.lang.Object r0 = r0.getValue()
            X.4j9 r0 = (X.C93544j9) r0
            X.5X0 r9 = A00(r0, r1)
            X.0vl r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.4j5 r0 = (X.C93504j5) r0
            X.5X0 r10 = A00(r0, r1)
            X.0vl r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            X.4j7 r0 = (X.C93524j7) r0
            X.5X0 r11 = A00(r0, r1)
            X.0vl r0 = r2.A0A
            java.lang.Object r0 = r0.getValue()
            X.4jA r0 = (X.C93554jA) r0
            X.5X0 r12 = A00(r0, r1)
            X.5X1 r13 = X.C88464Zu.A01(r1, r2)
            int r16 = X.C88464Zu.A00(r1)
            X.4Sa r0 = r1.A00
            boolean r0 = r0.A0Q
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x02cd
            r15 = 1064682127(0x3f75c28f, float:0.96)
        L_0x02cd:
            X.3mn r5 = new X.3mn
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aL.A01(X.4Sa, X.4aL, X.4U2):X.4E9");
    }

    public static final void A03(AnonymousClass4aL r3) {
        C134216qE r0;
        A99 a99;
        if (AnonymousClass74H.A0A(r3.A07, r3.A0A, true)) {
            ((AnonymousClass4YS) r3.A0D.getValue()).A01(AnonymousClass4DM.CALL_UPGRADE_NO_PERMISSION);
            return;
        }
        C86534Sa r1 = r3.A01;
        if (r1 != null && !r1.A0L && (r0 = r1.A07) != null && r0.A08 == 0 && (a99 = r3.A05.A00) != null) {
            a99.A0b();
        }
    }

    public static final void A04(AnonymousClass4aL r2, int i) {
        r2.A0H.A01(C17880vN.A0k(), i, 16);
    }

    public final void A05() {
        Log.i("CallControlState/onNegativeButtonClick");
        C86534Sa r0 = this.A01;
        if (r0 == null) {
            Log.w("CallControlState/onNegativeButtonClick: No call");
            return;
        }
        String str = r0.A0C;
        if (str != null) {
            this.A06.BES(str);
        }
        ((AnonymousClass4YS) this.A0D.getValue()).A01(AnonymousClass4DM.REJECT_CALL);
    }

    public final void A06() {
        AnonymousClass4YS A022;
        AnonymousClass4DM r0;
        Log.w("CallControlState/onPositiveButtonClick");
        C86534Sa r4 = this.A01;
        if (r4 != null) {
            String str = r4.A0C;
            if (str != null) {
                this.A06.BES(str);
            }
            if (r4.A0I) {
                Log.w("CallControlState/onPositiveButtonClick: call is full");
                A022 = (AnonymousClass4YS) this.A0D.getValue();
                r0 = AnonymousClass4DM.CALL_FULL;
            } else {
                int i = r4.A00;
                if (i == 1 || i == 2 || i == 3) {
                    Log.i("CallControlState/onPositiveButtonClick: joining call link");
                    A99 a99 = this.A05.A00;
                    if (a99 != null) {
                        a99.A0W();
                        return;
                    }
                    return;
                } else if (r4.A0E == null || r4.A0B != CallState.PRECALLING) {
                    A02(this, "CallControlState/onPositiveButtonClick: accepting call").A01(AnonymousClass4DM.ACCEPT_CALL);
                    A99 a992 = this.A05.A00;
                    if (a992 != null) {
                        a992.A0o(1, r4.A0C, false);
                        return;
                    }
                    return;
                } else {
                    A022 = A02(this, "CallControlState/onPositiveButtonClick: starting call");
                    r0 = AnonymousClass4DM.START_CALL;
                }
            }
            A022.A01(r0);
        }
    }

    public final void A07() {
        C86534Sa r1 = this.A01;
        if (r1 != null) {
            A01(r1, this, C88054Yd.A00(this.A0C));
        }
    }

    public final boolean A08() {
        A99 a99;
        C134216qE r0;
        Log.i("CallControlState/onVideoToggled");
        C18100vl r4 = this.A0D;
        ((AnonymousClass4YS) r4.getValue()).A01(AnonymousClass4DM.CAMERA_BUTTON_PRESSED);
        C86534Sa r2 = this.A01;
        if (r2 != null) {
            if (r2.A0H) {
                Log.e("CallControlState/onVideoToggled call is ending");
            } else if (r2.A0L || (r0 = (C134216qE) r2.A06.get(r2.A0A)) == null || r0.A0B) {
                C134216qE r02 = r2.A07;
                if (r02 != null) {
                    int i = r02.A08;
                    if (AnonymousClass000.A1T(i, 6)) {
                        this.A0I.A06();
                        A99 a992 = this.A05.A00;
                        if (a992 != null) {
                            a992.A0g();
                        }
                    } else if (i == 0) {
                        if (C17890vO.A0B(this.A08).getInt("switch_to_video_call_confirmation_dialog_count", 0) < 5) {
                            ((AnonymousClass4YS) r4.getValue()).A01(AnonymousClass4DM.CALL_UPGRADE_CONFIRMATION);
                            return true;
                        }
                        A03(this);
                        return true;
                    } else if (i == 1) {
                        C21141AfC afC = this.A0I;
                        DRB drb = afC.A02;
                        if (drb != null) {
                            afC.A07(drb.A0D);
                        }
                        A99 a993 = this.A05.A00;
                        if (a993 != null) {
                            a993.A0f();
                            return true;
                        }
                    } else if (i == 3 && (a99 = this.A05.A00) != null) {
                        a99.A0i(0);
                        return true;
                    }
                }
                return true;
            } else {
                Log.e("CallControlState/onVideoToggled AV switch is not enabled");
                ((AnonymousClass4YS) r4.getValue()).A01(AnonymousClass4DM.AV_SWITCH_NOT_ENABLED);
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r11.BgP(r12) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5X0 A00(X.C108595bx r11, X.C87624Wh r12) {
        /*
            boolean r0 = r11.Bh5(r12)
            if (r0 == 0) goto L_0x003f
            X.1D6 r1 = r11.BMH(r12)
            boolean r10 = r11.Bec(r12)
            if (r10 == 0) goto L_0x0017
            boolean r0 = r11.BgP(r12)
            r9 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r9 = 0
        L_0x0018:
            int r5 = r11.BSh(r12)
            int r4 = r11.BaS(r12)
            int r6 = X.AnonymousClass3MZ.A04(r1)
            java.lang.Object r0 = r1.second
            int r7 = X.AnonymousClass000.A0M(r0)
            X.1Xz r3 = r11.BbI(r12)
            X.4DG r2 = r11.BMR(r12)
            int r8 = r11.Bo7(r12)
            r1 = 0
            X.4j1 r0 = new X.4j1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003c:
            X.5X0 r0 = (X.AnonymousClass5X0) r0
            return r0
        L_0x003f:
            X.4j0 r0 = X.C93454j0.A00
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aL.A00(X.5bx, X.4Wh):X.5X0");
    }

    public static AnonymousClass4YS A02(AnonymousClass4aL r0, String str) {
        Log.i(str);
        return (AnonymousClass4YS) r0.A0D.getValue();
    }
}
