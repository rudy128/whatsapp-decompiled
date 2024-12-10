package X;

import java.io.InputStream;

/* renamed from: X.BxY  reason: case insensitive filesystem */
public class C24220BxY extends InputStream {
    public int A00;
    public int A01;
    public final DRG A02;

    public boolean markSupported() {
        return true;
    }

    public int available() {
        int i;
        DRG drg = this.A02;
        synchronized (drg) {
            drg.A02();
            i = drg.A01;
        }
        return i - this.A01;
    }

    public void mark(int i) {
        this.A00 = this.A01;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("length=");
            A10.append(bArr.length);
            A10.append("; regionStart=");
            A10.append(i);
            throw BEA.A0Z("; regionLength=", A10, i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.A02.A03(this.A01, bArr, i, min);
        this.A01 += min;
        return min;
    }

    public void reset() {
        this.A01 = this.A00;
    }

    public long skip(long j) {
        C26208Cuj.A04(AnonymousClass000.A1Q((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        int min = Math.min((int) j, available());
        this.A01 += min;
        return (long) min;
    }

    public C24220BxY(DRG drg) {
        boolean z;
        synchronized (drg) {
            z = !DRN.A02(drg.A00);
        }
        C26208Cuj.A04(!z);
        this.A02 = drg;
        this.A01 = 0;
        this.A00 = 0;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read() {
        if (available() <= 0) {
            return -1;
        }
        DRG drg = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return drg.A00(i) & 255;
    }
}
