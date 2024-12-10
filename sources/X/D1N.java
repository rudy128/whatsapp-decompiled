package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

public final class D1N implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.location.LocationAvailability, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23160BcG[] bcGArr = null;
        long j = 0;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                i3 = C26300CxD.A03(parcel, readInt);
            } else if (c == 3) {
                j = C26300CxD.A07(parcel, readInt);
            } else if (c == 4) {
                C26300CxD.A0K(parcel, readInt, 4);
                i = parcel.readInt();
            } else if (c != 5) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bcGArr = (C23160BcG[]) C26300CxD.A0R(parcel, C23160BcG.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A02 = i;
        obj.A00 = i2;
        obj.A01 = i3;
        obj.A03 = j;
        obj.A04 = bcGArr;
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
