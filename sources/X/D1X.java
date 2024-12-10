package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class D1X implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = DJ0.A0D(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                latLng2 = DJ0.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
