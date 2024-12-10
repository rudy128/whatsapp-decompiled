package X;

import com.google.protobuf.UnsafeUtil;
import java.nio.ByteBuffer;

/* renamed from: X.BmE  reason: case insensitive filesystem */
public final class C23584BmE extends C25857CnL {
    public int A00 = Integer.MAX_VALUE;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public int A05;
    public final long A06;
    public final ByteBuffer A07;

    public static void A00(C23584BmE bmE) {
        long j = bmE.A02 + ((long) bmE.A05);
        bmE.A02 = j;
        int i = (int) (j - bmE.A04);
        int i2 = bmE.A00;
        if (i > i2) {
            int i3 = i - i2;
            bmE.A05 = i3;
            bmE.A02 = j - ((long) i3);
            return;
        }
        bmE.A05 = 0;
    }

    public int A0W() {
        long j = this.A03;
        if (this.A02 - j >= 4) {
            this.A03 = 4 + j;
            C25856CnK cnK = UnsafeUtil.A02;
            return ((cnK.A01(j + 3) & 255) << 24) | (cnK.A01(j) & 255) | ((cnK.A01(1 + j) & 255) << 8) | ((cnK.A01(2 + j) & 255) << 16);
        }
        throw BE7.A0M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r6.A01(r3) < 0) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0X() {
        /*
            r11 = this;
            long r0 = r11.A03
            long r3 = r11.A02
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0065
            r9 = 1
            long r3 = r0 + r9
            X.CnK r6 = com.google.protobuf.UnsafeUtil.A02
            byte r5 = r6.A01(r0)
            if (r5 < 0) goto L_0x0017
            r11.A03 = r3
            return r5
        L_0x0017:
            long r1 = r11.A02
            long r1 = r1 - r3
            r7 = 9
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0065
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            int r0 = r0 << 7
            r5 = r5 ^ r0
            if (r5 >= 0) goto L_0x006b
            r5 = r5 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0079
        L_0x002e:
            long r3 = r1 + r9
            byte r1 = r6.A01(r1)
            int r0 = r1 << 28
            r5 = r5 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r5 = r5 ^ r0
            if (r1 >= 0) goto L_0x0078
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            if (r0 >= 0) goto L_0x0079
            long r3 = r1 + r9
            byte r0 = r6.A01(r1)
            if (r0 >= 0) goto L_0x0078
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            if (r0 >= 0) goto L_0x0079
            long r3 = r1 + r9
            byte r0 = r6.A01(r1)
            if (r0 >= 0) goto L_0x0078
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            if (r0 >= 0) goto L_0x0079
        L_0x0065:
            long r1 = r11.A0a()
            int r0 = (int) r1
            return r0
        L_0x006b:
            long r3 = r1 + r9
            byte r0 = r6.A01(r1)
            int r0 = r0 << 14
            r5 = r5 ^ r0
            if (r5 < 0) goto L_0x007c
            r5 = r5 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0078:
            r1 = r3
        L_0x0079:
            r11.A03 = r1
            return r5
        L_0x007c:
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            int r0 = r0 << 21
            r5 = r5 ^ r0
            if (r5 >= 0) goto L_0x002e
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r5 = r5 ^ r0
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23584BmE.A0X():int");
    }

    public long A0Y() {
        long j = this.A03;
        if (this.A02 - j >= 8) {
            this.A03 = 8 + j;
            C25856CnK cnK = UnsafeUtil.A02;
            return ((((long) cnK.A01(j + 7)) & 255) << 56) | (((long) cnK.A01(j)) & 255) | ((((long) cnK.A01(1 + j)) & 255) << 8) | ((((long) cnK.A01(2 + j)) & 255) << 16) | ((((long) cnK.A01(3 + j)) & 255) << 24) | ((((long) cnK.A01(4 + j)) & 255) << 32) | ((((long) cnK.A01(5 + j)) & 255) << 40) | ((((long) cnK.A01(6 + j)) & 255) << 48);
        }
        throw BE7.A0M();
    }

    public long A0Z() {
        long j;
        long A0F;
        long j2;
        long j3;
        byte b;
        long j4 = this.A03;
        if (this.A02 != j4) {
            long j5 = j4 + 1;
            C25856CnK cnK = UnsafeUtil.A02;
            byte A012 = cnK.A01(j4);
            if (A012 >= 0) {
                this.A03 = j5;
                return (long) A012;
            } else if (this.A02 - j5 >= 9) {
                long j6 = j5 + 1;
                byte A013 = A012 ^ (cnK.A01(j5) << 7);
                if (A013 < 0) {
                    b = A013 ^ Byte.MIN_VALUE;
                } else {
                    long j7 = j6 + 1;
                    byte A014 = A013 ^ (cnK.A01(j6) << 14);
                    if (A014 >= 0) {
                        A0F = (long) (A014 ^ 16256);
                    } else {
                        j6 = j7 + 1;
                        byte A015 = A014 ^ (cnK.A01(j7) << 21);
                        if (A015 < 0) {
                            b = A015 ^ -2080896;
                        } else {
                            j7 = j6 + 1;
                            long A016 = ((long) A015) ^ (((long) cnK.A01(j6)) << 28);
                            if (A016 >= 0) {
                                j3 = 266354560;
                            } else {
                                j = j7 + 1;
                                long A017 = A016 ^ (((long) cnK.A01(j7)) << 35);
                                if (A017 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = j + 1;
                                    A016 = A017 ^ (((long) cnK.A01(j)) << 42);
                                    if (A016 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j = j7 + 1;
                                        A017 = A016 ^ (((long) cnK.A01(j7)) << 49);
                                        if (A017 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = j + 1;
                                            A0F = BEA.A0F(cnK.A01(j), A017);
                                            if (A0F < 0) {
                                                long j8 = 1 + j7;
                                                if (((long) cnK.A01(j7)) >= 0) {
                                                    j = j8;
                                                    this.A03 = j;
                                                    return A0F;
                                                }
                                            }
                                        }
                                    }
                                }
                                A0F = A017 ^ j2;
                                this.A03 = j;
                                return A0F;
                            }
                            A0F = A016 ^ j3;
                        }
                    }
                    j = j7;
                    this.A03 = j;
                    return A0F;
                }
                A0F = (long) b;
                this.A03 = j;
                return A0F;
            }
        }
        return A0a();
    }

    public long A0a() {
        long j = 0;
        int i = 0;
        do {
            long j2 = this.A03;
            if (j2 != this.A02) {
                this.A03 = 1 + j2;
                byte A012 = UnsafeUtil.A02.A01(j2);
                j |= ((long) (A012 & Byte.MAX_VALUE)) << i;
                if ((A012 & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw BE7.A0M();
            }
        } while (i < 64);
        throw BE6.A0c("CodedInputStream encountered a malformed varint.");
    }

    public C23584BmE(ByteBuffer byteBuffer) {
        this.A07 = byteBuffer;
        long A072 = UnsafeUtil.A02.A07(byteBuffer, UnsafeUtil.A00);
        this.A06 = A072;
        this.A02 = ((long) byteBuffer.limit()) + A072;
        long position = A072 + ((long) byteBuffer.position());
        this.A03 = position;
        this.A04 = position;
    }
}
