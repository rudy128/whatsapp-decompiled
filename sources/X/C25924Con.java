package X;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.Con  reason: case insensitive filesystem */
public abstract class C25924Con {
    public static C26342Cxz A00;
    public static final Object A01 = C17880vN.A0p();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4.getApplicationInfo().targetSdkVersion < 26) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.tasks.Task A00(android.content.Context r4, android.content.Intent r5, java.util.concurrent.Executor r6) {
        /*
            boolean r0 = X.C25333Cde.A00()
            r3 = 1
            if (r0 == 0) goto L_0x0012
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 26
            r2 = 1
            if (r1 >= r0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            int r1 = r5.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x001d
            r3 = 0
        L_0x001d:
            if (r2 == 0) goto L_0x0026
            if (r3 != 0) goto L_0x0026
            com.google.android.gms.tasks.Task r0 = A01(r4, r5, r3)
            return r0
        L_0x0026:
            r1 = 16
            X.DVY r0 = new X.DVY
            r0.<init>(r4, r5, r1)
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.call(r6, r0)
            X.DKX r0 = new X.DKX
            r0.<init>(r4, r5, r3)
            com.google.android.gms.tasks.Task r0 = r1.continueWithTask(r6, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25924Con.A00(android.content.Context, android.content.Intent, java.util.concurrent.Executor):com.google.android.gms.tasks.Task");
    }

    public static Task A01(Context context, Intent intent, boolean z) {
        C26342Cxz cxz;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (A01) {
            cxz = A00;
            if (cxz == null) {
                cxz = new C26342Cxz(context);
                A00 = cxz;
            }
        }
        if (!z) {
            return cxz.A01(intent).continueWith(new C27134DVv(0), new DKW(1));
        }
        if (C19860z8.A00().A01(context)) {
            synchronized (C25928Cos.A02) {
                C25928Cos.A00(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    C25928Cos.A00.A01(C25928Cos.A01);
                }
                cxz.A01(intent).addOnCompleteListener(new DKY(intent, 0));
            }
        } else {
            cxz.A01(intent);
        }
        Integer A0Z = BE7.A0Z();
        zzw zzw = new zzw();
        zzw.zzb(A0Z);
        return zzw;
    }
}
