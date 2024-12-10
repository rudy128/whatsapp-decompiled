package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ADZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ADZ) && this.A00 == ((ADZ) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public ADZ(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OrderInstallmentData(maxCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
