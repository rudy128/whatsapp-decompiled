package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1b  reason: case insensitive filesystem */
public final class C26488D1b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                f = C26300CxD.A0C(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new Bc5(f, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Bc5[i];
    }
}
