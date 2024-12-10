package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2Q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                i2 = C26300CxD.A06(parcel, c, 3, readInt, i2);
            } else {
                i = C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23051BaS(i, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23051BaS[i];
    }
}
