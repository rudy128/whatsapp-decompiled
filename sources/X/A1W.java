package X;

public final class A1W {
    public final C179399Hu A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A1W) {
                A1W a1w = (A1W) obj;
                if (!(this.A00 == a1w.A00 && this.A01 == a1w.A01)) {
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

    public A1W(C179399Hu r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CartRefreshDialogsConfig(cartRefreshResult=");
        A10.append(this.A00);
        A10.append(", promotionRemoved=");
        return C17900vP.A0F(A10, this.A01);
    }

    public A1W() {
        this(C179399Hu.NO_CHANGES, false);
    }
}
