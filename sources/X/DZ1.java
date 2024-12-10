package X;

import java.util.Arrays;
import java.util.Vector;

public class DZ1 implements EEQ {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Vector A05;
    public E9Y A06;
    public E9Y A07;
    public boolean A08;
    public byte[] A09;
    public byte[] A0A;
    public byte[] A0B;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E;
    public byte[] A0F;
    public byte[] A0G;
    public byte[] A0H;
    public byte[] A0I;
    public byte[] A0J;
    public byte[] A0K;
    public byte[] A0L;

    public byte[] BUI() {
        byte[] bArr = this.A0L;
        return bArr == null ? new byte[this.A01] : AnonymousClass1C2.A02(bArr);
    }

    public int BVw(int i) {
        int i2 = i + this.A02;
        boolean z = this.A08;
        int i3 = this.A01;
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
        return this.A07;
    }

    public int Bb2(int i) {
        int i2 = i + this.A02;
        if (!this.A08) {
            int i3 = this.A01;
            int i4 = i2;
            i2 -= i3;
            if (i4 < i3) {
                return 0;
            }
        }
        return i2 - (i2 % 16);
    }

    public void CCd(byte[] bArr, int i, int i2) {
        Vector vector;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.A0G;
            int i4 = this.A00;
            BE6.A1P(bArr, bArr2, i + i3, i4);
            int i5 = i4 + 1;
            this.A00 = i5;
            if (i5 == bArr2.length) {
                long j = this.A03 + 1;
                this.A03 = j;
                int i6 = 0;
                if (j == 0) {
                    i6 = 64;
                } else {
                    while ((1 & j) == 0) {
                        i6++;
                        j >>>= 1;
                    }
                }
                while (true) {
                    int size = this.A05.size();
                    vector = this.A05;
                    if (i6 < size) {
                        break;
                    }
                    vector.addElement(A01((byte[]) vector.lastElement()));
                }
                byte[] bArr3 = this.A0B;
                A00(bArr3, (byte[]) vector.elementAt(i6));
                byte[] bArr4 = this.A0G;
                A00(bArr4, bArr3);
                this.A06.CCe(bArr4, bArr4, 0, 0);
                A00(this.A0F, this.A0G);
                this.A00 = 0;
            }
        }
    }

    public static void A00(byte[] bArr, byte[] bArr2) {
        int i = 15;
        do {
            BE8.A1I(bArr, bArr2, i);
            i--;
        } while (i >= 0);
    }

    public static byte[] A01(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 16;
        int i2 = 0;
        while (true) {
            i--;
            if (i >= 0) {
                byte b = bArr[i] & 255;
                BE6.A1N(bArr2, i2, b << 1, i);
                i2 = (b >>> 7) & 1;
            } else {
                BE6.A1O(bArr2, 135 >>> ((1 - i2) << 3), bArr2[15], 15);
                return bArr2;
            }
        }
    }

    public int BJ4(byte[] bArr, int i) {
        byte[] bArr2;
        if (!this.A08) {
            int i2 = this.A02;
            int i3 = this.A01;
            if (i2 >= i3) {
                int i4 = i2 - i3;
                this.A02 = i4;
                bArr2 = new byte[i3];
                System.arraycopy(this.A0I, i4, bArr2, 0, i3);
            } else {
                throw new C28379DyP("data too short");
            }
        } else {
            bArr2 = null;
        }
        int i5 = this.A00;
        if (i5 > 0) {
            byte[] bArr3 = this.A0G;
            byte b = Byte.MIN_VALUE;
            while (true) {
                bArr3[i5] = b;
                i5++;
                if (i5 >= 16) {
                    break;
                }
                b = 0;
            }
            byte[] bArr4 = this.A0J;
            byte[] bArr5 = this.A0B;
            A00(bArr5, bArr4);
            A00(bArr3, bArr5);
            this.A06.CCe(bArr3, bArr3, 0, 0);
            A00(this.A0F, this.A0G);
        }
        int i6 = this.A02;
        if (i6 > 0) {
            if (this.A08) {
                byte[] bArr6 = this.A0I;
                byte b2 = Byte.MIN_VALUE;
                while (true) {
                    bArr6[i6] = b2;
                    i6++;
                    if (i6 >= 16) {
                        break;
                    }
                    b2 = 0;
                }
                A00(this.A09, bArr6);
            }
            byte[] bArr7 = this.A0C;
            A00(bArr7, this.A0J);
            byte[] bArr8 = new byte[16];
            this.A06.CCe(bArr7, bArr8, 0, 0);
            byte[] bArr9 = this.A0I;
            A00(bArr9, bArr8);
            int length = bArr.length;
            int i7 = this.A02;
            if (length >= i + i7) {
                System.arraycopy(bArr9, 0, bArr, i, i7);
                if (!this.A08) {
                    byte[] bArr10 = this.A0I;
                    int i8 = this.A02;
                    byte b3 = Byte.MIN_VALUE;
                    while (true) {
                        bArr10[i8] = b3;
                        i8++;
                        if (i8 >= 16) {
                            break;
                        }
                        b3 = 0;
                    }
                    A00(this.A09, bArr10);
                }
            } else {
                throw new C28380DyQ("Output buffer too short");
            }
        }
        byte[] bArr11 = this.A09;
        A00(bArr11, this.A0C);
        A00(bArr11, this.A0K);
        this.A06.CCe(bArr11, bArr11, 0, 0);
        byte[] bArr12 = this.A09;
        A00(bArr12, this.A0F);
        int i9 = this.A01;
        byte[] bArr13 = new byte[i9];
        this.A0L = bArr13;
        System.arraycopy(bArr12, 0, bArr13, 0, i9);
        int i10 = this.A02;
        if (this.A08) {
            int length2 = bArr.length;
            int i11 = i + i10;
            int i12 = this.A01;
            if (length2 >= i11 + i12) {
                System.arraycopy(this.A0L, 0, bArr, i11, i12);
                i10 += this.A01;
            } else {
                throw new C28380DyQ("Output buffer too short");
            }
        } else if (!AnonymousClass1C2.A01(this.A0L, bArr2)) {
            throw new C28379DyP("mac check in OCB failed");
        }
        this.A06.reset();
        this.A07.reset();
        byte[] bArr14 = this.A0G;
        if (bArr14 != null) {
            Arrays.fill(bArr14, (byte) 0);
        }
        byte[] bArr15 = this.A0I;
        if (bArr15 != null) {
            Arrays.fill(bArr15, (byte) 0);
        }
        this.A00 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        byte[] bArr16 = this.A0B;
        if (bArr16 != null) {
            Arrays.fill(bArr16, (byte) 0);
        }
        byte[] bArr17 = this.A0F;
        if (bArr17 != null) {
            Arrays.fill(bArr17, (byte) 0);
        }
        System.arraycopy(this.A0D, 0, this.A0C, 0, 16);
        byte[] bArr18 = this.A09;
        if (bArr18 != null) {
            Arrays.fill(bArr18, (byte) 0);
        }
        byte[] bArr19 = this.A0H;
        if (bArr19 != null) {
            CCd(bArr19, 0, bArr19.length);
        }
        return i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdC(X.E3O r10, boolean r11) {
        /*
            r9 = this;
            boolean r8 = r9.A08
            r9.A08 = r11
            r6 = 0
            r9.A0L = r6
            boolean r0 = r10 instanceof X.DYn
            r5 = 16
            if (r0 == 0) goto L_0x00cb
            X.DYn r10 = (X.DYn) r10
            byte[] r0 = r10.A03
            byte[] r3 = X.AnonymousClass1C2.A02(r0)
            byte[] r0 = r10.A02
            byte[] r0 = X.AnonymousClass1C2.A02(r0)
            r9.A0H = r0
            int r2 = r10.A00
            r0 = 64
            if (r2 < r0) goto L_0x0130
            r0 = 128(0x80, float:1.794E-43)
            if (r2 > r0) goto L_0x0130
            int r0 = r2 % 8
            if (r0 != 0) goto L_0x0130
            int r1 = r2 / 8
            r9.A01 = r1
            X.DYo r7 = r10.A01
        L_0x0031:
            byte[] r0 = new byte[r5]
            r9.A0G = r0
            int r0 = r1 + 16
            if (r11 == 0) goto L_0x003b
            r0 = 16
        L_0x003b:
            byte[] r0 = new byte[r0]
            r9.A0I = r0
            r4 = 0
            if (r3 != 0) goto L_0x0044
            byte[] r3 = new byte[r4]
        L_0x0044:
            int r2 = r3.length
            r0 = 15
            if (r2 > r0) goto L_0x0129
            r1 = 1
            if (r7 == 0) goto L_0x00c2
            X.E9Y r0 = r9.A06
            r0.BdC(r7, r1)
            X.E9Y r0 = r9.A07
            r0.BdC(r7, r11)
            r9.A0A = r6
        L_0x0058:
            byte[] r1 = new byte[r5]
            r9.A0J = r1
            X.E9Y r0 = r9.A06
            r0.CCe(r1, r1, r4, r4)
            byte[] r0 = r9.A0J
            byte[] r0 = A01(r0)
            r9.A0K = r0
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r9.A05 = r1
            byte[] r0 = r9.A0K
            byte[] r0 = A01(r0)
            r1.addElement(r0)
            byte[] r1 = new byte[r5]
            int r0 = r5 - r2
            r7 = 0
            java.lang.System.arraycopy(r3, r4, r1, r0, r2)
            int r0 = r9.A01
            int r0 = r0 << 4
            byte r0 = (byte) r0
            r1[r4] = r0
            r3 = 15
            int r2 = 15 - r2
            byte r0 = r1[r2]
            r0 = r0 | 1
            byte r0 = (byte) r0
            r1[r2] = r0
            byte r0 = r1[r3]
            r6 = r0 & 63
            r0 = r0 & 192(0xc0, float:2.69E-43)
            byte r0 = (byte) r0
            r1[r3] = r0
            byte[] r0 = r9.A0A
            if (r0 == 0) goto L_0x00a6
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x00dd
        L_0x00a6:
            byte[] r3 = new byte[r5]
            r9.A0A = r1
            X.E9Y r0 = r9.A06
            r0.CCe(r1, r3, r4, r4)
            byte[] r2 = r9.A0E
            java.lang.System.arraycopy(r3, r4, r2, r4, r5)
        L_0x00b4:
            int r1 = r7 + 16
            byte r0 = r3[r7]
            int r7 = r7 + 1
            X.BE6.A1Q(r3, r2, r7, r0, r1)
            r0 = 8
            if (r7 >= r0) goto L_0x00dd
            goto L_0x00b4
        L_0x00c2:
            if (r8 == r11) goto L_0x0058
            java.lang.String r0 = "cannot change encrypting state without providing key."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00cb:
            boolean r0 = r10 instanceof X.DYm
            if (r0 == 0) goto L_0x013b
            X.DYm r10 = (X.DYm) r10
            byte[] r3 = r10.A01
            r9.A0H = r6
            r9.A01 = r5
            r1 = 16
            X.E3O r7 = r10.A00
            goto L_0x0031
        L_0x00dd:
            int r8 = r6 % 8
            int r7 = r6 / 8
            if (r8 != 0) goto L_0x010e
            byte[] r0 = r9.A0E
            byte[] r6 = r9.A0D
            java.lang.System.arraycopy(r0, r7, r6, r4, r5)
        L_0x00ea:
            r9.A00 = r4
            r9.A02 = r4
            r0 = 0
            r9.A03 = r0
            r9.A04 = r0
            byte[] r0 = new byte[r5]
            r9.A0B = r0
            byte[] r0 = new byte[r5]
            r9.A0F = r0
            byte[] r0 = r9.A0C
            java.lang.System.arraycopy(r6, r4, r0, r4, r5)
            byte[] r0 = new byte[r5]
            r9.A09 = r0
            byte[] r1 = r9.A0H
            if (r1 == 0) goto L_0x010d
            int r0 = r1.length
            r9.CCd(r1, r4, r0)
        L_0x010d:
            return
        L_0x010e:
            r3 = 0
        L_0x010f:
            byte[] r1 = r9.A0E
            byte r0 = r1[r7]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 1
            byte r0 = r1[r7]
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte[] r6 = r9.A0D
            int r2 = r2 << r8
            int r0 = 8 - r8
            int r1 = r1 >>> r0
            X.BE6.A1N(r6, r1, r2, r3)
            int r3 = r3 + 1
            if (r3 >= r5) goto L_0x00ea
            goto L_0x010f
        L_0x0129:
            java.lang.String r0 = "IV must be no more than 15 bytes"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0130:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid value for MAC size: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x013b:
            java.lang.String r0 = "invalid parameters passed to OCB"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DZ1.BdC(X.E3O, boolean):void");
    }

    public int CCg(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        Vector vector;
        byte[] bArr3 = bArr;
        int i4 = i2;
        if (bArr3.length >= i + i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                byte[] bArr4 = this.A0I;
                int i7 = this.A02;
                BE6.A1P(bArr3, bArr4, i + i6, i7);
                int i8 = i7 + 1;
                this.A02 = i8;
                if (i8 == bArr4.length) {
                    int i9 = i3 + i5;
                    byte[] bArr5 = bArr2;
                    if (bArr5.length >= i9 + 16) {
                        if (this.A08) {
                            A00(this.A09, bArr4);
                            this.A02 = 0;
                        }
                        byte[] bArr6 = this.A0C;
                        long j = this.A04 + 1;
                        this.A04 = j;
                        int i10 = 0;
                        if (j == 0) {
                            i10 = 64;
                        } else {
                            while ((1 & j) == 0) {
                                i10++;
                                j >>>= 1;
                            }
                        }
                        while (true) {
                            int size = this.A05.size();
                            vector = this.A05;
                            if (i10 < size) {
                                break;
                            }
                            vector.addElement(A01((byte[]) vector.lastElement()));
                        }
                        A00(bArr6, (byte[]) vector.elementAt(i10));
                        byte[] bArr7 = this.A0I;
                        A00(bArr7, bArr6);
                        this.A07.CCe(bArr7, bArr7, 0, 0);
                        byte[] bArr8 = this.A0I;
                        A00(bArr8, bArr6);
                        System.arraycopy(bArr8, 0, bArr5, i9, 16);
                        if (!this.A08) {
                            byte[] bArr9 = this.A09;
                            byte[] bArr10 = this.A0I;
                            A00(bArr9, bArr10);
                            System.arraycopy(bArr10, 16, bArr10, 0, this.A01);
                            this.A02 = this.A01;
                        }
                        i5 += 16;
                    } else {
                        throw new C28380DyQ("Output buffer too short");
                    }
                }
            }
            return i5;
        }
        throw new C28387DyX("Input buffer too short");
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A07);
        return AnonymousClass000.A0y("/OCB", A10);
    }
}
