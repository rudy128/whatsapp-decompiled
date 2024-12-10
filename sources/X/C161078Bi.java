package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: X.8Bi  reason: invalid class name and case insensitive filesystem */
public abstract class C161078Bi extends Service {
    public static final Object A05 = C17880vN.A0p();
    public static final HashMap A06 = C17880vN.A11();
    public AnonymousClass8CT A00;
    public C22491B9x A01;
    public C194149rF A02;
    public boolean A03 = false;
    public final ArrayList A04;

    public static void A00(Context context, Intent intent, Class cls, int i) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (A05) {
                HashMap hashMap = A06;
                C194149rF r0 = (C194149rF) hashMap.get(componentName);
                if (r0 == null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        r0 = new AnonymousClass8E7(componentName, context, i);
                    } else {
                        r0 = new AnonymousClass8E6(componentName, context);
                    }
                    hashMap.put(componentName, r0);
                }
                r0.A01(i);
                r0.A02(intent);
            }
            return;
        }
        throw AnonymousClass000.A0k("work must not be null");
    }

    public C22492B9y A06() {
        C22491B9x b9x = this.A01;
        if (b9x != null) {
            return b9x.BIU();
        }
        ArrayList arrayList = this.A04;
        synchronized (arrayList) {
            if (arrayList.size() <= 0) {
                return null;
            }
            C22492B9y b9y = (C22492B9y) arrayList.remove(0);
            return b9y;
        }
    }

    public void A07() {
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A00 = null;
                if (arrayList.size() > 0) {
                    A09(false);
                } else if (!this.A03) {
                    this.A02.A00();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        com.whatsapp.push.RegistrationIntentService.A05(r1, r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.content.Intent r21) {
        /*
            r20 = this;
            r1 = r20
            boolean r0 = r1 instanceof com.whatsapp.push.RegistrationIntentService
            r4 = r21
            if (r0 == 0) goto L_0x002e
            com.whatsapp.push.RegistrationIntentService r1 = (com.whatsapp.push.RegistrationIntentService) r1
            java.lang.Boolean r0 = X.C17960vV.A01
            java.lang.String r0 = "com.whatsapp.action.VERIFY"
            boolean r17 = X.C17890vO.A1S(r4, r0)
            java.lang.String r0 = "com.whatsapp.action.REFRESH"
            boolean r18 = X.C17890vO.A1S(r4, r0)
            java.lang.String r0 = "com.whatsapp.action.FORCE_REPLACE"
            boolean r19 = X.C17890vO.A1S(r4, r0)
            if (r18 != 0) goto L_0x00e7
            if (r17 != 0) goto L_0x00e7
            if (r19 != 0) goto L_0x00e7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GCM: registration intent action was unknown; intent="
            X.C17900vP.A0Z(r4, r0, r1)
        L_0x002d:
            return
        L_0x002e:
            boolean r0 = r1 instanceof com.whatsapp.perf.profilo.ProfiloUploadService
            if (r0 == 0) goto L_0x01c7
            com.whatsapp.perf.profilo.ProfiloUploadService r1 = (com.whatsapp.perf.profilo.ProfiloUploadService) r1
            java.io.File r2 = r1.getCacheDir()
            java.lang.String r0 = "profilo/upload"
            java.io.File r3 = X.C17880vN.A0e(r2, r0)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x002d
            r2 = 2
            X.DRQ r0 = new X.DRQ
            r0.<init>(r2)
            java.io.File[] r4 = r3.listFiles(r0)
            if (r4 == 0) goto L_0x002d
            int r3 = r4.length
            if (r3 == 0) goto L_0x002d
            r16 = 0
            r2 = 1
        L_0x0056:
            if (r2 >= r3) goto L_0x0065
            r0 = r4[r2]
            r0.delete()
            r0 = r4[r2]
            r0.getPath()
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0065:
            r3 = r4[r16]
            X.11E r0 = r1.A02
            r2 = 1
            int r0 = r0.A03(r2)
            if (r0 != r2) goto L_0x00e1
            r0 = 3
            X.AUa r8 = new X.AUa     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            r8.<init>(r3, r1, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            X.18j r10 = r1.A04     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r11 = "https://crashlogs.whatsapp.net/wa_profilo_data"
            X.11W r0 = r1.A05     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r12 = r0.A02()     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            X.181 r7 = r1.A01     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            r9 = 0
            r15 = 7
            X.A7N r6 = new X.A7N     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            r14 = r9
            r18 = r16
            r13 = r9
            r17 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r2 = "access_token"
            java.lang.String r0 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r6.A06(r2, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r2 = "from"
            X.190 r0 = r1.A00     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r0 = r0.A0A()     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            r6.A06(r2, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.io.FileInputStream r2 = X.C108945cZ.A18(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r0 = "file"
            X.A7N.A03(r6, r3, r2, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r5 = "agent"
            X.190 r0 = r1.A00     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            X.192 r0 = (X.AnonymousClass192) r0     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            X.11W r4 = r0.A0B     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            X.118 r2 = r0.A07     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r0 = X.C18170vs.A02()     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r0 = X.AnonymousClass11W.A00(r2, r4, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            r6.A06(r5, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r2 = "build_id"
            r4 = 670735092(0x27fa9af4, double:3.313871664E-315)
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            r6.A06(r2, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r2 = "device_id"
            X.0z4 r0 = r1.A03     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            java.lang.String r0 = r0.A0j()     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            r6.A06(r2, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            r6.A04(r9)     // Catch:{ Exception | OutOfMemoryError -> 0x00db }
            goto L_0x01c6
        L_0x00db:
            r1 = move-exception
            java.lang.String r0 = "ProfiloUploadService/Error Uploading file"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00e1:
            if (r3 == 0) goto L_0x002d
            r3.delete()
            return
        L_0x00e7:
            com.whatsapp.push.RegistrationIntentService.A04(r1)
            android.content.Context r0 = r1.getApplicationContext()
            X.0vy r0 = X.C18220vy.A01(r0)
            boolean r3 = X.AnonymousClass000.A1W(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GCM: Init firebase success:"
            X.C17900vP.A0n(r0, r2, r3)
            long r10 = android.os.Binder.clearCallingIdentity()
            X.00H r0 = r1.A0B     // Catch:{ all -> 0x01c1 }
            X.0z4 r0 = X.C17880vN.A0K(r0)     // Catch:{ all -> 0x01c1 }
            java.lang.String r9 = r0.A0g()     // Catch:{ all -> 0x01c1 }
            if (r19 == 0) goto L_0x0141
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x01b9 }
            java.lang.String r0 = "GCM: verifying tokenUnregisteredOnServer deleting savedToken:"
            X.C17900vP.A0f(r0, r9, r2)     // Catch:{ SecurityException -> 0x01b9 }
            com.whatsapp.push.RegistrationIntentService.A04(r1)     // Catch:{ SecurityException -> 0x01b9 }
            java.lang.Class<com.google.firebase.messaging.FirebaseMessaging> r2 = com.google.firebase.messaging.FirebaseMessaging.class
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x01b9 }
            X.0vy r0 = X.C18220vy.A00()     // Catch:{ all -> 0x01b6 }
            com.google.firebase.messaging.FirebaseMessaging r6 = com.google.firebase.messaging.FirebaseMessaging.getInstance(r0)     // Catch:{ all -> 0x01b6 }
            monitor-exit(r2)     // Catch:{ SecurityException -> 0x01b9 }
            X.2po r0 = r6.A03()     // Catch:{ SecurityException -> 0x01b9 }
            if (r0 != 0) goto L_0x016a
            r0 = 0
            com.google.android.gms.tasks.Tasks.forResult(r0)     // Catch:{ SecurityException -> 0x01b9 }
        L_0x0131:
            X.00H r0 = r1.A0B     // Catch:{ SecurityException -> 0x01b9 }
            X.0z4 r0 = X.C17880vN.A0K(r0)     // Catch:{ SecurityException -> 0x01b9 }
            r3 = 0
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r0)     // Catch:{ SecurityException -> 0x01b9 }
            java.lang.String r0 = "saved_gcm_token_server_unreg"
            X.C17880vN.A1F(r2, r0, r3)     // Catch:{ SecurityException -> 0x01b9 }
        L_0x0141:
            java.lang.Boolean r0 = X.C17970vW.A01     // Catch:{ SecurityException -> 0x01b9 }
            r0 = 1
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch     // Catch:{ SecurityException -> 0x01b9 }
            r6.<init>(r0)     // Catch:{ SecurityException -> 0x01b9 }
            com.whatsapp.push.RegistrationIntentService.A04(r1)     // Catch:{ SecurityException -> 0x01b9 }
            X.00H r0 = r1.A0C     // Catch:{ SecurityException -> 0x01b9 }
            X.10I r2 = X.AnonymousClass3MX.A0x(r0)     // Catch:{ SecurityException -> 0x01b9 }
            r2.getClass()     // Catch:{ SecurityException -> 0x01b9 }
            r0 = 1
            X.AlB r8 = new X.AlB     // Catch:{ SecurityException -> 0x01b9 }
            r8.<init>(r2, r0)     // Catch:{ SecurityException -> 0x01b9 }
            X.AJE r7 = new X.AJE     // Catch:{ SecurityException -> 0x01b9 }
            r12 = r7
            r13 = r4
            r14 = r1
            r15 = r9
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SecurityException -> 0x01b9 }
            java.lang.Class<com.google.firebase.messaging.FirebaseMessaging> r2 = com.google.firebase.messaging.FirebaseMessaging.class
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x01b9 }
            goto L_0x0185
        L_0x016a:
            com.google.android.gms.tasks.TaskCompletionSource r5 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch:{ SecurityException -> 0x01b9 }
            r5.<init>()     // Catch:{ SecurityException -> 0x01b9 }
            java.lang.String r2 = "Firebase-Messaging-Network-Io"
            X.0yO r0 = new X.0yO     // Catch:{ SecurityException -> 0x01b9 }
            r0.<init>(r2)     // Catch:{ SecurityException -> 0x01b9 }
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)     // Catch:{ SecurityException -> 0x01b9 }
            r2 = 17
            X.3Cf r0 = new X.3Cf     // Catch:{ SecurityException -> 0x01b9 }
            r0.<init>(r6, r5, r2)     // Catch:{ SecurityException -> 0x01b9 }
            r3.execute(r0)     // Catch:{ SecurityException -> 0x01b9 }
            goto L_0x0131
        L_0x0185:
            X.0vy r0 = X.C18220vy.A00()     // Catch:{ all -> 0x01b6 }
            com.google.firebase.messaging.FirebaseMessaging r5 = com.google.firebase.messaging.FirebaseMessaging.getInstance(r0)     // Catch:{ all -> 0x01b6 }
            monitor-exit(r2)     // Catch:{ SecurityException -> 0x01b9 }
            com.google.android.gms.tasks.TaskCompletionSource r4 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch:{ SecurityException -> 0x01b9 }
            r4.<init>()     // Catch:{ SecurityException -> 0x01b9 }
            java.util.concurrent.Executor r3 = r5.A0B     // Catch:{ SecurityException -> 0x01b9 }
            r2 = 16
            X.3Cf r0 = new X.3Cf     // Catch:{ SecurityException -> 0x01b9 }
            r0.<init>(r5, r4, r2)     // Catch:{ SecurityException -> 0x01b9 }
            r3.execute(r0)     // Catch:{ SecurityException -> 0x01b9 }
            com.google.android.gms.tasks.zzw r0 = r4.zza     // Catch:{ SecurityException -> 0x01b9 }
            r0.addOnCompleteListener((java.util.concurrent.Executor) r8, (com.google.android.gms.tasks.OnCompleteListener) r7)     // Catch:{ SecurityException -> 0x01b9 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x01ac }
            r2 = 30
            r6.await(r2, r0)     // Catch:{ InterruptedException -> 0x01ac }
            goto L_0x01bd
        L_0x01ac:
            r4 = move-exception
            X.190 r3 = r1.A00     // Catch:{ SecurityException -> 0x01b9 }
            java.lang.String r2 = "gcm-get-token-stuck"
            r0 = 0
            r3.A0E(r2, r0, r4)     // Catch:{ SecurityException -> 0x01b9 }
            goto L_0x01bd
        L_0x01b6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ SecurityException -> 0x01b9 }
            throw r0     // Catch:{ SecurityException -> 0x01b9 }
        L_0x01b9:
            r0 = move-exception
            com.whatsapp.push.RegistrationIntentService.A05(r1, r0)     // Catch:{ all -> 0x01c1 }
        L_0x01bd:
            android.os.Binder.restoreCallingIdentity(r10)
            return
        L_0x01c1:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r10)
            throw r0
        L_0x01c6:
            return
        L_0x01c7:
            com.whatsapp.AlarmService r1 = (com.whatsapp.AlarmService) r1
            java.lang.String r6 = r4.getAction()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AlarmService/onHandleWork received intent with action "
            X.C17900vP.A0f(r0, r6, r2)
            if (r6 != 0) goto L_0x01de
            java.lang.String r0 = "AlarmService/onHandleWork received null action in intent"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x01de:
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r1.A00
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x01ec
            java.lang.String r0 = "AlarmService/onHandleWork skip, native libraries missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x01ec:
            r5 = 0
            java.lang.String r0 = "com.whatsapp.action.SETUP"
            boolean r0 = android.text.TextUtils.equals(r6, r0)     // Catch:{ all -> 0x0266 }
            if (r0 == 0) goto L_0x0224
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0266 }
            java.lang.String r0 = "AlarmService/setup; intent="
            X.C17900vP.A0Y(r4, r0, r2)     // Catch:{ all -> 0x0266 }
            X.00H r0 = r1.A01     // Catch:{ all -> 0x0266 }
            java.util.Iterator r4 = X.C17890vO.A0h(r0)     // Catch:{ all -> 0x0266 }
        L_0x0204:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0266 }
            if (r0 == 0) goto L_0x0263
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0266 }
            X.9u4 r3 = (X.C195879u4) r3     // Catch:{ all -> 0x0266 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0266 }
            java.lang.String r0 = "AlarmService/setup: "
            r2.append(r0)     // Catch:{ all -> 0x0266 }
            java.lang.String r0 = X.C17890vO.A0U(r3)     // Catch:{ all -> 0x0266 }
            X.C17890vO.A1A(r2, r0)     // Catch:{ all -> 0x0266 }
            r3.A04()     // Catch:{ all -> 0x0266 }
            goto L_0x0204
        L_0x0224:
            X.00H r0 = r1.A01     // Catch:{ all -> 0x0266 }
            java.util.Iterator r2 = X.C17890vO.A0h(r0)     // Catch:{ all -> 0x0266 }
        L_0x022a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0266 }
            if (r0 == 0) goto L_0x025a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0266 }
            X.9u4 r3 = (X.C195879u4) r3     // Catch:{ all -> 0x0266 }
            boolean r0 = r3.A06(r4)     // Catch:{ all -> 0x0266 }
            if (r0 == 0) goto L_0x022a
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0266 }
            java.lang.String r0 = "AlarmService/onHandleWork: handling "
            r2.append(r0)     // Catch:{ all -> 0x0266 }
            r2.append(r6)     // Catch:{ all -> 0x0266 }
            java.lang.String r0 = " using "
            r2.append(r0)     // Catch:{ all -> 0x0266 }
            java.lang.String r0 = X.C17890vO.A0U(r3)     // Catch:{ all -> 0x0266 }
            X.C17890vO.A1A(r2, r0)     // Catch:{ all -> 0x0266 }
            r1.A02 = r3     // Catch:{ all -> 0x0266 }
            r3.A05(r4)     // Catch:{ all -> 0x0266 }
            goto L_0x0263
        L_0x025a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0266 }
            java.lang.String r0 = "AlarmService/onHandleWork: received unrecognized intent; intent="
            X.C17900vP.A0Z(r4, r0, r2)     // Catch:{ all -> 0x0266 }
        L_0x0263:
            r1.A02 = r5
            return
        L_0x0266:
            r0 = move-exception
            r1.A02 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161078Bi.A08(android.content.Intent):void");
    }

    public void A09(boolean z) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass8CT(this);
            C194149rF r3 = this.A02;
            if (r3 != null && z && (r3 instanceof AnonymousClass8E6)) {
                AnonymousClass8E6 r32 = (AnonymousClass8E6) r3;
                synchronized (r32) {
                    if (!r32.A01) {
                        r32.A01 = true;
                        r32.A04.acquire(600000);
                        r32.A03.release();
                    }
                }
            }
            this.A00.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public IBinder onBind(Intent intent) {
        C22491B9x b9x = this.A01;
        if (b9x != null) {
            return b9x.BFL();
        }
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ArrayList arrayList = this.A04;
        if (arrayList == null) {
            return 2;
        }
        C194149rF r1 = this.A02;
        if (r1 instanceof AnonymousClass8E6) {
            AnonymousClass8E6 r12 = (AnonymousClass8E6) r1;
            synchronized (r12) {
                r12.A00 = false;
            }
        }
        synchronized (arrayList) {
            if (intent == null) {
                intent = C17880vN.A0A();
            }
            arrayList.add(new AGP(intent, this, i2));
            A09(true);
        }
        return 3;
    }

    public C161078Bi() {
        ArrayList A13;
        if (Build.VERSION.SDK_INT >= 26) {
            A13 = null;
        } else {
            A13 = AnonymousClass000.A13();
        }
        this.A04 = A13;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.A01 = new AnonymousClass8Bn(this);
            this.A02 = null;
            return;
        }
        this.A01 = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = A06;
        C194149rF r0 = (C194149rF) hashMap.get(componentName);
        if (r0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                throw AnonymousClass000.A0k("Can't be here without a job id");
            }
            r0 = new AnonymousClass8E6(componentName, this);
            hashMap.put(componentName, r0);
        }
        this.A02 = r0;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A03 = true;
                this.A02.A00();
            }
        }
    }
}
