package X;

/* renamed from: X.3pz  reason: invalid class name and case insensitive filesystem */
public final class C77393pz extends AnonymousClass4N6 {
    public final C93974jq A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77393pz) && C18070vi.A18(this.A00, ((C77393pz) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C77393pz(C93974jq r3) {
        super(AnonymousClass4DL.DOCUMENT_MESSAGE, r3, ((AnonymousClass206) r3.A00.A03).A0v.A01);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DocumentMessage(uiState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
