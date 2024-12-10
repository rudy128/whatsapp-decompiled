package X;

import android.content.SharedPreferences;

/* renamed from: X.Dkz  reason: case insensitive filesystem */
public final class C27779Dkz extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24886COe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27779Dkz(C24886COe cOe) {
        super(0);
        this.this$0 = cOe;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A05 = this.this$0.A00.A05("status_prefs");
        C18070vi.A0X(A05);
        return A05;
    }
}
