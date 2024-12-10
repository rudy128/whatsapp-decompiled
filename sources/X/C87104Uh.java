package X;

/* renamed from: X.4Uh  reason: invalid class name and case insensitive filesystem */
public final class C87104Uh {
    public final double A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87104Uh) {
                C87104Uh r7 = (C87104Uh) obj;
                if (Double.compare(this.A00, r7.A00) != 0 || !C18070vi.A18(this.A02, r7.A02) || !C18070vi.A18(this.A03, r7.A03) || !C18070vi.A18(this.A01, r7.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass000.A0I(Double.doubleToLongBits(this.A00)) * 31) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A03)) * 31) + C17880vN.A02(this.A01);
    }

    public C87104Uh(Long l, String str, String str2, double d) {
        this.A00 = d;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetricValue(value=");
        A10.append(this.A00);
        A10.append(", country=");
        A10.append(this.A02);
        A10.append(", role=");
        A10.append(this.A03);
        A10.append(", timestamp=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
