package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D04 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        long j = -1;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                j = C26300CxD.A07(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23191Bcl(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23191Bcl[i];
    }
}
