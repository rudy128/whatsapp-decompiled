package X;

import android.content.SharedPreferences;

/* renamed from: X.1rn  reason: invalid class name and case insensitive filesystem */
public final class C38731rn {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C38741ro(this));

    public C38731rn(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public final void A00(boolean z) {
        ((SharedPreferences) this.A01.getValue()).edit().putBoolean("imagine_me_onboarding_complete", z).apply();
    }

    public final boolean A01() {
        return ((SharedPreferences) this.A01.getValue()).getBoolean("imagine_me_onboarding_complete", false);
    }
}
