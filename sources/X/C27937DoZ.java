package X;

import com.facebook.ale.p000native.ResponseCallback;

/* renamed from: X.DoZ  reason: case insensitive filesystem */
public final class C27937DoZ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ResponseCallback $responseCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27937DoZ(ResponseCallback responseCallback) {
        super(1);
        this.$responseCallback = responseCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        this.$responseCallback.onFailure(str);
        return C27621Wu.A00;
    }
}
