package com.google.android.recaptcha;

import X.C30391dr;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzam;

public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Object();

    /* renamed from: getClient-BWLJW6A$default  reason: not valid java name */
    public static /* synthetic */ Object m66getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, C30391dr r6, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m67getClientBWLJW6A(application, str, j, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: getClient-BWLJW6A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m67getClientBWLJW6A(android.app.Application r10, java.lang.String r11, long r12, X.C30391dr r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L_0x001e
            r8 = r14
            com.google.android.recaptcha.Recaptcha$getClient$1 r8 = (com.google.android.recaptcha.Recaptcha$getClient$1) r8
            int r2 = r8.zzc
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r8.zzc = r2
        L_0x0012:
            java.lang.Object r3 = r8.zza
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.zzc
            r1 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 != r1) goto L_0x0024
            goto L_0x003b
        L_0x001e:
            com.google.android.recaptcha.Recaptcha$getClient$1 r8 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r8.<init>(r9, r14)
            goto L_0x0012
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0029:
            X.C30691eM.A01(r3)
            com.google.android.recaptcha.internal.zzam r0 = com.google.android.recaptcha.internal.zzam.zza     // Catch:{ all -> 0x0041 }
            r8.zzc = r1     // Catch:{ all -> 0x0041 }
            r7 = 0
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzam.zzc(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0041 }
            if (r3 != r2) goto L_0x003e
            return r2
        L_0x003b:
            X.C30691eM.A01(r3)     // Catch:{ all -> 0x0041 }
        L_0x003e:
            com.google.android.recaptcha.internal.zzaw r3 = (com.google.android.recaptcha.internal.zzaw) r3     // Catch:{ all -> 0x0041 }
            return r3
        L_0x0041:
            r0 = move-exception
            X.1IU r3 = X.C108945cZ.A1J(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m67getClientBWLJW6A(android.app.Application, java.lang.String, long, X.1dr):java.lang.Object");
    }

    public static final Task getTasksClient(Application application, String str, long j) {
        return zzam.zzd(application, str, j);
    }

    public static final Task getTasksClient(Application application, String str) {
        return zzam.zzd(application, str, 10000);
    }
}
