package X;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.DyH  reason: case insensitive filesystem */
public class C28371DyH extends C24221BxZ {
    public static final byte[] A02 = new byte[0];
    public int A00;
    public final int A01;

    public C28371DyH(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        this.A01 = i;
        this.A00 = i;
        if (i == 0) {
            A02();
        }
    }

    public byte[] A03() {
        int read;
        int i = this.A00;
        if (i == 0) {
            return A02;
        }
        int i2 = this.A00;
        if (i < i2) {
            byte[] bArr = new byte[i];
            InputStream inputStream = this.A01;
            int i3 = 0;
            do {
                read = inputStream.read(bArr, i3, i - i3);
                if (read < 0 || (i3 = i3 + read) >= i) {
                    int i4 = i - i3;
                    this.A00 = i4;
                }
                read = inputStream.read(bArr, i3, i - i3);
                break;
            } while ((i3 = i3 + read) >= i);
            int i42 = i - i3;
            this.A00 = i42;
            if (i42 == 0) {
                A02();
                return bArr;
            }
            throw new EOFException(AnonymousClass001.A1I(" object truncated by ", C24221BxZ.A00(this), i42));
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("corrupted stream - out of bounds length found: ");
        A10.append(i);
        throw C17880vN.A0f(AnonymousClass001.A1I(" >= ", A10, i2));
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int read = this.A01.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.A00 - read;
            this.A00 = i4;
            if (i4 != 0) {
                return read;
            }
            A02();
            return read;
        }
        StringBuilder A002 = C24221BxZ.A00(this);
        A002.append(" object truncated by ");
        throw new EOFException(C17880vN.A0t(A002, this.A00));
    }

    public int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A01.read();
        if (read >= 0) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (i != 0) {
                return read;
            }
            A02();
            return read;
        }
        StringBuilder A002 = C24221BxZ.A00(this);
        A002.append(" object truncated by ");
        throw new EOFException(C17880vN.A0t(A002, this.A00));
    }
}
