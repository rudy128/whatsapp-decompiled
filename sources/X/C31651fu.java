package X;

import android.content.SharedPreferences;

/* renamed from: X.1fu  reason: invalid class name and case insensitive filesystem */
public final class C31651fu extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C31641ft this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31651fu(C31641ft r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A05 = this.this$0.A01.A05("incoming_stanza_processing_cache_msgs");
        C18070vi.A0X(A05);
        return new C61702q7(A05, this.this$0.A04);
    }
}
