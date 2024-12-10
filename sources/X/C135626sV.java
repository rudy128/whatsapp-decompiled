package X;

/* renamed from: X.6sV  reason: invalid class name and case insensitive filesystem */
public final class C135626sV {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135626sV) {
                C135626sV r5 = (C135626sV) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(((this.A00 * 31) + this.A01) * 31, this.A03), this.A02);
    }

    public C135626sV(int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PipState(deviceRotation=");
        A10.append(this.A00);
        A10.append(", participantCount=");
        A10.append(this.A01);
        A10.append(", shouldShowSSPipIndicator=");
        A10.append(this.A03);
        A10.append(", shouldShowParticipantCount=");
        return C17900vP.A0F(A10, this.A02);
    }
}
