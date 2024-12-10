package com.google.android.recaptcha.internal;

import X.AnonymousClass11G;
import X.C22821Di;
import X.C27621Wu;
import X.EEF;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public final class zzi extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ EEF zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzi(TaskCompletionSource taskCompletionSource, EEF eef) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = eef;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable BP6 = this.zzb.BP6();
            TaskCompletionSource taskCompletionSource = this.zza;
            if (BP6 == null) {
                taskCompletionSource.setResult(this.zzb.BP5());
            } else {
                if (!(BP6 instanceof Exception) || (exc = (Exception) BP6) == null) {
                    exc = new RuntimeExecutionException(BP6);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return C27621Wu.A00;
    }
}
