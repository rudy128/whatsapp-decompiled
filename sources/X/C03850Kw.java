package X;

/* renamed from: X.0Kw  reason: invalid class name and case insensitive filesystem */
public abstract class C03850Kw {
    public static final AnonymousClass0CL A00(AnonymousClass0Q5 r4, C17130tn r5, Object obj, C22821Di r7) {
        AnonymousClass0CL r0;
        Object value;
        r5.COB(361571134);
        AnonymousClass0VR r2 = (AnonymousClass0VR) r5;
        AnonymousClass0VR.A0P(r2, r4, (Object) null, -721835388, 0);
        if (AnonymousClass001.A1b(r4.A04)) {
            if (!AnonymousClass000.A1Y(r7.invoke(obj))) {
                value = r7.invoke(AnonymousClass0Q5.A02(r4));
            }
            r0 = AnonymousClass0CL.Visible;
            AnonymousClass0VR.A0L(r2);
            return r0;
        }
        Object A1A = AnonymousClass001.A1A(r5);
        if (A1A == AnonymousClass0MH.A00) {
            A1A = AnonymousClass0Q9.A03(false);
            r2.A0c(A1A);
        }
        AnonymousClass0VR.A0R(r2, false);
        C17330uU r1 = (C17330uU) A1A;
        if (AnonymousClass000.A1Y(r7.invoke(AnonymousClass0Q5.A02(r4)))) {
            AnonymousClass000.A1C(r1, true);
        }
        if (!AnonymousClass000.A1Y(r7.invoke(obj))) {
            value = r1.getValue();
        }
        r0 = AnonymousClass0CL.Visible;
        AnonymousClass0VR.A0L(r2);
        return r0;
        if (AnonymousClass000.A1Y(value)) {
            r0 = AnonymousClass0CL.PostExit;
        } else {
            r0 = AnonymousClass0CL.PreEnter;
        }
        AnonymousClass0VR.A0L(r2);
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027a, code lost:
        if (((X.AnonymousClass073) r9).A00.A01 != null) goto L_0x027c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass0KK r24, X.AnonymousClass0KL r25, X.AnonymousClass0Q5 r26, X.C17130tn r27, X.C17090tj r28, X.C22821Di r29, X.AnonymousClass1OS r30, X.C36001nB r31, int r32, int r33) {
        /*
            r13 = 0
            r0 = -891967166(0xffffffffcad5a942, float:-7001249.0)
            r6 = r27
            r6.COC(r0)
            r8 = r33
            r0 = r33 & 1
            r5 = r32
            r4 = r32 | 6
            r7 = r26
            if (r0 != 0) goto L_0x001f
            r0 = r32 & 14
            if (r0 != 0) goto L_0x041b
            int r4 = X.AnonymousClass001.A0Q(r6, r7)
            r4 = r4 | r32
        L_0x001f:
            r0 = r33 & 2
            r11 = r29
            if (r0 == 0) goto L_0x0410
            r4 = r4 | 48
        L_0x0027:
            r0 = r33 & 4
            r27 = r28
            if (r0 == 0) goto L_0x0403
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x002f:
            r0 = r33 & 8
            r29 = r24
            if (r0 == 0) goto L_0x03f6
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0037:
            r0 = r33 & 16
            r28 = r25
            if (r0 == 0) goto L_0x03e6
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x003f:
            r1 = r33 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            r26 = r30
            if (r1 != 0) goto L_0x0053
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r32
            if (r0 != 0) goto L_0x0054
            r0 = r26
            int r0 = X.AnonymousClass001.A0e(r6, r0)
        L_0x0053:
            r4 = r4 | r0
        L_0x0054:
            r1 = r33 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r1 != 0) goto L_0x03e3
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r32
            if (r0 != 0) goto L_0x0065
            int r0 = X.AnonymousClass001.A0W(r6, r13)
            r4 = r4 | r0
        L_0x0065:
            r1 = r8 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r25 = r31
            if (r1 != 0) goto L_0x0079
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r32
            if (r0 != 0) goto L_0x007a
            r0 = r25
            int r0 = X.AnonymousClass001.A0g(r6, r0)
        L_0x0079:
            r4 = r4 | r0
        L_0x007a:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r4
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x00ad
            boolean r0 = r6.BZO()
            if (r0 == 0) goto L_0x00ad
            r6.CNR()
        L_0x008c:
            X.0Vf r1 = r6.BKF()
            if (r1 == 0) goto L_0x00ac
            X.0np r0 = new X.0np
            r19 = r25
            r20 = r5
            r21 = r8
            r12 = r0
            r13 = r29
            r14 = r28
            r15 = r7
            r16 = r27
            r17 = r11
            r18 = r26
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.A03(r0)
        L_0x00ac:
            return
        L_0x00ad:
            X.0uU r12 = r7.A06
            java.lang.Object r0 = r12.getValue()
            java.lang.Object r0 = r11.invoke(r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x00d3
            java.lang.Object r0 = X.AnonymousClass0Q5.A02(r7)
            java.lang.Object r0 = r11.invoke(r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x00d3
            X.0uU r0 = r7.A04
            boolean r0 = X.AnonymousClass001.A1b(r0)
            if (r0 == 0) goto L_0x008c
        L_0x00d3:
            r0 = r4 & 14
            r14 = r0 | 48
            r0 = 1215497572(0x48730564, float:248853.56)
            r6.COB(r0)
            boolean r0 = X.AnonymousClass001.A1X(r6, r7)
            java.lang.Object r2 = r6.CER()
            if (r0 != 0) goto L_0x00eb
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r2 != r0) goto L_0x00f2
        L_0x00eb:
            java.lang.Object r2 = X.AnonymousClass0Q5.A02(r7)
            r6.CRH(r2)
        L_0x00f2:
            r3 = r6
            X.0VR r3 = (X.AnonymousClass0VR) r3
            r10 = 0
            X.AnonymousClass0VR.A0R(r3, r10)
            X.0uU r0 = r7.A04
            boolean r0 = X.AnonymousClass001.A1b(r0)
            if (r0 == 0) goto L_0x0105
            java.lang.Object r2 = X.AnonymousClass0Q5.A02(r7)
        L_0x0105:
            r1 = -466616829(0xffffffffe42ffe03, float:-1.2985935E22)
            r6.COB(r1)
            X.0CL r9 = A00(r7, r6, r2, r11)
            X.AnonymousClass0VR.A0R(r3, r10)
            java.lang.Object r0 = r12.getValue()
            r6.COB(r1)
            X.0CL r2 = A00(r7, r6, r0, r11)
            X.AnonymousClass0VR.A0R(r3, r10)
            r1 = r14 & 14
            int r0 = r14 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r0
            X.0Q5 r2 = X.AnonymousClass0Nf.A01(r7, r6, r9, r2, r1)
            X.AnonymousClass0VR.A0R(r3, r10)
            r0 = r26
            X.0uU r10 = X.AnonymousClass0Ou.A01(r6, r0)
            androidx.compose.animation.core.MutableTransitionState r0 = r2.A01
            X.0uU r9 = r0.A00
            java.lang.Object r12 = r9.getValue()
            X.0uU r0 = r2.A06
            r16 = r0
            java.lang.Object r1 = r16.getValue()
            r0 = r26
            java.lang.Object r12 = r0.invoke(r12, r1)
            r0 = -311852107(0xffffffffed6983b5, float:-4.516827E27)
            boolean r0 = X.AnonymousClass001.A1a(r6, r2, r10, r0)
            java.lang.Object r1 = r6.CER()
            if (r0 != 0) goto L_0x015b
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r1 != r0) goto L_0x0163
        L_0x015b:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 r1 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1
            r1.<init>(r2, r10, r13)
            r3.A0c(r1)
        L_0x0163:
            X.1OS r1 = (X.AnonymousClass1OS) r1
            r0 = 0
            X.AnonymousClass0VR.A0R(r3, r0)
            X.0uU r10 = X.C04950Pq.A02(r6, r12, r1)
            java.lang.Object r0 = r9.getValue()
            X.0CL r1 = X.AnonymousClass0CL.PostExit
            if (r0 != r1) goto L_0x0181
            java.lang.Object r0 = r16.getValue()
            if (r0 != r1) goto L_0x0181
            boolean r0 = X.AnonymousClass001.A1b(r10)
            if (r0 != 0) goto L_0x008c
        L_0x0181:
            boolean r0 = X.AnonymousClass001.A1X(r6, r7)
            java.lang.Object r1 = r6.CER()
            if (r0 != 0) goto L_0x018f
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r1 != r0) goto L_0x0197
        L_0x018f:
            X.0To r1 = new X.0To
            r1.<init>(r2)
            r3.A0c(r1)
        L_0x0197:
            r12 = 0
            X.AnonymousClass0VR.A0R(r3, r12)
            X.0To r1 = (X.AnonymousClass0To) r1
            java.lang.String r17 = "Built-in"
            X.0U0 r0 = X.C04880Ph.A00
            r0 = 914000546(0x367a8aa2, float:3.7333598E-6)
            r6.COB(r0)
            r0 = 21614502(0x149cfa6, float:3.706685E-38)
            r6.COB(r0)
            boolean r0 = X.AnonymousClass001.A1X(r6, r2)
            java.lang.Object r10 = r6.CER()
            if (r0 != 0) goto L_0x01bb
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r10 != r0) goto L_0x01c2
        L_0x01bb:
            X.08V r10 = X.AnonymousClass0Q9.A02(r29)
            r3.A0c(r10)
        L_0x01c2:
            X.AnonymousClass0VR.A0R(r3, r12)
            X.0uU r10 = (X.C17330uU) r10
            java.lang.Object r12 = r9.getValue()
            java.lang.Object r0 = r16.getValue()
            if (r12 != r0) goto L_0x03ca
            java.lang.Object r0 = r9.getValue()
            X.0CL r12 = X.AnonymousClass0CL.Visible
            if (r0 != r12) goto L_0x03ca
            X.0uU r0 = r2.A04
            boolean r0 = X.AnonymousClass001.A1b(r0)
            if (r0 == 0) goto L_0x03c7
            r0 = r29
            r10.setValue(r0)
        L_0x01e6:
            java.lang.Object r10 = r10.getValue()
            X.0KK r10 = (X.AnonymousClass0KK) r10
            r0 = 0
            X.AnonymousClass0VR.A0R(r3, r0)
            r0 = -1363864804(0xffffffffaeb5131c, float:-8.2343216E-11)
            r6.COB(r0)
            boolean r0 = X.AnonymousClass001.A1X(r6, r2)
            java.lang.Object r14 = r6.CER()
            if (r0 != 0) goto L_0x0204
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r14 != r0) goto L_0x020b
        L_0x0204:
            X.08V r14 = X.AnonymousClass0Q9.A02(r28)
            r3.A0c(r14)
        L_0x020b:
            r0 = 0
            X.AnonymousClass0VR.A0R(r3, r0)
            X.0uU r14 = (X.C17330uU) r14
            java.lang.Object r15 = r9.getValue()
            java.lang.Object r0 = r16.getValue()
            if (r15 != r0) goto L_0x03b0
            java.lang.Object r0 = r9.getValue()
            if (r0 != r12) goto L_0x03b0
            X.0uU r0 = r2.A04
            boolean r0 = X.AnonymousClass001.A1b(r0)
            if (r0 == 0) goto L_0x03ad
            r0 = r28
            r14.setValue(r0)
        L_0x022e:
            java.lang.Object r9 = r14.getValue()
            X.0KL r9 = (X.AnonymousClass0KL) r9
            r0 = 0
            X.AnonymousClass0VR.A0R(r3, r0)
            r0 = 1657242209(0x62c78261, float:1.8401484E21)
            r6.COB(r0)
            r14 = 0
            X.AnonymousClass0VR.A0R(r3, r14)
            r0 = 1657242379(0x62c7830b, float:1.8401724E21)
            r6.COB(r0)
            X.AnonymousClass0VR.A0R(r3, r14)
            r0 = 1657242547(0x62c783b3, float:1.840196E21)
            r6.COB(r0)
            X.AnonymousClass0VR.A0R(r3, r14)
            r0 = 642253525(0x264802d5, float:6.9392777E-16)
            r6.COB(r0)
            r0 = r10
            X.072 r0 = (X.AnonymousClass072) r0
            X.0OX r12 = r0.A00
            X.0JC r0 = r12.A00
            if (r0 != 0) goto L_0x026c
            r0 = r9
            X.073 r0 = (X.AnonymousClass073) r0
            X.0OX r0 = r0.A00
            X.0JC r0 = r0.A00
            if (r0 == 0) goto L_0x026d
        L_0x026c:
            r14 = 1
        L_0x026d:
            X.0JX r0 = r12.A01
            if (r0 != 0) goto L_0x027c
            r0 = r9
            X.073 r0 = (X.AnonymousClass073) r0
            X.0OX r0 = r0.A00
            X.0JX r0 = r0.A01
            r16 = 0
            if (r0 == 0) goto L_0x027e
        L_0x027c:
            r16 = 1
        L_0x027e:
            r0 = -1158245383(0xffffffffbaf693f9, float:-0.001881241)
            r6.COB(r0)
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r20 = 0
            if (r14 == 0) goto L_0x03a9
            X.0sg r15 = X.AnonymousClass0MW.A02
            java.lang.Object r14 = X.AnonymousClass000.A0u(r6, r12)
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r14 != r0) goto L_0x02a2
            java.lang.StringBuilder r14 = X.AnonymousClass000.A11(r17)
            java.lang.String r0 = " alpha"
            java.lang.String r14 = X.AnonymousClass000.A0y(r0, r14)
            r6.CRH(r14)
        L_0x02a2:
            r0 = 0
            X.AnonymousClass0VR.A0R(r3, r0)
            java.lang.String r14 = (java.lang.String) r14
            X.0Io r18 = X.AnonymousClass0Nf.A00(r2, r15, r6, r14, r0)
        L_0x02ac:
            r0 = 0
            X.AnonymousClass0VR.A0R(r3, r0)
            r14 = -1158245186(0xffffffffbaf694be, float:-0.0018812639)
            r6.COB(r14)
            if (r16 == 0) goto L_0x02d8
            X.0sg r14 = X.AnonymousClass0MW.A02
            java.lang.Object r13 = X.AnonymousClass000.A0u(r6, r12)
            java.lang.Object r12 = X.AnonymousClass0MH.A00
            if (r13 != r12) goto L_0x02cf
            java.lang.StringBuilder r13 = X.AnonymousClass000.A11(r17)
            java.lang.String r12 = " scale"
            java.lang.String r13 = X.AnonymousClass000.A0y(r12, r13)
            r6.CRH(r13)
        L_0x02cf:
            X.AnonymousClass0VR.A0R(r3, r0)
            java.lang.String r13 = (java.lang.String) r13
            X.0Io r13 = X.AnonymousClass0Nf.A00(r2, r14, r6, r13, r0)
        L_0x02d8:
            X.AnonymousClass0VR.A0R(r3, r0)
            if (r16 == 0) goto L_0x02e5
            X.0sg r14 = X.C04880Ph.A03
            java.lang.String r12 = "TransformOriginInterruptionHandling"
            X.0Io r20 = X.AnonymousClass0Nf.A00(r2, r14, r6, r12, r0)
        L_0x02e5:
            X.0Tp r14 = new X.0Tp
            r15 = r14
            r16 = r10
            r17 = r9
            r19 = r13
            r21 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.AnonymousClass0VR.A0R(r3, r0)
            X.0WC r13 = X.C17090tj.A00
            long r18 = X.AnonymousClass0NB.A01
            X.0s9 r16 = X.AnonymousClass0GC.A00
            long r20 = X.AnonymousClass0GB.A00
            r17 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.graphics.GraphicsLayerElement r12 = new androidx.compose.ui.graphics.GraphicsLayerElement
            r15 = r12
            r22 = r20
            r24 = r0
            r15.<init>(r16, r17, r18, r20, r22, r24)
            androidx.compose.animation.EnterExitTransitionElement r15 = new androidx.compose.animation.EnterExitTransitionElement
            r15.<init>(r10, r9, r14, r2)
            X.0tj r2 = r12.CP5(r15)
            X.AnonymousClass0VR.A0R(r3, r0)
            X.0tj r9 = r2.CP5(r13)
            r2 = r27
            X.0tj r10 = r2.CP5(r9)
            java.lang.Object r14 = X.AnonymousClass001.A1A(r6)
            java.lang.Object r2 = X.AnonymousClass0MH.A00
            if (r14 != r2) goto L_0x0330
            X.0Wx r14 = new X.0Wx
            r14.<init>(r1)
            r3.A0c(r14)
        L_0x0330:
            X.AnonymousClass0VR.A0R(r3, r0)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r6.COB(r2)
            int r13 = r3.A01
            X.0uW r12 = r6.BPs()
            X.0vk r9 = X.C05030Qc.A00()
            X.04D r10 = X.AnonymousClass0LO.A01(r10)
            r6.COE()
            boolean r2 = r3.A0K
            if (r2 == 0) goto L_0x03a5
            r6.BHe(r9)
        L_0x0351:
            X.1OS r2 = X.C05030Qc.A04()
            X.AnonymousClass0EM.A00(r6, r14, r2)
            X.1OS r2 = X.C05030Qc.A06()
            X.AnonymousClass0EM.A00(r6, r12, r2)
            X.1OS r12 = X.C05030Qc.A01()
            boolean r2 = r3.A0K
            if (r2 != 0) goto L_0x0375
            java.lang.Object r9 = r6.CER()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            boolean r2 = X.C18070vi.A18(r9, r2)
            if (r2 != 0) goto L_0x037c
        L_0x0375:
            java.lang.Integer r2 = X.AnonymousClass000.A0r(r6, r13)
            r6.BCJ(r2, r12)
        L_0x037c:
            X.0OT r9 = new X.0OT
            r9.<init>(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r10.invoke(r9, r6, r2)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6.COB(r2)
            int r2 = r4 >> 18
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r2 = r25
            r2.invoke(r1, r6, r4)
            X.AnonymousClass0VR.A0R(r3, r0)
            X.AnonymousClass0VR.A0J(r3)
            goto L_0x008c
        L_0x03a5:
            r6.CRc()
            goto L_0x0351
        L_0x03a9:
            r18 = r13
            goto L_0x02ac
        L_0x03ad:
            X.0KL r0 = X.AnonymousClass0KL.A00
            goto L_0x03c2
        L_0x03b0:
            java.lang.Object r0 = r16.getValue()
            if (r0 == r12) goto L_0x022e
            java.lang.Object r9 = r14.getValue()
            X.0KL r9 = (X.AnonymousClass0KL) r9
            r0 = r28
            X.073 r0 = r9.A00(r0)
        L_0x03c2:
            r14.setValue(r0)
            goto L_0x022e
        L_0x03c7:
            X.0KK r0 = X.AnonymousClass0KK.A00
            goto L_0x03de
        L_0x03ca:
            java.lang.Object r0 = r16.getValue()
            X.0CL r12 = X.AnonymousClass0CL.Visible
            if (r0 != r12) goto L_0x01e6
            java.lang.Object r14 = r10.getValue()
            X.0KK r14 = (X.AnonymousClass0KK) r14
            r0 = r29
            X.072 r0 = r14.A00(r0)
        L_0x03de:
            r10.setValue(r0)
            goto L_0x01e6
        L_0x03e3:
            r4 = r4 | r0
            goto L_0x0065
        L_0x03e6:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r32
            if (r0 != 0) goto L_0x003f
            r0 = r28
            int r0 = X.AnonymousClass001.A0U(r6, r0)
            r4 = r4 | r0
            goto L_0x003f
        L_0x03f6:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0037
            r0 = r29
            int r0 = X.AnonymousClass001.A0T(r6, r0)
            r4 = r4 | r0
            goto L_0x0037
        L_0x0403:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x002f
            r0 = r27
            int r0 = X.AnonymousClass001.A0S(r6, r0)
            r4 = r4 | r0
            goto L_0x002f
        L_0x0410:
            r0 = r32 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0027
            int r0 = X.AnonymousClass001.A0b(r6, r11)
            r4 = r4 | r0
            goto L_0x0027
        L_0x041b:
            r4 = r5
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03850Kw.A01(X.0KK, X.0KL, X.0Q5, X.0tn, X.0tj, X.1Di, X.1OS, X.1nB, int, int):void");
    }
}
