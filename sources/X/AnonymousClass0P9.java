package X;

/* renamed from: X.0P9  reason: invalid class name */
public abstract class AnonymousClass0P9 {
    public static final AnonymousClass07W A00 = AnonymousClass0PZ.A02(C08920fs.A00);

    public static final void A01(C17100tk r8, C17130tn r9, AnonymousClass1OS r10, AnonymousClass1OS r11, AnonymousClass1OS r12, AnonymousClass1OS r13, C36001nB r14, int i, int i2) {
        C17130tn r4 = r9;
        r9.COC(-975511942);
        int i3 = i2;
        if ((i2 & 14) == 0) {
            i2 = AnonymousClass000.A09(r9.BEd(i) ? 1 : 0) | i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= AnonymousClass001.A0b(r9, r10);
        }
        if ((i3 & 896) == 0) {
            i2 |= AnonymousClass001.A0c(r9, r14);
        }
        if ((i3 & 7168) == 0) {
            i2 |= AnonymousClass001.A0d(r9, r11);
        }
        if ((57344 & i3) == 0) {
            i2 |= AnonymousClass000.A08(r9.BEh(r12) ? 1 : 0);
        }
        C17100tk r92 = r8;
        if ((458752 & i3) == 0) {
            i2 |= AnonymousClass001.A0V(r4, r8);
        }
        if ((3670016 & i3) == 0) {
            i2 |= AnonymousClass001.A0f(r4, r13);
        }
        if ((2995931 & i2) != 599186 || !r4.BZO()) {
            Object[] objArr = {r10, r11, r8, r12, new AnonymousClass0JF(i), r13, r14};
            r4.COB(-568225417);
            int i4 = 0;
            boolean z = false;
            do {
                z |= r4.BEf(objArr[i4]);
                i4++;
            } while (i4 < 7);
            Object CER = r4.CER();
            if (z || CER == AnonymousClass0MH.A00) {
                CER = new C13610ng(r92, r10, r11, r12, r13, r14, i, i2);
                AnonymousClass0VR.A0V(r4, CER);
            }
            AnonymousClass0VR.A0U(r4);
            C04590Nz.A01(r4, (C17090tj) null, (AnonymousClass1OS) CER, 0, 1);
        } else {
            r4.CNR();
        }
        C05660Vf BKF = r4.BKF();
        if (BKF != null) {
            BKF.A03(new C13620nh(r92, r10, r11, r12, r13, r14, i, i3));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r10.BEe(r0) == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r10.BEe(r2) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a1, code lost:
        if (r10.BEf(r25) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0118, code lost:
        if ((r4 & 256) != 0) goto L_0x011a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17100tk r25, X.C17130tn r26, X.C17090tj r27, X.AnonymousClass1OS r28, X.AnonymousClass1OS r29, X.AnonymousClass1OS r30, X.AnonymousClass1OS r31, X.C36001nB r32, int r33, int r34, int r35, long r36, long r38) {
        /*
            r2 = r38
            r0 = r36
            r6 = r33
            r8 = r31
            r9 = r30
            r11 = r29
            r14 = r28
            r24 = r27
            r4 = 9
            r7 = r32
            X.C18070vi.A0d(r7, r4)
            r4 = -1219521777(0xffffffffb74f930f, float:-1.2372401E-5)
            r10 = r26
            r10.COC(r4)
            r4 = r35
            r23 = r35 & 1
            r5 = r34
            r12 = r34 | 6
            if (r23 != 0) goto L_0x0036
            r13 = r34 & 14
            r12 = r5
            if (r13 != 0) goto L_0x0036
            r12 = r24
            int r12 = X.AnonymousClass001.A0Q(r10, r12)
            r12 = r12 | r34
        L_0x0036:
            r22 = r35 & 2
            if (r22 == 0) goto L_0x01db
            r12 = r12 | 48
        L_0x003c:
            r21 = r35 & 4
            if (r21 == 0) goto L_0x01d0
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0042:
            r20 = r35 & 8
            if (r20 == 0) goto L_0x01c5
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x0048:
            r19 = r35 & 16
            if (r19 == 0) goto L_0x01b3
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x004e:
            r18 = r35 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r18 != 0) goto L_0x0064
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r34
            if (r13 != 0) goto L_0x0065
            boolean r13 = r10.BEd(r6)
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r13 == 0) goto L_0x0064
            r15 = 131072(0x20000, float:1.83671E-40)
        L_0x0064:
            r12 = r12 | r15
        L_0x0065:
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r34
            if (r13 != 0) goto L_0x007a
            r13 = r35 & 64
            if (r13 != 0) goto L_0x0077
            boolean r15 = r10.BEe(r0)
            r13 = 1048576(0x100000, float:1.469368E-39)
            if (r15 != 0) goto L_0x0079
        L_0x0077:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x0079:
            r12 = r12 | r13
        L_0x007a:
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r34
            if (r13 != 0) goto L_0x008f
            r13 = r4 & 128(0x80, float:1.794E-43)
            if (r13 != 0) goto L_0x008c
            boolean r15 = r10.BEe(r2)
            r13 = 8388608(0x800000, float:1.17549435E-38)
            if (r15 != 0) goto L_0x008e
        L_0x008c:
            r13 = 4194304(0x400000, float:5.877472E-39)
        L_0x008e:
            r12 = r12 | r13
        L_0x008f:
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r34
            if (r13 != 0) goto L_0x00a6
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 != 0) goto L_0x00a3
            r13 = r25
            boolean r15 = r10.BEf(r13)
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            if (r15 != 0) goto L_0x00a5
        L_0x00a3:
            r13 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00a5:
            r12 = r12 | r13
        L_0x00a6:
            r15 = r4 & 512(0x200, float:7.175E-43)
            r13 = 805306368(0x30000000, float:4.656613E-10)
            if (r15 != 0) goto L_0x00b6
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            r13 = r13 & r34
            if (r13 != 0) goto L_0x00b7
            int r13 = X.AnonymousClass001.A0h(r10, r7)
        L_0x00b6:
            r12 = r12 | r13
        L_0x00b7:
            r15 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r15 = r15 & r12
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r13) goto L_0x00f2
            boolean r13 = r10.BZO()
            if (r13 == 0) goto L_0x00f2
            r10.CNR()
        L_0x00c9:
            X.0Vf r12 = r10.BKF()
            if (r12 == 0) goto L_0x00f1
            X.0o1 r10 = new X.0o1
            r26 = r7
            r27 = r6
            r28 = r5
            r29 = r4
            r30 = r0
            r32 = r2
            r19 = r10
            r20 = r25
            r21 = r24
            r22 = r14
            r23 = r11
            r24 = r9
            r25 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)
            r12.A03(r10)
        L_0x00f1:
            return
        L_0x00f2:
            r10.CNl()
            r13 = r34 & 1
            r17 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r16 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r15 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r13 == 0) goto L_0x0162
            boolean r13 = r10.BQS()
            if (r13 != 0) goto L_0x0162
            r10.CNR()
            r13 = r35 & 64
            if (r13 == 0) goto L_0x0110
            r12 = r12 & r15
        L_0x0110:
            r13 = r4 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x0116
            r12 = r12 & r16
        L_0x0116:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x011c
        L_0x011a:
            r12 = r12 & r17
        L_0x011c:
            r10.BKA()
            X.0nf r15 = new X.0nf
            r16 = r25
            r17 = r14
            r18 = r9
            r19 = r8
            r20 = r11
            r21 = r7
            r22 = r6
            r23 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r13 = -1979205334(0xffffffff8a07b92a, float:-6.534839E-33)
            X.04D r30 = X.AnonymousClass0LC.A00(r10, r15, r13)
            r33 = r12 & 14
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r33 = r33 | r13
            int r13 = r12 >> 12
            r12 = r13 & 896(0x380, float:1.256E-42)
            r33 = r33 | r12
            r12 = r13 & 7168(0x1c00, float:1.0045E-41)
            r33 = r33 | r12
            r34 = 114(0x72, float:1.6E-43)
            r26 = 0
            r31 = 0
            r27 = r10
            r28 = r24
            r29 = r26
            r32 = r31
            r35 = r0
            r37 = r2
            X.AnonymousClass0Pu.A04(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
            goto L_0x00c9
        L_0x0162:
            if (r23 == 0) goto L_0x0166
            X.0WC r24 = X.C17090tj.A00
        L_0x0166:
            if (r22 == 0) goto L_0x016c
            X.1OS r14 = X.C04890Pi.A00()
        L_0x016c:
            if (r21 == 0) goto L_0x0172
            X.1OS r11 = X.C04890Pi.A01()
        L_0x0172:
            if (r20 == 0) goto L_0x0178
            X.1OS r9 = X.C04890Pi.A02()
        L_0x0178:
            if (r19 == 0) goto L_0x017e
            X.1OS r8 = X.C04890Pi.A03()
        L_0x017e:
            if (r18 == 0) goto L_0x0181
            r6 = 1
        L_0x0181:
            r13 = r35 & 64
            if (r13 == 0) goto L_0x0194
            X.07W r0 = X.AnonymousClass0QB.A00
            java.lang.Object r0 = r10.BFh(r0)
            X.0OR r0 = (X.AnonymousClass0OR) r0
            X.0uU r0 = r0.A00
            long r0 = X.AnonymousClass000.A0V(r0)
            r12 = r12 & r15
        L_0x0194:
            r13 = r4 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x019e
            long r2 = X.AnonymousClass0QB.A04(r10, r0)
            r12 = r12 & r16
        L_0x019e:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x011c
            r13 = 757124140(0x2d20cc2c, float:9.140282E-12)
            r10.COB(r13)
            X.0Lg r13 = X.C17100tk.A00
            X.0Ux r25 = X.AnonymousClass0EF.A00(r13, r10)
            X.AnonymousClass0VR.A0T(r10)
            goto L_0x011a
        L_0x01b3:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r34
            if (r13 != 0) goto L_0x004e
            boolean r13 = r10.BEh(r8)
            int r13 = X.AnonymousClass000.A08(r13)
            r12 = r12 | r13
            goto L_0x004e
        L_0x01c5:
            r13 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x0048
            int r13 = X.AnonymousClass001.A0d(r10, r9)
            r12 = r12 | r13
            goto L_0x0048
        L_0x01d0:
            r13 = r5 & 896(0x380, float:1.256E-42)
            if (r13 != 0) goto L_0x0042
            int r13 = X.AnonymousClass001.A0c(r10, r11)
            r12 = r12 | r13
            goto L_0x0042
        L_0x01db:
            r13 = r34 & 112(0x70, float:1.57E-43)
            if (r13 != 0) goto L_0x003c
            int r13 = X.AnonymousClass001.A0b(r10, r14)
            r12 = r12 | r13
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0P9.A00(X.0tk, X.0tn, X.0tj, X.1OS, X.1OS, X.1OS, X.1OS, X.1nB, int, int, int, long, long):void");
    }
}
