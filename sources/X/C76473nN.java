package X;

/* renamed from: X.3nN  reason: invalid class name and case insensitive filesystem */
public final class C76473nN extends AnonymousClass4ME {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public C76473nN(boolean z, boolean z2) {
        super(z2, false);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = z ? 2131898199 : 2131899582;
        this.A00 = z ? 2131898199 : 2131898198;
        this.A02 = z ? 2131898199 : 2131899582;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76473nN) {
                C76473nN r5 = (C76473nN) obj;
                if (!(this.A04 == r5.A04 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A04), this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Join(isMuted=");
        A10.append(this.A04);
        A10.append(", canJoinCall=");
        return C17900vP.A0F(A10, this.A03);
    }
}
