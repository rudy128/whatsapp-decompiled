package X;

import android.os.Build;

/* renamed from: X.Dgd  reason: case insensitive filesystem */
public final class C27510Dgd extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26220Cv8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27510Dgd(C26220Cv8 cv8) {
        super(0);
        this.this$0 = cv8;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        if (Build.VERSION.SDK_INT >= 29) {
            C26220Cv8 cv8 = this.this$0;
            return C26220Cv8.A01(cv8, cv8.A03.A01());
        }
        throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
    }
}
