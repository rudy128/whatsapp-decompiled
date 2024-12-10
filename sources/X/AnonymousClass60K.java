package X;

/* renamed from: X.60K  reason: invalid class name */
public final class AnonymousClass60K extends AnonymousClass6TG {
    public final Exception A00;
    public final String A01;

    public AnonymousClass60K(String str, Exception exc) {
        C18070vi.A0d(str, 2);
        this.A00 = exc;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60K) {
                AnonymousClass60K r5 = (AnonymousClass60K) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, AnonymousClass001.A0k(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(exception=");
        A10.append(this.A00);
        A10.append(", prompt=");
        return C17900vP.A0B(this.A01, A10);
    }
}
