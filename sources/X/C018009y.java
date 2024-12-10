package X;

/* renamed from: X.09y  reason: invalid class name and case insensitive filesystem */
public final class C018009y extends AnonymousClass0HR {
    public final float A00;
    public final float A01;

    public C018009y(float f, float f2) {
        super(false, true);
        this.A00 = f;
        this.A01 = f2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C018009y) {
                C018009y r5 = (C018009y) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A05(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RelativeReflectiveQuadTo(dx=");
        A10.append(this.A00);
        A10.append(", dy=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
