package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.app.Application;

public final class zzak extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ Application zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzak(Application application, String str, long j, C30391dr r6) {
        super(2, r6);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new zzak(this.zzb, this.zzc, this.zzd, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r1 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.zza;
        C30691eM.A01(obj);
        if (i == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            obj = zzam.zzc(application, str, j, (zzbq) null, this);
            if (obj == r1) {
                return r1;
            }
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzak) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
