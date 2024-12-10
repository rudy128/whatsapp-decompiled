package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D13 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.Bbh] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                str = C26300CxD.A0E(parcel, str, c, 2, readInt);
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
        return new C23128Bbh[i];
    }
}
