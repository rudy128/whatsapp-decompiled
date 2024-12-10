package X;

/* renamed from: X.9qY  reason: invalid class name and case insensitive filesystem */
public final class C193719qY {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193719qY) {
                C193719qY r5 = (C193719qY) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
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

    public C193719qY(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogVariantsThumbDimensions(variantThumbWidth=");
        A10.append(this.A01);
        A10.append(", variantThumbHeight=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
