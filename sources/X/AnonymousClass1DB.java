package X;

import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: X.1DB  reason: invalid class name */
public final class AnonymousClass1DB implements AnonymousClass191 {
    public final AnonymousClass11O A00;
    public final AnonymousClass1CM A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public AnonymousClass1DB(AnonymousClass11O r2, AnonymousClass1CM r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        this.A01 = r3;
        this.A04 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r6;
    }

    public void Blf() {
        SharedPreferences sharedPreferences = this.A00.A00;
        if (sharedPreferences.getBoolean("async_tasks_pending_for_version_change", false)) {
            for (C72303Lk Bld : (Set) this.A02.get()) {
                Bld.Bld();
            }
            sharedPreferences.edit().putBoolean("async_tasks_pending_for_version_change", false).apply();
            ((C19830z4) this.A04.get()).A1i("client_version_upgrade_timestamp");
        }
    }

    public void Blg() {
        if (this.A00.A00.getBoolean("async_tasks_pending_for_version_change", false)) {
            for (C72303Lk Blc : (Set) this.A02.get()) {
                Blc.Blc();
            }
        }
    }

    public void Ba9() {
    }
}
