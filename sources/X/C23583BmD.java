package X;

/* renamed from: X.BmD  reason: case insensitive filesystem */
public final class C23583BmD extends C25857CnL {
    public int A00 = Integer.MAX_VALUE;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final byte[] A06;

    public static void A00(C23583BmD bmD) {
        int i = bmD.A02 + bmD.A05;
        bmD.A02 = i;
        int i2 = i - bmD.A04;
        int i3 = bmD.A00;
        if (i2 > i3) {
            int i4 = i2 - i3;
            bmD.A05 = i4;
            bmD.A02 = i - i4;
            return;
        }
        bmD.A05 = 0;
    }

    public int A0W() {
        int i = this.A03;
        if (this.A02 - i >= 4) {
            byte[] bArr = this.A06;
            this.A03 = i + 4;
            return BEB.A08(bArr, i);
        }
        throw BE7.A0M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r4[r2] < 0) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0X() {
        /*
            r5 = this;
            int r0 = r5.A03
            int r1 = r5.A02
            if (r1 == r0) goto L_0x004d
            byte[] r4 = r5.A06
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
        throw new UnsupportedOperationException("Method not decompiled: X.C23583BmD.A0X():int");
    }

    public long A0Y() {
        int i = this.A03;
        if (this.A02 - i >= 8) {
            byte[] bArr = this.A06;
            this.A03 = i + 8;
            return C25857CnL.A06(bArr, i);
        }
        throw BE7.A0M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (((long) r5[r1]) < 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0Z() {
        /*
            r10 = this;
            int r0 = r10.A03
            int r3 = r10.A02
            if (r3 == r0) goto L_0x006a
            byte[] r5 = r10.A06
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
        throw new UnsupportedOperationException("Method not decompiled: X.C23583BmD.A0Z():long");
    }

    public long A0a() {
        long j = 0;
        int i = 0;
        do {
            int i2 = this.A03;
            if (i2 != this.A02) {
                byte[] bArr = this.A06;
                this.A03 = i2 + 1;
                byte b = bArr[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw BE7.A0M();
            }
        } while (i < 64);
        throw BE6.A0c("CodedInputStream encountered a malformed varint.");
    }

    public C23583BmD(byte[] bArr, int i, int i2) {
        this.A06 = bArr;
        this.A02 = i2 + i;
        this.A03 = i;
        this.A04 = i;
    }
}
