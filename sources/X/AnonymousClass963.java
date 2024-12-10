package X;

/* renamed from: X.963  reason: invalid class name */
public final class AnonymousClass963 extends AnonymousClass9MY {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass963) && C18070vi.A18(this.A00, ((AnonymousClass963) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass963(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactNotFound(upiNumber=");
        return C17900vP.A0B(this.A00, A10);
    }
}
