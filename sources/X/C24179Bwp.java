package X;

import java.io.FilterOutputStream;

/* renamed from: X.Bwp  reason: case insensitive filesystem */
public class C24179Bwp extends FilterOutputStream {
    public long A00;

    public void close() {
        this.out.close();
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.A00 += (long) i2;
    }

    public void write(int i) {
        this.out.write(i);
        this.A00++;
    }
}
