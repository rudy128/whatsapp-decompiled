package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2uc  reason: invalid class name and case insensitive filesystem */
public final class C64342uc implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C64552ux(parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C64552ux[i];
    }
}
