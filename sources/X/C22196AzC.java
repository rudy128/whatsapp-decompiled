package X;

import com.whatsapp.util.Log;

/* renamed from: X.AzC  reason: case insensitive filesystem */
public final class C22196AzC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26981Ug $callbackFuture;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22196AzC(C26981Ug r2) {
        super(1);
        this.$callbackFuture = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A6Z a6z = (A6Z) obj;
        C18070vi.A0d(a6z, 0);
        C26941Uc r2 = new C26941Uc(a6z);
        Log.e("BatchGetGroupInfoMexHelper/sendBatchGetGroupsViaMex/onError", r2);
        this.$callbackFuture.BrC(new AnonymousClass9LO(r2));
        return false;
    }
}
