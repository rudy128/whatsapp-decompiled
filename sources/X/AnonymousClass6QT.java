package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.6QT  reason: invalid class name */
public final class AnonymousClass6QT extends FilterInputStream {
    public long A00 = 1048577;
    public long A01 = -1;

    public synchronized void mark(int i) {
        this.in.mark(i);
        this.A01 = this.A00;
    }

    public synchronized void reset() {
        IOException iOException;
        if (!this.in.markSupported()) {
            iOException = C17880vN.A0f("Mark not supported");
        } else if (this.A01 != -1) {
            this.in.reset();
            this.A00 = this.A01;
        } else {
            iOException = C17880vN.A0f("Mark not set");
        }
        throw iOException;
    }

    public int available() {
        return (int) Math.min((long) this.in.available(), this.A00);
    }

    public int read(byte[] bArr, int i, int i2) {
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.A00 -= (long) read;
        }
        return read;
    }

    public long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.A00));
        this.A00 -= skip;
        return skip;
    }

    public AnonymousClass6QT(InputStream inputStream) {
        super(inputStream);
    }

    public int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.A00--;
        }
        return read;
    }
}
