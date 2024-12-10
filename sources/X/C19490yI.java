package X;

/* renamed from: X.0yI  reason: invalid class name and case insensitive filesystem */
public class C19490yI {
    public final C19500yJ A00;
    public final C18220vy A01;
    public final C18290w6 A02;
    public final C18290w6 A03;
    public final C18480wV A04;
    public final C19480yH A05;

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0200, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0201, code lost:
        r1 = new com.google.android.gms.tasks.zzw();
        r1.zza(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0209, code lost:
        return r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0200 A[ExcHandler: InterruptedException | ExecutionException (r0v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:27:0x0082] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.tasks.Task A00(android.os.Bundle r10, X.C19490yI r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r0 = "scope"
            r10.putString(r0, r13)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "sender"
            r10.putString(r0, r12)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "subtype"
            r10.putString(r0, r12)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            X.0vy r2 = r11.A01     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            X.C18220vy.A02(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            X.0vz r0 = r2.A01     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r1 = r0.A01     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "gmp_app_id"
            r10.putString(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            X.0yH r4 = r11.A05     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            monitor-enter(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            int r0 = r4.A00     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.PackageInfo r0 = X.C19480yH.A00(r4, r0)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0034
            int r0 = r0.versionCode     // Catch:{ all -> 0x01fa }
            r4.A00 = r0     // Catch:{ all -> 0x01fa }
        L_0x0034:
            int r0 = r4.A00     // Catch:{ all -> 0x01fa }
            monitor-exit(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "gmsv"
            r10.putString(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "osv"
            r10.putString(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r1 = r4.A03()     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "app_ver"
            r10.putString(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            monitor-enter(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = r4.A02     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x005c
            X.C19480yH.A02(r4)     // Catch:{ all -> 0x01fa }
        L_0x005c:
            java.lang.String r1 = r4.A02     // Catch:{ all -> 0x01fa }
            monitor-exit(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "app_ver_name"
            r10.putString(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r4 = "firebase-app-name-hash"
            X.C18220vy.A02(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r2 = r2.A05     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0080, InterruptedException | ExecutionException -> 0x0200 }
            byte[] r0 = r2.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x0080, InterruptedException | ExecutionException -> 0x0200 }
            byte[] r1 = r1.digest(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0080, InterruptedException | ExecutionException -> 0x0200 }
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0080, InterruptedException | ExecutionException -> 0x0200 }
            goto L_0x0082
        L_0x0080:
            java.lang.String r0 = "[HASH-ERROR]"
        L_0x0082:
            r10.putString(r4, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            X.0wV r5 = r11.A04     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            X.C18480wV.A00(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            com.google.android.gms.tasks.TaskCompletionSource r4 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            r4.<init>()     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            X.0xD r0 = r5.A04     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            X.2wt r2 = new X.2wt     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            r2.<init>(r4, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            java.lang.Object r1 = r5.A07     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            monitor-enter(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            java.util.List r0 = r5.A08     // Catch:{ all -> 0x00c9 }
            r0.add(r2)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c9 }
            com.google.android.gms.tasks.zzw r4 = r4.zza     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            java.util.concurrent.ExecutorService r2 = r5.A0A     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            r1 = 31
            X.DTf r0 = new X.DTf     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            r0.<init>((X.C18480wV) r5, (int) r1)     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            r2.execute(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            X.2Re r0 = (X.C49612Re) r0     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            X.2AR r0 = (X.AnonymousClass2AR) r0     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r1 = r0.A02     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "Goog-Firebase-Installations-Auth"
            r10.putString(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            goto L_0x00d2
        L_0x00c3:
            java.lang.String r0 = "FIS auth token is empty"
            android.util.Log.w(r3, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
            goto L_0x00d2
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ InterruptedException | ExecutionException -> 0x00cc, InterruptedException | ExecutionException -> 0x0200 }
        L_0x00cc:
            r1 = move-exception
            java.lang.String r0 = "Failed to get FIS auth token"
            android.util.Log.e(r3, r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
        L_0x00d2:
            X.0wV r0 = r11.A04     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            com.google.android.gms.tasks.Task r0 = r0.A03()     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.Object r1 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "appid"
            r10.putString(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            r1.<init>()     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "fcm-"
            r1.append(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "23.4.1"
            r1.append(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "cliv"
            r10.putString(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            X.0w6 r0 = r11.A02     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.Object r5 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            X.0wX r5 = (X.C18500wX) r5     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            X.0w6 r0 = r11.A03     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.Object r4 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            X.0ww r4 = (X.C18660ww) r4     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            if (r5 == 0) goto L_0x01a3
            if (r4 == 0) goto L_0x01a3
            monitor-enter(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01fd }
            X.0w6 r0 = r5.A01     // Catch:{ all -> 0x01fd }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x01fd }
            r6 = r9
            X.0yh r6 = (X.C19660yh) r6     // Catch:{ all -> 0x01fd }
            monitor-enter(r9)     // Catch:{ all -> 0x01fd }
            java.lang.String r8 = "fire-global"
            android.content.SharedPreferences r7 = r6.A00     // Catch:{ all -> 0x019e }
            boolean r0 = r7.contains(r8)     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x014c
            r0 = -1
            long r0 = r7.getLong(r8, r0)     // Catch:{ all -> 0x019e }
            java.lang.String r1 = X.C19660yh.A00(r6, r0)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = X.C19660yh.A00(r6, r2)     // Catch:{ all -> 0x014a }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x0148
            android.content.SharedPreferences$Editor r0 = r7.edit()     // Catch:{ all -> 0x019e }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r8, r2)     // Catch:{ all -> 0x019e }
            r0.commit()     // Catch:{ all -> 0x019e }
            goto L_0x0157
        L_0x0148:
            r0 = 0
            goto L_0x0158
        L_0x014a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x019e }
        L_0x014c:
            android.content.SharedPreferences$Editor r0 = r7.edit()     // Catch:{ all -> 0x019e }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r8, r2)     // Catch:{ all -> 0x019e }
            r0.commit()     // Catch:{ all -> 0x019e }
        L_0x0157:
            r0 = 1
        L_0x0158:
            monitor-exit(r9)     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x0178
            monitor-enter(r9)     // Catch:{ all -> 0x01fd }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = X.C19660yh.A00(r6, r0)     // Catch:{ all -> 0x01a0 }
            android.content.SharedPreferences$Editor r1 = r7.edit()     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "last-used-date"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)     // Catch:{ all -> 0x01a0 }
            r0.commit()     // Catch:{ all -> 0x01a0 }
            X.C19660yh.A02(r6, r2)     // Catch:{ all -> 0x01a0 }
            monitor-exit(r9)     // Catch:{ all -> 0x01fd }
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x01fd }
            goto L_0x017a
        L_0x0178:
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x01fd }
        L_0x017a:
            monitor-exit(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            if (r1 == r0) goto L_0x01a3
            int r0 = r1.intValue()     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            switch(r0) {
                case 0: goto L_0x0188;
                case 1: goto L_0x018a;
                default: goto L_0x0186;
            }     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
        L_0x0186:
            r0 = 2
            goto L_0x018b
        L_0x0188:
            r0 = 0
            goto L_0x018b
        L_0x018a:
            r0 = 1
        L_0x018b:
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r10.putString(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            java.lang.String r1 = "Firebase-Client"
            java.lang.String r0 = r4.A01()     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            r10.putString(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            goto L_0x01a3
        L_0x019e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01fd }
            throw r0     // Catch:{ all -> 0x01fd }
        L_0x01a3:
            X.0yJ r3 = r11.A00
            X.0yL r2 = r3.A04
            int r1 = r2.A00()
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 >= r0) goto L_0x01d6
            int r0 = r2.A01()
            if (r0 == 0) goto L_0x01c6
            com.google.android.gms.tasks.zzw r2 = X.C19500yJ.A00(r10, r3)
            java.util.concurrent.Executor r1 = X.C19500yJ.A09
            X.2wN r0 = new X.2wN
            r0.<init>(r10, r3)
            com.google.android.gms.tasks.Task r1 = r2.continueWithTask(r1, r0)
            return r1
        L_0x01c6:
            java.lang.String r1 = "MISSING_INSTANCEID_SERVICE"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            com.google.android.gms.tasks.zzw r1 = new com.google.android.gms.tasks.zzw
            r1.<init>()
            r1.zza(r0)
            return r1
        L_0x01d6:
            android.content.Context r0 = r3.A02
            X.Cpw r3 = X.C25983Cpw.A00(r0)
            monitor-enter(r3)
            int r2 = r3.A00     // Catch:{ all -> 0x01f7 }
            int r0 = r2 + 1
            r3.A00 = r0     // Catch:{ all -> 0x01f7 }
            monitor-exit(r3)
            r1 = 1
            X.2A8 r0 = new X.2A8
            r0.<init>(r10, r2, r1)
            com.google.android.gms.tasks.zzw r2 = X.C25983Cpw.A01(r0, r3)
            java.util.concurrent.Executor r1 = X.C19500yJ.A09
            X.2wP r0 = X.C65422wP.A00
            com.google.android.gms.tasks.Task r1 = r2.continueWith(r1, r0)
            return r1
        L_0x01f7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
            goto L_0x01ff
        L_0x01fd:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
        L_0x01ff:
            throw r0     // Catch:{ InterruptedException | ExecutionException -> 0x0200 }
        L_0x0200:
            r0 = move-exception
            com.google.android.gms.tasks.zzw r1 = new com.google.android.gms.tasks.zzw
            r1.<init>()
            r1.zza(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19490yI.A00(android.os.Bundle, X.0yI, java.lang.String, java.lang.String):com.google.android.gms.tasks.Task");
    }

    public C19490yI(C18220vy r3, C18290w6 r4, C18290w6 r5, C18480wV r6, C19480yH r7) {
        C18220vy.A02(r3);
        C19500yJ r0 = new C19500yJ(r3.A00);
        this.A01 = r3;
        this.A05 = r7;
        this.A00 = r0;
        this.A03 = r4;
        this.A02 = r5;
        this.A04 = r6;
    }
}
