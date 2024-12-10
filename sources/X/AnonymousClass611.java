package X;

/* renamed from: X.611  reason: invalid class name */
public final class AnonymousClass611 extends AnonymousClass6UU {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass611) && C18070vi.A18(this.A00, ((AnonymousClass611) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass611(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LoadingSection(id=");
        return C17900vP.A0B(this.A00, A10);
    }
}
