package X;

/* renamed from: X.1so  reason: invalid class name and case insensitive filesystem */
public final class C39281so {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39281so) {
                C39281so r5 = (C39281so) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A03) * 31) + this.A02) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BadgeIconSize(extraSmall=");
        sb.append(this.A00);
        sb.append(", small=");
        sb.append(this.A03);
        sb.append(", medium=");
        sb.append(this.A02);
        sb.append(", large=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C39281so(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
    }
}
