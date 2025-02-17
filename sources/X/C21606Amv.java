package X;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

/* renamed from: X.Amv  reason: case insensitive filesystem */
public class C21606Amv extends CipherInputStream {
    public final AtomicLong A00;

    public C21606Amv(InputStream inputStream, AtomicLong atomicLong, Cipher cipher) {
        super(inputStream, cipher);
        this.A00 = atomicLong;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.A00.addAndGet((long) read);
        }
        return read;
    }

    public int read() {
        int read = super.read();
        if (read >= 0) {
            this.A00.incrementAndGet();
        }
        return read;
    }
}
