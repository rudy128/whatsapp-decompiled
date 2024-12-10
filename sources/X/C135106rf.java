package X;

/* renamed from: X.6rf  reason: invalid class name and case insensitive filesystem */
public final class C135106rf {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135106rf) {
                C135106rf r5 = (C135106rf) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + C17900vP.A00(this.A00);
    }

    public C135106rf(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VersionRange(minVersion=");
        A10.append(this.A01);
        A10.append(", maxVersion=");
        return C17900vP.A0B(this.A00, A10);
    }
}
