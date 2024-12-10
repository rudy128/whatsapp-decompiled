package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;

public class AAC implements LocationListener, C218317o {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1RB A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass118 A03;
    public final C18000vb A04;
    public final AnonymousClass10I A05;

    @OnLifecycleEvent(C27581Wq.ON_RESUME)
    private void connectListener() {
        this.A01.A06(this, "user-location-picker", 800.0f, 3, 1000, 1000);
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    @OnLifecycleEvent(C27581Wq.ON_PAUSE)
    private void disconnectListener() {
        this.A01.A05(this);
    }

    public void onLocationChanged(Location location) {
        AnonymousClass10I r0 = this.A05;
        AnonymousClass118 r3 = this.A03;
        AnonymousClass1KB r6 = this.A02;
        r0.CGF(new C21468AkZ(this.A00, r3, location, this.A04, r6, 11));
    }

    public AAC(AnonymousClass1RB r2, AnonymousClass1KB r3, AnonymousClass118 r4, C18000vb r5, AnonymousClass10I r6) {
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
    }

    public void A00() {
        disconnectListener();
        connectListener();
    }
}
