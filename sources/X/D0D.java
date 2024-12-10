package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0D implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        byte[][] bArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bArr = C26300CxD.A0T(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23206Bd0(bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23206Bd0[i];
    }
}
