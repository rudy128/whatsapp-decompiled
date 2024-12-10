package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.11E  reason: invalid class name */
public class AnonymousClass11E extends AnonymousClass11D {
    public C59732mn A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass11A A02;
    public final AnonymousClass00H A03;
    public final Object A04 = new Object();
    public final AnonymousClass11I A05 = new AnonymousClass11I();
    public final AnonymousClass11C A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public volatile AnonymousClass26w A0B;

    private AnonymousClass26w A00() {
        if (this.A0B == null) {
            synchronized (this) {
                if (this.A0B == null) {
                    this.A0B = new AnonymousClass26w(this, (C219217x) this.A09.get());
                }
            }
        }
        return this.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01() {
        /*
            java.lang.String r1 = X.C197569wu.A0L
            r0 = 3
            r3 = 0
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException | SecurityException -> 0x0044, all -> 0x0048 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException | SecurityException -> 0x0044, all -> 0x0048 }
            r0.<init>(r1)     // Catch:{ IOException | SecurityException -> 0x0044, all -> 0x0048 }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ IOException | SecurityException -> 0x0044, all -> 0x0048 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException | SecurityException -> 0x0044, all -> 0x0048 }
            r2.setInstanceFollowRedirects(r3)     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0038 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setConnectTimeout(r0)     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0038 }
            r2.setReadTimeout(r0)     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0038 }
            r2.setUseCaches(r3)     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0038 }
            r2.getInputStream()     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0038 }
            int r1 = r2.getResponseCode()     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0038 }
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 == r0) goto L_0x0041
            java.lang.String r0 = "captive portal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0038 }
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r0 = 1
            return r0
        L_0x0038:
            r0 = move-exception
            if (r2 == 0) goto L_0x0049
            r2.disconnect()
            goto L_0x0049
        L_0x003f:
            if (r2 == 0) goto L_0x0044
        L_0x0041:
            r2.disconnect()
        L_0x0044:
            android.net.TrafficStats.clearThreadStatsTag()
            return r3
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11E.A01():boolean");
    }

    public int A03(boolean z) {
        Boolean bool = C17970vW.A03;
        if (A0B()) {
            return A00().A01();
        }
        return ((C24431Kh) this.A07.get()).A00(z);
    }

    public C59732mn A05() {
        C59732mn r0;
        synchronized (this.A04) {
            r0 = this.A00;
        }
        return r0;
    }

    public Boolean A06() {
        ConnectivityManager A0E;
        if (Build.VERSION.SDK_INT >= 29 && (A0E = this.A06.A0E()) != null) {
            try {
                Network activeNetwork = A0E.getActiveNetwork();
                if (activeNetwork != null) {
                    return Boolean.valueOf(A0E.getNetworkCapabilities(activeNetwork).hasTransport(4));
                }
            } catch (RuntimeException e) {
                Log.e("ConnectivityStateProvider/isConnectedToVpn:", e);
            }
        }
        return null;
    }

    public void A08(AnonymousClass1LR r3) {
        this.A0A.set(true);
        AnonymousClass26w A002 = A00();
        if (r3 != null) {
            A002.A00.set(r3.A03);
        }
    }

    public boolean A09() {
        Boolean bool = C17970vW.A03;
        if (A0B()) {
            return A00().A04();
        }
        C24431Kh r2 = (C24431Kh) this.A07.get();
        Boolean bool2 = C17960vV.A01;
        ConnectivityManager A0E = r2.A01.A0E();
        if (A0E == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = A0E.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                r2.A00.A0G("networkstatemanager/deadOS", (String) null, false);
                return false;
            }
            throw e;
        }
    }

    public boolean A0B() {
        if (Build.VERSION.SDK_INT < 29 || !this.A0A.get()) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        boolean z;
        try {
            AnonymousClass11C r1 = this.A06;
            AnonymousClass11C.A0P = true;
            ConnectivityManager A0E = r1.A0E();
            TelephonyManager A0K = r1.A0K();
            if (A0E != null) {
                AnonymousClass26w A002 = A00();
                A0E.registerDefaultNetworkCallback(A002);
                A002.A02 = A0E;
                A002.A04 = A0K;
                z = true;
                AnonymousClass11C.A0P = false;
                return z;
            }
        } catch (RuntimeException e) {
            Log.e("ConnectivityStateProvider/registerForNetworkCallbacks", e);
        } catch (Throwable th) {
            AnonymousClass11C.A0P = false;
            throw th;
        }
        z = false;
        AnonymousClass11C.A0P = false;
        return z;
    }

    public AnonymousClass11E(AnonymousClass11C r3, AnonymousClass118 r4, AnonymousClass11A r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        super(r9, r10);
        this.A01 = r4;
        this.A08 = r6;
        this.A07 = r7;
        this.A09 = r8;
        this.A02 = r5;
        this.A06 = r3;
        this.A03 = r10;
    }

    public static boolean A02(Context context) {
        if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r2 != 2) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1LR A04() {
        /*
            r10 = this;
            boolean r0 = r10.A0B()
            r6 = 1
            if (r0 == 0) goto L_0x00b6
            X.26w r3 = r10.A00()
            int r2 = r3.A01()
            X.00H r0 = r10.A09
            java.lang.Object r1 = r0.get()
            X.17x r1 = (X.C219217x) r1
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x009f
            int r5 = r3.A02()
        L_0x0023:
            if (r2 == r6) goto L_0x002a
            r6 = 0
            r0 = 2
            r7 = 1
            if (r2 == r0) goto L_0x002b
        L_0x002a:
            r7 = 0
        L_0x002b:
            boolean r8 = r3.A04()
            r0 = 3
            if (r2 != r0) goto L_0x0090
            r9 = 1
            java.lang.String r3 = "ROAMING"
        L_0x0035:
            switch(r5) {
                case 1: goto L_0x008d;
                case 2: goto L_0x008a;
                case 3: goto L_0x0087;
                case 4: goto L_0x0084;
                case 5: goto L_0x0081;
                case 6: goto L_0x007e;
                case 7: goto L_0x007b;
                case 8: goto L_0x0078;
                case 9: goto L_0x0075;
                case 10: goto L_0x0072;
                case 11: goto L_0x006f;
                case 12: goto L_0x006c;
                case 13: goto L_0x0069;
                case 14: goto L_0x0066;
                case 15: goto L_0x0063;
                case 16: goto L_0x0060;
                case 17: goto L_0x005d;
                case 18: goto L_0x005a;
                case 19: goto L_0x0057;
                case 20: goto L_0x0054;
                default: goto L_0x0038;
            }
        L_0x0038:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UNDEFINED("
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r4 = r1.toString()
        L_0x004e:
            X.1LR r2 = new X.1LR
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x0054:
            java.lang.String r4 = "NR"
            goto L_0x004e
        L_0x0057:
            java.lang.String r4 = "LTE_CA"
            goto L_0x004e
        L_0x005a:
            java.lang.String r4 = "IWLAN"
            goto L_0x004e
        L_0x005d:
            java.lang.String r4 = "TD_SCDMA"
            goto L_0x004e
        L_0x0060:
            java.lang.String r4 = "GSM"
            goto L_0x004e
        L_0x0063:
            java.lang.String r4 = "HSPAP"
            goto L_0x004e
        L_0x0066:
            java.lang.String r4 = "EHRPD"
            goto L_0x004e
        L_0x0069:
            java.lang.String r4 = "LTE"
            goto L_0x004e
        L_0x006c:
            java.lang.String r4 = "EVDO_B"
            goto L_0x004e
        L_0x006f:
            java.lang.String r4 = "IDEN"
            goto L_0x004e
        L_0x0072:
            java.lang.String r4 = "HSPA"
            goto L_0x004e
        L_0x0075:
            java.lang.String r4 = "HSUPA"
            goto L_0x004e
        L_0x0078:
            java.lang.String r4 = "HSDPA"
            goto L_0x004e
        L_0x007b:
            java.lang.String r4 = "1xRTT"
            goto L_0x004e
        L_0x007e:
            java.lang.String r4 = "EVDO_A"
            goto L_0x004e
        L_0x0081:
            java.lang.String r4 = "EVDO_0"
            goto L_0x004e
        L_0x0084:
            java.lang.String r4 = "CDMA"
            goto L_0x004e
        L_0x0087:
            java.lang.String r4 = "UMTS"
            goto L_0x004e
        L_0x008a:
            java.lang.String r4 = "EDGE"
            goto L_0x004e
        L_0x008d:
            java.lang.String r4 = "GPRS"
            goto L_0x004e
        L_0x0090:
            r9 = 0
            if (r2 == 0) goto L_0x009c
            r0 = 1
            if (r2 == r0) goto L_0x0099
            java.lang.String r3 = "CELLULAR"
            goto L_0x0035
        L_0x0099:
            java.lang.String r3 = "WIFI"
            goto L_0x0035
        L_0x009c:
            java.lang.String r3 = "NONE"
            goto L_0x0035
        L_0x009f:
            X.00H r0 = r10.A07
            java.lang.Object r0 = r0.get()
            X.1Kh r0 = (X.C24431Kh) r0
            android.net.NetworkInfo r0 = r0.A01()
            if (r0 == 0) goto L_0x00b3
            int r5 = r0.getSubtype()
            goto L_0x0023
        L_0x00b3:
            r5 = 0
            goto L_0x0023
        L_0x00b6:
            X.00H r0 = r10.A07
            java.lang.Object r0 = r0.get()
            X.1Kh r0 = (X.C24431Kh) r0
            android.net.NetworkInfo r2 = r0.A01()
            if (r2 == 0) goto L_0x00eb
            int r1 = r2.getType()
            r0 = 1
            r6 = 0
            if (r1 != r0) goto L_0x00cd
            r6 = 1
        L_0x00cd:
            int r0 = r2.getType()
            r7 = 0
            if (r0 != 0) goto L_0x00d5
            r7 = 1
        L_0x00d5:
            int r5 = r2.getSubtype()
            boolean r8 = r2.isConnected()
            boolean r9 = r2.isRoaming()
            java.lang.String r3 = r2.getTypeName()
            java.lang.String r4 = r2.getSubtypeName()
            goto L_0x004e
        L_0x00eb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11E.A04():X.1LR");
    }

    public void A07() {
        C59732mn r3 = new C59732mn(A04(), AnonymousClass11P.A01((AnonymousClass11P) this.A08.get()));
        this.A03.get();
        this.A02.A00(new C70623Bv(this, r3, 14));
    }

    public boolean A0A() {
        if (A0B()) {
            return A00().A03();
        }
        return ((C24431Kh) this.A07.get()).A02();
    }
}
