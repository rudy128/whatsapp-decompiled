package X;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.D9f  reason: case insensitive filesystem */
public final class C26682D9f implements E8Z {
    public long A00;
    public long A01;
    public C26115Csd A02;
    public C24168Bwc A03;
    public File A04;
    public OutputStream A05;
    public final EA9 A06;
    public final boolean A07;
    public final int A08;
    public final long A09;
    public final DSC A0A;
    public final boolean A0B;

    private void A00() {
        if (this.A05 != null) {
            try {
                C25304Cd8.A01("cacheDataSinkSync");
                this.A05.flush();
                C25304Cd8.A00();
                OutputStream outputStream = this.A05;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.A05 = null;
                File file = this.A04;
                this.A04 = null;
                this.A06.BFF(file);
            } catch (Throwable th) {
                C25304Cd8.A00();
                OutputStream outputStream2 = this.A05;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.A05 = null;
                File file2 = this.A04;
                this.A04 = null;
                file2.delete();
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.Bwc, java.io.BufferedOutputStream] */
    private void A01() {
        int i;
        C26115Csd csd = this.A02;
        long j = csd.A02;
        long j2 = this.A00;
        long min = Math.min(j - j2, Long.MAX_VALUE);
        boolean z = this.A0B;
        if (z && this.A08 > 0 && j == -1) {
            min = Long.MAX_VALUE;
        }
        File CNo = this.A06.CNo(csd.A06, j2 + csd.A01, min);
        this.A04 = CNo;
        OutputStream A19 = C108945cZ.A19(CNo);
        this.A01 = 0;
        if (z && (i = this.A08) > 0) {
            C24168Bwc bwc = this.A03;
            if (bwc == null) {
                this.A03 = new BufferedOutputStream(A19, i);
            } else {
                bwc.A00(A19);
            }
        }
        OutputStream outputStream = this.A03;
        if (outputStream != null) {
            A19 = outputStream;
        }
        this.A05 = A19;
    }

    public void CAk(C26115Csd csd) {
        C24193Bx3 bx3;
        C26056CrS.A03(AnonymousClass000.A1O((csd.A02 > -1 ? 1 : (csd.A02 == -1 ? 0 : -1))));
        try {
            C25304Cd8.A01("exo-opencachedatasink");
            this.A02 = csd;
            this.A00 = 0;
            A01();
            C25304Cd8.A00();
            return;
        } catch (FileNotFoundException e) {
            bx3 = new C24193Bx3(e);
        } catch (C24182Bws e2) {
            bx3 = new C24193Bx3(e2);
        } catch (Throwable th) {
            C25304Cd8.A00();
            throw th;
        }
        throw bx3;
    }

    public C26682D9f(EA9 ea9, DSC dsc, int i, long j, boolean z, boolean z2) {
        C26056CrS.A01(ea9);
        this.A06 = ea9;
        this.A0B = z;
        this.A08 = i;
        this.A0A = dsc;
        this.A07 = z2;
        this.A09 = j;
    }

    public void close() {
        try {
            A00();
        } catch (IOException e) {
            throw new C24193Bx3(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r5.A00 <= 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
        if (r3 != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r5 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(byte[] r14, int r15, int r16) {
        /*
            r13 = this;
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.DSC r5 = r13.A0A     // Catch:{ IOException -> 0x0072 }
            boolean r10 = r13.A07     // Catch:{ IOException -> 0x0072 }
            if (r10 == 0) goto L_0x0017
            X.EA9 r0 = r13.A06     // Catch:{ IOException -> 0x0072 }
            if (r0 == 0) goto L_0x0017
            r0 = 1
            if (r5 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r4 = 0
            if (r0 == 0) goto L_0x0027
            X.EA9 r1 = r13.A06     // Catch:{ IOException -> 0x0072 }
            java.lang.String r0 = r5.A07     // Catch:{ IOException -> 0x0072 }
            boolean r0 = r1.BfM(r0)     // Catch:{ IOException -> 0x0072 }
            if (r0 == 0) goto L_0x0027
            long r8 = r13.A09     // Catch:{ IOException -> 0x0072 }
        L_0x0027:
            r6 = r16
            if (r4 >= r6) goto L_0x0071
            if (r10 == 0) goto L_0x0038
            X.EA9 r0 = r13.A06     // Catch:{ IOException -> 0x0072 }
            if (r0 == 0) goto L_0x0038
            if (r5 == 0) goto L_0x0038
            int r0 = r5.A00     // Catch:{ IOException -> 0x0072 }
            r3 = 1
            if (r0 > 0) goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            long r0 = r13.A01     // Catch:{ IOException -> 0x0072 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0042
            if (r3 == 0) goto L_0x0051
            goto L_0x0044
        L_0x0042:
            if (r3 == 0) goto L_0x004b
        L_0x0044:
            X.EA9 r1 = r13.A06     // Catch:{ IOException -> 0x0072 }
            java.lang.String r0 = r5.A07     // Catch:{ IOException -> 0x0072 }
            r1.BBJ(r0)     // Catch:{ IOException -> 0x0072 }
        L_0x004b:
            r13.A00()     // Catch:{ IOException -> 0x0072 }
            r13.A01()     // Catch:{ IOException -> 0x0072 }
        L_0x0051:
            int r0 = r16 - r4
            long r6 = (long) r0     // Catch:{ IOException -> 0x0072 }
            long r2 = r13.A01     // Catch:{ IOException -> 0x0072 }
            long r0 = r11 - r2
            long r0 = java.lang.Math.min(r6, r0)     // Catch:{ IOException -> 0x0072 }
            int r2 = (int) r0     // Catch:{ IOException -> 0x0072 }
            java.io.OutputStream r1 = r13.A05     // Catch:{ IOException -> 0x0072 }
            int r0 = r15 + r4
            r1.write(r14, r0, r2)     // Catch:{ IOException -> 0x0072 }
            int r4 = r4 + r2
            long r0 = r13.A01     // Catch:{ IOException -> 0x0072 }
            long r2 = (long) r2     // Catch:{ IOException -> 0x0072 }
            long r0 = r0 + r2
            r13.A01 = r0     // Catch:{ IOException -> 0x0072 }
            long r0 = r13.A00     // Catch:{ IOException -> 0x0072 }
            long r0 = r0 + r2
            r13.A00 = r0     // Catch:{ IOException -> 0x0072 }
            goto L_0x0027
        L_0x0071:
            return
        L_0x0072:
            r1 = move-exception
            X.Bx3 r0 = new X.Bx3
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26682D9f.write(byte[], int, int):void");
    }
}
