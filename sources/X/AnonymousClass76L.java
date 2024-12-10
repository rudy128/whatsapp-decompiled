package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76L  reason: invalid class name */
public final class AnonymousClass76L implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AnonymousClass77L.CREATOR.createFromParcel(parcel);
        }
        return new AnonymousClass776((AnonymousClass77L) createFromParcel, A0y, readString);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass776[i];
    }
}
