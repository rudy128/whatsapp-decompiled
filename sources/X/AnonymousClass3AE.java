package X;

import android.content.SharedPreferences;

/* renamed from: X.3AE  reason: invalid class name */
public final class AnonymousClass3AE implements AnonymousClass3LM {
    public final AnonymousClass11O A00;

    public AnonymousClass3AE(AnonymousClass11O r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BlV() {
        SharedPreferences sharedPreferences = this.A00.A00;
        C17880vN.A1F(sharedPreferences.edit(), "force_db_check", true);
        C17880vN.A1F(sharedPreferences.edit(), "force_wadb_check", true);
        C17880vN.A1F(sharedPreferences.edit(), "force_backup_check", true);
    }
}
