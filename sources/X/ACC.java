package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ACC implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean A02 = A3Y.A02(parcel);
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        return new C20270AEd(readString, readString2, A02);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20270AEd[i];
    }
}
