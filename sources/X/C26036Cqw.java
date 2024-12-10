package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: X.Cqw  reason: case insensitive filesystem */
public final class C26036Cqw {
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03 = new byte[65536];
    public final long A04;
    public final E9Q A05;
    public final byte[] A06 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];

    public void A02(int i) {
        int min = Math.min(this.A00, i);
        A01(this, min);
        while (min < i) {
            if (min != -1) {
                min = A00(this, this.A06, -min, Math.min(i, ZipDecompressor.UNZIP_BUFFER_SIZE + min), min, false);
            } else {
                return;
            }
        }
        if (min != -1) {
            this.A02 += (long) min;
        }
    }

    public void A03(byte[] bArr, int i, int i2) {
        if (A04(i2, false)) {
            System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        }
    }

    public boolean A04(int i, boolean z) {
        int i2 = i;
        int i3 = this.A01 + i;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i3 > length) {
            this.A03 = Arrays.copyOf(bArr, BE8.A07(length * 2, i3 + 524288, 65536 + i3));
        }
        int i4 = this.A00;
        int i5 = this.A01;
        int i6 = i4 - i5;
        while (i6 < i) {
            i6 = A00(this, this.A03, i5, i2, i6, z);
            if (i6 == -1) {
                return false;
            }
            i5 = this.A01;
            this.A00 = i5 + i6;
        }
        this.A01 = i5 + i;
        return true;
    }

    public boolean A05(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.A00;
        byte[] bArr2 = bArr;
        int i5 = i;
        int i6 = i2;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.A03, 0, bArr, i, i3);
            A01(this, i3);
        }
        while (i3 < i2) {
            if (i3 == -1) {
                return false;
            }
            i3 = A00(this, bArr2, i5, i6, i3, z);
        }
        if (i3 == -1) {
            return false;
        }
        this.A02 += (long) i3;
        return true;
    }

    public static void A01(C26036Cqw cqw, int i) {
        int i2 = cqw.A00 - i;
        cqw.A00 = i2;
        cqw.A01 = 0;
        byte[] bArr = cqw.A03;
        byte[] bArr2 = bArr;
        if (i2 < bArr.length - 524288) {
            bArr2 = new byte[(65536 + i2)];
        }
        System.arraycopy(bArr, i, bArr2, 0, i2);
        cqw.A03 = bArr2;
    }

    public C26036Cqw(E9Q e9q, long j, long j2) {
        this.A05 = e9q;
        this.A02 = j;
        this.A04 = j2;
    }

    public static int A00(C26036Cqw cqw, byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = cqw.A05.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw BE6.A0i();
        }
        throw new InterruptedIOException();
    }
}
