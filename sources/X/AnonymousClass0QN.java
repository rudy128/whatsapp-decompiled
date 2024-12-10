package X;

/* renamed from: X.0QN  reason: invalid class name */
public abstract class AnonymousClass0QN {
    public static final float A00 = (48.0f - (4.0f * 2.0f));
    public static final AnonymousClass0Tz A01 = new AnonymousClass0Tz(0.4f, 0.2f, 1.0f);
    public static final AnonymousClass0Tz A02 = new AnonymousClass0Tz(0.2f, 0.8f, 1.0f);
    public static final AnonymousClass0Tz A03 = new AnonymousClass0Tz(0.4f, 1.0f, 1.0f);
    public static final AnonymousClass0Tz A04 = new AnonymousClass0Tz(0.0f, 0.65f, 1.0f);
    public static final AnonymousClass0Tz A05 = new AnonymousClass0Tz(0.1f, 0.45f, 1.0f);

    public static final C05770Vq A01(AnonymousClass0Tt r6, AnonymousClass0IQ r7, C17130tn r8, float f) {
        r8.COB(-644770905);
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(f);
        AnonymousClass0Tt r0 = r6;
        AnonymousClass0IQ r1 = r7;
        C05770Vq A002 = A00(r0, r1, AnonymousClass0MW.A02, r8, valueOf, valueOf2);
        AnonymousClass0VR.A0U(r8);
        return A002;
    }

    public static final /* synthetic */ void A04(C17770vC r5, C016809l r6, float f, float f2, float f3, long j) {
        float f4;
        C016809l r2 = r6;
        if (r6.A02 == 0) {
            f4 = 0.0f;
        } else {
            f4 = ((f2 / (A00 / 2.0f)) * 57.29578f) / 2.0f;
        }
        A05(r5, r2, f + f4, Math.max(f3, 0.1f), j);
    }

    public static final void A05(C17770vC r12, C016809l r13, float f, float f2, long j) {
        float f3 = r13.A01 / 2.0f;
        float A022 = AnonymousClass0QG.A02(r12.BZL()) - (2.0f * f3);
        long A0p = AnonymousClass001.A0p(f3, f3);
        long j2 = AnonymousClass0QY.A03;
        r12.BJO(r13, f, f2, j, A0p, AnonymousClass001.A0p(A022, A022));
    }

    public static final C17090tj A02(C17090tj r2) {
        return AnonymousClass0PD.A02(r2, C11790kg.A00, true);
    }

    public static final C05770Vq A00(AnonymousClass0Tt r7, AnonymousClass0IQ r8, C16590sg r9, C17130tn r10, Object obj, Object obj2) {
        Object A1C = AnonymousClass001.A1C(r10, -1062847727);
        AnonymousClass0Tt r4 = r7;
        AnonymousClass0IQ r5 = r8;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (A1C == AnonymousClass0MH.A00) {
            A1C = new C05770Vq(r4, r5, r9, obj3, obj4);
            AnonymousClass0VR.A0V(r10, A1C);
        }
        AnonymousClass0VR r2 = (AnonymousClass0VR) r10;
        AnonymousClass0VR.A0R(r2, false);
        C05770Vq r3 = (C05770Vq) A1C;
        AnonymousClass0QC.A05(r10, new C08780fe(r4, r3, obj, obj2));
        AnonymousClass0QC.A03(r10, r3, new C10140hr(r3, r5));
        AnonymousClass0VR.A0R(r2, false);
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7.BEe(r12) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C17130tn r23, X.C17090tj r24, float r25, int r26, int r27, int r28, long r29, long r31) {
        /*
            r5 = r26
            r0 = r31
            r6 = r25
            r12 = r29
            r16 = r24
            r2 = -115871647(0xfffffffff917f061, float:-4.930702E34)
            r7 = r23
            r7.COC(r2)
            r10 = r28 & 1
            r4 = r27
            if (r10 == 0) goto L_0x018c
            r8 = r27 | 6
        L_0x001a:
            r2 = r27 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x002d
            r2 = r28 & 2
            if (r2 != 0) goto L_0x002a
            boolean r3 = r7.BEe(r12)
            r2 = 32
            if (r3 != 0) goto L_0x002c
        L_0x002a:
            r2 = 16
        L_0x002c:
            r8 = r8 | r2
        L_0x002d:
            r9 = r28 & 4
            if (r9 == 0) goto L_0x017b
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0033:
            r2 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0046
            r2 = r28 & 8
            if (r2 != 0) goto L_0x0043
            boolean r3 = r7.BEe(r0)
            r2 = 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x0045
        L_0x0043:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0045:
            r8 = r8 | r2
        L_0x0046:
            r3 = r28 & 16
            if (r3 == 0) goto L_0x0169
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x004c:
            r2 = 46811(0xb6db, float:6.5596E-41)
            r8 = r8 & r2
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r2) goto L_0x007a
            boolean r2 = r7.BZO()
            if (r2 == 0) goto L_0x007a
            r7.CNR()
        L_0x005d:
            X.0Vf r3 = r7.BKF()
            if (r3 == 0) goto L_0x0079
            X.0mY r2 = new X.0mY
            r24 = r16
            r25 = r6
            r26 = r5
            r27 = r4
            r29 = r12
            r31 = r0
            r23 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r31)
            r3.A03(r2)
        L_0x0079:
            return
        L_0x007a:
            r7.CNl()
            r2 = r27 & 1
            if (r2 == 0) goto L_0x013a
            boolean r2 = r7.BQS()
            if (r2 != 0) goto L_0x013a
            r7.CNR()
        L_0x008a:
            r7.BKA()
            X.07W r2 = X.AnonymousClass0OD.A01
            java.lang.Object r2 = r7.BFh(r2)
            X.ECa r2 = (X.C28644ECa) r2
            float r3 = r2.CPQ(r6)
            r10 = 0
            r2 = 1082130432(0x40800000, float:4.0)
            r15 = 0
            X.09l r14 = new X.09l
            r14.<init>(r3, r2, r5, r10)
            r2 = 1013651573(0x3c6b1875, float:0.014349093)
            java.lang.Object r8 = X.AnonymousClass001.A1C(r7, r2)
            java.lang.Object r2 = X.AnonymousClass0MH.A00
            if (r8 != r2) goto L_0x00b5
            X.0IQ r8 = new X.0IQ
            r8.<init>()
            X.AnonymousClass0VR.A0V(r7, r8)
        L_0x00b5:
            r3 = r7
            X.0VR r3 = (X.AnonymousClass0VR) r3
            X.AnonymousClass0VR.A0R(r3, r10)
            X.0IQ r8 = (X.AnonymousClass0IQ) r8
            r2 = 8
            r8.A00(r7, r2)
            X.AnonymousClass0VR.A0R(r3, r10)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r10)
            r2 = 5
            java.lang.Integer r22 = java.lang.Integer.valueOf(r2)
            X.0sg r19 = X.AnonymousClass0MW.A05
            X.0ra r9 = X.C02980Gd.A02
            r2 = 6660(0x1a04, float:9.333E-42)
            X.0Tx r11 = new X.0Tx
            r11.<init>(r9, r2, r10)
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            X.0Tt r2 = new X.0Tt
            r2.<init>(r11, r3)
            r17 = r2
            r18 = r8
            r20 = r7
            X.0Vq r18 = A00(r17, r18, r19, r20, r21, r22)
            r11 = 1332(0x534, float:1.867E-42)
            X.0Tx r2 = new X.0Tx
            r2.<init>(r9, r11, r10)
            X.0Tt r9 = new X.0Tt
            r9.<init>(r2, r3)
            r2 = 1133445120(0x438f0000, float:286.0)
            X.0Vq r21 = A01(r9, r8, r7, r2)
            X.0lz r2 = X.C12580lz.A00
            X.0Tw r9 = X.AnonymousClass0DW.A00(r2)
            X.0Tt r2 = new X.0Tt
            r2.<init>(r9, r3)
            r10 = 1133576192(0x43910000, float:290.0)
            X.0Vq r19 = A01(r2, r8, r7, r10)
            X.0m0 r2 = X.C12590m0.A00
            X.0Tw r9 = X.AnonymousClass0DW.A00(r2)
            X.0Tt r2 = new X.0Tt
            r2.<init>(r9, r3)
            X.0Vq r20 = A01(r2, r8, r7, r10)
            X.0tj r3 = A02(r16)
            float r2 = A00
            X.0tj r3 = X.C05130Qo.A08(r3, r2)
            X.0kB r2 = new X.0kB
            r26 = r12
            r22 = r14
            r23 = r6
            r24 = r0
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26)
            X.C02210Dd.A00(r7, r3, r2, r15)
            goto L_0x005d
        L_0x013a:
            if (r10 == 0) goto L_0x013e
            X.0WC r16 = X.C17090tj.A00
        L_0x013e:
            r2 = r28 & 2
            if (r2 == 0) goto L_0x0151
            r2 = 1803349725(0x6b7ceedd, float:3.057773E26)
            r7.COB(r2)
            java.lang.Integer r2 = X.AnonymousClass0G5.A00
            long r12 = X.AnonymousClass0QB.A05(r7, r2)
            X.AnonymousClass0VR.A0T(r7)
        L_0x0151:
            if (r9 == 0) goto L_0x0155
            r6 = 1082130432(0x40800000, float:4.0)
        L_0x0155:
            r2 = r28 & 8
            if (r2 == 0) goto L_0x0164
            r0 = -404222247(0xffffffffe7e80ed9, float:-2.1917258E24)
            r7.COB(r0)
            long r0 = X.C05100Qk.A04
            X.AnonymousClass0VR.A0T(r7)
        L_0x0164:
            if (r3 == 0) goto L_0x008a
            r5 = 2
            goto L_0x008a
        L_0x0169:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r27
            if (r2 != 0) goto L_0x004c
            boolean r2 = r7.BEd(r5)
            int r2 = X.AnonymousClass000.A08(r2)
            r8 = r8 | r2
            goto L_0x004c
        L_0x017b:
            r2 = r4 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0033
            boolean r3 = r7.BEc(r6)
            r2 = 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0189
            r2 = 256(0x100, float:3.59E-43)
        L_0x0189:
            r8 = r8 | r2
            goto L_0x0033
        L_0x018c:
            r2 = r27 & 14
            if (r2 != 0) goto L_0x019a
            r2 = r16
            int r8 = X.AnonymousClass001.A0Z(r7, r2)
            r8 = r8 | r27
            goto L_0x001a
        L_0x019a:
            r8 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QN.A03(X.0tn, X.0tj, float, int, int, int, long, long):void");
    }
}
