package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ACW implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C20931Abl(C72453Mb.A0y(parcel), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20931Abl[i];
    }
}
