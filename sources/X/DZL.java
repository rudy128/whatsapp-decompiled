package X;

import java.lang.reflect.Array;

public class DZL implements E8N, EEP {
    public static final byte[] A0I = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    public int A00;
    public long A01;
    public E9Y A02;
    public byte[] A03 = new byte[32];
    public byte[] A04;
    public byte[] A05 = new byte[32];
    public byte[] A06 = new byte[32];
    public byte[] A07;
    public byte[] A08 = new byte[32];
    public byte[] A09;
    public byte[] A0A;
    public byte[] A0B;
    public byte[] A0C;
    public byte[] A0D;
    public short[] A0E;
    public short[] A0F;
    public byte[][] A0G;
    public byte[] A0H;

    private void A01(byte[] bArr) {
        byte[] bArr2;
        int i = 0;
        do {
            bArr2 = this.A0C;
            BE6.A1Q(bArr, bArr2, i + 8, bArr[i], i);
            i++;
        } while (i < 8);
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(bArr2, 0, bArr, 24, 8);
    }

    public void A03(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5 = this.A06;
        System.arraycopy(bArr, 0, bArr5, 0, 32);
        byte[] bArr6 = this.A03;
        byte[] bArr7 = this.A09;
        System.arraycopy(bArr6, 0, bArr7, 0, 32);
        System.arraycopy(bArr5, 0, this.A0A, 0, 32);
        int i = 0;
        do {
            bArr2 = this.A0B;
            BE6.A1O(bArr2, bArr7[i], this.A0A[i], i);
            i++;
        } while (i < 32);
        int i2 = 0;
        do {
            bArr3 = this.A04;
            int i3 = i2 * 4;
            BE6.A1P(bArr2, bArr3, i2, i3);
            BE6.A1P(bArr2, bArr3, i2 + 8, i3 + 1);
            BE6.A1P(bArr2, bArr3, i2 + 16, i3 + 2);
            BE6.A1P(bArr2, bArr3, i2 + 24, i3 + 3);
            i2++;
        } while (i2 < 8);
        byte[] bArr8 = this.A07;
        E9Y e9y = this.A02;
        e9y.BdC(new C27190DYo(bArr3), true);
        e9y.CCe(bArr6, bArr8, 0, 0);
        int i4 = 1;
        do {
            A01(bArr7);
            int i5 = 0;
            do {
                BE6.A1O(bArr7, bArr7[i5], this.A0G[i4][i5], i5);
                i5++;
            } while (i5 < 32);
            byte[] bArr9 = this.A0A;
            A01(bArr9);
            A01(bArr9);
            this.A0A = bArr9;
            int i6 = 0;
            do {
                BE6.A1O(bArr2, bArr7[i6], bArr9[i6], i6);
                i6++;
            } while (i6 < 32);
            int i7 = 0;
            do {
                bArr4 = this.A04;
                int i8 = i7 * 4;
                BE6.A1P(bArr2, bArr4, i7, i8);
                BE6.A1P(bArr2, bArr4, i7 + 8, i8 + 1);
                BE6.A1P(bArr2, bArr4, i7 + 16, i8 + 2);
                BE6.A1P(bArr2, bArr4, i7 + 24, i8 + 3);
                i7++;
            } while (i7 < 8);
            int i9 = i4 * 8;
            E9Y e9y2 = this.A02;
            e9y2.BdC(new C27190DYo(bArr4), true);
            e9y2.CCe(bArr6, bArr8, i9, i9);
            i4++;
        } while (i4 < 4);
        int i10 = 0;
        do {
            A02(bArr8);
            i10++;
        } while (i10 < 12);
        int i11 = 0;
        do {
            BE8.A1I(bArr8, bArr5, i11);
            i11++;
        } while (i11 < 32);
        A02(bArr8);
        int i12 = 0;
        do {
            BE6.A1O(bArr8, bArr6[i12], bArr8[i12], i12);
            i12++;
        } while (i12 < 32);
        int i13 = 0;
        do {
            A02(bArr8);
            i13++;
        } while (i13 < 61);
        System.arraycopy(bArr8, 0, bArr6, 0, 32);
    }

    public String BMl() {
        return "GOST3411";
    }

    public int BNv() {
        return 32;
    }

    public int BQf() {
        return 32;
    }

    public void reset() {
        byte[][] bArr;
        this.A01 = 0;
        this.A00 = 0;
        int i = 0;
        while (true) {
            byte[] bArr2 = this.A03;
            if (i >= 32) {
                break;
            }
            bArr2[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.A05;
            if (i2 >= 32) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr4 = this.A06;
            if (i3 >= 32) {
                break;
            }
            bArr4[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            bArr = this.A0G;
            byte[] bArr5 = bArr[1];
            if (i4 >= bArr5.length) {
                break;
            }
            bArr5[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr6 = bArr[3];
            if (i5 >= bArr6.length) {
                break;
            }
            bArr6[i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr7 = this.A08;
            if (i6 >= 32) {
                break;
            }
            bArr7[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr8 = this.A0D;
            if (i7 < 32) {
                bArr8[i7] = 0;
                i7++;
            } else {
                System.arraycopy(A0I, 0, bArr[2], 0, 32);
                return;
            }
        }
    }

    public static void A00(DZL dzl, int[] iArr) {
        dzl.A0G = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        dzl.A0D = new byte[32];
        dzl.A02 = new DYc();
        dzl.A04 = new byte[32];
        dzl.A0C = new byte[8];
        dzl.A0E = new short[16];
        dzl.A0F = new short[16];
        dzl.A07 = new byte[32];
        dzl.A09 = new byte[32];
        dzl.A0A = new byte[32];
        dzl.A0B = new byte[32];
    }

    private void A02(byte[] bArr) {
        short[] sArr = this.A0E;
        int i = 0;
        do {
            int i2 = i * 2;
            sArr[i] = (short) (((bArr[i2 + 1] << 8) & 65280) | (bArr[i2] & 255));
            i++;
        } while (i < 16);
        short[] sArr2 = this.A0F;
        sArr2[15] = (short) (((((sArr[0] ^ sArr[1]) ^ sArr[2]) ^ sArr[3]) ^ sArr[12]) ^ sArr[15]);
        System.arraycopy(sArr, 1, sArr2, 0, 15);
        int i3 = 0;
        do {
            int i4 = i3 * 2;
            short s = sArr2[i3];
            bArr[i4 + 1] = (byte) (s >> 8);
            i3 = BE6.A0A(s, bArr, i4, i3);
        } while (i3 < 16);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.E8N, X.DZL] */
    public E8N BFx() {
        ? obj = new Object();
        obj.A03 = new byte[32];
        obj.A05 = new byte[32];
        obj.A06 = new byte[32];
        obj.A08 = new byte[32];
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 4;
        A1W[1] = 32;
        A00(obj, A1W);
        obj.CFg(this);
        return obj;
    }

    public void BJ6(byte[] bArr, int i) {
        byte[] bArr2 = this.A05;
        C26210Cuo.A04(bArr2, 0, this.A01 * 8);
        while (this.A00 != 0) {
            CQK((byte) 0);
        }
        A03(bArr2);
        A03(this.A08);
        System.arraycopy(this.A03, 0, bArr, i, 32);
        reset();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DYg, X.E3O, java.lang.Object] */
    public void CFg(E8N e8n) {
        DZL dzl = (DZL) e8n;
        byte[] bArr = dzl.A0H;
        this.A0H = bArr;
        E9Y e9y = this.A02;
        ? obj = new Object();
        obj.A00 = bArr;
        e9y.BdC(obj, true);
        reset();
        System.arraycopy(dzl.A03, 0, this.A03, 0, 32);
        System.arraycopy(dzl.A05, 0, this.A05, 0, 32);
        System.arraycopy(dzl.A06, 0, this.A06, 0, 32);
        System.arraycopy(dzl.A08, 0, this.A08, 0, 32);
        byte[][] bArr2 = dzl.A0G;
        byte[] bArr3 = bArr2[1];
        byte[][] bArr4 = this.A0G;
        System.arraycopy(bArr3, 0, bArr4[1], 0, bArr3.length);
        byte[] bArr5 = bArr2[2];
        System.arraycopy(bArr5, 0, bArr4[2], 0, bArr5.length);
        byte[] bArr6 = bArr2[3];
        System.arraycopy(bArr6, 0, bArr4[3], 0, bArr6.length);
        System.arraycopy(dzl.A0D, 0, this.A0D, 0, 32);
        this.A00 = dzl.A00;
        this.A01 = dzl.A01;
    }

    public void CQK(byte b) {
        byte[] bArr = this.A0D;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        bArr[i] = b;
        if (i2 == 32) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte[] bArr2 = this.A08;
                if (i3 == 32) {
                    break;
                }
                int i5 = (bArr2[i3] & 255) + (bArr[i3] & 255) + i4;
                bArr2[i3] = (byte) i5;
                i4 = i5 >>> 8;
                i3++;
            }
            A03(bArr);
            this.A00 = 0;
        }
        this.A01++;
    }

    public void update(byte[] bArr, int i, int i2) {
        while (this.A00 != 0 && i2 > 0) {
            CQK(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.A0D;
            if (i2 <= 32) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, 32);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte[] bArr3 = this.A08;
                if (i3 == 32) {
                    break;
                }
                int i5 = (bArr3[i3] & 255) + (bArr2[i3] & 255) + i4;
                bArr3[i3] = (byte) i5;
                i4 = i5 >>> 8;
                i3++;
            }
            A03(bArr2);
            i += 32;
            i2 -= 32;
            this.A01 += 32;
        }
        while (i2 > 0) {
            CQK(bArr[i]);
            i++;
            i2--;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.DYg, X.E3O, java.lang.Object] */
    public DZL() {
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 4;
        A1W[1] = 32;
        A00(this, A1W);
        byte[] bArr = (byte[]) DYc.A03.get(AnonymousClass1Bo.A01("D-A"));
        if (bArr != null) {
            byte[] A022 = AnonymousClass1C2.A02(bArr);
            this.A0H = A022;
            E9Y e9y = this.A02;
            ? obj = new Object();
            obj.A00 = A022;
            e9y.BdC(obj, true);
            reset();
            return;
        }
        throw AnonymousClass000.A0k("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }
}
