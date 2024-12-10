package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2S implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        Bc6 bc6 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bc6 = (Bc6) C26300CxD.A0A(parcel, Bc6.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23053BaU(bc6, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23053BaU[i];
    }
}
