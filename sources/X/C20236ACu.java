package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ACu  reason: case insensitive filesystem */
public final class C20236ACu implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new AE3(parcel.createByteArray(), parcel.readString(), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AE3[i];
    }
}
