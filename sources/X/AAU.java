package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AAU implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AEM(C72453Mb.A0y(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEM[i];
    }
}
