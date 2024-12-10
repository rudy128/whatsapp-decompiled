package X;

import android.net.Uri;

/* renamed from: X.D9j  reason: case insensitive filesystem */
public class C26686D9j implements E9Q {
    public Uri A00;
    public final E9Q A01;

    public Uri Bb3() {
        return this.A00;
    }

    public long CAj(C26115Csd csd) {
        this.A00 = csd.A04;
        return this.A01.CAj(csd);
    }

    public void close() {
        this.A01.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A01.read(bArr, i, i2);
    }

    public C26686D9j(E9Q e9q) {
        this.A01 = e9q;
    }

    public void BBr(C28570E8b e8b) {
        C26056CrS.A01(e8b);
        this.A01.BBr(e8b);
    }
}
