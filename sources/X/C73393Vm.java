package X;

import java.util.List;

/* renamed from: X.3Vm  reason: invalid class name and case insensitive filesystem */
public final class C73393Vm extends C24490C6i {
    public final List A00;
    public final List A01;

    public C73393Vm(List list, List list2) {
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
        return AnonymousClass3Ma.A1a(this.A01.get(i), this.A00, i2);
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass000.A1Z(this.A01.get(i), this.A00.get(i2));
    }
}
