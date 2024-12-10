package X;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* renamed from: X.Bwh  reason: case insensitive filesystem */
public final class C24173Bwh extends ByteArrayOutputStream {
    public byte[] A01() {
        return this.buf;
    }

    public void A00() {
        Arrays.fill(this.buf, (byte) 0);
        reset();
    }
}
