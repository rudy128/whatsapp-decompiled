package X;

import java.util.List;

/* renamed from: X.3Vp  reason: invalid class name */
public final class AnonymousClass3Vp extends C24490C6i {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C84904Lh r4 = (C84904Lh) this.A01.get(i);
        C84904Lh r3 = (C84904Lh) this.A00.get(i2);
        if ((r4 instanceof C80793y6) && (r3 instanceof C80793y6)) {
            C80793y6 r42 = (C80793y6) r4;
            C80793y6 r32 = (C80793y6) r3;
            if (!C18070vi.A18(r42.A01.A0v.A01, r32.A01.A0v.A01) || r42.A02 != r32.A02) {
                return false;
            }
            return true;
        } else if (!(r4 instanceof C80783y5) || !(r3 instanceof C80783y5)) {
            return false;
        } else {
            return C18070vi.A18(((C80783y5) r4).A00, ((C80783y5) r3).A00);
        }
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass3Ma.A1a(this.A01.get(i), this.A00, i2);
    }

    public AnonymousClass3Vp(List list, List list2) {
        C18070vi.A0j(list, list2);
        this.A01 = list;
        this.A00 = list2;
    }
}
