package X;

/* renamed from: X.6rd  reason: invalid class name and case insensitive filesystem */
public final class C135086rd {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135086rd) {
                C135086rd r5 = (C135086rd) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A01) * 31) + this.A00;
    }

    public C135086rd(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EligibilityCheckPayload(uniqueId=");
        A10.append(this.A01);
        A10.append(", expTimeSeconds=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
