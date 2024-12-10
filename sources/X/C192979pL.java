package X;

/* renamed from: X.9pL  reason: invalid class name and case insensitive filesystem */
public final class C192979pL {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C192979pL) && C18070vi.A18(this.A00, ((C192979pL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C192979pL(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Image(uri=");
        return C17900vP.A0B(this.A00, A10);
    }
}
