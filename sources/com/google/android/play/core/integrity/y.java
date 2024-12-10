package com.google.android.play.core.integrity;

import X.C17880vN;
import X.C25764Cla;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

public abstract class y {
    public final C25764Cla a = new C25764Cla("IntegrityDialogWrapper");
    public final String b;
    public final long c;
    public final Object d = C17880vN.A0p();
    public boolean e;

    public abstract Task b(Activity activity, Bundle bundle);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r6 = r7.a;
        r5 = new java.lang.Object[1];
        X.C17880vN.A1T(r5, r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (android.util.Log.isLoggable("PlayCore", 3) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        android.util.Log.d("PlayCore", X.C25764Cla.A00(r6.A00, "checkAndShowDialog(%s)", r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r3 = X.C17880vN.A0D();
        r3.putInt("dialog.intent.type", r9);
        r3.putString("package.name", r7.b);
        r3.putInt("playcore.integrity.version.major", 1);
        r3.putInt("playcore.integrity.version.minor", 4);
        r3.putInt("playcore.integrity.version.patch", 0);
        r3.putLong("request.token.sid", r7.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        return b(r8, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task a(android.app.Activity r8, int r9) {
        /*
            r7 = this;
            java.lang.Object r3 = r7.d
            monitor-enter(r3)
            boolean r0 = r7.e     // Catch:{ all -> 0x0061 }
            r2 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw     // Catch:{ all -> 0x0061 }
            r0.<init>()     // Catch:{ all -> 0x0061 }
            r0.zzb(r1)     // Catch:{ all -> 0x0061 }
            monitor-exit(r3)     // Catch:{ all -> 0x0061 }
            return r0
        L_0x0016:
            r4 = 1
            r7.e = r4     // Catch:{ all -> 0x0061 }
            monitor-exit(r3)     // Catch:{ all -> 0x0061 }
            X.Cla r6 = r7.a
            java.lang.Object[] r5 = new java.lang.Object[r4]
            X.C17880vN.A1T(r5, r9, r2)
            java.lang.String r3 = "checkAndShowDialog(%s)"
            r0 = 3
            java.lang.String r1 = "PlayCore"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r6.A00
            java.lang.String r0 = X.C25764Cla.A00(r0, r3, r5)
            android.util.Log.d(r1, r0)
        L_0x0035:
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r0 = "dialog.intent.type"
            r3.putInt(r0, r9)
            java.lang.String r1 = r7.b
            java.lang.String r0 = "package.name"
            r3.putString(r0, r1)
            java.lang.String r0 = "playcore.integrity.version.major"
            r3.putInt(r0, r4)
            java.lang.String r1 = "playcore.integrity.version.minor"
            r0 = 4
            r3.putInt(r1, r0)
            java.lang.String r0 = "playcore.integrity.version.patch"
            r3.putInt(r0, r2)
            long r1 = r7.c
            java.lang.String r0 = "request.token.sid"
            r3.putLong(r0, r1)
            com.google.android.gms.tasks.Task r0 = r7.b(r8, r3)
            return r0
        L_0x0061:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0061 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.y.a(android.app.Activity, int):com.google.android.gms.tasks.Task");
    }

    public y(String str, long j) {
        this.b = str;
        this.c = j;
    }
}
