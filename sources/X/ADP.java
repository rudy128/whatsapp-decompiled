package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ADP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public ADP(String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndiaUpiExternalPaymentMethodData{type='");
        C20088A6q.A03(A10, this.A01);
        A10.append("', name='");
        C20088A6q.A03(A10, this.A00);
        return AnonymousClass000.A0y("'}", A10);
    }
}
