package X;

/* renamed from: X.3q3  reason: invalid class name and case insensitive filesystem */
public final class C77433q3 extends AnonymousClass4N6 {
    public final C93994js A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77433q3) && C18070vi.A18(this.A00, ((C77433q3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C77433q3(C93994js r3) {
        super(AnonymousClass4DL.LINK_MESSAGE, r3, ((AnonymousClass4TL) r3.A00.A03).A00.A0v.A01);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkMessage(uiState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
