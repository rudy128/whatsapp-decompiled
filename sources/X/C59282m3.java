package X;

/* renamed from: X.2m3  reason: invalid class name and case insensitive filesystem */
public final class C59282m3 {
    public final int A00;
    public final C193149pc A01;
    public final C193149pc A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59282m3) {
                C59282m3 r5 = (C59282m3) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01)) + this.A00;
    }

    public C59282m3(C193149pc r1, C193149pc r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PasswordData(hash=");
        A10.append(this.A01);
        A10.append(", salt=");
        A10.append(this.A02);
        A10.append(", iterationCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
