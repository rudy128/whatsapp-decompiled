package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.ABm  reason: case insensitive filesystem */
public final class C20202ABm implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PlaceInfo(C72453Mb.A0y(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceInfo[i];
    }
}
