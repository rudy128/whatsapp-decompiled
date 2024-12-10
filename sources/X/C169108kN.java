package X;

/* renamed from: X.8kN  reason: invalid class name and case insensitive filesystem */
public final class C169108kN extends AnonymousClass9M4 {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169108kN) {
                C169108kN r5 = (C169108kN) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + 393671415;
    }

    public C169108kN(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PostImages(productImageWidth=");
        A10.append(this.A01);
        A10.append(", productImageHeight=");
        A10.append(this.A00);
        A10.append(", fieldName=");
        return C17900vP.A0B("post_images", A10);
    }
}
