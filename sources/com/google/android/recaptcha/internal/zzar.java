package com.google.android.recaptcha.internal;

import X.C108985cd;
import X.C30391dr;
import X.C30421du;
import com.google.android.recaptcha.RecaptchaAction;

public final class zzar extends C30421du {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzaw zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzar(zzaw zzaw, C30391dr r2) {
        super(r2);
        this.zzb = zzaw;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.zzb.m71executegIAlus((RecaptchaAction) null, this));
    }
}
