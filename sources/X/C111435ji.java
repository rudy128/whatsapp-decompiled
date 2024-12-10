package X;

import java.util.List;

/* renamed from: X.5ji  reason: invalid class name and case insensitive filesystem */
public final class C111435ji extends C24490C6i {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        AnonymousClass6R8 r1;
        AnonymousClass6JD r12 = (AnonymousClass6JD) this.A01.get(i);
        AnonymousClass6JD r3 = (AnonymousClass6JD) this.A00.get(i2);
        if ((r12 instanceof AnonymousClass6JC) && (r3 instanceof AnonymousClass6JC)) {
            AnonymousClass73U r0 = AnonymousClass73U.A00;
            AnonymousClass6JC r13 = (AnonymousClass6JC) r12;
            AnonymousClass6JC r32 = (AnonymousClass6JC) r3;
            C18070vi.A0h(r13, r32);
            if (r0.A03(r13, r32)) {
                C134956rQ r02 = r13.A04;
                AnonymousClass6R8 r2 = null;
                if (r02 != null) {
                    r1 = r02.A01;
                } else {
                    r1 = null;
                }
                C134956rQ r03 = r32.A04;
                if (r03 != null) {
                    r2 = r03.A01;
                }
                if (r1 != r2) {
                    return false;
                }
                return true;
            }
            return false;
        } else if ((r12 instanceof AnonymousClass6J8) && (r3 instanceof AnonymousClass6J8)) {
            return AnonymousClass73U.A00.A03((AnonymousClass6J8) r12, (AnonymousClass6J8) r3);
        } else {
            if (r12 instanceof AnonymousClass6J9) {
                return r3 instanceof AnonymousClass6J9;
            }
            return C18070vi.A18(r12, r3);
        }
    }

    public boolean A04(int i, int i2) {
        AnonymousClass6JD r2 = (AnonymousClass6JD) C29431cG.A0f(this.A01, i);
        AnonymousClass6JD r1 = (AnonymousClass6JD) C29431cG.A0f(this.A00, i2);
        if (!(r2 instanceof AnonymousClass6J8) || !(r1 instanceof AnonymousClass6J8)) {
            return C18070vi.A18(r2, r1);
        }
        return AnonymousClass73U.A02((AnonymousClass6J8) r2, (AnonymousClass6J8) r1);
    }

    public C111435ji(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
