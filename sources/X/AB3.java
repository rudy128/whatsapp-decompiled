package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AB3 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Double valueOf;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        Double d = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() != 0) {
            d = Double.valueOf(parcel.readDouble());
        }
        return new AEG(valueOf, d, A0y, readString);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEG[i];
    }
}
