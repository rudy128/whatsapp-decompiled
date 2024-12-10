package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D2j  reason: case insensitive filesystem */
public final class C26522D2j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        C23207Bd1 bd1 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bd1 = (C23207Bd1) C26300CxD.A0A(parcel, C23207Bd1.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23066Bah(bd1, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23066Bah[i];
    }
}
