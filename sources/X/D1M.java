package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D1M implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.Bb3, java.lang.Object] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 3) {
                i2 = C26300CxD.A03(parcel, readInt);
            } else if (c == 4) {
                C26300CxD.A0K(parcel, readInt, 4);
                i3 = parcel.readInt();
            } else if (c != 5) {
                i4 = C26300CxD.A06(parcel, c, 6, readInt, i4);
            } else {
                j = C26300CxD.A07(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = i2;
        obj.A02 = i3;
        obj.A04 = j;
        obj.A03 = i4;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23088Bb3[i];
    }
}
