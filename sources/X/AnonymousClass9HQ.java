package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: X.9HQ  reason: invalid class name */
public class AnonymousClass9HQ extends FilterInputStream {
    public long A00;
    public byte[] A01;
    public final MessageDigest A02;
    public final byte[] A03 = new byte[DefaultCrypto.BUFFER_SIZE];

    public String A00() {
        byte[] bArr = this.A01;
        if (bArr == null) {
            bArr = this.A02.digest();
            this.A01 = bArr;
        }
        return C108955ca.A14(bArr);
    }

    public long skip(long j) {
        byte[] bArr = this.A03;
        return (long) read(bArr, 0, (int) Math.min((long) bArr.length, j));
    }

    public AnonymousClass9HQ(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream);
        this.A02 = messageDigest;
    }

    public void close() {
        super.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.A01 = null;
            this.A02.update(bArr, i, read);
            this.A00 += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read() {
        byte[] bArr = new byte[1];
        while (true) {
            int read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
            if (read != 0) {
                return bArr[0];
            }
            Thread.yield();
        }
    }
}
