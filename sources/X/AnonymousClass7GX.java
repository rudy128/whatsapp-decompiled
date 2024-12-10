package X;

/* renamed from: X.7GX  reason: invalid class name */
public class AnonymousClass7GX implements C1606789m {
    public final int A00;
    public final Object A01;

    public AnonymousClass7GX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BrA() {
        if (this.A00 != 0) {
            C31081ez.A02("WfsRefreshTokenIqHelper/sendRefreshTokenIq/refreshToken onDeliveryFailure");
        } else {
            ((C30391dr) this.A01).resumeWith(new AnonymousClass6EJ(C17880vN.A0f("onDeliveryFailure")));
        }
    }

    public void Bsw(Exception exc) {
        if (this.A00 != 0) {
            C31081ez.A02("WfsRefreshTokenIqHelper/sendRefreshTokenIq/refreshToken error");
            return;
        }
        C18070vi.A0d(exc, 0);
        ((C30391dr) this.A01).resumeWith(new AnonymousClass6EJ(exc));
    }

    public void C7I(AnonymousClass732 r5) {
        if (this.A00 != 0) {
            C31081ez.A02("WfsRefreshTokenIqHelper/sendRefreshTokenIq/refreshToken success");
            if (r5 != null) {
                C130766jy r3 = (C130766jy) this.A01;
                r3.A01.A08(r5);
                ((C34951lN) r3.A08.get()).A06(AnonymousClass000.A0h());
                r3.A04.A01();
                C35061la r2 = r3.A03;
                r2.notifyAllObservers(new AnonymousClass7KY(r2, 26));
                C146787Qp.A00(r3.A02, r3, 43);
            }
        }
    }
}
