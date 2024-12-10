package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.7B0  reason: invalid class name */
public class AnonymousClass7B0 implements E9Q {
    public long A00;
    public Uri A01;
    public boolean A02;
    public final E9Q A03;
    public final Object A04 = C17880vN.A0p();

    public void BBr(C28570E8b e8b) {
    }

    public Uri Bb3() {
        Uri uri;
        synchronized (this.A04) {
            uri = this.A01;
        }
        return uri;
    }

    public long CAj(C26115Csd csd) {
        long j;
        Uri uri;
        synchronized (this.A04) {
            j = csd.A03;
            this.A00 = j;
            uri = this.A01;
        }
        if (uri != null) {
            return this.A03.CAj(new C26115Csd(uri, j, -1));
        }
        throw C17880vN.A0f("Uri not set");
    }

    public void close() {
        this.A03.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        long j;
        Uri uri;
        Object obj = this.A04;
        synchronized (obj) {
            j = this.A00;
            if (this.A02) {
                this.A02 = false;
                uri = this.A01;
            } else {
                uri = null;
            }
        }
        if (uri != null) {
            E9Q e9q = this.A03;
            e9q.close();
            e9q.CAj(new C26115Csd(uri, j, -1));
        }
        int read = this.A03.read(bArr, i, i2);
        synchronized (obj) {
            this.A00 += (long) read;
        }
        return read;
    }

    public AnonymousClass7B0(Context context, Uri uri) {
        this.A03 = new BPI(context);
        this.A01 = uri;
    }
}
