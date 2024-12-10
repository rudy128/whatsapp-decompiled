package X;

/* renamed from: X.3q5  reason: invalid class name and case insensitive filesystem */
public final class C77453q5 extends AnonymousClass4N6 {
    public final C94054jy A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77453q5) && C18070vi.A18(this.A00, ((C77453q5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C77453q5(C94054jy r3) {
        super(AnonymousClass4DL.MESSAGE, r3, r3.A00.A0v.A01);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Message(uiState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
