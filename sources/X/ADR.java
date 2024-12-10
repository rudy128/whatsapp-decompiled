package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ADR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ADR(String str, String str2, String str3, String str4) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentIncentiveData{offerId='");
        A10.append(this.A02);
        A10.append("', offerClaimId='");
        A10.append(this.A01);
        A10.append("', parentTransactionId='");
        A10.append(this.A03);
        A10.append("', incentiveTransactionId='");
        A10.append(this.A00);
        return AnonymousClass000.A0y("'}", A10);
    }
}
