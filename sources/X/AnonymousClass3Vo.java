package X;

import java.util.List;

/* renamed from: X.3Vo  reason: invalid class name */
public final class AnonymousClass3Vo extends C24490C6i {
    public final List A00;
    public final List A01;

    public AnonymousClass3Vo(List list, List list2) {
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
        AnonymousClass4TH r3 = (AnonymousClass4TH) this.A01.get(i);
        AnonymousClass4TH r2 = (AnonymousClass4TH) this.A00.get(i2);
        if (r3.A00 != r2.A00 || !C18070vi.A18(r3.A01, r2.A01)) {
            return false;
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass3Ma.A1a(this.A01.get(i), this.A00, i2);
    }
}
