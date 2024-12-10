package X;

/* renamed from: X.8kO  reason: invalid class name and case insensitive filesystem */
public final class C169118kO extends AnonymousClass9M4 {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169118kO) {
                C169118kO r5 = (C169118kO) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) - 275245112;
    }

    public C169118kO(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductImages(productImageWidth=");
        A10.append(this.A01);
        A10.append(", productImageHeight=");
        A10.append(this.A00);
        A10.append(", fieldName=");
        return C17900vP.A0B("product_images", A10);
    }
}
