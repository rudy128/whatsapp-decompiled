package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1ts  reason: invalid class name and case insensitive filesystem */
public final class C39931ts extends InputStream {
    public final /* synthetic */ C39871tm A00;

    public int read(byte[] bArr, int i, int i2) {
        C18070vi.A0c(bArr, 0);
        C39871tm r3 = this.A00;
        if (!r3.A00) {
            C39921tr.A00((long) bArr.length, (long) i, (long) i2);
            C39881tn r5 = r3.A01;
            if (r5.A00 == 0 && r3.A02.CDN(r5) == -1) {
                return -1;
            }
            return r5.A03(bArr, i, i2);
        }
        throw new IOException("closed");
    }

    public C39931ts(C39871tm r1) {
        this.A00 = r1;
    }

    public int available() {
        C39871tm r1 = this.A00;
        if (!r1.A00) {
            return (int) Math.min(r1.A01.A00, 2147483647L);
        }
        throw new IOException("closed");
    }

    public void close() {
        this.A00.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(".inputStream()");
        return sb.toString();
    }

    public int read() {
        C39871tm r6 = this.A00;
        if (!r6.A00) {
            C39881tn r5 = r6.A01;
            if (r5.A00 == 0 && r6.A02.CDN(r5) == -1) {
                return -1;
            }
            return r5.A00() & 255;
        }
        throw new IOException("closed");
    }
}
