package X;

public final class D9K implements C28649ECi, C28648ECh {
    public long A00;
    public long A01 = 0;
    public C28648ECh A02;
    public D9U[] A03 = new D9U[0];
    public final C28649ECi A04;

    public D9K(C28649ECi eCi, long j) {
        this.A04 = eCi;
        this.A00 = j;
    }

    public void BEV(long j) {
        this.A04.BEV(j);
    }

    public boolean BFn(long j, long j2) {
        return this.A04.BFn(j, j2);
    }

    public void BIl(long j, boolean z) {
        this.A04.BIl(j, z);
    }

    public long BMc(C25721Ckr ckr, long j) {
        long j2;
        C25721Ckr ckr2 = ckr;
        long j3 = j;
        if (j == 0) {
            return 0;
        }
        long j4 = ckr2.A01;
        long max = Math.max(0, Math.min(j4, j3));
        long j5 = ckr2.A00;
        long j6 = this.A00;
        if (j6 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j6 - j;
        }
        long max2 = Math.max(0, Math.min(j5, j2));
        if (!(max == j4 && max2 == j5)) {
            ckr2 = new C25721Ckr(max, max2);
        }
        return this.A04.BMc(ckr2, j3);
    }

    public long BNp(long j) {
        return this.A04.BNp(j);
    }

    public long BNq() {
        long BNq = this.A04.BNq();
        if (BNq != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || BNq < j) {
                return BNq;
            }
        }
        return Long.MIN_VALUE;
    }

    public long BVO() {
        long BVO = this.A04.BVO();
        if (BVO != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || BVO < j) {
                return BVO;
            }
        }
        return Long.MIN_VALUE;
    }

    public C26539D3a Bag() {
        return this.A04.Bag();
    }

    public void BjV() {
        this.A04.BjV();
    }

    public /* bridge */ /* synthetic */ void BqD(C28601E9s e9s) {
        C28648ECh eCh = this.A02;
        C26056CrS.A01(eCh);
        eCh.BqD(this);
    }

    public void C1a(C28649ECi eCi) {
        C28648ECh eCh = this.A02;
        C26056CrS.A01(eCh);
        eCh.C1a(this);
    }

    public void CCK(C28648ECh eCh, long j) {
        this.A02 = eCh;
        this.A04.CCK(this, j);
    }

    public long CDQ() {
        if (AnonymousClass000.A1O((this.A01 > -9223372036854775807L ? 1 : (this.A01 == -9223372036854775807L ? 0 : -1)))) {
            long j = this.A01;
            this.A01 = -9223372036854775807L;
            long CDQ = CDQ();
            if (CDQ != -9223372036854775807L) {
                return CDQ;
            }
            return j;
        }
        long CDQ2 = this.A04.CDQ();
        if (CDQ2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C26056CrS.A03(AnonymousClass000.A1Q((CDQ2 > 0 ? 1 : (CDQ2 == 0 ? 0 : -1))));
        long j2 = this.A00;
        if (j2 != Long.MIN_VALUE && CDQ2 > j2) {
            z = false;
        }
        C26056CrS.A03(z);
        return CDQ2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r10 > r0) goto L_0x0079;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long CHG(X.E90[] r19, X.C28650ECj[] r20, boolean[] r21, boolean[] r22, long r23) {
        /*
            r18 = this;
            r6 = r19
            int r5 = r6.length
            X.D9U[] r7 = new X.D9U[r5]
            r4 = r18
            r4.A03 = r7
            X.E90[] r12 = new X.E90[r5]
            r3 = 0
            r1 = 0
        L_0x000d:
            r2 = 0
            if (r1 >= r5) goto L_0x001f
            r0 = r19[r1]
            X.D9U r0 = (X.D9U) r0
            r7[r1] = r0
            if (r0 == 0) goto L_0x001a
            X.E90 r2 = r0.A01
        L_0x001a:
            r12[r1] = r2
            int r1 = r1 + 1
            goto L_0x000d
        L_0x001f:
            X.ECi r11 = r4.A04
            r13 = r20
            r14 = r21
            r15 = r22
            r16 = r23
            long r10 = r11.CHG(r12, r13, r14, r15, r16)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.A01 = r0
            int r0 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
            r7 = 0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0079
            long r0 = r4.A00
            r8 = -9223372036854775808
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x004a
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x0079
        L_0x004a:
            r0 = 1
        L_0x004b:
            X.C26056CrS.A03(r0)
        L_0x004e:
            if (r3 >= r5) goto L_0x007b
            r0 = r12[r3]
            if (r0 != 0) goto L_0x005f
            X.D9U[] r7 = r4.A03
            r7[r3] = r2
        L_0x0058:
            r0 = r7[r3]
            r19[r3] = r0
            int r3 = r3 + 1
            goto L_0x004e
        L_0x005f:
            r0 = r19[r3]
            if (r0 == 0) goto L_0x006d
            X.D9U[] r7 = r4.A03
            r0 = r7[r3]
            X.E90 r1 = r0.A01
            r0 = r12[r3]
            if (r1 == r0) goto L_0x0058
        L_0x006d:
            X.D9U[] r7 = r4.A03
            r1 = r12[r3]
            X.D9U r0 = new X.D9U
            r0.<init>(r4, r1)
            r7[r3] = r0
            goto L_0x0058
        L_0x0079:
            r0 = 0
            goto L_0x004b
        L_0x007b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9K.CHG(X.E90[], X.ECj[], boolean[], boolean[], long):long");
    }

    public void CK0(boolean z) {
        this.A04.CK0(z);
    }

    public void CQr(byte b, boolean z) {
        this.A04.CQr(b, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r6 > r3) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long CHB(long r9, boolean r11) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A01 = r0
            X.D9U[] r3 = r8.A03
            int r2 = r3.length
            r5 = 0
            r1 = 0
        L_0x000c:
            if (r1 >= r2) goto L_0x0017
            r0 = r3[r1]
            if (r0 == 0) goto L_0x0014
            r0.A00 = r5
        L_0x0014:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0017:
            X.ECi r0 = r8.A04
            long r6 = r0.CHB(r9, r11)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0034
        L_0x0033:
            r5 = 1
        L_0x0034:
            X.C26056CrS.A03(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9K.CHB(long, boolean):long");
    }
}
