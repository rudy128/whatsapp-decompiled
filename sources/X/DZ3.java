package X;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DZ3 implements EEQ {
    public int A00;
    public long A01;
    public long A02;
    public E9Y A03;
    public CW3 A04;
    public boolean A05;
    public byte[] A06;
    public byte[] A07;
    public byte[] A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public CMH A0D;
    public boolean A0E;
    public byte[] A0F;
    public byte[] A0G;
    public byte[] A0H;
    public byte[] A0I;
    public byte[] A0J;
    public byte[] A0K;
    public byte[] A0L;
    public byte[] A0M;
    public byte[] A0N;

    public static long A01(long j, long j2) {
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & -8608480567731124088L;
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & -8608480567731124088L;
        return (((((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8)) & 1229782938247303441L) | (((((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9)) & 2459565876494606882L) | (((((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10)) & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & -8608480567731124088L);
    }

    private void A02() {
        if (this.A01 > 0) {
            System.arraycopy(this.A07, 0, this.A0H, 0, 16);
            this.A0C = this.A01;
        }
        int i = this.A00;
        if (i > 0) {
            A07(this.A0H, this.A08, 0, i);
            this.A0C += (long) i;
        }
        if (this.A0C > 0) {
            System.arraycopy(this.A0H, 0, this.A06, 0, 16);
        }
    }

    public static void A06(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        do {
            BE6.A1Q(bArr2, bArr, i + i2, bArr[i2], i2);
            int i3 = i2 + 1;
            BE6.A1Q(bArr2, bArr, i + i3, bArr[i3], i3);
            int i4 = i3 + 1;
            BE6.A1Q(bArr2, bArr, i + i4, bArr[i4], i4);
            int i5 = i4 + 1;
            BE6.A1Q(bArr2, bArr, i + i5, bArr[i5], i5);
            i2 = i5 + 1;
        } while (i2 < 16);
    }

    private void A08(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (bArr2.length - i2 >= 16) {
            if (this.A02 == 0) {
                A02();
            }
            byte[] bArr3 = new byte[16];
            A05(bArr3);
            if (this.A05) {
                A06(bArr3, bArr, i);
                byte[] bArr4 = this.A06;
                C24646CDk.A00(bArr4, bArr3);
                this.A04.A00(bArr4);
                System.arraycopy(bArr3, 0, bArr2, i2, 16);
            } else {
                byte[] bArr5 = this.A06;
                A06(bArr5, bArr, i);
                this.A04.A00(bArr5);
                int i3 = 0;
                do {
                    BE6.A1Q(bArr, bArr2, i + i3, bArr3[i3], i2 + i3);
                    int i4 = i3 + 1;
                    BE6.A1Q(bArr, bArr2, i + i4, bArr3[i4], i2 + i4);
                    int i5 = i4 + 1;
                    BE6.A1Q(bArr, bArr2, i + i5, bArr3[i5], i2 + i5);
                    int i6 = i5 + 1;
                    BE6.A1Q(bArr, bArr2, i + i6, bArr3[i6], i2 + i6);
                    i3 = i6 + 1;
                } while (i3 < 16);
            }
            this.A02 += 16;
            return;
        }
        throw new C28380DyQ("Output buffer too short");
    }

    public static void A09(byte[] bArr, long[] jArr) {
        int i = 0;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            int i3 = i + 1;
            int A052 = BEB.A05(bArr[i] << 24, bArr, (bArr[i3] & 255) << 16, i3);
            int i4 = i + 4;
            int i5 = i4 + 1;
            jArr[i2] = (((long) BEB.A05(bArr[i4] << 24, bArr, (bArr[i5] & 255) << 16, i5)) & 4294967295L) | ((((long) A052) & 4294967295L) << 32);
            i += 8;
        }
    }

    public static void A0B(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long reverse = Long.reverse(j);
        long reverse2 = Long.reverse(j2);
        long reverse3 = Long.reverse(j3);
        long reverse4 = Long.reverse(j4);
        long reverse5 = Long.reverse(A01(reverse, reverse3));
        long A012 = A01(j, j3) << 1;
        long reverse6 = Long.reverse(A01(reverse2, reverse4));
        long A013 = A01(j2, j4) << 1;
        long reverse7 = (Long.reverse(A01(reverse ^ reverse2, reverse4 ^ reverse3)) ^ ((A012 ^ reverse5) ^ reverse6)) ^ (((A013 ^ (A013 >>> 1)) ^ (A013 >>> 2)) ^ (A013 >>> 7));
        long A014 = ((A01(j ^ j2, j3 ^ j4) << 1) ^ ((reverse6 ^ A012) ^ A013)) ^ ((A013 << 62) ^ (A013 << 57));
        long j5 = reverse5 ^ ((A014 >>> 7) ^ (((A014 >>> 1) ^ A014) ^ (A014 >>> 2)));
        jArr[0] = j5;
        jArr[1] = ((A014 << 57) ^ ((A014 << 63) ^ (A014 << 62))) ^ reverse7;
    }

    public byte[] BUI() {
        byte[] bArr = this.A0M;
        return bArr == null ? new byte[this.A0B] : AnonymousClass1C2.A02(bArr);
    }

    public int BVw(int i) {
        int i2 = i + this.A0A;
        boolean z = this.A05;
        int i3 = this.A0B;
        if (z) {
            return i2 + i3;
        }
        int i4 = i2;
        int i5 = i2 - i3;
        if (i4 < i3) {
            return 0;
        }
        return i5;
    }

    public E9Y Bax() {
        return this.A03;
    }

    public int Bb2(int i) {
        int i2 = i + this.A0A;
        if (!this.A05) {
            int i3 = this.A0B;
            int i4 = i2;
            i2 -= i3;
            if (i4 < i3) {
                return 0;
            }
        }
        return i2 - (i2 % 16);
    }

    public static long A00(int i, long j, long j2) {
        long j3 = j2 & ((j >>> i) ^ j);
        return j ^ (j3 ^ (j3 << i));
    }

    public static void A03(DZ3 dz3) {
        if (dz3.A0E) {
            return;
        }
        if (dz3.A05) {
            throw AnonymousClass000.A0n("GCM cipher cannot be reused for encryption");
        }
        throw AnonymousClass000.A0n("GCM cipher needs to be initialised");
    }

    public static void A04(DZ3 dz3, boolean z) {
        dz3.A03.reset();
        dz3.A06 = new byte[16];
        dz3.A07 = new byte[16];
        dz3.A0H = new byte[16];
        dz3.A08 = new byte[16];
        dz3.A00 = 0;
        dz3.A01 = 0;
        dz3.A0C = 0;
        dz3.A0J = AnonymousClass1C2.A02(dz3.A0G);
        dz3.A09 = -2;
        dz3.A0A = 0;
        dz3.A02 = 0;
        byte[] bArr = dz3.A0I;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z) {
            dz3.A0M = null;
        }
        if (dz3.A05) {
            dz3.A0E = false;
            return;
        }
        byte[] bArr2 = dz3.A0K;
        if (bArr2 != null) {
            dz3.CCd(bArr2, 0, bArr2.length);
        }
    }

    private void A05(byte[] bArr) {
        int i = this.A09;
        if (i != 0) {
            this.A09 = i - 1;
            byte[] bArr2 = this.A0J;
            int i2 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i2;
            int i3 = (i2 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i3;
            int i4 = (i3 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i4;
            bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
            this.A03.CCe(bArr2, bArr, 0, 0);
            return;
        }
        throw AnonymousClass000.A0n("Attempt to process too many blocks");
    }

    private void A07(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= 0) {
                BE6.A1Q(bArr2, bArr, i + i2, bArr[i2], i2);
            } else {
                this.A04.A00(bArr);
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r12v7, types: [X.CMH, java.lang.Object] */
    public int BJ4(byte[] bArr, int i) {
        long[] jArr;
        int i2 = i;
        A03(this);
        if (this.A02 == 0) {
            A02();
        }
        int i3 = this.A0A;
        byte[] bArr2 = bArr;
        if (!this.A05) {
            int i4 = this.A0B;
            if (i3 >= i4) {
                i3 -= i4;
                if (bArr2.length - i < i3) {
                    throw new C28380DyQ("Output buffer too short");
                }
            } else {
                throw new C28379DyP("data too short");
            }
        } else if (bArr2.length - i < this.A0B + i3) {
            throw new C28380DyQ("Output buffer too short");
        }
        if (i3 > 0) {
            byte[] bArr3 = this.A0I;
            byte[] bArr4 = new byte[16];
            A05(bArr4);
            if (!this.A05) {
                A07(this.A06, bArr3, 0, i3);
                int i5 = i3;
                while (true) {
                    i5--;
                    if (i5 < 0) {
                        break;
                    }
                    BE8.A1I(bArr3, bArr4, i5);
                }
            } else {
                int i6 = i3;
                while (true) {
                    i6--;
                    if (i6 < 0) {
                        break;
                    }
                    BE8.A1I(bArr3, bArr4, i6);
                }
                A07(this.A06, bArr3, 0, i3);
            }
            System.arraycopy(bArr3, 0, bArr2, i2, i3);
            this.A02 += (long) i3;
        }
        long j = this.A01;
        int i7 = this.A00;
        long j2 = j + ((long) i7);
        this.A01 = j2;
        long j3 = this.A0C;
        if (j2 > j3) {
            if (i7 > 0) {
                A07(this.A07, this.A08, 0, i7);
            }
            if (j3 > 0) {
                C24646CDk.A00(this.A07, this.A0H);
            }
            long j4 = ((this.A02 * 8) + 127) >>> 7;
            byte[] bArr5 = new byte[16];
            CMH cmh = this.A0D;
            CMH cmh2 = cmh;
            if (cmh == null) {
                ? obj = new Object();
                this.A0D = obj;
                long[] jArr2 = new long[2];
                A09(this.A0F, jArr2);
                obj.A00 = jArr2;
                cmh2 = obj;
            }
            long[] jArr3 = new long[2];
            jArr3[0] = Long.MIN_VALUE;
            if (j4 <= 0) {
                int i8 = 0;
                int i9 = 0;
            } else {
                long[] jArr4 = cmh2.A00;
                if (jArr4 == null) {
                    jArr = null;
                } else {
                    jArr = (long[]) jArr4.clone();
                }
                do {
                    if ((1 & j4) != 0) {
                        A0B(jArr3, jArr);
                    }
                    long[] jArr5 = new long[4];
                    A0A(jArr5, 0, jArr[0]);
                    A0A(jArr5, 2, jArr[1]);
                    long j5 = jArr5[0];
                    long j6 = jArr5[1];
                    long j7 = jArr5[2];
                    long j8 = jArr5[3];
                    long j9 = j7 ^ ((j8 << 57) ^ ((j8 << 63) ^ (j8 << 62)));
                    jArr[0] = j5 ^ ((((j9 >>> 1) ^ j9) ^ (j9 >>> 2)) ^ (j9 >>> 7));
                    jArr[1] = (j6 ^ ((((j8 >>> 1) ^ j8) ^ (j8 >>> 2)) ^ (j8 >>> 7))) ^ ((j9 << 57) ^ ((j9 << 63) ^ (j9 << 62)));
                    j4 >>>= 1;
                } while (j4 > 0);
            }
            int i82 = 0;
            int i92 = 0;
            do {
                C26210Cuo.A03(bArr5, i82, jArr3[i92]);
                i82 += 8;
                i92++;
            } while (i92 < 2);
            byte[] bArr6 = this.A07;
            long[] jArr6 = new long[2];
            A09(bArr6, jArr6);
            long[] jArr7 = new long[2];
            A09(bArr5, jArr7);
            A0B(jArr6, jArr7);
            int i10 = 0;
            int i11 = 0;
            do {
                C26210Cuo.A03(bArr6, i10, jArr6[i11]);
                i10 += 8;
                i11++;
            } while (i11 < 2);
            C24646CDk.A00(this.A06, this.A07);
        }
        byte[] bArr7 = new byte[16];
        C26210Cuo.A03(bArr7, 0, this.A01 * 8);
        C26210Cuo.A03(bArr7, 8, this.A02 * 8);
        byte[] bArr8 = this.A06;
        C24646CDk.A00(bArr8, bArr7);
        this.A04.A00(bArr8);
        byte[] bArr9 = new byte[16];
        this.A03.CCe(this.A0G, bArr9, 0, 0);
        C24646CDk.A00(bArr9, this.A06);
        int i12 = this.A0B;
        byte[] bArr10 = new byte[i12];
        this.A0M = bArr10;
        System.arraycopy(bArr9, 0, bArr10, 0, i12);
        if (this.A05) {
            System.arraycopy(this.A0M, 0, bArr2, i + this.A0A, this.A0B);
            i3 += this.A0B;
        } else {
            int i13 = this.A0B;
            byte[] bArr11 = new byte[i13];
            System.arraycopy(this.A0I, i3, bArr11, 0, i13);
            if (!AnonymousClass1C2.A01(this.A0M, bArr11)) {
                throw new C28379DyP("mac check in GCM failed");
            }
        }
        A04(this, false);
        return i3;
    }

    public void BdC(E3O e3o, boolean z) {
        byte[] bArr;
        int i;
        C27190DYo dYo;
        byte[] bArr2;
        E3O e3o2 = e3o;
        this.A05 = z;
        this.A0M = null;
        this.A0E = true;
        if (e3o2 instanceof DYn) {
            DYn dYn = (DYn) e3o2;
            bArr = AnonymousClass1C2.A02(dYn.A03);
            this.A0K = AnonymousClass1C2.A02(dYn.A02);
            int i2 = dYn.A00;
            if (i2 < 32 || i2 > 128 || i2 % 8 != 0) {
                throw AnonymousClass001.A13("Invalid value for MAC size: ", AnonymousClass000.A10(), i2);
            }
            i = i2 / 8;
            this.A0B = i;
            dYo = dYn.A01;
        } else if (e3o2 instanceof DYm) {
            DYm dYm = (DYm) e3o2;
            bArr = dYm.A01;
            this.A0K = null;
            this.A0B = 16;
            i = 16;
            dYo = (C27190DYo) dYm.A00;
        } else {
            throw AnonymousClass000.A0k("invalid parameters passed to GCM");
        }
        int i3 = i + 16;
        if (z) {
            i3 = 16;
        }
        this.A0I = new byte[i3];
        if (bArr == null || bArr.length < 1) {
            throw AnonymousClass000.A0k("IV must be at least 1 byte");
        }
        if (z && (bArr2 = this.A0N) != null && Arrays.equals(bArr2, bArr)) {
            if (dYo != null) {
                byte[] bArr3 = this.A0L;
                if (bArr3 != null && Arrays.equals(bArr3, dYo.A00)) {
                    throw AnonymousClass000.A0k("cannot reuse nonce for GCM encryption");
                }
            } else {
                throw AnonymousClass000.A0k("cannot reuse nonce for GCM encryption");
            }
        }
        this.A0N = bArr;
        if (dYo != null) {
            this.A0L = dYo.A00;
        }
        if (dYo != null) {
            E9Y e9y = this.A03;
            e9y.BdC(dYo, true);
            byte[] bArr4 = new byte[16];
            this.A0F = bArr4;
            e9y.CCe(bArr4, bArr4, 0, 0);
            CW3 cw3 = this.A04;
            byte[] bArr5 = this.A0F;
            int i4 = 2;
            if (cw3.A01 == null) {
                cw3.A01 = (long[][]) Array.newInstance(Long.TYPE, new int[]{256, 2});
            } else if (Arrays.equals(cw3.A00, bArr5)) {
                this.A0D = null;
            }
            byte[] A022 = AnonymousClass1C2.A02(bArr5);
            cw3.A00 = A022;
            long[][] jArr = cw3.A01;
            long[] jArr2 = jArr[1];
            A09(A022, jArr2);
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = j2 << 57;
            jArr2[0] = (j3 >>> 7) ^ ((((j >>> 7) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2));
            jArr2[1] = (j << 57) | (j2 >>> 7);
            do {
                long[] jArr3 = jArr[i4 >> 1];
                long[] jArr4 = jArr[i4];
                long j4 = jArr3[0];
                long j5 = jArr3[1];
                long j6 = j4 >> 63;
                jArr4[0] = ((j4 ^ (-2233785415175766016L & j6)) << 1) | (j5 >>> 63);
                jArr4[1] = (j5 << 1) | (-j6);
                long[] jArr5 = jArr[i4 + 1];
                jArr5[0] = jArr4[0] ^ jArr2[0];
                jArr5[1] = jArr2[1] ^ jArr4[1];
                i4 += 2;
            } while (i4 < 256);
            this.A0D = null;
        } else if (this.A0F == null) {
            throw AnonymousClass000.A0k("Key must be specified in initial init");
        }
        byte[] bArr6 = new byte[16];
        this.A0G = bArr6;
        byte[] bArr7 = this.A0N;
        int length = bArr7.length;
        if (length == 12) {
            System.arraycopy(bArr7, 0, bArr6, 0, length);
            bArr6 = this.A0G;
            bArr6[15] = 1;
        } else {
            for (int i5 = 0; i5 < length; i5 += 16) {
                A07(bArr6, bArr7, i5, Math.min(length - i5, 16));
            }
            byte[] bArr8 = new byte[16];
            C26210Cuo.A03(bArr8, 8, ((long) length) * 8);
            C24646CDk.A00(bArr6, bArr8);
            this.A04.A00(bArr6);
        }
        this.A06 = new byte[16];
        this.A07 = new byte[16];
        this.A0H = new byte[16];
        this.A08 = new byte[16];
        this.A00 = 0;
        this.A01 = 0;
        this.A0C = 0;
        this.A0J = AnonymousClass1C2.A02(bArr6);
        this.A09 = -2;
        this.A0A = 0;
        this.A02 = 0;
        byte[] bArr9 = this.A0K;
        if (bArr9 != null) {
            CCd(bArr9, 0, bArr9.length);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.CW3, java.lang.Object] */
    public DZ3(E9Y e9y) {
        if (e9y.BNR() == 16) {
            ? obj = new Object();
            this.A03 = e9y;
            this.A04 = obj;
            return;
        }
        throw AnonymousClass000.A0k("cipher required with a block size of 16.");
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A03);
        return AnonymousClass000.A0y("/GCM", A10);
    }

    public void CCd(byte[] bArr, int i, int i2) {
        A03(this);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.A08;
            int i4 = this.A00;
            BE6.A1P(bArr, bArr2, i + i3, i4);
            int i5 = i4 + 1;
            this.A00 = i5;
            if (i5 == 16) {
                byte[] bArr3 = this.A07;
                C24646CDk.A00(bArr3, bArr2);
                this.A04.A00(bArr3);
                this.A00 = 0;
                this.A01 += 16;
            }
        }
    }

    public int CCg(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        A03(this);
        if (bArr.length - i >= i2) {
            if (this.A05) {
                int i5 = this.A0A;
                if (i5 != 0) {
                    while (true) {
                        if (i2 <= 0) {
                            break;
                        }
                        i2--;
                        byte[] bArr3 = this.A0I;
                        int i6 = i + 1;
                        BE6.A1P(bArr, bArr3, i, i5);
                        i5++;
                        this.A0A = i5;
                        if (i5 == 16) {
                            A08(bArr3, bArr2, 0, i3);
                            this.A0A = 0;
                            i4 = 16;
                            i = i6;
                            break;
                        }
                        i = i6;
                    }
                }
                i4 = 0;
                while (i2 >= 16) {
                    A08(bArr, bArr2, i, i3 + i4);
                    i += 16;
                    i2 -= 16;
                    i4 += 16;
                }
                if (i2 > 0) {
                    System.arraycopy(bArr, i, this.A0I, 0, i2);
                    this.A0A = i2;
                }
            } else {
                i4 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    byte[] bArr4 = this.A0I;
                    int i8 = this.A0A;
                    BE6.A1P(bArr, bArr4, i + i7, i8);
                    int i9 = i8 + 1;
                    this.A0A = i9;
                    if (i9 == bArr4.length) {
                        A08(bArr4, bArr2, 0, i3 + i4);
                        byte[] bArr5 = this.A0I;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.A0B);
                        this.A0A = this.A0B;
                        i4 += 16;
                    }
                }
            }
            return i4;
        }
        throw new C28387DyX("Input buffer too short");
    }

    public static void A0A(long[] jArr, int i, long j) {
        long A002 = A00(1, A00(2, A00(4, A00(8, A00(16, j, 4294901760L), 280375465148160L), 67555025218437360L), 868082074056920076L), 2459565876494606882L);
        jArr[i] = A002 & -6148914691236517206L;
        jArr[i + 1] = (A002 << 1) & -6148914691236517206L;
    }
}
