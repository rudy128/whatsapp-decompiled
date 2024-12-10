package X;

/* renamed from: X.3pT  reason: invalid class name and case insensitive filesystem */
public final class C77153pT extends AnonymousClass4FI {
    public final AnonymousClass4Y9 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77153pT) && C18070vi.A18(this.A00, ((C77153pT) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C77153pT(AnonymousClass4Y9 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectingInputState(input=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
