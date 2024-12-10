package X;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: X.6QX  reason: invalid class name */
public class AnonymousClass6QX extends InputStream {
    public final /* synthetic */ AnonymousClass744 A00;
    public final /* synthetic */ RandomAccessFile A01;

    public AnonymousClass6QX(AnonymousClass744 r1, RandomAccessFile randomAccessFile) {
        this.A00 = r1;
        this.A01 = randomAccessFile;
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A01.read(bArr, i, i2);
    }

    public int read() {
        return this.A01.read();
    }

    public int read(byte[] bArr) {
        return this.A01.read(bArr);
    }
}
