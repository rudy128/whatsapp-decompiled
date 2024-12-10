package com.google.android.gms.tasks;

import X.AnonymousClass000;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class zzo implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzp zzb;

    public zzo(zzp zzp, Task task) {
        this.zzb = zzp;
        this.zza = task;
    }

    public final void run() {
        zzp zzp;
        try {
            Task then = this.zzb.zzb.then(this.zza.getResult());
            if (then == null) {
                zzp = this.zzb;
                e = AnonymousClass000.A0s("Continuation returned null");
                zzp.onFailure(e);
                return;
            }
            zzp zzp2 = this.zzb;
            Executor executor = TaskExecutors.zza;
            then.addOnSuccessListener(executor, (OnSuccessListener) zzp2);
            then.addOnFailureListener(executor, (OnFailureListener) this.zzb);
            then.addOnCanceledListener(executor, (OnCanceledListener) this.zzb);
        } catch (RuntimeExecutionException e) {
            e = e;
            boolean z = e.getCause() instanceof Exception;
            zzp = this.zzb;
            if (z) {
                e = (Exception) e.getCause();
            }
        } catch (CancellationException unused) {
            this.zzb.onCanceled();
        } catch (Exception e2) {
            this.zzb.onFailure(e2);
        }
    }
}
