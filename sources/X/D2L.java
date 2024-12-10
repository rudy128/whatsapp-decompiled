package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2L implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            i = C26300CxD.A06(parcel, (char) readInt, 2, readInt, i);
        }
        C26300CxD.A0H(parcel, A02);
        return new C23033BaA(i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23033BaA[i];
    }
}
