package X;

/* renamed from: X.95Q  reason: invalid class name */
public final class AnonymousClass95Q extends AnonymousClass95R {
    public final AnonymousClass1BI A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass95Q) && C18070vi.A18(this.A00, ((AnonymousClass95Q) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass95Q(AnonymousClass1BI r2) {
        super(1008);
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndiaUpiTransactionDetailContactMerchantViewData(merchantJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
