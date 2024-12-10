package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AAu  reason: case insensitive filesystem */
public final class C20184AAu implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AF1((C20291AEz) C20291AEz.CREATOR.createFromParcel(parcel), parcel.readFloat(), parcel.readFloat(), A3Y.A02(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AF1[i];
    }
}
