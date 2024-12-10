package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.app.Application;
import android.os.Build;
import com.facebook.msys.mci.DefaultCrypto;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public final class zzal extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Application zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbd zzc;
    public final /* synthetic */ zzbq zzd;
    public final /* synthetic */ zzab zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzal(Application application, String str, zzbd zzbd, zzbq zzbq, zzab zzab, C30391dr r7) {
        super(2, r7);
        this.zza = application;
        this.zzb = str;
        this.zzc = zzbd;
        this.zzd = zzbq;
        this.zze = zzab;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new zzal(this.zza, this.zzb, this.zzc, this.zzd, this.zze, r9);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C30691eM.A01(obj);
        zzbd zzbd = this.zzc;
        Application application = this.zza;
        String zza2 = zzaf.zza(application);
        String packageName = application.getPackageName();
        String str = zzbd.zzc;
        zzq zzq = new zzq(application);
        int i = Build.VERSION.SDK_INT;
        String zza3 = zzq.zza("_GRECAPTCHA_KC");
        if (zza3 == null) {
            zza3 = "";
        }
        String encode = URLEncoder.encode(this.zzb, DefaultCrypto.UTF_8);
        String encode2 = URLEncoder.encode(packageName, DefaultCrypto.UTF_8);
        String encode3 = URLEncoder.encode(zza2, DefaultCrypto.UTF_8);
        String encode4 = URLEncoder.encode("18.4.0", DefaultCrypto.UTF_8);
        String encode5 = URLEncoder.encode(str, DefaultCrypto.UTF_8);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("k=");
        A10.append(encode);
        A10.append("&pk=");
        A10.append(encode2);
        A10.append("&mst=");
        A10.append(encode3);
        A10.append("&msv=");
        A10.append(encode4);
        A10.append("&msi=");
        A10.append(encode5);
        A10.append("&mov=");
        A10.append(i);
        byte[] bytes = AnonymousClass001.A1H("&mkc=", zza3, A10).getBytes(Charset.forName(DefaultCrypto.UTF_8));
        zzbq zzbq = this.zzd;
        zzab zzab = this.zze;
        return zzbq.zza(zzab.zzb, bytes, this.zzc);
    }
}
