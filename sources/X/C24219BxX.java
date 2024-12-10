package X;

import java.io.InputStream;

/* renamed from: X.BxX  reason: case insensitive filesystem */
public class C24219BxX extends InputStream {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02 = false;
    public final InputStream A03;
    public final byte[] A04;
    public final E4M A05;

    public int available() {
        int i = this.A00;
        int i2 = this.A01;
        C26208Cuj.A05(BE8.A1U(i, i2));
        if (!this.A02) {
            return (i2 - i) + this.A03.available();
        }
        throw C17880vN.A0f("stream already closed");
    }

    public void close() {
        if (!this.A02) {
            this.A02 = true;
            this.A05.CEE(this.A04);
        }
    }

    public void finalize() {
        if (!this.A02) {
            EAY eay = C26265CwA.A00;
            if (eay.BfN(6)) {
                eay.BJn("PooledByteInputStream", "Finalized without closing");
            }
            close();
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        int i4 = this.A01;
        C26208Cuj.A05(BE8.A1U(i3, i4));
        if (!this.A02) {
            if (i3 >= i4) {
                i4 = this.A03.read(this.A04);
                i3 = 0;
                if (i4 <= 0) {
                    return -1;
                }
                this.A01 = i4;
                this.A00 = 0;
            }
            int min = Math.min(i4 - i3, i2);
            System.arraycopy(this.A04, i3, bArr, i, min);
            this.A00 += min;
            return min;
        }
        throw C17880vN.A0f("stream already closed");
    }

    public long skip(long j) {
        int i = this.A00;
        int i2 = this.A01;
        C26208Cuj.A05(BE8.A1U(i, i2));
        if (!this.A02) {
            long j2 = (long) (i2 - i);
            if (j2 >= j) {
                this.A00 = (int) (((long) i) + j);
                return j;
            }
            this.A00 = i2;
            return j2 + this.A03.skip(j - j2);
        }
        throw C17880vN.A0f("stream already closed");
    }

    public C24219BxX(E4M e4m, InputStream inputStream, byte[] bArr) {
        C26208Cuj.A01(inputStream);
        this.A03 = inputStream;
        C26208Cuj.A01(bArr);
        this.A04 = bArr;
        this.A05 = e4m;
    }

    public int read() {
        int i = this.A00;
        int i2 = this.A01;
        C26208Cuj.A05(BE8.A1U(i, i2));
        if (!this.A02) {
            if (i >= i2) {
                int read = this.A03.read(this.A04);
                i = 0;
                if (read <= 0) {
                    return -1;
                }
                this.A01 = read;
                this.A00 = 0;
            }
            byte[] bArr = this.A04;
            this.A00 = i + 1;
            return bArr[i] & 255;
        }
        throw C17880vN.A0f("stream already closed");
    }
}
