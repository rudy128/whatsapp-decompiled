package X;

/* renamed from: X.3q6  reason: invalid class name and case insensitive filesystem */
public final class C77463q6 extends AnonymousClass4N6 {
    public final C94004jt A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77463q6) && C18070vi.A18(this.A00, ((C77463q6) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C77463q6(C94004jt r3) {
        super(AnonymousClass4DL.VIDEO_MESSAGE, r3, ((AnonymousClass206) r3.A00.A03).A0v.A01);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoMessage(uiState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
