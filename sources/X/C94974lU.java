package X;

import java.util.Collection;

/* renamed from: X.4lU  reason: invalid class name and case insensitive filesystem */
public abstract class C94974lU implements C108445bi {
    public final boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        if (collection.size() != 1) {
            return false;
        }
        return A01(AnonymousClass3MX.A0s(collection));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0217, code lost:
        if (X.C18020vd.A05(r10, r6, 5174) != false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x029a, code lost:
        if (r5.Bey(r3) == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03cb, code lost:
        if (X.C87494Vu.A00(r8) != false) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05f0, code lost:
        if (X.AnonymousClass3MW.A0X(r1.A01).A07() == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0615, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A00, 5215) == false) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x063a, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2.A02.A01, 7080) == false) goto L_0x063c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d1, code lost:
        if (r1 == 16) goto L_0x01d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d A[EDGE_INSN: B:365:0x002d->B:11:0x002d ?: BREAK  , ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050 A[PHI: r4 
      PHI: (r4v15 boolean) = (r4v3 boolean), (r4v3 boolean), (r4v3 boolean), (r4v3 boolean), (r4v3 boolean), (r4v3 boolean), (r4v16 boolean), (r4v16 boolean), (r4v16 boolean), (r4v16 boolean) binds: [B:240:0x0443, B:312:0x0571, B:314:0x0577, B:316:0x057d, B:322:0x059c, B:324:0x05a4, B:15:0x003e, B:21:0x005d, B:23:0x006b, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0538 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.AnonymousClass206 r23) {
        /*
            r22 = this;
            r8 = r23
            r2 = r22
            boolean r0 = r2 instanceof X.C79743vx
            if (r0 == 0) goto L_0x002f
            X.3vx r2 = (X.C79743vx) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.0ve r2 = r2.A00
            r1 = 9141(0x23b5, float:1.2809E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x002d
            X.205 r0 = r8.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r8.A0S()
            if (r0 == 0) goto L_0x002d
            int r0 = r0.length()
        L_0x002a:
            r2 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            return r2
        L_0x002f:
            boolean r0 = r2 instanceof X.C79843w7
            if (r0 == 0) goto L_0x006f
            X.3w7 r2 = (X.C79843w7) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.205 r0 = r8.A0v
            X.1BI r1 = r0.A00
            r4 = 0
            if (r1 == 0) goto L_0x0050
            X.1M9 r0 = r2.A00
            X.1E7 r1 = r0.A0D(r1)
            if (r1 != 0) goto L_0x0051
            X.1Qo r2 = r2.A01
            X.3xJ r1 = X.C80523xJ.A02
            r0 = 0
            r2.A00(r1, r0)
        L_0x0050:
            return r4
        L_0x0051:
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.2kV r0 = (X.C58322kV) r0
            boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0050
            X.00H r0 = r2.A02
            java.lang.Object r0 = r0.get()
            X.4Yp r0 = (X.C88174Yp) r0
            boolean r0 = r0.A03(r8)
            if (r0 == 0) goto L_0x0050
            goto L_0x05a6
        L_0x006f:
            boolean r0 = r2 instanceof X.C79793w2
            if (r0 == 0) goto L_0x0092
            X.3w2 r2 = (X.C79793w2) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.0ve r3 = r2.A02
            r1 = 535(0x217, float:7.5E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x002d
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.4Yp r0 = (X.C88174Yp) r0
            boolean r0 = r0.A03(r8)
            goto L_0x002a
        L_0x0092:
            boolean r0 = r2 instanceof X.C80123wa
            if (r0 == 0) goto L_0x00a9
            X.3wa r2 = (X.C80123wa) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.00H r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.6z1 r0 = (X.C139546z1) r0
            boolean r2 = r0.A02(r8)
            return r2
        L_0x00a9:
            boolean r0 = r2 instanceof X.C80113wZ
            if (r0 == 0) goto L_0x00fe
            X.3wZ r2 = (X.C80113wZ) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.00H r0 = r2.A01
            java.lang.Object r2 = r0.get()
            X.6z1 r2 = (X.C139546z1) r2
            X.00H r0 = r2.A00
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00e6
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00e6
        L_0x00d0:
            X.0vl r0 = r2.A01
            java.lang.Object r1 = r0.getValue()
            X.20Z r1 = (X.AnonymousClass20Z) r1
            int r0 = r8.A0u
            X.20A r0 = r1.A00(r0)
            X.20r r0 = (X.C437220r) r0
            boolean r0 = r0.BgC(r8)
            goto L_0x002a
        L_0x00e6:
            java.util.Iterator r1 = r1.iterator()
        L_0x00ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r0 = r1.next()
            X.5bC r0 = (X.C108145bC) r0
            boolean r0 = r0.Bfz(r8)
            if (r0 != 0) goto L_0x00ea
            goto L_0x002d
        L_0x00fe:
            boolean r0 = r2 instanceof X.C79863w9
            if (r0 == 0) goto L_0x02cc
            X.3w9 r2 = (X.C79863w9) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.11P r7 = r2.A06
            X.0ve r6 = r2.A09
            X.11S r12 = r2.A02
            X.1CJ r11 = r2.A07
            X.12L r14 = r2.A0A
            X.1M9 r13 = r2.A03
            X.1PU r1 = r2.A0B
            X.00H r0 = r2.A0C
            java.lang.Object r10 = r0.get()
            X.1c4 r10 = (X.AnonymousClass1c4) r10
            X.1Ok r0 = r2.A05
            r21 = r0
            X.0zA r0 = r2.A00
            r20 = r0
            X.00H r0 = r2.A0D
            java.lang.Object r15 = r0.get()
            X.7Mz r15 = (X.C145887Mz) r15
            X.1PM r9 = r2.A04
            X.1MZ r0 = r2.A08
            X.0zA r2 = r2.A01
            java.lang.Object r5 = r2.A04()
            X.1gl r5 = (X.C32171gl) r5
            X.205 r4 = r8.A0v
            X.1BI r3 = r4.A00
            boolean r2 = X.C42761yh.A01(r14, r3)
            if (r2 != 0) goto L_0x002d
            boolean r2 = X.C43381zi.A01(r6, r3)
            if (r2 != 0) goto L_0x002d
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A00(r3)
            boolean r16 = X.C87454Vq.A01(r9, r6, r14, r2)
            if (r16 != 0) goto L_0x002d
            r18 = r2
            r19 = r15
            r15 = r21
            r16 = r6
            r17 = r14
            r14 = r9
            boolean r14 = X.C88424Zq.A00(r14, r15, r16, r17, r18, r19)
            if (r14 != 0) goto L_0x002d
            boolean r14 = X.C22971Dz.A0e(r3)
            if (r14 == 0) goto L_0x0182
            r14 = r3
            com.whatsapp.jid.GroupJid r14 = (com.whatsapp.jid.GroupJid) r14
            X.1E7 r13 = r13.A0E(r14)
            if (r13 == 0) goto L_0x002d
            boolean r1 = r1.A01(r13, r14)
            if (r1 != 0) goto L_0x002d
            boolean r0 = r0.A0J(r14)
            if (r0 != 0) goto L_0x0182
            goto L_0x002d
        L_0x0182:
            java.lang.Object r1 = r20.A04()
            X.1PW r1 = (X.AnonymousClass1PW) r1
            if (r1 == 0) goto L_0x019a
            java.util.List r0 = r8.A0h
            com.whatsapp.jid.UserJid r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x002d
            boolean r0 = X.C42701yb.A01(r3)
            if (r0 == 0) goto L_0x019a
            goto L_0x002d
        L_0x019a:
            boolean r0 = r8.A0w()
            if (r0 == 0) goto L_0x0239
            r0 = 3
            X.C18070vi.A0d(r10, r0)
            r9 = 4
            boolean r0 = r3 instanceof X.C29681ch
            if (r0 == 0) goto L_0x002d
            X.1ch r3 = (X.C29681ch) r3
            if (r3 == 0) goto L_0x002d
            X.1ci r2 = X.AnonymousClass1CJ.A00(r11, r3)
            boolean r0 = r2 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x002d
            X.2Dk r2 = (X.C46162Dk) r2
            if (r2 == 0) goto L_0x002d
            long r12 = X.AnonymousClass3MZ.A05(r7, r8)
            r4 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r5 = 0
            if (r0 >= 0) goto L_0x01c8
            r5 = 1
        L_0x01c8:
            int r1 = r8.A0D()
            if (r1 == r9) goto L_0x01d3
            r0 = 16
            r4 = 0
            if (r1 != r0) goto L_0x01d4
        L_0x01d3:
            r4 = 1
        L_0x01d4:
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r8)
            if (r0 != 0) goto L_0x0237
            r0 = 1
            boolean r0 = r8.A11(r0)
            if (r0 != 0) goto L_0x0237
            boolean r0 = r8 instanceof X.AnonymousClass210
            if (r0 != 0) goto L_0x01f6
            boolean r0 = r8 instanceof X.C438421d
            if (r0 != 0) goto L_0x01f6
            boolean r0 = r8 instanceof X.AnonymousClass21Y
            if (r0 != 0) goto L_0x01f6
            boolean r0 = r8 instanceof X.C440021t
            if (r0 != 0) goto L_0x01f6
            boolean r0 = r8 instanceof X.C438921i
            if (r0 == 0) goto L_0x0237
        L_0x01f6:
            r1 = 1
        L_0x01f7:
            boolean r0 = X.AnonymousClass4aS.A08(r11, r3, r10)
            if (r0 == 0) goto L_0x002d
            boolean r0 = r2.A0P()
            if (r0 == 0) goto L_0x002d
            if (r4 == 0) goto L_0x002d
            if (r1 == 0) goto L_0x002d
            boolean r0 = X.AnonymousClass25A.A0a(r8)
            if (r0 != 0) goto L_0x002d
            if (r5 == 0) goto L_0x002d
            r0 = 5174(0x1436, float:7.25E-42)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r6, r0)
            if (r0 == 0) goto L_0x002d
        L_0x0219:
            long r3 = X.AnonymousClass3MZ.A05(r7, r8)
            r0 = 3272(0xcc8, float:4.585E-42)
            int r0 = X.C18020vd.A00(r10, r6, r0)
            long r1 = X.C17890vO.A03(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02eb
            boolean r0 = r8.A0w()
            if (r0 != 0) goto L_0x02eb
            boolean r0 = r8 instanceof X.C445823z
            if (r0 == 0) goto L_0x002d
            goto L_0x02eb
        L_0x0237:
            r1 = 0
            goto L_0x01f7
        L_0x0239:
            boolean r0 = r11.A0R(r3)
            if (r0 == 0) goto L_0x0249
            r1 = 4090(0xffa, float:5.731E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            if (r0 == 0) goto L_0x002d
        L_0x0249:
            long r0 = r8.A0H
            r13 = -1
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x0257
            boolean r0 = r12.A0O(r3)
            if (r0 == 0) goto L_0x002d
        L_0x0257:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x002d
            r0 = 2190(0x88e, float:3.069E-42)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r6, r0)
            if (r0 == 0) goto L_0x029e
            boolean r0 = r8 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x029e
        L_0x0269:
            r0 = 1
            boolean r0 = r8.A11(r0)
            if (r0 != 0) goto L_0x002d
            boolean r0 = X.AnonymousClass25A.A0U(r7, r6, r8)
            if (r0 == 0) goto L_0x002d
            boolean r0 = X.C22971Dz.A0O(r3)
            if (r0 != 0) goto L_0x002d
            boolean r0 = r9.A04(r2)
            if (r0 != 0) goto L_0x002d
            X.2tn r1 = new X.2tn
            r1.<init>((X.AnonymousClass1PM) r9, (X.C25491Ok) r15, (com.whatsapp.jid.UserJid) r2)
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1.A06()
            if (r0 != 0) goto L_0x002d
            if (r5 == 0) goto L_0x0219
            boolean r0 = r5.Bey(r3)
            if (r0 != 0) goto L_0x002d
            goto L_0x0219
        L_0x029e:
            r0 = 3687(0xe67, float:5.167E-42)
            boolean r0 = X.C18020vd.A05(r10, r6, r0)
            if (r0 == 0) goto L_0x002d
            boolean r0 = r8 instanceof X.C438421d
            if (r0 != 0) goto L_0x02b2
            boolean r0 = r8 instanceof X.AnonymousClass21Y
            if (r0 != 0) goto L_0x02b2
            boolean r0 = r8 instanceof X.C440021t
            if (r0 == 0) goto L_0x02bc
        L_0x02b2:
            r0 = r8
            X.21V r0 = (X.AnonymousClass21V) r0
            boolean r0 = X.AnonymousClass3MZ.A1b(r0)
            if (r0 != 0) goto L_0x02bc
            goto L_0x0269
        L_0x02bc:
            boolean r0 = r8 instanceof X.C438921i
            if (r0 == 0) goto L_0x002d
            r0 = r8
            X.21i r0 = (X.C438921i) r0
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            goto L_0x0269
        L_0x02cc:
            boolean r0 = r2 instanceof X.C79733vw
            if (r0 == 0) goto L_0x02ed
            X.3vw r2 = (X.C79733vw) r2
            r4 = 0
            X.C18070vi.A0d(r8, r4)
            X.4a3 r3 = r2.A00
            X.0ve r2 = r3.A01
            r1 = 8632(0x21b8, float:1.2096E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = 0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r3.A0C(r8, r4)
            if (r0 == 0) goto L_0x002e
        L_0x02eb:
            r2 = 1
            return r2
        L_0x02ed:
            boolean r0 = r2 instanceof X.C79823w5
            if (r0 == 0) goto L_0x031f
            X.3w5 r2 = (X.C79823w5) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.205 r0 = r8.A0v
            X.1BI r4 = r0.A00
            X.0ve r3 = r2.A09
            X.0vf r1 = X.C18040vf.A01
            r0 = 3864(0xf18, float:5.415E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x002d
            boolean r0 = r8 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x002d
            boolean r0 = X.C22971Dz.A0e(r4)
            if (r0 == 0) goto L_0x002d
            X.1CJ r0 = r2.A05
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            int r1 = r0.A06(r4)
            r0 = 3
            r2 = 1
            if (r1 == r0) goto L_0x002e
            goto L_0x002d
        L_0x031f:
            boolean r0 = r2 instanceof X.C79723vv
            if (r0 == 0) goto L_0x0330
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            com.whatsapp.jid.UserJid r0 = r8.A0I()
            boolean r2 = X.C22971Dz.A0U(r0)
            return r2
        L_0x0330:
            boolean r0 = r2 instanceof X.C79833w6
            if (r0 == 0) goto L_0x0353
            X.3w6 r2 = (X.C79833w6) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.00H r0 = r2.A02
            java.lang.Object r2 = r0.get()
            X.4XQ r2 = (X.AnonymousClass4XQ) r2
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1 = 1
            boolean r0 = X.AnonymousClass4XQ.A00(r2, r8, r0)
            r2 = 0
            if (r0 == 0) goto L_0x002e
            int r0 = X.C63892tr.A00(r8)
            if (r0 != r1) goto L_0x002e
            goto L_0x02eb
        L_0x0353:
            boolean r0 = r2 instanceof X.C79783w1
            if (r0 == 0) goto L_0x0371
            X.3w1 r2 = (X.C79783w1) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.205 r0 = r8.A0v
            X.1BI r1 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x05a8
            X.00H r0 = r2.A04
            boolean r0 = X.C72463Mc.A1T(r1, r0)
            if (r0 == 0) goto L_0x05a8
            goto L_0x002d
        L_0x0371:
            boolean r0 = r2 instanceof X.C79773w0
            if (r0 == 0) goto L_0x03a0
            X.3w0 r2 = (X.C79773w0) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.205 r0 = r8.A0v
            X.1BI r1 = r0.A00
            X.1CJ r0 = r2.A03
            X.1ci r3 = r0.A0A(r1)
            boolean r0 = r3 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x002d
            X.2Dk r3 = (X.C46162Dk) r3
            if (r3 == 0) goto L_0x002d
            boolean r0 = r8.A0w()
            if (r0 == 0) goto L_0x002d
            X.36a r0 = X.C50382Uf.A00(r8)
            r1 = 1
            if (r0 == 0) goto L_0x05bb
            boolean r0 = r0.A07
            if (r0 != r1) goto L_0x05bb
            goto L_0x002d
        L_0x03a0:
            boolean r0 = r2 instanceof X.C79813w4
            if (r0 == 0) goto L_0x040e
            X.3w4 r2 = (X.C79813w4) r2
            r3 = 0
            X.C18070vi.A0d(r8, r3)
            X.1M9 r0 = r2.A01
            X.1E7 r0 = X.AnonymousClass25G.A00(r0, r8)
            r5 = 0
            if (r0 == 0) goto L_0x03cd
            X.1yf r0 = r0.A0G
            int r1 = X.AnonymousClass2V2.A00(r0)
            r0 = 1
            if (r1 == r0) goto L_0x03cd
            X.0zA r1 = r2.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x03ce
            r1.A03()
            boolean r0 = X.C87494Vu.A00(r8)
            if (r0 == 0) goto L_0x03ce
        L_0x03cd:
            return r5
        L_0x03ce:
            r0 = 8388608(0x800000, double:4.144523E-317)
            boolean r0 = r8.A11(r0)
            if (r0 != 0) goto L_0x03cd
            X.0ve r4 = r2.A02
            r1 = 690(0x2b2, float:9.67E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x03cd
            X.00H r0 = r2.A05
            java.lang.Object r2 = r0.get()
            X.4Yp r2 = (X.C88174Yp) r2
            X.205 r0 = r8.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x03cd
            X.00H r0 = r2.A00
            java.util.Iterator r1 = X.C17890vO.A0h(r0)
        L_0x03f7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x052e
            java.lang.Object r0 = r1.next()
            X.5bs r0 = (X.C108545bs) r0
            java.lang.Boolean r0 = r0.Bg1(r8)
            boolean r0 = X.C18070vi.A19(r0, r3)
            if (r0 == 0) goto L_0x03f7
            return r5
        L_0x040e:
            boolean r0 = r2 instanceof X.C79873wA
            if (r0 == 0) goto L_0x0430
            X.3wA r2 = (X.C79873wA) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.00H r0 = r2.A06
            java.lang.Object r1 = r0.get()
            X.4XQ r1 = (X.AnonymousClass4XQ) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            boolean r0 = X.AnonymousClass4XQ.A00(r1, r8, r0)
            r2 = 0
            if (r0 == 0) goto L_0x002e
            int r0 = X.C63892tr.A00(r8)
            if (r0 == 0) goto L_0x02eb
            return r2
        L_0x0430:
            boolean r0 = r2 instanceof X.C79803w3
            if (r0 == 0) goto L_0x0451
            X.3w3 r2 = (X.C79803w3) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.205 r1 = r8.A0v
            X.1BI r3 = r1.A00
            boolean r0 = X.C22971Dz.A0e(r3)
            r4 = 0
            if (r0 == 0) goto L_0x0050
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x056b
            int r1 = r8.A0D()
            r0 = 6
            if (r1 == r0) goto L_0x056b
            return r4
        L_0x0451:
            boolean r0 = r2 instanceof X.C79403vN
            if (r0 == 0) goto L_0x0462
            X.3vN r2 = (X.C79403vN) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.4Yi r0 = r2.A00
            boolean r2 = r0.A03(r8)
            return r2
        L_0x0462:
            boolean r0 = r2 instanceof X.C79393vM
            if (r0 == 0) goto L_0x0473
            X.3vM r2 = (X.C79393vM) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.4Yi r0 = r2.A00
            boolean r2 = r0.A02(r8)
            return r2
        L_0x0473:
            boolean r0 = r2 instanceof X.C79763vz
            if (r0 == 0) goto L_0x048e
            X.3vz r2 = (X.C79763vz) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.205 r3 = r8.A0v
            X.1BI r1 = r3.A00
            boolean r0 = X.C22971Dz.A0V(r1)
            if (r0 == 0) goto L_0x053a
            X.1CJ r0 = r2.A01
            r0.A0A(r1)
            goto L_0x002d
        L_0x048e:
            boolean r0 = r2 instanceof X.C79753vy
            if (r0 == 0) goto L_0x04b7
            r3 = 0
            X.C18070vi.A0d(r8, r3)
            boolean r0 = r8 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x002d
            X.21V r8 = (X.AnonymousClass21V) r8
            int r2 = X.AnonymousClass25A.A00(r8)
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            X.AnonymousClass3MX.A1R(r1, r3)
            r0 = 1
            X.AnonymousClass3MX.A1R(r1, r0)
            java.util.Set r1 = X.C200410p.A0S(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r2 = r1.contains(r0)
            return r2
        L_0x04b7:
            boolean r0 = r2 instanceof X.C79853w8
            if (r0 == 0) goto L_0x05d6
            X.3w8 r2 = (X.C79853w8) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.205 r1 = r8.A0v
            X.1BI r3 = r1.A00
            boolean r0 = X.C22971Dz.A0e(r3)
            r5 = 0
            if (r0 == 0) goto L_0x03cd
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x04d8
            int r1 = r8.A0D()
            r0 = 6
            if (r1 == r0) goto L_0x04d8
            return r5
        L_0x04d8:
            X.00H r0 = r2.A0B
            boolean r0 = X.C72463Mc.A1T(r3, r0)
            if (r0 != 0) goto L_0x03cd
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass126.A03(r8)
            if (r1 == 0) goto L_0x03cd
            X.12L r0 = r2.A05
            boolean r0 = X.C42761yh.A01(r0, r1)
            if (r0 != 0) goto L_0x03cd
            boolean r0 = X.C87494Vu.A00(r8)
            if (r0 != 0) goto L_0x03cd
            com.whatsapp.jid.UserJid r0 = r8.A0I()
            boolean r0 = X.C22971Dz.A0T(r0)
            if (r0 != 0) goto L_0x03cd
            X.00H r0 = r2.A08
            java.lang.Object r0 = r0.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            boolean r0 = r0.A0R(r3)
            if (r0 == 0) goto L_0x0519
            X.00H r0 = r2.A0A
            java.lang.Object r0 = r0.get()
            X.1MZ r0 = (X.AnonymousClass1MZ) r0
            boolean r5 = r0.A0R(r8)
            return r5
        L_0x0519:
            X.1M9 r0 = r2.A04
            X.1E7 r0 = r0.A0H(r1)
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x03cd
            X.11S r0 = r2.A03
            boolean r0 = r0.A0N()
            r0 = r0 ^ 1
            goto L_0x0536
        L_0x052e:
            X.20s r0 = X.C88174Yp.A00(r2, r8)
            boolean r0 = r0.Bg2()
        L_0x0536:
            if (r0 == 0) goto L_0x03cd
            r5 = 1
            return r5
        L_0x053a:
            boolean r2 = r3.A02
            if (r2 == 0) goto L_0x0563
            boolean r0 = r8.A0u()
            if (r0 != 0) goto L_0x0563
            int r1 = r8.A0u
            r0 = 10
            if (r1 == r0) goto L_0x0563
            r0 = 90
            if (r1 == r0) goto L_0x0563
            r0 = 99
            if (r1 == r0) goto L_0x0563
            boolean r0 = X.AnonymousClass25A.A0p(r8)
            if (r0 != 0) goto L_0x0563
            int r1 = r8.A0D()
            r0 = 4
            boolean r0 = X.C446824j.A02(r1, r0)
            if (r0 != 0) goto L_0x02eb
        L_0x0563:
            boolean r0 = r8 instanceof X.AnonymousClass22H
            if (r0 == 0) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            goto L_0x02eb
        L_0x056b:
            X.00H r0 = r2.A05
            boolean r0 = X.C72463Mc.A1T(r3, r0)
            if (r0 != 0) goto L_0x0050
            boolean r0 = X.C87494Vu.A00(r8)
            if (r0 != 0) goto L_0x0050
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass126.A03(r8)
            if (r1 == 0) goto L_0x0050
            X.00H r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            boolean r0 = r0.A0R(r3)
            if (r0 == 0) goto L_0x0594
            X.1MZ r0 = r2.A02
            boolean r4 = r0.A0R(r8)
            return r4
        L_0x0594:
            com.whatsapp.jid.UserJid r0 = r8.A0I()
            boolean r0 = X.C22971Dz.A0T(r0)
            if (r0 != 0) goto L_0x0050
            X.12L r0 = r2.A03
            boolean r0 = X.C42761yh.A01(r0, r1)
            if (r0 != 0) goto L_0x0050
        L_0x05a6:
            r4 = 1
            return r4
        L_0x05a8:
            boolean r0 = X.C22971Dz.A0Z(r1)
            if (r0 != 0) goto L_0x002d
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.4Yp r0 = (X.C88174Yp) r0
            boolean r2 = r0.A04(r8)
            return r2
        L_0x05bb:
            java.lang.String r0 = r3.A0S
            if (r0 == 0) goto L_0x002d
            X.11P r0 = r2.A02
            boolean r0 = X.AnonymousClass4aS.A07(r0, r8)
            if (r0 == 0) goto L_0x002d
            long r3 = r8.A0y
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002d
            boolean r0 = X.AnonymousClass25A.A0p(r8)
            r2 = r0 ^ 1
            return r2
        L_0x05d6:
            X.3vs r2 = (X.C79693vs) r2
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.1PW r1 = r2.A01
            boolean r0 = X.C87494Vu.A00(r8)
            r6 = 1
            if (r0 == 0) goto L_0x05f2
            X.00H r0 = r1.A01
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r0.A07()
            r5 = 1
            if (r0 != 0) goto L_0x05f3
        L_0x05f2:
            r5 = 0
        L_0x05f3:
            X.1PV r3 = r2.A04
            r0 = 8388608(0x800000, double:4.144523E-317)
            boolean r0 = r8.A11(r0)
            if (r0 == 0) goto L_0x0617
            X.1MB r1 = r2.A03
            X.205 r0 = r8.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x0617
            X.0ve r3 = r3.A00
            r1 = 5215(0x145f, float:7.308E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r4 = 1
            if (r0 != 0) goto L_0x0618
        L_0x0617:
            r4 = 0
        L_0x0618:
            r0 = 8388608(0x800000, double:4.144523E-317)
            boolean r0 = r8.A11(r0)
            if (r0 == 0) goto L_0x063c
            X.1MB r1 = r2.A03
            X.205 r0 = r8.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x063c
            X.4ZI r0 = r2.A02
            X.0ve r3 = r0.A01
            r1 = 7080(0x1ba8, float:9.921E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r3 = 1
            if (r0 != 0) goto L_0x063d
        L_0x063c:
            r3 = 0
        L_0x063d:
            boolean r0 = X.C87494Vu.A00(r8)
            if (r0 == 0) goto L_0x0654
            X.1MB r1 = r2.A03
            X.205 r0 = r8.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x0654
            X.0zA r0 = r2.A00
            X.AnonymousClass4W5.A01(r0)
        L_0x0654:
            if (r5 != 0) goto L_0x065b
            if (r4 != 0) goto L_0x065b
            if (r3 != 0) goto L_0x065b
            r6 = 0
        L_0x065b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94974lU.A01(X.206):boolean");
    }
}
