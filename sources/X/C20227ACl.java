package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ACl  reason: case insensitive filesystem */
public final class C20227ACl implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C20279AEn.CREATOR.createFromParcel(parcel);
        }
        return new C20271AEe((C20279AEn) createFromParcel, A0y, readString);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20271AEe[i];
    }
}
