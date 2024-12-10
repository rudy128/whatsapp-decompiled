package X;

import com.facebook.ale.p000native.ResponseCallback;

/* renamed from: X.Doa  reason: case insensitive filesystem */
public final class C27938Doa extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ResponseCallback $responseCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27938Doa(ResponseCallback responseCallback) {
        super(1);
        this.$responseCallback = responseCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        this.$responseCallback.onSuccess(str);
        return C27621Wu.A00;
    }
}
