package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2J implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23207Bd1 bd1 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bd1 = (C23207Bd1) C26300CxD.A0A(parcel, C23207Bd1.CREATOR, readInt);
            } else if (c == 3) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 4) {
                i3 = C26300CxD.A06(parcel, c, 5, readInt, i3);
            } else {
                C26300CxD.A0K(parcel, readInt, 4);
                i2 = parcel.readInt();
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23135Bbo(bd1, i, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23135Bbo[i];
    }
}
