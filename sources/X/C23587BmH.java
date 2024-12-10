package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.OutputStream;

/* renamed from: X.BmH  reason: case insensitive filesystem */
public final class C23587BmH extends CodedOutputStream {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;
    public final OutputStream A04;

    public static void A00(C23587BmH bmH) {
        bmH.A04.write(bmH.A03, 0, bmH.A00);
        bmH.A00 = 0;
    }

    public static void A01(C23587BmH bmH, int i) {
        if (bmH.A02 - bmH.A00 < i) {
            A00(bmH);
        }
    }

    public final void A0M(int i) {
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        long j;
        if (CodedOutputStream.A01) {
            long j2 = (long) this.A00;
            while (true) {
                int i4 = i & -128;
                bArr2 = this.A03;
                int i5 = this.A00;
                this.A00 = i5 + 1;
                j = (long) i5;
                if (i4 == 0) {
                    break;
                }
                UnsafeUtil.A07(bArr2, j, (byte) ((i & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                i >>>= 7;
            }
            UnsafeUtil.A07(bArr2, j, (byte) i);
            i3 = this.A01 + ((int) (((long) this.A00) - j2));
        } else {
            while (true) {
                int i6 = i & -128;
                bArr = this.A03;
                i2 = this.A00;
                this.A00 = i2 + 1;
                if (i6 == 0) {
                    break;
                }
                BE7.A1T(bArr, i, i2);
                this.A01++;
                i >>>= 7;
            }
            bArr[i2] = (byte) i;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public final void A0N(long j) {
        byte[] bArr = this.A03;
        int i = this.A00;
        int i2 = i + 1;
        int A0A = BE6.A0A((int) (j & 255), bArr, i, i2);
        int A0A2 = BE6.A0A((int) ((j >> 8) & 255), bArr, i2, A0A);
        int A0A3 = BE6.A0A((int) ((j >> 16) & 255), bArr, A0A, A0A2);
        int A0A4 = BE6.A0A((int) (255 & (j >> 24)), bArr, A0A2, A0A3);
        BE8.A0v(j, bArr, 32, A0A3);
        int i3 = A0A4 + 1;
        BE8.A0v(j, bArr, 40, A0A4);
        int i4 = i3 + 1;
        BE8.A0v(j, bArr, 48, i3);
        this.A00 = i4 + 1;
        BE8.A0v(j, bArr, 56, i4);
        this.A01 += 8;
    }

    public final void A0O(long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        int i4;
        if (CodedOutputStream.A01) {
            long j2 = (long) this.A00;
            while (true) {
                int i5 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                bArr2 = this.A03;
                i4 = this.A00;
                this.A00 = i4 + 1;
                if (i5 == 0) {
                    break;
                }
                UnsafeUtil.A07(bArr2, (long) i4, (byte) ((((int) j) & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                j >>>= 7;
            }
            UnsafeUtil.A07(bArr2, (long) i4, (byte) ((int) j));
            i3 = this.A01 + ((int) (((long) this.A00) - j2));
        } else {
            while (true) {
                int i6 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                bArr = this.A03;
                i = this.A00;
                this.A00 = i + 1;
                i2 = (int) j;
                if (i6 == 0) {
                    break;
                }
                BE7.A1T(bArr, i2, i);
                this.A01++;
                j >>>= 7;
            }
            bArr[i] = (byte) i2;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public void A0P(byte[] bArr, int i, int i2) {
        int i3 = this.A02;
        int i4 = this.A00;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.A03, i4, i2);
            this.A00 += i2;
        } else {
            byte[] bArr2 = this.A03;
            System.arraycopy(bArr, i, bArr2, i4, i5);
            int i6 = i + i5;
            i2 -= i5;
            this.A00 = i3;
            this.A01 += i5;
            A00(this);
            if (i2 <= i3) {
                System.arraycopy(bArr, i6, bArr2, 0, i2);
                this.A00 = i2;
            } else {
                this.A04.write(bArr, i6, i2);
            }
        }
        this.A01 += i2;
    }

    public C23587BmH(OutputStream outputStream, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.A03 = new byte[max];
            this.A02 = max;
            if (outputStream != null) {
                this.A04 = outputStream;
                return;
            }
            throw AnonymousClass000.A0s("out");
        }
        throw AnonymousClass000.A0k("bufferSize must be >= 0");
    }
}
