package X;

import com.whatsapp.util.Log;

/* renamed from: X.80x  reason: invalid class name and case insensitive filesystem */
public final class C1584980x extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C108935cY $deferredResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1584980x(C108935cY r2) {
        super(1);
        this.$deferredResult = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A6Z a6z = (A6Z) obj;
        C18070vi.A0d(a6z, 0);
        Log.e("AccountTransferManager/verifyOtpCode/onError", new C26941Uc(a6z));
        this.$deferredResult.BFN(C17880vN.A0i());
        return false;
    }
}
