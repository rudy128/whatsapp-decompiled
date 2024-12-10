package X;

import android.net.Uri;
import java.util.Arrays;

public class D91 implements C28586E8z {
    public long A00;
    public Uri A01;
    public D48 A02;
    public D9O A03;
    public CR7 A04;
    public CR7 A05;
    public CR7 A06;
    public D48 A07;
    public final int A08;
    public final C25698CkT A09 = new C25698CkT();
    public final CPD A0A = new Object();
    public final C25215CbB A0B;
    public final C26207Cui A0C = new C26207Cui(32);

    public void BLZ(D48 d48) {
        boolean z;
        D48 d482 = d48;
        if (d48 == null) {
            d482 = null;
        }
        C25698CkT ckT = this.A09;
        synchronized (ckT) {
            z = true;
            if (d482 == null) {
                ckT.A08 = true;
            } else {
                ckT.A08 = false;
                if (!d482.equals(ckT.A07)) {
                    ckT.A07 = d482;
                }
            }
            z = false;
        }
        this.A07 = d48;
        D9O d9o = this.A03;
        if (d9o != null && z) {
            d9o.A0O.post(d9o.A0U);
        }
    }

    private int A00(int i) {
        CJ4 cj4;
        CR7 cr7 = this.A06;
        CR7 cr72 = cr7;
        if (cr7.A03 == null) {
            C25215CbB cbB = this.A0B;
            synchronized (cbB) {
                int i2 = cbB.A00 + 1;
                cbB.A00 = i2;
                int i3 = cbB.A01;
                if (i3 > 0) {
                    CJ4[] cj4Arr = cbB.A02;
                    int i4 = i3 - 1;
                    cbB.A01 = i4;
                    cj4 = cj4Arr[i4];
                    C26056CrS.A01(cj4);
                    cbB.A02[cbB.A01] = null;
                } else {
                    cj4 = new CJ4(new byte[cbB.A04]);
                    CJ4[] cj4Arr2 = cbB.A02;
                    int length = cj4Arr2.length;
                    if (i2 > length) {
                        cbB.A02 = (CJ4[]) Arrays.copyOf(cj4Arr2, length * 2);
                    }
                }
            }
            cr7 = this.A06;
            CR7 cr73 = new CR7(cr7.A00, this.A08);
            cr72.A03 = cj4;
            cr72.A02 = cr73;
        }
        return Math.min(i, (int) (cr7.A00 - this.A00));
    }

    public static void A01(D91 d91, long j) {
        if (j != -1) {
            while (true) {
                CR7 cr7 = d91.A04;
                if (j >= cr7.A00) {
                    C25215CbB cbB = d91.A0B;
                    CJ4 cj4 = cr7.A03;
                    synchronized (cbB) {
                        CJ4[] cj4Arr = cbB.A02;
                        int i = cbB.A01;
                        cbB.A01 = i + 1;
                        cj4Arr[i] = cj4;
                        cbB.A00--;
                        cbB.notifyAll();
                    }
                    CR7 cr72 = d91.A04;
                    cr72.A03 = null;
                    CR7 cr73 = cr72.A02;
                    cr72.A02 = null;
                    d91.A04 = cr73;
                } else if (d91.A05.A01 < cr7.A01) {
                    d91.A05 = cr7;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public static void A02(D91 d91, byte[] bArr, int i, long j) {
        CR7 cr7;
        while (true) {
            cr7 = d91.A05;
            if (j < cr7.A00) {
                break;
            }
            d91.A05 = cr7.A02;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (cr7.A00 - j));
            System.arraycopy(cr7.A03.A00, (int) (j - cr7.A01), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            cr7 = d91.A05;
            if (j == cr7.A00) {
                cr7 = cr7.A02;
                d91.A05 = cr7;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(boolean r12, long r13) {
        /*
            r11 = this;
            X.CkT r4 = r11.A09
            monitor-enter(r4)
            int r0 = r4.A03     // Catch:{ all -> 0x0050 }
            int r5 = r4.A04     // Catch:{ all -> 0x0050 }
            int r5 = r5 + r0
            int r0 = r4.A01     // Catch:{ all -> 0x0050 }
            if (r5 < r0) goto L_0x000d
            int r5 = r5 - r0
        L_0x000d:
            boolean r0 = r4.A01()     // Catch:{ all -> 0x0050 }
            r3 = -1
            if (r0 == 0) goto L_0x0024
            long[] r2 = r4.A0E     // Catch:{ all -> 0x0050 }
            r6 = r2[r5]     // Catch:{ all -> 0x0050 }
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0024
            long r0 = r4.A06     // Catch:{ all -> 0x0050 }
            int r6 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0027
            if (r12 != 0) goto L_0x0027
        L_0x0024:
            monitor-exit(r4)
            r8 = -1
            return r8
        L_0x0027:
            int r7 = r4.A02     // Catch:{ all -> 0x0050 }
            int r6 = r4.A03     // Catch:{ all -> 0x0050 }
            int r7 = r7 - r6
            r8 = -1
            r1 = 0
        L_0x002e:
            if (r1 >= r7) goto L_0x0049
            r9 = r2[r5]     // Catch:{ all -> 0x0050 }
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0049
            int[] r0 = r4.A0A     // Catch:{ all -> 0x0050 }
            r0 = r0[r5]     // Catch:{ all -> 0x0050 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x003f
            r8 = r1
        L_0x003f:
            int r5 = r5 + 1
            int r0 = r4.A01     // Catch:{ all -> 0x0050 }
            if (r5 != r0) goto L_0x0046
            r5 = 0
        L_0x0046:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0049:
            if (r8 == r3) goto L_0x0024
            int r6 = r6 + r8
            r4.A03 = r6     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)
            return r8
        L_0x0050:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D91.A03(boolean, long):int");
    }

    public void A04() {
        long j;
        C25698CkT ckT = this.A09;
        synchronized (ckT) {
            int i = ckT.A02;
            if (i == 0) {
                j = -1;
            } else {
                j = C25698CkT.A00(ckT, i);
            }
        }
        A01(this, j);
    }

    public void A05() {
        C25698CkT ckT = this.A09;
        ckT.A02 = 0;
        ckT.A00 = 0;
        ckT.A04 = 0;
        ckT.A03 = 0;
        ckT.A09 = true;
        ckT.A05 = Long.MIN_VALUE;
        ckT.A06 = Long.MIN_VALUE;
        CR7 cr7 = this.A04;
        if (cr7.A03 != null) {
            C25215CbB cbB = this.A0B;
            CR7 cr72 = cr7;
            synchronized (cbB) {
                do {
                    CJ4[] cj4Arr = cbB.A02;
                    int i = cbB.A01;
                    cbB.A01 = i + 1;
                    CJ4 cj4 = cr72.A03;
                    C26056CrS.A01(cj4);
                    cj4Arr[i] = cj4;
                    cbB.A00--;
                    cr72 = cr72.A02;
                    if (cr72 == null || cr72.A03 == null) {
                        cbB.notifyAll();
                    }
                    CJ4[] cj4Arr2 = cbB.A02;
                    int i2 = cbB.A01;
                    cbB.A01 = i2 + 1;
                    CJ4 cj42 = cr72.A03;
                    C26056CrS.A01(cj42);
                    cj4Arr2[i2] = cj42;
                    cbB.A00--;
                    cr72 = cr72.A02;
                    break;
                } while (cr72.A03 == null);
                cbB.notifyAll();
            }
            cr7.A03 = null;
            cr7.A02 = null;
        }
        CR7 cr73 = new CR7(0, this.A08);
        this.A04 = cr73;
        this.A05 = cr73;
        this.A06 = cr73;
        this.A00 = 0;
        this.A0B.A01();
    }

    public void CGY(C26207Cui cui, int i) {
        while (i > 0) {
            int A002 = A00(i);
            CR7 cr7 = this.A06;
            cui.A0K(cr7.A03.A00, (int) (this.A00 - cr7.A01), A002);
            i -= A002;
            long j = this.A00 + ((long) A002);
            this.A00 = j;
            CR7 cr72 = this.A06;
            if (j == cr72.A00) {
                this.A06 = cr72.A02;
            }
        }
    }

    public void CGa(C25117CYq cYq, int i, int i2, int i3, long j) {
        long j2 = (this.A00 - ((long) i2)) - ((long) i3);
        C25698CkT ckT = this.A09;
        synchronized (ckT) {
            if (ckT.A09) {
                if ((i & 1) != 0) {
                    ckT.A09 = false;
                }
            }
            C26056CrS.A03(!ckT.A08);
            ckT.A06 = Math.max(ckT.A06, j);
            int i4 = ckT.A02;
            int i5 = ckT.A04;
            int i6 = i5 + i4;
            int i7 = ckT.A01;
            if (i6 >= i7) {
                i6 -= i7;
            }
            ckT.A0E[i6] = j;
            long[] jArr = ckT.A0D;
            jArr[i6] = j2;
            ckT.A0B[i6] = i2;
            ckT.A0A[i6] = i;
            ckT.A0G[i6] = cYq;
            ckT.A0F[i6] = ckT.A07;
            ckT.A0C[i6] = 0;
            int i8 = i4 + 1;
            ckT.A02 = i8;
            if (i8 == i7) {
                int i9 = i7 + 1000;
                int[] iArr = new int[i9];
                long[] jArr2 = new long[i9];
                long[] jArr3 = new long[i9];
                int[] iArr2 = new int[i9];
                int[] iArr3 = new int[i9];
                C25117CYq[] cYqArr = new C25117CYq[i9];
                D48[] d48Arr = new D48[i9];
                int i10 = i7 - i5;
                System.arraycopy(jArr, i5, jArr2, 0, i10);
                System.arraycopy(ckT.A0E, ckT.A04, jArr3, 0, i10);
                System.arraycopy(ckT.A0A, ckT.A04, iArr2, 0, i10);
                System.arraycopy(ckT.A0B, ckT.A04, iArr3, 0, i10);
                System.arraycopy(ckT.A0G, ckT.A04, cYqArr, 0, i10);
                System.arraycopy(ckT.A0F, ckT.A04, d48Arr, 0, i10);
                System.arraycopy(ckT.A0C, ckT.A04, iArr, 0, i10);
                int i11 = ckT.A04;
                System.arraycopy(ckT.A0D, 0, jArr2, i10, i11);
                System.arraycopy(ckT.A0E, 0, jArr3, i10, i11);
                System.arraycopy(ckT.A0A, 0, iArr2, i10, i11);
                System.arraycopy(ckT.A0B, 0, iArr3, i10, i11);
                System.arraycopy(ckT.A0G, 0, cYqArr, i10, i11);
                System.arraycopy(ckT.A0F, 0, d48Arr, i10, i11);
                System.arraycopy(ckT.A0C, 0, iArr, i10, i11);
                ckT.A0D = jArr2;
                ckT.A0E = jArr3;
                ckT.A0A = iArr2;
                ckT.A0B = iArr3;
                ckT.A0G = cYqArr;
                ckT.A0F = d48Arr;
                ckT.A0C = iArr;
                ckT.A04 = 0;
                ckT.A02 = ckT.A01;
                ckT.A01 = i9;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.CPD] */
    public D91(C25215CbB cbB) {
        this.A0B = cbB;
        int i = cbB.A04;
        this.A08 = i;
        CR7 cr7 = new CR7(0, i);
        this.A04 = cr7;
        this.A05 = cr7;
        this.A06 = cr7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r6 == 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int CGZ(X.C26036Cqw r14, int r15) {
        /*
            r13 = this;
            int r10 = r13.A00(r15)
            X.CR7 r1 = r13.A06
            X.CJ4 r0 = r1.A03
            byte[] r8 = r0.A00
            long r2 = r13.A00
            long r0 = r1.A01
            long r2 = r2 - r0
            int r9 = (int) r2
            r7 = r14
            int r0 = r14.A00
            r11 = 0
            if (r0 == 0) goto L_0x0024
            int r6 = java.lang.Math.min(r0, r10)
            byte[] r0 = r14.A03
            java.lang.System.arraycopy(r0, r11, r8, r9, r6)
            X.C26036Cqw.A01(r14, r6)
            if (r6 != 0) goto L_0x0029
        L_0x0024:
            r12 = 1
            int r6 = X.C26036Cqw.A00(r7, r8, r9, r10, r11, r12)
        L_0x0029:
            r0 = -1
            if (r6 == r0) goto L_0x0044
            long r2 = r14.A02
            long r0 = (long) r6
            long r2 = r2 + r0
            r14.A02 = r2
            long r4 = r13.A00
            long r4 = r4 + r0
            r13.A00 = r4
            X.CR7 r3 = r13.A06
            long r1 = r3.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            X.CR7 r0 = r3.A02
            r13.A06 = r0
        L_0x0043:
            return r6
        L_0x0044:
            java.io.EOFException r0 = X.BE6.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D91.CGZ(X.Cqw, int):int");
    }
}
