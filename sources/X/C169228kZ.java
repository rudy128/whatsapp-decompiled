package X;

/* renamed from: X.8kZ  reason: invalid class name and case insensitive filesystem */
public final class C169228kZ extends AnonymousClass9M5 {
    public final C188619hi A00;

    public C169228kZ(C188619hi r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C169228kZ) && C18070vi.A18(this.A00, ((C169228kZ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(content=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
