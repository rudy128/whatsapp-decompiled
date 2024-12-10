package X;

import android.os.Parcel;
import android.os.Parcelable;

public class D3L implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D36(13);
    public final E6O A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(C25925Coo.A00(this.A00));
    }

    public D3L(E6O e6o) {
        this.A00 = e6o;
    }
}
