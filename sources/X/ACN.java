package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ACN implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C20250ADi(parcel.readLong(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20250ADi[i];
    }
}
