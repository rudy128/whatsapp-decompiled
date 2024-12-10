package com.google.android.gms.tasks;

import X.C17880vN;
import java.util.concurrent.Executor;

public final class zzh implements zzq {
    public final Executor zza;
    public final Object zzb = C17880vN.A0p();
    public OnCanceledListener zzc;

    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    public final void zzd(Task task) {
        if (((zzw) task).zzd) {
            synchronized (this.zzb) {
                if (this.zzc != null) {
                    this.zza.execute(new zzg(this));
                }
            }
        }
    }

    public zzh(Executor executor, OnCanceledListener onCanceledListener) {
        this.zza = executor;
        this.zzc = onCanceledListener;
    }
}
