package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2H implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                f = C26300CxD.A01(parcel, readInt);
            } else if (c != 3) {
                i2 = C26300CxD.A05(parcel, c, readInt, i2);
            } else {
                f2 = C26300CxD.A01(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23086Bb1(f, f2, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23086Bb1[i];
    }
}
