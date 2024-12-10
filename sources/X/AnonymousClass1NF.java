package X;

import android.content.SharedPreferences;

/* renamed from: X.1NF  reason: invalid class name */
public final class AnonymousClass1NF extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1ND this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1NF(AnonymousClass1ND r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A05 = this.this$0.A01.A05("pref_label_jid_tracker_file");
        C18070vi.A0X(A05);
        return A05;
    }
}
