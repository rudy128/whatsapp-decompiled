package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.75j  reason: invalid class name and case insensitive filesystem */
public final class C1413775j implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        return new C115185tX(C137126ux.A00(parcel.readString()), A0y, parcel.readString(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C115185tX[i];
    }
}
