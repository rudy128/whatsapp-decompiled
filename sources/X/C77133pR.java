package X;

/* renamed from: X.3pR  reason: invalid class name and case insensitive filesystem */
public final class C77133pR extends AnonymousClass4FI {
    public final AnonymousClass4Y9 A00;

    public C77133pR(AnonymousClass4Y9 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77133pR) && C18070vi.A18(this.A00, ((C77133pR) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CancelState(input=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
