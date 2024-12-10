package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1n  reason: case insensitive filesystem */
public final class C26500D1n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 3) {
                i2 = C26300CxD.A05(parcel, c, readInt, i2);
            } else {
                i = C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new Bc7(i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Bc7[i];
    }
}
