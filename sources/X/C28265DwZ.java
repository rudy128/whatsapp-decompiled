package X;

/* renamed from: X.DwZ  reason: case insensitive filesystem */
public final class C28265DwZ extends C26278CwY {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.CwY, java.lang.Object] */
    public void A0D(C26184Cu8 cu8, C26280Cwb cwb, int i, int i2) {
        int i3;
        int i4;
        super.A0D(cu8, cwb, i, i2);
        ? obj = new Object();
        obj.A01 = null;
        int length = this.A05.length;
        int length2 = this.A06.length;
        if (obj.A05 == null) {
            obj.A05 = new int[length];
        }
        for (int i5 = 0; i5 < length; i5++) {
            int[] iArr = this.A07;
            if (iArr == null || i5 >= iArr.length || (i4 = iArr[i5]) == 0) {
                i3 = this.A05[i5];
            } else {
                i3 = C26278CwY.A03(this, i4, length2);
            }
            if (this.A04 != null) {
                i3 = C26278CwY.A04(this, cwb, i3);
            }
            C26278CwY.A0A(cwb, obj.A05, i3, i5);
        }
        int length3 = this.A06.length + this.A02;
        if (obj.A06 == null) {
            obj.A06 = new int[(this.A03 + length3)];
        }
        for (int i6 = 0; i6 < length3; i6++) {
            int i7 = this.A06[i6];
            if (this.A04 != null) {
                i7 = C26278CwY.A04(this, cwb, i7);
            }
            C26278CwY.A0A(cwb, obj.A06, i7, i6);
        }
        for (int i8 = 0; i8 < this.A03; i8++) {
            int A03 = C26278CwY.A03(this, this.A08[i8], length2);
            if (this.A04 != null) {
                A03 = C26278CwY.A04(this, cwb, A03);
            }
            C26278CwY.A0A(cwb, obj.A06, A03, length3 + i8);
        }
        this.A05 = obj.A05;
        this.A06 = obj.A06;
        this.A02 = 0;
        this.A07 = obj.A07;
        this.A08 = obj.A08;
        this.A03 = obj.A03;
        this.A00 = obj.A00;
        this.A04 = obj.A04;
    }
}
