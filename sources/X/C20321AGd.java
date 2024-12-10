package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import java.util.HashMap;

/* renamed from: X.AGd  reason: case insensitive filesystem */
public abstract class C20321AGd implements AnonymousClass1GE, LocationListener {
    public LocationManager A00;
    public C22995BYv A01;
    public Integer A02;
    public final Handler A03 = new Handler();
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0L();
    public final AnonymousClass1KB A05;
    public final C197629x0 A06 = new C197629x0(this);
    public final AnonymousClass11C A07;
    public final AnonymousClass118 A08;
    public final C219217x A09;
    public final Runnable A0A = new C21446AkD(this, 14);
    public final String A0B;
    public final Handler A0C = new Handler();
    public final AnonymousClass16K A0D;
    public final C187629g7 A0E;
    public final C18000vb A0F;
    public final C18030ve A0G;
    public final AnonymousClass10I A0H;
    public final Runnable A0I = new C21446AkD(this, 15);

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public void BrH(AnonymousClass1F9 r2) {
        C18070vi.A0d(r2, 0);
        A03();
    }

    public void C0B(AnonymousClass1F9 r2) {
        C18070vi.A0d(r2, 0);
        A03();
    }

    public /* synthetic */ void C6E() {
    }

    public /* synthetic */ void C71(AnonymousClass1F9 r1) {
    }

    public void onLocationChanged(Location location) {
        C18070vi.A0d(location, 0);
        this.A0C.removeCallbacks(this.A0I);
        A00(location, this);
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public static final void A00(Location location, C20321AGd aGd) {
        C187629g7 r5 = aGd.A0E;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        AP7 ap7 = new AP7(location, aGd, 0);
        r5.A00 = AnonymousClass3MW.A0z(ap7);
        r5.A01.postDelayed(r5.A05, 5000);
        r5.A04.CGF(new C21361Aiq(ap7, r5, latitude, longitude));
    }

    public static final void A01(C20321AGd aGd) {
        Handler handler = aGd.A0C;
        Runnable runnable = aGd.A0I;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 10000);
        try {
            if (aGd.A00 == null || aGd.A09.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                A02(aGd, "Fine location permission not granted");
            } else {
                LocationManager locationManager = aGd.A00;
                if (locationManager != null) {
                    locationManager.requestLocationUpdates("gps", 1000, 0.0f, aGd);
                }
            }
            if (aGd.A00 == null || aGd.A09.A02("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                A02(aGd, "Coarse location permission not granted");
                return;
            }
            LocationManager locationManager2 = aGd.A00;
            if (locationManager2 != null) {
                locationManager2.requestLocationUpdates("network", 1000, 0.0f, aGd);
            }
        } catch (RuntimeException e) {
            A02(aGd, C17900vP.A0C("Updates from location services failed : ", AnonymousClass000.A10(), e));
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.google.android.gms.tasks.Continuation, java.lang.Object] */
    public void A03() {
        LocationManager locationManager;
        C22995BYv bYv = this.A01;
        if (bYv != null) {
            bYv.A04(C25934Coz.A00(this.A06, "LocationCallback")).continueWith(new Object());
        }
        if (this.A09.A06() && (locationManager = this.A00) != null) {
            locationManager.removeUpdates(this);
        }
        this.A03.removeCallbacks(this.A0A);
        this.A0C.removeCallbacks(this.A0I);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.CWx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.E1k, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.Cso, X.BYv] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r1.isProviderEnabled("network") == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        A02(r4, "Location providers unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (r1 != null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r19) {
        /*
            r18 = this;
            r4 = r18
            X.17x r0 = r4.A09
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Location access not granted"
            A02(r4, r0)
            return
        L_0x0010:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.118 r0 = r4.A08
            android.content.Context r8 = r0.A00
            X.CPx r7 = X.C24733CHv.A01
            X.DHv r6 = X.C28622EAu.A00
            X.Chd r1 = X.C25540Chd.A02
            X.BYw r0 = new X.BYw
            r0.<init>(r8, r6, r7, r1)
            com.google.android.gms.tasks.zzw r0 = X.AnonymousClass8BY.A0G(r0, r2)
            r5 = 1
            X.AJI.A00(r0, r4, r5)
            android.location.LocationManager r1 = r4.A00
            if (r1 != 0) goto L_0x0039
            X.11C r0 = r4.A07
            android.location.LocationManager r1 = r0.A0C()
            r4.A00 = r1
            if (r1 == 0) goto L_0x0055
        L_0x0039:
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 == 0) goto L_0x0055
        L_0x0049:
            r0 = r19
            if (r19 == 0) goto L_0x005b
            if (r0 == r5) goto L_0x00f8
            java.lang.Runnable r0 = r4.A0I
            r0.run()
            return
        L_0x0055:
            java.lang.String r0 = "Location providers unavailable"
            A02(r4, r0)
            goto L_0x0049
        L_0x005b:
            int r0 = X.C41371wF.A00(r8)
            if (r0 != 0) goto L_0x00f8
            android.os.Handler r3 = r4.A03
            java.lang.Runnable r2 = r4.A0A
            r3.removeCallbacks(r2)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.postDelayed(r2, r0)
            X.BYv r2 = r4.A01
            if (r2 != 0) goto L_0x0086
            X.DIj r2 = new X.DIj
            r2.<init>()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.Chd r0 = new X.Chd
            r0.<init>(r1, r2)
            X.BYv r2 = new X.BYv
            r2.<init>(r8, r6, r7, r0)
            r4.A01 = r2
        L_0x0086:
            com.google.android.gms.location.LocationRequest r6 = new com.google.android.gms.location.LocationRequest
            r6.<init>()
            r6.A08 = r5
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.A00(r0)
            r6.A07 = r5
            r6.A04 = r0
            r0 = 100
            r6.A01 = r0
            X.9x0 r4 = r4.A06
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r7 = 0
            java.util.List r10 = X.C23168BcO.A0B
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 0
            X.BcO r5 = new X.BcO
            r9 = r7
            r15 = r13
            r16 = r13
            r17 = r13
            r8 = r7
            r14 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            if (r1 != 0) goto L_0x00c9
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "Can't create handler inside thread that has not called Looper.prepare()"
            X.C18210vx.A08(r1, r0)
            android.os.Looper r1 = android.os.Looper.myLooper()
        L_0x00c9:
            java.lang.String r0 = "LocationCallback"
            X.CWD r7 = X.C25934Coz.A01(r1, r4, r0)
            X.DIi r3 = new X.DIi
            r3.<init>(r7, r2)
            X.DId r6 = new X.DId
            r8 = r5
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            X.CWx r1 = new X.CWx
            r1.<init>()
            X.DTT r0 = X.DTT.A00
            r1.A04 = r0
            r1.A02 = r6
            r1.A03 = r3
            r1.A01 = r7
            r0 = 2436(0x984, float:3.414E-42)
            r1.A00 = r0
            X.CPy r0 = r1.A00()
            r2.A05(r0)
            return
        L_0x00f8:
            A01(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20321AGd.A04(int):void");
    }

    public C20321AGd(AnonymousClass1KB r3, AnonymousClass16K r4, C187629g7 r5, AnonymousClass11C r6, AnonymousClass118 r7, C219217x r8, C18000vb r9, C18030ve r10, AnonymousClass10I r11, String str) {
        this.A05 = r3;
        this.A0G = r10;
        this.A08 = r7;
        this.A0H = r11;
        this.A07 = r6;
        this.A0F = r9;
        this.A0E = r5;
        this.A09 = r8;
        this.A0D = r4;
        this.A0B = str;
    }

    public static final void A02(C20321AGd aGd, String str) {
        HashMap A11 = C17880vN.A11();
        A11.put("error_type", "location_error");
        A11.put("error_description", str);
        Integer num = aGd.A02;
        if (num != null) {
            aGd.A0D.BiG(A11, num.intValue(), 51);
        }
    }
}
