package X;

import java.nio.ByteBuffer;

public final class BOT extends C26662D8l {
    public final D9R A00;

    public BOT(D9R d9r) {
        C26056CrS.A01(d9r);
        this.A00 = d9r;
    }

    public void CDB(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining != 0) {
            D9R d9r = this.A00;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            ByteBuffer allocate = ByteBuffer.allocate(asReadOnlyBuffer.limit() - asReadOnlyBuffer.position());
            allocate.put(asReadOnlyBuffer);
            allocate.flip();
            d9r.A01.A0o.Bz4(allocate.array());
            ByteBuffer A02 = A02(remaining);
            A02.put(byteBuffer);
            A02.flip();
        }
    }
}
