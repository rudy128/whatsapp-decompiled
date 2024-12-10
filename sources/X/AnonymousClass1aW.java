package X;

import android.content.SharedPreferences;

/* renamed from: X.1aW  reason: invalid class name */
public final class AnonymousClass1aW extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1aV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1aW(AnonymousClass1aV r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A05 = this.this$0.A00.A05("pref_labeled_chat_jids");
        C18070vi.A0X(A05);
        return A05;
    }
}
