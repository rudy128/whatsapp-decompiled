package X;

import java.util.Set;

/* renamed from: X.2zI  reason: invalid class name and case insensitive filesystem */
public final class C67132zI implements C1605388w {
    public final AnonymousClass1CJ A00;
    public final C42221xp A01;
    public final C18030ve A02;

    public boolean BLC(AnonymousClass1BI r5) {
        C18070vi.A0d(r5, 0);
        if (C18020vd.A05(C18040vf.A02, this.A02, 1608)) {
            AnonymousClass1CJ r1 = this.A00;
            if (r1.A03(r5) == 0 || r1.A0Q(r5) || r1.A0S(r5)) {
                return false;
            }
        } else if (this.A00.A03(r5) == 0) {
            return false;
        }
        return true;
    }

    public C67132zI(AnonymousClass1CJ r1, C42221xp r2, C18030ve r3) {
        C18070vi.A0k(r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* synthetic */ Set BYj() {
        return C25511Om.A00;
    }
}
