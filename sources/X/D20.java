package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D20 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23203Bcx bcx = null;
        C23136Bbp bbp = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                bcx = (C23203Bcx) C26300CxD.A0A(parcel, C23203Bcx.CREATOR, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bbp = (C23136Bbp) C26300CxD.A0A(parcel, C23136Bbp.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23074Bap(bcx, bbp, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23074Bap[i];
    }
}
