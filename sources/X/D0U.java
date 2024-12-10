package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0U implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23117BbW bbW = null;
        C23127Bbg bbg = null;
        C23114BbT bbT = null;
        C23172BcS bcS = null;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bbW = (C23117BbW) C26300CxD.A0A(parcel, C23117BbW.CREATOR, readInt);
            } else if (c == 2) {
                bbg = (C23127Bbg) C26300CxD.A0A(parcel, C23127Bbg.CREATOR, readInt);
            } else if (c == 3) {
                bbT = (C23114BbT) C26300CxD.A0A(parcel, C23114BbT.CREATOR, readInt);
            } else if (c != 4) {
                str = C26300CxD.A0E(parcel, str, c, 5, readInt);
            } else {
                bcS = (C23172BcS) C26300CxD.A0A(parcel, C23172BcS.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23174BcU(bbT, bbW, bbg, bcS, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23174BcU[i];
    }
}
