package X;

/* renamed from: X.4Tr  reason: invalid class name and case insensitive filesystem */
public final class C86944Tr {
    public final float A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86944Tr) {
                C86944Tr r5 = (C86944Tr) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + this.A01;
    }

    public C86944Tr(int i, float f) {
        this.A00 = f;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Slice(percentage=");
        A10.append(this.A00);
        A10.append(", color=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
