package X;

public final class A6U {
    public static final A4M A07 = new Object();
    public final int A00;
    public final C62382rJ A01;
    public final C19999A2n A02;
    public final C166378cn A03;
    public final String A04;
    public final byte[] A05;
    public final String[] A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A6U)) {
            return false;
        }
        A6U a6u = (A6U) obj;
        return C18070vi.A18(this.A04, a6u.A04) && C18070vi.A18(this.A03, a6u.A03) && C18070vi.A18(this.A01, a6u.A01);
    }

    public final C165438b9 A00(byte[] bArr) {
        C23624Bmt A0N = C165438b9.DEFAULT_INSTANCE.A0N();
        String str = this.A04;
        DSQ dsq = DSQ.A00;
        C23581BmB bmB = new C23581BmB(str.getBytes(CIC.A04));
        C165438b9 r1 = (C165438b9) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.index_ = bmB;
        C23581BmB A032 = C17900vP.A03(A0N, bArr);
        C165438b9 r12 = (C165438b9) A0N.A00;
        r12.bitField0_ |= 4;
        r12.padding_ = A032;
        int i = this.A00;
        C165438b9 r13 = (C165438b9) C17880vN.A0G(A0N);
        r13.bitField0_ |= 8;
        r13.version_ = i;
        C166378cn r0 = this.A03;
        if (r0 != null) {
            C165438b9 r14 = (C165438b9) C17880vN.A0G(A0N);
            r14.value_ = r0;
            r14.bitField0_ |= 2;
        }
        return (C165438b9) A0N.A0C();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A6U(X.C20126A8l r9) {
        /*
            r8 = this;
            java.lang.String r4 = r9.A0A()
            int r7 = r9.A03
            X.A2n r2 = r9.A00
            java.lang.String[] r6 = r9.A0F()
            X.2rJ r1 = r9.A05
            X.8cn r3 = r9.A09()
            byte[] r5 = r9.A01
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6U.<init>(X.A8l):void");
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.A04;
        A1a[1] = this.A03;
        return AnonymousClass000.A0P(this.A01, A1a, 2);
    }

    public String toString() {
        return "SyncMutationData";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A6U(X.C62382rJ r9, X.C19999A2n r10, java.lang.String r11, byte[] r12, byte[] r13, int r14) {
        /*
            r8 = this;
            r0 = 1
            r1 = r9
            r4 = r11
            X.C18070vi.A0f(r11, r0, r9)
            java.lang.String[] r6 = X.A4M.A01(r11)
            if (r12 == 0) goto L_0x001c
            X.8cn r0 = X.C166378cn.DEFAULT_INSTANCE
            X.Bm6 r3 = X.C23577Bm6.A07(r0, r12)
            X.8cn r3 = (X.C166378cn) r3
        L_0x0014:
            r0 = r8
            r2 = r10
            r5 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x001c:
            r3 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6U.<init>(X.2rJ, X.A2n, java.lang.String, byte[], byte[], int):void");
    }

    public A6U(C62382rJ r2, C19999A2n a2n, C166378cn r4, String str, byte[] bArr, String[] strArr, int i) {
        C18070vi.A0f(str, 1, strArr);
        this.A04 = str;
        this.A00 = i;
        this.A02 = a2n;
        this.A06 = strArr;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = bArr;
    }
}
