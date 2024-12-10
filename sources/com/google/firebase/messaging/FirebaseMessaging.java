package com.google.firebase.messaging;

import X.C18210vx;
import X.C18220vy;
import X.C18290w6;
import X.C18440wP;
import X.C18480wV;
import X.C18550wf;
import X.C19480yH;
import X.C19490yI;
import X.C19550yO;
import X.C19560yP;
import X.C19570yQ;
import X.C19580yR;
import X.C19590yS;
import X.C19600yZ;
import X.C19840z6;
import X.C19850z7;
import X.C449025f;
import X.C61512po;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseMessaging {
    public static C18550wf A0D;
    public static ScheduledExecutorService A0E;
    public static C19840z6 A0F;
    public static final long A0G = TimeUnit.HOURS.toSeconds(8);
    public boolean A00 = false;
    public final Application.ActivityLifecycleCallbacks A01;
    public final Context A02;
    public final Task A03;
    public final C18220vy A04;
    public final C18480wV A05;
    public final C19560yP A06;
    public final C19490yI A07;
    public final C19480yH A08;
    public final C19580yR A09;
    public final Executor A0A;
    public final Executor A0B;
    public final Executor A0C;

    public synchronized void A05(long j) {
        A02(new C19850z7(this, Math.min(Math.max(30, 2 * j), A0G)), j);
        this.A00 = true;
    }

    public synchronized void A06(boolean z) {
        this.A00 = z;
    }

    public FirebaseMessaging(C18550wf r18, C18220vy r19, C18440wP r20, C18290w6 r21, C18290w6 r22, C18480wV r23) {
        C18220vy r7 = r19;
        C18220vy.A02(r7);
        Context context = r7.A00;
        C19480yH r4 = new C19480yH(context);
        C18480wV r0 = r23;
        C19490yI r6 = new C19490yI(r7, r21, r22, r0, r4);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C19550yO("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new C19550yO("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C19550yO("Firebase-Messaging-File-Io"));
        A0D = r18;
        this.A04 = r7;
        this.A05 = r0;
        this.A06 = new C19560yP(r20, this);
        C18220vy.A02(r7);
        this.A02 = context;
        C19570yQ r8 = new C19570yQ();
        this.A01 = r8;
        this.A08 = r4;
        this.A0C = newSingleThreadExecutor;
        this.A07 = r6;
        this.A09 = new C19580yR(newSingleThreadExecutor);
        this.A0B = scheduledThreadPoolExecutor;
        this.A0A = threadPoolExecutor;
        C18220vy.A02(r7);
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(r8);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Context ");
            sb.append(context);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        scheduledThreadPoolExecutor.execute(new C449025f((Object) this, 13));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new C19550yO("Firebase-Messaging-Topics-Io"));
        Task call = Tasks.call(scheduledThreadPoolExecutor2, new C19590yS(context, this, r6, r4, scheduledThreadPoolExecutor2));
        this.A03 = call;
        call.addOnSuccessListener((Executor) scheduledThreadPoolExecutor, (OnSuccessListener) new C19600yZ(this));
        scheduledThreadPoolExecutor.execute(new C449025f((Object) this, 14));
    }

    public static synchronized C19840z6 A00(Context context) {
        C19840z6 r0;
        synchronized (FirebaseMessaging.class) {
            r0 = A0F;
            if (r0 == null) {
                r0 = new C19840z6(context);
                A0F = r0;
            }
        }
        return r0;
    }

    public static String A01(FirebaseMessaging firebaseMessaging) {
        C18220vy r2 = firebaseMessaging.A04;
        C18220vy.A02(r2);
        if ("[DEFAULT]".equals(r2.A05)) {
            return "";
        }
        return r2.A04();
    }

    public static void A02(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            ScheduledExecutorService scheduledExecutorService = A0E;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = new ScheduledThreadPoolExecutor(1, new C19550yO("TAG"));
                A0E = scheduledExecutorService;
            }
            scheduledExecutorService.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static synchronized FirebaseMessaging getInstance(C18220vy r3) {
        FirebaseMessaging firebaseMessaging;
        Class<FirebaseMessaging> cls = FirebaseMessaging.class;
        synchronized (cls) {
            C18220vy.A02(r3);
            firebaseMessaging = (FirebaseMessaging) r3.A02.BMD(cls);
            C18210vx.A02(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public C61512po A03() {
        C61512po r5;
        C61512po r2;
        C19840z6 A002 = A00(this.A02);
        String A012 = A01(this);
        String A013 = C19480yH.A01(this.A04);
        synchronized (A002) {
            String string = A002.A00.getString(C19840z6.A01(A012, A013), (String) null);
            r5 = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        r2 = new C61512po(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
                    } catch (JSONException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to parse token: ");
                        sb.append(e);
                        Log.w("FirebaseMessaging", sb.toString());
                    }
                } else {
                    r2 = new C61512po(0, string, (String) null);
                }
                r5 = r2;
            }
        }
        return r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r7.equals(r6.A01) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A04() {
        /*
            r8 = this;
            X.2po r6 = r8.A03()
            if (r6 == 0) goto L_0x0022
            X.0yH r0 = r8.A08
            java.lang.String r7 = r0.A03()
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r6.A00
            long r0 = X.C61512po.A03
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0022
            java.lang.String r0 = r6.A01
            boolean r1 = r7.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = r6.A02
            return r0
        L_0x0028:
            X.0vy r0 = r8.A04
            java.lang.String r5 = X.C19480yH.A01(r0)
            X.0yR r4 = r8.A09
            monitor-enter(r4)
            java.util.Map r3 = r4.A00     // Catch:{ all -> 0x00bf }
            java.lang.Object r7 = r3.get(r5)     // Catch:{ all -> 0x00bf }
            com.google.android.gms.tasks.Task r7 = (com.google.android.gms.tasks.Task) r7     // Catch:{ all -> 0x00bf }
            r0 = 3
            if (r7 == 0) goto L_0x0059
            java.lang.String r2 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r2, r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r1.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "Joining ongoing request for: "
            r1.append(r0)     // Catch:{ all -> 0x00bf }
            r1.append(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bf }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x00bf }
            goto L_0x00b0
        L_0x0059:
            java.lang.String r2 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r2, r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0075
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r1.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "Making new request for: "
            r1.append(r0)     // Catch:{ all -> 0x00bf }
            r1.append(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bf }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x00bf }
        L_0x0075:
            X.0yI r7 = r8.A07     // Catch:{ all -> 0x00bf }
            X.0vy r0 = r7.A01     // Catch:{ all -> 0x00bf }
            java.lang.String r2 = X.C19480yH.A01(r0)     // Catch:{ all -> 0x00bf }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x00bf }
            r1.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "*"
            com.google.android.gms.tasks.Task r2 = X.C19490yI.A00(r1, r7, r2, r0)     // Catch:{ all -> 0x00bf }
            r0 = 0
            X.DVv r1 = new X.DVv     // Catch:{ all -> 0x00bf }
            r1.<init>(r0)     // Catch:{ all -> 0x00bf }
            X.2wM r0 = new X.2wM     // Catch:{ all -> 0x00bf }
            r0.<init>(r7)     // Catch:{ all -> 0x00bf }
            com.google.android.gms.tasks.Task r2 = r2.continueWith(r1, r0)     // Catch:{ all -> 0x00bf }
            java.util.concurrent.Executor r1 = r8.A0A     // Catch:{ all -> 0x00bf }
            X.2wU r0 = new X.2wU     // Catch:{ all -> 0x00bf }
            r0.<init>(r8, r6, r5)     // Catch:{ all -> 0x00bf }
            com.google.android.gms.tasks.Task r2 = r2.onSuccessTask(r1, r0)     // Catch:{ all -> 0x00bf }
            java.util.concurrent.Executor r1 = r4.A01     // Catch:{ all -> 0x00bf }
            X.2wO r0 = new X.2wO     // Catch:{ all -> 0x00bf }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x00bf }
            com.google.android.gms.tasks.Task r7 = r2.continueWithTask(r1, r0)     // Catch:{ all -> 0x00bf }
            r3.put(r5, r7)     // Catch:{ all -> 0x00bf }
        L_0x00b0:
            monitor-exit(r4)
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r7)     // Catch:{ InterruptedException | ExecutionException -> 0x00b8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ InterruptedException | ExecutionException -> 0x00b8 }
            return r0
        L_0x00b8:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.A04():java.lang.String");
    }
}
