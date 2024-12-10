package X;

/* renamed from: X.2Lz  reason: invalid class name and case insensitive filesystem */
public final class C48312Lz extends C692336k {
    public final long A00;
    public final A51 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48312Lz) {
                C48312Lz r8 = (C48312Lz) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C48312Lz(A51 a51, long j) {
        this.A01 = a51;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Comment(parentMessageKey=");
        A10.append(this.A01);
        A10.append(", parentMessageRowId=");
        return C17900vP.A0E(A10, this.A00);
    }
}
