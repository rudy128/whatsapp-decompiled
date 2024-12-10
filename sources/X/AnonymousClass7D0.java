package X;

/* renamed from: X.7D0  reason: invalid class name */
public final class AnonymousClass7D0 implements C1594184l {
    public final C134506qh A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7D0) {
                AnonymousClass7D0 r5 = (AnonymousClass7D0) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public AnonymousClass7D0(C134506qh r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(result=");
        A10.append(this.A00);
        A10.append(", hasNextPage=");
        return C17900vP.A0F(A10, this.A01);
    }
}
