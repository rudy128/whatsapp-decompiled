package X;

import android.content.SharedPreferences;

/* renamed from: X.6Uj  reason: invalid class name and case insensitive filesystem */
public abstract class C123416Uj {
    public void A01() {
    }

    public void A02() {
    }

    public void A03() {
        if (this instanceof AnonymousClass6QF) {
            AnonymousClass716 r2 = (AnonymousClass716) ((AnonymousClass6QF) this).A02.get();
            C17880vN.A1B(AnonymousClass716.A00(r2).edit(), "pref_xfamily_audience_tooltip");
            C17880vN.A1B(AnonymousClass716.A00(r2).edit(), "pref_xfamily_sharing_to_fb_tooltip");
            C17880vN.A1B(AnonymousClass716.A00(r2).edit(), "pref_xfamily_audience_nux_dialog");
            C17880vN.A1B(AnonymousClass716.A00(r2).edit(), "pref_debug_session_id");
        } else if (this instanceof AnonymousClass6QE) {
            SharedPreferences A0C = C17880vN.A0C(((AnonymousClass6QE) this).A01);
            C18070vi.A0X(A0C);
            SharedPreferences.Editor edit = A0C.edit();
            edit.clear();
            edit.apply();
        } else {
            ((AnonymousClass6QD) this).A00.A27();
        }
    }
}
