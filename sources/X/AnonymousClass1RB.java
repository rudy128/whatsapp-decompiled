package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1RB  reason: invalid class name */
public class AnonymousClass1RB {
    public C25260Cbz A00;
    public Map A01;
    public LocationManager A02;
    public final C219217x A03;
    public final AnonymousClass195 A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass11C A06;
    public final AnonymousClass118 A07;
    public volatile boolean A08;

    public static LocationRequest A00(C65382wJ r7) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.A08 = true;
        int i = r7.A01;
        int i2 = 100;
        if ((i & 1) == 0) {
            i2 = 105;
            if ((i & 2) != 0) {
                i2 = 102;
            }
        }
        locationRequest.A01 = i2;
        locationRequest.A00(r7.A03);
        long j = r7.A02;
        if (j >= 0) {
            locationRequest.A07 = true;
            locationRequest.A04 = j;
            float f = r7.A00;
            if (f >= 0.0f) {
                locationRequest.A00 = f;
                return locationRequest;
            }
            StringBuilder sb = new StringBuilder(37);
            sb.append("invalid displacement: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("invalid interval: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    private void A01(String str) {
        if (Build.VERSION.SDK_INT == 29 && !this.A04.A00 && !this.A08 && !"group-chat-live-location-ui-oncreate".equals(str)) {
            this.A05.A0G("FusedLocationManager/logIfLocationAccessedInBackground", "background-location", true);
        }
    }

    public Location A03(String str, int i) {
        LocationManager locationManager;
        String str2;
        C219217x r3 = this.A03;
        if (r3.A06()) {
            StringBuilder sb = new StringBuilder();
            sb.append("FusedLocationManager/getLocation:");
            sb.append(str);
            Log.i(sb.toString());
            A04();
            A01(str);
            C25260Cbz cbz = this.A00;
            if (cbz != null && cbz.A06()) {
                return C24733CHv.A02.BTq(this.A00);
            }
            if (this.A02 != null) {
                if (i == 1) {
                    if (r3.A02("android.permission.ACCESS_FINE_LOCATION") == 0) {
                        locationManager = this.A02;
                        str2 = "gps";
                    }
                } else if (r3.A02("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    locationManager = this.A02;
                    str2 = "network";
                }
                return locationManager.getLastKnownLocation(str2);
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FusedLocationManager/getLastKnownLocation/do not have location permissions context:");
        sb2.append(str);
        Log.w(sb2.toString());
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.00O, java.util.Map, X.00P] */
    /* JADX WARNING: type inference failed for: r25v0, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r10v1, types: [X.00O, java.util.Map] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.00O, X.00P, java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A04() {
        /*
            r29 = this;
            r8 = r29
            monitor-enter(r8)
            android.location.LocationManager r0 = r8.A02     // Catch:{ all -> 0x017b }
            if (r0 != 0) goto L_0x0179
            X.118 r0 = r8.A07     // Catch:{ all -> 0x017b }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x017b }
            r28 = r0
            int r1 = X.C41371wF.A00(r28)     // Catch:{ all -> 0x017b }
            r0 = 0
            if (r1 != 0) goto L_0x0015
            r0 = 1
        L_0x0015:
            r9 = 0
            if (r0 == 0) goto L_0x016d
            X.2wH r2 = new X.2wH     // Catch:{ all -> 0x017b }
            r2.<init>(r8)     // Catch:{ all -> 0x017b }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x017b }
            r0.<init>()     // Catch:{ all -> 0x017b }
            r8.A01 = r0     // Catch:{ all -> 0x017b }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x017b }
            r7.<init>()     // Catch:{ all -> 0x017b }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x017b }
            r6.<init>()     // Catch:{ all -> 0x017b }
            r5 = 0
            X.00P r1 = new X.00P     // Catch:{ all -> 0x017b }
            r1.<init>(r5)     // Catch:{ all -> 0x017b }
            X.00P r4 = new X.00P     // Catch:{ all -> 0x017b }
            r4.<init>(r5)     // Catch:{ all -> 0x017b }
            X.1wH r19 = X.C41381wH.A00     // Catch:{ all -> 0x017b }
            X.BYp r20 = X.CIA.A00     // Catch:{ all -> 0x017b }
            java.util.ArrayList r17 = new java.util.ArrayList     // Catch:{ all -> 0x017b }
            r17.<init>()     // Catch:{ all -> 0x017b }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x017b }
            r15.<init>()     // Catch:{ all -> 0x017b }
            android.os.Looper r18 = r28.getMainLooper()     // Catch:{ all -> 0x017b }
            java.lang.String r23 = r28.getPackageName()     // Catch:{ all -> 0x017b }
            java.lang.Class r0 = r28.getClass()     // Catch:{ all -> 0x017b }
            java.lang.String r24 = r0.getName()     // Catch:{ all -> 0x017b }
            X.CPx r3 = X.C24733CHv.A01     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "Api must not be null"
            X.C18210vx.A02(r3, r0)     // Catch:{ all -> 0x017b }
            r4.put(r3, r9)     // Catch:{ all -> 0x017b }
            X.BYp r3 = r3.A00     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "Base client builder must not be null"
            X.C18210vx.A02(r3, r0)     // Catch:{ all -> 0x017b }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x017b }
            r6.addAll(r0)     // Catch:{ all -> 0x017b }
            r7.addAll(r0)     // Catch:{ all -> 0x017b }
            r0 = r17
            r0.add(r2)     // Catch:{ all -> 0x017b }
            r15.add(r2)     // Catch:{ all -> 0x017b }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x017b }
            r3 = 1
            r2 = r0 ^ 1
            java.lang.String r0 = "must call addApi() to add at least one API"
            X.C18210vx.A07(r2, r0)     // Catch:{ all -> 0x017b }
            X.DHz r0 = X.C26892DHz.A00     // Catch:{ all -> 0x017b }
            X.CPx r2 = X.CIA.A04     // Catch:{ all -> 0x017b }
            boolean r10 = r4.containsKey(r2)     // Catch:{ all -> 0x017b }
            if (r10 == 0) goto L_0x0096
            java.lang.Object r0 = r4.get(r2)     // Catch:{ all -> 0x017b }
            X.DHz r0 = (X.C26892DHz) r0     // Catch:{ all -> 0x017b }
        L_0x0096:
            X.CTL r14 = new X.CTL     // Catch:{ all -> 0x017b }
            r22 = r0
            r25 = r1
            r26 = r7
            r21 = r14
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x017b }
            java.util.Map r12 = r14.A04     // Catch:{ all -> 0x017b }
            X.00P r10 = new X.00P     // Catch:{ all -> 0x017b }
            r10.<init>(r5)     // Catch:{ all -> 0x017b }
            X.00P r2 = new X.00P     // Catch:{ all -> 0x017b }
            r2.<init>(r5)     // Catch:{ all -> 0x017b }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x017b }
            r13.<init>()     // Catch:{ all -> 0x017b }
            java.util.Set r0 = r4.keySet()     // Catch:{ all -> 0x017b }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x017b }
        L_0x00bc:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x0107
            java.lang.Object r11 = r16.next()     // Catch:{ all -> 0x017b }
            X.CPx r11 = (X.C24924CPx) r11     // Catch:{ all -> 0x017b }
            java.lang.Object r27 = r4.get(r11)     // Catch:{ all -> 0x017b }
            java.lang.Object r0 = r12.get(r11)     // Catch:{ all -> 0x017b }
            r1 = 0
            if (r0 == 0) goto L_0x00d4
            r1 = 1
        L_0x00d4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x017b }
            r10.put(r11, r0)     // Catch:{ all -> 0x017b }
            X.DI6 r0 = new X.DI6     // Catch:{ all -> 0x017b }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x017b }
            r13.add(r0)     // Catch:{ all -> 0x017b }
            X.BYp r1 = r11.A00     // Catch:{ all -> 0x017b }
            X.C18210vx.A00(r1)     // Catch:{ all -> 0x017b }
            r25 = r0
            r21 = r1
            r22 = r28
            r23 = r18
            r24 = r0
            r26 = r14
            X.EDS r1 = r21.A00(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x017b }
            X.CAv r0 = r11.A01     // Catch:{ all -> 0x017b }
            r2.put(r0, r1)     // Catch:{ all -> 0x017b }
            boolean r0 = r1.CCu()     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x00bc
            if (r9 != 0) goto L_0x014f
            r9 = r11
            goto L_0x00bc
        L_0x0107:
            if (r9 == 0) goto L_0x0121
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x017b }
            boolean r4 = r7.equals(r6)     // Catch:{ all -> 0x017b }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x017b }
            r1[r5] = r0     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
            if (r4 != 0) goto L_0x0121
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x017b }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x017b }
            r0.<init>(r1)     // Catch:{ all -> 0x017b }
            throw r0     // Catch:{ all -> 0x017b }
        L_0x0121:
            java.util.Collection r0 = r2.values()     // Catch:{ all -> 0x017b }
            X.BZB.A00(r0, r3)     // Catch:{ all -> 0x017b }
            java.util.concurrent.locks.ReentrantLock r27 = new java.util.concurrent.locks.ReentrantLock     // Catch:{ all -> 0x017b }
            r27.<init>()     // Catch:{ all -> 0x017b }
            X.BZB r1 = new X.BZB     // Catch:{ all -> 0x017b }
            r22 = r13
            r23 = r17
            r24 = r15
            r25 = r10
            r26 = r2
            r16 = r1
            r17 = r28
            r21 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x017b }
            java.util.Set r0 = X.C25260Cbz.A00     // Catch:{ all -> 0x017b }
            monitor-enter(r0)     // Catch:{ all -> 0x017b }
            r0.add(r1)     // Catch:{ all -> 0x014c }
            monitor-exit(r0)     // Catch:{ all -> 0x014c }
            r8.A00 = r1     // Catch:{ all -> 0x017b }
            goto L_0x0171
        L_0x014c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x014c }
            goto L_0x016c
        L_0x014f:
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x017b }
            java.lang.String r2 = r9.A02     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r1.<init>()     // Catch:{ all -> 0x017b }
            r1.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = " cannot be used with "
            r1.append(r0)     // Catch:{ all -> 0x017b }
            r1.append(r2)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x017b }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x017b }
            r1.<init>(r0)     // Catch:{ all -> 0x017b }
        L_0x016c:
            throw r1     // Catch:{ all -> 0x017b }
        L_0x016d:
            r8.A01 = r9     // Catch:{ all -> 0x017b }
            r8.A00 = r9     // Catch:{ all -> 0x017b }
        L_0x0171:
            X.11C r0 = r8.A06     // Catch:{ all -> 0x017b }
            android.location.LocationManager r0 = r0.A0C()     // Catch:{ all -> 0x017b }
            r8.A02 = r0     // Catch:{ all -> 0x017b }
        L_0x0179:
            monitor-exit(r8)
            return
        L_0x017b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RB.A04():void");
    }

    public void A06(LocationListener locationListener, String str, float f, int i, long j, long j2) {
        C219217x r3 = this.A03;
        if (r3.A06()) {
            A04();
            A01(str);
            LocationListener locationListener2 = locationListener;
            float f2 = f;
            int i2 = i;
            long j3 = j;
            if (this.A00 != null) {
                if (this.A01.isEmpty()) {
                    this.A00.A07();
                }
                C65382wJ r4 = new C65382wJ(locationListener2, f2, i2, j3, j2);
                this.A01.put(locationListener2, r4);
                if (this.A00.A06()) {
                    LocationRequest A002 = A00(r4);
                    C25260Cbz cbz = this.A00;
                    C18210vx.A02(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                    cbz.A03(new C23382Bg9(cbz, r4, A002));
                    return;
                }
                return;
            }
            if ((i & 1) != 0) {
                try {
                    if (this.A02 == null || r3.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have fine location permission");
                    } else {
                        this.A02.requestLocationUpdates("gps", j3, f2, locationListener2);
                    }
                } catch (RuntimeException e) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e);
                }
            }
            if ((i & 2) != 0) {
                try {
                    if (this.A02 == null || r3.A02("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have coarse location permission");
                    } else {
                        this.A02.requestLocationUpdates("network", j3, f2, locationListener2);
                    }
                } catch (RuntimeException e2) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e2);
                }
            }
        }
    }

    public AnonymousClass1RB(AnonymousClass195 r1, AnonymousClass190 r2, AnonymousClass11C r3, AnonymousClass118 r4, C219217x r5) {
        this.A07 = r4;
        this.A05 = r2;
        this.A03 = r5;
        this.A06 = r3;
        this.A04 = r1;
    }

    public Location A02(String str) {
        A04();
        Location A032 = A03(str, 1);
        Location A033 = A03(str, 2);
        if (A032 == null || (A033 != null && A032.getTime() <= A033.getTime() - 20000)) {
            A032 = A033;
            if (A033 == null) {
                return A032;
            }
        }
        if (A032.getTime() + 7200000 < System.currentTimeMillis()) {
            return null;
        }
        return A032;
    }

    public void A05(LocationListener locationListener) {
        A04();
        if (this.A00 != null) {
            C65382wJ r2 = (C65382wJ) this.A01.remove(locationListener);
            if (r2 != null) {
                if (this.A00.A06()) {
                    C25260Cbz cbz = this.A00;
                    cbz.A03(new C23381Bg8(cbz, r2));
                }
                if (this.A01.isEmpty()) {
                    this.A00.A04();
                }
            }
        } else if (this.A02 != null && this.A03.A06()) {
            this.A02.removeUpdates(locationListener);
        }
    }

    public boolean A07() {
        A04();
        LocationManager locationManager = this.A02;
        if (locationManager == null) {
            return false;
        }
        if (locationManager.isProviderEnabled("gps") || this.A02.isProviderEnabled("network")) {
            return true;
        }
        return false;
    }
}
