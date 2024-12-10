package com.whatsapp.location;

import X.AAA;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass112;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass195;
import X.AnonymousClass1LU;
import X.AnonymousClass1RB;
import X.AnonymousClass7RA;
import X.AnonymousClass8BR;
import X.AnonymousClass99x;
import X.B5G;
import X.C1408573i;
import X.C1409673t;
import X.C17880vN;
import X.C17890vO;
import X.C190019kF;
import X.C19830z4;
import X.C217217d;
import X.C219217x;
import X.C25081Mu;
import X.C27131Uv;
import X.C27411Vz;
import X.C29971dB;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.Set;

public class LocationSharingService extends AnonymousClass99x implements B5G {
    public static volatile String A0J;
    public static volatile boolean A0K;
    public static volatile boolean A0L;
    public static volatile boolean A0M;
    public long A00;
    public AnonymousClass195 A01;
    public AnonymousClass1RB A02;
    public C27411Vz A03;
    public C190019kF A04;
    public AnonymousClass11C A05;
    public AnonymousClass11P A06;
    public C219217x A07;
    public C19830z4 A08;
    public AnonymousClass1LU A09;
    public C27131Uv A0A;
    public AnonymousClass10I A0B;
    public AnonymousClass00H A0C;
    public AAA A0D;
    public final Handler A0E = C17890vO.A0D();
    public final Runnable A0F = new AnonymousClass7RA((Object) this, 12);
    public final Runnable A0G = new AnonymousClass7RA((Object) this, 13);
    public volatile boolean A0H;
    public volatile boolean A0I;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static synchronized void A00(Context context) {
        boolean A002;
        Class<LocationSharingService> cls = LocationSharingService.class;
        synchronized (cls) {
            if (!A0L && !A0M && A0K) {
                Intent action = AnonymousClass8BR.A07(context, cls).setAction("com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING");
                if (!AnonymousClass112.A0A() || A0J != null) {
                    A002 = C25081Mu.A00(context, action);
                } else {
                    A002 = context.stopService(action);
                }
                A0L = A002;
            }
        }
    }

    public static void A03(Context context, AnonymousClass195 r3, C219217x r4, C27131Uv r5) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (r5.A0b()) {
            r4.A06();
            A01(context, AnonymousClass8BR.A07(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_PERSISTENT_LOCATION_REPORTING"), r3, r4);
        } else if (A0K) {
            A00(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r3.A0A.A0b() == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(com.whatsapp.location.LocationSharingService r3) {
        /*
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0016
            boolean r0 = r3.A0I
            if (r0 != 0) goto L_0x0016
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0048
            X.1Uv r0 = r3.A0A
            boolean r0 = r0.A0b()
            if (r0 == 0) goto L_0x0048
        L_0x0016:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationSharingService/stopSelfIfNeeded/service not stopped: "
            r2.append(r0)
            boolean r0 = r3.A0H
            r2.append(r0)
            java.lang.String r1 = "|"
            r2.append(r1)
            boolean r0 = r3.A0I
            r2.append(r0)
            r2.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0040
            X.1Uv r0 = r3.A0A
            boolean r1 = r0.A0b()
            r0 = 1
            if (r1 != 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            X.C17900vP.A0r(r2, r0)
            r0 = 0
            A0L = r0
            return
        L_0x0048:
            r0 = 1
            A0M = r0
            r3.stopSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.A04(com.whatsapp.location.LocationSharingService):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if (r0 != null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r22 = this;
            java.lang.String r0 = "LocationSharingService/onCreate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = r22
            super.onCreate()
            X.11P r4 = r5.A06
            X.0ve r3 = r5.A02
            X.11C r2 = r5.A05
            X.0z4 r1 = r5.A08
            X.1Vz r15 = r5.A03
            X.1RB r14 = r5.A02
            X.9kF r0 = r5.A04
            X.AAA r13 = new X.AAA
            r17 = r2
            r18 = r4
            r19 = r1
            r20 = r3
            r21 = r5
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r5.A0D = r13
            X.11C r0 = r13.A08     // Catch:{ RuntimeException -> 0x0056 }
            android.os.PowerManager r2 = r0.A0G()     // Catch:{ RuntimeException -> 0x0056 }
            if (r2 != 0) goto L_0x0039
            java.lang.String r0 = "MyLocationUpdater/onCreate pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x0056 }
            goto L_0x005c
        L_0x0039:
            android.os.PowerManager$WakeLock r0 = r13.A02     // Catch:{ RuntimeException -> 0x0056 }
            if (r0 != 0) goto L_0x0048
            java.lang.String r1 = "ShareLocationService"
            r0 = 1
            android.os.PowerManager$WakeLock r0 = X.C181789Rv.A00(r2, r1, r0)     // Catch:{ RuntimeException -> 0x0056 }
            r13.A02 = r0     // Catch:{ RuntimeException -> 0x0056 }
            if (r0 == 0) goto L_0x005c
        L_0x0048:
            boolean r0 = r0.isHeld()     // Catch:{ RuntimeException -> 0x0056 }
            if (r0 != 0) goto L_0x005c
            android.os.PowerManager$WakeLock r2 = r13.A02     // Catch:{ RuntimeException -> 0x0056 }
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.acquire(r0)     // Catch:{ RuntimeException -> 0x0056 }
            goto L_0x005c
        L_0x0056:
            r1 = move-exception
            java.lang.String r0 = "MyLocationUpdater/onCreate/PowerManager exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x005c:
            X.0z4 r0 = r13.A09
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r0)
            java.lang.String r1 = "location_shared_duration"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.getString(r1, r0)
            long r11 = java.lang.System.currentTimeMillis()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = ";"
            java.lang.String[] r8 = r1.split(r0)
            int r7 = r8.length
            r10 = 0
            r6 = 0
        L_0x007d:
            if (r6 >= r7) goto L_0x00ac
            r1 = r8[r6]
            java.lang.String r0 = ","
            java.lang.String[] r9 = r1.split(r0)
            int r1 = r9.length
            r0 = 2
            if (r1 != r0) goto L_0x00a9
            r0 = r9[r10]
            int r4 = java.lang.Integer.parseInt(r0)
            long r2 = X.C17890vO.A03(r4)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00a9
            r0 = 1
            r0 = r9[r0]
            int r1 = java.lang.Integer.parseInt(r0)
            android.util.SparseIntArray r0 = r13.A04
            r0.put(r4, r1)
        L_0x00a9:
            int r6 = r6 + 1
            goto L_0x007d
        L_0x00ac:
            android.os.Handler r3 = r5.A0E
            java.lang.Runnable r2 = r5.A0F
            r0 = 42000(0xa410, double:2.0751E-319)
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.onCreate():void");
    }

    public void onDestroy() {
        Log.i("LocationSharingService/onDestroy");
        C27131Uv r0 = this.A0A;
        synchronized (r0.A0S) {
            r0.A00 = 0;
        }
        stopForeground(true);
        A0K = false;
        Set set = ((C29971dB) this.A0C.get()).A0G;
        synchronized (set) {
            set.remove("LocationSharingService");
        }
        A0J = null;
        A0L = false;
        A0M = false;
        this.A02.A08 = false;
        Handler handler = this.A0E;
        handler.removeCallbacks(this.A0F);
        handler.removeCallbacks(this.A0G);
        AAA aaa = this.A0D;
        aaa.A05.A05(aaa);
        AAA.A01(aaa);
        PowerManager.WakeLock wakeLock = aaa.A02;
        if (wakeLock != null && wakeLock.isHeld()) {
            aaa.A02.release();
            aaa.A02 = null;
        }
    }

    public static void A01(Context context, Intent intent, AnonymousClass195 r7, C219217x r8) {
        int i;
        if ((AnonymousClass112.A0A() && (!r8.A06() || (!r7.A00 && (!A0K || A0J == null)))) || !C25081Mu.A00(context, intent)) {
            C1409673t A032 = C217217d.A03(context);
            A032.A0M = "other_notifications@1";
            A032.A0E(context.getString(2131893075));
            Intent A0A2 = C17880vN.A0A();
            A0A2.setClassName(context.getPackageName(), "com.whatsapp.location.LiveLocationPrivacyActivity");
            A032.A0A = C1408573i.A00(context, 0, A0A2, 0);
            int i2 = -2;
            if (Build.VERSION.SDK_INT >= 26) {
                i2 = -1;
            }
            A032.A03 = i2;
            if (!AnonymousClass112.A0A() || r8.A06()) {
                A032.A0D(context.getString(2131893070));
                i = 2131231578;
            } else {
                A032.A0D(context.getString(2131891772));
                i = 2131232441;
            }
            A032.A08.icon = i;
            ((NotificationManager) context.getSystemService("notification")).notify(12, A032.A05());
        }
    }

    public static void A02(Context context, AnonymousClass195 r3, C219217x r4, long j, boolean z) {
        r4.A06();
        A01(context, AnonymousClass8BR.A07(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_LOCATION_REPORTING").putExtra("duration", j).putExtra("isIqRequest", z), r3, r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0141, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A0A, 11128) != false) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021a A[EDGE_INSN: B:108:0x021a->B:72:0x021a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0224 A[LOOP:1: B:73:0x021e->B:75:0x0224, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r20, int r21, int r22) {
        /*
            r19 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationSharingService/onStartCommand intent="
            r1.append(r0)
            r8 = r20
            r1.append(r8)
            java.lang.String r0 = " permission="
            r1.append(r0)
            r7 = r19
            X.17x r0 = r7.A07
            boolean r0 = r0.A06()
            r1.append(r0)
            java.lang.String r0 = " foreground="
            r1.append(r0)
            X.195 r0 = r7.A01
            boolean r0 = r0.A00
            X.C17900vP.A0r(r1, r0)
            r0 = 0
            A0J = r0
            if (r20 == 0) goto L_0x0035
            java.lang.String r0 = r8.getAction()
            A0J = r0
        L_0x0035:
            X.73t r3 = X.C217217d.A03(r7)
            java.lang.String r0 = "other_notifications@1"
            r3.A0M = r0
            r0 = 2131893074(0x7f121b52, float:1.9420914E38)
            r1 = 2131893074(0x7f121b52, float:1.9420914E38)
            java.lang.String r0 = r7.getString(r0)
            r3.A0F(r0)
            java.lang.String r0 = r7.getString(r1)
            r3.A0E(r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.location.LiveLocationPrivacyActivity"
            r2.setClassName(r1, r0)
            r6 = 0
            android.app.PendingIntent r0 = X.C1408573i.A00(r7, r6, r2, r6)
            r3.A0A = r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r0 = -2
            if (r2 < r1) goto L_0x006d
            r0 = -1
        L_0x006d:
            r3.A03 = r0
            X.17x r0 = r7.A07
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x00c8
            r0 = 2131893069(0x7f121b4d, float:1.9420904E38)
            java.lang.String r0 = r7.getString(r0)
            r3.A0D(r0)
            r1 = 2131231294(0x7f08023e, float:1.8078665E38)
        L_0x0084:
            android.app.Notification r0 = r3.A08
            r0.icon = r1
            boolean r0 = X.AnonymousClass112.A0A()
            r2 = 12
            if (r0 == 0) goto L_0x00c0
            if (r20 == 0) goto L_0x00b0
            android.app.Notification r1 = r3.A05()
            r0 = 8
            r7.startForeground(r2, r1, r0)
        L_0x009b:
            r5 = 1
            A0K = r5
            X.1RB r0 = r7.A02
            r0.A08 = r5
            X.00H r0 = r7.A0C
            java.lang.Object r1 = r0.get()
            X.1dB r1 = (X.C29971dB) r1
            java.lang.String r0 = "LocationSharingService"
            java.util.Set r1 = r1.A0G
            monitor-enter(r1)
            goto L_0x00d6
        L_0x00b0:
            java.lang.String r0 = "notification"
            java.lang.Object r1 = r7.getSystemService(r0)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            android.app.Notification r0 = r3.A05()
            r1.notify(r2, r0)
            goto L_0x009b
        L_0x00c0:
            android.app.Notification r0 = r3.A05()
            r7.startForeground(r2, r0)
            goto L_0x009b
        L_0x00c8:
            r0 = 2131891772(0x7f12163c, float:1.9418273E38)
            java.lang.String r0 = r7.getString(r0)
            r3.A0D(r0)
            r1 = 2131232441(0x7f0806b9, float:1.8080991E38)
            goto L_0x0084
        L_0x00d6:
            r1.add(r0)     // Catch:{ all -> 0x02b6 }
            monitor-exit(r1)
            if (r20 == 0) goto L_0x00f2
            java.lang.String r0 = "com.whatsapp.ShareLocationService.ACTION_SEND_LOCATION_WEB_RESPONSE"
            boolean r0 = X.C17890vO.A1S(r8, r0)
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING"
            boolean r0 = X.C17890vO.A1S(r8, r0)
            if (r0 == 0) goto L_0x00f2
            r7.A0H = r6
        L_0x00ee:
            A04(r7)
            return r5
        L_0x00f2:
            java.lang.String r1 = "duration"
            r3 = 42000(0xa410, double:2.0751E-319)
            if (r20 == 0) goto L_0x01e1
            java.lang.String r0 = "com.whatsapp.ShareLocationService.ACTION_START_LOCATION_UPDATES_FOR_WEB"
            boolean r0 = X.C17890vO.A1S(r8, r0)
            if (r0 == 0) goto L_0x01cc
            long r1 = r8.getLongExtra(r1, r3)
            android.os.Handler r3 = r7.A0E
            java.lang.Runnable r0 = r7.A0G
            r3.removeCallbacks(r0)
            r3.postDelayed(r0, r1)
            r7.A0I = r5
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationSharingService/onStartCommand/start location updates; duration="
            X.C17900vP.A0m(r0, r3, r1)
            X.AAA r7 = r7.A0D
            java.lang.String r8 = "web-client-updates"
        L_0x011e:
            android.location.Location r0 = r7.A01
            r16 = 7200000(0x6ddd00, double:3.5572727E-317)
            if (r0 == 0) goto L_0x0143
            long r3 = r0.getTime()
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0143
            if (r6 == 0) goto L_0x017e
            X.0ve r2 = r7.A0A
            r1 = 11128(0x2b78, float:1.5594E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x017e
        L_0x0143:
            X.1RB r0 = r7.A05
            android.location.Location r8 = r0.A02(r8)
            r6 = 0
            if (r8 == 0) goto L_0x015b
            long r3 = r8.getTime()
            long r3 = r3 + r16
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x015b
            r8 = r6
        L_0x015b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MyLocationUpdater/onStartCommand/start; "
            r2.append(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r8 != 0) goto L_0x01bf
            java.lang.String r0 = "location="
            r1.append(r0)
            r1.append(r6)
        L_0x0172:
            java.lang.String r0 = r1.toString()
            X.C17890vO.A1A(r2, r0)
            if (r8 == 0) goto L_0x017e
            X.AAA.A00(r8, r7)
        L_0x017e:
            long r3 = r7.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0189
            X.AAA.A01(r7)
        L_0x0189:
            long r3 = java.lang.System.currentTimeMillis()
            r7.A00 = r3
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            r3 = 0
            r12 = 0
        L_0x0196:
            android.util.SparseIntArray r8 = r7.A04
            int r0 = r8.size()
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r12 >= r0) goto L_0x021a
            int r14 = r8.keyAt(r12)
            int r6 = r8.get(r14)
            long r8 = (long) r14
            long r8 = r8 * r10
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 + r10
            long r10 = java.lang.System.currentTimeMillis()
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x01bb
            long r8 = (long) r6
            long r3 = r3 + r8
        L_0x01b8:
            int r12 = r12 + 1
            goto L_0x0196
        L_0x01bb:
            X.C17890vO.A1D(r13, r14)
            goto L_0x01b8
        L_0x01bf:
            java.lang.String r0 = "location.provider="
            r1.append(r0)
            java.lang.String r0 = r8.getProvider()
            r1.append(r0)
            goto L_0x0172
        L_0x01cc:
            java.lang.String r0 = "com.whatsapp.ShareLocationService.ACTION_STOP_LOCATION_UPDATES_FOR_WEB"
            boolean r0 = X.C17890vO.A1S(r8, r0)
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = "LocationSharingService/onStartCommand/stop location updates"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.A0I = r6
            goto L_0x00ee
        L_0x01dd:
            long r3 = r8.getLongExtra(r1, r3)
        L_0x01e1:
            android.os.Handler r1 = r7.A0E
            java.lang.Runnable r0 = r7.A0F
            r1.removeCallbacks(r0)
            r1.postDelayed(r0, r3)
            X.11P r0 = r7.A06
            long r0 = X.AnonymousClass11P.A01(r0)
            long r0 = r0 + r3
            r7.A00 = r0
            r7.A0H = r5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationSharingService/onStartCommand/start; duration="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "; maxEndTime="
            r2.append(r0)
            long r0 = r7.A00
            X.C17890vO.A16(r2, r0)
            if (r20 == 0) goto L_0x0214
            java.lang.String r0 = "isIqRequest"
            boolean r6 = r8.getBooleanExtra(r0, r6)
        L_0x0214:
            X.AAA r7 = r7.A0D
            java.lang.String r8 = "location-sharing-service"
            goto L_0x011e
        L_0x021a:
            java.util.Iterator r6 = r13.iterator()
        L_0x021e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x022c
            int r0 = X.C72453Mb.A0H(r6)
            r8.delete(r0)
            goto L_0x021e
        L_0x022c:
            X.9kF r0 = r7.A07
            boolean r9 = r0.A00()
            X.1Vz r0 = r7.A06
            X.1W0 r0 = r0.A00
            boolean r6 = r0.A01()
            double r14 = r0.A00()
            boolean r0 = java.lang.Double.isNaN(r14)
            if (r0 == 0) goto L_0x0246
            r14 = 4636737291354636288(0x4059000000000000, double:100.0)
        L_0x0246:
            if (r9 != 0) goto L_0x0269
            r12 = 4629137466983448576(0x403e000000000000, double:30.0)
            if (r6 == 0) goto L_0x025d
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x025d
            r7.A00 = r1
        L_0x0252:
            r17 = 1000(0x3e8, double:4.94E-321)
            r0 = 5000(0x1388, double:2.4703E-320)
            r6 = 3
        L_0x0257:
            X.1RB r10 = r7.A05
            r10.A05(r7)
            goto L_0x0284
        L_0x025d:
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0269
            if (r6 != 0) goto L_0x0271
            r10 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0271
        L_0x0269:
            r7.A00 = r1
            r0 = 30000(0x7530, double:1.4822E-319)
            r17 = 10000(0x2710, double:4.9407E-320)
            r6 = 0
            goto L_0x0257
        L_0x0271:
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x027e
            if (r6 != 0) goto L_0x0252
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0252
        L_0x027e:
            r0 = 10000(0x2710, double:4.9407E-320)
            r17 = 5000(0x1388, double:2.4703E-320)
            r6 = 2
            goto L_0x0257
        L_0x0284:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x02af }
            java.lang.String r2 = "MyLocationUpdater/onStartCommand/request location updates; powerSaveMode="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x02af }
            r8.append(r9)     // Catch:{ IllegalArgumentException -> 0x02af }
            java.lang.String r2 = "; duration="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x02af }
            r8.append(r3)     // Catch:{ IllegalArgumentException -> 0x02af }
            java.lang.String r2 = "; locationProviders="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x02af }
            r8.append(r6)     // Catch:{ IllegalArgumentException -> 0x02af }
            java.lang.String r2 = "; updateInterval="
            X.C17900vP.A0m(r2, r8, r0)     // Catch:{ IllegalArgumentException -> 0x02af }
            java.lang.String r12 = "location-updater"
            r13 = 0
            r11 = r7
            r14 = r6
            r15 = r0
            r10.A06(r11, r12, r13, r14, r15, r17)     // Catch:{ IllegalArgumentException -> 0x02af }
            return r5
        L_0x02af:
            r1 = move-exception
            java.lang.String r0 = "MyLocationUpdater/onCreate/GPS error "
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        L_0x02b6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.onStartCommand(android.content.Intent, int, int):int");
    }
}
