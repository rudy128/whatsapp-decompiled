package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

public final class D1Y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
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
        return new LatLng(d, d2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
