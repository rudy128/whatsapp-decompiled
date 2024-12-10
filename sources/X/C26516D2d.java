package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D2d  reason: case insensitive filesystem */
public final class C26516D2d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        C23106BbL bbL = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bbL = (C23106BbL) C26300CxD.A0A(parcel, C23106BbL.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23062Bad(bbL, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23062Bad[i];
    }
}
