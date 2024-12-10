package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AAs  reason: case insensitive filesystem */
public final class C20182AAs implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C20290AEy(parcel.readLong(), C72453Mb.A0y(parcel), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20290AEy[i];
    }
}
