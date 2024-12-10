package X;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;

/* renamed from: X.3Ct  reason: invalid class name and case insensitive filesystem */
public class C70853Ct implements Runnable {
    public static Boolean A05;
    public static Boolean A06;
    public static final Object A07 = C17880vN.A0p();
    public final Context A00;
    public final C19690yl A01;
    public final long A02;
    public final PowerManager.WakeLock A03;
    public final C19480yH A04;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A03(X.C70853Ct r2) {
        /*
            monitor-enter(r2)
            android.content.Context r1 = r2.A00     // Catch:{ all -> 0x001d }
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x001d }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            boolean r1 = r0.isConnected()     // Catch:{ all -> 0x001d }
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            monitor-exit(r2)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70853Ct.A03(X.3Ct):boolean");
    }

    public static boolean A00() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public static boolean A01(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (A07) {
            Boolean bool = A06;
            if (bool == null) {
                booleanValue = A02(context, "android.permission.WAKE_LOCK");
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            A06 = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x021a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x021c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (X.C19690yl.A01() == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0090, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r9 = r7.A00;
        r1 = r9.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a3, code lost:
        if (r1 == 83) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a7, code lost:
        if (r1 != 85) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a9, code lost:
        r1 = r9.equals("U");
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b1, code lost:
        r1 = r9.equals("S");
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b8, code lost:
        if (r1 != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ba, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bd, code lost:
        if (r0 == 0) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bf, code lost:
        if (r0 == 1) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c5, code lost:
        if (X.C19690yl.A01() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c7, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Unknown topic operation");
        r1.append(r7);
        android.util.Log.d("FirebaseMessaging", X.AnonymousClass000.A0y(".", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00de, code lost:
        r8 = r7.A02;
        r12 = r2.A02;
        r13 = r2.A01.A04();
        r10 = X.C17880vN.A0D();
        r10.putString("gcm.topic", X.AnonymousClass001.A1H("/topics/", r8, X.AnonymousClass000.A10()));
        r10.putString("delete", "1");
        X.C19690yl.A00(X.C19490yI.A00(r10, r12, r13, X.C17900vP.A0A("/topics/", r8)).continueWith(new X.C27134DVv(0), new X.C65392wM(r12)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011f, code lost:
        if (X.C19690yl.A01() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0121, code lost:
        r1 = X.AnonymousClass000.A10();
        X.C17890vO.A10("Unsubscribe from topic: ", r8, " succeeded.", r1);
        android.util.Log.d("FirebaseMessaging", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0132, code lost:
        r8 = r7.A02;
        r12 = r2.A02;
        r13 = r2.A01.A04();
        r10 = X.C17880vN.A0D();
        r10.putString("gcm.topic", X.AnonymousClass001.A1H("/topics/", r8, X.AnonymousClass000.A10()));
        X.C19690yl.A00(X.C19490yI.A00(r10, r12, r13, X.C17900vP.A0A("/topics/", r8)).continueWith(new X.C27134DVv(0), new X.C65392wM(r12)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016c, code lost:
        if (X.C19690yl.A01() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016e, code lost:
        r1 = X.AnonymousClass000.A10();
        X.C17890vO.A10("Subscribe to topic: ", r8, " succeeded.", r1);
        android.util.Log.d("FirebaseMessaging", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r10 = r11.A00;
        r9 = r7.A01;
        r8 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0185, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018a, code lost:
        if (r8.remove(r9) == false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018c, code lost:
        r10.A02.execute(new X.C27080DTf((java.lang.Object) r10, 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0198, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019a, code lost:
        r8 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019c, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a1, code lost:
        if (r8.containsKey(r9) == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a3, code lost:
        r7 = (java.util.ArrayDeque) r8.get(r9);
        r1 = (com.google.android.gms.tasks.TaskCompletionSource) r7.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01af, code lost:
        if (r1 == null) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b1, code lost:
        r1.setResult((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b9, code lost:
        if (r7.isEmpty() == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01bb, code lost:
        r8.remove(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01be, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r2.A03(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c5, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            java.lang.String r4 = "TopicsSyncTask's wakelock was already released due to timeout."
            java.lang.String r3 = "FirebaseMessaging"
            android.content.Context r5 = r15.A00
            boolean r0 = A01(r5)
            if (r0 == 0) goto L_0x0013
            android.os.PowerManager$WakeLock r2 = r15.A03
            long r0 = X.AnonymousClass2VY.A00
            r2.acquire(r0)
        L_0x0013:
            r6 = 0
            X.0yl r2 = r15.A01     // Catch:{ IOException -> 0x021d }
            r0 = 1
            r2.A03(r0)     // Catch:{ IOException -> 0x021d }
            X.0yH r0 = r15.A04     // Catch:{ IOException -> 0x021d }
            boolean r0 = r0.A04()     // Catch:{ IOException -> 0x021d }
            if (r0 != 0) goto L_0x0031
            r2.A03(r6)     // Catch:{ IOException -> 0x021d }
            boolean r0 = A01(r5)
            if (r0 == 0) goto L_0x0242
            android.os.PowerManager$WakeLock r0 = r15.A03     // Catch:{ RuntimeException -> 0x023f }
            r0.release()     // Catch:{ RuntimeException -> 0x023f }
            return
        L_0x0031:
            java.lang.Object r1 = A07     // Catch:{ IOException -> 0x021d }
            monitor-enter(r1)     // Catch:{ IOException -> 0x021d }
            java.lang.Boolean r0 = A05     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = A02(r5, r0)     // Catch:{ all -> 0x0217 }
        L_0x003e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0217 }
            A05 = r0     // Catch:{ all -> 0x0217 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0217 }
            monitor-exit(r1)     // Catch:{ all -> 0x0217 }
            goto L_0x004f
        L_0x004a:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0217 }
            goto L_0x003e
        L_0x004f:
            if (r0 == 0) goto L_0x0081
            boolean r0 = A03(r15)     // Catch:{ IOException -> 0x021d }
            if (r0 != 0) goto L_0x0081
            X.266 r7 = new X.266     // Catch:{ IOException -> 0x021d }
            r7.<init>(r15, r15)     // Catch:{ IOException -> 0x021d }
            boolean r0 = A00()     // Catch:{ IOException -> 0x021d }
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "Connectivity change received registered"
            android.util.Log.d(r3, r0)     // Catch:{ IOException -> 0x021d }
        L_0x0067:
            X.3Ct r0 = r7.A01     // Catch:{ IOException -> 0x021d }
            android.content.Context r2 = r0.A00     // Catch:{ IOException -> 0x021d }
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ IOException -> 0x021d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x021d }
            r2.registerReceiver(r7, r0)     // Catch:{ IOException -> 0x021d }
            boolean r0 = A01(r5)
            if (r0 == 0) goto L_0x0242
            android.os.PowerManager$WakeLock r0 = r15.A03     // Catch:{ RuntimeException -> 0x023f }
            r0.release()     // Catch:{ RuntimeException -> 0x023f }
            return
        L_0x0081:
            monitor-enter(r2)     // Catch:{ IOException -> 0x021d }
            X.0yc r11 = r2.A03     // Catch:{ all -> 0x0214 }
            X.2r6 r7 = r11.A00()     // Catch:{ all -> 0x0214 }
            if (r7 != 0) goto L_0x0099
            boolean r0 = X.C19690yl.A01()     // Catch:{ all -> 0x0214 }
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r3, r0)     // Catch:{ all -> 0x0214 }
        L_0x0096:
            monitor-exit(r2)     // Catch:{ all -> 0x0214 }
            goto L_0x01c1
        L_0x0099:
            monitor-exit(r2)     // Catch:{ all -> 0x0214 }
            java.lang.String r9 = r7.A00     // Catch:{ IOException -> 0x01cb }
            int r1 = r9.hashCode()     // Catch:{ IOException -> 0x01cb }
            r0 = 83
            r8 = 1
            if (r1 == r0) goto L_0x00b1
            r0 = 85
            if (r1 != r0) goto L_0x00ba
            java.lang.String r0 = "U"
            boolean r1 = r9.equals(r0)     // Catch:{ IOException -> 0x01cb }
            r0 = 1
            goto L_0x00b8
        L_0x00b1:
            java.lang.String r0 = "S"
            boolean r1 = r9.equals(r0)     // Catch:{ IOException -> 0x01cb }
            r0 = 0
        L_0x00b8:
            if (r1 != 0) goto L_0x00bb
        L_0x00ba:
            r0 = -1
        L_0x00bb:
            java.lang.String r9 = " succeeded."
            if (r0 == 0) goto L_0x0132
            if (r0 == r8) goto L_0x00de
            boolean r0 = X.C19690yl.A01()     // Catch:{ IOException -> 0x01cb }
            if (r0 == 0) goto L_0x017e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01cb }
            java.lang.String r0 = "Unknown topic operation"
            r1.append(r0)     // Catch:{ IOException -> 0x01cb }
            r1.append(r7)     // Catch:{ IOException -> 0x01cb }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x01cb }
            android.util.Log.d(r3, r0)     // Catch:{ IOException -> 0x01cb }
            goto L_0x017e
        L_0x00de:
            java.lang.String r8 = r7.A02     // Catch:{ IOException -> 0x01cb }
            X.0yI r12 = r2.A02     // Catch:{ IOException -> 0x01cb }
            com.google.firebase.messaging.FirebaseMessaging r0 = r2.A01     // Catch:{ IOException -> 0x01cb }
            java.lang.String r13 = r0.A04()     // Catch:{ IOException -> 0x01cb }
            android.os.Bundle r10 = X.C17880vN.A0D()     // Catch:{ IOException -> 0x01cb }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01cb }
            java.lang.String r14 = "/topics/"
            java.lang.String r1 = X.AnonymousClass001.A1H(r14, r8, r0)     // Catch:{ IOException -> 0x01cb }
            java.lang.String r0 = "gcm.topic"
            r10.putString(r0, r1)     // Catch:{ IOException -> 0x01cb }
            java.lang.String r1 = "delete"
            java.lang.String r0 = "1"
            r10.putString(r1, r0)     // Catch:{ IOException -> 0x01cb }
            java.lang.String r0 = X.C17900vP.A0A(r14, r8)     // Catch:{ IOException -> 0x01cb }
            com.google.android.gms.tasks.Task r10 = X.C19490yI.A00(r10, r12, r13, r0)     // Catch:{ IOException -> 0x01cb }
            X.DVv r1 = new X.DVv     // Catch:{ IOException -> 0x01cb }
            r1.<init>(r6)     // Catch:{ IOException -> 0x01cb }
            X.2wM r0 = new X.2wM     // Catch:{ IOException -> 0x01cb }
            r0.<init>(r12)     // Catch:{ IOException -> 0x01cb }
            com.google.android.gms.tasks.Task r0 = r10.continueWith(r1, r0)     // Catch:{ IOException -> 0x01cb }
            X.C19690yl.A00(r0)     // Catch:{ IOException -> 0x01cb }
            boolean r0 = X.C19690yl.A01()     // Catch:{ IOException -> 0x01cb }
            if (r0 == 0) goto L_0x017e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01cb }
            java.lang.String r0 = "Unsubscribe from topic: "
            X.C17890vO.A10(r0, r8, r9, r1)     // Catch:{ IOException -> 0x01cb }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x01cb }
            android.util.Log.d(r3, r0)     // Catch:{ IOException -> 0x01cb }
            goto L_0x017e
        L_0x0132:
            java.lang.String r8 = r7.A02     // Catch:{ IOException -> 0x01cb }
            X.0yI r12 = r2.A02     // Catch:{ IOException -> 0x01cb }
            com.google.firebase.messaging.FirebaseMessaging r0 = r2.A01     // Catch:{ IOException -> 0x01cb }
            java.lang.String r13 = r0.A04()     // Catch:{ IOException -> 0x01cb }
            android.os.Bundle r10 = X.C17880vN.A0D()     // Catch:{ IOException -> 0x01cb }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01cb }
            java.lang.String r14 = "/topics/"
            java.lang.String r1 = X.AnonymousClass001.A1H(r14, r8, r0)     // Catch:{ IOException -> 0x01cb }
            java.lang.String r0 = "gcm.topic"
            r10.putString(r0, r1)     // Catch:{ IOException -> 0x01cb }
            java.lang.String r0 = X.C17900vP.A0A(r14, r8)     // Catch:{ IOException -> 0x01cb }
            com.google.android.gms.tasks.Task r10 = X.C19490yI.A00(r10, r12, r13, r0)     // Catch:{ IOException -> 0x01cb }
            X.DVv r1 = new X.DVv     // Catch:{ IOException -> 0x01cb }
            r1.<init>(r6)     // Catch:{ IOException -> 0x01cb }
            X.2wM r0 = new X.2wM     // Catch:{ IOException -> 0x01cb }
            r0.<init>(r12)     // Catch:{ IOException -> 0x01cb }
            com.google.android.gms.tasks.Task r0 = r10.continueWith(r1, r0)     // Catch:{ IOException -> 0x01cb }
            X.C19690yl.A00(r0)     // Catch:{ IOException -> 0x01cb }
            boolean r0 = X.C19690yl.A01()     // Catch:{ IOException -> 0x01cb }
            if (r0 == 0) goto L_0x017e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01cb }
            java.lang.String r0 = "Subscribe to topic: "
            X.C17890vO.A10(r0, r8, r9, r1)     // Catch:{ IOException -> 0x01cb }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x01cb }
            android.util.Log.d(r3, r0)     // Catch:{ IOException -> 0x01cb }
        L_0x017e:
            monitor-enter(r11)     // Catch:{ IOException -> 0x021d }
            X.0yi r10 = r11.A00     // Catch:{ all -> 0x021a }
            java.lang.String r9 = r7.A01     // Catch:{ all -> 0x021a }
            java.util.ArrayDeque r8 = r10.A01     // Catch:{ all -> 0x021a }
            monitor-enter(r8)     // Catch:{ all -> 0x021a }
            boolean r0 = r8.remove(r9)     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x0198
            java.util.concurrent.Executor r7 = r10.A02     // Catch:{ all -> 0x01c8 }
            r1 = 32
            X.DTf r0 = new X.DTf     // Catch:{ all -> 0x01c8 }
            r0.<init>((java.lang.Object) r10, (int) r1)     // Catch:{ all -> 0x01c8 }
            r7.execute(r0)     // Catch:{ all -> 0x01c8 }
        L_0x0198:
            monitor-exit(r8)     // Catch:{ all -> 0x01c8 }
            monitor-exit(r11)     // Catch:{ IOException -> 0x021d }
            java.util.Map r8 = r2.A04     // Catch:{ IOException -> 0x021d }
            monitor-enter(r8)     // Catch:{ IOException -> 0x021d }
            boolean r0 = r8.containsKey(r9)     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x01be
            java.lang.Object r7 = r8.get(r9)     // Catch:{ all -> 0x01c5 }
            java.util.ArrayDeque r7 = (java.util.ArrayDeque) r7     // Catch:{ all -> 0x01c5 }
            java.lang.Object r1 = r7.poll()     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.tasks.TaskCompletionSource r1 = (com.google.android.gms.tasks.TaskCompletionSource) r1     // Catch:{ all -> 0x01c5 }
            if (r1 == 0) goto L_0x01b5
            r0 = 0
            r1.setResult(r0)     // Catch:{ all -> 0x01c5 }
        L_0x01b5:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x01be
            r8.remove(r9)     // Catch:{ all -> 0x01c5 }
        L_0x01be:
            monitor-exit(r8)     // Catch:{ all -> 0x01c5 }
            goto L_0x0081
        L_0x01c1:
            r2.A03(r6)     // Catch:{ IOException -> 0x021d }
            goto L_0x020c
        L_0x01c5:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01c5 }
            goto L_0x021c
        L_0x01c8:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01c8 }
            throw r0     // Catch:{ all -> 0x021a }
        L_0x01cb:
            r7 = move-exception
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r0 = r7.getMessage()     // Catch:{ IOException -> 0x021d }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x021d }
            if (r0 != 0) goto L_0x01f5
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            java.lang.String r0 = r7.getMessage()     // Catch:{ IOException -> 0x021d }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x021d }
            if (r0 != 0) goto L_0x01f5
            java.lang.String r0 = r7.getMessage()     // Catch:{ IOException -> 0x021d }
            if (r0 != 0) goto L_0x0213
            java.lang.String r0 = "Topic operation failed without exception message. Will retry Topic operation."
        L_0x01ec:
            android.util.Log.e(r3, r0)     // Catch:{ IOException -> 0x021d }
            long r0 = r15.A02     // Catch:{ IOException -> 0x021d }
            r2.A02(r0)     // Catch:{ IOException -> 0x021d }
            goto L_0x020c
        L_0x01f5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x021d }
            java.lang.String r0 = "Topic operation failed: "
            r1.append(r0)     // Catch:{ IOException -> 0x021d }
            java.lang.String r0 = r7.getMessage()     // Catch:{ IOException -> 0x021d }
            r1.append(r0)     // Catch:{ IOException -> 0x021d }
            java.lang.String r0 = ". Will retry Topic operation."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x021d }
            goto L_0x01ec
        L_0x020c:
            boolean r0 = A01(r5)
            if (r0 == 0) goto L_0x0242
            goto L_0x0239
        L_0x0213:
            throw r7     // Catch:{ IOException -> 0x021d }
        L_0x0214:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0214 }
            goto L_0x021c
        L_0x0217:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0217 }
            goto L_0x021c
        L_0x021a:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ IOException -> 0x021d }
        L_0x021c:
            throw r0     // Catch:{ IOException -> 0x021d }
        L_0x021d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = "Failed to sync topics. Won't retry sync. "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)     // Catch:{ all -> 0x0243 }
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x0243 }
            X.0yl r0 = r15.A01     // Catch:{ all -> 0x0243 }
            r0.A03(r6)     // Catch:{ all -> 0x0243 }
            boolean r0 = A01(r5)
            if (r0 == 0) goto L_0x0242
            android.os.PowerManager$WakeLock r0 = r15.A03     // Catch:{ RuntimeException -> 0x023f }
            goto L_0x023b
        L_0x0239:
            android.os.PowerManager$WakeLock r0 = r15.A03     // Catch:{ RuntimeException -> 0x023f }
        L_0x023b:
            r0.release()     // Catch:{ RuntimeException -> 0x023f }
            return
        L_0x023f:
            android.util.Log.i(r3, r4)
        L_0x0242:
            return
        L_0x0243:
            r1 = move-exception
            boolean r0 = A01(r5)
            if (r0 == 0) goto L_0x0253
            android.os.PowerManager$WakeLock r0 = r15.A03     // Catch:{ RuntimeException -> 0x0250 }
            r0.release()     // Catch:{ RuntimeException -> 0x0250 }
            throw r1
        L_0x0250:
            android.util.Log.i(r3, r4)
        L_0x0253:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70853Ct.run():void");
    }

    public C70853Ct(Context context, C19480yH r5, C19690yl r6, long j) {
        this.A01 = r6;
        this.A00 = context;
        this.A02 = j;
        this.A04 = r5;
        this.A03 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean A02(Context context, String str) {
        int checkCallingOrSelfPermission = context.checkCallingOrSelfPermission(str);
        boolean z = true;
        if (checkCallingOrSelfPermission != 0) {
            z = false;
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Missing Permission: ");
                A10.append(str);
                Log.d("FirebaseMessaging", AnonymousClass000.A0y(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest", A10));
            }
        }
        return z;
    }
}
