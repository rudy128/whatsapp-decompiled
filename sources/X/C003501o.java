package X;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* renamed from: X.01o  reason: invalid class name and case insensitive filesystem */
public class C003501o {
    public static C003501o A03;
    public final LocationManager A00;
    public final AnonymousClass0HK A01 = new Object();
    public final Context A02;

    public static Location A00(C003501o r7) {
        Location location;
        Context context = r7.A02;
        Location location2 = null;
        if (C196309up.A00(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            try {
                LocationManager locationManager = r7.A00;
                if (locationManager.isProviderEnabled("network")) {
                    location2 = locationManager.getLastKnownLocation("network");
                }
            } catch (Exception e) {
                Log.d("TwilightManager", "Failed to get last known location", e);
            }
        }
        if (C196309up.A00(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            try {
                LocationManager locationManager2 = r7.A00;
                if (locationManager2.isProviderEnabled("gps")) {
                    location = locationManager2.getLastKnownLocation("gps");
                    if (location != null || (location2 != null && location.getTime() <= location2.getTime())) {
                        return location2;
                    }
                    return location;
                }
            } catch (Exception e2) {
                Log.d("TwilightManager", "Failed to get last known location", e2);
            }
            location = null;
            if (location != null) {
            }
        }
        return location2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0HK, java.lang.Object] */
    public C003501o(Context context, LocationManager locationManager) {
        this.A02 = context;
        this.A00 = locationManager;
    }
}
