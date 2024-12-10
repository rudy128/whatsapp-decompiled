package X;

import java.io.InputStream;

/* renamed from: X.DyG  reason: case insensitive filesystem */
public class C28370DyG extends C24221BxZ {
    public boolean A00 = true;
    public int A01;
    public int A02;
    public boolean A03 = false;

    public static boolean A01(C28370DyG dyG) {
        if (!dyG.A03 && dyG.A00 && dyG.A01 == 0 && dyG.A02 == 0) {
            dyG.A03 = true;
            dyG.A02();
        }
        return dyG.A03;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.A00 || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.A03) {
            return -1;
        }
        InputStream inputStream = this.A01;
        int read = inputStream.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.A01;
            bArr[i + 1] = (byte) this.A02;
            this.A01 = inputStream.read();
            int read2 = inputStream.read();
            this.A02 = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw BE6.A0i();
        }
        throw BE6.A0i();
    }

    public C28370DyG(InputStream inputStream, int i) {
        super(inputStream, i);
        this.A01 = inputStream.read();
        int read = inputStream.read();
        this.A02 = read;
        if (read >= 0) {
            A01(this);
            return;
        }
        throw BE6.A0i();
    }

    public int read() {
        if (A01(this)) {
            return -1;
        }
        int read = this.A01.read();
        if (read >= 0) {
            int i = this.A01;
            this.A01 = this.A02;
            this.A02 = read;
            return i;
        }
        throw BE6.A0i();
    }
}
