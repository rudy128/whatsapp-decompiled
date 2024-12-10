package X;

import androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.0Qh  reason: invalid class name and case insensitive filesystem */
public abstract class C05070Qh {
    public static final C17090tj A00(C04940Pp r1, C05120Qm r2, C17090tj r3) {
        return AnonymousClass0LM.A01(r3, new C10270i4(r1, r2));
    }

    public static final void A03(C04940Pp r7, C26041Cr5 cr5, EBT ebt, C26224CvE cvE, C25147CZy cZy) {
        r7.A0D(AnonymousClass0G0.A00.A0A(r7.A07(), cr5, cvE, cZy, r7.A0A(), r7.A09()));
        A05(r7, ebt, cvE);
    }

    public static final void A02(C04940Pp r3) {
        C25246Cbl A08 = r3.A08();
        if (A08 != null) {
            C05090Qj.A09(r3.A07(), A08, r3.A0A());
        }
        r3.A0D((C25246Cbl) null);
    }

    public static final void A05(C04940Pp r9, EBT ebt, C26224CvE cvE) {
        Snapshot A02;
        C25246Cbl A08;
        C16910tQ A05;
        Snapshot A00 = C04790Ov.A00();
        try {
            A02 = A00.A02();
            AnonymousClass0NM A022 = C04940Pp.A02(r9);
            if (!(A022 == null || (A08 = r9.A08()) == null || (A05 = r9.A05()) == null)) {
                C05090Qj.A03(r9.A00, A05, A022.A03(), ebt, cvE, A08, AnonymousClass001.A1b(r9.A08));
            }
            AnonymousClass0N4.A00(A02);
            A00.A0D();
        } catch (Throwable th) {
            A00.A0D();
            throw th;
        }
    }

    public static final void A07(C05120Qm r11, C17130tn r12, int i) {
        C27069DRu A0C;
        C17130tn r5 = r12;
        r12.COC(-1436003720);
        C04940Pp r0 = r11.A03;
        if (r0 != null && AnonymousClass001.A1b(r0.A0B) && (A0C = r11.A0C()) != null && A0C.length() > 0) {
            boolean A1X = AnonymousClass001.A1X(r12, r11);
            Object CER = r12.CER();
            if (A1X || CER == AnonymousClass0MH.A00) {
                CER = new AnonymousClass0VH(r11, 0);
                r12.CRH(CER);
            }
            AnonymousClass0VR r4 = (AnonymousClass0VR) r5;
            AnonymousClass0VR.A0R(r4, false);
            C16850tK r2 = (C16850tK) CER;
            long A0A = r11.A0A((C28644ECa) r12.BFh(AnonymousClass0OD.A01));
            C17090tj A01 = AnonymousClass0PB.A01(C17090tj.A00, r2, new CoreTextFieldKt$TextFieldCursorHandle$1(r2, r11, (C30391dr) null));
            r12.COB(294220498);
            boolean BEe = r12.BEe(A0A);
            Object CER2 = r12.CER();
            if (BEe || CER2 == AnonymousClass0MH.A00) {
                CER2 = new C09710hA(A0A);
                r4.A0c(CER2);
            }
            AnonymousClass0VR.A0R(r4, false);
            AnonymousClass0P7.A02(r5, AnonymousClass0PD.A02(A01, (C22821Di) CER2, false), (AnonymousClass1OS) null, 384, A0A);
        }
        C05660Vf BKF = r12.BKF();
        if (BKF != null) {
            BKF.A03(new C12770mI(r11, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.C05120Qm r7, X.C17130tn r8, int r9, boolean r10) {
        /*
            r0 = 626339208(0x25552d88, float:1.8490232E-16)
            r8.COC(r0)
            if (r10 == 0) goto L_0x00c1
            X.0Pp r0 = r7.A03
            r4 = 1
            if (r0 == 0) goto L_0x00b2
            X.0NM r0 = X.C04940Pp.A02(r0)
            if (r0 == 0) goto L_0x00b2
            X.CvJ r6 = r0.A03()
            if (r6 == 0) goto L_0x00b2
            X.0Pp r0 = r7.A03
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.A02
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b2
            X.CvE r0 = r7.A0E()
            long r0 = r0.A01()
            boolean r0 = X.C26260Cw5.A04(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0090
            X.EBT r3 = r7.A0D()
            X.CvE r0 = r7.A0E()
            long r0 = r0.A01()
            int r0 = X.AnonymousClass000.A0G(r0)
            int r5 = r3.CB1(r0)
            X.EBT r3 = r7.A0D()
            X.CvE r0 = r7.A0E()
            long r0 = r0.A01()
            int r0 = X.AnonymousClass000.A0H(r0)
            int r0 = r3.CB1(r0)
            X.By3 r5 = r6.A0P(r5)
            int r0 = r0 - r4
            int r0 = java.lang.Math.max(r0, r2)
            X.By3 r3 = r6.A0P(r0)
            r0 = -498386756(0xffffffffe24b38bc, float:-9.371943E20)
            r8.COB(r0)
            X.0Pp r0 = r7.A03
            r1 = 518(0x206, float:7.26E-43)
            if (r0 == 0) goto L_0x007e
            X.0uU r0 = r0.A0E
            boolean r0 = X.AnonymousClass001.A1b(r0)
            if (r0 != r4) goto L_0x007e
            X.AnonymousClass0L5.A00(r7, r8, r5, r1, r4)
        L_0x007e:
            X.AnonymousClass0VR.A0U(r8)
            X.0Pp r0 = r7.A03
            if (r0 == 0) goto L_0x0090
            X.0uU r0 = r0.A0D
            boolean r0 = X.AnonymousClass001.A1b(r0)
            if (r0 != r4) goto L_0x0090
            X.AnonymousClass0L5.A00(r7, r8, r3, r1, r2)
        L_0x0090:
            X.0Pp r1 = r7.A03
            if (r1 == 0) goto L_0x00b2
            boolean r0 = r7.A0R()
            if (r0 == 0) goto L_0x009f
            X.0uU r0 = r1.A0C
            X.AnonymousClass000.A1C(r0, r2)
        L_0x009f:
            X.0uU r0 = r1.A08
            boolean r0 = X.AnonymousClass001.A1b(r0)
            if (r0 == 0) goto L_0x00b2
            X.0uU r0 = r1.A0C
            boolean r0 = X.AnonymousClass001.A1b(r0)
            if (r0 == 0) goto L_0x00c1
            r7.A0K()
        L_0x00b2:
            X.0Vf r1 = r8.BKF()
            if (r1 == 0) goto L_0x00c0
            X.0mN r0 = new X.0mN
            r0.<init>(r7, r9, r10)
            r1.A03(r0)
        L_0x00c0:
            return
        L_0x00c1:
            r7.A0H()
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05070Qh.A08(X.0Qm, X.0tn, int, boolean):void");
    }

    public static final void A09(C05120Qm r8, C17130tn r9, C17090tj r10, AnonymousClass1OS r11, int i) {
        r9.COC(-20551815);
        C16870tM A00 = C04870Pg.A00(r9, AnonymousClass000.A0c(r9), true);
        r9.COB(-1323940314);
        AnonymousClass0VR r2 = (AnonymousClass0VR) r9;
        int i2 = r2.A01;
        C17350uW BPs = r9.BPs();
        C18090vk A002 = C05030Qc.A00();
        AnonymousClass04D A01 = AnonymousClass0LO.A01(r10);
        int A0O = AnonymousClass001.A0O(r9, (((i & 14) | 384) << 3) & 112);
        if (r2.A0K) {
            r9.BHe(A002);
        } else {
            r9.CRc();
        }
        AnonymousClass0EM.A00(r9, A00, C05030Qc.A04());
        AnonymousClass0EM.A00(r9, BPs, C05030Qc.A06());
        AnonymousClass1OS A012 = C05030Qc.A01();
        if (r2.A0K || !C18070vi.A18(r9.CER(), Integer.valueOf(i2))) {
            r9.BCJ(AnonymousClass000.A0r(r9, i2), A012);
        }
        A01.invoke(new AnonymousClass0OT(r9), r9, AnonymousClass000.A0q(A0O));
        r9.COB(2058660585);
        r9.COB(-1985516685);
        r11.invoke(r9, AnonymousClass000.A0p((((i >> 3) & 112) | 8) >> 3));
        AnonymousClass0VR.A0R(r2, false);
        AnonymousClass0VR.A0K(r2);
        C05660Vf BKF = r9.BKF();
        if (BKF != null) {
            BKF.A03(new C13370nI(r8, r10, r11, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: X.09Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: X.09Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.09Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: X.09Y} */
    /* JADX WARNING: type inference failed for: r33v3 */
    /* JADX WARNING: type inference failed for: r33v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0367, code lost:
        if (r25 != false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cd, code lost:
        if (r4.BEf(r36) == false) goto L_0x00cf;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C17210uI r40, X.AnonymousClass0PT r41, X.C17130tn r42, X.C17090tj r43, X.C03380Hv r44, X.C26251Cvq r45, X.C26041Cr5 r46, X.C26224CvE r47, X.EBO r48, X.C22821Di r49, X.C22821Di r50, X.C36001nB r51, int r52, int r53, int r54, int r55, int r56, boolean r57, boolean r58, boolean r59) {
        /*
            r29 = r51
            r35 = r43
            r32 = r45
            r10 = r58
            r31 = r48
            r30 = r50
            r37 = r40
            r27 = r53
            r33 = r44
            r26 = r57
            r28 = r52
            r36 = r46
            r25 = r59
            r34 = r41
            r0 = -958708118(0xffffffffc6db466a, float:-28067.207)
            r4 = r42
            r4.COC(r0)
            r2 = r56
            r0 = r56 & 1
            r59 = r47
            r3 = r54
            if (r0 == 0) goto L_0x0593
            r1 = r54 | 6
        L_0x0030:
            r0 = r56 & 2
            r58 = r49
            if (r0 == 0) goto L_0x0586
            r1 = r1 | 48
        L_0x0038:
            r21 = r56 & 4
            if (r21 == 0) goto L_0x0579
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x003e:
            r20 = r56 & 8
            r19 = 1024(0x400, float:1.435E-42)
            if (r20 == 0) goto L_0x056c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0046:
            r18 = r56 & 16
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r18 == 0) goto L_0x055c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x004e:
            r17 = r56 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r17 != 0) goto L_0x0060
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r54 & r0
            if (r0 != 0) goto L_0x0061
            r0 = r30
            int r0 = X.AnonymousClass001.A0e(r4, r0)
        L_0x0060:
            r1 = r1 | r0
        L_0x0061:
            r16 = r56 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r16 != 0) goto L_0x0073
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r54 & r0
            if (r0 != 0) goto L_0x0074
            r0 = r37
            int r0 = X.AnonymousClass001.A0W(r4, r0)
        L_0x0073:
            r1 = r1 | r0
        L_0x0074:
            r5 = r2 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 != 0) goto L_0x0086
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r54
            if (r0 != 0) goto L_0x0087
            r0 = r33
            int r0 = X.AnonymousClass001.A0X(r4, r0)
        L_0x0086:
            r1 = r1 | r0
        L_0x0087:
            r9 = r2 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 != 0) goto L_0x009d
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r54
            if (r0 != 0) goto L_0x009e
            r0 = r26
            boolean r0 = r4.BEg(r0)
            int r0 = X.AnonymousClass000.A07(r0)
        L_0x009d:
            r1 = r1 | r0
        L_0x009e:
            r8 = r2 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 != 0) goto L_0x00b4
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r54
            if (r0 != 0) goto L_0x00b5
            r0 = r28
            boolean r0 = r4.BEd(r0)
            int r0 = X.AnonymousClass000.A06(r0)
        L_0x00b4:
            r1 = r1 | r0
        L_0x00b5:
            r7 = r2 & 1024(0x400, float:1.435E-42)
            r13 = r55
            if (r7 == 0) goto L_0x0547
            r14 = r55 | 6
        L_0x00bd:
            r0 = r55 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x00d2
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x00cf
            r0 = r36
            boolean r6 = r4.BEf(r0)
            r0 = 32
            if (r6 != 0) goto L_0x00d1
        L_0x00cf:
            r0 = 16
        L_0x00d1:
            r14 = r14 | r0
        L_0x00d2:
            r11 = r2 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x053a
            r14 = r14 | 384(0x180, float:5.38E-43)
        L_0x00d8:
            r12 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x052a
            r14 = r14 | 3072(0xc00, float:4.305E-42)
        L_0x00de:
            r6 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0516
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
        L_0x00e4:
            r0 = 32768(0x8000, float:4.5918E-41)
            r15 = r56 & r0
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r15 != 0) goto L_0x00f9
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r55 & r0
            if (r0 != 0) goto L_0x00fa
            r0 = r29
            int r0 = X.AnonymousClass001.A0e(r4, r0)
        L_0x00f9:
            r14 = r14 | r0
        L_0x00fa:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r1 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x014c
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r14
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x014c
            boolean r0 = r4.BZO()
            if (r0 == 0) goto L_0x014c
            r4.CNR()
        L_0x0115:
            X.0Vf r1 = r4.BKF()
            if (r1 == 0) goto L_0x014b
            X.0oA r0 = new X.0oA
            r38 = r0
            r39 = r37
            r40 = r34
            r41 = r35
            r42 = r33
            r43 = r32
            r44 = r36
            r45 = r59
            r46 = r31
            r47 = r58
            r48 = r30
            r49 = r29
            r50 = r28
            r51 = r27
            r52 = r3
            r53 = r13
            r54 = r2
            r55 = r26
            r56 = r10
            r57 = r25
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            r1.A03(r0)
        L_0x014b:
            return
        L_0x014c:
            r4.CNl()
            r0 = r54 & 1
            if (r0 == 0) goto L_0x04c9
            boolean r0 = r4.BQS()
            if (r0 != 0) goto L_0x04c9
            r4.CNR()
        L_0x015c:
            r4.BKA()
            java.lang.Object r8 = X.AnonymousClass001.A1A(r4)
            java.lang.Object r11 = X.AnonymousClass0MH.A00
            if (r8 != r11) goto L_0x016f
            X.0Mr r8 = new X.0Mr
            r8.<init>()
            X.AnonymousClass0VR.A0V(r4, r8)
        L_0x016f:
            r9 = r4
            X.0VR r9 = (X.AnonymousClass0VR) r9
            r12 = 0
            X.AnonymousClass0VR.A0R(r9, r12)
            X.0Mr r8 = (X.C04310Mr) r8
            X.07W r0 = X.AnonymousClass0OD.A09
            java.lang.Object r24 = r4.BFh(r0)
            r0 = r24
            X.CZy r0 = (X.C25147CZy) r0
            r24 = r0
            X.07W r0 = X.AnonymousClass0OD.A01
            java.lang.Object r23 = r4.BFh(r0)
            r0 = r23
            X.ECa r0 = (X.C28644ECa) r0
            r23 = r0
            X.07W r0 = X.AnonymousClass0OD.A03
            java.lang.Object r5 = r4.BFh(r0)
            X.E3V r5 = (X.E3V) r5
            X.07W r0 = X.AnonymousClass0GS.A01
            java.lang.Object r0 = r4.BFh(r0)
            X.0Jc r0 = (X.C03630Jc) r0
            long r0 = r0.A00
            r16 = r0
            X.07W r0 = X.AnonymousClass0OD.A02
            java.lang.Object r22 = r4.BFh(r0)
            r0 = r22
            X.0s7 r0 = (X.C16350s7) r0
            r22 = r0
            X.07W r0 = X.AnonymousClass0OD.A0C
            java.lang.Object r21 = r4.BFh(r0)
            r0 = r21
            X.0rL r0 = (X.C15870rL) r0
            r21 = r0
            X.07W r0 = X.AnonymousClass0OD.A08
            java.lang.Object r6 = r4.BFh(r0)
            X.0sx r6 = (X.C16750sx) r6
            r1 = 1
            r0 = r28
            if (r0 != r1) goto L_0x04c5
            if (r26 != 0) goto L_0x04c5
            boolean r0 = r36.A01()
            if (r0 == 0) goto L_0x04c5
            X.0CI r15 = X.AnonymousClass0CI.Horizontal
        L_0x01d3:
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r14[r12] = r15
            X.0sp r7 = X.AnonymousClass0OP.A05
            r0 = 294183095(0x1188e0b7, float:2.1595508E-28)
            boolean r0 = X.AnonymousClass000.A1V(r4, r15, r0)
            java.lang.Object r1 = r4.CER()
            if (r0 != 0) goto L_0x01e8
            if (r1 != r11) goto L_0x01f0
        L_0x01e8:
            X.0eJ r1 = new X.0eJ
            r1.<init>(r15)
            r9.A0c(r1)
        L_0x01f0:
            X.0vk r1 = (X.C18090vk) r1
            X.AnonymousClass0VR.A0R(r9, r12)
            r0 = 4
            java.lang.Object r20 = X.AnonymousClass0EU.A00(r4, r7, r1, r14, r0)
            r0 = r20
            X.0OP r0 = (X.AnonymousClass0OP) r0
            r20 = r0
            r1 = r31
            r0 = r59
            boolean r0 = X.AnonymousClass001.A1Y(r4, r0, r1)
            java.lang.Object r7 = r4.CER()
            if (r0 != 0) goto L_0x0210
            if (r7 != r11) goto L_0x022b
        L_0x0210:
            X.DRu r1 = r59.A02()
            r0 = r31
            X.Cc3 r7 = X.C04560Nw.A01(r1, r0)
            X.Cw5 r0 = r59.A03()
            if (r0 == 0) goto L_0x0228
            long r0 = r0.A06()
            X.Cc3 r7 = X.C05090Qj.A01(r7, r0)
        L_0x0228:
            r4.CRH(r7)
        L_0x022b:
            X.AnonymousClass0VR.A0R(r9, r12)
            X.Cc3 r7 = (X.C25262Cc3) r7
            X.DRu r42 = r7.A00()
            X.EBT r19 = r7.A01()
            X.0Vf r12 = r9.A0Z()
            if (r12 == 0) goto L_0x05a4
            int r0 = r12.A01
            r0 = r0 | 1
            r12.A01 = r0
            boolean r0 = X.AnonymousClass001.A1X(r4, r6)
            java.lang.Object r1 = r4.CER()
            if (r0 != 0) goto L_0x0250
            if (r1 != r11) goto L_0x0267
        L_0x0250:
            X.0Q4 r0 = new X.0Q4
            r41 = r0
            r43 = r32
            r44 = r5
            r45 = r23
            r46 = r26
            r41.<init>(r42, r43, r44, r45, r46)
            X.0Pp r1 = new X.0Pp
            r1.<init>(r0, r12, r6)
            r9.A0c(r1)
        L_0x0267:
            r0 = 0
            X.AnonymousClass0VR.A0R(r9, r0)
            X.0Pp r1 = (X.C04940Pp) r1
            X.DRu r41 = r59.A02()
            r38 = r1
            r39 = r34
            r40 = r22
            r43 = r32
            r44 = r5
            r45 = r23
            r46 = r58
            r47 = r16
            r49 = r26
            r38.A0C(r39, r40, r41, r42, r43, r44, r45, r46, r47, r49)
            X.CZx r12 = r1.A07()
            X.Cbl r6 = r1.A08()
            r5 = r59
            r12.A02(r5, r6)
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r6 = X.AnonymousClass000.A0u(r4, r12)
            if (r6 != r11) goto L_0x02a4
            X.0NN r6 = new X.0NN
            r6.<init>()
            r9.A0c(r6)
        L_0x02a4:
            X.AnonymousClass0VR.A0R(r9, r0)
            X.0NN r6 = (X.AnonymousClass0NN) r6
            r6.A04(r5, java.lang.System.currentTimeMillis())
            java.lang.Object r5 = X.AnonymousClass000.A0u(r4, r12)
            if (r5 != r11) goto L_0x02ba
            X.0Qm r5 = new X.0Qm
            r5.<init>(r6)
            r9.A0c(r5)
        L_0x02ba:
            X.AnonymousClass0VR.A0R(r9, r0)
            X.0Qm r5 = (X.C05120Qm) r5
            r0 = r19
            r5.A0M(r0)
            r0 = r31
            r5.A0N(r0)
            X.1Di r18 = r1.A0A()
            r0 = r18
            r5.A0O(r0)
            r5.A03 = r1
            X.0uU r12 = r5.A0J
            r0 = r59
            r12.setValue(r0)
            X.07W r0 = X.AnonymousClass0OD.A00
            java.lang.Object r0 = r4.BFh(r0)
            X.0sw r0 = (X.C16740sw) r0
            r5.A06 = r0
            X.07W r0 = X.AnonymousClass0OD.A0A
            java.lang.Object r0 = r4.BFh(r0)
            X.0sN r0 = (X.C16510sN) r0
            r5.A07 = r0
            X.07W r0 = X.AnonymousClass0OD.A04
            java.lang.Object r0 = r4.BFh(r0)
            X.0rE r0 = (X.C15800rE) r0
            r5.A05 = r0
            r5.A04 = r8
            r17 = r25 ^ 1
            X.0uU r12 = r5.A0I
            r0 = r17
            X.AnonymousClass000.A1C(r12, r0)
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            java.lang.Object r14 = X.AnonymousClass001.A1C(r4, r0)
            if (r14 != r11) goto L_0x031b
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.1OX r0 = X.AnonymousClass0QC.A00(r4, r0)
            X.0Vk r14 = new X.0Vk
            r14.<init>(r0)
            r4.CRH(r14)
        L_0x031b:
            r12 = 0
            X.AnonymousClass0VR.A0R(r9, r12)
            X.0Vk r14 = (X.C05710Vk) r14
            X.1OX r46 = r14.A00()
            X.AnonymousClass0VR.A0R(r9, r12)
            java.lang.Object r14 = X.AnonymousClass001.A1A(r4)
            if (r14 != r11) goto L_0x0336
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl r14 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl
            r14.<init>()
            r9.A0c(r14)
        L_0x0336:
            X.AnonymousClass0VR.A0R(r9, r12)
            X.0rs r14 = (X.C16200rs) r14
            X.0WC r0 = X.C17090tj.A00
            X.0kD r11 = new X.0kD
            r38 = r11
            r39 = r14
            r40 = r1
            r41 = r5
            r42 = r36
            r43 = r19
            r44 = r59
            r45 = r24
            r47 = r10
            r48 = r25
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r15 = r37
            X.0tj r16 = X.AnonymousClass0E2.A00(r15, r0, r8, r11, r10)
            r11 = -55007276(0xfffffffffcb8a7d4, float:-7.6702926E36)
            r4.COB(r11)
            if (r24 == 0) goto L_0x0386
            if (r10 == 0) goto L_0x0369
            r11 = 1
            if (r25 == 0) goto L_0x036a
        L_0x0369:
            r11 = 0
        L_0x036a:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            X.0uU r41 = X.AnonymousClass0Ou.A01(r4, r11)
            X.1Wu r15 = X.C27621Wu.A00
            r44 = 0
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2 r11 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
            r38 = r11
            r39 = r1
            r40 = r5
            r43 = r24
            r38.<init>(r39, r40, r41, r42, r43, r44)
            X.AnonymousClass0QC.A04(r4, r15, r11)
        L_0x0386:
            X.AnonymousClass0VR.A0R(r9, r12)
            X.0h8 r9 = new X.0h8
            r9.<init>(r1)
            X.0tj r12 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A01(r0, r9)
            X.0k3 r11 = new X.0k3
            r38 = r11
            r39 = r1
            r40 = r5
            r41 = r8
            r42 = r19
            r43 = r25
            r38.<init>(r39, r40, r41, r42, r43)
            r9 = r37
            X.0tj r12 = X.AnonymousClass0E4.A00(r9, r12, r11, r10)
            X.0sk r11 = r5.A0F
            X.0tK r9 = r5.A0E
            X.0tj r12 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A00(r9, r11, r12)
            X.0tY r11 = X.AnonymousClass0G1.A00
            androidx.compose.ui.input.pointer.PointerHoverIconModifierElement r9 = new androidx.compose.ui.input.pointer.PointerHoverIconModifierElement
            r9.<init>(r11)
            X.0tj r15 = r12.CP5(r9)
            X.0je r12 = new X.0je
            r11 = r19
            r9 = r59
            r12.<init>(r1, r11, r9)
            X.0tj r44 = X.C04490Np.A00(r0, r12)
            X.0k9 r9 = new X.0k9
            r45 = r9
            r46 = r1
            r47 = r5
            r48 = r21
            r49 = r11
            r50 = r59
            r51 = r10
            r45.<init>(r46, r47, r48, r49, r50, r51)
            X.0tj r45 = X.C02640Eu.A00(r0, r9)
            X.0m8 r9 = new X.0m8
            r46 = r9
            r47 = r1
            r48 = r5
            r49 = r8
            r50 = r36
            r51 = r11
            r52 = r59
            r53 = r7
            r54 = r10
            r55 = r25
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r7 = 1
            X.0tj r12 = X.AnonymousClass0PD.A02(r0, r9, r7)
            if (r10 == 0) goto L_0x04c2
            if (r25 != 0) goto L_0x04c2
        L_0x0402:
            r38 = r1
            r39 = r0
            r40 = r33
            r41 = r11
            r42 = r59
            r43 = r7
            X.0tj r43 = X.C03990Lk.A00(r38, r39, r40, r41, r42, r43)
            X.0h6 r7 = new X.0h6
            r7.<init>(r5)
            X.AnonymousClass0QC.A03(r4, r5, r7)
            X.0js r11 = new X.0js
            r9 = r36
            r8 = r24
            r7 = r59
            r11.<init>(r1, r9, r7, r8)
            X.AnonymousClass0QC.A03(r4, r9, r11)
            r8 = 1
            r7 = r28
            boolean r55 = X.AnonymousClass000.A1T(r7, r8)
            int r53 = r36.A00()
            r46 = r1
            r47 = r6
            r49 = r0
            r50 = r19
            r51 = r59
            r52 = r18
            r54 = r17
            X.0tj r7 = X.AnonymousClass0E3.A00(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r8 = r35
            r6 = r16
            X.0tj r8 = r8.CP5(r6)
            r6 = r22
            X.0tj r6 = X.AnonymousClass0E1.A00(r1, r8, r6)
            X.0tj r6 = A00(r1, r5, r6)
            X.0tj r8 = r6.CP5(r7)
            r7 = r37
            r6 = r20
            X.0tj r6 = X.C04420Ni.A00(r7, r6, r8, r10)
            X.0tj r6 = r6.CP5(r15)
            X.0tj r7 = r6.CP5(r12)
            X.0h7 r6 = new X.0h7
            r6.<init>(r1)
            X.0tj r6 = X.C02640Eu.A00(r7, r6)
            if (r10 == 0) goto L_0x04bf
            X.0uU r7 = r1.A08
            boolean r7 = X.AnonymousClass001.A1b(r7)
            if (r7 == 0) goto L_0x04bf
            X.0uU r7 = r1.A09
            boolean r7 = X.AnonymousClass001.A1b(r7)
            if (r7 == 0) goto L_0x04bf
            r56 = 1
            X.0tj r0 = X.AnonymousClass0E8.A00(r5, r0)
        L_0x048c:
            X.0o9 r7 = new X.0o9
            r47 = r32
            r48 = r19
            r49 = r59
            r50 = r31
            r51 = r23
            r52 = r30
            r53 = r29
            r54 = r27
            r55 = r28
            r57 = r25
            r38 = r7
            r39 = r14
            r40 = r20
            r41 = r1
            r42 = r5
            r46 = r0
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            r0 = -374338080(0xffffffffe9b00de0, float:-2.6604558E25)
            X.04D r1 = X.AnonymousClass0LC.A00(r4, r7, r0)
            r0 = 448(0x1c0, float:6.28E-43)
            A09(r5, r4, r6, r1, r0)
            goto L_0x0115
        L_0x04bf:
            r56 = 0
            goto L_0x048c
        L_0x04c2:
            r7 = 0
            goto L_0x0402
        L_0x04c5:
            X.0CI r15 = X.AnonymousClass0CI.Vertical
            goto L_0x01d3
        L_0x04c9:
            if (r21 == 0) goto L_0x04cd
            X.0WC r35 = X.C17090tj.A00
        L_0x04cd:
            if (r20 == 0) goto L_0x04d5
            X.Cvq r0 = X.C26251Cvq.A03
            X.Cvq r32 = X.C24499C6t.A00()
        L_0x04d5:
            if (r18 == 0) goto L_0x04db
            X.EBO r31 = X.C25919Cod.A00()
        L_0x04db:
            if (r17 == 0) goto L_0x04df
            X.0kr r30 = X.C11900kr.A00
        L_0x04df:
            if (r16 == 0) goto L_0x04e3
            r37 = 0
        L_0x04e3:
            if (r5 == 0) goto L_0x04ee
            long r0 = X.C05100Qk.A05
            X.09Y r33 = new X.09Y
            r5 = r33
            r5.<init>(r0)
        L_0x04ee:
            if (r9 == 0) goto L_0x04f2
            r26 = 1
        L_0x04f2:
            if (r8 == 0) goto L_0x04f7
            r28 = 2147483647(0x7fffffff, float:NaN)
        L_0x04f7:
            if (r7 == 0) goto L_0x04fb
            r27 = 1
        L_0x04fb:
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0503
            X.Cr5 r36 = X.C73.A00()
        L_0x0503:
            if (r11 == 0) goto L_0x0507
            X.0PT r34 = X.AnonymousClass0PT.A01
        L_0x0507:
            if (r12 == 0) goto L_0x050a
            r10 = 1
        L_0x050a:
            if (r6 == 0) goto L_0x050e
            r25 = 0
        L_0x050e:
            if (r15 == 0) goto L_0x015c
            X.1nB r29 = X.C03980Lj.A00()
            goto L_0x015c
        L_0x0516:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r55
            if (r0 != 0) goto L_0x00e4
            r0 = r25
            boolean r0 = r4.BEg(r0)
            if (r0 != 0) goto L_0x0527
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0527:
            r14 = r14 | r15
            goto L_0x00e4
        L_0x052a:
            r0 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x00de
            boolean r0 = r4.BEg(r10)
            if (r0 == 0) goto L_0x0536
            r19 = 2048(0x800, float:2.87E-42)
        L_0x0536:
            r14 = r14 | r19
            goto L_0x00de
        L_0x053a:
            r0 = r13 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x00d8
            r0 = r34
            int r0 = X.AnonymousClass001.A0S(r4, r0)
            r14 = r14 | r0
            goto L_0x00d8
        L_0x0547:
            r0 = r55 & 14
            if (r0 != 0) goto L_0x0559
            r0 = r27
            boolean r0 = r4.BEd(r0)
            int r0 = X.AnonymousClass000.A09(r0)
            r14 = r55 | r0
            goto L_0x00bd
        L_0x0559:
            r14 = r13
            goto L_0x00bd
        L_0x055c:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r54 & r0
            if (r0 != 0) goto L_0x004e
            r0 = r31
            int r0 = X.AnonymousClass001.A0U(r4, r0)
            r1 = r1 | r0
            goto L_0x004e
        L_0x056c:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0046
            r0 = r32
            int r0 = X.AnonymousClass001.A0T(r4, r0)
            r1 = r1 | r0
            goto L_0x0046
        L_0x0579:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x003e
            r0 = r35
            int r0 = X.AnonymousClass001.A0S(r4, r0)
            r1 = r1 | r0
            goto L_0x003e
        L_0x0586:
            r0 = r54 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0038
            r0 = r58
            int r0 = X.AnonymousClass001.A0b(r4, r0)
            r1 = r1 | r0
            goto L_0x0038
        L_0x0593:
            r0 = r54 & 14
            if (r0 != 0) goto L_0x05a1
            r0 = r59
            int r1 = X.AnonymousClass001.A0Z(r4, r0)
            r1 = r1 | r54
            goto L_0x0030
        L_0x05a1:
            r1 = r3
            goto L_0x0030
        L_0x05a4:
            java.lang.String r0 = "no recompose scope found"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05070Qh.A01(X.0uI, X.0PT, X.0tn, X.0tj, X.0Hv, X.Cvq, X.Cr5, X.CvE, X.EBO, X.1Di, X.1Di, X.1nB, int, int, int, int, int, boolean, boolean, boolean):void");
    }
}
