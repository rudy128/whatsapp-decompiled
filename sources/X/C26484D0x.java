package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0x  reason: case insensitive filesystem */
public final class C26484D0x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        C23171BcR bcR = null;
        C23166BcM bcM = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                bcM = C26300CxD.A0B(parcel, bcM, c, 4, readInt);
            } else {
                bcR = DJ0.A0A(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23183Bcd(bcR, bcM, str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23183Bcd[i];
    }
}
