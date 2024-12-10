package X;

import android.content.SharedPreferences;

/* renamed from: X.DkZ  reason: case insensitive filesystem */
public final class C27753DkZ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C25830Cmh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27753DkZ(C25830Cmh cmh) {
        super(0);
        this.this$0 = cmh;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A05 = this.this$0.A00.A05("media_engagement_daily_preferences_v1");
        C18070vi.A0X(A05);
        return A05;
    }
}
