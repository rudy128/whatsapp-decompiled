package X;

import android.view.View;

/* renamed from: X.7Hs  reason: invalid class name and case insensitive filesystem */
public final class C144547Hs implements AnonymousClass87C {
    public AnonymousClass870 A00;
    public C133156oG A01;
    public AnonymousClass4NM A02;
    public C112375lN A03;
    public AnonymousClass7MX A04;
    public final C131146ka A05;
    public final C18030ve A06;
    public final AnonymousClass736 A07;
    public final C140126zz A08;
    public final C129036h9 A09;
    public final C38471rL A0A = new C825048f(this, 42);
    public final AnonymousClass10I A0B;

    public C144547Hs(C131146ka r3, C18030ve r4, AnonymousClass736 r5, C140126zz r6, C129036h9 r7, AnonymousClass10I r8) {
        C18070vi.A0d(r3, 6);
        this.A0B = r8;
        this.A06 = r4;
        this.A07 = r5;
        this.A09 = r7;
        this.A08 = r6;
        this.A05 = r3;
    }

    public void BvG(AnonymousClass77J r2, boolean z) {
        C107435Zr r0;
        C18070vi.A0d(r2, 0);
        AnonymousClass870 r02 = this.A00;
        if (r02 != null) {
            r02.CFm();
        }
        AnonymousClass4NM r03 = this.A02;
        if (r03 != null && (r0 = r03.A02.A00) != null) {
            r0.BvF(r2);
        }
    }

    public final void A00() {
        C133156oG r0 = this.A01;
        if (r0 != null) {
            View view = r0.A01;
            if (view != null && view.getVisibility() == 0) {
                C112375lN r1 = this.A03;
                if (r1 == null) {
                    r1 = new AnonymousClass66O(this);
                    this.A03 = r1;
                }
                C133156oG r02 = this.A01;
                if (r02 != null) {
                    r02.A00(r1);
                    C112375lN r12 = this.A03;
                    if (r12 != null) {
                        r12.A0U(this.A08.A05());
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("gifKeyboardView");
        throw null;
    }
}
