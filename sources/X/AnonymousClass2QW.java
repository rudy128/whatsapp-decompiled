package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.2QW  reason: invalid class name */
public class AnonymousClass2QW extends OutputStream {
    public boolean A00;
    public final File A01;
    public final File A02;
    public final FileOutputStream A03;

    public synchronized void close() {
        if (!this.A00) {
            this.A00 = true;
            this.A03.close();
            File file = this.A01;
            file.delete();
            if (!this.A02.renameTo(file)) {
                throw C17880vN.A0f("File.renameTo failed");
            }
        }
    }

    public void flush() {
        this.A03.flush();
    }

    public void write(int i) {
        this.A03.write(i);
    }

    public AnonymousClass2QW(C219417z r3, File file) {
        File A012 = r3.A01("");
        this.A02 = A012;
        this.A01 = file;
        this.A03 = new FileOutputStream(A012);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A03.write(bArr, i, i2);
    }

    public void write(byte[] bArr) {
        this.A03.write(bArr);
    }
}
