package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Cw6  reason: case insensitive filesystem */
public final class C26261Cw6 {
    public C4T A00;
    public final C25846Cn2 A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26261Cw6) && C18070vi.A18(this.A01, ((C26261Cw6) obj).A01));
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    private final Object A01() {
        C23938BsY bsY;
        C25846Cn2 cn2 = this.A01;
        C26032Cqs cqs = cn2.A01;
        Object A012 = cqs.A00.A01();
        if (!(!(A012 instanceof AnonymousClass1IU))) {
            return A012;
        }
        try {
            long A05 = C17880vN.A05(A012);
            if (A05 == -1) {
                return C23936BsW.A00;
            }
            if (A05 == 0) {
                return new C23931BsR(false);
            }
            if (A05 == 1) {
                return new C23931BsR(true);
            }
            if (A05 == 2) {
                Object A04 = cqs.A04();
                boolean z = !(A04 instanceof AnonymousClass1IU);
                bsY = A04;
                if (z) {
                    C23938BsY bsY2 = new C23938BsY((DVO) null, (AnonymousClass1Y1) null, 1);
                    for (long A052 = C17880vN.A05(A04); A052 > 0; A052--) {
                        String A002 = C25846Cn2.A00(cn2);
                        Object A013 = A01();
                        C30691eM.A01(A013);
                        bsY2.A00.put(A002, (C4Q) A013);
                    }
                    bsY = bsY2;
                }
                C30691eM.A01(bsY);
                return (C4Q) bsY;
            } else if (A05 == 3) {
                C23937BsX bsX = new C23937BsX((ArrayList) null, (AnonymousClass1Y1) null, 1);
                for (long A003 = C26032Cqs.A00(cqs); A003 > 0; A003--) {
                    Object A014 = A01();
                    C30691eM.A01(A014);
                    bsX.A00.add((C4Q) A014);
                }
                return bsX;
            } else if (A05 == 4) {
                return new C23935BsV(C25846Cn2.A00(cn2));
            } else {
                if (A05 == 5) {
                    Object A015 = C25575CiF.A00(cn2.A00, "Bytes", new C27745DkR()).A01(cqs);
                    C30691eM.A01(A015);
                    return new C23932BsS((byte[]) A015);
                } else if (A05 == 6) {
                    Object A02 = cn2.A02();
                    C30691eM.A01(A02);
                    return new C23934BsU(C17880vN.A05(A02));
                } else if (A05 == 7) {
                    Object A022 = C25575CiF.A00(cn2.A00, "Float", new C27746DkS()).A02(cqs);
                    C30691eM.A01(A022);
                    return new C23933BsT(AnonymousClass8BR.A00(A022));
                } else {
                    throw new C23975BtI(A05);
                }
            }
        } catch (Throwable th) {
            return C108945cZ.A1J(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01fc, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object A02() {
        /*
            r29 = this;
            r28 = r29
            r0 = r28
            X.Cn2 r7 = r0.A01
            X.CmJ r1 = r7.A02
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x00ba
            java.lang.Object r3 = r7.A01()
            boolean r0 = r3 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x025e
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0258 }
            r9 = 1
            java.lang.Object r2 = r7.A04(r9)     // Catch:{ all -> 0x0258 }
            X.C30691eM.A01(r2)     // Catch:{ all -> 0x0258 }
            X.C4P r2 = (X.C4P) r2     // Catch:{ all -> 0x0258 }
            boolean r1 = r2 instanceof X.C23922BsI     // Catch:{ all -> 0x0258 }
            r0 = 0
            if (r1 == 0) goto L_0x002d
            r6 = r0
            goto L_0x0071
        L_0x002d:
            boolean r1 = r2 instanceof X.C23923BsJ     // Catch:{ all -> 0x0258 }
            if (r1 == 0) goto L_0x00b4
            X.Cqs r1 = r7.A01     // Catch:{ all -> 0x0258 }
            long r10 = X.C26032Cqs.A00(r1)     // Catch:{ all -> 0x0258 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0258 }
        L_0x003b:
            r4 = 0
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            java.lang.Object r8 = r7.A02()     // Catch:{ all -> 0x0258 }
            boolean r1 = r8 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x0258 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0065
            long r4 = X.C17880vN.A05(r8)     // Catch:{ all -> 0x0060 }
            java.lang.Object r1 = r7.A02()     // Catch:{ all -> 0x0060 }
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x0060 }
            long r1 = X.C17880vN.A05(r1)     // Catch:{ all -> 0x0060 }
            X.CaQ r8 = new X.CaQ     // Catch:{ all -> 0x0060 }
            r8.<init>(r4, r1)     // Catch:{ all -> 0x0060 }
            goto L_0x0065
        L_0x0060:
            r1 = move-exception
            X.1IU r8 = X.C108945cZ.A1J(r1)     // Catch:{ all -> 0x0258 }
        L_0x0065:
            X.C30691eM.A01(r8)     // Catch:{ all -> 0x0258 }
            X.CaQ r8 = (X.C25174CaQ) r8     // Catch:{ all -> 0x0258 }
            r6.add(r8)     // Catch:{ all -> 0x0258 }
            r1 = 1
            long r10 = r10 - r1
            goto L_0x003b
        L_0x0071:
            java.lang.Object r2 = r7.A04(r9)     // Catch:{ all -> 0x0258 }
            X.C30691eM.A01(r2)     // Catch:{ all -> 0x0258 }
            X.C4P r2 = (X.C4P) r2     // Catch:{ all -> 0x0258 }
            boolean r1 = r2 instanceof X.C23922BsI     // Catch:{ all -> 0x0258 }
            if (r1 == 0) goto L_0x0080
            r4 = r0
            goto L_0x008d
        L_0x0080:
            boolean r1 = r2 instanceof X.C23923BsJ     // Catch:{ all -> 0x0258 }
            if (r1 == 0) goto L_0x022d
            java.lang.Object r4 = r28.A04()     // Catch:{ all -> 0x0258 }
            X.C30691eM.A01(r4)     // Catch:{ all -> 0x0258 }
            X.A2U r4 = (X.A2U) r4     // Catch:{ all -> 0x0258 }
        L_0x008d:
            r1 = 0
            java.lang.Object r2 = r7.A04(r1)     // Catch:{ all -> 0x0258 }
            X.C30691eM.A01(r2)     // Catch:{ all -> 0x0258 }
            X.C4P r2 = (X.C4P) r2     // Catch:{ all -> 0x0258 }
            boolean r1 = r2 instanceof X.C23922BsI     // Catch:{ all -> 0x0258 }
            if (r1 != 0) goto L_0x00a8
            boolean r0 = r2 instanceof X.C23923BsJ     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r28.A03()     // Catch:{ all -> 0x0258 }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x0258 }
            X.Clc r0 = (X.C25765Clc) r0     // Catch:{ all -> 0x0258 }
        L_0x00a8:
            X.Cb0 r1 = new X.Cb0     // Catch:{ all -> 0x0258 }
            r1.<init>(r0, r4, r3, r6)     // Catch:{ all -> 0x0258 }
            return r1
        L_0x00ae:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ all -> 0x0258 }
            goto L_0x0231
        L_0x00b4:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ all -> 0x0258 }
            goto L_0x0231
        L_0x00ba:
            java.lang.String r12 = "path"
            java.lang.String r10 = "locations"
            java.lang.String r9 = "extensions"
            X.Cqs r15 = r7.A01
            X.CaN r0 = r15.A00
            r27 = r0
            java.lang.Object r3 = r27.A01()
            boolean r0 = r3 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x025e
            long r0 = X.C17880vN.A05(r3)     // Catch:{ all -> 0x0258 }
            r3 = 2
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0252
            long r25 = X.C26032Cqs.A00(r15)     // Catch:{ all -> 0x0258 }
            r6 = 0
            r8 = r6
            r0 = r6
            r5 = r6
            goto L_0x00e5
        L_0x00e3:
            long r25 = r25 - r23
        L_0x00e5:
            r16 = 0
            java.lang.String r2 = "message"
            int r1 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x0244
            java.lang.String r3 = X.C25846Cn2.A00(r7)     // Catch:{ all -> 0x0258 }
            int r1 = r3.hashCode()     // Catch:{ all -> 0x0258 }
            r23 = 1
            switch(r1) {
                case -1809421292: goto L_0x0116;
                case -1197189282: goto L_0x010f;
                case 3433509: goto L_0x0108;
                case 954925063: goto L_0x0101;
                default: goto L_0x00fa;
            }     // Catch:{ all -> 0x0258 }
        L_0x00fa:
            X.BtA r4 = new X.BtA     // Catch:{ all -> 0x0258 }
            r4.<init>(r3)     // Catch:{ all -> 0x0258 }
            goto L_0x0257
        L_0x0101:
            boolean r1 = r3.equals(r2)     // Catch:{ all -> 0x0258 }
            if (r1 == 0) goto L_0x00fa
            goto L_0x011e
        L_0x0108:
            boolean r1 = r3.equals(r12)     // Catch:{ all -> 0x0258 }
            if (r1 == 0) goto L_0x00fa
            goto L_0x012f
        L_0x010f:
            boolean r1 = r3.equals(r10)     // Catch:{ all -> 0x0258 }
            if (r1 == 0) goto L_0x00fa
            goto L_0x013b
        L_0x0116:
            boolean r1 = r3.equals(r9)     // Catch:{ all -> 0x0258 }
            if (r1 == 0) goto L_0x00fa
            goto L_0x020e
        L_0x011e:
            if (r6 != 0) goto L_0x0221
            long r1 = A00(r27)     // Catch:{ all -> 0x0258 }
            r13 = 4
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x021b
            java.lang.String r6 = X.C25846Cn2.A00(r7)     // Catch:{ all -> 0x0258 }
            goto L_0x00e3
        L_0x012f:
            if (r0 != 0) goto L_0x0227
            java.lang.Object r0 = r28.A05()     // Catch:{ all -> 0x0258 }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x0258 }
            X.A2U r0 = (X.A2U) r0     // Catch:{ all -> 0x0258 }
            goto L_0x00e3
        L_0x013b:
            if (r8 != 0) goto L_0x0238
            long r1 = A00(r27)     // Catch:{ all -> 0x0258 }
            r13 = 3
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0232
            long r21 = X.C26032Cqs.A00(r15)     // Catch:{ all -> 0x0258 }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0258 }
        L_0x014f:
            int r1 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e3
            java.lang.Object r11 = r27.A01()     // Catch:{ all -> 0x0258 }
            boolean r1 = r11 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x0258 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0202
            long r1 = X.C17880vN.A05(r11)     // Catch:{ all -> 0x01fd }
            r13 = 2
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x01f1
            long r3 = X.C26032Cqs.A00(r15)     // Catch:{ all -> 0x01fd }
            int r1 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x01eb
            r13 = 0
            r11 = r13
        L_0x0171:
            java.lang.String r14 = "column"
            java.lang.String r2 = "line"
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x01cd
            java.lang.String r1 = X.C25846Cn2.A00(r7)     // Catch:{ all -> 0x01fd }
            boolean r20 = X.C18070vi.A18(r1, r2)     // Catch:{ all -> 0x01fd }
            r18 = 6
            if (r20 == 0) goto L_0x0199
            if (r13 != 0) goto L_0x01b5
            long r1 = A00(r27)     // Catch:{ all -> 0x01fd }
            int r13 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x01f7
            java.lang.Object r13 = r7.A02()     // Catch:{ all -> 0x01fd }
            X.C30691eM.A01(r13)     // Catch:{ all -> 0x01fd }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x01fd }
            goto L_0x01b2
        L_0x0199:
            boolean r2 = X.C18070vi.A18(r1, r14)     // Catch:{ all -> 0x01fd }
            if (r2 == 0) goto L_0x01c7
            if (r11 != 0) goto L_0x01c1
            long r1 = A00(r27)     // Catch:{ all -> 0x01fd }
            int r11 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r11 != 0) goto L_0x01bb
            java.lang.Object r11 = r7.A02()     // Catch:{ all -> 0x01fd }
            X.C30691eM.A01(r11)     // Catch:{ all -> 0x01fd }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x01fd }
        L_0x01b2:
            long r3 = r3 - r23
            goto L_0x0171
        L_0x01b5:
            X.Bt7 r11 = new X.Bt7     // Catch:{ all -> 0x01fd }
            r11.<init>(r2)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x01bb:
            X.BtK r11 = new X.BtK     // Catch:{ all -> 0x01fd }
            r11.<init>(r1)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x01c1:
            X.Bt7 r11 = new X.Bt7     // Catch:{ all -> 0x01fd }
            r11.<init>(r14)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x01c7:
            X.BtA r11 = new X.BtA     // Catch:{ all -> 0x01fd }
            r11.<init>(r1)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x01cd:
            if (r13 == 0) goto L_0x01e5
            if (r11 == 0) goto L_0x01df
            long r3 = r13.longValue()     // Catch:{ all -> 0x01fd }
            long r1 = r11.longValue()     // Catch:{ all -> 0x01fd }
            X.CaQ r11 = new X.CaQ     // Catch:{ all -> 0x01fd }
            r11.<init>(r3, r1)     // Catch:{ all -> 0x01fd }
            goto L_0x0202
        L_0x01df:
            X.Bt8 r11 = new X.Bt8     // Catch:{ all -> 0x01fd }
            r11.<init>(r14)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x01e5:
            X.Bt8 r11 = new X.Bt8     // Catch:{ all -> 0x01fd }
            r11.<init>(r2)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x01eb:
            X.BtL r11 = new X.BtL     // Catch:{ all -> 0x01fd }
            r11.<init>(r3)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x01f1:
            X.BtH r11 = new X.BtH     // Catch:{ all -> 0x01fd }
            r11.<init>(r1)     // Catch:{ all -> 0x01fd }
            goto L_0x01fc
        L_0x01f7:
            X.BtK r11 = new X.BtK     // Catch:{ all -> 0x01fd }
            r11.<init>(r1)     // Catch:{ all -> 0x01fd }
        L_0x01fc:
            throw r11     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r1 = move-exception
            X.1IU r11 = X.C108945cZ.A1J(r1)     // Catch:{ all -> 0x0258 }
        L_0x0202:
            X.C30691eM.A01(r11)     // Catch:{ all -> 0x0258 }
            X.CaQ r11 = (X.C25174CaQ) r11     // Catch:{ all -> 0x0258 }
            r8.add(r11)     // Catch:{ all -> 0x0258 }
            long r21 = r21 - r23
            goto L_0x014f
        L_0x020e:
            if (r5 != 0) goto L_0x023e
            java.lang.Object r5 = r28.A03()     // Catch:{ all -> 0x0258 }
            X.C30691eM.A01(r5)     // Catch:{ all -> 0x0258 }
            X.Clc r5 = (X.C25765Clc) r5     // Catch:{ all -> 0x0258 }
            goto L_0x00e3
        L_0x021b:
            X.BtJ r4 = new X.BtJ     // Catch:{ all -> 0x0258 }
            r4.<init>(r1)     // Catch:{ all -> 0x0258 }
            goto L_0x0257
        L_0x0221:
            X.Bt7 r4 = new X.Bt7     // Catch:{ all -> 0x0258 }
            r4.<init>(r2)     // Catch:{ all -> 0x0258 }
            goto L_0x0257
        L_0x0227:
            X.Bt7 r0 = new X.Bt7     // Catch:{ all -> 0x0258 }
            r0.<init>(r12)     // Catch:{ all -> 0x0258 }
            goto L_0x0231
        L_0x022d:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ all -> 0x0258 }
        L_0x0231:
            throw r0     // Catch:{ all -> 0x0258 }
        L_0x0232:
            X.BtB r4 = new X.BtB     // Catch:{ all -> 0x0258 }
            r4.<init>(r1)     // Catch:{ all -> 0x0258 }
            goto L_0x0257
        L_0x0238:
            X.Bt7 r4 = new X.Bt7     // Catch:{ all -> 0x0258 }
            r4.<init>(r10)     // Catch:{ all -> 0x0258 }
            goto L_0x0257
        L_0x023e:
            X.Bt7 r4 = new X.Bt7     // Catch:{ all -> 0x0258 }
            r4.<init>(r9)     // Catch:{ all -> 0x0258 }
            goto L_0x0257
        L_0x0244:
            if (r6 == 0) goto L_0x024c
            X.Cb0 r3 = new X.Cb0     // Catch:{ all -> 0x0258 }
            r3.<init>(r5, r0, r6, r8)     // Catch:{ all -> 0x0258 }
            return r3
        L_0x024c:
            X.Bt8 r4 = new X.Bt8     // Catch:{ all -> 0x0258 }
            r4.<init>(r2)     // Catch:{ all -> 0x0258 }
            goto L_0x0257
        L_0x0252:
            X.BtH r4 = new X.BtH     // Catch:{ all -> 0x0258 }
            r4.<init>(r0)     // Catch:{ all -> 0x0258 }
        L_0x0257:
            throw r4     // Catch:{ all -> 0x0258 }
        L_0x0258:
            r0 = move-exception
            X.1IU r3 = X.C108945cZ.A1J(r0)
            return r3
        L_0x025e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26261Cw6.A02():java.lang.Object");
    }

    private final Object A03() {
        C25846Cn2 cn2 = this.A01;
        C26032Cqs cqs = cn2.A01;
        Object A012 = cqs.A00.A01();
        if (!(!(A012 instanceof AnonymousClass1IU))) {
            return A012;
        }
        try {
            long A05 = C17880vN.A05(A012);
            if (A05 == 2) {
                C25765Clc clc = new C25765Clc((DVO) null, (AnonymousClass1Y1) null, 1);
                for (long A002 = C26032Cqs.A00(cqs); A002 > 0; A002--) {
                    String A003 = C25846Cn2.A00(cn2);
                    Object A013 = A01();
                    C30691eM.A01(A013);
                    clc.A00.put(A003, (C4Q) A013);
                }
                return clc;
            }
            throw new C23974BtH(A05);
        } catch (Throwable th) {
            return C108945cZ.A1J(th);
        }
    }

    private final Object A04() {
        Object obj;
        Throwable th;
        C25846Cn2 cn2 = this.A01;
        if (cn2.A02.A04) {
            return A05();
        }
        C4T c4t = this.A00;
        DPJ dpj = null;
        if (c4t != null) {
            if (c4t instanceof C23949Bsj) {
                dpj = null;
            } else if (c4t instanceof C23948Bsi) {
                dpj = ((C23948Bsi) c4t).A00;
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        if (dpj == null) {
            return C30691eM.A00(new C23966Bt9());
        }
        Object A04 = cn2.A01.A04();
        if (!(!(A04 instanceof AnonymousClass1IU))) {
            return A04;
        }
        try {
            ArrayList A13 = AnonymousClass000.A13();
            for (long A05 = C17880vN.A05(A04); A05 > 0; A05--) {
                Object A02 = cn2.A02();
                C30691eM.A01(A02);
                C17880vN.A1R(A13, C17880vN.A05(A02));
            }
            A2U a2u = new A2U((ArrayList) null, (AnonymousClass1Y1) null, 1);
            int i = 0;
            while (i < A13.size()) {
                if (dpj instanceof C23985BtS) {
                    long A052 = C17880vN.A05(AnonymousClass8BS.A0Z(A13, i));
                    if (A052 < 0) {
                        th = new C23981BtO(A052);
                    } else if (A052 <= 4294967295L) {
                        a2u.A00.add(new C172978uK(A052));
                    } else {
                        th = new C23982BtP(A052);
                    }
                    throw th;
                } else if (dpj instanceof C23987BtU) {
                    dpj = ((C23987BtU) dpj).A00.A00;
                } else {
                    if (dpj instanceof C23988BtV) {
                        long A053 = C17880vN.A05(AnonymousClass8BS.A0Z(A13, i));
                        if (A053 < 0) {
                            th = new C23979BtM(A053);
                        } else if (A053 <= 4294967295L) {
                            Map.Entry entry = (Map.Entry) C29431cG.A0f(((C23988BtV) dpj).A00.A00.A00, (int) A053);
                            if (entry != null) {
                                a2u.A00.add(new C172968uJ(((C25190Cah) entry.getValue()).A01));
                                dpj = ((C25190Cah) entry.getValue()).A00;
                            } else {
                                th = new C23984BtR(A053);
                            }
                        } else {
                            th = new C23980BtN(A053);
                        }
                    } else {
                        th = new C23983BtQ(dpj);
                    }
                    throw th;
                }
                i++;
            }
            obj = a2u;
        } catch (Throwable th2) {
            return C108945cZ.A1J(th2);
        }
        C30691eM.A01(obj);
        return (A2U) obj;
    }

    private final Object A05() {
        Throwable th;
        C25846Cn2 cn2 = this.A01;
        C26032Cqs cqs = cn2.A01;
        C25171CaN caN = cqs.A00;
        Object A012 = caN.A01();
        if (!(!(A012 instanceof AnonymousClass1IU))) {
            return A012;
        }
        try {
            long A05 = C17880vN.A05(A012);
            if (A05 == 3) {
                A2U a2u = new A2U((ArrayList) null, (AnonymousClass1Y1) null, 1);
                for (long A002 = C26032Cqs.A00(cqs); A002 > 0; A002--) {
                    long A003 = A00(caN);
                    if (A003 == 6) {
                        Object A02 = cn2.A02();
                        C30691eM.A01(A02);
                        a2u.A00.add(new C172978uK(C17880vN.A05(A02)));
                    } else if (A003 == 4) {
                        a2u.A00.add(new C172968uJ(C25846Cn2.A00(cn2)));
                    } else {
                        th = new C23976BtJ(A003);
                    }
                }
                return a2u;
            }
            th = new C23968BtB(A05);
            throw th;
        } catch (Throwable th2) {
            return C108945cZ.A1J(th2);
        }
    }

    private final Object A06(DPI dpi) {
        Throwable th;
        C27621Wu r5 = C27621Wu.A00;
        try {
            C25846Cn2 cn2 = this.A01;
            if (!cn2.A02.A04 || (dpi instanceof C23960Bsu)) {
                return r5;
            }
            long A002 = A00(cn2.A01.A00);
            if (dpi instanceof C23962Bsw) {
                if (A002 == 4) {
                    return r5;
                }
                th = new C23976BtJ(A002);
            } else if (dpi instanceof C23958Bss) {
                if (A002 == 0 || A002 == 1) {
                    return r5;
                }
                th = new C23969BtC(A002);
            } else if (dpi instanceof C23963Bsx) {
                if (A002 == 6) {
                    return r5;
                }
                th = new C23977BtK(A002);
            } else if (dpi instanceof C23961Bsv) {
                if (A002 == 7) {
                    return r5;
                }
                th = new C23972BtF(A002);
            } else if (dpi instanceof C23959Bst) {
                if (A002 == 5) {
                    return r5;
                }
                th = new C23970BtD(A002);
            } else if (!(dpi instanceof C23957Bsr) || A002 == 5) {
                return r5;
            } else {
                th = new C23971BtE(A002);
            }
            throw th;
        } catch (Throwable th2) {
            return C108945cZ.A1J(th2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.1IU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.Cld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.1IU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: X.DST} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: X.1IU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: X.1IU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: X.Cld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: X.1IU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: X.1IU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: X.1IU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: X.Bsg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: X.Bsg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: X.Bsh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: X.Bsf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: X.Bsh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: X.Bsf} */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x050b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        r5 = X.C108945cZ.A1J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0520, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0521, code lost:
        r2 = X.C108945cZ.A1J(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:191:0x03db, B:230:0x04bf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(X.C28473E2o r11) {
        /*
            r10 = this;
            X.C4T r0 = r10.A00
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11 instanceof X.C23988BtV
            r3 = 0
            if (r0 == 0) goto L_0x002e
            r0 = r11
            X.BtV r0 = (X.C23988BtV) r0
            X.DPS r0 = r0.A00
            X.DVO r1 = r0.A00
            java.lang.String r0 = "data"
            java.lang.Object r0 = r1.get(r0)
            X.Cah r0 = (X.C25190Cah) r0
            if (r0 != 0) goto L_0x002b
            r1 = r11
            X.DPJ r1 = (X.DPJ) r1
        L_0x001d:
            X.Bsi r0 = new X.Bsi
            r0.<init>(r1)
        L_0x0022:
            r10.A00 = r0
            java.lang.Object r2 = r10.A07(r11)
            r10.A00 = r3
        L_0x002a:
            return r2
        L_0x002b:
            X.DPJ r1 = r0.A00
            goto L_0x001d
        L_0x002e:
            X.Bsj r0 = X.C23949Bsj.A00
            goto L_0x0022
        L_0x0031:
            X.DPJ r11 = (X.DPJ) r11
            boolean r0 = r11 instanceof X.C23989BtW
            if (r0 == 0) goto L_0x013d
            X.BtW r11 = (X.C23989BtW) r11
            X.DPI r1 = r11.A00
            java.lang.Object r0 = r10.A06(r1)
            java.lang.Throwable r0 = X.C30671eK.A00(r0)
            if (r0 == 0) goto L_0x0057
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x0049:
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.C4U r2 = (X.C4U) r2
            X.Bt6 r0 = new X.Bt6
            r0.<init>(r2)
            return r0
        L_0x0057:
            boolean r0 = r1 instanceof X.C23962Bsw
            if (r0 == 0) goto L_0x0070
            X.Cn2 r0 = r10.A01
            java.lang.Object r2 = r0.A01()
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = (java.lang.String) r2
            X.Bsp r1 = new X.Bsp
            r1.<init>(r2)
        L_0x006e:
            r2 = r1
            goto L_0x0049
        L_0x0070:
            boolean r0 = r1 instanceof X.C23958Bss
            if (r0 == 0) goto L_0x0099
            X.Cn2 r0 = r10.A01
            X.CiF r3 = r0.A00
            X.Cqs r2 = r0.A01
            java.lang.String r1 = "Boolean"
            X.DkQ r0 = new X.DkQ
            r0.<init>()
            X.Cc4 r0 = X.C25575CiF.A00(r3, r1, r0)
            java.lang.Object r2 = r0.A00(r2)
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0049
            boolean r0 = X.AnonymousClass000.A1Y(r2)
            X.Bsk r1 = new X.Bsk
            r1.<init>(r0)
            goto L_0x006e
        L_0x0099:
            boolean r0 = r1 instanceof X.C23963Bsx
            if (r0 == 0) goto L_0x00b3
            X.Cn2 r0 = r10.A01
            java.lang.Object r2 = r0.A02()
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0049
            long r0 = X.C17880vN.A05(r2)
            X.Bsq r2 = new X.Bsq
            r2.<init>(r0)
            goto L_0x0049
        L_0x00b3:
            boolean r0 = r1 instanceof X.C23961Bsv
            if (r0 == 0) goto L_0x00dd
            X.Cn2 r0 = r10.A01
            X.CiF r3 = r0.A00
            X.Cqs r2 = r0.A01
            java.lang.String r1 = "Float"
            X.DkS r0 = new X.DkS
            r0.<init>()
            X.Cc4 r0 = X.C25575CiF.A00(r3, r1, r0)
            java.lang.Object r2 = r0.A02(r2)
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0049
            double r0 = X.AnonymousClass8BR.A00(r2)
            X.Bso r2 = new X.Bso
            r2.<init>(r0)
            goto L_0x0049
        L_0x00dd:
            boolean r0 = r1 instanceof X.C23959Bst
            if (r0 == 0) goto L_0x0105
            X.Cn2 r0 = r10.A01
            X.CiF r3 = r0.A00
            X.Cqs r2 = r0.A01
            java.lang.String r1 = "Bytes"
            X.DkR r0 = new X.DkR
            r0.<init>()
            X.Cc4 r0 = X.C25575CiF.A00(r3, r1, r0)
            java.lang.Object r2 = r0.A01(r2)
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0049
            byte[] r2 = (byte[]) r2
            X.Bsl r1 = new X.Bsl
            r1.<init>(r2)
            goto L_0x006e
        L_0x0105:
            boolean r0 = r1 instanceof X.C23957Bsr
            if (r0 == 0) goto L_0x0126
            X.Cn2 r3 = r10.A01
            X.Bsr r1 = (X.C23957Bsr) r1
            X.DPL r0 = r1.A00
            long r1 = r0.A00
            X.Cqs r0 = r3.A01
            java.lang.Object r2 = r0.A05(r1)
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0049
            byte[] r2 = (byte[]) r2
            X.Bsn r1 = new X.Bsn
            r1.<init>(r2)
            goto L_0x006e
        L_0x0126:
            boolean r0 = r1 instanceof X.C23960Bsu
            if (r0 == 0) goto L_0x058b
            java.lang.Object r2 = r10.A01()
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0049
            X.C4Q r2 = (X.C4Q) r2
            X.Bsm r1 = new X.Bsm
            r1.<init>(r2)
            goto L_0x006e
        L_0x013d:
            boolean r0 = r11 instanceof X.C23986BtT
            if (r0 == 0) goto L_0x029b
            X.BtT r11 = (X.C23986BtT) r11
            X.DPN r3 = r11.A00
            X.DPI r1 = r3.A00
            boolean r0 = r1 instanceof X.C23960Bsu
            if (r0 == 0) goto L_0x0163
            java.lang.Object r4 = r10.A01()
            boolean r0 = r4 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0286
            X.C4Q r4 = (X.C4Q) r4     // Catch:{ all -> 0x0288 }
            X.Bsm r0 = new X.Bsm     // Catch:{ all -> 0x0288 }
            r0.<init>(r4)     // Catch:{ all -> 0x0288 }
            X.CaM r2 = new X.CaM     // Catch:{ all -> 0x0288 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x028d
        L_0x0163:
            java.lang.Object r0 = r10.A06(r1)
            java.lang.Throwable r0 = X.C30671eK.A00(r0)
            if (r0 == 0) goto L_0x0173
            X.1IU r2 = X.C108945cZ.A1J(r0)
            goto L_0x028d
        L_0x0173:
            X.Cn2 r0 = r10.A01
            X.CiF r4 = r0.A00
            X.Cqs r5 = r0.A01
            java.lang.String r2 = r3.A01
            X.DkW r0 = new X.DkW
            r0.<init>(r3)
            X.DPN r1 = r0.$blockWireType
            X.DkT r0 = new X.DkT
            r0.<init>(r1)
            X.Cc4 r2 = X.C25575CiF.A00(r4, r2, r0)
            X.DPI r1 = r1.A00
            boolean r0 = r1 instanceof X.C23958Bss     // Catch:{ all -> 0x0273 }
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r0 = r2.A00(r5)     // Catch:{ all -> 0x0273 }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x0273 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ all -> 0x0273 }
            X.Bsk r4 = new X.Bsk     // Catch:{ all -> 0x0273 }
            r4.<init>(r0)     // Catch:{ all -> 0x0273 }
            goto L_0x0278
        L_0x01a3:
            boolean r0 = r1 instanceof X.C23959Bst     // Catch:{ all -> 0x0273 }
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r0 = r2.A01(r5)     // Catch:{ all -> 0x0273 }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x0273 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0273 }
            X.Bsl r4 = new X.Bsl     // Catch:{ all -> 0x0273 }
            r4.<init>(r0)     // Catch:{ all -> 0x0273 }
            goto L_0x0278
        L_0x01b7:
            boolean r0 = r1 instanceof X.C23960Bsu     // Catch:{ all -> 0x0273 }
            if (r0 != 0) goto L_0x0268
            boolean r0 = r1 instanceof X.C23957Bsr     // Catch:{ all -> 0x0273 }
            if (r0 == 0) goto L_0x022b
            X.DPN r1 = r2.A01     // Catch:{ all -> 0x021b }
            X.DPI r6 = r1.A00     // Catch:{ all -> 0x021b }
            boolean r0 = r6 instanceof X.C23957Bsr     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x0202
            X.C4L r4 = r2.A00     // Catch:{ all -> 0x021b }
            X.Bsr r6 = (X.C23957Bsr) r6     // Catch:{ all -> 0x021b }
            X.DPL r0 = r6.A00     // Catch:{ all -> 0x021b }
            long r1 = r0.A00     // Catch:{ all -> 0x021b }
            boolean r0 = r4 instanceof X.C23909Bs5     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x01ec
            X.DPL r0 = new X.DPL     // Catch:{ all -> 0x021b }
            r0.<init>(r1)     // Catch:{ all -> 0x021b }
            X.Bsr r1 = new X.Bsr     // Catch:{ all -> 0x021b }
            r1.<init>(r0)     // Catch:{ all -> 0x021b }
            X.Bry r0 = new X.Bry     // Catch:{ all -> 0x021b }
            r0.<init>(r1)     // Catch:{ all -> 0x021b }
            X.1IU r0 = X.C30691eM.A00(r0)     // Catch:{ all -> 0x021b }
        L_0x01e6:
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x021b }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x021b }
            goto L_0x0220
        L_0x01ec:
            boolean r0 = r4 instanceof X.C23907Bs3     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x01f5
            java.lang.Object r0 = r5.A05(r1)     // Catch:{ all -> 0x021b }
            goto L_0x01e6
        L_0x01f5:
            boolean r0 = r4 instanceof X.C23908Bs4     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x0216
            X.Bs4 r4 = (X.C23908Bs4) r4     // Catch:{ all -> 0x021b }
            X.CYS r0 = r4.A00     // Catch:{ all -> 0x021b }
            java.lang.Object r0 = r0.A00(r1)     // Catch:{ all -> 0x021b }
            goto L_0x01e6
        L_0x0202:
            java.lang.String r2 = r1.A01     // Catch:{ all -> 0x021b }
            r4 = 0
            X.DPL r1 = new X.DPL     // Catch:{ all -> 0x021b }
            r1.<init>(r4)     // Catch:{ all -> 0x021b }
            X.Bsr r0 = new X.Bsr     // Catch:{ all -> 0x021b }
            r0.<init>(r1)     // Catch:{ all -> 0x021b }
            X.Bs2 r1 = new X.Bs2     // Catch:{ all -> 0x021b }
            r1.<init>(r0, r6, r2)     // Catch:{ all -> 0x021b }
            goto L_0x021a
        L_0x0216:
            X.3EW r1 = X.AnonymousClass3MW.A14()     // Catch:{ all -> 0x021b }
        L_0x021a:
            throw r1     // Catch:{ all -> 0x021b }
        L_0x021b:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x0273 }
        L_0x0220:
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x0273 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0273 }
            X.Bsn r4 = new X.Bsn     // Catch:{ all -> 0x0273 }
            r4.<init>(r0)     // Catch:{ all -> 0x0273 }
            goto L_0x0278
        L_0x022b:
            boolean r0 = r1 instanceof X.C23961Bsv     // Catch:{ all -> 0x0273 }
            if (r0 == 0) goto L_0x0240
            java.lang.Object r0 = r2.A02(r5)     // Catch:{ all -> 0x0273 }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x0273 }
            double r0 = X.AnonymousClass8BR.A00(r0)     // Catch:{ all -> 0x0273 }
            X.Bso r4 = new X.Bso     // Catch:{ all -> 0x0273 }
            r4.<init>(r0)     // Catch:{ all -> 0x0273 }
            goto L_0x0278
        L_0x0240:
            boolean r0 = r1 instanceof X.C23962Bsw     // Catch:{ all -> 0x0273 }
            if (r0 == 0) goto L_0x0253
            java.lang.Object r0 = r2.A03(r5)     // Catch:{ all -> 0x0273 }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x0273 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0273 }
            X.Bsp r4 = new X.Bsp     // Catch:{ all -> 0x0273 }
            r4.<init>(r0)     // Catch:{ all -> 0x0273 }
            goto L_0x0278
        L_0x0253:
            boolean r0 = r1 instanceof X.C23963Bsx     // Catch:{ all -> 0x0273 }
            if (r0 == 0) goto L_0x026e
            java.lang.Object r0 = r2.A04(r5)     // Catch:{ all -> 0x0273 }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x0273 }
            long r0 = X.C17880vN.A05(r0)     // Catch:{ all -> 0x0273 }
            X.Bsq r4 = new X.Bsq     // Catch:{ all -> 0x0273 }
            r4.<init>(r0)     // Catch:{ all -> 0x0273 }
            goto L_0x0278
        L_0x0268:
            X.Bs0 r0 = new X.Bs0     // Catch:{ all -> 0x0273 }
            r0.<init>(r1)     // Catch:{ all -> 0x0273 }
            goto L_0x0272
        L_0x026e:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ all -> 0x0273 }
        L_0x0272:
            throw r0     // Catch:{ all -> 0x0273 }
        L_0x0273:
            r0 = move-exception
            X.1IU r4 = X.C108945cZ.A1J(r0)
        L_0x0278:
            boolean r0 = r4 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0286
            X.C4U r4 = (X.C4U) r4
            X.CaM r2 = new X.CaM
            r2.<init>(r3, r4)
            goto L_0x028d
        L_0x0286:
            r2 = r4
            goto L_0x028d
        L_0x0288:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x028d:
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.CaM r2 = (X.C25170CaM) r2
            X.Bsz r0 = new X.Bsz
            r0.<init>(r2)
            return r0
        L_0x029b:
            boolean r0 = r11 instanceof X.C23987BtU
            if (r0 == 0) goto L_0x035d
            X.BtU r11 = (X.C23987BtU) r11
            X.DPM r3 = r11.A00
            X.Cn2 r5 = r10.A01
            X.CmJ r4 = r5.A02
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x02e7
            r0 = 1
            java.lang.Object r2 = r5.A03(r0)
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x034f
            X.C4O r2 = (X.C4O) r2     // Catch:{ all -> 0x034a }
            boolean r0 = r2 instanceof X.C23921BsH     // Catch:{ all -> 0x034a }
            if (r0 == 0) goto L_0x02c3
            X.Bsf r2 = new X.Bsf     // Catch:{ all -> 0x034a }
            r2.<init>(r3)     // Catch:{ all -> 0x034a }
            goto L_0x034f
        L_0x02c3:
            boolean r0 = r2 instanceof X.C23920BsG     // Catch:{ all -> 0x034a }
            if (r0 == 0) goto L_0x02d8
            X.DPJ r0 = r3.A00     // Catch:{ all -> 0x034a }
            java.lang.Object r0 = r10.A07(r0)     // Catch:{ all -> 0x034a }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x034a }
            X.C4V r0 = (X.C4V) r0     // Catch:{ all -> 0x034a }
            X.Bsh r2 = new X.Bsh     // Catch:{ all -> 0x034a }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x034a }
            goto L_0x034f
        L_0x02d8:
            boolean r0 = r2 instanceof X.C23919BsF     // Catch:{ all -> 0x034a }
            if (r0 == 0) goto L_0x02e2
            X.BtG r0 = new X.BtG     // Catch:{ all -> 0x034a }
            r0.<init>(r2)     // Catch:{ all -> 0x034a }
            goto L_0x0349
        L_0x02e2:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ all -> 0x034a }
            goto L_0x0349
        L_0x02e7:
            X.DPJ r1 = r3.A00
            boolean r0 = r1.A00()
            java.lang.Object r2 = r5.A03(r0)
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x034f
            X.C4O r2 = (X.C4O) r2     // Catch:{ all -> 0x034a }
            boolean r0 = r2 instanceof X.C23921BsH     // Catch:{ all -> 0x034a }
            if (r0 == 0) goto L_0x0303
            X.Bsf r2 = new X.Bsf     // Catch:{ all -> 0x034a }
            r2.<init>(r3)     // Catch:{ all -> 0x034a }
            goto L_0x034f
        L_0x0303:
            boolean r0 = r2 instanceof X.C23920BsG     // Catch:{ all -> 0x034a }
            if (r0 == 0) goto L_0x0316
            java.lang.Object r0 = r10.A07(r1)     // Catch:{ all -> 0x034a }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x034a }
            X.C4V r0 = (X.C4V) r0     // Catch:{ all -> 0x034a }
            X.Bsh r2 = new X.Bsh     // Catch:{ all -> 0x034a }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x034a }
            goto L_0x034f
        L_0x0316:
            boolean r0 = r2 instanceof X.C23919BsF     // Catch:{ all -> 0x034a }
            if (r0 == 0) goto L_0x0345
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x034a }
            X.Bsg r2 = new X.Bsg     // Catch:{ all -> 0x034a }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x034a }
            boolean r0 = r4.A03     // Catch:{ all -> 0x034a }
            if (r0 != 0) goto L_0x034f
            X.Cqs r0 = r5.A01     // Catch:{ all -> 0x034a }
            long r5 = X.C26032Cqs.A00(r0)     // Catch:{ all -> 0x034a }
        L_0x032d:
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x034f
            java.lang.Object r1 = r10.A02()     // Catch:{ all -> 0x034a }
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x034a }
            X.Cb0 r1 = (X.C25207Cb0) r1     // Catch:{ all -> 0x034a }
            java.util.ArrayList r0 = r2.A00     // Catch:{ all -> 0x034a }
            r0.add(r1)     // Catch:{ all -> 0x034a }
            r0 = 1
            long r5 = r5 - r0
            goto L_0x032d
        L_0x0345:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ all -> 0x034a }
        L_0x0349:
            throw r0     // Catch:{ all -> 0x034a }
        L_0x034a:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x034f:
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.C4S r2 = (X.C4S) r2
            X.Bt3 r0 = new X.Bt3
            r0.<init>(r2)
            return r0
        L_0x035d:
            boolean r0 = r11 instanceof X.C23985BtS
            if (r0 == 0) goto L_0x03bd
            X.BtS r11 = (X.C23985BtS) r11
            X.DPK r7 = r11.A00
            X.Cn2 r5 = r10.A01     // Catch:{ all -> 0x03aa }
            X.CmJ r0 = r5.A02     // Catch:{ all -> 0x03aa }
            boolean r0 = r0.A04     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x0381
            X.Cqs r0 = r5.A01     // Catch:{ all -> 0x03aa }
            X.CaN r0 = r0.A00     // Catch:{ all -> 0x03aa }
            long r1 = A00(r0)     // Catch:{ all -> 0x03aa }
            r3 = 3
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0381
            X.BtB r0 = new X.BtB     // Catch:{ all -> 0x03aa }
            r0.<init>(r1)     // Catch:{ all -> 0x03aa }
            throw r0     // Catch:{ all -> 0x03aa }
        L_0x0381:
            X.Cqs r0 = r5.A01     // Catch:{ all -> 0x03aa }
            long r5 = X.C26032Cqs.A00(r0)     // Catch:{ all -> 0x03aa }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x03aa }
            X.DST r2 = new X.DST     // Catch:{ all -> 0x03aa }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x03aa }
        L_0x0390:
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x03af
            X.DPJ r0 = r7.A00     // Catch:{ all -> 0x03aa }
            java.lang.Object r1 = r10.A07(r0)     // Catch:{ all -> 0x03aa }
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x03aa }
            X.C4V r1 = (X.C4V) r1     // Catch:{ all -> 0x03aa }
            java.util.ArrayList r0 = r2.A00     // Catch:{ all -> 0x03aa }
            r0.add(r1)     // Catch:{ all -> 0x03aa }
            r0 = 1
            long r5 = r5 - r0
            goto L_0x0390
        L_0x03aa:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x03af:
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.DST r2 = (X.DST) r2
            X.Bsy r0 = new X.Bsy
            r0.<init>(r2)
            return r0
        L_0x03bd:
            boolean r0 = r11 instanceof X.C23988BtV
            if (r0 == 0) goto L_0x0533
            X.BtV r11 = (X.C23988BtV) r11
            X.DPS r4 = r11.A00
            X.Cn2 r3 = r10.A01
            X.CmJ r0 = r3.A02
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x048a
            X.Cqs r7 = r3.A01
            X.CaN r0 = r7.A00
            java.lang.Object r2 = r0.A01()
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0525
            long r1 = X.C17880vN.A05(r2)     // Catch:{ all -> 0x0520 }
            r5 = 2
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x047e
            long r8 = X.C26032Cqs.A00(r7)     // Catch:{ all -> 0x0520 }
            java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ all -> 0x0520 }
        L_0x03ed:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x043d
            java.lang.String r5 = X.C25846Cn2.A00(r3)     // Catch:{ all -> 0x0520 }
            boolean r0 = r7.containsKey(r5)     // Catch:{ all -> 0x0520 }
            if (r0 != 0) goto L_0x0437
            X.DVO r0 = r4.A00     // Catch:{ all -> 0x0520 }
            java.lang.Object r2 = r0.get(r5)     // Catch:{ all -> 0x0520 }
            X.Cah r2 = (X.C25190Cah) r2     // Catch:{ all -> 0x0520 }
            if (r2 == 0) goto L_0x0484
            X.DPJ r0 = r2.A00     // Catch:{ all -> 0x0520 }
            java.lang.Object r1 = r10.A07(r0)     // Catch:{ all -> 0x0520 }
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x0520 }
            X.C4V r1 = (X.C4V) r1     // Catch:{ all -> 0x0520 }
            boolean r0 = r2.A02     // Catch:{ all -> 0x0520 }
            if (r0 == 0) goto L_0x0424
            X.CaO r0 = new X.CaO     // Catch:{ all -> 0x0520 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0520 }
            X.BsZ r1 = new X.BsZ     // Catch:{ all -> 0x0520 }
            r1.<init>(r0)     // Catch:{ all -> 0x0520 }
        L_0x0420:
            r7.put(r5, r1)     // Catch:{ all -> 0x0520 }
            goto L_0x0433
        L_0x0424:
            r0 = 1
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x0520 }
            X.CaP r0 = new X.CaP     // Catch:{ all -> 0x0520 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0520 }
            X.Bsa r1 = new X.Bsa     // Catch:{ all -> 0x0520 }
            r1.<init>(r0)     // Catch:{ all -> 0x0520 }
            goto L_0x0420
        L_0x0433:
            r0 = 1
            long r8 = r8 - r0
            goto L_0x03ed
        L_0x0437:
            X.Bt7 r0 = new X.Bt7     // Catch:{ all -> 0x0520 }
            r0.<init>(r5)     // Catch:{ all -> 0x0520 }
            goto L_0x0489
        L_0x043d:
            r0 = 1
            r6 = 0
            X.Cld r2 = new X.Cld     // Catch:{ all -> 0x0520 }
            r2.<init>(r6, r6, r0)     // Catch:{ all -> 0x0520 }
            X.DVO r0 = r4.A00     // Catch:{ all -> 0x0520 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0520 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0520 }
        L_0x044e:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0520 }
            if (r0 == 0) goto L_0x0525
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0520 }
            X.Cah r4 = (X.C25190Cah) r4     // Catch:{ all -> 0x0520 }
            java.lang.String r3 = r4.A01     // Catch:{ all -> 0x0520 }
            java.lang.Object r1 = r7.get(r3)     // Catch:{ all -> 0x0520 }
            X.C4R r1 = (X.C4R) r1     // Catch:{ all -> 0x0520 }
            if (r1 != 0) goto L_0x0472
            boolean r0 = r4.A02     // Catch:{ all -> 0x0520 }
            if (r0 == 0) goto L_0x0478
            X.CaO r0 = new X.CaO     // Catch:{ all -> 0x0520 }
            r0.<init>(r4, r6)     // Catch:{ all -> 0x0520 }
            X.BsZ r1 = new X.BsZ     // Catch:{ all -> 0x0520 }
            r1.<init>(r0)     // Catch:{ all -> 0x0520 }
        L_0x0472:
            X.DVO r0 = r2.A00     // Catch:{ all -> 0x0520 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0520 }
            goto L_0x044e
        L_0x0478:
            X.Bt8 r0 = new X.Bt8     // Catch:{ all -> 0x0520 }
            r0.<init>(r3)     // Catch:{ all -> 0x0520 }
            goto L_0x0489
        L_0x047e:
            X.BtH r0 = new X.BtH     // Catch:{ all -> 0x0520 }
            r0.<init>(r1)     // Catch:{ all -> 0x0520 }
            goto L_0x0489
        L_0x0484:
            X.BtA r0 = new X.BtA     // Catch:{ all -> 0x0520 }
            r0.<init>(r5)     // Catch:{ all -> 0x0520 }
        L_0x0489:
            throw r0     // Catch:{ all -> 0x0520 }
        L_0x048a:
            r1 = 1
            r0 = 0
            X.Cld r2 = new X.Cld
            r2.<init>(r0, r0, r1)
            X.DVO r0 = r4.A00     // Catch:{ all -> 0x0520 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0520 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0520 }
        L_0x049b:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0520 }
            if (r0 == 0) goto L_0x0525
            java.util.Map$Entry r6 = X.AnonymousClass000.A16(r7)     // Catch:{ all -> 0x0520 }
            java.lang.Object r4 = r6.getValue()     // Catch:{ all -> 0x0520 }
            X.Cah r4 = (X.C25190Cah) r4     // Catch:{ all -> 0x0520 }
            boolean r0 = r4.A02     // Catch:{ all -> 0x0520 }
            if (r0 == 0) goto L_0x04ee
            X.DPJ r1 = r4.A00     // Catch:{ all -> 0x0520 }
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0520 }
            java.lang.Object r5 = r3.A04(r0)     // Catch:{ all -> 0x0520 }
            boolean r0 = r5 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x0520 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0510
            X.C4P r5 = (X.C4P) r5     // Catch:{ all -> 0x050b }
            boolean r0 = r5 instanceof X.C23922BsI     // Catch:{ all -> 0x050b }
            if (r0 == 0) goto L_0x04d1
            r1 = 0
            X.CaO r0 = new X.CaO     // Catch:{ all -> 0x050b }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x050b }
            X.BsZ r5 = new X.BsZ     // Catch:{ all -> 0x050b }
            r5.<init>(r0)     // Catch:{ all -> 0x050b }
            goto L_0x0510
        L_0x04d1:
            boolean r0 = r5 instanceof X.C23923BsJ     // Catch:{ all -> 0x050b }
            if (r0 == 0) goto L_0x04e9
            java.lang.Object r1 = r10.A07(r1)     // Catch:{ all -> 0x050b }
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x050b }
            X.C4V r1 = (X.C4V) r1     // Catch:{ all -> 0x050b }
            X.CaO r0 = new X.CaO     // Catch:{ all -> 0x050b }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x050b }
            X.BsZ r5 = new X.BsZ     // Catch:{ all -> 0x050b }
            r5.<init>(r0)     // Catch:{ all -> 0x050b }
            goto L_0x0510
        L_0x04e9:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ all -> 0x050b }
            throw r0     // Catch:{ all -> 0x050b }
        L_0x04ee:
            X.DPJ r0 = r4.A00     // Catch:{ all -> 0x0520 }
            java.lang.Object r5 = r10.A07(r0)     // Catch:{ all -> 0x0520 }
            boolean r0 = r5 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x0520 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0510
            X.C4V r5 = (X.C4V) r5     // Catch:{ all -> 0x050b }
            r0 = 1
            X.C18070vi.A0d(r5, r0)     // Catch:{ all -> 0x050b }
            X.CaP r0 = new X.CaP     // Catch:{ all -> 0x050b }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x050b }
            X.Bsa r5 = new X.Bsa     // Catch:{ all -> 0x050b }
            r5.<init>(r0)     // Catch:{ all -> 0x050b }
            goto L_0x0510
        L_0x050b:
            r0 = move-exception
            X.1IU r5 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x0520 }
        L_0x0510:
            X.C30691eM.A01(r5)     // Catch:{ all -> 0x0520 }
            X.C4R r5 = (X.C4R) r5     // Catch:{ all -> 0x0520 }
            X.DVO r1 = r2.A00     // Catch:{ all -> 0x0520 }
            java.lang.Object r0 = r6.getKey()     // Catch:{ all -> 0x0520 }
            r1.put(r0, r5)     // Catch:{ all -> 0x0520 }
            goto L_0x049b
        L_0x0520:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x0525:
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.Cld r2 = (X.C25766Cld) r2
            X.Bt5 r0 = new X.Bt5
            r0.<init>(r2)
            return r0
        L_0x0533:
            boolean r0 = r11 instanceof X.C23990BtX
            if (r0 == 0) goto L_0x0549
            java.lang.Object r2 = r10.A01()
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.C4Q r2 = (X.C4Q) r2
            X.Bt0 r0 = new X.Bt0
            r0.<init>(r2)
            return r0
        L_0x0549:
            boolean r0 = r11 instanceof X.C23991BtY
            if (r0 == 0) goto L_0x055f
            java.lang.Object r2 = r10.A02()
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.Cb0 r2 = (X.C25207Cb0) r2
            X.Bt1 r0 = new X.Bt1
            r0.<init>(r2)
            return r0
        L_0x055f:
            boolean r0 = r11 instanceof X.C23992BtZ
            if (r0 == 0) goto L_0x0575
            java.lang.Object r2 = r10.A03()
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.Clc r2 = (X.C25765Clc) r2
            X.Bt2 r0 = new X.Bt2
            r0.<init>(r2)
            return r0
        L_0x0575:
            boolean r0 = r11 instanceof X.C23993Bta
            if (r0 == 0) goto L_0x0590
            java.lang.Object r2 = r10.A04()
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.A2U r2 = (X.A2U) r2
            X.Bt4 r0 = new X.Bt4
            r0.<init>(r2)
            return r0
        L_0x058b:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0590:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26261Cw6.A07(X.E2o):java.lang.Object");
    }

    public C26261Cw6(C25846Cn2 cn2) {
        this.A01 = cn2;
    }

    public static long A00(C25171CaN caN) {
        Object A012 = caN.A01();
        C30691eM.A01(A012);
        return ((Number) A012).longValue();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoValueDecoder(messageDecoder=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
