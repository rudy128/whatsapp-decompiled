package X;

import java.io.InputStream;

/* renamed from: X.BxW  reason: case insensitive filesystem */
public class C24218BxW extends InputStream {
    public boolean A00 = false;
    public final InputStream A01;
    public final C27197DYw A02;
    public final C27196DYv A03;

    public void close() {
        this.A01.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.A00) {
            return -1;
        }
        byte[] bArr2 = bArr;
        int i3 = i;
        int read = this.A01.read(bArr, i, i2);
        if (read == -1) {
            this.A03.BJ5(bArr, i);
            this.A00 = true;
            return 16;
        }
        if (read > 0) {
            this.A02.A03(bArr2, bArr, i3, read, i);
            this.A03.update(bArr, i, read);
        }
        return read;
    }

    public C24218BxW(InputStream inputStream, byte[] bArr, byte[] bArr2) {
        C27196DYv dYv = new C27196DYv();
        this.A03 = dYv;
        this.A01 = inputStream;
        C27197DYw A002 = C25892Co3.A00(bArr, bArr2);
        this.A02 = A002;
        byte[] bArr3 = new byte[32];
        A002.A03(bArr3, bArr3, 0, 32, 0);
        dYv.BdA(new C27190DYo(bArr3));
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
