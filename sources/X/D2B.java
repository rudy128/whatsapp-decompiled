package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2B implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.BaO, java.lang.Object] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                str = C26300CxD.A0E(parcel, str, c, 3, readInt);
            } else {
                i = C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = str;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23047BaO[i];
    }
}
