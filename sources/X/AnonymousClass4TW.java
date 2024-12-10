package X;

/* renamed from: X.4TW  reason: invalid class name */
public final class AnonymousClass4TW {
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TW) {
                AnonymousClass4TW r5 = (AnonymousClass4TW) obj;
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

    public AnonymousClass4TW(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PushToVideoCameraEntryPointToolTipUiState(toolTipVisible=");
        A10.append(this.A01);
        A10.append(", toolTipType=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
