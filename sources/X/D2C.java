package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2C implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.Baq, java.lang.Object] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 3) {
                i = C26300CxD.A05(parcel, c, readInt, i);
            } else {
                str2 = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A02 = str;
        obj.A01 = str2;
        obj.A00 = i;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23075Baq[i];
    }
}
