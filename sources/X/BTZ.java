package X;

public final class BTZ extends C3J {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Integer A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTZ) {
                BTZ btz = (BTZ) obj;
                if (!(this.A06 == btz.A06 && this.A05 == btz.A05 && this.A03 == btz.A03 && this.A02 == btz.A02 && this.A04 == btz.A04 && this.A00 == btz.A00 && this.A01 == btz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A06;
        return (((((((((((C72453Mb.A0E(num, C25331Cdc.A01(num)) * 31) + this.A05) * 31) + this.A03) * 31) + this.A02) * 31) + this.A04) * 31) + this.A00) * 31) + this.A01;
    }

    public BTZ(Integer num, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A06 = num;
        this.A05 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = i5;
        this.A01 = i6;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoFormat(codec=");
        A10.append(C25331Cdc.A01(this.A06));
        A10.append(", width=");
        A10.append(this.A05);
        A10.append(", height=");
        A10.append(this.A03);
        A10.append(", frameRate=");
        A10.append(this.A02);
        A10.append(", iFrameInterval=");
        A10.append(this.A04);
        A10.append(", bitRate=");
        A10.append(this.A00);
        A10.append(", captureFrameRate=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
