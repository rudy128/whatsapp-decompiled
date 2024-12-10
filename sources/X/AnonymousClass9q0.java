package X;

/* renamed from: X.9q0  reason: invalid class name */
public final class AnonymousClass9q0 {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9q0) {
                AnonymousClass9q0 r5 = (AnonymousClass9q0) obj;
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

    public AnonymousClass9q0(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArCapabilityMinVersionModel(capabilityName=");
        A10.append(this.A01);
        A10.append(", minVersion=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
