package X;

import android.os.Parcelable;

/* renamed from: X.8pO  reason: invalid class name */
public final class AnonymousClass8pO extends C20284AEs {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass8pO(String str, String str2, int i, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = str2;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ MERCHANT: ");
        A10.append(super.toString());
        A10.append(" merchantId: ");
        A10.append(this.A02);
        A10.append(" p2mEligible: ");
        A10.append(this.A03);
        A10.append(" p2pEligible: ");
        A10.append(this.A04);
        A10.append(" logoUri: ");
        A10.append(this.A01);
        A10.append("maxInstallmentCount: ");
        A10.append(this.A00);
        return AnonymousClass000.A0y(" ]", A10);
    }
}
