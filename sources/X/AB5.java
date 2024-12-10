package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AB5 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AEB(C72453Mb.A0y(parcel), parcel.readString(), parcel.readInt(), A3Y.A01(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEB[i];
    }
}
