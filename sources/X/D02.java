package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D02 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        Parcel parcel2 = null;
        C23105BbK bbK = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                int A04 = C26300CxD.A04(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (A04 == 0) {
                    parcel2 = null;
                } else {
                    parcel2 = Parcel.obtain();
                    parcel2.appendFrom(parcel, dataPosition, A04);
                    parcel.setDataPosition(dataPosition + A04);
                }
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bbK = (C23105BbK) C26300CxD.A0A(parcel, C23105BbK.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23220BdW(parcel2, bbK, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23220BdW[i];
    }
}
