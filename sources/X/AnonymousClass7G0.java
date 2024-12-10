package X;

/* renamed from: X.7G0  reason: invalid class name */
public final class AnonymousClass7G0 implements AnonymousClass850 {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7G0) {
                AnonymousClass7G0 r8 = (AnonymousClass7G0) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, C17880vN.A03(this.A01));
    }

    public AnonymousClass7G0(String str, long j) {
        this.A01 = str;
        this.A00 = j;
    }

    public String toString() {
        return "Token mint Success";
    }
}
