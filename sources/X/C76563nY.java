package X;

/* renamed from: X.3nY  reason: invalid class name and case insensitive filesystem */
public final class C76563nY extends C86594Sg {
    public final int A00;
    public final boolean A01;

    public C76563nY(boolean z, int i) {
        super(6);
        this.A01 = z;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76563nY) {
                C76563nY r5 = (C76563nY) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NotConnectedHeaderViewState(shouldShowRingAllButton=");
        A10.append(this.A01);
        A10.append(", titleResId=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
