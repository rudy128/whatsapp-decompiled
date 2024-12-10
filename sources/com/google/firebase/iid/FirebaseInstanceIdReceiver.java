package com.google.firebase.iid;

import X.C19550yO;
import X.C21437Ak4;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static SoftReference A00;

    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        Intent intent2 = intent;
        if (intent != null) {
            boolean isOrderedBroadcast = isOrderedBroadcast();
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (FirebaseInstanceIdReceiver.class) {
                SoftReference softReference = A00;
                if (softReference == null || (executorService = (ExecutorService) softReference.get()) == null) {
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new C19550yO("firebase-iid-executor")));
                    A00 = new SoftReference(executorService);
                }
            }
            executorService.execute(new C21437Ak4(this, intent2, context, goAsync, 2, isOrderedBroadcast));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0119 A[Catch:{ CanceledException -> 0x001e, all -> 0x0120 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void A00(android.content.BroadcastReceiver.PendingResult r7, android.content.Context r8, android.content.Intent r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "wrapped_intent"
            android.os.Parcelable r4 = r9.getParcelableExtra(r0)     // Catch:{ all -> 0x0120 }
            boolean r0 = r4 instanceof android.content.Intent     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x0062
            android.content.Intent r4 = (android.content.Intent) r4     // Catch:{ all -> 0x0120 }
            if (r4 == 0) goto L_0x0062
            java.lang.String r1 = "pending_intent"
            android.os.Parcelable r0 = r4.getParcelableExtra(r1)     // Catch:{ all -> 0x0120 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ all -> 0x0120 }
            java.lang.String r3 = "CloudMessagingReceiver"
            if (r0 == 0) goto L_0x0023
            r0.send()     // Catch:{ CanceledException -> 0x001e }
            goto L_0x0023
        L_0x001e:
            java.lang.String r0 = "Notification pending intent canceled"
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x0120 }
        L_0x0023:
            android.os.Bundle r2 = r4.getExtras()     // Catch:{ all -> 0x0120 }
            if (r2 == 0) goto L_0x0035
            r2.remove(r1)     // Catch:{ all -> 0x0120 }
        L_0x002c:
            java.lang.String r0 = r4.getAction()     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            if (r0 == r1) goto L_0x0042
            goto L_0x003a
        L_0x0035:
            android.os.Bundle r2 = X.C17880vN.A0D()     // Catch:{ all -> 0x0120 }
            goto L_0x002c
        L_0x003a:
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x005b
        L_0x0042:
            android.content.Intent r0 = X.C108945cZ.A0G(r1)     // Catch:{ all -> 0x0120 }
            android.content.Intent r2 = r0.putExtras(r2)     // Catch:{ all -> 0x0120 }
            boolean r0 = X.C196439v4.A01(r2)     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r1 = "_nd"
            android.os.Bundle r0 = r2.getExtras()     // Catch:{ all -> 0x0120 }
            X.C196439v4.A00(r1, r0)     // Catch:{ all -> 0x0120 }
            goto L_0x0116
        L_0x005b:
            java.lang.String r0 = "Unknown notification action"
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x0120 }
            goto L_0x0113
        L_0x0062:
            android.os.Bundle r0 = r9.getExtras()     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x0113
            X.Ba5 r0 = new X.Ba5     // Catch:{ all -> 0x0120 }
            r0.<init>(r9)     // Catch:{ all -> 0x0120 }
            android.content.Intent r5 = r0.A00     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = "google.message_id"
            java.lang.String r0 = r5.getStringExtra(r1)     // Catch:{ all -> 0x0120 }
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r5.getStringExtra(r0)     // Catch:{ all -> 0x0120 }
        L_0x007d:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x0089
            r0 = 0
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forResult(r0)     // Catch:{ all -> 0x0120 }
            goto L_0x00c1
        L_0x0089:
            android.os.Bundle r3 = X.C17880vN.A0D()     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = r5.getStringExtra(r1)     // Catch:{ all -> 0x0120 }
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r5.getStringExtra(r0)     // Catch:{ all -> 0x0120 }
        L_0x0099:
            r3.putString(r1, r0)     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = "google.product_id"
            boolean r0 = r5.hasExtra(r2)     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x00b2
            r0 = 0
            int r1 = r5.getIntExtra(r2, r0)     // Catch:{ all -> 0x0120 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x00b2
            r3.putInt(r2, r1)     // Catch:{ all -> 0x0120 }
        L_0x00b2:
            java.lang.String r1 = "supports_message_handled"
            r0 = 1
            r3.putBoolean(r1, r0)     // Catch:{ all -> 0x0120 }
            X.Cpw r1 = X.C25983Cpw.A00(r8)     // Catch:{ all -> 0x0120 }
            r0 = 2
            com.google.android.gms.tasks.zzw r3 = r1.A02(r3, r0)     // Catch:{ all -> 0x0120 }
        L_0x00c1:
            r1 = 0
            X.DVv r4 = new X.DVv     // Catch:{ InterruptedException | ExecutionException -> 0x00ea }
            r4.<init>(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x00ea }
            java.lang.String r2 = "gcm.rawData64"
            java.lang.String r0 = r5.getStringExtra(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x00ea }
            if (r0 == 0) goto L_0x00db
            byte[] r1 = android.util.Base64.decode(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x00ea }
            java.lang.String r0 = "rawData"
            r5.putExtra(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x00ea }
            r5.removeExtra(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x00ea }
        L_0x00db:
            com.google.android.gms.tasks.Task r0 = X.C25924Con.A00(r8, r5, r4)     // Catch:{ InterruptedException | ExecutionException -> 0x00ea }
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x00ea }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ InterruptedException | ExecutionException -> 0x00ea }
            int r4 = r0.intValue()     // Catch:{ InterruptedException | ExecutionException -> 0x00ea }
            goto L_0x00f4
        L_0x00ea:
            r2 = move-exception
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r0 = "Failed to send message to service."
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0120 }
            r4 = 500(0x1f4, float:7.0E-43)
        L_0x00f4:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0102 }
            r0 = 1
            long r1 = r2.toMillis(r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0102 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0102 }
            com.google.android.gms.tasks.Tasks.await(r3, r1, r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0102 }
            goto L_0x0117
        L_0x0102:
            r0 = move-exception
            java.lang.String r1 = "Message ack failed: "
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = r1.concat(r0)     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "CloudMessagingReceiver"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0120 }
            goto L_0x0117
        L_0x0113:
            r4 = 500(0x1f4, float:7.0E-43)
            goto L_0x0117
        L_0x0116:
            r4 = -1
        L_0x0117:
            if (r10 == 0) goto L_0x011c
            r7.setResultCode(r4)     // Catch:{ all -> 0x0120 }
        L_0x011c:
            r7.finish()
            return
        L_0x0120:
            r0 = move-exception
            r7.finish()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A00(android.content.BroadcastReceiver$PendingResult, android.content.Context, android.content.Intent, boolean):void");
    }

    public FirebaseInstanceIdReceiver(int i) {
    }

    public FirebaseInstanceIdReceiver() {
    }
}
