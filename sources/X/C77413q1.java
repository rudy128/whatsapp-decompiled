package X;

/* renamed from: X.3q1  reason: invalid class name and case insensitive filesystem */
public final class C77413q1 extends AnonymousClass4N6 {
    public final C94014ju A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77413q1) && C18070vi.A18(this.A00, ((C77413q1) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C77413q1(C94014ju r3) {
        super(AnonymousClass4DL.HEADER, r3, Integer.valueOf(r3.A00));
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Header(uiState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
