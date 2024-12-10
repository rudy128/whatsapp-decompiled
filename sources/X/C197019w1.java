package X;

import java.io.UnsupportedEncodingException;

/* renamed from: X.9w1  reason: invalid class name and case insensitive filesystem */
public abstract class C197019w1 {
    public static String A00(byte[] bArr) {
        int i;
        try {
            int length = bArr.length;
            byte[] bArr2 = B4B.A00;
            int i2 = (length / 3) * 4;
            if (length % 3 > 0) {
                i2 += 4;
            }
            byte[] bArr3 = new byte[i2];
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i4 + 3;
                if (i6 > length) {
                    break;
                }
                byte b = ((bArr[i4] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8) | (bArr[i4 + 2] & 255);
                AnonymousClass8BR.A1J(bArr2, bArr3, b >> 18, i5);
                AnonymousClass8BR.A1J(bArr2, bArr3, b >> 12, i5 + 1);
                AnonymousClass8BR.A1J(bArr2, bArr3, b >> 6, i5 + 2);
                AnonymousClass8BR.A1J(bArr2, bArr3, b, i5 + 3);
                i4 = i6;
                i5 += 4;
                i3--;
                if (i3 == 0) {
                    bArr3[i5] = 10;
                    i5++;
                    i3 = 19;
                }
            }
            if (i4 == length - 1) {
                int i7 = (bArr[i4] & 255) << 4;
                int i8 = i5 + 1;
                AnonymousClass8BR.A1J(bArr2, bArr3, i7 >> 6, i5);
                int i9 = i8 + 1;
                AnonymousClass8BR.A1J(bArr2, bArr3, i7, i8);
                i = i9 + 1;
                bArr3[i9] = 61;
            } else {
                if (i4 == length - 2) {
                    int i10 = ((bArr[i4] & 255) << 10) | ((bArr[i4 + 1] & 255) << 2);
                    int i11 = i5 + 1;
                    AnonymousClass8BR.A1J(bArr2, bArr3, i10 >> 12, i5);
                    int i12 = i11 + 1;
                    AnonymousClass8BR.A1J(bArr2, bArr3, i10 >> 6, i11);
                    i = i12 + 1;
                    AnonymousClass8BR.A1J(bArr2, bArr3, i10, i12);
                }
                return new String(bArr3, "US-ASCII");
            }
            bArr3[i] = 61;
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r12 != 4) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r2 == r5) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = new byte[r2];
        java.lang.System.arraycopy(r4, 0, r1, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c2, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(java.lang.String r15) {
        /*
            byte[] r7 = r15.getBytes()
            int r6 = r7.length
            int r0 = r6 * 3
            int r5 = r0 / 4
            byte[] r4 = new byte[r5]
            int[] r3 = X.B4A.A00
            r8 = 0
            r2 = 0
            r12 = 0
            r9 = 0
        L_0x0011:
            r13 = 3
            r11 = 4
            r14 = 2
            r1 = 1
            if (r9 >= r6) goto L_0x002e
            if (r12 != 0) goto L_0x0057
        L_0x0019:
            int r0 = r9 + 4
            if (r0 > r6) goto L_0x002b
            int r8 = X.AnonymousClass8BY.A05(r7, r3, r9)
            if (r8 < 0) goto L_0x002b
            X.AnonymousClass8BX.A1O(r4, r2, r8)
            int r2 = r2 + 3
            int r9 = r9 + 4
            goto L_0x0019
        L_0x002b:
            if (r9 < r6) goto L_0x0057
            goto L_0x0036
        L_0x002e:
            if (r12 == r1) goto L_0x0070
            if (r12 == r14) goto L_0x004e
            if (r12 == r13) goto L_0x003f
            if (r12 == r11) goto L_0x0070
        L_0x0036:
            if (r2 == r5) goto L_0x00c2
            byte[] r1 = new byte[r2]
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r1, r0, r2)
            return r1
        L_0x003f:
            int r1 = r2 + 1
            int r0 = r8 >> 10
            byte r0 = (byte) r0
            r4[r2] = r0
            int r2 = r1 + 1
            int r0 = r8 >> 2
            byte r0 = (byte) r0
            r4[r1] = r0
            goto L_0x0036
        L_0x004e:
            int r1 = r2 + 1
            int r0 = r8 >> 4
            byte r0 = (byte) r0
            r4[r2] = r0
            r2 = r1
            goto L_0x0036
        L_0x0057:
            int r15 = r9 + 1
            byte r0 = r7[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r10 = r3[r0]
            r9 = -1
            if (r12 == 0) goto L_0x00a3
            if (r12 == r1) goto L_0x009e
            r1 = -2
            if (r12 == r14) goto L_0x00af
            r0 = 5
            if (r12 == r13) goto L_0x007c
            if (r12 == r11) goto L_0x0077
            if (r12 != r0) goto L_0x00bc
            if (r10 == r9) goto L_0x00bc
        L_0x0070:
            java.lang.String r0 = "bad base-64"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0077:
            if (r10 == r1) goto L_0x0099
            if (r10 == r9) goto L_0x00bc
            goto L_0x0070
        L_0x007c:
            if (r10 < 0) goto L_0x0089
            int r0 = r8 << 6
            r10 = r10 | r0
            X.AnonymousClass8BX.A1O(r4, r2, r10)
            int r2 = r2 + 3
            r8 = r10
            r12 = 0
            goto L_0x00bc
        L_0x0089:
            if (r10 != r1) goto L_0x009b
            int r1 = r2 + 1
            int r0 = r8 >> 2
            byte r0 = (byte) r0
            r4[r1] = r0
            int r0 = r8 >> 10
            byte r0 = (byte) r0
            r4[r2] = r0
            int r2 = r2 + 2
        L_0x0099:
            r12 = 5
            goto L_0x00bc
        L_0x009b:
            if (r10 == r9) goto L_0x00bc
            goto L_0x0070
        L_0x009e:
            if (r10 >= 0) goto L_0x00a8
            if (r10 == r9) goto L_0x00bc
            goto L_0x0070
        L_0x00a3:
            if (r10 >= 0) goto L_0x00ab
            if (r10 == r9) goto L_0x00bc
            goto L_0x0070
        L_0x00a8:
            int r0 = r8 << 6
            r10 = r10 | r0
        L_0x00ab:
            int r12 = r12 + 1
            r8 = r10
            goto L_0x00bc
        L_0x00af:
            if (r10 >= 0) goto L_0x00a8
            if (r10 != r1) goto L_0x00bf
            int r1 = r2 + 1
            int r0 = r8 >> 4
            byte r0 = (byte) r0
            r4[r2] = r0
            r2 = r1
            r12 = 4
        L_0x00bc:
            r9 = r15
            goto L_0x0011
        L_0x00bf:
            if (r10 == r9) goto L_0x00bc
            goto L_0x0070
        L_0x00c2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197019w1.A01(java.lang.String):byte[]");
    }
}
