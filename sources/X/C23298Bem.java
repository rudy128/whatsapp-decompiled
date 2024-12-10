package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.Bem  reason: case insensitive filesystem */
public final class C23298Bem extends C23301Bep {
    public final ByteBuffer A00;
    public final ByteBuffer A01;

    public C23298Bem(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
        this.A01 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    }
}
