package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.Beo  reason: case insensitive filesystem */
public final class C23300Beo extends C23301Bep {
    public long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final ByteBuffer A04;
    public final ByteBuffer A05;

    public C23300Beo(ByteBuffer byteBuffer) {
        this.A04 = byteBuffer;
        this.A05 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long A052 = C26267CwC.A02.A05(byteBuffer, C26267CwC.A01);
        this.A01 = A052;
        long position = ((long) byteBuffer.position()) + A052;
        long limit = A052 + ((long) byteBuffer.limit());
        this.A02 = limit;
        this.A03 = limit - 10;
        this.A00 = position;
    }
}
