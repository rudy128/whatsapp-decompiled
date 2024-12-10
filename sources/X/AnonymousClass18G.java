package X;

import android.content.SharedPreferences;

/* renamed from: X.18G  reason: invalid class name */
public final class AnonymousClass18G extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C18010vc $sharedPreferencesFactory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass18G(C18010vc r2) {
        super(0);
        this.$sharedPreferencesFactory = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A05 = this.$sharedPreferencesFactory.A05("dropped_wam_events");
        C18070vi.A0X(A05);
        return A05;
    }
}
