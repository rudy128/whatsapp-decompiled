package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AAV implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        boolean A01 = A3Y.A01(parcel);
        return new AEJ(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), A0A, A01);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEJ[i];
    }
}
