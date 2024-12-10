package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public final class D1V implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = DJ0.A0D(parcel, readInt);
            } else if (c == 3) {
                f = C26300CxD.A01(parcel, readInt);
            } else if (c == 4) {
                C26300CxD.A0K(parcel, readInt, 4);
                f2 = parcel.readFloat();
            } else if (c != 5) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                f3 = C26300CxD.A01(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new CameraPosition(latLng, f, f2, f3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
