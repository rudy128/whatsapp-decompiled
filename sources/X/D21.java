package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D21 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.BaM, java.lang.Object] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                strArr = C26300CxD.A0S(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = strArr;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23045BaM[i];
    }
}
