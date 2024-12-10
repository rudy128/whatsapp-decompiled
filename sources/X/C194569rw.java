package X;

/* renamed from: X.9rw  reason: invalid class name and case insensitive filesystem */
public final class C194569rw {
    public final long A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194569rw) {
                C194569rw r8 = (C194569rw) obj;
                if (!C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, C17890vO.A02(this.A01, C17880vN.A03(this.A02)));
    }

    public C194569rw(long j, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewInflationData(viewName=");
        A10.append(this.A02);
        A10.append(", parentId=");
        A10.append(this.A01);
        A10.append(", inflationTime=");
        return C17900vP.A0E(A10, this.A00);
    }
}
