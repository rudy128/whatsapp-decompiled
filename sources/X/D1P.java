package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;

public final class D1P implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        List list = LocationResult.A01;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                list = C26300CxD.A0G(parcel, Location.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new LocationResult(list);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
