package X;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0z7  reason: invalid class name and case insensitive filesystem */
public class C19850z7 implements Runnable {
    public ExecutorService A00 = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C19550yO("firebase-iid-executor"));
    public final FirebaseMessaging A01;
    public final long A02;
    public final PowerManager.WakeLock A03;

    public static boolean A00() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public C19850z7(FirebaseMessaging firebaseMessaging, long j) {
        this.A01 = firebaseMessaging;
        this.A02 = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.A02.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.A03 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.260, android.content.BroadcastReceiver] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            X.0z8 r0 = X.C19860z8.A00()
            com.google.firebase.messaging.FirebaseMessaging r6 = r7.A01
            android.content.Context r4 = r6.A02
            boolean r0 = r0.A01(r4)
            if (r0 == 0) goto L_0x0013
            android.os.PowerManager$WakeLock r0 = r7.A03
            r0.acquire()
        L_0x0013:
            r5 = 0
            r0 = 1
            r6.A06(r0)     // Catch:{ IOException -> 0x00fd }
            X.0yH r0 = r6.A08     // Catch:{ IOException -> 0x00fd }
            boolean r0 = r0.A04()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00f9
            X.0z8 r2 = X.C19860z8.A00()     // Catch:{ IOException -> 0x00fd }
            java.lang.Boolean r0 = r2.A00     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r1 = r4.checkCallingOrSelfPermission(r0)     // Catch:{ IOException -> 0x00fd }
            r0 = 0
            if (r1 != 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x00fd }
            r2.A00 = r0     // Catch:{ IOException -> 0x00fd }
        L_0x0038:
            java.lang.Boolean r0 = r2.A01     // Catch:{ IOException -> 0x00fd }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x004e
            r0 = 3
            java.lang.String r1 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"
            android.util.Log.d(r1, r0)     // Catch:{ IOException -> 0x00fd }
        L_0x004e:
            java.lang.Boolean r0 = r2.A00     // Catch:{ IOException -> 0x00fd }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch:{ IOException -> 0x00fd }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00d4
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r0.isConnected()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00d4
        L_0x006c:
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r0 = r6.A04()     // Catch:{ IOException -> 0x008a, SecurityException -> 0x0087 }
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "Token retrieval failed: null"
            android.util.Log.e(r2, r0)     // Catch:{ IOException -> 0x008a, SecurityException -> 0x0087 }
            goto L_0x00b2
        L_0x007a:
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)     // Catch:{ IOException -> 0x008a, SecurityException -> 0x0087 }
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = "Token successfully retrieved"
            android.util.Log.d(r2, r0)     // Catch:{ IOException -> 0x008a, SecurityException -> 0x0087 }
            goto L_0x00f9
        L_0x0087:
            java.lang.String r0 = "Token retrieval failed with SecurityException. Will retry token retrieval"
            goto L_0x00af
        L_0x008a:
            r3 = move-exception
            java.lang.String r1 = r3.getMessage()     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "InternalServerError"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = r3.getMessage()     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = "Token retrieval failed without exception message. Will retry token retrieval"
        L_0x00af:
            android.util.Log.w(r2, r0)     // Catch:{ IOException -> 0x00fd }
        L_0x00b2:
            long r0 = r7.A02     // Catch:{ IOException -> 0x00fd }
            r6.A05(r0)     // Catch:{ IOException -> 0x00fd }
            goto L_0x0120
        L_0x00b8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fd }
            r1.<init>()     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = "Token retrieval failed: "
            r1.append(r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = r3.getMessage()     // Catch:{ IOException -> 0x00fd }
            r1.append(r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = ". Will retry token retrieval"
            r1.append(r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00fd }
            goto L_0x00af
        L_0x00d3:
            throw r3     // Catch:{ IOException -> 0x00fd }
        L_0x00d4:
            X.260 r2 = new X.260     // Catch:{ IOException -> 0x00fd }
            r2.<init>()     // Catch:{ IOException -> 0x00fd }
            r2.A00 = r7     // Catch:{ IOException -> 0x00fd }
            boolean r0 = A00()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00e8
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r0 = "Connectivity change received registered"
            android.util.Log.d(r1, r0)     // Catch:{ IOException -> 0x00fd }
        L_0x00e8:
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ IOException -> 0x00fd }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00fd }
            X.0z7 r0 = r2.A00     // Catch:{ IOException -> 0x00fd }
            com.google.firebase.messaging.FirebaseMessaging r0 = r0.A01     // Catch:{ IOException -> 0x00fd }
            android.content.Context r0 = r0.A02     // Catch:{ IOException -> 0x00fd }
            r0.registerReceiver(r2, r1)     // Catch:{ IOException -> 0x00fd }
            goto L_0x0120
        L_0x00f9:
            r6.A06(r5)     // Catch:{ IOException -> 0x00fd }
            goto L_0x0120
        L_0x00fd:
            r3 = move-exception
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r1.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "Topic sync or token retrieval failed on hard failure exceptions: "
            r1.append(r0)     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0130 }
            r1.append(r0)     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = ". Won't retry the operation."
            r1.append(r0)     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0130 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0130 }
            r6.A06(r5)     // Catch:{ all -> 0x0130 }
        L_0x0120:
            X.0z8 r0 = X.C19860z8.A00()
            boolean r0 = r0.A01(r4)
            if (r0 == 0) goto L_0x012f
            android.os.PowerManager$WakeLock r0 = r7.A03
            r0.release()
        L_0x012f:
            return
        L_0x0130:
            r1 = move-exception
            X.0z8 r0 = X.C19860z8.A00()
            boolean r0 = r0.A01(r4)
            if (r0 == 0) goto L_0x0140
            android.os.PowerManager$WakeLock r0 = r7.A03
            r0.release()
        L_0x0140:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19850z7.run():void");
    }
}
