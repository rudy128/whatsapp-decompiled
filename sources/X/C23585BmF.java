package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.BmF  reason: case insensitive filesystem */
public final class C23585BmF extends C25857CnL {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final InputStream A06;
    public final byte[] A07;

    public C23585BmF(InputStream inputStream) {
        Charset charset = CIC.A04;
        this.A06 = inputStream;
        this.A07 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        this.A00 = 0;
        this.A03 = 0;
        this.A04 = 0;
    }

    public static void A01(C23585BmF bmF) {
        int i = bmF.A00 + bmF.A05;
        bmF.A00 = i;
        int i2 = bmF.A04 + i;
        int i3 = bmF.A01;
        if (i2 > i3) {
            int i4 = i2 - i3;
            bmF.A05 = i4;
            bmF.A00 = i - i4;
            return;
        }
        bmF.A05 = 0;
    }

    public static boolean A03(C23585BmF bmF, int i) {
        int i2 = bmF.A03;
        int i3 = i2 + i;
        int i4 = bmF.A00;
        if (i3 > i4) {
            int i5 = bmF.A04;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= bmF.A01) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = bmF.A07;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = bmF.A04 + i2;
                    bmF.A04 = i5;
                    i4 = bmF.A00 - i2;
                    bmF.A00 = i4;
                    bmF.A03 = 0;
                }
                InputStream inputStream = bmF.A06;
                try {
                    int read = inputStream.read(bmF.A07, i4, BE6.A09(Integer.MAX_VALUE - i5, i4, ZipDecompressor.UNZIP_BUFFER_SIZE - i4));
                    if (read == 0 || read < -1 || read > 4096) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append(inputStream.getClass());
                        A10.append("#read(byte[]) returned invalid result: ");
                        A10.append(read);
                        throw AnonymousClass000.A0o("\nThe InputStream implementation is buggy.", A10);
                    } else if (read > 0) {
                        bmF.A00 += read;
                        A01(bmF);
                        if (bmF.A00 >= i) {
                            return true;
                        }
                        return A03(bmF, i);
                    }
                } catch (AnonymousClass1PN e) {
                    e.wasThrownFromInputStream = true;
                    throw e;
                }
            }
            return false;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("refillBuffer() called when ");
        A102.append(i);
        throw AnonymousClass000.A0o(" bytes were already available in buffer", A102);
    }

    public static byte[] A05(C23585BmF bmF, int i) {
        if (i >= 0) {
            int i2 = bmF.A04;
            int i3 = bmF.A03;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE <= 0) {
                int i5 = bmF.A01;
                if (i4 <= i5) {
                    int i6 = bmF.A00 - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > bmF.A06.available()) {
                                return null;
                            }
                        } catch (AnonymousClass1PN e) {
                            e.wasThrownFromInputStream = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(bmF.A07, bmF.A03, bArr, 0, i6);
                    bmF.A04 += bmF.A00;
                    bmF.A03 = 0;
                    bmF.A00 = 0;
                    while (i6 < i) {
                        int read = bmF.A06.read(bArr, i6, i - i6);
                        if (read != -1) {
                            bmF.A04 += read;
                            i6 += read;
                        } else {
                            throw BE7.A0M();
                        }
                    }
                    return bArr;
                }
                bmF.A0b((i5 - i2) - i3);
                throw BE7.A0M();
            }
            throw BE6.A0c("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw BE7.A0N();
    }

    public int A0W() {
        int i = this.A03;
        if (this.A00 - i < 4) {
            A02(this, 4);
            i = this.A03;
        }
        byte[] bArr = this.A07;
        this.A03 = i + 4;
        return BEB.A08(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r4[r2] < 0) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0X() {
        /*
            r5 = this;
            int r0 = r5.A03
            int r1 = r5.A00
            if (r1 == r0) goto L_0x004d
            byte[] r4 = r5.A07
            int r2 = r0 + 1
            byte r3 = r4[r0]
            if (r3 < 0) goto L_0x0011
            r5.A03 = r2
            return r3
        L_0x0011:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0053
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x005f
        L_0x0022:
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L_0x005e
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x005f
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x005e
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x005f
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x005e
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x005f
        L_0x004d:
            long r1 = r5.A0a()
            int r0 = (int) r1
            return r0
        L_0x0053:
            int r2 = r1 + 1
            byte r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x0062
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L_0x005e:
            r1 = r2
        L_0x005f:
            r5.A03 = r1
            return r3
        L_0x0062:
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0022
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23585BmF.A0X():int");
    }

    public long A0Y() {
        int i = this.A03;
        if (this.A00 - i < 8) {
            A02(this, 8);
            i = this.A03;
        }
        byte[] bArr = this.A07;
        this.A03 = i + 8;
        return C25857CnL.A06(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (((long) r5[r1]) < 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0Z() {
        /*
            r10 = this;
            int r0 = r10.A03
            int r3 = r10.A00
            if (r3 == r0) goto L_0x006a
            byte[] r5 = r10.A07
            int r2 = r0 + 1
            byte r1 = r5[r0]
            if (r1 < 0) goto L_0x0012
            r10.A03 = r2
            long r0 = (long) r1
            return r0
        L_0x0012:
            int r3 = r3 - r2
            r0 = 9
            if (r3 < r0) goto L_0x006a
            int r6 = r2 + 1
            byte r0 = r5[r2]
            int r0 = r0 << 7
            r1 = r1 ^ r0
            if (r1 >= 0) goto L_0x0024
            r1 = r1 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r0 = (long) r1
            goto L_0x0083
        L_0x0024:
            int r2 = r6 + 1
            byte r0 = r5[r6]
            int r0 = r0 << 14
            r1 = r1 ^ r0
            if (r1 < 0) goto L_0x0032
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r6 = r2
            goto L_0x0083
        L_0x0032:
            int r6 = r2 + 1
            byte r0 = r5[r2]
            int r0 = r0 << 21
            r1 = r1 ^ r0
            if (r1 >= 0) goto L_0x0040
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r1 = r1 ^ r0
            goto L_0x0022
        L_0x0040:
            long r3 = (long) r1
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 28
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x006f
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L_0x0098
        L_0x0054:
            int r1 = r6 + 1
            byte r0 = r5[r6]
            long r3 = X.BEA.A0F(r0, r3)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r6 = r1
            if (r0 >= 0) goto L_0x0082
            int r6 = r1 + 1
            byte r0 = r5[r1]
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0082
        L_0x006a:
            long r0 = r10.A0a()
            return r0
        L_0x006f:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 35
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0086
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0081:
            long r3 = r3 ^ r0
        L_0x0082:
            r0 = r3
        L_0x0083:
            r10.A03 = r6
            return r0
        L_0x0086:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 42
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x009b
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
        L_0x0098:
            long r0 = r0 ^ r3
            r6 = r9
            goto L_0x0083
        L_0x009b:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 49
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0054
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23585BmF.A0Z():long");
    }

    public long A0a() {
        long j = 0;
        int i = 0;
        do {
            if (this.A03 == this.A00) {
                A02(this, 1);
            }
            byte[] bArr = this.A07;
            int i2 = this.A03;
            this.A03 = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & Byte.MAX_VALUE)) << i;
            if ((b & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw BE6.A0c("CodedInputStream encountered a malformed varint.");
    }

    public void A0b(int i) {
        int i2 = this.A00;
        int i3 = this.A03;
        int i4 = i2 - i3;
        if (i <= i4) {
            if (i >= 0) {
                this.A03 = i3 + i;
                return;
            }
        } else if (i >= 0) {
            int i5 = this.A04;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.A01;
            if (i7 <= i8) {
                this.A04 = i6;
                this.A00 = 0;
                this.A03 = 0;
                while (i4 < i) {
                    int i9 = i - i4;
                    try {
                        InputStream inputStream = this.A06;
                        long j = (long) i9;
                        long skip = inputStream.skip(j);
                        if (skip >= 0 && skip <= j) {
                            if (skip == 0) {
                                break;
                            }
                            i4 += (int) skip;
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append(inputStream.getClass());
                            A10.append("#skip returned invalid result: ");
                            A10.append(skip);
                            throw AnonymousClass000.A0o("\nThe InputStream implementation is buggy.", A10);
                        }
                    } catch (AnonymousClass1PN e) {
                        e.wasThrownFromInputStream = true;
                        throw e;
                    } catch (Throwable th) {
                        this.A04 += i4;
                        A01(this);
                        throw th;
                    }
                }
                this.A04 += i4;
                A01(this);
                if (i4 < i) {
                    int i10 = this.A00;
                    int i11 = i10 - this.A03;
                    this.A03 = i10;
                    while (true) {
                        A02(this, 1);
                        int i12 = i - i11;
                        int i13 = this.A00;
                        if (i12 > i13) {
                            i11 += i13;
                            this.A03 = i13;
                        } else {
                            this.A03 = i12;
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                A0b((i8 - i5) - i3);
                throw BE7.A0M();
            }
        }
        throw BE7.A0N();
    }

    public static ArrayList A00(C23585BmF bmF, int i) {
        ArrayList A13 = AnonymousClass000.A13();
        while (i > 0) {
            byte[] bArr = new byte[Math.min(i, ZipDecompressor.UNZIP_BUFFER_SIZE)];
            int i2 = 0;
            while (i2 < bArr.length) {
                int read = bmF.A06.read(bArr, i2, bArr.length - i2);
                if (read != -1) {
                    bmF.A04 += read;
                    i2 += read;
                } else {
                    throw BE7.A0M();
                }
            }
            i -= bArr.length;
            A13.add(bArr);
        }
        return A13;
    }

    public static void A02(C23585BmF bmF, int i) {
        if (A03(bmF, i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - bmF.A04) - bmF.A03) {
            throw BE6.A0c("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw BE7.A0M();
    }

    public static byte[] A04(C23585BmF bmF, int i) {
        byte[] A052 = A05(bmF, i);
        if (A052 != null) {
            return A052;
        }
        int i2 = bmF.A03;
        int i3 = bmF.A00;
        int i4 = i3 - i2;
        bmF.A04 += i3;
        bmF.A03 = 0;
        bmF.A00 = 0;
        ArrayList A002 = A00(bmF, i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(bmF.A07, i2, bArr, 0, i4);
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }
}
