package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseIntArray;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;

public class AAA implements LocationListener {
    public long A00;
    public Location A01;
    public PowerManager.WakeLock A02;
    public Location A03;
    public final SparseIntArray A04 = new SparseIntArray();
    public final AnonymousClass1RB A05;
    public final C27411Vz A06;
    public final C190019kF A07;
    public final AnonymousClass11C A08;
    public final C19830z4 A09;
    public final C18030ve A0A;
    public final AnonymousClass11P A0B;
    public final B5G A0C;

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public static void A00(Location location, AAA aaa) {
        String str;
        aaa.A01 = location;
        LocationSharingService locationSharingService = (LocationSharingService) aaa.A0C;
        if (locationSharingService.A0I) {
            locationSharingService.A0A.A0U(location);
        }
        long A012 = AnonymousClass11P.A01(locationSharingService.A06);
        long j = locationSharingService.A00;
        if (A012 > j) {
            str = C17890vO.A0a("LocationSharingService/onLocationUpdate/stop this service since passed maxEndTime; maxEndTime=", AnonymousClass000.A10(), j);
        } else if (!locationSharingService.A0A.A0b()) {
            str = "LocationSharingService/onLocationUpdate/stop this service, no longer sharing live location";
        } else if (locationSharingService.A0H) {
            locationSharingService.A0A.A0U(location);
            if (!locationSharingService.A0A.A0c()) {
                locationSharingService.A0B.CGF(new AnonymousClass7RA((Object) locationSharingService, 14));
                return;
            }
            return;
        } else {
            return;
        }
        Log.i(str);
        locationSharingService.A0H = false;
        LocationSharingService.A04(locationSharingService);
    }

    public static void A01(AAA aaa) {
        long j = aaa.A00;
        if (j != 0) {
            int A042 = (int) C17880vN.A04(j - (j % 3600000));
            SparseIntArray sparseIntArray = aaa.A04;
            sparseIntArray.put(A042, sparseIntArray.get(A042, 0) + ((int) AnonymousClass8BR.A04(j)));
            StringBuilder A10 = AnonymousClass000.A10();
            for (int i = 0; i < sparseIntArray.size(); i++) {
                int keyAt = sparseIntArray.keyAt(i);
                int i2 = sparseIntArray.get(keyAt);
                if (i != 0) {
                    A10.append(";");
                }
                A10.append(keyAt);
                A10.append(",");
                A10.append(i2);
            }
            C19830z4 r0 = aaa.A09;
            C17880vN.A1E(C19830z4.A00(r0), "location_shared_duration", A10.toString());
            aaa.A00 = 0;
        }
    }

    public void onLocationChanged(Location location) {
        Log.i("MyLocationUpdater/onLocationChanged");
        if (C27091Ur.A01(location, this.A01)) {
            A00(location, this);
            this.A03 = location;
            return;
        }
        if (location.getAccuracy() < 80.0f) {
            this.A03 = location;
        }
        if (this.A03 != null && this.A01.getTime() + 40000 < this.A03.getTime()) {
            A00(this.A03, this);
        }
    }

    public AAA(AnonymousClass1RB r2, C27411Vz r3, C190019kF r4, AnonymousClass11C r5, AnonymousClass11P r6, C19830z4 r7, C18030ve r8, B5G b5g) {
        this.A0B = r6;
        this.A0A = r8;
        this.A08 = r5;
        this.A09 = r7;
        this.A06 = r3;
        this.A05 = r2;
        this.A07 = r4;
        this.A0C = b5g;
    }
}
