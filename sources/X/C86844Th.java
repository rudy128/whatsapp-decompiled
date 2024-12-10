package X;

/* renamed from: X.4Th  reason: invalid class name and case insensitive filesystem */
public final class C86844Th {
    public final int A00;
    public final AnonymousClass1EC A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86844Th) {
                C86844Th r5 = (C86844Th) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass001.A0k(this.A01);
    }

    public C86844Th(AnonymousClass1EC r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Results(unsentMessagesCount=");
        A10.append(this.A00);
        A10.append(", parentOfLastSubgroup=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
