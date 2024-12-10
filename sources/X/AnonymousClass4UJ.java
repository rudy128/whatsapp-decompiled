package X;

/* renamed from: X.4UJ  reason: invalid class name */
public final class AnonymousClass4UJ {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UJ) {
                AnonymousClass4UJ r5 = (AnonymousClass4UJ) obj;
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

    public AnonymousClass4UJ(boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommunitySettingsDescriptionUIState(isVisible=");
        A10.append(this.A02);
        A10.append(", isMeCommunityAdmin=");
        A10.append(this.A01);
        A10.append(", isEveryoneCanAdd=");
        return C17900vP.A0F(A10, this.A00);
    }
}
