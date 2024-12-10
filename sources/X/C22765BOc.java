package X;

import java.nio.ByteBuffer;

/* renamed from: X.BOc  reason: case insensitive filesystem */
public class C22765BOc extends C24480C5v {
    public long A00;
    public ByteBuffer A01;
    public final int A02;
    public final C25016CTs A03 = new C25016CTs();

    public void clear() {
        this.A00 = 0;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    static {
        C25926Cop.A00("goog.exo.decoder");
    }

    public void A00(int i) {
        int capacity;
        ByteBuffer allocateDirect;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            int i2 = this.A02;
            if (i2 == 1) {
                allocateDirect = ByteBuffer.allocate(i);
            } else if (i2 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i);
            } else {
                throw new C24412C2l(0, i);
            }
        } else {
            int capacity2 = byteBuffer.capacity();
            int position = byteBuffer.position();
            int i3 = i + position;
            if (capacity2 >= i3) {
                this.A01 = byteBuffer;
                return;
            }
            int i4 = this.A02;
            if (i4 == 1) {
                allocateDirect = ByteBuffer.allocate(i3);
            } else if (i4 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i3);
            } else {
                ByteBuffer byteBuffer2 = this.A01;
                if (byteBuffer2 == null) {
                    capacity = 0;
                } else {
                    capacity = byteBuffer2.capacity();
                }
                throw new C24412C2l(capacity, i3);
            }
            allocateDirect.order(byteBuffer.order());
            if (position > 0) {
                byteBuffer.flip();
                allocateDirect.put(byteBuffer);
            }
        }
        this.A01 = allocateDirect;
    }

    public C22765BOc(int i) {
        this.A02 = i;
    }
}
