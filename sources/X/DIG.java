package X;

import android.location.Location;
import android.location.LocationListener;

public final class DIG implements E5B {
    public final /* synthetic */ Location A00;

    public DIG(Location location) {
        this.A00 = location;
    }

    public final /* bridge */ /* synthetic */ void BkV(Object obj) {
        Location location = this.A00;
        LocationListener locationListener = (LocationListener) ((C65382wJ) ((E2E) obj)).A04.get();
        if (locationListener != null) {
            locationListener.onLocationChanged(location);
        }
    }
}
