package X;

/* renamed from: X.3q2  reason: invalid class name and case insensitive filesystem */
public final class C77423q2 extends AnonymousClass4N6 {
    public final C93984jr A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77423q2) && C18070vi.A18(this.A00, ((C77423q2) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C77423q2(C93984jr r3) {
        super(AnonymousClass4DL.IMAGE_MESSAGE, r3, ((AnonymousClass206) r3.A00.A03).A0v.A01);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImageMessage(uiState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
