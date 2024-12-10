package X;

import android.content.SharedPreferences;

/* renamed from: X.1NQ  reason: invalid class name */
public final class AnonymousClass1NQ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1NP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1NQ(AnonymousClass1NP r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A05 = this.this$0.A01.A05("backup_prefs");
        C18070vi.A0X(A05);
        return A05;
    }
}
