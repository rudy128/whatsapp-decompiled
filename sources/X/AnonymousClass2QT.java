package X;

import java.io.InputStream;

/* renamed from: X.2QT  reason: invalid class name */
public final class AnonymousClass2QT extends InputStream {
    public long A00;
    public InputStream A01;
    public byte[] A02;

    public boolean markSupported() {
        return false;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int available() {
        return this.A01.available();
    }

    public void close() {
        this.A01.close();
    }

    public void mark(int i) {
        throw AnonymousClass000.A0n("Can't mark");
    }

    public void reset() {
        throw AnonymousClass000.A0n("Can't reset");
    }

    public long skip(long j) {
        long skip = this.A01.skip(j);
        this.A00 += skip;
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.A01.read(bArr, i, i2);
        this.A00 += (long) read;
        return read;
    }

    public int read() {
        byte[] bArr = this.A02;
        int read = read(bArr, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return bArr[0] & 255;
        }
        throw AnonymousClass000.A0n(AnonymousClass001.A1I("OIS unexpected return value: ", AnonymousClass000.A10(), read));
    }
}
