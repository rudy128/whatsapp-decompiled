package X;

/* renamed from: X.8io  reason: invalid class name and case insensitive filesystem */
public final class C168408io extends AnonymousClass9M2 {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168408io) {
                C168408io r5 = (C168408io) obj;
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

    public C168408io(Object obj, int i) {
        this.A01 = obj;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(request=");
        A10.append(this.A01);
        A10.append(", errorCode=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
