package com.google.android.gms.tasks;

import X.C17880vN;
import java.util.concurrent.Executor;

public final class zzl implements zzq {
    public final Executor zza;
    public final Object zzb = C17880vN.A0p();
    public OnFailureListener zzc;

    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    public zzl(Executor executor, OnFailureListener onFailureListener) {
        this.zza = executor;
        this.zzc = onFailureListener;
    }

    public final void zzd(Task task) {
        if (!task.isSuccessful() && !((zzw) task).zzd) {
            synchronized (this.zzb) {
                if (this.zzc != null) {
                    this.zza.execute(new zzk(this, task));
                }
            }
        }
    }
}
