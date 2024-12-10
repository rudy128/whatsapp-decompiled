package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass20F;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C60662oP;
import java.util.Arrays;
import java.util.Map;

public final class zzby extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Exception zza;
    public final /* synthetic */ zzcj zzb;
    public final /* synthetic */ zzca zzc;
    public /* synthetic */ Object zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzby(Exception exc, zzcj zzcj, zzca zzca, C30391dr r5) {
        super(2, r5);
        this.zza = exc;
        this.zzb = zzcj;
        this.zzc = zzca;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        zzby zzby = new zzby(this.zza, this.zzb, this.zzc, r6);
        zzby.zzd = obj;
        return zzby;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzby) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        zzpg zzf;
        C30691eM.A01(obj);
        AnonymousClass1OX r3 = (AnonymousClass1OX) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzae) {
            zzf = ((zzae) exc).zzb;
            zzf.zzd(this.zzb.zzd);
        } else {
            zzcj zzcj = this.zzb;
            zzf = zzph.zzf();
            zzf.zzd(zzcj.zzd);
            zzf.zzp(2);
            zzf.zze(2);
        }
        zzit zzh = zzf.zzj();
        Class<?> cls = this.zza.getClass();
        Map map = AnonymousClass20F.A03;
        C18070vi.A0d(cls, 1);
        C60662oP.A01(cls);
        this.zza.getMessage();
        zzcj zzcj2 = this.zzb;
        zzz zzz = zzcj2.zzg;
        zzz zzz2 = zzcj2.zza;
        if (zzz2 == null) {
            zzz2 = null;
        }
        zzno zza2 = zzbp.zza(zzz, zzz2);
        String str = this.zzb.zzc;
        if (str.length() == 0) {
            str = "recaptcha.m.Main.rge";
        }
        if (AnonymousClass1OW.A05(r3)) {
            zzca zzca = this.zzc;
            zzfy zzfy = zzfy.zzb;
            byte[] zzd2 = zzh.zzd();
            byte[] zzd3 = zza2.zzd();
            zzca.zzc.zzd.zzb(str, (String[]) Arrays.copyOf(new String[]{zzfy.zzi(zzd2, 0, zzd2.length), zzfy.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return C27621Wu.A00;
    }
}
