package X;

import android.content.SharedPreferences;

/* renamed from: X.3AD  reason: invalid class name */
public final class AnonymousClass3AD implements AnonymousClass3LM {
    public final AnonymousClass18O A00;

    public AnonymousClass3AD(AnonymousClass18O r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BlV() {
        AnonymousClass18O r0 = this.A00;
        synchronized (AnonymousClass18O.class) {
            SharedPreferences.Editor edit = r0.A00.edit();
            C17880vN.A1F(edit, "server_props:one_time_unlocked", true);
            C17880vN.A1B(edit, "server_props:config_hash");
        }
    }
}
