package X;

/* renamed from: X.0Jq  reason: invalid class name */
public final class AnonymousClass0Jq {
    public final AnonymousClass0OV A00;
    public final AnonymousClass0OV A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0Jq) {
                AnonymousClass0Jq r5 = (AnonymousClass0Jq) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0N = AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01));
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return A0N + i;
    }

    public AnonymousClass0Jq(AnonymousClass0OV r1, AnonymousClass0OV r2, boolean z) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Selection(start=");
        A10.append(this.A01);
        A10.append(", end=");
        A10.append(this.A00);
        A10.append(", handlesCrossed=");
        A10.append(this.A02);
        return AnonymousClass001.A1J(A10);
    }
}
