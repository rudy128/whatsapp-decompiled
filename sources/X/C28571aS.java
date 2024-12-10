package X;

import android.content.SharedPreferences;

/* renamed from: X.1aS  reason: invalid class name and case insensitive filesystem */
public final class C28571aS extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C28561aR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28571aS(C28561aR r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A05 = this.this$0.A00.A05("pref_labeled_message_count");
        C18070vi.A0X(A05);
        return A05;
    }
}
