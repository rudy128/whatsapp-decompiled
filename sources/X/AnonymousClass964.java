package X;

/* renamed from: X.964  reason: invalid class name */
public final class AnonymousClass964 extends AnonymousClass9MY {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass964) && C18070vi.A18(this.A00, ((AnonymousClass964) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass964(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loading(upiNumber=");
        return C17900vP.A0B(this.A00, A10);
    }
}
