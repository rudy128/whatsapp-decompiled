package X;

import android.content.SharedPreferences;

/* renamed from: X.1aL  reason: invalid class name and case insensitive filesystem */
public final class C28501aL implements C28411aB {
    public final C19830z4 A00;

    public /* bridge */ /* synthetic */ boolean Bck(Object obj) {
        return ((SharedPreferences) this.A00.A00.get()).getBoolean("message_label_migration_nux", false);
    }

    public void BkZ(boolean z) {
        C19830z4.A00(this.A00).putBoolean("message_label_migration_nux", z).apply();
    }

    public /* bridge */ /* synthetic */ void CJc(Object obj) {
        boolean z;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        C19830z4.A00(this.A00).putBoolean("message_label_migration_nux", z).apply();
    }

    public C28501aL(C19830z4 r1) {
        this.A00 = r1;
    }

    public String BVY() {
        return "message_label_deprecation_migrated";
    }
}
