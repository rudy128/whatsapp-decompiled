package X;

/* renamed from: X.Can  reason: case insensitive filesystem */
public final class C25196Can {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25196Can) {
                C25196Can can = (C25196Can) obj;
                if (!(this.A03 == can.A03 && Float.compare(this.A00, can.A00) == 0 && Float.compare(this.A01, can.A01) == 0 && Float.compare(this.A02, can.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0B(this.A03 * 31, this.A00), this.A01), this.A02);
    }

    public C25196Can(float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Shadow(color=");
        A10.append(this.A03);
        A10.append(", offsetX=");
        A10.append(this.A00);
        A10.append(", offsetY=");
        A10.append(this.A01);
        A10.append(", radius=");
        return AnonymousClass001.A1K(A10, this.A02);
    }
}
