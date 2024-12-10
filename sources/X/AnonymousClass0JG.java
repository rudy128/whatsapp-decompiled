package X;

/* renamed from: X.0JG  reason: invalid class name */
public final class AnonymousClass0JG {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0JG) && C18070vi.A18(this.A00, ((AnonymousClass0JG) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass0JG(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OpaqueKey(key=");
        A10.append(this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
