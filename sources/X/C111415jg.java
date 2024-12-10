package X;

import java.util.List;

/* renamed from: X.5jg  reason: invalid class name and case insensitive filesystem */
public final class C111415jg extends C24490C6i {
    public final List A00;
    public final List A01;

    public C111415jg(List list, List list2) {
        C18070vi.A0d(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        return C18070vi.A18(this.A01.get(i), this.A00.get(i2));
    }

    public boolean A04(int i, int i2) {
        String str;
        String str2;
        C123266Tt r5 = (C123266Tt) this.A01.get(i);
        C123266Tt r4 = (C123266Tt) this.A00.get(i2);
        boolean z = r5 instanceof C121066Hp;
        if (z) {
            str = ((C121066Hp) r5).A01;
        } else {
            str = ((C121076Hq) r5).A03;
        }
        boolean z2 = r4 instanceof C121066Hp;
        if (z2) {
            str2 = ((C121066Hp) r4).A01;
        } else {
            str2 = ((C121076Hq) r4).A03;
        }
        if (!C18070vi.A18(str, str2)) {
            return false;
        }
        if ((!(r5 instanceof C121076Hq) || !(r4 instanceof C121076Hq)) && (!z || !z2)) {
            return false;
        }
        return true;
    }
}
