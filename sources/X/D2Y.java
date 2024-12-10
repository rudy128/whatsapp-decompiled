package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2Y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                str = C26300CxD.A0E(parcel, str, c, 3, readInt);
            } else {
                i = C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23058BaZ(i, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23058BaZ[i];
    }
}
