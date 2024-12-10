package X;

/* renamed from: X.CbR  reason: case insensitive filesystem */
public final class C25230CbR {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25230CbR) {
                C25230CbR cbR = (C25230CbR) obj;
                if (!(this.A02 == cbR.A02 && this.A01 == cbR.A01 && this.A07 == cbR.A07 && this.A00 == cbR.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(((this.A02 * 31) + this.A01) * 31, this.A07) + this.A00;
    }

    public C25230CbR(int i, int i2, int i3, boolean z) {
        this.A02 = i;
        this.A01 = i2;
        this.A07 = z;
        this.A00 = i3;
        Integer num = AnonymousClass00R.A0C;
        this.A04 = AnonymousClass1DF.A00(num, new C27631Dib(this));
        this.A05 = AnonymousClass1DF.A00(num, new C27632Dic(this));
        this.A06 = AnonymousClass1DF.A00(num, new C27633Did(this));
        this.A03 = AnonymousClass1DF.A00(num, new C27630Dia(this));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CameraProcessorProperties(originalWidth=");
        A10.append(this.A02);
        A10.append(", originalHeight=");
        A10.append(this.A01);
        A10.append(", isFrontFacing=");
        A10.append(this.A07);
        A10.append(", cameraOrientationDegrees=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
