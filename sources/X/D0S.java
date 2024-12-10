package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class D0S implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                arrayList = C26300CxD.A0G(parcel, C23132Bbl.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23117BbW(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23117BbW[i];
    }
}
