package X;

/* renamed from: X.8oN  reason: invalid class name */
public final class AnonymousClass8oN extends AnonymousClass9ME {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8oN) && C18070vi.A18(this.A00, ((AnonymousClass8oN) obj).A00));
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public AnonymousClass8oN(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerificationError(message=");
        return C17900vP.A0B(this.A00, A10);
    }
}
