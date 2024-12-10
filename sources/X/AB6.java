package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AB6 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Object obj = null;
        if (C72453Mb.A0A(parcel) == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AEB.CREATOR.createFromParcel(parcel);
        }
        AEB aeb = (AEB) createFromParcel;
        if (parcel.readInt() != 0) {
            obj = AEB.CREATOR.createFromParcel(parcel);
        }
        return new C20248ADg(aeb, (AEB) obj);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20248ADg[i];
    }
}
