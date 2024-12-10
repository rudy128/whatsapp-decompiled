package X;

/* renamed from: X.9pg  reason: invalid class name and case insensitive filesystem */
public final class C193189pg {
    public final String A00;

    public C193189pg(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193189pg) && C18070vi.A18(this.A00, ((C193189pg) obj).A00));
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UpiIndiaWithdrawInputSummaryViewData(conversionSummary=");
        A10.append(this.A00);
        A10.append(", isShimmering=");
        return C17900vP.A0F(A10, false);
    }
}
