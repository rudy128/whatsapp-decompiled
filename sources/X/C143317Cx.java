package X;

/* renamed from: X.7Cx  reason: invalid class name and case insensitive filesystem */
public final class C143317Cx implements AnonymousClass8B6 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C143317Cx) && C18070vi.A18(this.A00, ((C143317Cx) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C143317Cx(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HeaderShimmer(title=");
        return C17900vP.A0B(this.A00, A10);
    }
}
