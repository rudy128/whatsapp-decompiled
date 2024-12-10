package X;

/* renamed from: X.9rX  reason: invalid class name and case insensitive filesystem */
public final class C194319rX {
    public final float A00;
    public final float A01;
    public final float A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194319rX) {
                C194319rX r5 = (C194319rX) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A01);
    }

    public C194319rX(float f, float f2, float f3) {
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AnimationDimensions(height=");
        A10.append(this.A00);
        A10.append(", width=");
        A10.append(this.A02);
        A10.append(", offsetFromTop=");
        A10.append(this.A01);
        return AnonymousClass001.A1J(A10);
    }
}
