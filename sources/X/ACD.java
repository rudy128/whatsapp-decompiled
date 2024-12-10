package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ACD implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AEP(C72453Mb.A0y(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), A3Y.A01(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEP[i];
    }
}
