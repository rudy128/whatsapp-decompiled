package com.google.android.recaptcha.internal;

import X.BE6;
import X.C29431cG;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class zzeg implements zzee {
    public final zzef zza;
    public final zzed zzb;

    public zzeg(zzef zzef, zzed zzed) {
        this.zza = zzef;
        this.zzb = zzed;
    }

    public final zzpf zza(zzpn zzpn) {
        zzfh zzfh = new zzfh();
        zzfh.zze();
        zzpf zzb2 = zzb(zzpn.zzd, zzpn.zzf);
        zzfh.zzf();
        zzv.zza(zzx.zzm.zzn, zzfh.zza(TimeUnit.MICROSECONDS));
        return zzb2;
    }

    private final zzpf zzb(String str, List list) {
        int length = str.length();
        if (length != 0) {
            try {
                zzec zzec = new zzec(this.zza.zza(C29431cG.A1C(list)), 255, zzec.zzb);
                StringBuilder A0t = BE6.A0t(length);
                for (int i = 0; i < length; i++) {
                    A0t.append((char) (str.charAt(i) ^ ((int) zzec.zza())));
                }
                return zzpf.zzg(zzfy.zzb.zzj(A0t.toString()));
            } catch (Exception e) {
                throw BE6.A0V(e, 3, 18);
            }
        } else {
            throw BE6.A0V((Throwable) null, 3, 17);
        }
    }
}
