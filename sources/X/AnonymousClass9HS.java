package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: X.9HS  reason: invalid class name */
public final class AnonymousClass9HS extends FilterOutputStream {
    public void write(byte[] bArr, int i, int i2) {
        C18070vi.A0d(bArr, 0);
        if (i2 < 16777216) {
            OutputStream outputStream = this.out;
            byte[] bArr2 = new byte[3];
            bArr2[2] = (byte) i2;
            bArr2[1] = (byte) (i2 >> 8);
            bArr2[0] = (byte) (i2 >> 16);
            outputStream.write(bArr2);
            this.out.write(bArr, i, i2);
            this.out.flush();
            return;
        }
        throw new C31851gE(AnonymousClass001.A1I("data too large to write; length=", AnonymousClass000.A10(), i2), i2);
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr) {
        C18070vi.A0d(bArr, 0);
        write(bArr, 0, bArr.length);
    }
}
