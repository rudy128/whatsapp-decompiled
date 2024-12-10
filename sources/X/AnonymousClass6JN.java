package X;

/* renamed from: X.6JN  reason: invalid class name */
public final class AnonymousClass6JN extends AnonymousClass6U0 {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6JN) && this.A00 == ((AnonymousClass6JN) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public AnonymousClass6JN(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RecoUnitV3FooterDataItem(hasNewsletterSubscriptions=");
        return C17900vP.A0F(A10, this.A00);
    }
}
