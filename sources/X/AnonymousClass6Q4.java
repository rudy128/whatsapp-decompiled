package X;

/* renamed from: X.6Q4  reason: invalid class name */
public final class AnonymousClass6Q4 extends AnonymousClass6U9 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6Q4) && C18070vi.A18(this.A00, ((AnonymousClass6Q4) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6Q4(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Started(url=");
        return C17900vP.A0B(this.A00, A10);
    }
}
