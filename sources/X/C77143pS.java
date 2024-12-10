package X;

/* renamed from: X.3pS  reason: invalid class name and case insensitive filesystem */
public final class C77143pS extends AnonymousClass4FI {
    public final AnonymousClass4Y9 A00;

    public C77143pS(AnonymousClass4Y9 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77143pS) && C18070vi.A18(this.A00, ((C77143pS) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConfirmationState(input=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
