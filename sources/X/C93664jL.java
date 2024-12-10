package X;

/* renamed from: X.4jL  reason: invalid class name and case insensitive filesystem */
public final class C93664jL implements C107225Yw {
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93664jL) {
                C93664jL r5 = (C93664jL) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public float Bam() {
        return this.A01;
    }

    public C93664jL(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArrowUiState(scale=");
        A10.append(this.A00);
        A10.append(", translationY=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
