package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.EOFException;

public final class CZF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final int[] A05 = new int[255];
    public final C26207Cui A06 = new C26207Cui(255);

    public boolean A00(C26036Cqw cqw, long j) {
        C26036Cqw cqw2 = cqw;
        long j2 = cqw2.A02;
        C26056CrS.A02(AnonymousClass000.A1P((j2 > (j2 + ((long) cqw2.A01)) ? 1 : (j2 == (j2 + ((long) cqw2.A01)) ? 0 : -1))));
        C26207Cui cui = this.A06;
        cui.A0G(4);
        while (true) {
            if (j != -1 && cqw2.A02 + 4 >= j) {
                break;
            }
            byte[] bArr = cui.A02;
            try {
                if (!cqw2.A04(4, true)) {
                    break;
                }
                System.arraycopy(cqw2.A03, cqw2.A01 - 4, bArr, 0, 4);
                cui.A0I(0);
                if (cui.A09() == 1332176723) {
                    cqw2.A01 = 0;
                    return true;
                }
                cqw2.A02(1);
            } catch (EOFException unused) {
            }
        }
        while (true) {
            if (j != -1 && cqw2.A02 >= j) {
                break;
            }
            int min = Math.min(cqw2.A00, 1);
            C26036Cqw.A01(cqw2, min);
            if (min == 0) {
                min = C26036Cqw.A00(cqw2, cqw2.A06, 0, Math.min(1, ZipDecompressor.UNZIP_BUFFER_SIZE), 0, true);
            }
            if (min == -1) {
                break;
            }
            cqw2.A02 += (long) min;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r14 == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.C26036Cqw r13, boolean r14) {
        /*
            r12 = this;
            X.Cui r6 = r12.A06
            r4 = 0
            r6.A0G(r4)
            r12.A03 = r4
            r0 = 0
            r12.A04 = r0
            r12.A02 = r4
            r12.A01 = r4
            r12.A00 = r4
            r3 = 27
            r6.A0G(r3)
            byte[] r2 = r6.A02
            boolean r0 = r13.A04(r3, r14)     // Catch:{ EOFException -> 0x0028 }
            if (r0 == 0) goto L_0x002b
            byte[] r1 = r13.A03     // Catch:{ EOFException -> 0x0028 }
            int r0 = r13.A01     // Catch:{ EOFException -> 0x0028 }
            int r0 = r0 - r3
            java.lang.System.arraycopy(r1, r0, r2, r4, r3)     // Catch:{ EOFException -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r2 = move-exception
            if (r14 == 0) goto L_0x0047
        L_0x002b:
            return r4
        L_0x002c:
            long r7 = r6.A09()
            r1 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002b
            int r0 = r6.A04()
            if (r0 == 0) goto L_0x0048
            if (r14 != 0) goto L_0x002b
            java.lang.String r1 = "unsupported bit stream revision"
            r0 = 0
            X.BxS r2 = new X.BxS
            r2.<init>(r1, r0, r4)
        L_0x0047:
            throw r2
        L_0x0048:
            int r0 = r6.A04()
            r12.A03 = r0
            byte[] r5 = r6.A02
            int r0 = r6.A01
            int r1 = r0 + 1
            byte r0 = r5[r0]
            long r2 = (long) r0
            r10 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r10
            int r9 = r1 + 1
            byte r0 = r5[r1]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 8
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r8 = r9 + 1
            byte r0 = r5[r9]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 16
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r9 = r8 + 1
            byte r0 = r5[r8]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 24
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r8 = r9 + 1
            byte r0 = r5[r9]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 32
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r9 = r8 + 1
            byte r0 = r5[r8]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 40
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r8 = r9 + 1
            byte r0 = r5[r9]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 48
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r0 = r8 + 1
            r6.A01 = r0
            byte r0 = r5[r8]
            long r0 = (long) r0
            long r0 = r0 & r10
            r5 = 56
            long r0 = r0 << r5
            long r0 = r0 | r2
            r12.A04 = r0
            r6.A07()
            r6.A07()
            r6.A07()
            int r1 = r6.A04()
            r12.A02 = r1
            int r0 = r1 + 27
            r12.A01 = r0
            r6.A0G(r4)
            byte[] r0 = r6.A02
            r13.A03(r0, r4, r1)
        L_0x00bf:
            int r0 = r12.A02
            if (r4 >= r0) goto L_0x00d3
            int[] r0 = r12.A05
            int r1 = r6.A04()
            r0[r4] = r1
            int r0 = r12.A00
            int r0 = r0 + r1
            r12.A00 = r0
            int r4 = r4 + 1
            goto L_0x00bf
        L_0x00d3:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZF.A01(X.Cqw, boolean):boolean");
    }
}
