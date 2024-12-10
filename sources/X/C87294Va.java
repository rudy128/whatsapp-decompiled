package X;

import android.view.View;

/* renamed from: X.4Va  reason: invalid class name and case insensitive filesystem */
public abstract class C87294Va {
    public final Integer A00 = AnonymousClass00R.A00;

    public long A04() {
        if (AnonymousClass1VE.A00(((C76603ne) this).A00).getLong("vc_mini_player_wave_all_education_last_seen", 0) == 0) {
            return 3000;
        }
        return 15000;
    }

    public AnonymousClass6RC A05() {
        return ((C76603ne) this).A01;
    }

    public Integer A07() {
        return ((C76603ne) this).A03;
    }

    public void A08() {
    }

    public void A09() {
    }

    public void A0A() {
        C76603ne r0 = (C76603ne) this;
        AnonymousClass1VE r1 = r0.A00;
        C17880vN.A1D(AnonymousClass3MZ.A08(r1), "vc_mini_player_wave_all_education_last_seen", AnonymousClass11P.A01(r0.A02));
    }

    public boolean A0B(View view, AnonymousClass72C r4) {
        C18070vi.A0d(r4, 0);
        if (r4.A06 || r4.A00 != 0) {
            return true;
        }
        return false;
    }

    public boolean A0C(View view, AnonymousClass72C r4) {
        C18070vi.A0d(r4, 0);
        if (r4.A06 || r4.A00 != 0) {
            return false;
        }
        return true;
    }

    public float A00() {
        return -20.0f;
    }

    public long A03() {
        return C20113A7w.A0L;
    }

    public Integer A06() {
        return this.A00;
    }

    public int A01() {
        return 2131437018;
    }

    public int A02() {
        return 2131897733;
    }
}
