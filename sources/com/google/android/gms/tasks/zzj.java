package com.google.android.gms.tasks;

import X.C17880vN;
import java.util.concurrent.Executor;

public final class zzj implements zzq {
    public final Executor zza;
    public final Object zzb = C17880vN.A0p();
    public OnCompleteListener zzc;

    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    public final void zzd(Task task) {
        synchronized (this.zzb) {
            if (this.zzc != null) {
                this.zza.execute(new zzi(this, task));
            }
        }
    }

    public zzj(Executor executor, OnCompleteListener onCompleteListener) {
        this.zza = executor;
        this.zzc = onCompleteListener;
    }
}
