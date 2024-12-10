package X;

/* renamed from: X.3ot  reason: invalid class name and case insensitive filesystem */
public final class C76953ot extends AnonymousClass4FF {
    public final AnonymousClass4Y8 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76953ot) && C18070vi.A18(this.A00, ((C76953ot) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C76953ot(AnonymousClass4Y8 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectingInputState(input=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
