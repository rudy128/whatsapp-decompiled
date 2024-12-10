package X;

import android.content.SharedPreferences;

/* renamed from: X.1aE  reason: invalid class name and case insensitive filesystem */
public final class C28441aE implements C28411aB {
    public final C19830z4 A00;

    public /* bridge */ /* synthetic */ void CJc(Object obj) {
        C19830z4.A00(this.A00).putBoolean("ephemeral_nux", true).apply();
    }

    public /* bridge */ /* synthetic */ boolean Bck(Object obj) {
        return ((SharedPreferences) this.A00.A00.get()).getBoolean("ephemeral_nux", false);
    }

    public void BkZ(boolean z) {
        C19830z4.A00(this.A00).putBoolean("ephemeral_nux", z).apply();
    }

    public C28441aE(C19830z4 r1) {
        this.A00 = r1;
    }

    public String BVY() {
        return "ephemeral";
    }
}
