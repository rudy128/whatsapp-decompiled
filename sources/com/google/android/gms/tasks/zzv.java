package com.google.android.gms.tasks;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.E9G;
import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.List;

public final class zzv extends LifecycleCallback {
    public final List zza = AnonymousClass000.A13();

    public final void onStop() {
        synchronized (this.zza) {
            for (WeakReference weakReference : this.zza) {
                zzq zzq = (zzq) weakReference.get();
                if (zzq != null) {
                    zzq.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final void zzb(zzq zzq) {
        synchronized (this.zza) {
            this.zza.add(AnonymousClass3MW.A0z(zzq));
        }
    }

    public zzv(E9G e9g) {
        super(e9g);
        this.mLifecycleFragment.BB1(this, "TaskOnStopCallback");
    }

    public static zzv zza(Activity activity) {
        zzv zzv;
        E9G fragment = LifecycleCallback.getFragment(activity);
        synchronized (fragment) {
            zzv = (zzv) fragment.BO7(zzv.class, "TaskOnStopCallback");
            if (zzv == null) {
                zzv = new zzv(fragment);
            }
        }
        return zzv;
    }
}
