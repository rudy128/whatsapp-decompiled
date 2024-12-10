package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D1U implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                i2 = C26300CxD.A03(parcel, readInt);
            } else if (c == 3) {
                j = C26300CxD.A07(parcel, readInt);
            } else if (c != 4) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                j2 = C26300CxD.A07(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23160BcG(i, i2, j, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23160BcG[i];
    }
}
