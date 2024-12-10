package X;

import java.io.UnsupportedEncodingException;

/* renamed from: X.9vx  reason: invalid class name and case insensitive filesystem */
public abstract class C196979vx {
    public static String A00(byte[] bArr, int i) {
        byte[] bArr2;
        int i2;
        int i3;
        try {
            int length = bArr.length;
            boolean z = true;
            boolean A1P = AnonymousClass000.A1P(i & 1);
            boolean A1P2 = AnonymousClass000.A1P(i & 2);
            if ((i & 4) == 0) {
                z = false;
            }
            if ((i & 8) == 0) {
                bArr2 = AnonymousClass9HN.A00;
            } else {
                bArr2 = AnonymousClass9HN.A01;
            }
            int i4 = -1;
            if (A1P2) {
                i4 = 19;
            }
            int i5 = (length / 3) * 4;
            int i6 = 2;
            int i7 = length % 3;
            if (A1P) {
                if (i7 > 0) {
                    i5 += 4;
                }
            } else if (i7 == 1) {
                i5 += 2;
            } else if (i7 == 2) {
                i5 += 3;
            }
            if (A1P2 && length > 0) {
                int i8 = ((length - 1) / 57) + 1;
                if (!z) {
                    i6 = 1;
                }
                i5 += i8 * i6;
            }
            byte[] bArr3 = new byte[i5];
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = i9 + 3;
                if (i11 > length) {
                    break;
                }
                byte b = ((bArr[i9] & 255) << 16) | ((bArr[i9 + 1] & 255) << 8) | (bArr[i9 + 2] & 255);
                AnonymousClass8BR.A1J(bArr2, bArr3, b >> 18, i10);
                AnonymousClass8BR.A1J(bArr2, bArr3, b >> 12, i10 + 1);
                AnonymousClass8BR.A1J(bArr2, bArr3, b >> 6, i10 + 2);
                AnonymousClass8BR.A1J(bArr2, bArr3, b, i10 + 3);
                i9 = i11;
                i10 += 4;
                i2--;
                if (i2 == 0) {
                    if (z) {
                        bArr3[i10] = 13;
                        i10++;
                    }
                    bArr3[i10] = 10;
                    i10++;
                    i2 = 19;
                }
            }
            if (i9 == length - 1) {
                int i12 = (bArr[i9] & 255) << 4;
                int i13 = i10 + 1;
                AnonymousClass8BR.A1J(bArr2, bArr3, i12 >> 6, i10);
                i3 = i13 + 1;
                AnonymousClass8BR.A1J(bArr2, bArr3, i12, i13);
                if (A1P) {
                    int i14 = i3 + 1;
                    bArr3[i3] = 61;
                    i3 = i14 + 1;
                    bArr3[i14] = 61;
                }
            } else if (i9 == length - 2) {
                int i15 = ((bArr[i9 + 1] & 255) << 2) | ((bArr[i9] & 255) << 10);
                int i16 = i10 + 1;
                AnonymousClass8BR.A1J(bArr2, bArr3, i15 >> 12, i10);
                int i17 = i16 + 1;
                AnonymousClass8BR.A1J(bArr2, bArr3, i15 >> 6, i16);
                i3 = i17 + 1;
                AnonymousClass8BR.A1J(bArr2, bArr3, i15, i17);
                if (A1P) {
                    bArr3[i3] = 61;
                    i3++;
                }
            } else {
                if (A1P2 && i10 > 0 && i2 != 19) {
                    if (z) {
                        bArr3[i10] = 13;
                        i10++;
                    }
                    bArr3[i10] = 10;
                }
                return new String(bArr3, "US-ASCII");
            }
            if (A1P2) {
                if (z) {
                    bArr3[i3] = 13;
                    i3++;
                }
                bArr3[i3] = 10;
            }
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r11 != 4) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r2 == r5) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r1 = new byte[r2];
        java.lang.System.arraycopy(r4, 0, r1, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00be, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(byte[] r15) {
        /*
            int r6 = r15.length
            int r0 = r6 * 3
            int r5 = r0 / 4
            byte[] r4 = new byte[r5]
            int[] r3 = X.AnonymousClass9HM.A00
            r7 = 0
            r2 = 0
            r11 = 0
            r8 = 0
        L_0x000d:
            r12 = 3
            r10 = 4
            r13 = 2
            r1 = 1
            if (r8 >= r6) goto L_0x0027
            if (r11 != 0) goto L_0x0053
        L_0x0015:
            int r0 = r8 + 4
            if (r0 > r6) goto L_0x0048
            int r7 = X.AnonymousClass8BY.A05(r15, r3, r8)
            if (r7 < 0) goto L_0x0048
            X.AnonymousClass8BX.A1O(r4, r2, r7)
            int r2 = r2 + 3
            int r8 = r8 + 4
            goto L_0x0015
        L_0x0027:
            if (r11 == r1) goto L_0x006c
            if (r11 == r13) goto L_0x003f
            if (r11 == r12) goto L_0x0030
            if (r11 == r10) goto L_0x006c
            goto L_0x004a
        L_0x0030:
            int r1 = r2 + 1
            int r0 = r7 >> 10
            byte r0 = (byte) r0
            r4[r2] = r0
            int r2 = r1 + 1
            int r0 = r7 >> 2
            byte r0 = (byte) r0
            r4[r1] = r0
            goto L_0x004a
        L_0x003f:
            int r1 = r2 + 1
            int r0 = r7 >> 4
            byte r0 = (byte) r0
            r4[r2] = r0
            r2 = r1
            goto L_0x004a
        L_0x0048:
            if (r8 < r6) goto L_0x0053
        L_0x004a:
            if (r2 == r5) goto L_0x00be
            byte[] r1 = new byte[r2]
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r1, r0, r2)
            return r1
        L_0x0053:
            int r14 = r8 + 1
            byte r0 = r15[r8]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9 = r3[r0]
            r8 = -1
            if (r11 == 0) goto L_0x009f
            if (r11 == r1) goto L_0x009a
            r1 = -2
            if (r11 == r13) goto L_0x00ab
            r0 = 5
            if (r11 == r12) goto L_0x0078
            if (r11 == r10) goto L_0x0073
            if (r11 != r0) goto L_0x00b8
            if (r9 == r8) goto L_0x00b8
        L_0x006c:
            java.lang.String r0 = "bad base-64"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0073:
            if (r9 == r1) goto L_0x0095
            if (r9 == r8) goto L_0x00b8
            goto L_0x006c
        L_0x0078:
            if (r9 < 0) goto L_0x0085
            int r0 = r7 << 6
            r9 = r9 | r0
            X.AnonymousClass8BX.A1O(r4, r2, r9)
            int r2 = r2 + 3
            r7 = r9
            r11 = 0
            goto L_0x00b8
        L_0x0085:
            if (r9 != r1) goto L_0x0097
            int r1 = r2 + 1
            int r0 = r7 >> 2
            byte r0 = (byte) r0
            r4[r1] = r0
            int r0 = r7 >> 10
            byte r0 = (byte) r0
            r4[r2] = r0
            int r2 = r2 + 2
        L_0x0095:
            r11 = 5
            goto L_0x00b8
        L_0x0097:
            if (r9 == r8) goto L_0x00b8
            goto L_0x006c
        L_0x009a:
            if (r9 >= 0) goto L_0x00a4
            if (r9 == r8) goto L_0x00b8
            goto L_0x006c
        L_0x009f:
            if (r9 >= 0) goto L_0x00a7
            if (r9 == r8) goto L_0x00b8
            goto L_0x006c
        L_0x00a4:
            int r0 = r7 << 6
            r9 = r9 | r0
        L_0x00a7:
            int r11 = r11 + 1
            r7 = r9
            goto L_0x00b8
        L_0x00ab:
            if (r9 >= 0) goto L_0x00a4
            if (r9 != r1) goto L_0x00bb
            int r1 = r2 + 1
            int r0 = r7 >> 4
            byte r0 = (byte) r0
            r4[r2] = r0
            r2 = r1
            r11 = 4
        L_0x00b8:
            r8 = r14
            goto L_0x000d
        L_0x00bb:
            if (r9 == r8) goto L_0x00b8
            goto L_0x006c
        L_0x00be:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196979vx.A01(byte[]):byte[]");
    }
}
