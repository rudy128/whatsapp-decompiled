package X;

import android.content.SharedPreferences;

/* renamed from: X.3AF  reason: invalid class name */
public final class AnonymousClass3AF implements AnonymousClass3LM {
    public final AnonymousClass19F A00;

    public AnonymousClass3AF(AnonymousClass19F r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BlV() {
        AnonymousClass19F r2 = this.A00;
        synchronized (r2) {
            SharedPreferences.Editor edit = r2.A00.edit();
            edit.remove("ab_props:sys:config_hash");
            edit.remove("ab_props:sys:last_refresh_time");
            edit.apply();
        }
    }
}
