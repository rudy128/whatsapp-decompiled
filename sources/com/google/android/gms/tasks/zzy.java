package com.google.android.gms.tasks;

import X.AnonymousClass26x;

public final /* synthetic */ class zzy implements OnCompleteListener {
    public final /* synthetic */ AnonymousClass26x zza;
    public final /* synthetic */ TaskCompletionSource zzb;
    public final /* synthetic */ zzb zzc;

    public /* synthetic */ zzy(AnonymousClass26x r1, TaskCompletionSource taskCompletionSource, zzb zzb2) {
        this.zza = r1;
        this.zzb = taskCompletionSource;
        this.zzc = zzb2;
    }

    public final void onComplete(Task task) {
        this.zza.removeCallbacksAndMessages((Object) null);
        TaskCompletionSource taskCompletionSource = this.zzb;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (((zzw) task).zzd) {
            this.zzc.zza();
        } else {
            Exception exception = task.getException();
            exception.getClass();
            taskCompletionSource.trySetException(exception);
        }
    }
}
