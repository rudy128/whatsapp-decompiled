package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D29 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.BaN, java.lang.Object] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                d = C26300CxD.A00(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                d2 = C26300CxD.A00(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A00 = d;
        obj.A01 = d2;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23046BaN[i];
    }
}
