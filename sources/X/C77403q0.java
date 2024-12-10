package X;

/* renamed from: X.3q0  reason: invalid class name and case insensitive filesystem */
public final class C77403q0 extends AnonymousClass4N6 {
    public final C94064jz A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77403q0(C94064jz r3) {
        super(AnonymousClass4DL.GROUP, r3, r3.A01.A0J);
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77403q0) && C18070vi.A18(this.A00, ((C77403q0) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Group(uiState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
