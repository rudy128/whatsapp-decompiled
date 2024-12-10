package X;

/* renamed from: X.4U2  reason: invalid class name */
public final class AnonymousClass4U2 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4U2) {
                AnonymousClass4U2 r5 = (AnonymousClass4U2) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(this.A00 * 31, this.A01), this.A02);
    }

    public AnonymousClass4U2(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioRouteState(audioRoute=");
        A10.append(this.A00);
        A10.append(", isBluetoothAvailable=");
        A10.append(this.A01);
        A10.append(", isHeadsetAvailable=");
        return C17900vP.A0F(A10, this.A02);
    }
}
