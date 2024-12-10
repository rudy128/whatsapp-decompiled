package X;

/* renamed from: X.4hH  reason: invalid class name and case insensitive filesystem */
public final class C92424hH implements C108805cK {
    public final C107855aj A00;

    public C92424hH(C107855aj r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92424hH) && C18070vi.A18(this.A00, ((C92424hH) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Effect(effect=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
