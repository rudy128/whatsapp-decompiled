package X;

public final class BTO extends C3J {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final boolean A04 = true;

    public /* synthetic */ BTO(Integer num, int i, int i2, int i3) {
        this.A03 = num;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTO) {
                BTO bto = (BTO) obj;
                if (!(this.A04 == bto.A04 && this.A03 == bto.A03 && this.A02 == bto.A02 && this.A01 == bto.A01 && this.A00 == bto.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A03;
        return ((((((((((((((((AnonymousClass3MX.A03(this.A04) + 1237) * 31) + 1237) * 31) + C72453Mb.A0E(num, C24592CAn.A00(num))) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31) + 1237) * 31) + 75) * 31) + 1237;
    }
}
