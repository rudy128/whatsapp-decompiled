package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AAr  reason: case insensitive filesystem */
public final class C20181AAr implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C20289AEx(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20289AEx[i];
    }
}
