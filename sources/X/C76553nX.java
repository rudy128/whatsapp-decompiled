package X;

/* renamed from: X.3nX  reason: invalid class name and case insensitive filesystem */
public final class C76553nX extends C86594Sg {
    public final AnonymousClass4ZN A00;

    public C76553nX(AnonymousClass4ZN r2) {
        super(7);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76553nX) && C18070vi.A18(this.A00, ((C76553nX) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParticipantsNotInContactsFooterViewState(text=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
