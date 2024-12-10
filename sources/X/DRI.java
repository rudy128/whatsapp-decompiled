package X;

import java.io.Closeable;
import java.io.InputStream;

public final class DRI implements Closeable {
    public C24875CNt A00;
    public final C25636CjO A01 = new C25636CjO();
    public final InputStream A02;
    public final byte[] A03 = new byte[8];

    private final void A03(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.A02.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw BE6.A0i();
            }
        }
        this.A00 = null;
    }

    public static final long A00(DRI dri) {
        DRI dri2 = dri;
        C24875CNt cNt = dri2.A00;
        byte b = cNt.A01;
        if (b < 24) {
            long j = (long) b;
            dri2.A00 = null;
            return j;
        } else if (b == 24) {
            int read = dri2.A02.read();
            if (read != -1) {
                dri2.A00 = null;
                return ((long) read) & 255;
            }
            throw BE6.A0i();
        } else if (b == 25) {
            byte[] bArr = dri2.A03;
            dri2.A03(bArr, 2);
            return ((((long) bArr[0]) & 255) << 8) | (255 & ((long) bArr[1]));
        } else if (b == 26) {
            byte[] bArr2 = dri2.A03;
            dri2.A03(bArr2, 4);
            long j2 = (long) bArr2[0];
            long j3 = (long) bArr2[1];
            long j4 = (long) bArr2[2];
            long j5 = (j3 & 255) << 16;
            return (((long) bArr2[3]) & 255) | j5 | ((j2 & 255) << 24) | ((j4 & 255) << 8);
        } else if (b == 27) {
            byte[] bArr3 = dri2.A03;
            dri2.A03(bArr3, 8);
            long j6 = (long) bArr3[0];
            long j7 = (long) bArr3[1];
            long j8 = (long) bArr3[2];
            long j9 = (long) bArr3[3];
            long j10 = (long) bArr3[4];
            long j11 = ((j8 & 255) << 40) | ((j6 & 255) << 56) | ((j7 & 255) << 48) | ((j9 & 255) << 32);
            long j12 = (((long) bArr3[5]) & 255) << 16;
            return (((long) bArr3[7]) & 255) | j12 | j11 | ((j10 & 255) << 24) | ((((long) bArr3[6]) & 255) << 8);
        } else {
            Object[] objArr = new Object[2];
            BE6.A1S(objArr, b, 0);
            C17880vN.A1T(objArr, (cNt.A00 >> 5) & 7, 1);
            throw C17880vN.A0f(String.format("invalid additional information %s for major type %s", objArr));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C24875CNt A05() {
        /*
            r10 = this;
            X.CNt r0 = r10.A00
            if (r0 != 0) goto L_0x00f6
            java.io.InputStream r0 = r10.A02
            int r2 = r0.read()
            r0 = -1
            if (r2 != r0) goto L_0x0014
            X.CjO r0 = r10.A01
            r0.A01()
            r0 = 0
            return r0
        L_0x0014:
            X.CNt r1 = new X.CNt
            r1.<init>(r2)
            r10.A00 = r1
            byte r2 = r1.A00
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r2 == r0) goto L_0x00b3
            r0 = -96
            if (r2 == r0) goto L_0x00b3
            r0 = -64
            if (r2 == r0) goto L_0x00b3
            r0 = -32
            if (r2 == r0) goto L_0x0082
            if (r2 == 0) goto L_0x00b3
            r0 = 32
            if (r2 == r0) goto L_0x00b3
            r0 = 64
            if (r2 == r0) goto L_0x006b
            r0 = 96
            if (r2 != r0) goto L_0x0070
            X.CjO r5 = r10.A01
            r6 = -2
        L_0x003f:
            long r2 = X.C25636CjO.A00(r5)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00d9
            r8 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            r8 = -2
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00d9
            r2 = -2
        L_0x0055:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            X.BE8.A1N(r1, r6)
            r0 = 1
            X.AnonymousClass3MX.A1S(r1, r0, r2)
            java.lang.String r0 = "expected non-string scope or scope %s but found %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x006b:
            X.CjO r5 = r10.A01
            r6 = -1
            goto L_0x003f
        L_0x0070:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            int r0 = r2 >> 5
            r0 = r0 & 7
            X.AnonymousClass000.A1L(r1, r0)
            java.lang.String r0 = "invalid major type: %s"
            java.lang.IllegalStateException r0 = X.BE8.A0Y(r0, r1)
            throw r0
        L_0x0082:
            byte r1 = r1.A01
            r0 = 31
            if (r1 != r0) goto L_0x00b3
            X.CjO r5 = r10.A01
            long r3 = X.C25636CjO.A00(r5)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a1
            r1 = -5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0119
            java.lang.String r0 = "expected a value for dangling key in indefinite-length map"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x00a1:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            X.BE8.A1N(r1, r3)
            java.lang.String r0 = "expected indefinite length scope but found %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x00b3:
            X.CjO r5 = r10.A01
            long r3 = X.C25636CjO.A00(r5)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c7
            r1 = -2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00d9
            r3 = -2
        L_0x00c7:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            X.BE8.A1N(r1, r3)
            java.lang.String r0 = "expected non-string scope but found %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x00d9:
            long r6 = X.C25636CjO.A00(r5)
            r1 = 1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0119
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            r0 = -1
            long r6 = r6 + r0
            java.util.Deque r5 = r5.A00
            r5.pop()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
        L_0x00f3:
            r5.push(r0)
        L_0x00f6:
            X.CNt r0 = r10.A00
            return r0
        L_0x00f9:
            r3 = -5
            r1 = -4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x010b
            java.util.Deque r5 = r5.A00
            r5.pop()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L_0x00f3
        L_0x010b:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00f6
            java.util.Deque r5 = r5.A00
            r5.pop()
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            goto L_0x00f3
        L_0x0119:
            java.util.Deque r0 = r5.A00
            r0.pop()
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRI.A05():X.CNt");
    }

    public final void close() {
        this.A02.close();
        this.A01.A01();
    }

    public DRI(InputStream inputStream) {
        this.A02 = inputStream;
    }

    public static final void A01(DRI dri) {
        dri.A05();
        byte b = dri.A00.A01;
        if (b == 31) {
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = Byte.valueOf(b);
            throw BE8.A0Y("expected definite length but found %s", A1a);
        }
    }

    public static final void A02(DRI dri, byte b) {
        dri.A05();
        byte b2 = dri.A00.A00;
        if (b2 != b) {
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass000.A1L(A1b, (b >> 5) & 7);
            AnonymousClass000.A1M(A1b, (b2 >> 5) & 7);
            throw BE8.A0Y("expected major type %s but found %s", A1b);
        }
    }

    public static final byte[] A04(DRI dri) {
        A01(dri);
        long A002 = A00(dri);
        if (A002 < 0 || A002 > 2147483647L) {
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, Integer.MAX_VALUE);
            throw BE6.A0v(String.format("the maximum supported byte/text string length is %s bytes", A1a));
        } else if (((long) dri.A02.available()) >= A002) {
            int i = (int) A002;
            byte[] bArr = new byte[i];
            dri.A03(bArr, i);
            return bArr;
        } else {
            throw BE6.A0i();
        }
    }
}
