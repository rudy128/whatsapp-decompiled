package X;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Bxe  reason: case insensitive filesystem */
public final class C24226Bxe extends OutputStream {
    public final ByteBuffer A00;

    public C24226Bxe(ByteBuffer byteBuffer) {
        C18070vi.A0d(byteBuffer, 1);
        this.A00 = byteBuffer;
    }

    public void write(byte[] bArr, int i, int i2) {
        C18070vi.A0d(bArr, 0);
        this.A00.put(bArr, i, i2);
    }

    public void write(int i) {
        this.A00.put((byte) i);
    }
}
