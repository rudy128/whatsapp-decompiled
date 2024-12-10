package X;

import android.location.Location;
import android.location.LocationListener;
import java.util.List;

public class DAH implements E92, LocationListener {
    public C25678Ck9 A00 = null;
    public final AnonymousClass1RB A01;

    public void CDz(C25678Ck9 ck9, String str) {
        this.A00 = ck9;
        this.A01.A06(this, str, 0.0f, 3, 5000, 1000);
    }

    public void onFlushComplete(int i) {
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public E92 BFw() {
        return new DAH(this.A01);
    }

    public Location BPy(String str) {
        return this.A01.A02(AnonymousClass001.A1H("FbMaps:", str, AnonymousClass000.A10()));
    }

    public void CQD() {
        this.A01.A05(this);
    }

    public void onLocationChanged(List list) {
        if (this.A00 != null && list.size() > 1) {
            C25678Ck9 ck9 = this.A00;
            Location location = (Location) C108955ca.A0p(list);
            if (C25678Ck9.A00(location, ck9.A00)) {
                ck9.A00 = location;
                CJ8 cj8 = ck9.A01;
                if (cj8 != null) {
                    cj8.A00.A0Q.invalidate();
                }
            }
        }
    }

    public DAH(AnonymousClass1RB r2) {
        this.A01 = r2;
    }

    public void onLocationChanged(Location location) {
        C25678Ck9 ck9 = this.A00;
        if (ck9 != null && C25678Ck9.A00(location, ck9.A00)) {
            ck9.A00 = location;
            CJ8 cj8 = ck9.A01;
            if (cj8 != null) {
                cj8.A00.A0Q.invalidate();
            }
        }
    }
}
