package X;

import java.io.IOException;
import java.net.UnknownHostException;

/* renamed from: X.1fJ  reason: invalid class name and case insensitive filesystem */
public final class C31281fJ extends AnonymousClass10T {
    public final C200710s A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31281fJ(AnonymousClass10I r3, AnonymousClass00H r4) {
        super(r4, false);
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = new C200710s(r3, false);
    }

    public final void A0B(C62652rk r8, IOException iOException, int i) {
        this.A00.execute(new C21365Aiu(this, iOException, r8, i, 43));
    }

    public final void A0C(C62652rk r8, Exception exc, int i) {
        this.A00.execute(new C21365Aiu(this, exc, r8, i, 42));
    }

    public final void A0D(C62652rk r8, Exception exc, int i) {
        this.A00.execute(new C21365Aiu(this, exc, r8, i, 44));
    }

    public final void A00() {
        this.A00.execute(new C70583Br(this, 39));
    }

    public final void A01(int i) {
        this.A00.execute(new AnonymousClass7RM((Object) this, i, 19));
    }

    public final void A02(C62652rk r4) {
        this.A00.execute(new C70643By(this, r4, 23));
    }

    public final void A03(C62652rk r4) {
        this.A00.execute(new C70643By(this, r4, 21));
    }

    public final void A04(C62652rk r4) {
        this.A00.execute(new C70643By(this, r4, 26));
    }

    public final void A05(C62652rk r4) {
        this.A00.execute(new C70643By(this, r4, 22));
    }

    public final void A06(C62652rk r4) {
        this.A00.execute(new C70643By(this, r4, 25));
    }

    public final void A07(C62652rk r4) {
        this.A00.execute(new C70643By(this, r4, 27));
    }

    public final void A08(C62652rk r4) {
        this.A00.execute(new C70643By(this, r4, 20));
    }

    public final void A09(C62652rk r4) {
        this.A00.execute(new C70643By(this, r4, 24));
    }

    public final void A0A(C62652rk r3, int i, boolean z, boolean z2) {
        this.A00.execute(new C21436Ak3(this, r3, i, z, z2));
    }

    public final void A0E(UnknownHostException unknownHostException, int i) {
        this.A00.execute(new C70823Cq(this, unknownHostException, i));
    }
}
