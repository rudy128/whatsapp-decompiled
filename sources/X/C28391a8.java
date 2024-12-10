package X;

import android.content.SharedPreferences;

/* renamed from: X.1a8  reason: invalid class name and case insensitive filesystem */
public final class C28391a8 {
    public final AnonymousClass11S A00;
    public final C18030ve A01;
    public final C18010vc A02;
    public final C18100vl A03 = new C18110vm(new AnonymousClass1a9(this));
    public final C18600wl A04;

    public C28391a8(AnonymousClass11S r3, C18030ve r4, C18010vc r5, C18600wl r6) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A04 = r6;
    }

    public final void A00() {
        synchronized (this) {
            C18100vl r3 = this.A03;
            if (((SharedPreferences) r3.getValue()).getBoolean("ed_nux", true)) {
                ((SharedPreferences) r3.getValue()).edit().putBoolean("ed_nux", false).apply();
            }
        }
    }

    public final void A01() {
        synchronized (this) {
            C18100vl r3 = this.A03;
            if (((SharedPreferences) r3.getValue()).getBoolean("ed_nux_lists", true)) {
                ((SharedPreferences) r3.getValue()).edit().putBoolean("ed_nux_lists", false).apply();
            }
        }
    }

    public final boolean A04() {
        boolean z;
        synchronized (this) {
            z = !((SharedPreferences) this.A03.getValue()).getBoolean("ed_nux_lists", true);
        }
        return z;
    }

    public final boolean A05() {
        boolean z;
        synchronized (this) {
            z = !((SharedPreferences) this.A03.getValue()).getBoolean("ed_nux", true);
        }
        return z;
    }

    public final boolean A02() {
        return C18020vd.A05(C18040vf.A01, this.A01, 5171);
    }

    public final boolean A03() {
        if (!A02()) {
            return false;
        }
        C18030ve r3 = this.A01;
        C18040vf r2 = C18040vf.A01;
        if (!C18020vd.A05(r2, r3, 5172)) {
            return false;
        }
        AnonymousClass11S r1 = this.A00;
        if (!r1.A0N()) {
            return true;
        }
        if (!r1.A0N() || !C18020vd.A05(r2, r3, 8928) || !C18020vd.A05(r2, r3, 8929)) {
            return false;
        }
        return true;
    }
}
