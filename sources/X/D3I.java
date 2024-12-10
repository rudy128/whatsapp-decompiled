package X;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class D3I implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bj3 bj3 = (Bj3) this;
        parcel.writeParcelable(bj3.A00, 0);
        parcel.writeInt(bj3.A01 ? 1 : 0);
    }
}
