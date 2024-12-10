package X;

import com.facebook.ale.p000native.ResponseCallback;
import java.nio.ByteBuffer;

/* renamed from: X.DoY  reason: case insensitive filesystem */
public final class C27936DoY extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ResponseCallback $responseCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27936DoY(ResponseCallback responseCallback) {
        super(1);
        this.$responseCallback = responseCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C18070vi.A0d(byteBuffer, 0);
        this.$responseCallback.onSuccessfullCdnDownload(byteBuffer);
        return C27621Wu.A00;
    }
}
