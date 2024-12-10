package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.BhF  reason: case insensitive filesystem */
public final class C23450BhF extends C25876Cnk {
    public static final Logger A04 = BE7.A0w(C23450BhF.class);
    public static final boolean A05 = C26277CwW.A05;
    public int A00;
    public DKF A01;
    public final int A02;
    public final byte[] A03;

    public static int A02(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public final void A04(byte b) {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, this.A00);
            throw new C24211BxN(BEB.A0b(this.A02, A1a), e);
        }
    }

    public final void A05(int i) {
        long j;
        byte b;
        if (A05 && !C25440Cfn.A00()) {
            int i2 = this.A02;
            int i3 = this.A00;
            if (i2 - i3 >= 5) {
                int i4 = i & -128;
                byte[] bArr = this.A03;
                this.A00 = i3 + 1;
                if (i4 == 0) {
                    j = (long) i3;
                    b = (byte) i;
                } else {
                    C26277CwW.A08(bArr, (long) i3, (byte) (i | 128));
                    int i5 = i >>> 7;
                    if ((i5 & -128) != 0) {
                        int i6 = this.A00;
                        this.A00 = i6 + 1;
                        C26277CwW.A08(bArr, (long) i6, (byte) (i5 | 128));
                        i5 >>>= 7;
                        if ((i5 & -128) != 0) {
                            int i7 = this.A00;
                            this.A00 = i7 + 1;
                            C26277CwW.A08(bArr, (long) i7, (byte) (i5 | 128));
                            i5 >>>= 7;
                            if ((i5 & -128) != 0) {
                                int i8 = this.A00;
                                this.A00 = i8 + 1;
                                C26277CwW.A08(bArr, (long) i8, (byte) (i5 | 128));
                                i5 >>>= 7;
                            }
                        }
                    }
                    int i9 = this.A00;
                    this.A00 = i9 + 1;
                    j = (long) i9;
                    b = (byte) i5;
                }
                C26277CwW.A08(bArr, j, b);
                return;
            }
        }
        while ((i & -128) != 0) {
            try {
                byte[] bArr2 = this.A03;
                int i10 = this.A00;
                this.A00 = i10 + 1;
                BE7.A1T(bArr2, i, i10);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                Object[] A1a = AnonymousClass8BR.A1a();
                AnonymousClass000.A1L(A1a, this.A00);
                throw new C24211BxN(BEB.A0b(this.A02, A1a), e);
            }
        }
        byte[] bArr3 = this.A03;
        int i11 = this.A00;
        this.A00 = i11 + 1;
        bArr3[i11] = (byte) i;
    }

    public final void A06(int i) {
        try {
            byte[] bArr = this.A03;
            int A0B = BEB.A0B(bArr, this.A00, i);
            this.A00 = A0B + 1;
            bArr[A0B] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, this.A00);
            throw new C24211BxN(BEB.A0b(this.A02, A1a), e);
        }
    }

    public final void A07(int i, int i2) {
        A05(i << 3);
        if (i2 >= 0) {
            A05(i2);
        } else {
            A09((long) i2);
        }
    }

    public final void A09(long j) {
        if (!A05 || this.A02 - this.A00 < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.A03;
                    int i = this.A00;
                    this.A00 = i + 1;
                    BE7.A1T(bArr, (int) j, i);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    Object[] A1a = AnonymousClass8BR.A1a();
                    AnonymousClass000.A1L(A1a, this.A00);
                    throw new C24211BxN(BEB.A0b(this.A02, A1a), e);
                }
            }
            byte[] bArr2 = this.A03;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            byte[] bArr3 = this.A03;
            int i4 = this.A00;
            this.A00 = i4 + 1;
            long j2 = (long) i4;
            int i5 = (int) j;
            if (i3 == 0) {
                C26277CwW.A08(bArr3, j2, (byte) i5);
                return;
            } else {
                C26277CwW.A08(bArr3, j2, (byte) ((i5 & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                j >>>= 7;
            }
        }
    }

    public final void A0A(long j) {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            int i2 = i + 1;
            int A0A = BE6.A0A((int) j, bArr, i, i2);
            BE6.A1B(j, bArr, 8, i2);
            int i3 = A0A + 1;
            BE6.A1B(j, bArr, 16, A0A);
            int i4 = i3 + 1;
            BE6.A1B(j, bArr, 24, i3);
            int i5 = i4 + 1;
            BE6.A1B(j, bArr, 32, i4);
            int i6 = i5 + 1;
            BE6.A1B(j, bArr, 40, i5);
            int i7 = i6 + 1;
            BE6.A1B(j, bArr, 48, i6);
            this.A00 = i7 + 1;
            BE6.A1B(j, bArr, 56, i7);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, this.A00);
            throw new C24211BxN(BEB.A0b(this.A02, A1a), e);
        }
    }

    public final void A0C(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.A03, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, this.A00);
            AnonymousClass000.A1M(A1a, this.A02);
            BE8.A1M(A1a, i2);
            throw new C24211BxN(String.format("Pos: %d, limit: %d, len: %d", A1a), e);
        }
    }

    public C23450BhF(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A03 = bArr;
            this.A00 = 0;
            this.A02 = i;
            return;
        }
        Object[] A1a = AnonymousClass8BR.A1a();
        C17880vN.A1T(A1a, length, 0);
        C17880vN.A1T(A1a, 0, 1);
        BE8.A1M(A1a, i);
        throw BE8.A0X("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1a);
    }

    public static int A00(int i) {
        return BEB.A02(i);
    }

    public static int A01(int i, String str) {
        int i2;
        int A042 = C25876Cnk.A04(i);
        try {
            i2 = C25406Cf8.A00(str);
        } catch (C24407C2e unused) {
            i2 = str.getBytes(C25462CgF.A00).length;
        }
        return A042 + BEB.A02(i2) + i2;
    }

    public static int A03(DSO dso, int i) {
        int A042 = C25876Cnk.A04(i);
        int A012 = dso.A01();
        return A042 + BEB.A02(A012) + A012;
    }

    public final void A08(int i, String str) {
        int A002;
        C25876Cnk.A06(this, i);
        int i2 = this.A00;
        try {
            int length = str.length();
            int A022 = BEB.A02(length * 3);
            int A023 = BEB.A02(length);
            if (A023 == A022) {
                int i3 = i2 + A023;
                this.A00 = i3;
                A002 = C25406Cf8.A00.A00(str, this.A03, i3, this.A02 - i3);
                this.A00 = i2;
                A05((A002 - i2) - A023);
            } else {
                A05(C25406Cf8.A00(str));
                byte[] bArr = this.A03;
                int i4 = this.A00;
                A002 = C25406Cf8.A00.A00(str, bArr, i4, this.A02 - i4);
            }
            this.A00 = A002;
        } catch (C24407C2e e) {
            this.A00 = i2;
            A04.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(C25462CgF.A00);
            try {
                int length2 = bytes.length;
                A05(length2);
                A0C(bytes, 0, length2);
            } catch (IndexOutOfBoundsException e2) {
                throw new C24211BxN(e2);
            } catch (C24211BxN e3) {
                throw e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new C24211BxN(e4);
        }
    }

    public final void A0B(DSO dso, int i) {
        C25876Cnk.A06(this, i);
        A05(dso.A01());
        C23452BhH bhH = (C23452BhH) dso;
        A0C(bhH.zzb, bhH.A03(), bhH.A01());
    }

    public C23450BhF() {
    }
}
