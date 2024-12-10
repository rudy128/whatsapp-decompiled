package X;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.9HT  reason: invalid class name */
public class AnonymousClass9HT extends FilterOutputStream {
    public final /* synthetic */ C191239mF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9HT(C191239mF r1, OutputStream outputStream) {
        super(outputStream);
        this.A00 = r1;
    }

    public void close() {
        try {
            this.out.close();
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public void flush() {
        try {
            this.out.flush();
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }
}
