package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0y  reason: case insensitive filesystem */
public final class C26485D0y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        C23161BcH bcH = null;
        C23166BcM bcM = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 3) {
                bcH = (C23161BcH) C26300CxD.A0A(parcel, C23161BcH.CREATOR, readInt);
            } else if (c != 4) {
                bcM = C26300CxD.A0B(parcel, bcM, c, 5, readInt);
            } else {
                C26300CxD.A0K(parcel, readInt, 4);
                i2 = parcel.readInt();
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23184Bce(bcH, bcM, str, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23184Bce[i];
    }
}
