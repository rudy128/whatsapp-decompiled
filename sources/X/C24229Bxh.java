package X;

import java.io.OutputStream;

/* renamed from: X.Bxh  reason: case insensitive filesystem */
public class C24229Bxh extends OutputStream {
    public final OutputStream A00;
    public final String A01;
    public final /* synthetic */ C22913BVb A02;

    public C24229Bxh(C22913BVb bVb, OutputStream outputStream, String str) {
        this.A02 = bVb;
        this.A00 = outputStream;
        this.A01 = str;
    }

    public void close() {
        this.A00.close();
        String str = this.A01;
        if (str != null) {
            this.A02.A01.add(str);
        }
    }

    public void flush() {
        this.A00.flush();
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A00.write(bArr, i, i2);
    }

    public void write(int i) {
        this.A00.write(i);
    }

    public void write(byte[] bArr) {
        this.A00.write(bArr);
    }
}
