package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.D1c  reason: case insensitive filesystem */
public final class C26489D1c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        LatLngBounds latLngBounds = null;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = DJ0.A0D(parcel, readInt);
            } else if (c == 3) {
                latLng2 = DJ0.A0D(parcel, readInt);
            } else if (c == 4) {
                latLng3 = DJ0.A0D(parcel, readInt);
            } else if (c == 5) {
                latLng4 = DJ0.A0D(parcel, readInt);
            } else if (c != 6) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                latLngBounds = (LatLngBounds) C26300CxD.A0A(parcel, LatLngBounds.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23164BcK(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23164BcK[i];
    }
}
