package X;

/* renamed from: X.Caj  reason: case insensitive filesystem */
public final class C25192Caj {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25192Caj) {
                C25192Caj caj = (C25192Caj) obj;
                if (!(this.A01 == caj.A01 && this.A02 == caj.A02 && this.A00 == caj.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A01), this.A02), this.A00);
    }

    public C25192Caj(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoPlayState(isAutoPlayAllowed=");
        A10.append(this.A01);
        A10.append(", isVideoInView=");
        A10.append(this.A02);
        A10.append(", isActivityOn=");
        return C17900vP.A0F(A10, this.A00);
    }
}
