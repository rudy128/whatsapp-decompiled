package X;

import android.view.View;

/* renamed from: X.5wh  reason: invalid class name and case insensitive filesystem */
public final class C116245wh extends C87294Va {
    public long A00 = -1;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass1VE A03;
    public final AnonymousClass1VF A04;
    public final AnonymousClass1V9 A05;
    public final AnonymousClass6RC A06 = AnonymousClass6RC.ADD_PARTICIPANTS;
    public final AnonymousClass11P A07;
    public final C18030ve A08;
    public final Integer A09 = AnonymousClass00R.A0C;
    public final boolean A0A;

    public void A09() {
        this.A01 = true;
    }

    public boolean A0B(View view, AnonymousClass72C r4) {
        View findViewById;
        C18070vi.A0d(r4, 0);
        if (super.A0B(view, r4) || !r4.A03 || !r4.A01 || view == null || (findViewById = view.findViewById(2131433430)) == null || view.getVisibility() != 0 || findViewById.getVisibility() != 0 || !findViewById.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean A0C(View view, AnonymousClass72C r5) {
        C18070vi.A0d(r5, 0);
        if (super.A0C(view, r5) && r5.A03 && r5.A01 && (C17890vO.A00(AnonymousClass1VE.A00(this.A03), "add_participant_tooltip_show_count") == 0 || (this.A0A && !this.A02))) {
            if (!C18020vd.A05(C18040vf.A02, this.A08, 10274) || !this.A04.A02(AnonymousClass1VG.TOOLTIP_ADD_PARTICIPANT)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public long A04() {
        return C108995ce.A06(this.A01 ? 1 : 0);
    }

    public C116245wh(AnonymousClass1VE r3, AnonymousClass1VF r4, AnonymousClass1V9 r5, AnonymousClass11P r6, C18030ve r7, boolean z) {
        this.A07 = r6;
        this.A08 = r7;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A0A = z;
    }

    public float A00() {
        return 32.0f;
    }

    public int A01() {
        return 2131433430;
    }

    public int A02() {
        return 2131886500;
    }

    public long A03() {
        return 10000;
    }

    public AnonymousClass6RC A05() {
        return this.A06;
    }

    public Integer A07() {
        return this.A09;
    }

    public void A08() {
        int i = 71;
        if (System.currentTimeMillis() - this.A00 > 10000) {
            i = 68;
        }
        this.A05.A00(i, 16);
    }

    public void A0A() {
        long currentTimeMillis = System.currentTimeMillis();
        this.A00 = currentTimeMillis;
        AnonymousClass1VE r0 = this.A03;
        C17880vN.A1D(AnonymousClass3MZ.A08(r0).putInt("add_participant_tooltip_show_count", C17890vO.A00(AnonymousClass1VE.A00(r0), "add_participant_tooltip_show_count") + 1), "tooltip_last_shown_ms", currentTimeMillis);
        this.A04.A01(AnonymousClass1VG.TOOLTIP_ADD_PARTICIPANT);
        this.A05.A00(65, 16);
        this.A02 = true;
    }
}
