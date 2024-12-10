package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AB1 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        return new AE9(parcel.readString(), parcel.readDouble(), parcel.readDouble(), A0A);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AE9[i];
    }
}
