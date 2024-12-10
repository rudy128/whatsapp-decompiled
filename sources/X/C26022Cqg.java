package X;

/* renamed from: X.Cqg  reason: case insensitive filesystem */
public class C26022Cqg {
    public int A00;
    public int A01 = -1;
    public int A02 = 0;
    public int A03 = -1;
    public C26146CtA A04;
    public C26146CtA A05;
    public C26146CtA A06;

    private String A00(C26146CtA ctA, int i) {
        if (i < 0) {
            return "<snip>";
        }
        if (ctA == null) {
            return "\n{x}";
        }
        String A0j = BEA.A0j(ctA, "\n", AnonymousClass000.A10());
        C26146CtA[] ctAArr = ctA.A09;
        int i2 = 0;
        do {
            C26146CtA ctA2 = ctAArr[i2];
            A0j = AnonymousClass000.A0y(A00(ctA2, i - 1).replace("\n", "\n-"), AnonymousClass000.A11(A0j));
            i2++;
        } while (i2 < 4);
        return A0j;
    }

    public static void A01(C26022Cqg cqg, C26146CtA ctA) {
        if (ctA == cqg.A04) {
            cqg.A04 = ctA.A07;
        }
        if (ctA == cqg.A05) {
            cqg.A05 = ctA.A06;
        }
        C26146CtA ctA2 = ctA.A07;
        if (ctA2 != null) {
            ctA2.A06 = ctA.A06;
        }
        C26146CtA ctA3 = ctA.A06;
        if (ctA3 != null) {
            ctA3.A07 = ctA2;
        }
        ctA.A07 = null;
        ctA.A06 = null;
    }

    public C26022Cqg() {
        C26146CtA ctA = new C26146CtA(-1, -1);
        this.A06 = ctA;
        ctA.A02 = 0;
        ctA.A03 = 0;
        ctA.A04 = 0;
        this.A04 = ctA;
        this.A05 = ctA;
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x009e, code lost:
        X.BE8.A0z(X.C26138Ct1.A0O, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a3, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r14 = this;
            long r2 = java.lang.System.nanoTime()
            int r5 = r14.A01     // Catch:{ all -> 0x009d }
            r4 = -1
            if (r5 == r4) goto L_0x004c
            int r0 = r14.A02     // Catch:{ all -> 0x009d }
            int r5 = r5 - r0
            int r1 = r14.A03     // Catch:{ all -> 0x009d }
            r11 = 1
            int r0 = r1 << r11
            int r0 = r11 << r0
            if (r1 != r4) goto L_0x0016
            r0 = 0
        L_0x0016:
            int r5 = r5 + r0
            int r0 = r14.A00     // Catch:{ all -> 0x009d }
            if (r0 <= r5) goto L_0x004c
            X.CtA r4 = r14.A04     // Catch:{ all -> 0x009d }
        L_0x001d:
            int r0 = r14.A00     // Catch:{ all -> 0x009d }
            r10 = 0
            if (r0 <= r5) goto L_0x0052
            if (r4 == 0) goto L_0x0052
            android.graphics.Bitmap r0 = r4.A02()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0044
            int r1 = r4.A04     // Catch:{ all -> 0x009d }
            int r0 = r14.A03     // Catch:{ all -> 0x009d }
            if (r1 == r0) goto L_0x0044
            int r0 = r4.A0B     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0044
            monitor-enter(r4)     // Catch:{ all -> 0x009d }
            android.graphics.Bitmap r0 = r4.A05     // Catch:{ all -> 0x0047 }
            if (r0 == r10) goto L_0x003c
            X.C26146CtA.A01(r4)     // Catch:{ all -> 0x0047 }
        L_0x003c:
            r4.A05 = r10     // Catch:{ all -> 0x0047 }
            monitor-exit(r4)     // Catch:{ all -> 0x009d }
            int r0 = r14.A00     // Catch:{ all -> 0x009d }
            int r0 = r0 - r11
            r14.A00 = r0     // Catch:{ all -> 0x009d }
        L_0x0044:
            X.CtA r4 = r4.A07     // Catch:{ all -> 0x009d }
            goto L_0x001d
        L_0x0047:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009d }
            throw r0     // Catch:{ all -> 0x009d }
        L_0x004a:
            if (r13 != 0) goto L_0x0052
        L_0x004c:
            X.Ct1 r0 = X.C26138Ct1.A0O
            X.BE8.A0z(r0, r2)
            return
        L_0x0052:
            X.CtA r9 = r14.A04     // Catch:{ all -> 0x009d }
            r13 = 0
        L_0x0055:
            if (r9 == 0) goto L_0x004a
            r8 = 0
        L_0x0058:
            r12 = 4
            if (r8 >= r12) goto L_0x009a
            X.CtA[] r0 = r9.A09     // Catch:{ all -> 0x009d }
            r7 = r0[r8]     // Catch:{ all -> 0x009d }
            if (r7 == 0) goto L_0x0097
            int r0 = r7.A0B     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0097
            android.graphics.Bitmap r0 = r7.A02()     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0097
            r6 = 0
            r1 = 0
            r5 = -1
        L_0x006e:
            X.CtA[] r4 = r7.A09     // Catch:{ all -> 0x009d }
            r0 = r4[r6]     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0077
            int r1 = r1 + 1
            r5 = r6
        L_0x0077:
            int r6 = r6 + 1
            if (r6 < r12) goto L_0x006e
            if (r1 != r11) goto L_0x008a
            X.CtA[] r1 = r9.A09     // Catch:{ all -> 0x009d }
            r0 = r4[r5]     // Catch:{ all -> 0x009d }
            r1[r8] = r0     // Catch:{ all -> 0x009d }
            A01(r14, r7)     // Catch:{ all -> 0x009d }
            r7.A03()     // Catch:{ all -> 0x009d }
            goto L_0x0096
        L_0x008a:
            if (r1 != 0) goto L_0x0097
            X.CtA[] r0 = r9.A09     // Catch:{ all -> 0x009d }
            r0[r8] = r10     // Catch:{ all -> 0x009d }
            A01(r14, r7)     // Catch:{ all -> 0x009d }
            r7.A03()     // Catch:{ all -> 0x009d }
        L_0x0096:
            r13 = 1
        L_0x0097:
            int r8 = r8 + 1
            goto L_0x0058
        L_0x009a:
            X.CtA r9 = r9.A07     // Catch:{ all -> 0x009d }
            goto L_0x0055
        L_0x009d:
            r1 = move-exception
            X.Ct1 r0 = X.C26138Ct1.A0O
            X.BE8.A0z(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26022Cqg.A02():void");
    }

    public void A03(C26146CtA ctA) {
        int i;
        int i2;
        int i3;
        int A052;
        C26146CtA[] ctAArr;
        int i4;
        if (ctA.A02() != null) {
            this.A00++;
        }
        C26146CtA ctA2 = this.A06;
        while (true) {
            i = ctA.A02;
            i2 = ctA.A03;
            i3 = ctA.A04;
            A052 = BEA.A05(i3, ctA2.A04, i, i2);
            ctAArr = ctA2.A09;
            C26146CtA ctA3 = ctAArr[A052];
            if (ctA3 == null || i3 <= (i4 = ctA3.A04)) {
                break;
            }
            int i5 = i3 - i4;
            if ((i >> i5) != ctA3.A02 || (i2 >> i5) != ctA3.A03) {
                break;
            }
            ctA2 = ctAArr[A052];
        }
        C26146CtA ctA4 = ctAArr[A052];
        if (ctA4 == null) {
            ctAArr[A052] = ctA;
        } else {
            int i6 = ctA4.A04;
            if (i3 < i6) {
                ctAArr[A052] = ctA;
                ctA.A09[BEA.A05(ctA4.A04, i3, ctA4.A02, ctA4.A03)] = ctA4;
            } else if (i6 == i3 && ctA4.A02 == i && ctA4.A03 == i2) {
                A01(this, ctA4);
                System.arraycopy(ctA4.A09, 0, ctA.A09, 0, 4);
                ctAArr[A052] = ctA;
                if (ctA4.A02() != null) {
                    this.A00--;
                }
                ctA4.A03();
            } else {
                int i7 = i3 - i6;
                int i8 = i >> i7;
                int i9 = i2 >> i7;
                int i10 = ctA4.A02;
                int i11 = ctA4.A03;
                while (true) {
                    if (i8 == i10 && i9 == i11) {
                        break;
                    }
                    i8 >>= 1;
                    i9 >>= 1;
                    i10 >>= 1;
                    i11 >>= 1;
                    i6--;
                }
                C26146CtA ctA5 = new C26146CtA(-1, -1);
                ctA5.A02 = i8;
                ctA5.A03 = i9;
                ctA5.A04 = i6;
                ctAArr[A052] = ctA5;
                C26146CtA[] ctAArr2 = ctA5.A09;
                ctAArr2[BEA.A05(ctA4.A04, i6, ctA4.A02, ctA4.A03)] = ctA4;
                ctAArr2[BEA.A05(ctA.A04, i6, ctA.A02, ctA.A03)] = ctA;
                A01(this, ctA5);
                C26146CtA ctA6 = this.A05;
                ctA6.A07 = ctA5;
                ctA5.A06 = ctA6;
                this.A05 = ctA5;
            }
        }
        A01(this, ctA);
        C26146CtA ctA7 = this.A05;
        ctA7.A07 = ctA;
        ctA.A06 = ctA7;
        this.A05 = ctA;
        A02();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(A00(this.A06, 10));
        return AnonymousClass000.A0y("\n", A10);
    }
}
