package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0g  reason: case insensitive filesystem */
public final class C26467D0g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new Object();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23027Ba3[i];
    }
}
