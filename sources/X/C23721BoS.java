package X;

/* renamed from: X.BoS  reason: case insensitive filesystem */
public final class C23721BoS extends C4E {
    public final CO8 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23721BoS) && C18070vi.A18(this.A00, ((C23721BoS) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23721BoS(CO8 co8) {
        this.A00 = co8;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Response(response=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
