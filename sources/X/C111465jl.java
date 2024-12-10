package X;

import java.util.List;

/* renamed from: X.5jl  reason: invalid class name and case insensitive filesystem */
public final class C111465jl extends C24490C6i {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C135906sx r2 = (C135906sx) this.A01.get(i);
        C135906sx r3 = (C135906sx) this.A00.get(i2);
        if (C18070vi.A18(r2.A03.A0F, r3.A03.A0F) && r2.A00 == r3.A00 && r2.A01 == r3.A01 && r2.A02 == r3.A02) {
            return true;
        }
        return false;
    }

    public boolean A04(int i, int i2) {
        return C18070vi.A18(((C135906sx) this.A01.get(i)).A03.A0F, ((C135906sx) this.A00.get(i2)).A03.A0F);
    }

    public C111465jl(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public Object A02(int i, int i2) {
        return AnonymousClass000.A0i();
    }
}
