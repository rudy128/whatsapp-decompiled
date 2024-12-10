package X;

import java.nio.ByteBuffer;

public abstract class BXL extends C22812BQn {
    public final BQm A00;

    public void A07() {
        this.A00.A0F(new C27537Dh4(this));
    }

    public void A08() {
        this.A00.A0F(new C27538Dh5(this));
    }

    public BXL(BQm bQm) {
        super(bQm);
        this.A00 = bQm;
    }

    public static final ByteBuffer A00(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity() + byteBuffer2.capacity());
        byteBuffer.flip();
        allocateDirect.put(byteBuffer);
        allocateDirect.put(byteBuffer2);
        return allocateDirect;
    }
}
