package X;

/* renamed from: X.3zu  reason: invalid class name and case insensitive filesystem */
public final class C81843zu extends AnonymousClass4EU {
    public final C59072li A00;

    public C81843zu(C59072li r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C81843zu) && C18070vi.A18(this.A00, ((C81843zu) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
