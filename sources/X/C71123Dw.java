package X;

/* renamed from: X.3Dw  reason: invalid class name and case insensitive filesystem */
public final class C71123Dw implements AnonymousClass3MT {
    public final float A00;
    public final float A01;

    public /* bridge */ /* synthetic */ Comparable BRH() {
        return Float.valueOf(this.A00);
    }

    public /* bridge */ /* synthetic */ Comparable BZX() {
        return Float.valueOf(this.A01);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C71123Dw)) {
            return false;
        }
        if (isEmpty() && ((C71123Dw) obj).isEmpty()) {
            return true;
        }
        C71123Dw r3 = (C71123Dw) obj;
        if (this.A01 == r3.A01 && this.A00 == r3.A00) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1R((this.A01 > this.A00 ? 1 : (this.A01 == this.A00 ? 0 : -1)));
    }

    public C71123Dw(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public /* bridge */ /* synthetic */ boolean BFl(Comparable comparable) {
        float A04 = AnonymousClass000.A04(comparable);
        if (A04 < this.A01 || A04 > this.A00) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean BhW(Comparable comparable, Comparable comparable2) {
        if (AnonymousClass000.A04(comparable) <= AnonymousClass000.A04(comparable2)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append("..");
        A10.append(this.A00);
        return A10.toString();
    }
}
