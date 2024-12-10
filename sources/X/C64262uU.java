package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.2uU  reason: invalid class name and case insensitive filesystem */
public class C64262uU implements LocationListener {
    public final /* synthetic */ C88344Zh A00;
    public final /* synthetic */ AnonymousClass1RK A01;

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C64262uU(C88344Zh r1, AnonymousClass1RK r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CompanionDevice/location/changed ");
            A10.append(location.getTime());
            A10.append(" ");
            A10.append(location.getAccuracy());
            Log.i(A10.toString());
            AnonymousClass1RK r4 = this.A01;
            r4.A0J.CGF(new AnonymousClass3C4(this, this.A00, location, 25));
            r4.A08.A05(this);
        }
    }
}
