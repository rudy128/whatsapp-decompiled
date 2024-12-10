package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ACP implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AE0(C72453Mb.A0y(parcel), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AE0[i];
    }
}
