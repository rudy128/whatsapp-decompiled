package X;

/* renamed from: X.9sR  reason: invalid class name and case insensitive filesystem */
public final class C194879sR {
    public boolean A00 = false;
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A03 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194879sR) {
                C194879sR r5 = (C194879sR) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A01), this.A00), this.A03), this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingCallNotificationState(dndModeEnabled=");
        A10.append(this.A01);
        A10.append(", callNotificationDisabled=");
        A10.append(this.A00);
        A10.append(", waAppNotificationDisabled=");
        A10.append(this.A03);
        A10.append(", lgcNotificationDisabled=");
        return C17900vP.A0F(A10, this.A02);
    }
}
