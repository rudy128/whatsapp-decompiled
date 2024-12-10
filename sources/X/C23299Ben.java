package X;

import java.nio.ByteBuffer;

/* renamed from: X.Ben  reason: case insensitive filesystem */
public final class C23299Ben extends C23301Bep {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final ByteBuffer A04;
    public final byte[] A05;

    public C23299Ben(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int remaining = byteBuffer.remaining();
        if (array != null) {
            int length = array.length;
            int i = arrayOffset + remaining;
            if ((arrayOffset | remaining | (length - i)) >= 0) {
                this.A05 = array;
                this.A03 = arrayOffset;
                this.A00 = arrayOffset;
                this.A02 = i;
                this.A04 = byteBuffer;
                this.A01 = byteBuffer.position();
                return;
            }
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, length);
            C17880vN.A1T(A1a, arrayOffset, 1);
            BE8.A1M(A1a, remaining);
            throw BE8.A0X("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1a);
        }
        throw AnonymousClass000.A0s("buffer");
    }
}
