package X;

import java.util.Set;

/* renamed from: X.2zH  reason: invalid class name and case insensitive filesystem */
public final class C67122zH implements C1605388w {
    public final AnonymousClass00H A00;
    public final Set A01;

    public C67122zH(AnonymousClass00H r2, Set set) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = set;
    }

    public boolean BLC(AnonymousClass1BI r3) {
        C18070vi.A0d(r3, 0);
        if (!((C38501rO) this.A00.get()).A07() || !this.A01.contains(r3)) {
            return false;
        }
        return true;
    }

    public Set BYj() {
        return this.A01;
    }
}
