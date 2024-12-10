package X;

/* renamed from: X.3ow  reason: invalid class name and case insensitive filesystem */
public final class C76983ow extends AnonymousClass4EI {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76983ow) {
                C76983ow r5 = (C76983ow) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + this.A00;
    }

    public C76983ow(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(failedCommunityDescription=");
        A10.append(this.A01);
        A10.append(", error=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
