package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ADY implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final boolean A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ADY) && this.A00 == ((ADY) obj).A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public ADY(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MerchantAccountSettings(buyerInitiatedPaymentEnabled=");
        return C17900vP.A0F(A10, this.A00);
    }
}
