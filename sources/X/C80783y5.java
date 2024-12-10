package X;

/* renamed from: X.3y5  reason: invalid class name and case insensitive filesystem */
public final class C80783y5 extends C84904Lh {
    public String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C80783y5) && C18070vi.A18(this.A00, ((C80783y5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HeaderItem(text=");
        return C17900vP.A0B(this.A00, A10);
    }
}
