package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.Cvq  reason: case insensitive filesystem */
public final class C26251Cvq {
    public static final C26251Cvq A03;
    public final C26038Cqy A00;
    public final C25772Clj A01;
    public final C26053CrN A02;

    static {
        long j = C05100Qk.A05;
        long j2 = C26130Cst.A01;
        A03 = new C26251Cvq(new C26038Cqy((C26131Csu) null, (C25779Clq) null, (C25784Clv) null, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, Integer.MIN_VALUE, j2), (C25772Clj) null, new C26053CrN((AnonymousClass0NG) null, (C02000Cg) null, (C25706Ckc) null, (C24693CGf) null, (C25823Cma) null, (C25824Cmb) null, (DSF) null, (DUE) null, (C25825Cmc) null, (C25827Cme) null, C25969Cpb.A00(j), (C26040Cr4) null, (String) null, j2, j2, j));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26251Cvq) {
                C26251Cvq cvq = (C26251Cvq) obj;
                if (!C18070vi.A18(this.A02, cvq.A02) || !C18070vi.A18(this.A00, cvq.A00) || !C18070vi.A18(this.A01, cvq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C26251Cvq A00(C25772Clj clj, C26251Cvq cvq, C24693CGf cGf, DSF dsf, int i, long j, long j2, long j3, long j4) {
        C25823Cma cma;
        C25824Cmb cmb;
        String str;
        C25825Cmc cmc;
        C26040Cr4 cr4;
        DUE due;
        long j5;
        C25827Cme cme;
        AnonymousClass0NG r18;
        C26018CqZ cqZ;
        C25758ClT clT;
        C25779Clq clq;
        C25757ClS clS;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        C25772Clj clj2 = clj;
        long j6 = j4;
        long j7 = j3;
        C24693CGf cGf2 = cGf;
        DSF dsf2 = dsf;
        long j8 = j2;
        C25128CZb cZb = null;
        C26251Cvq cvq2 = cvq;
        if ((i6 & 1) != 0) {
            j = cvq2.A02.A0D.BOw();
        }
        if ((i6 & 2) != 0) {
            j8 = cvq2.A02.A01;
        }
        if ((i6 & 4) != 0) {
            dsf2 = cvq2.A02.A09;
        }
        if ((i6 & 8) != 0) {
            cma = cvq2.A02.A07;
        } else {
            cma = null;
        }
        if ((i6 & 16) != 0) {
            cmb = cvq2.A02.A08;
        } else {
            cmb = null;
        }
        if ((i6 & 32) != 0) {
            cGf2 = cvq2.A02.A06;
        }
        if ((i6 & 64) != 0) {
            str = cvq2.A02.A0F;
        } else {
            str = null;
        }
        if ((i6 & 128) != 0) {
            j7 = cvq2.A02.A02;
        }
        if ((i6 & 256) != 0) {
            cmc = cvq2.A02.A0B;
        } else {
            cmc = null;
        }
        if ((i6 & 512) != 0) {
            cr4 = cvq2.A02.A0E;
        } else {
            cr4 = null;
        }
        if ((i6 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            due = cvq2.A02.A0A;
        } else {
            due = null;
        }
        if ((i6 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            j5 = cvq2.A02.A00;
        } else {
            j5 = 0;
        }
        if ((i6 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            cme = cvq2.A02.A0C;
        } else {
            cme = null;
        }
        if ((i6 & DefaultCrypto.BUFFER_SIZE) != 0) {
            r18 = cvq2.A02.A03;
        } else {
            r18 = null;
        }
        if ((i6 & 16384) != 0) {
            cqZ = new C26018CqZ(cvq2.A00.A02);
        } else {
            cqZ = null;
        }
        if ((32768 & i6) != 0) {
            clT = new C25758ClT(cvq2.A00.A03);
        } else {
            clT = null;
        }
        if ((65536 & i6) != 0) {
            j6 = cvq2.A00.A04;
        }
        if ((131072 & i6) != 0) {
            clq = cvq2.A00.A06;
        } else {
            clq = null;
        }
        if ((262144 & i6) != 0) {
            clj2 = cvq2.A01;
        }
        C25706Ckc ckc = null;
        if ((1048576 & i6) != 0) {
            clS = new C25757ClS(cvq2.A00.A01);
        } else {
            clS = null;
        }
        if ((i6 & 2097152) != 0) {
            cZb = new C25128CZb(cvq2.A00.A00);
        }
        C26053CrN crN = cvq2.A02;
        EBX ebx = crN.A0D;
        long BOw = ebx.BOw();
        long j9 = C05100Qk.A01;
        if (j != BOw) {
            ebx = C25969Cpb.A00(j);
        }
        C26131Csu csu = null;
        if (clj2 != null) {
            ckc = clj2.A01;
        }
        C26053CrN crN2 = new C26053CrN(r18, crN.A04, ckc, cGf2, cma, cmb, dsf2, due, cmc, cme, ebx, cr4, str, j8, j7, j5);
        if (cqZ != null) {
            i2 = cqZ.A00;
        } else {
            i2 = Integer.MIN_VALUE;
        }
        if (clT != null) {
            i3 = clT.A00;
        } else {
            i3 = Integer.MIN_VALUE;
        }
        if (clj2 != null) {
            csu = clj2.A00;
        }
        if (clS != null) {
            i4 = clS.A00;
        } else {
            i4 = 0;
        }
        if (cZb != null) {
            i5 = cZb.A00;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        return new C26251Cvq(new C26038Cqy(csu, clq, cvq2.A00.A07, i2, i3, i4, i5, j6), clj2, crN2);
    }

    public static /* synthetic */ C26251Cvq A01(C26251Cvq cvq, int i, int i2, long j) {
        long j2;
        long j3;
        DSF dsf;
        C25823Cma cma;
        C25824Cmb cmb;
        C24693CGf cGf;
        String str;
        long j4;
        C25825Cmc cmc;
        C26040Cr4 cr4;
        DUE due;
        long j5;
        C25827Cme cme;
        AnonymousClass0NG r24;
        C02000Cg r23;
        int i3;
        C25779Clq clq;
        C25772Clj clj;
        int i4;
        int i5;
        int i6 = i2;
        long j6 = j;
        int i7 = i;
        C25784Clv clv = null;
        C26251Cvq cvq2 = cvq;
        if ((i2 & 1) != 0) {
            j2 = cvq2.A02.A0D.BOw();
        } else {
            j2 = 0;
        }
        if ((i2 & 2) != 0) {
            j3 = cvq2.A02.A01;
        } else {
            j3 = 0;
        }
        if ((i2 & 4) != 0) {
            dsf = cvq2.A02.A09;
        } else {
            dsf = null;
        }
        if ((i2 & 8) != 0) {
            cma = cvq2.A02.A07;
        } else {
            cma = null;
        }
        if ((i6 & 16) != 0) {
            cmb = cvq2.A02.A08;
        } else {
            cmb = null;
        }
        if ((i6 & 32) != 0) {
            cGf = cvq2.A02.A06;
        } else {
            cGf = null;
        }
        if ((i6 & 64) != 0) {
            str = cvq2.A02.A0F;
        } else {
            str = null;
        }
        if ((i6 & 128) != 0) {
            j4 = cvq2.A02.A02;
        } else {
            j4 = 0;
        }
        if ((i6 & 256) != 0) {
            cmc = cvq2.A02.A0B;
        } else {
            cmc = null;
        }
        if ((i6 & 512) != 0) {
            cr4 = cvq2.A02.A0E;
        } else {
            cr4 = null;
        }
        if ((i6 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            due = cvq2.A02.A0A;
        } else {
            due = null;
        }
        if ((i6 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            j5 = cvq2.A02.A00;
        } else {
            j5 = 0;
        }
        if ((i6 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            cme = cvq2.A02.A0C;
        } else {
            cme = null;
        }
        if ((i6 & DefaultCrypto.BUFFER_SIZE) != 0) {
            r24 = cvq2.A02.A03;
        } else {
            r24 = null;
        }
        if ((i6 & 16384) != 0) {
            r23 = cvq2.A02.A04;
        } else {
            r23 = null;
        }
        if ((32768 & i6) != 0) {
            i7 = cvq2.A00.A02;
        }
        if ((65536 & i6) != 0) {
            i3 = cvq2.A00.A03;
        } else {
            i3 = 0;
        }
        if ((131072 & i6) != 0) {
            j6 = cvq2.A00.A04;
        }
        if ((262144 & i6) != 0) {
            clq = cvq2.A00.A06;
        } else {
            clq = null;
        }
        if ((524288 & i6) != 0) {
            clj = cvq2.A01;
        } else {
            clj = null;
        }
        C25706Ckc ckc = null;
        if ((2097152 & i6) != 0) {
            i4 = cvq2.A00.A01;
        } else {
            i4 = 0;
        }
        if ((4194304 & i6) != 0) {
            i5 = cvq2.A00.A00;
        } else {
            i5 = 0;
        }
        if ((i6 & 8388608) != 0) {
            clv = cvq2.A00.A07;
        }
        EBX ebx = cvq2.A02.A0D;
        long BOw = ebx.BOw();
        long j7 = C05100Qk.A01;
        if (j2 != BOw) {
            ebx = C25969Cpb.A00(j2);
        }
        C26131Csu csu = null;
        if (clj != null) {
            ckc = clj.A01;
        }
        C26053CrN crN = new C26053CrN(r24, r23, ckc, cGf, cma, cmb, dsf, due, cmc, cme, ebx, cr4, str, j3, j4, j5);
        if (clj != null) {
            csu = clj.A00;
        }
        return new C26251Cvq(new C26038Cqy(csu, clq, clv, i7, i3, i4, i5, j6), clj, crN);
    }

    public static /* synthetic */ C26251Cvq A02(C26251Cvq cvq, long j) {
        C26251Cvq cvq2 = cvq;
        long j2 = C26130Cst.A01;
        C26131Csu csu = null;
        long j3 = C05100Qk.A05;
        C26053CrN crN = cvq2.A02;
        C26053CrN A012 = C26095CsF.A01((C03380Hv) null, (AnonymousClass0NG) null, (C02000Cg) null, (C25706Ckc) null, crN, (C24693CGf) null, (C25823Cma) null, (C25824Cmb) null, (DSF) null, (DUE) null, (C25825Cmc) null, (C25827Cme) null, (C26040Cr4) null, (String) null, Float.NaN, j, j2, j2, j3);
        C26038Cqy cqy = cvq2.A00;
        C26038Cqy cqy2 = cqy;
        long j4 = CE3.A00;
        if (!C26054CrP.A03(j2)) {
            long j5 = cqy.A04;
            if (j2 != j5) {
                if (C26054CrP.A03(j2)) {
                    j2 = j5;
                }
                C25779Clq clq = cqy.A06;
                int i = cqy.A02;
                int i2 = cqy.A03;
                C26131Csu csu2 = cqy.A05;
                if (csu2 != null) {
                    csu = csu2;
                }
                cqy2 = new C26038Cqy(csu, clq, cqy.A07, i, i2, cqy.A01, cqy.A00, j2);
            }
        }
        if (crN == A012 && cqy == cqy2) {
            return cvq2;
        }
        return new C26251Cvq(cqy2, A012);
    }

    public final float A03() {
        return this.A02.A0D.BMz();
    }

    public final long A04() {
        return this.A02.A0D.BOw();
    }

    public final long A05() {
        return this.A02.A01;
    }

    public final C03380Hv A06() {
        return this.A02.A0D.BNh();
    }

    public final AnonymousClass0NG A07() {
        return this.A02.A03;
    }

    public final C02000Cg A08() {
        return this.A02.A04;
    }

    public final C26251Cvq A09(C26251Cvq cvq) {
        if (cvq.equals(A03)) {
            return this;
        }
        return new C26251Cvq(this.A00.A02(cvq.A00), this.A02.A06(cvq.A02));
    }

    public final C24693CGf A0A() {
        return this.A02.A06;
    }

    public final C25823Cma A0B() {
        return this.A02.A07;
    }

    public final C25824Cmb A0C() {
        return this.A02.A08;
    }

    public final DSF A0D() {
        return this.A02.A09;
    }

    public final C25827Cme A0E() {
        return this.A02.A0C;
    }

    public final boolean A0F(C26251Cvq cvq) {
        if (this == cvq || this.A02.A0F(cvq.A02)) {
            return true;
        }
        return false;
    }

    public final boolean A0G(C26251Cvq cvq) {
        if (this == cvq) {
            return true;
        }
        if (!C18070vi.A18(this.A00, cvq.A00) || !this.A02.A0E(cvq.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A02)) + AnonymousClass001.A0l(this.A01);
    }

    public C26251Cvq(C26038Cqy cqy, C25772Clj clj, C26053CrN crN) {
        this.A02 = crN;
        this.A00 = cqy;
        this.A01 = clj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextStyle(color=");
        C26053CrN crN = this.A02;
        EBX ebx = crN.A0D;
        A10.append(C05100Qk.A08(ebx.BOw()));
        C26053CrN.A00(crN, ebx, A10);
        A10.append(C05100Qk.A08(crN.A00));
        A10.append(", textDecoration=");
        A10.append(crN.A0C);
        A10.append(", shadow=");
        A10.append(crN.A03);
        A10.append(", drawStyle=");
        A10.append(crN.A04);
        A10.append(", textAlign=");
        C26038Cqy cqy = this.A00;
        C26038Cqy.A01(cqy, A10);
        A10.append(this.A01);
        AnonymousClass000.A1G(A10, ", lineHeightStyle=");
        C26038Cqy.A00(cqy, A10);
        return AnonymousClass001.A1F(cqy.A07, A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C26251Cvq(X.C24693CGf r25, X.C25823Cma r26, X.DSF r27, X.C26018CqZ r28, X.C25827Cme r29, int r30, long r31, long r33, long r35, long r37) {
        /*
            r24 = this;
            r22 = r37
            r0 = r30
            r1 = r28
            r12 = r29
            r18 = r35
            r6 = r25
            r7 = r26
            r9 = r27
            r16 = r33
            r3 = 0
            r2 = r30 & 1
            if (r2 == 0) goto L_0x0019
            long r31 = X.C05100Qk.A05
        L_0x0019:
            r2 = r30 & 2
            if (r2 == 0) goto L_0x001f
            long r16 = X.C26130Cst.A01
        L_0x001f:
            r2 = r30 & 4
            if (r2 == 0) goto L_0x0024
            r9 = 0
        L_0x0024:
            r2 = r30 & 8
            if (r2 == 0) goto L_0x0029
            r7 = 0
        L_0x0029:
            r2 = r30 & 32
            if (r2 == 0) goto L_0x002e
            r6 = 0
        L_0x002e:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0034
            long r18 = X.C26130Cst.A01
        L_0x0034:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x007b
            long r20 = X.C05100Qk.A05
        L_0x003a:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x003f
            r12 = 0
        L_0x003f:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0044
            r1 = 0
        L_0x0044:
            r2 = 65536(0x10000, float:9.18355E-41)
            r0 = r30 & r2
            if (r0 == 0) goto L_0x004c
            long r22 = X.C26130Cst.A01
        L_0x004c:
            X.EBX r13 = X.C25969Cpb.A00(r31)
            X.CrN r2 = new X.CrN
            r5 = r3
            r8 = r3
            r10 = r3
            r11 = r3
            r14 = r3
            r15 = r3
            r4 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)
            if (r1 == 0) goto L_0x0078
            int r0 = r1.A00
        L_0x0060:
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 0
            X.Cqy r1 = new X.Cqy
            r16 = r3
            r17 = r3
            r14 = r1
            r18 = r0
            r21 = r19
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r24
            r0.<init>(r1, r3, r2)
            return
        L_0x0078:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0060
        L_0x007b:
            r20 = 0
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26251Cvq.<init>(X.CGf, X.Cma, X.DSF, X.CqZ, X.Cme, int, long, long, long, long):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26251Cvq(X.C26038Cqy r4, X.C26053CrN r5) {
        /*
            r3 = this;
            X.Ckc r2 = r5.A05
            X.Csu r1 = r4.A05
            if (r2 != 0) goto L_0x000d
            if (r1 != 0) goto L_0x000d
            r0 = 0
        L_0x0009:
            r3.<init>(r4, r0, r5)
            return
        L_0x000d:
            X.Clj r0 = new X.Clj
            r0.<init>(r1, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26251Cvq.<init>(X.Cqy, X.CrN):void");
    }
}
