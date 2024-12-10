package X;

import java.util.List;

/* renamed from: X.3Vs  reason: invalid class name and case insensitive filesystem */
public final class C73413Vs extends C24490C6i {
    public final List A00;
    public final List A01;

    public C73413Vs(List list, List list2) {
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
        C86874Tk r3 = (C86874Tk) this.A01.get(i);
        C86874Tk r2 = (C86874Tk) this.A00.get(i2);
        if (r3.A00 != r2.A00 || !C18070vi.A18(r3.A01, r2.A01)) {
            return false;
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass3Ma.A1a(this.A01.get(i), this.A00, i2);
    }
}
