package com.google.android.recaptcha.internal;

import X.BE7;
import X.C108935cY;
import X.C27621Wu;
import android.webkit.JavascriptInterface;
import java.util.concurrent.TimeUnit;

public final class zzeq {
    public final /* synthetic */ zzez zza;
    public Long zzb;
    public final zzfh zzc;

    public final Long zza() {
        return this.zzb;
    }

    public zzeq(zzez zzez) {
        this.zza = zzez;
        zzfh zzfh = new zzfh();
        zzfh.zze();
        this.zzc = zzfh;
    }

    private final void zzb() {
        if (this.zzb == null) {
            zzfh zzfh = this.zzc;
            zzfh.zzf();
            this.zzb = Long.valueOf(zzfh.zza(TimeUnit.MILLISECONDS));
        }
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zznf zzI = zznf.zzI(zzfy.zzb.zzj(str));
        zzez zzez = this.zza;
        if (zzez.zzo.zzb == null) {
            zzez.zzi.zza(zzez.zzp.zza(zzne.LOAD_WEBVIEW));
        }
        zzb();
        zzpc zzi = zzpd.zzi();
        zzi.zzd(zzI);
        this.zza.zzi.zzd((zzpd) zzi.zzj());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zzpc zzi = zzpd.zzi();
        zzi.zze(zznu.zzi(zzfy.zzb.zzj(str)));
        this.zza.zzi.zzd((zzpd) zzi.zzj());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzpb zzi = zzox.zzg(zzfy.zzb.zzj(str)).zzi();
        if (zzi == zzpb.JS_CODE_SUCCESS) {
            BE7.A0x(this.zza).hashCode();
            if (!BE7.A0x(this.zza).BFN(C27621Wu.A00)) {
                BE7.A0x(this.zza).hashCode();
                return;
            }
            return;
        }
        zzo zzo = zzp.zza;
        zzp zza2 = zzo.zza(zzi);
        BE7.A0x(this.zza).hashCode();
        BE7.A0x(this.zza).BFO(zza2);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzbu zzbu = this.zza.zzc;
        if (zzbu == null) {
            zzbu = null;
        }
        zzbu.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        zzb();
        zzog zzi = zzog.zzi(zzfy.zzb.zzj(str));
        zzi.toString();
        C108935cY r0 = (C108935cY) this.zza.zzl.remove(zzi.zze);
        if (r0 != null) {
            r0.BFN(zzi);
        }
    }
}
