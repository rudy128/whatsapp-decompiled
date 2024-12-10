package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.302  reason: invalid class name */
public final class AnonymousClass302 implements C72113Kr {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void Bqf() {
        try {
            for (AnonymousClass18H r4 : (Iterable) C18070vi.A0E(this.A01)) {
                synchronized (r4) {
                    if (AnonymousClass1Es.A00(r4) < 2) {
                        int A002 = AnonymousClass1Es.A00(r4);
                        if (A002 < 0 || A002 >= 2) {
                            throw AnonymousClass000.A0k("Version bump required");
                        }
                        HashMap A11 = C17880vN.A11();
                        if (AnonymousClass1Es.A00(r4) <= 0) {
                            A11.put("wam_client_errors", String.class);
                        }
                        if (AnonymousClass1Es.A00(r4) <= 1) {
                            Class<Boolean> cls = Boolean.class;
                            A11.put("wam_is_psid_migrated", cls);
                            A11.put("wam_is_current_buffer_real_time", cls);
                        }
                        SharedPreferences A0C = C17880vN.A0C(r4.A01);
                        C18070vi.A0X(A0C);
                        C18100vl r3 = r4.A00;
                        SharedPreferences A0C2 = C17880vN.A0C(r3);
                        C18070vi.A0X(A0C2);
                        AnonymousClass2UQ.A00(A0C, A0C2, A11);
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("WamSharedPreference/populateKeysForMigrations added ");
                        A10.append(A11.size());
                        C17890vO.A1A(A10, " keys");
                        SharedPreferences A0C3 = C17880vN.A0C(r3);
                        C18070vi.A0X(A0C3);
                        C17880vN.A1C(A0C3.edit(), "wam_migrated_version", 2);
                    }
                }
            }
        } catch (Exception e) {
            Log.e(C17900vP.A0C("SharedPreferenceMigrationDailyCron/", AnonymousClass000.A10(), e), e);
            ((AnonymousClass190) this.A00.get()).A0G("shared_prefs_migration", e.getMessage(), false);
        }
    }

    public AnonymousClass302(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
