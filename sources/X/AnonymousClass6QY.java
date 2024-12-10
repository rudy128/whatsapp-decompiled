package X;

import android.text.TextUtils;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: X.6QY  reason: invalid class name */
public class AnonymousClass6QY extends InputStream {
    public long A00;
    public final long A01;
    public final InputStream A02;

    public int read(byte[] bArr, int i, int i2) {
        long j = this.A00;
        long j2 = this.A01;
        if (((long) i2) + j > j2) {
            i2 = (int) (j2 - j);
        }
        if (i2 <= 0) {
            return -1;
        }
        int read = this.A02.read(bArr, i, i2);
        if (read <= 0) {
            return read;
        }
        this.A00 += (long) read;
        return read;
    }

    public int available() {
        long j = this.A00;
        long j2 = this.A01;
        if (j < j2) {
            return this.A02.available();
        }
        Locale locale = Locale.ENGLISH;
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = Long.valueOf(j2);
        C17890vO.A1M(A1b, j);
        C108955ca.A1X("bounded-input-stream/available size-limit:%d already-read:%d, returning 0", locale, A1b);
        return 0;
    }

    public void close() {
        this.A02.close();
    }

    public void mark(int i) {
        this.A02.mark(i);
    }

    public boolean markSupported() {
        return this.A02.markSupported();
    }

    public void reset() {
        this.A02.reset();
    }

    public long skip(long j) {
        long j2 = this.A00;
        long j3 = this.A01;
        if (j2 + j > j3) {
            Locale locale = Locale.ENGLISH;
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass3MX.A1S(A1b, 0, j);
            C17890vO.A1M(A1b, j3 - j2);
            C108955ca.A1X("bounded-input-stream/skip/bytes-truncated-from-%d-to-%d", locale, A1b);
            j = Math.max(j3 - this.A00, 0);
        }
        return super.skip(j);
    }

    public AnonymousClass6QY(InputStream inputStream, long j) {
        C17900vP.A0m("bounded-input-stream/construct ", AnonymousClass000.A10(), j);
        TextUtils.join(", ", Thread.currentThread().getStackTrace());
        this.A02 = inputStream;
        this.A01 = j;
    }

    public int read() {
        long j = this.A00;
        long j2 = this.A01;
        if (j >= j2) {
            Locale locale = Locale.ENGLISH;
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = Long.valueOf(j2);
            C17890vO.A1M(A1b, j);
            C108955ca.A1X("bounded-input-stream/read size-limit:%d already-read:%d, returning -1", locale, A1b);
            return -1;
        }
        int read = this.A02.read();
        if (read < 0) {
            return read;
        }
        this.A00++;
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
