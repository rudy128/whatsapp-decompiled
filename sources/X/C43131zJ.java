package X;

/* renamed from: X.1zJ  reason: invalid class name and case insensitive filesystem */
public final class C43131zJ {
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43131zJ) {
                C43131zJ r5 = (C43131zJ) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Size(width=");
        sb.append(this.A01);
        sb.append(", height=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C43131zJ(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
