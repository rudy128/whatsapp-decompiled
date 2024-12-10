package X;

public final class BTM extends C3J {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTM) {
                BTM btm = (BTM) obj;
                if (!(Float.compare(this.A00, btm.A00) == 0 && Float.compare(this.A01, btm.A01) == 0 && Float.compare(this.A02, btm.A02) == 0 && this.A03 == btm.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A00), this.A01), this.A02) + this.A03;
    }

    public BTM(float f, float f2, float f3, int i) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = i;
    }
}
