package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D1L implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.BaJ] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                z = C26300CxD.A0M(parcel, c, 3, readInt, z);
            } else {
                i = C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = z;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23042BaJ[i];
    }
}
