package X;

import java.util.List;

/* renamed from: X.6JR  reason: invalid class name */
public final class AnonymousClass6JR extends AnonymousClass6U0 {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6JR) {
                AnonymousClass6JR r5 = (AnonymousClass6JR) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A01), this.A02), this.A03);
    }

    public AnonymousClass6JR(List list, boolean z, boolean z2, boolean z3) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RecommendedNewslettersListDataItem(recommendedNewsletters=");
        A10.append(this.A00);
        A10.append(", hasNewsletterSubscriptions=");
        A10.append(this.A01);
        A10.append(", isCollapsed=");
        A10.append(this.A02);
        A10.append(", isCollapsingAvailable=");
        return C17900vP.A0F(A10, this.A03);
    }
}
