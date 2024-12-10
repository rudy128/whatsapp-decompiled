package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.6QR  reason: invalid class name */
public class AnonymousClass6QR extends FilterInputStream {
    public int A00;
    public int A01;
    public final byte[] A02;

    public void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.A01 = this.A00;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            read = 0;
            if (i2 != 0) {
                while (read < i2) {
                    int i3 = this.A00;
                    byte[] bArr2 = this.A02;
                    if (i3 >= bArr2.length) {
                        break;
                    }
                    this.A00 = i3 + 1;
                    byte b = bArr2[i3] & 255;
                    if (b == -1) {
                        break;
                    }
                    bArr[i + read] = (byte) b;
                    read++;
                }
                if (read > 0) {
                    return read;
                }
                return -1;
            }
        }
        return read;
    }

    public void reset() {
        if (this.in.markSupported()) {
            this.in.reset();
            this.A00 = this.A01;
            return;
        }
        throw C17880vN.A0f("mark is not supported");
    }

    public AnonymousClass6QR(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream != null) {
            this.A02 = bArr;
            return;
        }
        throw new NullPointerException();
    }

    public int read() {
        int read = this.in.read();
        if (read != -1) {
            return read;
        }
        int i = this.A00;
        byte[] bArr = this.A02;
        if (i >= bArr.length) {
            return -1;
        }
        this.A00 = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
