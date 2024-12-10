package X;

/* renamed from: X.6FG  reason: invalid class name */
public final class AnonymousClass6FG extends C39611tM {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6FG) {
                AnonymousClass6FG r5 = (AnonymousClass6FG) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + this.A00;
    }

    public AnonymousClass6FG(Object obj, int i) {
        super(obj, i);
        this.A01 = obj;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessSearchItem(value=");
        A10.append(this.A01);
        A10.append(", viewType=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
