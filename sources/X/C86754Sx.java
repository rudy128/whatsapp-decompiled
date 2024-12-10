package X;

/* renamed from: X.4Sx  reason: invalid class name and case insensitive filesystem */
public final class C86754Sx {
    public final AnonymousClass4DE A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86754Sx) {
                C86754Sx r5 = (C86754Sx) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
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

    public C86754Sx(AnonymousClass4DE r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectedTab(category=");
        A10.append(this.A00);
        A10.append(", shouldUpdateSelectedTab=");
        return C17900vP.A0F(A10, this.A01);
    }
}
