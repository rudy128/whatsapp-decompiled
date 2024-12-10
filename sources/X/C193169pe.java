package X;

/* renamed from: X.9pe  reason: invalid class name and case insensitive filesystem */
public final class C193169pe {
    public final C193149pc A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193169pe) && C18070vi.A18(this.A00, ((C193169pe) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00);
    }

    public C193169pe(C193149pc r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrfInput(first=");
        A10.append(this.A00);
        A10.append(", second=");
        return AnonymousClass001.A1F((Object) null, A10);
    }
}
