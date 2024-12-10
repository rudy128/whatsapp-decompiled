package X;

import android.content.SharedPreferences;

/* renamed from: X.6oy  reason: invalid class name and case insensitive filesystem */
public final class C133556oy {
    public final C18010vc A00;
    public final C18100vl A01 = AnonymousClass7S4.A02(this, 1);

    public C133556oy(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(long j, boolean z) {
        SharedPreferences.Editor A0E = C108995ce.A0E(this.A01);
        A0E.putBoolean("pref_disclosure_tos_state", z);
        A0E.putLong("pref_disclosure_tos_timestamp", j);
        A0E.apply();
    }

    public final boolean A01() {
        return C17880vN.A1W(C18070vi.A03(this.A01), "pref_disclosure_tos_state");
    }
}
