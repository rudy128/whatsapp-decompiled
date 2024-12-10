package X;

/* renamed from: X.6rl  reason: invalid class name and case insensitive filesystem */
public final class C135166rl {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135166rl) {
                C135166rl r5 = (C135166rl) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A02), this.A01), this.A00);
    }

    public C135166rl(boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallLogData(isVoiceChat=");
        A10.append(this.A02);
        A10.append(", isLonelyState=");
        A10.append(this.A01);
        A10.append(", isGroupCall=");
        return C17900vP.A0F(A10, this.A00);
    }
}
