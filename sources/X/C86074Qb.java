package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.4Qb  reason: invalid class name and case insensitive filesystem */
public final class C86074Qb {
    public final C190859ld A00;
    public final C23401Fx A01;
    public final C23381Fv A02;
    public final AnonymousClass1GC A03;

    public final void A00() {
        this.A02.A06(this.A03);
        C190859ld r1 = this.A00;
        r1.A00 = true;
        r1.A00();
    }

    public C86074Qb(C190859ld r4, C23401Fx r5, C23381Fv r6, AnonymousClass1OB r7) {
        C18070vi.A0o(r6, r5, r4);
        this.A02 = r6;
        this.A01 = r5;
        this.A00 = r4;
        C91434fg r2 = new C91434fg(this, r7, 2);
        this.A03 = r2;
        if (((C23391Fw) r6).A02 == C23401Fx.DESTROYED) {
            r7.BEM((CancellationException) null);
            A00();
            return;
        }
        r6.A05(r2);
    }
}
