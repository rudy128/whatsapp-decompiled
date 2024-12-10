package X;

import java.util.List;

/* renamed from: X.3n0  reason: invalid class name and case insensitive filesystem */
public final class C76263n0 extends AnonymousClass4EB {
    public final List A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76263n0) {
                C76263n0 r5 = (C76263n0) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public C76263n0(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Visible(contacts=");
        A10.append(this.A00);
        A10.append(", isLonelyStateButtonShown=");
        return C17900vP.A0F(A10, this.A01);
    }
}
