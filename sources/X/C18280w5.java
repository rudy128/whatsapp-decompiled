package X;

import java.io.OutputStream;

/* renamed from: X.0w5  reason: invalid class name and case insensitive filesystem */
public final class C18280w5 extends OutputStream {
    public final OutputStream A00;
    public final OutputStream A01;

    public void close() {
        try {
            this.A00.close();
        } finally {
            this.A01.close();
        }
    }

    public void flush() {
        this.A00.flush();
        this.A01.flush();
    }

    public void write(int i) {
        this.A00.write(i);
        this.A01.write(i);
    }

    public C18280w5(OutputStream outputStream, OutputStream outputStream2) {
        this.A00 = outputStream;
        this.A01 = outputStream2;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A00.write(bArr, i, i2);
        this.A01.write(bArr, i, i2);
    }

    public void write(byte[] bArr) {
        this.A00.write(bArr);
        this.A01.write(bArr);
    }
}
