package X;

import com.whatsapp.util.Log;

/* renamed from: X.7xT  reason: invalid class name */
public final class AnonymousClass7xT extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $onComplete;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7xT(C22821Di r2) {
        super(1);
        this.$onComplete = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A6Z a6z = (A6Z) obj;
        C18070vi.A0d(a6z, 0);
        Log.e("MultiAccountServerPrimer/AddMultiAccountLinkMutation/onError", new C26941Uc(a6z));
        this.$onComplete.invoke((Object) null);
        return AnonymousClass000.A0i();
    }
}
