package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1IU;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C18460wS;
import X.C199209zc;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import X.EEF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzc extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ zzg zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzc(zzg zzg, String str, long j, C30391dr r6) {
        super(2, r6);
        this.zzb = zzg;
        this.zzc = str;
        this.zzd = j;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        zzc zzc2 = new zzc(this.zzb, this.zzc, this.zzd, r8);
        zzc2.zze = obj;
        return zzc2;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.zza;
        C30691eM.A01(obj);
        if (i == 0) {
            AnonymousClass1OX r5 = (AnonymousClass1OX) this.zze;
            ArrayList A13 = AnonymousClass000.A13();
            for (zza zzb2 : this.zzb.zza) {
                zzb zzb3 = new zzb(zzb2, this.zzc, this.zzd, (C30391dr) null);
                A13.add(C30451dy.A01(AnonymousClass00R.A00, AnonymousClass1OR.A00, zzb3, r5));
            }
            EEF[] eefArr = (EEF[]) A13.toArray(new EEF[0]);
            EEF[] eefArr2 = (EEF[]) Arrays.copyOf(eefArr, eefArr.length);
            this.zza = 1;
            if (eefArr2.length == 0) {
                obj = C18460wS.A00;
            } else {
                obj = new C199209zc(eefArr2).A00(this);
            }
            if (obj == r2) {
                return r2;
            }
        }
        String str = this.zzc;
        zzof zzf = zzog.zzf();
        zzf.zzd(str);
        for (C30671eK r0 : (List) obj) {
            Object obj2 = r0.value;
            if (!(obj2 instanceof AnonymousClass1IU)) {
                zzf.zzg((zzit) obj2);
            }
        }
        return zzf.zzj();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
