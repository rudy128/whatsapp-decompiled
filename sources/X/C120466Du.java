package X;

/* renamed from: X.6Du  reason: invalid class name and case insensitive filesystem */
public final class C120466Du extends C126206cM {
    public final C123096Tc A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120466Du(C123096Tc r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C120466Du) && C18070vi.A18(this.A00, ((C120466Du) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + 947962180;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NotAvailable(searchType=");
        A10.append(this.A00);
        A10.append(", reason=");
        return C17900vP.A0B("search not available", A10);
    }
}
