package X;

/* renamed from: X.60G  reason: invalid class name */
public final class AnonymousClass60G extends AnonymousClass6TF {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60G) {
                AnonymousClass60G r5 = (AnonymousClass60G) obj;
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

    public AnonymousClass60G(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Header(prompt=");
        A10.append(this.A01);
        A10.append(", batchId=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
