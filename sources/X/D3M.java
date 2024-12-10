package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class D3M implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(2);
    public final List A00;
    public final List A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A00);
        parcel.writeTypedList(this.A01);
    }

    public D3M(Parcel parcel) {
        this.A00 = parcel.createStringArrayList();
        this.A01 = parcel.createTypedArrayList(C64602v2.CREATOR);
    }
}
