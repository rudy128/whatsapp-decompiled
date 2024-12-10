package X;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9vI  reason: invalid class name and case insensitive filesystem */
public abstract class C196579vI {
    public static float A00(C20269AEc aEc, C20269AEc aEc2) {
        return AnonymousClass8BX.A0D(new LatLng(aEc.A00, aEc.A01), "origin").distanceTo(AnonymousClass8BX.A0D(new LatLng(aEc2.A00, aEc2.A01), "destination"));
    }

    public static void A01(C20079A6f a6f, List list) {
        if (!a6f.A05()) {
            Double d = a6f.A03;
            C17960vV.A07(d);
            double doubleValue = d.doubleValue();
            Double d2 = a6f.A04;
            C17960vV.A07(d2);
            double doubleValue2 = d2.doubleValue();
            Location location = new Location("");
            location.setLatitude(doubleValue);
            location.setLongitude(doubleValue2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AF0) it.next()).BDm(location);
            }
        }
    }
}
