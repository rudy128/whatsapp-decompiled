package X;

/* renamed from: X.97B  reason: invalid class name */
public final class AnonymousClass97B extends C180349Me {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass97B) && C18070vi.A18(this.A00, ((AnonymousClass97B) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass97B(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(fileUri=");
        return C17900vP.A0B(this.A00, A10);
    }
}
