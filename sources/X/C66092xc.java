package X;

import java.util.Random;

/* renamed from: X.2xc  reason: invalid class name and case insensitive filesystem */
public final class C66092xc implements AnonymousClass191 {
    public final C33451iq A00;
    public final AnonymousClass4SS A01;

    public /* synthetic */ void Blg() {
    }

    public void Blf() {
        C33451iq r3 = this.A00;
        boolean A05 = C18020vd.A05(C18040vf.A02, r3.A01, 366);
        if (A05 && !C17880vN.A1W(C17880vN.A0C(r3.A03.A02), "is_cleared")) {
            r3.A0A();
            C33451iq.A04(r3);
        }
        C17880vN.A1F(C17890vO.A0A(r3.A03.A02), "is_cleared", A05);
        AnonymousClass4SS r4 = this.A01;
        if (r4.A00 == null) {
            r4.A00 = C200710s.A00(r4.A05);
            ((C200710s) r4.A07.getValue()).A05(new C21448AkF(r4, 38), 800);
        }
        if (C18020vd.A05(C18040vf.A01, r4.A01, 1799)) {
            C33531iy r42 = r4.A04;
            C21448AkF akF = new C21448AkF(r42, 40);
            r42.A04.A05(akF, ((long) new Random().nextInt(400)) + 800);
        }
    }

    public C66092xc(C33451iq r1, AnonymousClass4SS r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Ba9() {
    }
}
