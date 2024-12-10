package X;

/* renamed from: X.2Na  reason: invalid class name and case insensitive filesystem */
public final class C48582Na extends C39611tM implements C39621tN {
    public final AnonymousClass1E7 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48582Na(AnonymousClass1E7 r2) {
        super(r2, 3);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass1BI BTb() {
        return AnonymousClass1E7.A00(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactConversationsListItem{contact=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
