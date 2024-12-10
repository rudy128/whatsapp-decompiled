package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ACf  reason: case insensitive filesystem */
public final class C20221ACf implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C20932Abm.CREATOR.createFromParcel(parcel);
        }
        return new C20933Abn((C20932Abm) createFromParcel, A0y, readString);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20933Abn[i];
    }
}
