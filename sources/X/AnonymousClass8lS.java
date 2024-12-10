package X;

import java.util.List;

/* renamed from: X.8lS  reason: invalid class name */
public final class AnonymousClass8lS extends AnonymousClass9XA {
    public boolean A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8lS(List list, boolean z) {
        super(true);
        C18070vi.A0d(list, 1);
        this.A01 = list;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8lS) {
                AnonymousClass8lS r5 = (AnonymousClass8lS) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A01), this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FetchCategoriesSuccess(categories=");
        A10.append(this.A01);
        A10.append(", cached=");
        return C17900vP.A0F(A10, this.A00);
    }
}
