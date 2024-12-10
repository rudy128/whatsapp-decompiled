package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* renamed from: X.1tn  reason: invalid class name and case insensitive filesystem */
public final class C39881tn implements Closeable, C39861tl, WritableByteChannel, Flushable, Cloneable, ByteChannel {
    public static final byte[] A02;
    public long A00;
    public C39911tq A01;

    public int A03(byte[] bArr, int i, int i2) {
        C39921tr.A00((long) bArr.length, (long) i, (long) i2);
        C39911tq r6 = this.A01;
        if (r6 == null) {
            return -1;
        }
        int i3 = r6.A00;
        int i4 = r6.A01;
        int min = Math.min(i2, i3 - i4);
        System.arraycopy(r6.A06, i4, bArr, i, min);
        int i5 = r6.A01 + min;
        r6.A01 = i5;
        this.A00 -= (long) min;
        if (i5 == r6.A00) {
            this.A01 = r6.A00();
            C39901tp.A01(r6);
        }
        return min;
    }

    public void A07(int i) {
        C39911tq A06 = A06(4);
        byte[] bArr = A06.A06;
        int i2 = A06.A00;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        A06.A00 = i5 + 1;
        this.A00 += 4;
    }

    public long Bd3(C40081u8 r3) {
        C18070vi.A0c(r3, 0);
        return A04(r3, 0);
    }

    public int CHC(C40131uD r4) {
        C18070vi.A0c(r4, 0);
        int A022 = A02(r4, false);
        if (A022 == -1) {
            return -1;
        }
        A08((long) r4.A01[A022].A01());
        return A022;
    }

    public void close() {
    }

    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    public int read(ByteBuffer byteBuffer) {
        C18070vi.A0c(byteBuffer, 0);
        C39911tq r6 = this.A01;
        if (r6 == null) {
            return -1;
        }
        int remaining = byteBuffer.remaining();
        int i = r6.A00;
        int i2 = r6.A01;
        int min = Math.min(remaining, i - i2);
        byteBuffer.put(r6.A06, i2, min);
        int i3 = r6.A01 + min;
        r6.A01 = i3;
        this.A00 -= (long) min;
        if (i3 == r6.A00) {
            this.A01 = r6.A00();
            C39901tp.A01(r6);
        }
        return min;
    }

    public int write(ByteBuffer byteBuffer) {
        C18070vi.A0c(byteBuffer, 0);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C39911tq A06 = A06(1);
            int i2 = A06.A00;
            int min = Math.min(i, 8192 - i2);
            byteBuffer.get(A06.A06, i2, min);
            i -= min;
            A06.A00 += min;
        }
        this.A00 += (long) remaining;
        return remaining;
    }

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C26571Sq.A05);
        C18070vi.A0T(bytes);
        A02 = bytes;
    }

    public byte A00() {
        long j = this.A00;
        if (j != 0) {
            C39911tq r7 = this.A01;
            if (r7 == null) {
                C18070vi.A0R();
                throw null;
            }
            int i = r7.A01;
            int i2 = r7.A00;
            int i3 = i + 1;
            byte b = r7.A06[i];
            this.A00 = j - 1;
            if (i3 == i2) {
                this.A01 = r7.A00();
                C39901tp.A01(r7);
                return b;
            }
            r7.A01 = i3;
            return b;
        }
        throw new EOFException();
    }

    public final byte A01(long j) {
        long j2;
        byte[] bArr;
        long j3;
        C39921tr.A00(this.A00, j, 1);
        C39911tq r7 = this.A01;
        if (r7 != null) {
            long j4 = this.A00;
            if (j4 - j >= j) {
                j2 = 0;
                while (true) {
                    int i = r7.A00;
                    int i2 = r7.A01;
                    long j5 = ((long) (i - i2)) + j2;
                    if (j5 <= j) {
                        r7 = r7.A02;
                        if (r7 == null) {
                            break;
                        }
                        j2 = j5;
                    } else {
                        bArr = r7.A06;
                        j3 = (long) i2;
                        break;
                    }
                }
            } else {
                while (j2 > j) {
                    r7 = r7.A03;
                    if (r7 != null) {
                        j4 = j2 - ((long) (r7.A00 - r7.A01));
                    }
                }
                bArr = r7.A06;
                j3 = (long) r7.A01;
            }
            return bArr[(int) ((j3 + j) - j2)];
        }
        C18070vi.A0R();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        r0 = r5[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007a, code lost:
        X.C18070vi.A0R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007d, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(X.C40131uD r16, boolean r17) {
        /*
            r15 = this;
            X.1tq r9 = r15.A01
            r14 = -2
            r8 = -1
            if (r9 == 0) goto L_0x0081
            byte[] r7 = r9.A06
            int r2 = r9.A01
            int r6 = r9.A00
            r0 = r16
            int[] r5 = r0.A00
            r4 = r9
            r1 = 0
            r13 = -1
        L_0x0013:
            int r0 = r1 + 1
            r11 = r5[r1]
            int r10 = r0 + 1
            r0 = r5[r0]
            if (r0 == r8) goto L_0x001e
            r13 = r0
        L_0x001e:
            if (r4 == 0) goto L_0x007e
            r12 = 0
            if (r11 >= 0) goto L_0x0033
            int r0 = -r11
            int r11 = r10 + r0
        L_0x0026:
            int r3 = r2 + 1
            byte r0 = r7[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10 + 1
            r0 = r5[r10]
            if (r2 == r0) goto L_0x0058
            return r13
        L_0x0033:
            int r3 = r2 + 1
            byte r0 = r7[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10 + r11
        L_0x003b:
            if (r10 != r1) goto L_0x003e
            return r13
        L_0x003e:
            r0 = r5[r10]
            if (r2 != r0) goto L_0x0055
            int r10 = r10 + r11
            r0 = r5[r10]
            if (r3 != r6) goto L_0x006f
            X.1tq r4 = r4.A02
            if (r4 == 0) goto L_0x007a
            int r3 = r4.A01
            byte[] r7 = r4.A06
            int r6 = r4.A00
            if (r4 != r9) goto L_0x006f
            r4 = r12
            goto L_0x006f
        L_0x0055:
            int r10 = r10 + 1
            goto L_0x003b
        L_0x0058:
            r0 = 0
            if (r1 != r11) goto L_0x005c
            r0 = 1
        L_0x005c:
            if (r3 != r6) goto L_0x0072
            X.1tq r4 = r4.A02
            if (r4 == 0) goto L_0x007a
            int r3 = r4.A01
            byte[] r7 = r4.A06
            int r6 = r4.A00
            if (r4 != r9) goto L_0x0072
            if (r0 == 0) goto L_0x007e
            r4 = r12
        L_0x006d:
            r0 = r5[r1]
        L_0x006f:
            if (r0 < 0) goto L_0x0077
            return r0
        L_0x0072:
            if (r0 != 0) goto L_0x006d
            r2 = r3
            r10 = r1
            goto L_0x0026
        L_0x0077:
            int r1 = -r0
            r2 = r3
            goto L_0x0013
        L_0x007a:
            X.C18070vi.A0R()
            throw r12
        L_0x007e:
            if (r17 != 0) goto L_0x0084
            return r13
        L_0x0081:
            if (r17 != 0) goto L_0x0084
            r14 = -1
        L_0x0084:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39881tn.A02(X.1uD, boolean):int");
    }

    public long A04(C40081u8 r15, long j) {
        long j2;
        int i;
        long j3 = j;
        long j4 = 0;
        if (j >= 0) {
            C39911tq r5 = this.A01;
            if (r5 != null) {
                long j5 = this.A00;
                if (j5 - j >= j) {
                    while (true) {
                        long j6 = ((long) (r5.A00 - r5.A01)) + j4;
                        if (j6 <= j) {
                            r5 = r5.A02;
                            if (r5 == null) {
                                break;
                            }
                            j4 = j6;
                        } else if (r15.A01() == 2) {
                            byte A002 = r15.A00(0);
                            byte A003 = r15.A00(1);
                            while (j2 < this.A00) {
                                byte[] bArr = r5.A06;
                                int i2 = (int) ((((long) r5.A01) + j3) - j2);
                                int i3 = r5.A00;
                                while (i < i3) {
                                    byte b = bArr[i];
                                    if (!(b == A002 || b == A003)) {
                                        i2 = i + 1;
                                    }
                                }
                                j4 = j2 + ((long) (r5.A00 - r5.A01));
                                r5 = r5.A02;
                                if (r5 != null) {
                                    j3 = j4;
                                }
                            }
                        } else {
                            C40081u8 r0 = C40091u9.A00;
                            byte[] bArr2 = r15.data;
                            while (j2 < this.A00) {
                                byte[] bArr3 = r5.A06;
                                int i4 = (int) ((((long) r5.A01) + j3) - j2);
                                int i5 = r5.A00;
                                while (i < i5) {
                                    byte b2 = bArr3[i];
                                    int length = bArr2.length;
                                    int i6 = 0;
                                    while (i6 < length) {
                                        if (b2 != bArr2[i6]) {
                                            i6++;
                                        }
                                    }
                                    i4 = i + 1;
                                }
                                j4 = j2 + ((long) (r5.A00 - r5.A01));
                                r5 = r5.A02;
                                if (r5 != null) {
                                    j3 = j4;
                                }
                            }
                        }
                    }
                } else {
                    j2 = j5;
                    while (true) {
                        if (j2 > j) {
                            r5 = r5.A03;
                            if (r5 == null) {
                                break;
                            }
                            j2 -= (long) (r5.A00 - r5.A01);
                        } else if (r15.A01() == 2) {
                            byte A004 = r15.A00(0);
                            byte A005 = r15.A00(1);
                            while (j2 < this.A00) {
                                byte[] bArr4 = r5.A06;
                                int i7 = r5.A01;
                                i = (int) ((((long) i7) + j3) - j2);
                                int i8 = r5.A00;
                                while (i < i8) {
                                    byte b3 = bArr4[i];
                                    if (!(b3 == A004 || b3 == A005)) {
                                        i++;
                                    }
                                }
                                j2 += (long) (i8 - i7);
                                r5 = r5.A02;
                                if (r5 != null) {
                                    j3 = j2;
                                }
                            }
                        } else {
                            C40081u8 r02 = C40091u9.A00;
                            byte[] bArr5 = r15.data;
                            while (j2 < this.A00) {
                                byte[] bArr6 = r5.A06;
                                int i9 = r5.A01;
                                int i10 = (int) ((((long) i9) + j3) - j2);
                                int i11 = r5.A00;
                                while (i < i11) {
                                    byte b4 = bArr6[i];
                                    int length2 = bArr5.length;
                                    int i12 = 0;
                                    while (i12 < length2) {
                                        if (b4 != bArr5[i12]) {
                                            i12++;
                                        }
                                    }
                                    i10 = i + 1;
                                }
                                j2 += (long) (i11 - i9);
                                r5 = r5.A02;
                                if (r5 != null) {
                                    j3 = j2;
                                }
                            }
                        }
                    }
                    C18070vi.A0R();
                    throw null;
                }
                return ((long) (i - r5.A01)) + j2;
            }
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex < 0: ");
        sb.append(j3);
        throw new IllegalArgumentException(sb.toString());
    }

    public String A05(Charset charset, long j) {
        if (j < 0 || j > 2147483647L) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.A00 < j) {
            throw new EOFException();
        } else if (j == 0) {
            return "";
        } else {
            C39911tq r4 = this.A01;
            if (r4 == null) {
                C18070vi.A0R();
                throw null;
            }
            int i = r4.A01;
            if (((long) i) + j > ((long) r4.A00)) {
                return new String(A0A(j), charset);
            }
            int i2 = (int) j;
            String str = new String(r4.A06, i, i2, charset);
            int i3 = r4.A01 + i2;
            r4.A01 = i3;
            this.A00 -= j;
            if (i3 == r4.A00) {
                this.A01 = r4.A00();
                C39901tp.A01(r4);
            }
            return str;
        }
    }

    public final C39911tq A06(int i) {
        C39911tq r0 = this.A01;
        if (r0 == null) {
            C39911tq A002 = C39901tp.A00();
            this.A01 = A002;
            A002.A03 = A002;
            A002.A02 = A002;
            return A002;
        }
        C39911tq r1 = r0.A03;
        if (r1 == null) {
            C18070vi.A0R();
            throw null;
        } else if (r1.A00 + i <= 8192 && r1.A04) {
            return r1;
        } else {
            C39911tq A003 = C39901tp.A00();
            r1.A02(A003);
            return A003;
        }
    }

    public void A08(long j) {
        while (j > 0) {
            C39911tq r6 = this.A01;
            if (r6 != null) {
                int i = r6.A00;
                int i2 = r6.A01;
                int min = (int) Math.min(j, (long) (i - i2));
                long j2 = (long) min;
                this.A00 -= j2;
                j -= j2;
                int i3 = i2 + min;
                r6.A01 = i3;
                if (i3 == i) {
                    this.A01 = r6.A00();
                    C39901tp.A01(r6);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public void A09(String str, int i, int i2) {
        long j;
        long j2;
        char c;
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= i) {
            int length = str.length();
            if (i2 > length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("endIndex > string.length: ");
                sb2.append(i2);
                sb2.append(" > ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString());
            }
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C39911tq A06 = A06(1);
                    byte[] bArr = A06.A06;
                    int i3 = A06.A00 - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = A06.A00;
                    int i6 = (i3 + i4) - i5;
                    A06.A00 = i5 + i6;
                    this.A00 += (long) i6;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        C39911tq A062 = A06(2);
                        byte[] bArr2 = A062.A06;
                        int i7 = A062.A00;
                        bArr2[i7] = (byte) ((charAt >> 6) | 192);
                        bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                        A062.A00 = i7 + 2;
                        j = this.A00;
                        j2 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        C39911tq A063 = A06(3);
                        byte[] bArr3 = A063.A06;
                        int i8 = A063.A00;
                        bArr3[i8] = (byte) ((charAt >> 12) | 224);
                        bArr3[i8 + 1] = (byte) (((charAt >> 6) & 63) | 128);
                        bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                        A063.A00 = i8 + 3;
                        j = this.A00;
                        j2 = 3;
                    } else {
                        if (i + 1 < i2) {
                            c = str.charAt(i + 1);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || 56320 > c || 57343 < c) {
                            C39911tq A064 = A06(1);
                            byte[] bArr4 = A064.A06;
                            int i9 = A064.A00;
                            A064.A00 = i9 + 1;
                            bArr4[i9] = 63;
                            j = this.A00;
                            j2 = 1;
                        } else {
                            int i10 = (((charAt & 1023) << 10) | (c & 1023)) + 0;
                            C39911tq A065 = A06(4);
                            byte[] bArr5 = A065.A06;
                            int i11 = A065.A00;
                            bArr5[i11] = (byte) ((i10 >> 18) | 240);
                            bArr5[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr5[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr5[i11 + 3] = (byte) ((i10 & 63) | 128);
                            A065.A00 = i11 + 4;
                            this.A00 += 4;
                            i += 2;
                        }
                    }
                    this.A00 = j + j2;
                    i++;
                }
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex < beginIndex: ");
            sb3.append(i2);
            sb3.append(" < ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public byte[] A0A(long j) {
        if (j < 0 || j > 2147483647L) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.A00 >= j) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int A03 = A03(bArr, i2, i - i2);
                if (A03 != -1) {
                    i2 += A03;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f5, code lost:
        throw new java.lang.IllegalArgumentException("byteCount out of range");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long CDN(X.C39881tn r18) {
        /*
            r17 = this;
            r15 = 8192(0x2000, double:4.0474E-320)
            r0 = 0
            r7 = r18
            X.C18070vi.A0c(r7, r0)
            r13 = 0
            r6 = r17
            long r11 = r6.A00
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            r0 = -1
            return r0
        L_0x0015:
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
            r15 = r11
        L_0x001a:
            r2 = r15
            if (r6 == r7) goto L_0x00fb
            X.C39921tr.A00(r11, r13, r15)
        L_0x0020:
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x005d
            X.1tq r8 = r6.A01
            if (r8 == 0) goto L_0x00f6
            int r9 = r8.A00
            int r0 = r8.A01
            int r9 = r9 - r0
            long r0 = (long) r9
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0082
            X.1tq r0 = r7.A01
            if (r0 == 0) goto L_0x0061
            X.1tq r10 = r0.A03
            if (r10 == 0) goto L_0x0061
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0061
            int r0 = r10.A00
            long r0 = (long) r0
            long r0 = r0 + r2
            boolean r4 = r10.A05
            if (r4 == 0) goto L_0x005e
            r4 = 0
        L_0x0047:
            long r4 = (long) r4
            long r0 = r0 - r4
            r11 = 8192(0x2000, double:4.0474E-320)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0061
            int r0 = (int) r2
            r8.A03(r10, r0)
            long r0 = r6.A00
            long r0 = r0 - r2
            r6.A00 = r0
            long r0 = r7.A00
            long r0 = r0 + r2
            r7.A00 = r0
        L_0x005d:
            return r15
        L_0x005e:
            int r4 = r10.A01
            goto L_0x0047
        L_0x0061:
            int r10 = (int) r2
            if (r10 <= 0) goto L_0x00ee
            if (r10 > r9) goto L_0x00ee
            r0 = 1024(0x400, float:1.435E-42)
            if (r10 < r0) goto L_0x00d4
            X.1tq r9 = r8.A01()
        L_0x006e:
            int r0 = r9.A01
            int r0 = r0 + r10
            r9.A00 = r0
            int r0 = r8.A01
            int r0 = r0 + r10
            r8.A01 = r0
            X.1tq r0 = r8.A03
            if (r0 == 0) goto L_0x00f6
            r0.A02(r9)
            r8 = r9
            r6.A01 = r9
        L_0x0082:
            int r1 = r8.A00
            int r0 = r8.A01
            int r1 = r1 - r0
            long r4 = (long) r1
            X.1tq r0 = r8.A00()
            r6.A01 = r0
            X.1tq r0 = r7.A01
            if (r0 != 0) goto L_0x00a5
            r7.A01 = r8
            r8.A03 = r8
            r8.A02 = r8
        L_0x0098:
            long r0 = r6.A00
            long r0 = r0 - r4
            r6.A00 = r0
            long r0 = r7.A00
            long r0 = r0 + r4
            r7.A00 = r0
            long r2 = r2 - r4
            goto L_0x0020
        L_0x00a5:
            X.1tq r0 = r0.A03
            if (r0 == 0) goto L_0x00f6
            r0.A02(r8)
            X.1tq r10 = r8.A03
            if (r10 == r8) goto L_0x00e6
            if (r10 == 0) goto L_0x00f6
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0098
            int r9 = r8.A00
            int r0 = r8.A01
            int r9 = r9 - r0
            int r0 = r10.A00
            int r1 = 8192 - r0
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x00d1
            r0 = 0
        L_0x00c4:
            int r1 = r1 + r0
            if (r9 > r1) goto L_0x0098
            r8.A03(r10, r9)
            r8.A00()
            X.C39901tp.A01(r8)
            goto L_0x0098
        L_0x00d1:
            int r0 = r10.A01
            goto L_0x00c4
        L_0x00d4:
            X.1tq r9 = X.C39901tp.A00()
            byte[] r5 = r8.A06
            int r4 = r8.A01
            byte[] r1 = r9.A06
            r0 = 0
            X.C18070vi.A0c(r5, r0)
            java.lang.System.arraycopy(r5, r4, r1, r0, r10)
            goto L_0x006e
        L_0x00e6:
            java.lang.String r0 = "cannot compact"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00ee:
            java.lang.String r0 = "byteCount out of range"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x00f6:
            X.C18070vi.A0R()
            r1 = 0
            throw r1
        L_0x00fb:
            java.lang.String r0 = "source == this"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39881tn.CDN(X.1tn):long");
    }

    public boolean CFQ(long j) {
        if (this.A00 >= j) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1tn, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object clone() {
        C39911tq r1;
        ? obj = new Object();
        if (this.A00 != 0) {
            C39911tq r0 = this.A01;
            if (r0 != null) {
                C39911tq A012 = r0.A01();
                obj.A01 = A012;
                A012.A03 = A012;
                A012.A02 = A012;
                C39911tq r2 = this.A01;
                if (r2 != null) {
                    while (true) {
                        r2 = r2.A02;
                        if (r2 == this.A01) {
                            obj.A00 = this.A00;
                            break;
                        }
                        C39911tq r02 = obj.A01;
                        if (r02 == null || (r1 = r02.A03) == null || r2 == null) {
                            break;
                        }
                        r1.A02(r2.A01());
                    }
                }
            }
            C18070vi.A0R();
            throw null;
        }
        return obj;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r18
            r16 = 1
            r3 = r17
            if (r3 == r6) goto L_0x0070
            boolean r0 = r6 instanceof X.C39881tn
            r15 = 0
            if (r0 == 0) goto L_0x006f
            long r4 = r3.A00
            X.1tn r6 = (X.C39881tn) r6
            long r1 = r6.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006f
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            X.1tq r9 = r3.A01
            if (r9 == 0) goto L_0x006a
            X.1tq r8 = r6.A01
            if (r8 == 0) goto L_0x006a
            int r1 = r9.A01
            int r10 = r8.A01
            r13 = 0
        L_0x002b:
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            int r2 = r9.A00
            int r2 = r2 - r1
            int r0 = r8.A00
            int r0 = r0 - r10
            int r0 = java.lang.Math.min(r2, r0)
            long r2 = (long) r0
            r11 = 0
        L_0x003c:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0054
            byte[] r0 = r9.A06
            int r7 = r1 + 1
            byte r1 = r0[r1]
            byte[] r0 = r8.A06
            int r6 = r10 + 1
            byte r0 = r0[r10]
            if (r1 != r0) goto L_0x006f
            r0 = 1
            long r11 = r11 + r0
            r1 = r7
            r10 = r6
            goto L_0x003c
        L_0x0054:
            int r0 = r9.A00
            if (r1 != r0) goto L_0x005e
            X.1tq r9 = r9.A02
            if (r9 == 0) goto L_0x006a
            int r1 = r9.A01
        L_0x005e:
            int r0 = r8.A00
            if (r10 != r0) goto L_0x0068
            X.1tq r8 = r8.A02
            if (r8 == 0) goto L_0x006a
            int r10 = r8.A01
        L_0x0068:
            long r13 = r13 + r2
            goto L_0x002b
        L_0x006a:
            X.C18070vi.A0R()
            r0 = 0
            throw r0
        L_0x006f:
            return r15
        L_0x0070:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39881tn.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C39911tq r5 = this.A01;
        C39911tq r4 = r5;
        if (r5 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = r5.A00;
            for (int i3 = r5.A01; i3 < i2; i3++) {
                i = (i * 31) + r5.A06[i3];
            }
            r5 = r5.A02;
            if (r5 == null) {
                C18070vi.A0R();
                throw null;
            }
        } while (r5 != r4);
        return i;
    }

    public String toString() {
        long j = this.A00;
        if (j <= 2147483647L) {
            int i = (int) j;
            Object obj = C40081u8.A02;
            if (i != 0) {
                C39921tr.A00(j, 0, (long) i);
                C39911tq r3 = this.A01;
                C39911tq r8 = r3;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 < i) {
                        if (r3 == null) {
                            break;
                        } else if (r3.A00 != r3.A01) {
                            i3 += r3.A00 - r3.A01;
                            i4++;
                            r3 = r3.A02;
                        } else {
                            throw new AssertionError("s.limit == s.pos");
                        }
                    } else {
                        byte[][] bArr = new byte[i4][];
                        int[] iArr = new int[(i4 * 2)];
                        int i5 = 0;
                        while (i2 < i) {
                            if (r8 != null) {
                                bArr[i5] = r8.A06;
                                int i6 = r8.A00;
                                int i7 = r8.A01;
                                i2 += i6 - i7;
                                iArr[i5] = Math.min(i2, i);
                                iArr[i4 + i5] = i7;
                                r8.A05 = true;
                                i5++;
                                r8 = r8.A02;
                            }
                        }
                        obj = new AnonymousClass3JZ(iArr, bArr);
                    }
                }
                C18070vi.A0R();
                throw null;
            }
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }
}
