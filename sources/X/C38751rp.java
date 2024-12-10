package X;

import android.content.SharedPreferences;

/* renamed from: X.1rp  reason: invalid class name and case insensitive filesystem */
public final class C38751rp {
    public final C38731rn A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public C38751rp(C38731rn r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r5, 4);
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r2;
        this.A01 = r5;
    }

    public final void A00(boolean z) {
        int i;
        C18100vl r3 = this.A00.A01;
        ((SharedPreferences) r3.getValue()).edit().putBoolean("meta_ai_fab_tool_tip_should_show_once", z).apply();
        ((SharedPreferences) r3.getValue()).edit().putString("meta_ai_fab_tool_tip_session_id", ((C189339iv) this.A01.get()).A00()).apply();
        if (!z) {
            i = 2;
        } else if (((SharedPreferences) r3.getValue()).getInt("meta_ai_fab_tool_tip_seen_count", -1) == -1) {
            i = 0;
        } else {
            return;
        }
        ((SharedPreferences) r3.getValue()).edit().putInt("meta_ai_fab_tool_tip_seen_count", i).apply();
    }

    public final boolean A01() {
        if (!((C25811Ps) this.A02.get()).A0B() || !((AnonymousClass1UD) this.A03.get()).A0F()) {
            return false;
        }
        return true;
    }
}
