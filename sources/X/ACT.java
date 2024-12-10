package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ACT implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new AE1(parcel.readLong(), parcel.readInt(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AE1[i];
    }
}
