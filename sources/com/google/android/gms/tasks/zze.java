package com.google.android.gms.tasks;

import X.AnonymousClass000;
import java.util.concurrent.Executor;

public final class zze implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzf zzb;

    public zze(zzf zzf, Task task) {
        this.zzb = zzf;
        this.zza = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.zzb.zzb.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(AnonymousClass000.A0s("Continuation returned null"));
                return;
            }
            zzf zzf = this.zzb;
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, (OnSuccessListener) zzf);
            task.addOnFailureListener(executor, (OnFailureListener) this.zzb);
            task.addOnCanceledListener(executor, (OnCanceledListener) this.zzb);
        } catch (RuntimeExecutionException e) {
            e = e;
            boolean z = e.getCause() instanceof Exception;
            zzw zzw = this.zzb.zzc;
            if (z) {
                e = (Exception) e.getCause();
            }
            zzw.zza(e);
        } catch (Exception e2) {
            this.zzb.zzc.zza(e2);
        }
    }
}
