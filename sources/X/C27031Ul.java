package X;

import android.content.SharedPreferences;

/* renamed from: X.1Ul  reason: invalid class name and case insensitive filesystem */
public final class C27031Ul {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C27041Um(this));

    public C27031Ul(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public final void A00(AnonymousClass6RP r5) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("pref_has_dismissed_squid_upsell_");
        sb.append(r5);
        edit.putBoolean(sb.toString(), true).apply();
    }

    public final boolean A01() {
        return ((SharedPreferences) this.A01.getValue()).getBoolean("pref_key_coin_flip_opt_in", false);
    }
}
