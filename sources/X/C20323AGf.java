package X;

/* renamed from: X.AGf  reason: case insensitive filesystem */
public class C20323AGf implements AnonymousClass1GC {
    public final C21132Af0 A00 = new C21132Af0();
    public final AnonymousClass1QS A01;
    public final AnonymousClass1QL A02;
    public final AnonymousClass1QD A03;
    public final AnonymousClass10I A04;

    public C20323AGf(AnonymousClass1QL r2, AnonymousClass1QD r3, AnonymousClass1QS r4, AnonymousClass10I r5) {
        this.A04 = r5;
        this.A01 = r4;
        this.A03 = r3;
        this.A02 = r2;
    }

    public void C6U(C27581Wq r5, AnonymousClass1F9 r6) {
        C21132Af0 af0;
        int ordinal = r5.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            if (!this.A02.A0D()) {
                af0 = this.A00;
            } else {
                AnonymousClass1QD r2 = this.A03;
                if (r2.A03().contains("payment_is_first_send")) {
                    boolean A1W = C17880vN.A1W(r2.A03(), "payment_is_first_send");
                    if (Boolean.valueOf(A1W) != null && !A1W) {
                        af0 = this.A00;
                        z = false;
                    }
                }
                C17890vO.A0v(this.A04, this, 25);
                C21132Af0 af02 = this.A00;
                AnonymousClass1QD r22 = this.A03;
                r22.getClass();
                af02.A09(new C21111Aef(r22, 9));
            }
            af0.A0B(Boolean.valueOf(z));
            C21132Af0 af022 = this.A00;
            AnonymousClass1QD r222 = this.A03;
            r222.getClass();
            af022.A09(new C21111Aef(r222, 9));
        } else if (ordinal == 5) {
            this.A00.A0D();
        }
    }
}
