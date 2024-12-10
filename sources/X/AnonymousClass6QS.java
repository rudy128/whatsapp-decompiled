package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.6QS  reason: invalid class name */
public class AnonymousClass6QS extends FilterInputStream {
    public int A00;
    public int A01;

    public int available() {
        return Math.min(this.in.available(), this.A00);
    }

    public void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.A01 = this.A00;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, i3));
        if (read <= 0) {
            return read;
        }
        this.A00 -= read;
        return read;
    }

    public void reset() {
        if (!this.in.markSupported()) {
            throw C17880vN.A0f("mark is not supported");
        } else if (this.A01 != -1) {
            this.in.reset();
            this.A00 = this.A01;
        } else {
            throw C17880vN.A0f("mark not set");
        }
    }

    public long skip(long j) {
        long skip = this.in.skip(Math.min(j, (long) this.A00));
        this.A00 = (int) (((long) this.A00) - skip);
        return skip;
    }

    public AnonymousClass6QS(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (i >= 0) {
            this.A00 = i;
            this.A01 = -1;
        } else {
            throw AnonymousClass000.A0k("limit must be >= 0");
        }
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
