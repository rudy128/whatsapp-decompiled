package X;

import android.view.View;

/* renamed from: X.1f7  reason: invalid class name and case insensitive filesystem */
public final class C31161f7 {
    public C441822l A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass195 A06;
    public final C31131f4 A07;
    public final C31171f8 A08;

    public C31161f7(AnonymousClass195 r2, C31131f4 r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A07 = r3;
        this.A06 = r2;
        this.A08 = new C31171f8(r3);
    }

    public final void A00() {
        this.A04 = false;
        this.A03 = false;
        this.A05 = false;
        this.A02 = false;
    }

    public final void A01(View view) {
        C18070vi.A0d(view, 0);
        if (C31181f9.A00(view)) {
            this.A05 = true;
            this.A04 = true;
            this.A03 = true;
            return;
        }
        this.A05 = false;
        this.A04 = false;
        this.A03 = false;
    }

    public final void A02(AnonymousClass1BI r2) {
        boolean z;
        C441822l A012;
        AnonymousClass1BI r0;
        if (r2 == null || (A012 = this.A07.A01()) == null || (r0 = A012.A0v.A00) == null) {
            z = false;
        } else {
            z = r2.equals(r0);
        }
        this.A02 = z;
    }
}
