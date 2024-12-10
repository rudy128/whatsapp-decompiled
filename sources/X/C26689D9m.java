package X;

import android.net.Uri;

/* renamed from: X.D9m  reason: case insensitive filesystem */
public final class C26689D9m implements E9Q {
    public long A00;
    public long A01;
    public C28653ECn A02;
    public byte[] A03;

    public void BBr(C28570E8b e8b) {
    }

    public Uri Bb3() {
        return null;
    }

    public long CAj(C26115Csd csd) {
        return -1;
    }

    public void close() {
    }

    public int read(byte[] bArr, int i, int i2) {
        int min;
        long j = this.A01;
        if (j == 0 || (min = Math.min(i2, (int) j)) <= 0) {
            return -1;
        }
        System.arraycopy(this.A03, (int) this.A00, bArr, i, min);
        long j2 = (long) min;
        this.A00 += j2;
        this.A01 -= j2;
        return min;
    }
}
