package X;

import java.util.List;

/* renamed from: X.5jm  reason: invalid class name and case insensitive filesystem */
public final class C111475jm extends C24490C6i {
    public final List A00;
    public final List A01;
    public final boolean A02;

    public Object A02(int i, int i2) {
        if (i2 <= 3) {
            Object A0f = C29431cG.A0f(this.A00, i2);
            if (!(A0f instanceof AnonymousClass6JC) || A0f == null) {
                return null;
            }
            return A0f;
        }
        return null;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        return C1405071s.A00.A02((AnonymousClass6U0) this.A01.get(i), (AnonymousClass6U0) this.A00.get(i2), this.A02);
    }

    public boolean A04(int i, int i2) {
        return C1405071s.A00.A01((AnonymousClass6U0) this.A01.get(i), (AnonymousClass6U0) this.A00.get(i2));
    }

    public C111475jm(List list, List list2, boolean z) {
        this.A01 = list;
        this.A00 = list2;
        this.A02 = z;
    }
}
