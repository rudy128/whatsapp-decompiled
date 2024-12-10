package X;

import java.util.List;

/* renamed from: X.8wC  reason: invalid class name and case insensitive filesystem */
public final class C174078wC extends C174358we {
    public final C22553BCk A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174078wC(C22553BCk bCk, List list, int i) {
        super(i);
        C18070vi.A0d(bCk, 3);
        this.A01 = list;
        this.A00 = bCk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj) || !super.equals(obj)) {
            return false;
        }
        return C18070vi.A18(this.A01, ((C174078wC) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
