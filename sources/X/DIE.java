package X;

import android.location.Location;
import com.google.android.gms.location.LocationResult;

public final class DIE implements E5B {
    public final /* synthetic */ LocationResult A00;

    public DIE(LocationResult locationResult) {
        this.A00 = locationResult;
    }

    public final /* bridge */ /* synthetic */ void BkV(Object obj) {
        C197629x0 r4 = (C197629x0) obj;
        LocationResult locationResult = this.A00;
        C18070vi.A0d(locationResult, 0);
        for (Location location : locationResult.A00) {
            if (location != null) {
                C20321AGd aGd = r4.A00;
                C20321AGd.A00(location, aGd);
                aGd.A03.removeCallbacks(aGd.A0A);
                return;
            }
        }
    }
}
