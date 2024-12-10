package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE7;

public final class zzjv implements zzkc {
    public final zzkc[] zza;

    public zzjv(zzkc... zzkcArr) {
        this.zza = zzkcArr;
    }

    public final zzkb zzb(Class cls) {
        int i = 0;
        do {
            zzkc zzkc = this.zza[i];
            if (zzkc.zzc(cls)) {
                return zzkc.zzb(cls);
            }
            i++;
        } while (i < 2);
        throw BE6.A0v("No factory is available for message type: ".concat(BE7.A0l(cls)));
    }

    public final boolean zzc(Class cls) {
        int i = 0;
        while (!this.zza[i].zzc(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }
}
