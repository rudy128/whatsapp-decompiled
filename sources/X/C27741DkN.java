package X;

import android.content.SharedPreferences;

/* renamed from: X.DkN  reason: case insensitive filesystem */
public final class C27741DkN extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ COQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27741DkN(COQ coq) {
        super(0);
        this.this$0 = coq;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A05 = this.this$0.A00.A05("pref_ctwa_entry_point_history");
        C18070vi.A0X(A05);
        return A05;
    }
}
