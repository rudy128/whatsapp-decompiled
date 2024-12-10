package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ACk  reason: case insensitive filesystem */
public final class C20226ACk implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer A0i;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            A0i = null;
        } else {
            A0i = AnonymousClass8BT.A0i(parcel);
        }
        return new AE2(A0i, A0y, readString);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AE2[i];
    }
}
