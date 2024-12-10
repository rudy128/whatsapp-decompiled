package X;

/* renamed from: X.6sv  reason: invalid class name and case insensitive filesystem */
public final class C135886sv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135886sv) {
                C135886sv r5 = (C135886sv) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass3MX.A03(this.A03) + this.A01) * 31) + this.A00) * 31) + this.A02;
    }

    public C135886sv(int i, int i2, int i3, boolean z) {
        this.A03 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusItemsDownloadResult(hasMyStatus=");
        A10.append(this.A03);
        A10.append(", nonDownloadableItems=");
        A10.append(this.A01);
        A10.append(", goodQualityDownloadedCount=");
        A10.append(this.A00);
        A10.append(", notEnoughQualityDownload=");
        return AnonymousClass001.A1L(A10, this.A02);
    }
}
