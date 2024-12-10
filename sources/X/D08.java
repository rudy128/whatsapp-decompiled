package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D08 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        long j = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                j = C26300CxD.A07(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23118BbX(j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23118BbX[i];
    }
}
