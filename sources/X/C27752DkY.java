package X;

import android.content.SharedPreferences;

/* renamed from: X.DkY  reason: case insensitive filesystem */
public final class C27752DkY extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24962CRm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27752DkY(C24962CRm cRm) {
        super(0);
        this.this$0 = cRm;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A05 = this.this$0.A00.A05("pref_label_message_deprecation_cooldown_file");
        C18070vi.A0X(A05);
        return A05;
    }
}
