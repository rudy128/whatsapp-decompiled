package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2V implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                z = C26300CxD.A0M(parcel, c, 3, readInt, z);
            } else {
                i = C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23056BaX(i, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23056BaX[i];
    }
}
