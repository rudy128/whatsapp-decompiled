package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2K implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 3) {
                str3 = C26300CxD.A0E(parcel, str3, c, 4, readInt);
            } else {
                str2 = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23207Bd1(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23207Bd1[i];
    }
}
