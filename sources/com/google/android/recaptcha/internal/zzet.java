package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass5WJ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;

public final class zzet extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzez zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzet(String str, zzez zzez, C30391dr r4) {
        super(2, r4);
        this.zzb = str;
        this.zzc = zzez;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new zzet(this.zzb, this.zzc, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.zza;
        C30691eM.A01(obj);
        if (i == 0) {
            zzez zzez = this.zzc;
            String str = this.zzb;
            AnonymousClass5WJ r4 = new AnonymousClass5WJ();
            zzez.zzl.put(str, r4);
            String str2 = this.zzb;
            zzou zzf = zzov.zzf();
            zzf.zzd(str2);
            byte[] zzd = zzf.zzj().zzd();
            String zzi = zzfy.zzb.zzi(zzd, 0, zzd.length);
            zzez zzez2 = this.zzc;
            AnonymousClass3MX.A1Q(new zzes(zzez2, zzi, (C30391dr) null), zzez2.zzq.zzb);
            this.zza = 1;
            obj = r4.BCp(this);
            if (obj == r6) {
                return r6;
            }
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
