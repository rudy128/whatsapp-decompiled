package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AD3 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ADM(C72453Mb.A0y(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADM[i];
    }
}
