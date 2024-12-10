package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0j  reason: case insensitive filesystem */
public final class C26470D0j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                C26300CxD.A0K(parcel, readInt, 4);
                parcel.readInt();
            } else if (c != 2) {
                i = C26300CxD.A06(parcel, c, 3, readInt, i);
            } else {
                str = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23040BaH(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23040BaH[i];
    }
}
