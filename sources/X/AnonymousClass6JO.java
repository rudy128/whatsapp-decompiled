package X;

/* renamed from: X.6JO  reason: invalid class name */
public final class AnonymousClass6JO extends AnonymousClass6U0 {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6JO) {
                AnonymousClass6JO r5 = (AnonymousClass6JO) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A01), this.A00);
    }

    public AnonymousClass6JO(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterHeaderDataItem(statusTilesEnabled=");
        A10.append(this.A01);
        A10.append(", hasNewsletters=");
        return C17900vP.A0F(A10, this.A00);
    }
}
