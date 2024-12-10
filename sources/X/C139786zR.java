package X;

/* renamed from: X.6zR  reason: invalid class name and case insensitive filesystem */
public final class C139786zR {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139786zR) {
                C139786zR r5 = (C139786zR) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A00), this.A01);
    }

    public C139786zR(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MultiDestinationAutoCrosspostingSetting(isFBAutoCrosspostOn=");
        A10.append(this.A00);
        A10.append(", isIGAutoCrosspostOn=");
        return C17900vP.A0F(A10, this.A01);
    }

    public C139786zR() {
        this(false, false);
    }
}
