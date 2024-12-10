package X;

public class DZK implements E8N, EEP {
    public static final byte[] A06 = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, Byte.MIN_VALUE, Byte.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};
    public byte[] A00 = new byte[16];
    public byte[] A01 = new byte[16];
    public byte[] A02 = new byte[48];
    public int A03;
    public int A04;
    public int A05;

    public DZK() {
        reset();
    }

    private void A00(DZK dzk) {
        System.arraycopy(dzk.A02, 0, this.A02, 0, 48);
        this.A05 = dzk.A05;
        System.arraycopy(dzk.A01, 0, this.A01, 0, 16);
        this.A04 = dzk.A04;
        System.arraycopy(dzk.A00, 0, this.A00, 0, 16);
        this.A03 = dzk.A03;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(byte[] r7) {
        /*
            r6 = this;
            r3 = 0
        L_0x0001:
            byte[] r5 = r6.A02
            int r0 = r3 + 16
            X.BE6.A1P(r7, r5, r3, r0)
            int r2 = r3 + 32
            byte r1 = r7[r3]
            byte r0 = r5[r3]
            X.BE6.A1O(r5, r1, r0, r2)
            int r3 = r3 + 1
            r0 = 16
            if (r3 < r0) goto L_0x0001
            r4 = 0
            r3 = 0
        L_0x0019:
            r2 = 0
        L_0x001a:
            byte r1 = r5[r2]
            byte[] r0 = A06
            byte r0 = r0[r3]
            r0 = r0 ^ r1
            byte r0 = (byte) r0
            r5[r2] = r0
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            r0 = 48
            if (r2 < r0) goto L_0x001a
            int r3 = r3 + r4
            int r3 = r3 % 256
            int r4 = r4 + 1
            r0 = 18
            if (r4 < r0) goto L_0x0019
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DZK.A01(byte[]):void");
    }

    public void A02(byte[] bArr) {
        byte[] bArr2 = this.A00;
        byte b = bArr2[15];
        int i = 0;
        do {
            b = (byte) (A06[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            bArr2[i] = b;
            i++;
        } while (i < 16);
    }

    public void BJ6(byte[] bArr, int i) {
        byte[] bArr2 = this.A01;
        int i2 = this.A04;
        byte b = (byte) (16 - i2);
        while (i2 < 16) {
            bArr2[i2] = b;
            i2++;
        }
        A02(bArr2);
        A01(bArr2);
        A01(this.A00);
        System.arraycopy(this.A02, this.A05, bArr, i, 16);
        reset();
    }

    public String BMl() {
        return "MD2";
    }

    public int BNv() {
        return 16;
    }

    public int BQf() {
        return 16;
    }

    public void CFg(E8N e8n) {
        A00((DZK) e8n);
    }

    public void CQK(byte b) {
        byte[] bArr = this.A01;
        int i = this.A04;
        int i2 = i + 1;
        this.A04 = i2;
        bArr[i] = b;
        if (i2 == 16) {
            A02(bArr);
            A01(bArr);
            this.A04 = 0;
        }
    }

    public void reset() {
        this.A05 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.A02;
            if (i == 48) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.A04 = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.A01;
            if (i2 == 16) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        this.A03 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.A00;
            if (i3 != 16) {
                bArr3[i3] = 0;
                i3++;
            } else {
                return;
            }
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        while (this.A04 != 0) {
            if (i2 > 0) {
                CQK(bArr[i]);
                i++;
                i2--;
            } else {
                return;
            }
        }
        while (i2 > 16) {
            byte[] bArr2 = this.A01;
            System.arraycopy(bArr, i, bArr2, 0, 16);
            A02(bArr2);
            A01(bArr2);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            CQK(bArr[i]);
            i++;
            i2--;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.DZK, java.lang.Object, X.E8N] */
    public E8N BFx() {
        ? obj = new Object();
        obj.A02 = new byte[48];
        obj.A01 = new byte[16];
        obj.A00 = new byte[16];
        obj.A00(this);
        return obj;
    }
}
