package X;

import android.content.SharedPreferences;

/* renamed from: X.1aI  reason: invalid class name and case insensitive filesystem */
public final class C28471aI implements C28411aB {
    public final C19830z4 A00;

    public /* bridge */ /* synthetic */ void CJc(Object obj) {
        C19830z4.A00(this.A00).putBoolean("support_ai_nux_shown", true).apply();
    }

    public /* bridge */ /* synthetic */ boolean Bck(Object obj) {
        return ((SharedPreferences) this.A00.A00.get()).getBoolean("support_ai_nux_shown", false);
    }

    public void BkZ(boolean z) {
        C19830z4.A00(this.A00).putBoolean("support_ai_nux_shown", z).apply();
    }

    public C28471aI(C19830z4 r1) {
        this.A00 = r1;
    }

    public String BVY() {
        return "support_ai";
    }
}
