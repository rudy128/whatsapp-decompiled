package X;

/* renamed from: X.1Jq  reason: invalid class name and case insensitive filesystem */
public final class C24301Jq {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24301Jq) {
                C24301Jq r5 = (C24301Jq) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PhysicalScreenDimensions(width=");
        sb.append(this.A02);
        sb.append(", height=");
        sb.append(this.A01);
        sb.append(", diagonal=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C24301Jq(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }
}
