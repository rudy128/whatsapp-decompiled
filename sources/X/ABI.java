package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABI implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        int A0A = C72453Mb.A0A(parcel);
        int readInt = parcel.readInt();
        Object obj = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ARR.CREATOR.createFromParcel(parcel);
        }
        ARR arr = (ARR) createFromParcel;
        if (parcel.readInt() != 0) {
            obj = ARR.CREATOR.createFromParcel(parcel);
        }
        return new C20274AEh(arr, (ARR) obj, A0A, readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20274AEh[i];
    }
}
