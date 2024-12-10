package X;

import android.view.View;

/* renamed from: X.5wg  reason: invalid class name and case insensitive filesystem */
public final class C116235wg extends C87294Va {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass1VE A02;
    public final AnonymousClass6RC A03 = AnonymousClass6RC.SCREEN_SHARING;
    public final AnonymousClass11P A04;
    public final C18030ve A05;
    public final Integer A06 = AnonymousClass00R.A01;
    public final Integer A07 = AnonymousClass00R.A0Y;
    public final boolean A08;

    public void A09() {
        this.A00 = true;
    }

    public boolean A0B(View view, AnonymousClass72C r4) {
        C18070vi.A0d(r4, 0);
        if (super.A0B(view, r4) || !r4.A07 || !r4.A01) {
            return true;
        }
        return false;
    }

    public boolean A0C(View view, AnonymousClass72C r5) {
        C18070vi.A0d(r5, 0);
        if (super.A0C(view, r5) && r5.A07 && r5.A01 && (C17890vO.A00(AnonymousClass1VE.A00(this.A02), "ss_tooltip_show_count") == 0 || (this.A08 && !this.A01))) {
            if (!C18020vd.A05(C18040vf.A02, this.A05, 5341)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public long A04() {
        return C108995ce.A06(this.A00 ? 1 : 0);
    }

    public void A0A() {
        AnonymousClass1VE r0 = this.A02;
        C17880vN.A1D(AnonymousClass3MZ.A08(r0).putInt("ss_tooltip_show_count", C17890vO.A00(AnonymousClass1VE.A00(r0), "ss_tooltip_show_count") + 1), "tooltip_last_shown_ms", System.currentTimeMillis());
        this.A01 = true;
    }

    public C116235wg(AnonymousClass1VE r2, AnonymousClass11P r3, C18030ve r4, boolean z) {
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = r2;
        this.A08 = z;
    }

    public float A00() {
        return -18.0f;
    }

    public int A01() {
        return 2131434824;
    }

    public int A02() {
        return 2131895467;
    }

    public long A03() {
        return 10000;
    }

    public AnonymousClass6RC A05() {
        return this.A03;
    }

    public Integer A06() {
        return this.A06;
    }

    public Integer A07() {
        return this.A07;
    }
}
