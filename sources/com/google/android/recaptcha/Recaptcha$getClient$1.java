package com.google.android.recaptcha;

import X.C108985cd;
import X.C30391dr;
import X.C30421du;
import android.app.Application;

public final class Recaptcha$getClient$1 extends C30421du {
    public /* synthetic */ Object zza;
    public final /* synthetic */ Recaptcha zzb;
    public int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, C30391dr r2) {
        super(r2);
        this.zzb = recaptcha;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.zzb.m67getClientBWLJW6A((Application) null, (String) null, 0, this));
    }
}
