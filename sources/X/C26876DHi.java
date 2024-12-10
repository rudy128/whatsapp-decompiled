package X;

import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.stream.Framing;
import java.nio.ByteBuffer;

/* renamed from: X.DHi  reason: case insensitive filesystem */
public final class C26876DHi implements E57 {
    public final Framing A00;
    public final ByteBuffer A01;

    public C26876DHi(Framing framing) {
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
        try {
            Framing framing = this.A00;
            byteBuffer2.clear();
            C24346Bzh pack = framing.pack(byteBuffer, byteBuffer2);
            switch (pack.ordinal()) {
                case 0:
                    byteBuffer2.flip();
                    return byteBuffer2;
                case 1:
                    throw new C24201BxD(pack, "unable to process data", (Throwable) null);
                case 2:
                case 3:
                    C26294Cx6.A08("SecureLinkOutputTransformer", "Incomplete or Invalid frame while writing, should not happen!");
                    return null;
                case 4:
                case 5:
                    throw new C24201BxD(pack, "unable to encrypt secure frame", (Throwable) null);
                default:
                    throw AnonymousClass3MW.A14();
            }
        } catch (IllegalArgumentException e) {
            C26294Cx6.A0C("SecureLinkOutputTransformer", "Unable to pack frame", e);
            throw new C24201BxD(C24346Bzh.FAILED, "out of bounds exception, unable to encrypt", e);
        }
    }
}
