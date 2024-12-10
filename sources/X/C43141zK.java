package X;

/* renamed from: X.1zK  reason: invalid class name and case insensitive filesystem */
public final class C43141zK {
    public final float A00;
    public final float A01;
    public final C43131zJ A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43141zK) {
                C43141zK r5 = (C43141zK) obj;
                if (!(C18070vi.A18(this.A02, r5.A02) && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02.hashCode() * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StatusSize(size=");
        sb.append(this.A02);
        sb.append(", strokeWidth=");
        sb.append(this.A01);
        sb.append(", innerStrokeWidth=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C43141zK(C43131zJ r1, float f, float f2) {
        this.A02 = r1;
        this.A01 = f;
        this.A00 = f2;
    }
}
