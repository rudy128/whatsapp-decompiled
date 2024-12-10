package X;

/* renamed from: X.99T  reason: invalid class name */
public final class AnonymousClass99T extends C180389Mi {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass99T) && C18070vi.A18(this.A00, ((AnonymousClass99T) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass99T(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PasskeyVerificationResultReceived(encodedJson=");
        return C17900vP.A0B(this.A00, A10);
    }
}
