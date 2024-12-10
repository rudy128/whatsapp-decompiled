package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2A implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.BaP, java.lang.Object] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
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
        ? obj = new Object();
        obj.A00 = str;
        obj.A01 = str2;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23048BaP[i];
    }
}
