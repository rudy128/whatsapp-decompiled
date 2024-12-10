package com.google.android.recaptcha.internal;

import X.EEF;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzb;

public abstract class zzj {
    public static final Task zza(EEF eef) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new zzb());
        eef.Bdy(new zzi(taskCompletionSource, eef));
        return taskCompletionSource.zza;
    }
}
