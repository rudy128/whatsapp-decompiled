package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0K implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = C26300CxD.A0O(parcel, readInt);
            } else if (c == 3) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 4) {
                str3 = C26300CxD.A0E(parcel, str3, c, 5, readInt);
            } else {
                str2 = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23158BcE(str, str2, str3, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23158BcE[i];
    }
}
