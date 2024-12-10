package X;

/* renamed from: X.6sn  reason: invalid class name and case insensitive filesystem */
public final class C135806sn {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135806sn) {
                C135806sn r5 = (C135806sn) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A02, r5.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0B(AnonymousClass000.A0B(Float.floatToIntBits(this.A00) * 31, this.A01), this.A03) + Float.floatToIntBits(this.A02);
    }

    public C135806sn(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A02 = f4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaComposerViewTransitionValues(dx=");
        A10.append(this.A00);
        A10.append(", dy=");
        A10.append(this.A01);
        A10.append(", scale=");
        A10.append(this.A03);
        A10.append(", rotation=");
        return AnonymousClass001.A1K(A10, this.A02);
    }
}
