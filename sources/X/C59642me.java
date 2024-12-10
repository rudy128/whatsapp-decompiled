package X;

/* renamed from: X.2me  reason: invalid class name and case insensitive filesystem */
public final class C59642me {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59642me) {
                C59642me r5 = (C59642me) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(i * 31, this.A01), this.A03), this.A02);
    }

    public C59642me(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A01 = z2;
        this.A03 = z3;
        this.A02 = z4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChatMessageCountsFMessageMetadata(isSent=");
        A10.append(this.A00);
        A10.append(", isEphemeral=");
        A10.append(this.A01);
        A10.append(", isViewOnce=");
        A10.append(this.A03);
        A10.append(", isReply=");
        return C17900vP.A0F(A10, this.A02);
    }
}
