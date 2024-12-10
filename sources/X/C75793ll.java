package X;

/* renamed from: X.3ll  reason: invalid class name and case insensitive filesystem */
public final class C75793ll extends AnonymousClass4E6 {
    public final C107855aj A00;

    public C75793ll(C107855aj r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75793ll) && C18070vi.A18(this.A00, ((C75793ll) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(arEffect=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
