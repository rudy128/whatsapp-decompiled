package X;

/* renamed from: X.1sv  reason: invalid class name and case insensitive filesystem */
public final class C39351sv {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39351sv) {
                C39351sv r5 = (C39351sv) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Margins(left=");
        sb.append(this.A01);
        sb.append(", top=");
        sb.append(this.A03);
        sb.append(", right=");
        sb.append(this.A02);
        sb.append(", bottom=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C39351sv(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public C39351sv() {
        this(0, 0, 0, 0);
    }
}
