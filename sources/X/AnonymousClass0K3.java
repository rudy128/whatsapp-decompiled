package X;

/* renamed from: X.0K3  reason: invalid class name */
public final class AnonymousClass0K3 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0K3) {
                AnonymousClass0K3 r5 = (AnonymousClass0K3) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A00), this.A01), this.A02), this.A03);
    }

    public AnonymousClass0K3(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RippleAlpha(draggedAlpha=");
        A10.append(this.A00);
        A10.append(", focusedAlpha=");
        A10.append(this.A01);
        A10.append(", hoveredAlpha=");
        A10.append(this.A02);
        A10.append(", pressedAlpha=");
        return AnonymousClass001.A1K(A10, this.A03);
    }
}
