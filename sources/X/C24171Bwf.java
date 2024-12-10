package X;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.Bwf  reason: case insensitive filesystem */
public class C24171Bwf extends ByteArrayOutputStream {
    public final ByteBuffer A00() {
        ByteBuffer wrap = ByteBuffer.wrap(this.buf, 0, size());
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.asReadOnlyBuffer();
    }

    public final byte[] A01() {
        return this.buf;
    }
}
