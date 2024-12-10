package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0O implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                str2 = C26300CxD.A0E(parcel, str2, c, 3, readInt);
            } else {
                str = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23129Bbi(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23129Bbi[i];
    }
}
