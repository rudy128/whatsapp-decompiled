package X;

import java.util.List;

/* renamed from: X.5jh  reason: invalid class name and case insensitive filesystem */
public final class C111425jh extends C24490C6i {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        AnonymousClass6JD r3 = (AnonymousClass6JD) this.A01.get(i);
        AnonymousClass6JD r2 = (AnonymousClass6JD) this.A00.get(i2);
        if (!(r3 instanceof AnonymousClass6J8) || !(r2 instanceof AnonymousClass6J8)) {
            return false;
        }
        return AnonymousClass73U.A00.A04((AnonymousClass6J8) r3, (AnonymousClass6J8) r2, false);
    }

    public boolean A04(int i, int i2) {
        AnonymousClass6JD r2 = (AnonymousClass6JD) this.A01.get(i);
        AnonymousClass6JD r1 = (AnonymousClass6JD) this.A00.get(i2);
        if (!(r2 instanceof AnonymousClass6J8) || !(r1 instanceof AnonymousClass6J8)) {
            return C18070vi.A18(r2, r1);
        }
        return AnonymousClass73U.A02((AnonymousClass6J8) r2, (AnonymousClass6J8) r1);
    }

    public C111425jh(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
