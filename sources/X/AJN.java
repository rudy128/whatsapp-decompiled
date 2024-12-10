package X;

import android.os.Parcel;
import android.os.Parcelable;

public class AJN implements BDX {
    public static final Parcelable.Creator CREATOR = new AD6(14);
    public CharSequence A00;
    public Long A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A01);
    }
}
