package X;

import java.util.List;

/* renamed from: X.5jc  reason: invalid class name and case insensitive filesystem */
public final class C111375jc extends C24490C6i {
    public final List A00;
    public final List A01;

    public boolean A03(int i, int i2) {
        return true;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A04(int i, int i2) {
        return C18070vi.A18(C108975cc.A09(this.A01, i), C108975cc.A09(this.A00, i2));
    }

    public C111375jc(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
