package X;

/* renamed from: X.09w  reason: invalid class name and case insensitive filesystem */
public final class C017809w extends AnonymousClass0HR {
    public final float A00;
    public final float A01;

    public C017809w(float f, float f2) {
        super(false, false);
        this.A00 = f;
        this.A01 = f2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C017809w) {
                C017809w r5 = (C017809w) obj;
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
        A10.append("RelativeLineTo(dx=");
        A10.append(this.A00);
        A10.append(", dy=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
