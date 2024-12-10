package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.Bwo  reason: case insensitive filesystem */
public class C24178Bwo extends FilterInputStream {
    public final int A00;
    public final boolean A01 = false;
    public final byte[][] A02 = new byte[11][];

    public static int A00(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if ((read & StringTreeSet.OFFSET_BASE_ENCODING) != 0) {
            int i3 = 0;
            while (read >= 0) {
                int i4 = read & 128;
                int i5 = read & StringTreeSet.OFFSET_BASE_ENCODING;
                if (i4 == 0) {
                    return i3 | i5;
                }
                i3 = (i5 | i3) << 7;
                read = inputStream.read();
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw C17880vN.A0f("corrupted stream - invalid high tag number found");
    }

    public static C26135Csy A02(C28371DyH dyH) {
        if (dyH.A00 < 1) {
            return new C26135Csy(0);
        }
        C24178Bwo bwo = new C24178Bwo((InputStream) dyH);
        C26135Csy csy = new C26135Csy();
        while (true) {
            AnonymousClass1Bz A05 = bwo.A05();
            if (A05 == null) {
                return csy;
            }
            csy.A02(A05);
        }
    }

    /* JADX WARNING: type inference failed for: r4v25, types: [X.Dxe, java.lang.Object, X.1Bz] */
    /* JADX WARNING: type inference failed for: r4v28, types: [X.Dxp, java.lang.Object, X.1Bz] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0177, code lost:
        r7[r3] = (char) ((r5[0] << 8) | (r5[1] & 255));
        r7[r3 + 1] = (char) ((r5[2] << 8) | (r5[3] & 255));
        r7[r3 + 2] = (char) ((r5[4] << 8) | (r5[5] & 255));
        r7[r3 + 3] = (char) ((r5[6] << 8) | (r5[7] & 255));
        r3 = r3 + 4;
        r9 = r9 - 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0175, code lost:
        if (r1 != 8) goto L_0x01b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d2 A[LOOP:4: B:112:0x01d2->B:113:0x01e4, LOOP_START, PHI: r3 r4 
      PHI: (r3v4 int) = (r3v2 int), (r3v5 int) binds: [B:109:0x01ca, B:113:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:109:0x01ca, B:113:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1Bz A03(X.C28371DyH r10, byte[][] r11, int r12) {
        /*
            r0 = 10
            if (r12 == r0) goto L_0x0208
            r0 = 12
            if (r12 == r0) goto L_0x01fe
            r0 = 30
            if (r12 == r0) goto L_0x0155
            switch(r12) {
                case 1: goto L_0x00b9;
                case 2: goto L_0x00dc;
                case 3: goto L_0x010d;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00f1;
                case 6: goto L_0x00f4;
                default: goto L_0x000f;
            }
        L_0x000f:
            switch(r12) {
                case 18: goto L_0x0025;
                case 19: goto L_0x002f;
                case 20: goto L_0x0039;
                case 21: goto L_0x0049;
                case 22: goto L_0x0053;
                case 23: goto L_0x005d;
                case 24: goto L_0x0091;
                case 25: goto L_0x009b;
                case 26: goto L_0x00a5;
                case 27: goto L_0x00af;
                case 28: goto L_0x0229;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unknown tag "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " encountered"
            java.io.IOException r0 = X.BE9.A0e(r0, r1)
            throw r0
        L_0x0025:
            byte[] r0 = r10.A03()
            X.Dxu r4 = new X.Dxu
            r4.<init>(r0)
            return r4
        L_0x002f:
            byte[] r0 = r10.A03()
            X.Dxw r4 = new X.Dxw
            r4.<init>((byte[]) r0)
            return r4
        L_0x0039:
            byte[] r0 = r10.A03()
            X.Dxp r4 = new X.Dxp
            r4.<init>()
            byte[] r0 = X.AnonymousClass1C2.A02(r0)
            r4.A00 = r0
            return r4
        L_0x0049:
            byte[] r0 = r10.A03()
            X.Dxr r4 = new X.Dxr
            r4.<init>(r0)
            return r4
        L_0x0053:
            byte[] r0 = r10.A03()
            X.Dxz r4 = new X.Dxz
            r4.<init>((byte[]) r0)
            return r4
        L_0x005d:
            byte[] r2 = r10.A03()
            X.Dxe r4 = new X.Dxe
            r4.<init>()
            int r1 = r2.length
            r0 = 2
            if (r1 < r0) goto L_0x008a
            r4.A00 = r2
            r0 = 0
            byte r1 = r2[r0]
            r0 = 48
            if (r1 < r0) goto L_0x0083
            r0 = 57
            if (r1 > r0) goto L_0x0083
            r0 = 1
            byte r1 = r2[r0]
            r0 = 48
            if (r1 < r0) goto L_0x0083
            r0 = 57
            if (r1 > r0) goto L_0x0083
            return r4
        L_0x0083:
            java.lang.String r0 = "illegal characters in UTCTime string"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x008a:
            java.lang.String r0 = "UTCTime string too short"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0091:
            byte[] r0 = r10.A03()
            X.Dxk r4 = new X.Dxk
            r4.<init>((byte[]) r0)
            return r4
        L_0x009b:
            byte[] r0 = r10.A03()
            X.Dxq r4 = new X.Dxq
            r4.<init>(r0)
            return r4
        L_0x00a5:
            byte[] r0 = r10.A03()
            X.Dxv r4 = new X.Dxv
            r4.<init>(r0)
            return r4
        L_0x00af:
            byte[] r0 = r10.A03()
            X.Dxt r4 = new X.Dxt
            r4.<init>(r0)
            return r4
        L_0x00b9:
            byte[] r2 = A04(r10, r11)
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x00d5
            r0 = 0
            byte r1 = r2[r0]
            r0 = -1
            if (r1 == r0) goto L_0x00d2
            if (r1 == 0) goto L_0x00cf
            X.Dxi r4 = new X.Dxi
            r4.<init>(r1)
            return r4
        L_0x00cf:
            X.Dxi r4 = X.C28336Dxi.A01
            return r4
        L_0x00d2:
            X.Dxi r4 = X.C28336Dxi.A02
            return r4
        L_0x00d5:
            java.lang.String r0 = "BOOLEAN value should have 1 byte in it"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00dc:
            byte[] r1 = r10.A03()
            r0 = 0
            X.Dxj r4 = new X.Dxj
            r4.<init>(r1, r0)
            return r4
        L_0x00e7:
            byte[] r0 = r10.A03()
            X.DxZ r4 = new X.DxZ
            r4.<init>(r0)
            return r4
        L_0x00f1:
            X.Dwh r4 = X.C28273Dwh.A00
            return r4
        L_0x00f4:
            byte[] r2 = A04(r10, r11)
            X.1C1 r1 = new X.1C1
            r1.<init>(r2)
            java.util.concurrent.ConcurrentMap r0 = X.AnonymousClass1C0.A02
            java.lang.Object r4 = r0.get(r1)
            X.1Bz r4 = (X.AnonymousClass1Bz) r4
            if (r4 != 0) goto L_0x0232
            X.1C0 r4 = new X.1C0
            r4.<init>((byte[]) r2)
            return r4
        L_0x010d:
            int r5 = r10.A00
            r4 = 1
            if (r5 < r4) goto L_0x014e
            int r3 = r10.read()
            int r5 = r5 - r4
            byte[] r2 = new byte[r5]
            if (r5 == 0) goto L_0x0148
            r1 = 0
        L_0x011c:
            if (r1 >= r5) goto L_0x0128
            int r0 = r5 - r1
            int r0 = r10.read(r2, r1, r0)
            if (r0 < 0) goto L_0x0128
            int r1 = r1 + r0
            goto L_0x011c
        L_0x0128:
            if (r1 != r5) goto L_0x0140
            if (r3 <= 0) goto L_0x0148
            r0 = 8
            if (r3 >= r0) goto L_0x0148
            int r5 = r5 - r4
            byte r1 = r2[r5]
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r0 << r3
            r0 = r0 & r1
            byte r0 = (byte) r0
            if (r1 == r0) goto L_0x0148
            X.Dwc r4 = new X.Dwc
            r4.<init>(r2, r3)
            return r4
        L_0x0140:
            java.lang.String r0 = "EOF encountered in middle of BIT STRING"
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>(r0)
            throw r1
        L_0x0148:
            X.Dwd r4 = new X.Dwd
            r4.<init>(r2, r3)
            return r4
        L_0x014e:
            java.lang.String r0 = "truncated BIT STRING detected"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r0)
            throw r1
        L_0x0155:
            int r9 = r10.A00
            r0 = r9 & 1
            if (r0 != 0) goto L_0x01f7
            int r8 = r9 / 2
            char[] r7 = new char[r8]
            r6 = 8
            byte[] r5 = new byte[r6]
            r4 = 0
            r3 = 0
        L_0x0165:
            java.lang.String r2 = "EOF encountered in middle of BMPString"
            if (r9 < r6) goto L_0x01bb
            r1 = 0
        L_0x016a:
            int r0 = r6 - r1
            int r0 = r10.read(r5, r1, r0)
            if (r0 < 0) goto L_0x01b5
            int r1 = r1 + r0
            if (r1 < r6) goto L_0x016a
            if (r1 != r6) goto L_0x01b5
            byte r1 = r5[r4]
            int r1 = r1 << r6
            r0 = 1
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r3] = r0
            int r2 = r3 + 1
            r0 = 2
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 3
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r2] = r0
            int r2 = r3 + 2
            r0 = 4
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 5
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r2] = r0
            int r2 = r3 + 3
            r0 = 6
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 7
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r2] = r0
            int r3 = r3 + 4
            int r9 = r9 + -8
            goto L_0x0165
        L_0x01b5:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>(r2)
            throw r0
        L_0x01bb:
            if (r9 <= 0) goto L_0x01e6
            r1 = 0
        L_0x01be:
            int r0 = r9 - r1
            int r0 = r10.read(r5, r1, r0)
            if (r0 < 0) goto L_0x01ca
            int r1 = r1 + r0
            if (r1 >= r9) goto L_0x01ca
            goto L_0x01be
        L_0x01ca:
            if (r1 == r9) goto L_0x01d2
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>(r2)
            throw r0
        L_0x01d2:
            int r0 = r4 + 1
            byte r2 = r5[r4]
            int r2 = r2 << r6
            int r4 = r0 + 1
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r2 = r2 | r0
            char r0 = (char) r2
            r7[r3] = r0
            r3 = r1
            if (r4 < r9) goto L_0x01d2
        L_0x01e6:
            int r0 = r10.A00
            if (r0 != 0) goto L_0x01f2
            if (r8 != r3) goto L_0x01f2
            X.Dxs r4 = new X.Dxs
            r4.<init>(r7)
            return r4
        L_0x01f2:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        L_0x01f7:
            java.lang.String r0 = "malformed BMPString encoding encountered"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x01fe:
            byte[] r0 = r10.A03()
            X.Dxx r4 = new X.Dxx
            r4.<init>((byte[]) r0)
            return r4
        L_0x0208:
            byte[] r3 = A04(r10, r11)
            int r1 = r3.length
            r0 = 1
            if (r1 > r0) goto L_0x023a
            if (r1 == 0) goto L_0x0233
            r0 = 0
            byte r0 = r3[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            X.Dxh[] r1 = X.C28335Dxh.A02
            r0 = 12
            if (r2 >= r0) goto L_0x023a
            r4 = r1[r2]
            if (r4 != 0) goto L_0x0232
            X.Dxh r4 = new X.Dxh
            r4.<init>((byte[]) r3)
            r1[r2] = r4
            return r4
        L_0x0229:
            byte[] r0 = r10.A03()
            X.Dxy r4 = new X.Dxy
            r4.<init>(r0)
        L_0x0232:
            return r4
        L_0x0233:
            java.lang.String r0 = "ENUMERATED has zero length"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x023a:
            X.Dxh r4 = new X.Dxh
            r4.<init>((byte[]) r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24178Bwo.A03(X.DyH, byte[][], int):X.1Bz");
    }

    public static byte[] A04(C28371DyH dyH, byte[][] bArr) {
        int i = dyH.A00;
        if (i >= bArr.length) {
            return dyH.A03();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        int length = bArr2.length;
        if (i != length) {
            throw AnonymousClass000.A0k("buffer length not right for data");
        } else if (i == 0) {
            return bArr2;
        } else {
            int i2 = dyH.A00;
            if (i < i2) {
                InputStream inputStream = dyH.A01;
                int i3 = 0;
                while (i3 < length) {
                    int read = inputStream.read(bArr2, i3, length - i3);
                    if (read < 0) {
                        break;
                    }
                    i3 += read;
                }
                int i4 = i - i3;
                dyH.A00 = i4;
                if (i4 == 0) {
                    dyH.A02();
                    return bArr2;
                }
                throw new EOFException(AnonymousClass001.A1I(" object truncated by ", C24221BxZ.A00(dyH), i4));
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("corrupted stream - out of bounds length found: ");
            A10.append(i);
            throw C17880vN.A0f(AnonymousClass001.A1I(" >= ", A10, i2));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24178Bwo(byte[] r4, boolean r5) {
        /*
            r3 = this;
            java.io.ByteArrayInputStream r2 = X.BE6.A0h(r4)
            int r1 = r4.length
            r0 = 1
            r3.<init>(r2)
            r3.A00 = r1
            r3.A01 = r0
            r0 = 11
            byte[][] r0 = new byte[r0][]
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24178Bwo.<init>(byte[], boolean):void");
    }

    public static int A01(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read > 127) {
                int i2 = read & StringTreeSet.OFFSET_BASE_ENCODING;
                if (i2 <= 4) {
                    read = 0;
                    int i3 = 0;
                    while (i3 < i2) {
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            read = (read << 8) + read2;
                            i3++;
                        } else {
                            throw new EOFException("EOF found reading length");
                        }
                    }
                    if (read < 0) {
                        throw C17880vN.A0f("corrupted stream - negative length found");
                    } else if (read >= i && !z) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("corrupted stream - out of bounds length found: ");
                        A10.append(read);
                        throw C17880vN.A0f(AnonymousClass001.A1I(" >= ", A10, i));
                    }
                } else {
                    throw C17880vN.A0f(AnonymousClass001.A1I("DER length more than 4 bytes: ", AnonymousClass000.A10(), i2));
                }
            }
            return read;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.Dxo[]} */
    /* JADX WARNING: type inference failed for: r3v8, types: [X.Dy2, X.Dxl, X.1Bz] */
    /* JADX WARNING: type inference failed for: r3v9, types: [X.Dy5, X.Dxm, X.1Bz] */
    /* JADX WARNING: type inference failed for: r0v31, types: [X.DYT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v34, types: [X.DYQ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v37, types: [X.DYV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v42, types: [X.DYX, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1Bz A05() {
        /*
            r8 = this;
            int r7 = r8.read()
            if (r7 > 0) goto L_0x0011
            if (r7 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            java.lang.String r0 = "unexpected end-of-contents marker"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0011:
            int r2 = A00(r8, r7)
            r3 = r7 & 32
            boolean r1 = X.AnonymousClass000.A1O(r3)
            int r6 = r8.A00
            r0 = 0
            int r0 = A01(r8, r6, r0)
            if (r0 >= 0) goto L_0x0095
            if (r1 == 0) goto L_0x008e
            X.DyG r0 = new X.DyG
            r0.<init>(r8, r6)
            X.Cak r1 = new X.Cak
            r1.<init>(r0, r6)
            r0 = r7 & 64
            if (r0 == 0) goto L_0x003e
            X.DYS r0 = new X.DYS
            r0.<init>(r1, r2)
            X.1Bz r0 = r0.BU4()
            return r0
        L_0x003e:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0048
            r0 = 1
            X.Dxn r0 = r1.A02(r2, r0)
            return r0
        L_0x0048:
            r0 = 4
            if (r2 == r0) goto L_0x0082
            r0 = 8
            if (r2 == r0) goto L_0x0076
            r0 = 16
            if (r2 == r0) goto L_0x006a
            r0 = 17
            if (r2 != r0) goto L_0x0063
            X.DYX r0 = new X.DYX
            r0.<init>()
            r0.A00 = r1
            X.1Bz r0 = r0.BU4()
            return r0
        L_0x0063:
            java.lang.String r0 = "unknown BER object encountered"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x006a:
            X.DYV r0 = new X.DYV
            r0.<init>()
            r0.A00 = r1
            X.1Bz r0 = r0.BU4()
            return r0
        L_0x0076:
            X.DYQ r0 = new X.DYQ
            r0.<init>()
            r0.A00 = r1
            X.1Bz r0 = r0.BU4()
            return r0
        L_0x0082:
            X.DYT r0 = new X.DYT
            r0.<init>()
            r0.A00 = r1
            X.1Bz r0 = r0.BU4()
            return r0
        L_0x008e:
            java.lang.String r0 = "indefinite-length primitive encoding encountered"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0095:
            r5 = 0
            boolean r4 = X.AnonymousClass000.A1O(r3)
            X.DyH r3 = new X.DyH     // Catch:{ IllegalArgumentException -> 0x015a }
            r3.<init>(r8, r0, r6)     // Catch:{ IllegalArgumentException -> 0x015a }
            r0 = r7 & 64
            if (r0 == 0) goto L_0x00ad
            byte[] r0 = r3.A03()     // Catch:{ IllegalArgumentException -> 0x015a }
            X.Dwb r3 = new X.Dwb     // Catch:{ IllegalArgumentException -> 0x015a }
            r3.<init>(r0, r2, r4)     // Catch:{ IllegalArgumentException -> 0x015a }
            return r3
        L_0x00ad:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00bf
            int r1 = X.C26084Cs1.A02(r3)     // Catch:{ IllegalArgumentException -> 0x015a }
            X.Cak r0 = new X.Cak     // Catch:{ IllegalArgumentException -> 0x015a }
            r0.<init>(r3, r1)     // Catch:{ IllegalArgumentException -> 0x015a }
            X.Dxn r3 = r0.A02(r2, r4)     // Catch:{ IllegalArgumentException -> 0x015a }
            return r3
        L_0x00bf:
            if (r4 == 0) goto L_0x0153
            r0 = 4
            if (r2 == r0) goto L_0x0123
            r0 = 8
            if (r2 == r0) goto L_0x0119
            r0 = 16
            if (r2 == r0) goto L_0x00f8
            r0 = 17
            if (r2 != r0) goto L_0x00e5
            X.Csy r2 = A02(r3)     // Catch:{ IllegalArgumentException -> 0x015a }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException -> 0x015a }
            r0 = 1
            if (r1 >= r0) goto L_0x00dc
            X.Dxm r3 = X.CHZ.A01     // Catch:{ IllegalArgumentException -> 0x015a }
            return r3
        L_0x00dc:
            X.Dy5 r3 = new X.Dy5     // Catch:{ IllegalArgumentException -> 0x015a }
            r3.<init>((X.C26135Csy) r2, (boolean) r5)     // Catch:{ IllegalArgumentException -> 0x015a }
            r0 = -1
            r3.A00 = r0     // Catch:{ IllegalArgumentException -> 0x015a }
            return r3
        L_0x00e5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x015a }
            java.lang.String r0 = "unknown tag "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x015a }
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x015a }
            java.lang.String r0 = " encountered"
            java.io.IOException r0 = X.BE9.A0e(r0, r1)     // Catch:{ IllegalArgumentException -> 0x015a }
            goto L_0x014c
        L_0x00f8:
            boolean r0 = r8.A01     // Catch:{ IllegalArgumentException -> 0x015a }
            if (r0 == 0) goto L_0x0108
            byte[] r0 = r3.A03()     // Catch:{ IllegalArgumentException -> 0x015a }
            X.Dy2 r3 = new X.Dy2     // Catch:{ IllegalArgumentException -> 0x015a }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x015a }
            r3.A00 = r0     // Catch:{ IllegalArgumentException -> 0x015a }
            return r3
        L_0x0108:
            X.Csy r2 = A02(r3)     // Catch:{ IllegalArgumentException -> 0x015a }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException -> 0x015a }
            r0 = 1
            if (r1 >= r0) goto L_0x0114
            X.Dxl r3 = X.CHZ.A00     // Catch:{ IllegalArgumentException -> 0x015a }
            return r3
        L_0x0114:
            X.Dy1 r3 = X.C28339Dxl.A08(r2)     // Catch:{ IllegalArgumentException -> 0x015a }
            return r3
        L_0x0119:
            X.Csy r0 = A02(r3)     // Catch:{ IllegalArgumentException -> 0x015a }
            X.Dwf r3 = new X.Dwf     // Catch:{ IllegalArgumentException -> 0x015a }
            r3.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x015a }
            return r3
        L_0x0123:
            X.Csy r4 = A02(r3)     // Catch:{ IllegalArgumentException -> 0x015a }
            int r3 = r4.A00     // Catch:{ IllegalArgumentException -> 0x015a }
            X.Dxo[] r1 = new X.C28342Dxo[r3]     // Catch:{ IllegalArgumentException -> 0x015a }
        L_0x012b:
            if (r5 == r3) goto L_0x014d
            X.1Bx r2 = r4.A01(r5)     // Catch:{ IllegalArgumentException -> 0x015a }
            boolean r0 = r2 instanceof X.C28342Dxo     // Catch:{ IllegalArgumentException -> 0x015a }
            if (r0 == 0) goto L_0x013a
            r1[r5] = r2     // Catch:{ IllegalArgumentException -> 0x015a }
            int r5 = r5 + 1
            goto L_0x012b
        L_0x013a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x015a }
            java.lang.String r0 = "unknown object encountered in constructed OCTET STRING: "
            X.BE9.A1G(r2, r0, r1)     // Catch:{ IllegalArgumentException -> 0x015a }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x015a }
            X.BxM r0 = new X.BxM     // Catch:{ IllegalArgumentException -> 0x015a }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x015a }
        L_0x014c:
            throw r0     // Catch:{ IllegalArgumentException -> 0x015a }
        L_0x014d:
            X.Dxa r3 = new X.Dxa     // Catch:{ IllegalArgumentException -> 0x015a }
            r3.<init>((X.C28342Dxo[]) r1)     // Catch:{ IllegalArgumentException -> 0x015a }
            return r3
        L_0x0153:
            byte[][] r0 = r8.A02     // Catch:{ IllegalArgumentException -> 0x015a }
            X.1Bz r3 = A03(r3, r0, r2)     // Catch:{ IllegalArgumentException -> 0x015a }
            return r3
        L_0x015a:
            r2 = move-exception
            java.lang.String r1 = "corrupted stream detected"
            X.BxM r0 = new X.BxM
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24178Bwo.A05():X.1Bz");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24178Bwo(byte[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayInputStream r2 = X.BE6.A0h(r4)
            int r1 = r4.length
            r0 = 0
            r3.<init>(r2)
            r3.A00 = r1
            r3.A01 = r0
            r0 = 11
            byte[][] r0 = new byte[r0][]
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24178Bwo.<init>(byte[]):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24178Bwo(InputStream inputStream, boolean z) {
        super(inputStream);
        int A022 = C26084Cs1.A02(inputStream);
        this.A00 = A022;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24178Bwo(InputStream inputStream) {
        super(inputStream);
        int A022 = C26084Cs1.A02(inputStream);
        this.A00 = A022;
    }
}
