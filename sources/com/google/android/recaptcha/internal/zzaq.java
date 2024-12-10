package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import com.google.android.recaptcha.RecaptchaAction;

public final class zzaq extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ zzaw zzb;
    public final /* synthetic */ RecaptchaAction zzc;
    public final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaq(zzaw zzaw, RecaptchaAction recaptchaAction, long j, C30391dr r6) {
        super(2, r6);
        this.zzb = zzaw;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new zzaq(this.zzb, this.zzc, this.zzd, r8);
    }

    public final Object invokeSuspend(Object obj) {
        Object zze;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.zza;
        C30691eM.A01(obj);
        if (i != 0) {
            zze = ((C30671eK) obj).value;
        } else {
            zzaw zzaw = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zze = zzaw.zzk(recaptchaAction, j, this);
            if (zze == r5) {
                return r5;
            }
        }
        return new C30671eK(zze);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
