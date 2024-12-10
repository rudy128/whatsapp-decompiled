package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ABz  reason: case insensitive filesystem */
public final class C20215ABz implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new AEC((C1418477e) AnonymousClass3Ma.A08(parcel, AEC.class), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEC[i];
    }
}
