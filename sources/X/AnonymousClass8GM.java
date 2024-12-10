package X;

import java.util.List;

/* renamed from: X.8GM  reason: invalid class name */
public class AnonymousClass8GM extends AnonymousClass1J2 {
    public final C22801Dg A00;
    public final C41731wy A01;
    public final C41731wy A02 = new C41731wy(false);
    public final C41731wy A03 = new C41731wy(false);
    public final C187249fV A04;
    public final AnonymousClass1EC A05;

    public static AnonymousClass8GM A00(AnonymousClass1FD r2, C51082Wx r3, AnonymousClass1EC r4) {
        return (AnonymousClass8GM) AnonymousClass8BR.A0C(new AH2(r4, r3, 1), r2).A00(AnonymousClass8GM.class);
    }

    public static void A03(AnonymousClass8GM r2, int i) {
        C41731wy r0;
        AnonymousClass3MY.A1M(r2.A03, false);
        int i2 = 2;
        if (i == 0) {
            r0 = r2.A01;
        } else if (i == 1) {
            r0 = r2.A01;
            i2 = 3;
        } else if (i == 2) {
            r0 = r2.A01;
            i2 = 4;
        } else {
            return;
        }
        AnonymousClass3MX.A1K(r0, i2);
    }

    public void A0T() {
        AnonymousClass3MX.A1K(this.A01, 1);
    }

    public void A0U(boolean z) {
        C72463Mc.A1B(this.A03);
        C187249fV r8 = this.A04;
        AnonymousClass1EC r4 = this.A05;
        C98754rf r10 = new C98754rf(this, 7);
        AGT agt = new AGT(this, 1);
        AGT agt2 = new AGT(this, 2);
        AGT agt3 = new AGT(this, 2);
        C18070vi.A0d(r4, 1);
        AnonymousClass00H r3 = r8.A03;
        String A0T = C17890vO.A0T(r3);
        AnonymousClass9F6 r9 = new AnonymousClass9F6(new C178759Ei((List) C18460wS.A00, C18070vi.A0M(new C178709Ed(new C178769Ej(r4, 0)))), A0T, 28);
        C17880vN.A0U(r3).A0I(new C20984Acc(agt2, agt, agt3, r8, r9, r10, z), (C29621ca) r9.A00, A0T, 16, C20113A7w.A0L);
    }

    public AnonymousClass8GM(C187249fV r5, AnonymousClass1EC r6) {
        C41731wy r3 = new C41731wy(0);
        this.A01 = r3;
        C22801Dg A0R = C108945cZ.A0R();
        this.A00 = A0R;
        this.A04 = r5;
        this.A05 = r6;
        A0R.A0H(r3, new C20335AGr(A0R, 40));
    }
}
