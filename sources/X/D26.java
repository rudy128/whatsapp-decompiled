package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D26 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.Bb0, java.lang.Object] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 3) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 4) {
                str3 = C26300CxD.A0E(parcel, str3, c, 5, readInt);
            } else {
                str2 = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = str;
        obj.A03 = str2;
        obj.A02 = str3;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23085Bb0[i];
    }
}
