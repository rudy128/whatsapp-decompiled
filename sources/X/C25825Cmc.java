package X;

/* renamed from: X.Cmc  reason: case insensitive filesystem */
public final class C25825Cmc {
    public final float A00;

    public static final /* synthetic */ C25825Cmc A00(float f) {
        return new C25825Cmc(f);
    }

    public final /* synthetic */ float A01() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        float f = this.A00;
        if (!(obj instanceof C25825Cmc) || Float.compare(f, ((C25825Cmc) obj).A00) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        float f = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BaselineShift(multiplier=");
        return AnonymousClass001.A1K(A10, f);
    }

    public /* synthetic */ C25825Cmc(float f) {
        this.A00 = f;
    }
}
