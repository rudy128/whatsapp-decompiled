package X;

/* renamed from: X.8iv  reason: invalid class name and case insensitive filesystem */
public final class C168478iv extends AnonymousClass9M3 {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C168478iv) && C18070vi.A18(this.A00, ((C168478iv) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C168478iv(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(response=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
