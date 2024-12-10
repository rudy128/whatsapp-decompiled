package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;

public final class AAB implements LocationListener, C218317o {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1RB A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass118 A03;
    public final C18000vb A04;
    public final AnonymousClass10I A05;

    @OnLifecycleEvent(C27581Wq.ON_RESUME)
    private final void connectListener() {
        this.A01.A06(this, "directory_map_view_business_search", 0.0f, 3, 5000, 1000);
    }

    public void onLocationChanged(Location location) {
        C18070vi.A0d(location, 0);
        AnonymousClass10I r0 = this.A05;
        AnonymousClass118 r3 = this.A03;
        AnonymousClass1KB r6 = this.A02;
        C18000vb r5 = this.A04;
        r0.CGF(new C21468AkZ(this.A00, r3, location, r5, r6, 11));
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    @OnLifecycleEvent(C27581Wq.ON_PAUSE)
    private final void disconnectListener() {
        this.A01.A05(this);
    }

    public AAB(AnonymousClass1RB r2, AnonymousClass1KB r3, AnonymousClass118 r4, C18000vb r5, AnonymousClass10I r6) {
        C18070vi.A0w(r3, r4, r6, r5, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final void A00() {
        disconnectListener();
        connectListener();
    }
}
