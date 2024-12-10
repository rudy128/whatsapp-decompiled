package X;

import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.stream.Framing;
import java.nio.ByteBuffer;

/* renamed from: X.DHh  reason: case insensitive filesystem */
public final class C26875DHh implements E57 {
    public final Framing A00;
    public final ByteBuffer A01;

    public C26875DHh(Framing framing) {
        C18070vi.A0d(framing, 1);
        this.A00 = framing;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(new Framing((HybridData) null).outerFrameSizeNative(Integer.MAX_VALUE));
        allocateDirect.limit(0);
        this.A01 = allocateDirect;
    }

    public ByteBuffer CPh(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.A01;
        if (byteBuffer2.hasRemaining()) {
            return byteBuffer2;
        }
        Framing framing = this.A00;
        byteBuffer2.clear();
        C24346Bzh unpack = framing.unpack(byteBuffer, byteBuffer2);
        switch (unpack.ordinal()) {
            case 0:
                byteBuffer2.flip();
                return byteBuffer2;
            case 1:
                throw new C24201BxD(unpack, "unable to process secure frame", (Throwable) null);
            case 2:
            case 3:
                BE7.A1P(byteBuffer2);
                return null;
            case 4:
                throw new C24201BxD(unpack, "unable to authenticate secure frame", (Throwable) null);
            case 5:
                throw new C24201BxD(unpack, "unable to decrypt secure frame", (Throwable) null);
            default:
                throw AnonymousClass3MW.A14();
        }
    }
}
