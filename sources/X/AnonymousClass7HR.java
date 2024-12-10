package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7HR  reason: invalid class name */
public final class AnonymousClass7HR implements AnonymousClass8A9 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public C22821Di BnW() {
        return new AnonymousClass7S6(this, 2);
    }

    public boolean BED() {
        if (((C133806pW) this.A04.get()).A00() || !((AnonymousClass1DC) this.A05.get()).BcY()) {
            return false;
        }
        return true;
    }

    public List BS7() {
        if (!((C133806pW) this.A04.get()).A00()) {
            return C18460wS.A00;
        }
        ArrayList A13 = AnonymousClass000.A13();
        if (((AnonymousClass1DC) this.A05.get()).BcY()) {
            A13.add(new C135256ru(new AnonymousClass7S6(this, 3), 2131232194, 2131890623));
        }
        A13.add(new C135256ru(new AnonymousClass7S6(this, 4), 2131232384, 2131890627));
        return A13;
    }

    public AnonymousClass7HR(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A00 = r2;
        this.A05 = r3;
        this.A04 = r4;
        this.A01 = r5;
        this.A03 = r6;
        this.A02 = r7;
    }

    public Integer BaU() {
        return 2131896422;
    }
}
