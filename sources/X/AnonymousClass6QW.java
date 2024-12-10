package X;

import java.io.InputStream;

/* renamed from: X.6QW  reason: invalid class name */
public class AnonymousClass6QW extends InputStream {
    public int A00;
    public InputStream A01;

    public int read() {
        int i = this.A00;
        if (i <= 0) {
            return -1;
        }
        this.A00 = i - 1;
        return this.A01.read();
    }
}
