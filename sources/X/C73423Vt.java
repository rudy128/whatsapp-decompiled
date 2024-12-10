package X;

import java.util.List;

/* renamed from: X.3Vt  reason: invalid class name and case insensitive filesystem */
public final class C73423Vt extends C24490C6i {
    public final List A00;
    public final List A01;

    public C73423Vt(List list, List list2) {
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
        return C18070vi.A18(((C85294Mv) this.A01.get(i)).A01, ((C85294Mv) this.A00.get(i2)).A01);
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass000.A1T(((C85294Mv) this.A01.get(i)).A00, ((C85294Mv) this.A00.get(i2)).A00);
    }
}
