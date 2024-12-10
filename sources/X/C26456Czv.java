package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czv  reason: case insensitive filesystem */
public final class C26456Czv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23212BdN bdN = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 2) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bdN = (C23212BdN) C26300CxD.A0A(parcel, C23212BdN.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23175BcV(bdN, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23175BcV[i];
    }
}
