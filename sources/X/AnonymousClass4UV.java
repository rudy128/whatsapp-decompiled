package X;

/* renamed from: X.4UV  reason: invalid class name */
public final class AnonymousClass4UV {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UV) {
                AnonymousClass4UV r5 = (AnonymousClass4UV) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((((this.A02 * 31) + this.A01) * 31) + this.A00) * 31, this.A03);
    }

    public AnonymousClass4UV(int i, int i2, int i3, boolean z) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioRouteItem(textResId=");
        A10.append(this.A02);
        A10.append(", iconResId=");
        A10.append(this.A01);
        A10.append(", audioRoute=");
        A10.append(this.A00);
        A10.append(", isSelected=");
        return C17900vP.A0F(A10, this.A03);
    }
}
