package com.google.firebase.messaging;

import X.C19500yJ;
import X.C22580BEe;
import X.C23026Ba2;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends C22580BEe {
    public static final Queue A01 = new ArrayDeque(10);
    public C19500yJ A00;

    public void A02() {
    }

    public void A03() {
    }

    public void A04(C23026Ba2 ba2) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: X.0vz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: long} */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.Ba2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v15, types: [java.lang.Object, X.9tB] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02be A[Catch:{ NumberFormatException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f6 A[Catch:{ RuntimeException -> 0x03aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0391 A[Catch:{ RuntimeException -> 0x03aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Intent r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r2 = r0.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r2)
            r3 = r27
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0029
            java.lang.String r1 = "token"
            r0.getStringExtra(r1)
            r3.A03()
            return
        L_0x0029:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Unknown intent action: "
            r2.append(r1)
            java.lang.String r0 = r0.getAction()
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r2)
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.d(r0, r1)
            return
        L_0x0040:
            java.lang.String r2 = "google.message_id"
            java.lang.String r6 = r0.getStringExtra(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x00cd
            java.util.Queue r5 = A01
            boolean r1 = r5.contains(r6)
            if (r1 == 0) goto L_0x00bf
            r1 = 3
            java.lang.String r5 = "FirebaseMessaging"
            boolean r1 = android.util.Log.isLoggable(r5, r1)
            if (r1 == 0) goto L_0x006a
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Received duplicate message: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r6, r4)
            android.util.Log.d(r5, r1)
        L_0x006a:
            X.0yJ r4 = r3.A00
            if (r4 != 0) goto L_0x0079
            android.content.Context r1 = r3.getApplicationContext()
            X.0yJ r4 = new X.0yJ
            r4.<init>(r1)
            r3.A00 = r4
        L_0x0079:
            X.Ba5 r5 = new X.Ba5
            r5.<init>(r0)
            X.0yL r0 = r4.A04
            int r1 = r0.A00()
            r0 = 233700000(0xdedfaa0, float:1.46665885E-30)
            if (r1 < r0) goto L_0x0509
            android.os.Bundle r3 = X.C17880vN.A0D()
            android.content.Intent r1 = r5.A00
            java.lang.String r0 = r1.getStringExtra(r2)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r1.getStringExtra(r0)
        L_0x009b:
            r3.putString(r2, r0)
            java.lang.String r2 = "google.product_id"
            boolean r0 = r1.hasExtra(r2)
            if (r0 == 0) goto L_0x00b4
            r0 = 0
            int r1 = r1.getIntExtra(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00b4
            r3.putInt(r2, r1)
        L_0x00b4:
            android.content.Context r0 = r4.A02
            X.Cpw r1 = X.C25983Cpw.A00(r0)
            r0 = 3
            r1.A02(r3, r0)
            return
        L_0x00bf:
            int r4 = r5.size()
            r1 = 10
            if (r4 < r1) goto L_0x00ca
            r5.remove()
        L_0x00ca:
            r5.add(r6)
        L_0x00cd:
            java.lang.String r1 = "message_type"
            java.lang.String r5 = r0.getStringExtra(r1)
            java.lang.String r4 = "gcm"
            if (r5 != 0) goto L_0x00d8
            r5 = r4
        L_0x00d8:
            int r1 = r5.hashCode()
            switch(r1) {
                case -2062414158: goto L_0x013e;
                case 102161: goto L_0x011d;
                case 814694033: goto L_0x00fd;
                case 814800675: goto L_0x00f0;
                default: goto L_0x00df;
            }
        L_0x00df:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Received message with unknown type: "
            java.lang.String r4 = X.AnonymousClass001.A1H(r1, r5, r4)
            java.lang.String r1 = "FirebaseMessaging"
            android.util.Log.w(r1, r4)
            goto L_0x006a
        L_0x00f0:
            java.lang.String r1 = "send_event"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00df
            r0.getStringExtra(r2)
            goto L_0x006a
        L_0x00fd:
            java.lang.String r1 = "send_error"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00df
            java.lang.String r1 = r0.getStringExtra(r2)
            if (r1 != 0) goto L_0x0110
            java.lang.String r1 = "message_id"
            r0.getStringExtra(r1)
        L_0x0110:
            java.lang.String r1 = "error"
            java.lang.String r4 = r0.getStringExtra(r1)
            X.9Kz r1 = new X.9Kz
            r1.<init>(r4)
            goto L_0x006a
        L_0x011d:
            boolean r1 = r5.equals(r4)
            if (r1 == 0) goto L_0x00df
            boolean r1 = X.C196439v4.A01(r0)
            if (r1 == 0) goto L_0x0132
            java.lang.String r4 = "_nr"
            android.os.Bundle r1 = r0.getExtras()
            X.C196439v4.A00(r4, r1)
        L_0x0132:
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = X.C17890vO.A1S(r0, r1)
            if (r1 != 0) goto L_0x03b8
            java.lang.String r7 = "delivery_metrics_exported_to_big_query_enabled"
            r6 = 0
            goto L_0x014b
        L_0x013e:
            java.lang.String r1 = "deleted_messages"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00df
            r3.A02()
            goto L_0x006a
        L_0x014b:
            X.C18220vy.A00()     // Catch:{ IllegalStateException -> 0x03b1 }
            X.0vy r1 = X.C18220vy.A00()
            X.C18220vy.A02(r1)
            android.content.Context r8 = r1.A00
            java.lang.String r1 = "com.google.firebase.messaging"
            android.content.SharedPreferences r5 = r8.getSharedPreferences(r1, r6)
            java.lang.String r4 = "export_to_big_query"
            boolean r1 = r5.contains(r4)
            if (r1 == 0) goto L_0x017a
            boolean r1 = r5.getBoolean(r4, r6)
        L_0x0169:
            if (r1 == 0) goto L_0x03b8
            X.9JQ r14 = X.AnonymousClass9JQ.MESSAGE_DELIVERED
            X.0wf r6 = com.google.firebase.messaging.FirebaseMessaging.A0D
            java.lang.String r1 = "FirebaseMessaging"
            if (r6 != 0) goto L_0x019d
            java.lang.String r4 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r1, r4)
            goto L_0x03b8
        L_0x017a:
            android.content.pm.PackageManager r5 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x03b8 }
            if (r5 == 0) goto L_0x03b8
            java.lang.String r4 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x03b8 }
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r5.getApplicationInfo(r4, r1)     // Catch:{ NameNotFoundException -> 0x03b8 }
            if (r4 == 0) goto L_0x03b8
            android.os.Bundle r1 = r4.metaData     // Catch:{ NameNotFoundException -> 0x03b8 }
            if (r1 == 0) goto L_0x03b8
            boolean r1 = r1.containsKey(r7)     // Catch:{ NameNotFoundException -> 0x03b8 }
            if (r1 == 0) goto L_0x03b8
            android.os.Bundle r1 = r4.metaData     // Catch:{ NameNotFoundException -> 0x03b8 }
            boolean r1 = r1.getBoolean(r7, r6)     // Catch:{ NameNotFoundException -> 0x03b8 }
            goto L_0x0169
        L_0x019d:
            android.os.Bundle r7 = r0.getExtras()
            if (r7 != 0) goto L_0x01a5
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x01a5:
            r25 = 0
            java.lang.String r17 = ""
            r10 = r17
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            java.lang.String r4 = "google.ttl"
            java.lang.Object r8 = r7.get(r4)
            boolean r4 = r8 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x01ce
            int r24 = X.AnonymousClass000.A0M(r8)
        L_0x01c1:
            java.lang.String r4 = "google.to"
            java.lang.String r5 = r7.getString(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L_0x0205
            goto L_0x01ea
        L_0x01ce:
            boolean r4 = r8 instanceof java.lang.String
            if (r4 == 0) goto L_0x01e7
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NumberFormatException -> 0x01da }
            int r24 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x01da }
            goto L_0x01c1
        L_0x01da:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "Invalid TTL: "
            java.lang.String r4 = X.AnonymousClass001.A1E(r8, r4, r5)
            android.util.Log.w(r1, r4)
        L_0x01e7:
            r24 = 0
            goto L_0x01c1
        L_0x01ea:
            X.0vy r4 = X.C18220vy.A00()     // Catch:{ InterruptedException | ExecutionException -> 0x0513 }
            java.lang.Class<X.0wV> r5 = X.C18480wV.class
            X.C18220vy.A02(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0513 }
            X.0wM r4 = r4.A02     // Catch:{ InterruptedException | ExecutionException -> 0x0513 }
            java.lang.Object r4 = r4.BMD(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0513 }
            X.0wV r4 = (X.C18480wV) r4     // Catch:{ InterruptedException | ExecutionException -> 0x0513 }
            com.google.android.gms.tasks.Task r4 = r4.A03()     // Catch:{ InterruptedException | ExecutionException -> 0x0513 }
            java.lang.Object r5 = com.google.android.gms.tasks.Tasks.await(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0513 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ InterruptedException | ExecutionException -> 0x0513 }
        L_0x0205:
            X.0vy r4 = X.C18220vy.A00()
            X.C18220vy.A02(r4)
            android.content.Context r4 = r4.A00
            java.lang.String r19 = r4.getPackageName()
            X.9JR r16 = X.AnonymousClass9JR.ANDROID
            boolean r4 = X.AnonymousClass72P.A01(r7)
            if (r4 == 0) goto L_0x0265
            X.9JS r15 = X.AnonymousClass9JS.DISPLAY_NOTIFICATION
        L_0x021c:
            java.lang.String r4 = r7.getString(r2)
            if (r4 != 0) goto L_0x022a
            java.lang.String r4 = "message_id"
            java.lang.String r4 = r7.getString(r4)
            if (r4 == 0) goto L_0x022c
        L_0x022a:
            r17 = r4
        L_0x022c:
            java.lang.String r4 = "from"
            java.lang.String r4 = r7.getString(r4)
            if (r4 == 0) goto L_0x023e
            java.lang.String r8 = "/topics/"
            boolean r8 = r4.startsWith(r8)
            if (r8 == 0) goto L_0x023e
            r21 = r4
        L_0x023e:
            java.lang.String r4 = "collapse_key"
            java.lang.String r4 = r7.getString(r4)
            if (r4 == 0) goto L_0x0248
            r20 = r4
        L_0x0248:
            java.lang.String r4 = "google.c.a.m_l"
            java.lang.String r4 = r7.getString(r4)
            if (r4 == 0) goto L_0x0252
            r22 = r4
        L_0x0252:
            java.lang.String r4 = "google.c.a.c_l"
            java.lang.String r4 = r7.getString(r4)
            if (r4 == 0) goto L_0x025c
            r23 = r4
        L_0x025c:
            java.lang.String r4 = "google.c.sender.id"
            boolean r8 = r7.containsKey(r4)
            if (r8 == 0) goto L_0x0277
            goto L_0x0268
        L_0x0265:
            X.9JS r15 = X.AnonymousClass9JS.DATA_MESSAGE
            goto L_0x021c
        L_0x0268:
            java.lang.String r4 = r7.getString(r4)     // Catch:{ NumberFormatException -> 0x0271 }
            long r7 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0271 }
            goto L_0x02ba
        L_0x0271:
            r7 = move-exception
            java.lang.String r4 = "error parsing project number"
            android.util.Log.w(r1, r4, r7)
        L_0x0277:
            X.0vy r9 = X.C18220vy.A00()
            X.C18220vy.A02(r9)
            X.0vz r7 = r9.A01
            java.lang.String r4 = r7.A02
            if (r4 == 0) goto L_0x028f
            long r7 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0289 }
            goto L_0x02ba
        L_0x0289:
            r8 = move-exception
            java.lang.String r4 = "error parsing sender ID"
            android.util.Log.w(r1, r4, r8)
        L_0x028f:
            X.C18220vy.A02(r9)
            java.lang.String r7 = r7.A01
            java.lang.String r4 = "1:"
            boolean r4 = r7.startsWith(r4)
            java.lang.String r9 = "error parsing app ID"
            if (r4 != 0) goto L_0x02a3
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x02c1 }
            goto L_0x02ba
        L_0x02a3:
            java.lang.String r4 = ":"
            java.lang.String[] r7 = r7.split(r4)
            int r8 = r7.length
            r4 = 2
            if (r8 < r4) goto L_0x02c5
            r4 = 1
            r7 = r7[r4]
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x02c5
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x02c1 }
        L_0x02ba:
            int r4 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r4 <= 0) goto L_0x02c5
            r25 = r7
            goto L_0x02c5
        L_0x02c1:
            r4 = move-exception
            android.util.Log.w(r1, r9, r4)
        L_0x02c5:
            X.CU7 r13 = new X.CU7
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r5 = "google.product_id"
            r4 = 111881503(0x6ab2d1f, float:6.438935E-35)
            int r4 = r0.getIntExtra(r5, r4)     // Catch:{ RuntimeException -> 0x03aa }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ RuntimeException -> 0x03aa }
            X.8Qz r7 = new X.8Qz     // Catch:{ RuntimeException -> 0x03aa }
            r7.<init>(r4)     // Catch:{ RuntimeException -> 0x03aa }
            java.lang.String r8 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.String r4 = "proto"
            X.0xy r11 = new X.0xy     // Catch:{ RuntimeException -> 0x03aa }
            r11.<init>(r4)     // Catch:{ RuntimeException -> 0x03aa }
            X.AJ2 r12 = new X.AJ2     // Catch:{ RuntimeException -> 0x03aa }
            r12.<init>()     // Catch:{ RuntimeException -> 0x03aa }
            X.0yG r6 = (X.C19470yG) r6     // Catch:{ RuntimeException -> 0x03aa }
            java.util.Set r9 = r6.A02     // Catch:{ RuntimeException -> 0x03aa }
            boolean r4 = r9.contains(r11)     // Catch:{ RuntimeException -> 0x03aa }
            if (r4 == 0) goto L_0x0391
            X.0yE r5 = r6.A00     // Catch:{ RuntimeException -> 0x03aa }
            X.0xG r4 = r6.A01     // Catch:{ RuntimeException -> 0x03aa }
            X.9e8 r6 = new X.9e8     // Catch:{ RuntimeException -> 0x03aa }
            r6.<init>(r11, r12, r5, r4)     // Catch:{ RuntimeException -> 0x03aa }
            X.9xB r5 = new X.9xB     // Catch:{ RuntimeException -> 0x03aa }
            r5.<init>(r13)     // Catch:{ RuntimeException -> 0x03aa }
            X.0xz r4 = X.C19300xz.DEFAULT     // Catch:{ RuntimeException -> 0x03aa }
            X.8Qy r9 = new X.8Qy     // Catch:{ RuntimeException -> 0x03aa }
            r9.<init>(r4, r7, r5)     // Catch:{ RuntimeException -> 0x03aa }
            X.9Ow r14 = new X.9Ow     // Catch:{ RuntimeException -> 0x03aa }
            r14.<init>()     // Catch:{ RuntimeException -> 0x03aa }
            X.0xG r11 = r6.A02     // Catch:{ RuntimeException -> 0x03aa }
            X.0yE r12 = r6.A01     // Catch:{ RuntimeException -> 0x03aa }
            X.0xy r7 = r6.A00     // Catch:{ RuntimeException -> 0x03aa }
            boolean r4 = r10.isEmpty()     // Catch:{ RuntimeException -> 0x03aa }
            if (r4 == 0) goto L_0x0383
            X.0xH r11 = (X.C18860xH) r11     // Catch:{ RuntimeException -> 0x03aa }
            X.0y7 r13 = r11.A00     // Catch:{ RuntimeException -> 0x03aa }
            X.0xz r6 = r9.A00     // Catch:{ RuntimeException -> 0x03aa }
            X.0yF r12 = (X.C19460yF) r12     // Catch:{ RuntimeException -> 0x03aa }
            java.lang.String r5 = r12.A01     // Catch:{ RuntimeException -> 0x03aa }
            if (r5 == 0) goto L_0x03a3
            if (r6 == 0) goto L_0x037c
            byte[] r4 = r12.A02     // Catch:{ RuntimeException -> 0x03aa }
            X.0yF r15 = X.C19440yD.A00(r6, r5, r4)     // Catch:{ RuntimeException -> 0x03aa }
            X.9tB r6 = new X.9tB     // Catch:{ RuntimeException -> 0x03aa }
            r6.<init>()     // Catch:{ RuntimeException -> 0x03aa }
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ RuntimeException -> 0x03aa }
            r6.A05 = r4     // Catch:{ RuntimeException -> 0x03aa }
            X.0xi r4 = r11.A02     // Catch:{ RuntimeException -> 0x03aa }
            long r4 = r4.BaO()     // Catch:{ RuntimeException -> 0x03aa }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ RuntimeException -> 0x03aa }
            r6.A02 = r4     // Catch:{ RuntimeException -> 0x03aa }
            X.0xi r4 = r11.A03     // Catch:{ RuntimeException -> 0x03aa }
            long r4 = r4.BaO()     // Catch:{ RuntimeException -> 0x03aa }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ RuntimeException -> 0x03aa }
            r6.A03 = r4     // Catch:{ RuntimeException -> 0x03aa }
            r6.A04 = r8     // Catch:{ RuntimeException -> 0x03aa }
            java.lang.Object r5 = r9.A02     // Catch:{ RuntimeException -> 0x03aa }
            X.9xB r5 = (X.C197739xB) r5     // Catch:{ RuntimeException -> 0x03aa }
            X.9kt r4 = X.C197139wD.A00     // Catch:{ RuntimeException -> 0x03aa }
            byte[] r5 = r4.A00(r5)     // Catch:{ RuntimeException -> 0x03aa }
            X.9pq r4 = new X.9pq     // Catch:{ RuntimeException -> 0x03aa }
            r4.<init>(r7, r5)     // Catch:{ RuntimeException -> 0x03aa }
            r6.A00 = r4     // Catch:{ RuntimeException -> 0x03aa }
            r4 = 0
            r6.A01 = r4     // Catch:{ RuntimeException -> 0x03aa }
            X.8R7 r16 = r6.A00()     // Catch:{ RuntimeException -> 0x03aa }
            X.0y8 r13 = (X.C19390y8) r13     // Catch:{ RuntimeException -> 0x03aa }
            java.util.concurrent.Executor r4 = r13.A04     // Catch:{ RuntimeException -> 0x03aa }
            r17 = 12
            X.Aix r12 = new X.Aix     // Catch:{ RuntimeException -> 0x03aa }
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ RuntimeException -> 0x03aa }
            r4.execute(r12)     // Catch:{ RuntimeException -> 0x03aa }
            goto L_0x03b8
        L_0x037c:
            java.lang.String r4 = "Null priority"
            java.lang.NullPointerException r4 = X.AnonymousClass000.A0s(r4)     // Catch:{ RuntimeException -> 0x03aa }
            goto L_0x03a9
        L_0x0383:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x03aa }
            java.lang.String r4 = "Missing required properties:"
            r5.append(r4)     // Catch:{ RuntimeException -> 0x03aa }
            java.lang.IllegalStateException r4 = X.AnonymousClass000.A0o(r10, r5)     // Catch:{ RuntimeException -> 0x03aa }
            goto L_0x03a9
        L_0x0391:
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1b()     // Catch:{ RuntimeException -> 0x03aa }
            X.AnonymousClass8BS.A1B(r11, r9, r5)     // Catch:{ RuntimeException -> 0x03aa }
            java.lang.String r4 = "%s is not supported byt this factory. Supported encodings are: %s."
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ RuntimeException -> 0x03aa }
            java.lang.IllegalArgumentException r4 = X.AnonymousClass000.A0k(r4)     // Catch:{ RuntimeException -> 0x03aa }
            goto L_0x03a9
        L_0x03a3:
            java.lang.String r4 = "Null backendName"
            java.lang.NullPointerException r4 = X.AnonymousClass000.A0s(r4)     // Catch:{ RuntimeException -> 0x03aa }
        L_0x03a9:
            throw r4     // Catch:{ RuntimeException -> 0x03aa }
        L_0x03aa:
            r5 = move-exception
            java.lang.String r4 = "Failed to send big query analytics payload."
            android.util.Log.w(r1, r4, r5)
            goto L_0x03b8
        L_0x03b1:
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r1 = "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
            android.util.Log.i(r4, r1)
        L_0x03b8:
            android.os.Bundle r6 = r0.getExtras()
            if (r6 != 0) goto L_0x03c2
            android.os.Bundle r6 = X.C17880vN.A0D()
        L_0x03c2:
            java.lang.String r1 = "androidx.content.wakelockid"
            r6.remove(r1)
            boolean r1 = X.AnonymousClass72P.A01(r6)
            if (r1 == 0) goto L_0x04fd
            X.72P r9 = new X.72P
            r9.<init>(r6)
            java.lang.String r4 = "Firebase-Messaging-Network-Io"
            X.0yO r1 = new X.0yO
            r1.<init>(r4)
            java.util.concurrent.ExecutorService r8 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            java.lang.String r1 = "gcm.n.noui"
            boolean r1 = r9.A07(r1)     // Catch:{ all -> 0x0519 }
            if (r1 != 0) goto L_0x04e6
            java.lang.String r1 = "keyguard"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch:{ all -> 0x0519 }
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1     // Catch:{ all -> 0x0519 }
            boolean r1 = r1.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x0519 }
            if (r1 != 0) goto L_0x0421
            int r7 = android.os.Process.myPid()     // Catch:{ all -> 0x0519 }
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch:{ all -> 0x0519 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ all -> 0x0519 }
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch:{ all -> 0x0519 }
            if (r1 == 0) goto L_0x0421
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x0519 }
        L_0x0409:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0519 }
            if (r1 == 0) goto L_0x0421
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0519 }
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4     // Catch:{ all -> 0x0519 }
            int r1 = r4.pid     // Catch:{ all -> 0x0519 }
            if (r1 != r7) goto L_0x0409
            int r4 = r4.importance     // Catch:{ all -> 0x0519 }
            r1 = 100
            if (r4 != r1) goto L_0x0421
            goto L_0x04eb
        L_0x0421:
            java.lang.String r1 = "gcm.n.image"
            java.lang.String r5 = r9.A05(r1)     // Catch:{ all -> 0x0519 }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0519 }
            r6 = 0
            if (r1 != 0) goto L_0x045f
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0450 }
            r4.<init>(r5)     // Catch:{ MalformedURLException -> 0x0450 }
            X.AiD r1 = new X.AiD     // Catch:{ MalformedURLException -> 0x0450 }
            r1.<init>(r4)     // Catch:{ MalformedURLException -> 0x0450 }
            r6 = r1
            com.google.android.gms.tasks.TaskCompletionSource r5 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch:{ all -> 0x0519 }
            r5.<init>()     // Catch:{ all -> 0x0519 }
            r4 = 18
            X.3Cf r1 = new X.3Cf     // Catch:{ all -> 0x0519 }
            r1.<init>(r6, r5, r4)     // Catch:{ all -> 0x0519 }
            java.util.concurrent.Future r1 = r8.submit(r1)     // Catch:{ all -> 0x0519 }
            r6.A02 = r1     // Catch:{ all -> 0x0519 }
            com.google.android.gms.tasks.zzw r1 = r5.zza     // Catch:{ all -> 0x0519 }
            r6.A00 = r1     // Catch:{ all -> 0x0519 }
            goto L_0x045f
        L_0x0450:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0519 }
            java.lang.String r1 = "Not downloading image, bad URL: "
            java.lang.String r4 = X.AnonymousClass001.A1H(r1, r5, r4)     // Catch:{ all -> 0x0519 }
            java.lang.String r1 = "FirebaseMessaging"
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0519 }
        L_0x045f:
            X.6dT r10 = X.C1405772a.A00(r3, r9)     // Catch:{ all -> 0x0519 }
            X.73t r9 = r10.A00     // Catch:{ all -> 0x0519 }
            java.lang.String r7 = "FirebaseMessaging"
            if (r6 == 0) goto L_0x04c8
            com.google.android.gms.tasks.Task r11 = r6.A00     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            X.C18210vx.A00(r11)     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            r4 = 5
            java.lang.Object r5 = com.google.android.gms.tasks.Tasks.await(r11, r4, r1)     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            if (r5 != 0) goto L_0x047c
            r1 = 0
            goto L_0x0486
        L_0x047c:
            android.content.Context r1 = r9.A0C     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            android.graphics.Bitmap r1 = X.AnonymousClass6V8.A00(r1, r5)     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.A03(r1)     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
        L_0x0486:
            r9.A0H = r1     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            androidx.core.app.NotificationCompat$BigPictureStyle r4 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            r4.<init>()     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            if (r5 != 0) goto L_0x0491
            r1 = 0
            goto L_0x0495
        L_0x0491:
            androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.A03(r5)     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
        L_0x0495:
            r4.A00 = r1     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            r1 = 1
            r4.A01 = r1     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            r9.A0B(r4)     // Catch:{ ExecutionException -> 0x04a7, InterruptedException -> 0x04bd, TimeoutException -> 0x049e }
            goto L_0x04c8
        L_0x049e:
            java.lang.String r1 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r7, r1)     // Catch:{ all -> 0x0519 }
            r6.close()     // Catch:{ all -> 0x0519 }
            goto L_0x04c8
        L_0x04a7:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0519 }
            java.lang.String r1 = "Failed to download image: "
            r4.append(r1)     // Catch:{ all -> 0x0519 }
            java.lang.Throwable r1 = r5.getCause()     // Catch:{ all -> 0x0519 }
            java.lang.String r1 = X.C17890vO.A0V(r1, r4)     // Catch:{ all -> 0x0519 }
            android.util.Log.w(r7, r1)     // Catch:{ all -> 0x0519 }
            goto L_0x04c8
        L_0x04bd:
            java.lang.String r1 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r7, r1)     // Catch:{ all -> 0x0519 }
            r6.close()     // Catch:{ all -> 0x0519 }
            X.AnonymousClass8BS.A0x()     // Catch:{ all -> 0x0519 }
        L_0x04c8:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r7, r1)     // Catch:{ all -> 0x0519 }
            if (r1 == 0) goto L_0x04d4
            java.lang.String r1 = "Showing notification"
            android.util.Log.d(r7, r1)     // Catch:{ all -> 0x0519 }
        L_0x04d4:
            java.lang.String r1 = "notification"
            java.lang.Object r6 = r3.getSystemService(r1)     // Catch:{ all -> 0x0519 }
            android.app.NotificationManager r6 = (android.app.NotificationManager) r6     // Catch:{ all -> 0x0519 }
            java.lang.String r5 = r10.A01     // Catch:{ all -> 0x0519 }
            r4 = 0
            android.app.Notification r1 = r9.A05()     // Catch:{ all -> 0x0519 }
            r6.notify(r5, r4, r1)     // Catch:{ all -> 0x0519 }
        L_0x04e6:
            r8.shutdown()
            goto L_0x006a
        L_0x04eb:
            r8.shutdown()
            boolean r1 = X.C196439v4.A01(r0)
            if (r1 == 0) goto L_0x04fd
            java.lang.String r4 = "_nf"
            android.os.Bundle r1 = r0.getExtras()
            X.C196439v4.A00(r4, r1)
        L_0x04fd:
            X.Ba2 r1 = new X.Ba2
            r1.<init>()
            r1.A00 = r6
            r3.A04(r1)
            goto L_0x006a
        L_0x0509:
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            com.google.android.gms.tasks.Tasks.forException(r0)
            return
        L_0x0513:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x0519:
            r0 = move-exception
            r8.shutdown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.A01(android.content.Intent):void");
    }
}
