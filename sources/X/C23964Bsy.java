package X;

/* renamed from: X.Bsy  reason: case insensitive filesystem */
public final class C23964Bsy extends C4V {
    public final DST A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23964Bsy) && C18070vi.A18(this.A00, ((C23964Bsy) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23964Bsy(DST dst) {
        this.A00 = dst;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Array(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
