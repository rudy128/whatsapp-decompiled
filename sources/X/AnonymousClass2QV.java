package X;

import java.io.OutputStream;

/* renamed from: X.2QV  reason: invalid class name */
public final class AnonymousClass2QV extends OutputStream {
    public long A00;
    public final int A01;
    public final OutputStream A02;

    public void write(int i) {
        if (this.A00 < ((long) this.A01)) {
            this.A02.write(i);
            this.A00++;
        }
    }

    public AnonymousClass2QV(OutputStream outputStream, int i) {
        this.A02 = outputStream;
        this.A01 = i;
    }
}
