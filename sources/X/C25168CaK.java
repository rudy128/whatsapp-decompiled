package X;

/* renamed from: X.CaK  reason: case insensitive filesystem */
public final class C25168CaK {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25168CaK) {
                C25168CaK caK = (C25168CaK) obj;
                if (!(this.A01 == caK.A01 && this.A00 == caK.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C25168CaK(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShareIntentData(surfaceEntryPoint=");
        A10.append(this.A01);
        A10.append(", mediaCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
