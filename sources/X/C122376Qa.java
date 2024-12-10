package X;

import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: X.6Qa  reason: invalid class name and case insensitive filesystem */
public class C122376Qa extends OutputStream {
    public final /* synthetic */ AnonymousClass744 A00;
    public final /* synthetic */ RandomAccessFile A01;

    public C122376Qa(AnonymousClass744 r1, RandomAccessFile randomAccessFile) {
        this.A00 = r1;
        this.A01 = randomAccessFile;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
    }

    public void write(int i) {
        this.A01.write(i);
    }

    public void write(byte[] bArr) {
        this.A01.write(bArr);
    }
}
