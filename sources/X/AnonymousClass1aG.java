package X;

import android.content.SharedPreferences;

/* renamed from: X.1aG  reason: invalid class name */
public final class AnonymousClass1aG implements C28411aB {
    public final C19830z4 A00;

    public /* bridge */ /* synthetic */ void CJc(Object obj) {
        C19830z4.A00(this.A00).putBoolean("view_once_receiver_nux", true).apply();
    }

    public /* bridge */ /* synthetic */ boolean Bck(Object obj) {
        return ((SharedPreferences) this.A00.A00.get()).getBoolean("view_once_receiver_nux", false);
    }

    public void BkZ(boolean z) {
        C19830z4.A00(this.A00).putBoolean("view_once_receiver_nux", z).apply();
    }

    public AnonymousClass1aG(C19830z4 r1) {
        this.A00 = r1;
    }

    public String BVY() {
        return "ephemeral_view_once_receiver";
    }
}
