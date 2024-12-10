package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AAT implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AEM.CREATOR.createFromParcel(parcel);
        }
        return new C20255ADn((AEM) createFromParcel, A0y, readString);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20255ADn[i];
    }
}
