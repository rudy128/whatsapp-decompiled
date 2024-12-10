package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cxz  reason: case insensitive filesystem */
public class C26342Cxz implements ServiceConnection {
    public boolean A00 = false;
    public BFV A01;
    public final Context A02;
    public final Intent A03;
    public final Queue A04 = new ArrayDeque();
    public final ScheduledExecutorService A05;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("binder is dead. start connection? ");
        android.util.Log.d("FirebaseMessaging", X.AnonymousClass3MY.A0r(r1, !r13.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (r13.A00 != false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r13.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r10 = X.C26111CsX.A00();
        r7 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b9, code lost:
        if (X.C26111CsX.A01(r7, r13.A03, r9, r10, X.C17890vO.A0U(r7), 65) != false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        android.util.Log.e("FirebaseMessaging", "binding to the service failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        android.util.Log.e("FirebaseMessaging", "Exception while binding the service", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void A00() {
        /*
            r13 = this;
            r9 = r13
            monitor-enter(r9)
            java.lang.String r3 = "FirebaseMessaging"
            r7 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r7)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "flush queue called"
            android.util.Log.d(r3, r0)     // Catch:{ all -> 0x00df }
        L_0x0010:
            java.util.Queue r2 = r13.A04     // Catch:{ all -> 0x00df }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00dd
            boolean r0 = android.util.Log.isLoggable(r3, r7)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "found intent to be delivered"
            android.util.Log.d(r3, r0)     // Catch:{ all -> 0x00df }
        L_0x0023:
            X.BFV r0 = r13.A01     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0086
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0086
            boolean r0 = android.util.Log.isLoggable(r3, r7)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "binder is alive, sending the intent."
            android.util.Log.d(r3, r0)     // Catch:{ all -> 0x00df }
        L_0x0038:
            java.lang.Object r8 = r2.poll()     // Catch:{ all -> 0x00df }
            X.CNy r8 = (X.C24880CNy) r8     // Catch:{ all -> 0x00df }
            X.BFV r2 = r13.A01     // Catch:{ all -> 0x00df }
            int r1 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x00df }
            int r0 = android.os.Process.myUid()     // Catch:{ all -> 0x00df }
            if (r1 != r0) goto L_0x007e
            boolean r0 = android.util.Log.isLoggable(r3, r7)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "service received new intent via bind strategy"
            android.util.Log.d(r3, r0)     // Catch:{ all -> 0x00df }
        L_0x0055:
            X.CLU r0 = r2.A00     // Catch:{ all -> 0x00df }
            android.content.Intent r6 = r8.A00     // Catch:{ all -> 0x00df }
            X.BEe r5 = r0.A00     // Catch:{ all -> 0x00df }
            com.google.android.gms.tasks.TaskCompletionSource r4 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch:{ all -> 0x00df }
            r4.<init>()     // Catch:{ all -> 0x00df }
            java.util.concurrent.ExecutorService r2 = r5.A03     // Catch:{ all -> 0x00df }
            r1 = 37
            X.DTg r0 = new X.DTg     // Catch:{ all -> 0x00df }
            r0.<init>(r4, r5, r6, r1)     // Catch:{ all -> 0x00df }
            r2.execute(r0)     // Catch:{ all -> 0x00df }
            com.google.android.gms.tasks.zzw r4 = r4.zza     // Catch:{ all -> 0x00df }
            r0 = 0
            X.DVv r2 = new X.DVv     // Catch:{ all -> 0x00df }
            r2.<init>(r0)     // Catch:{ all -> 0x00df }
            r1 = 1
            X.DKY r0 = new X.DKY     // Catch:{ all -> 0x00df }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x00df }
            r4.addOnCompleteListener((java.util.concurrent.Executor) r2, (com.google.android.gms.tasks.OnCompleteListener) r0)     // Catch:{ all -> 0x00df }
            goto L_0x0010
        L_0x007e:
            java.lang.String r1 = "Binding only allowed within app"
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x00df }
            r0.<init>(r1)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x0086:
            boolean r0 = android.util.Log.isLoggable(r3, r7)     // Catch:{ all -> 0x00df }
            r4 = 1
            if (r0 == 0) goto L_0x00a1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "binder is dead. start connection? "
            r1.append(r0)     // Catch:{ all -> 0x00df }
            boolean r0 = r13.A00     // Catch:{ all -> 0x00df }
            r0 = r0 ^ 1
            java.lang.String r0 = X.AnonymousClass3MY.A0r(r1, r0)     // Catch:{ all -> 0x00df }
            android.util.Log.d(r3, r0)     // Catch:{ all -> 0x00df }
        L_0x00a1:
            boolean r0 = r13.A00     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00dd
            r13.A00 = r4     // Catch:{ all -> 0x00df }
            X.CsX r10 = X.C26111CsX.A00()     // Catch:{ SecurityException -> 0x00c1 }
            android.content.Context r7 = r13.A02     // Catch:{ SecurityException -> 0x00c1 }
            android.content.Intent r8 = r13.A03     // Catch:{ SecurityException -> 0x00c1 }
            r12 = 65
            java.lang.String r11 = X.C17890vO.A0U(r7)     // Catch:{ SecurityException -> 0x00c1 }
            boolean r0 = X.C26111CsX.A01(r7, r8, r9, r10, r11, r12)     // Catch:{ SecurityException -> 0x00c1 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "binding to the service failed"
            android.util.Log.e(r3, r0)     // Catch:{ SecurityException -> 0x00c1 }
            goto L_0x00c7
        L_0x00c1:
            r1 = move-exception
            java.lang.String r0 = "Exception while binding the service"
            android.util.Log.e(r3, r0, r1)     // Catch:{ all -> 0x00df }
        L_0x00c7:
            r0 = 0
            r13.A00 = r0     // Catch:{ all -> 0x00df }
        L_0x00ca:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00dd
            java.lang.Object r0 = r2.poll()     // Catch:{ all -> 0x00df }
            X.CNy r0 = (X.C24880CNy) r0     // Catch:{ all -> 0x00df }
            com.google.android.gms.tasks.TaskCompletionSource r1 = r0.A01     // Catch:{ all -> 0x00df }
            r0 = 0
            r1.trySetResult(r0)     // Catch:{ all -> 0x00df }
            goto L_0x00ca
        L_0x00dd:
            monitor-exit(r9)
            return
        L_0x00df:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26342Cxz.A00():void");
    }

    public synchronized zzw A01(Intent intent) {
        TaskCompletionSource taskCompletionSource;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        C24880CNy cNy = new C24880CNy(intent);
        ScheduledExecutorService scheduledExecutorService = this.A05;
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new C27080DTf((Object) cNy, 33), 20, TimeUnit.SECONDS);
        taskCompletionSource = cNy.A01;
        taskCompletionSource.zza.addOnCompleteListener((Executor) scheduledExecutorService, (OnCompleteListener) new DKY(schedule, 2));
        this.A04.add(cNy);
        A00();
        return taskCompletionSource.zza;
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", AnonymousClass001.A1E(componentName, "onServiceConnected: ", AnonymousClass000.A10()));
        }
        this.A00 = false;
        if (!(iBinder instanceof BFV)) {
            Log.e("FirebaseMessaging", AnonymousClass001.A1E(iBinder, "Invalid service connection: ", AnonymousClass000.A10()));
            while (true) {
                Queue queue = this.A04;
                if (queue.isEmpty()) {
                    break;
                }
                ((C24880CNy) queue.poll()).A01.trySetResult((Object) null);
            }
        } else {
            this.A01 = (BFV) iBinder;
            A00();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", AnonymousClass001.A1E(componentName, "onServiceDisconnected: ", AnonymousClass000.A10()));
        }
        A00();
    }

    public C26342Cxz(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new C19550yO("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A03 = C108945cZ.A0G("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.A05 = scheduledThreadPoolExecutor;
    }
}
