package X;

/* renamed from: X.7Jn  reason: invalid class name and case insensitive filesystem */
public final class C145007Jn implements AnonymousClass85T {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C145007Jn) && C18070vi.A18(this.A00, ((C145007Jn) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C145007Jn(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
