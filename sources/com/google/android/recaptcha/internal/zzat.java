package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import com.google.android.recaptcha.RecaptchaAction;

public final class zzat extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ zzaw zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ RecaptchaAction zzd;
    public final /* synthetic */ zzbd zze;
    public final /* synthetic */ String zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzat(zzaw zzaw, long j, RecaptchaAction recaptchaAction, zzbd zzbd, String str, C30391dr r8) {
        super(2, r8);
        this.zzb = zzaw;
        this.zzc = j;
        this.zzd = recaptchaAction;
        this.zze = zzbd;
        this.zzf = str;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        return new zzat(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, r10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r0 != 1) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0045, code lost:
        if (r13 != r4) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0047, code lost:
        r3 = r12.zzb;
        r2 = r12.zzd;
        r1 = r12.zze;
        r12.zza = 2;
        r13 = X.C30451dy.A00(r12, r3.zzl.zzd.getCoroutineContext(), new com.google.android.recaptcha.internal.zzav(r1, r3, r2, (com.google.android.recaptcha.internal.zzog) r13, (X.C30391dr) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        if (r13 != r4) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.zza
            r6 = 1
            X.C30691eM.A01(r13)
            if (r0 == 0) goto L_0x002c
            if (r0 == r6) goto L_0x0047
        L_0x000c:
            com.google.android.recaptcha.internal.zzaw r1 = r12.zzb
            com.google.android.recaptcha.internal.zzbd r0 = r12.zze
            com.google.android.recaptcha.internal.zzol r13 = (com.google.android.recaptcha.internal.zzol) r13
            r1.zzl(r13, r0)
            com.google.android.recaptcha.internal.zzaw r0 = r12.zzb
            com.google.android.recaptcha.internal.zzbd r2 = r12.zze
            com.google.android.recaptcha.internal.zzbg r1 = r0.zzi
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r0 = r2.zza(r0)
            r1.zza(r0)
            java.lang.String r1 = r13.zze
            X.1eK r0 = new X.1eK
            r0.<init>(r1)
            return r0
        L_0x002c:
            com.google.android.recaptcha.internal.zzaw r5 = r12.zzb
            long r2 = r12.zzc
            com.google.android.recaptcha.RecaptchaAction r1 = r12.zzd
            com.google.android.recaptcha.internal.zzbd r0 = r12.zze
            com.google.android.recaptcha.internal.zzaw.zzi(r5, r2, r1, r0)
            com.google.android.recaptcha.internal.zzaw r7 = r12.zzb
            long r8 = r12.zzc
            java.lang.String r10 = r12.zzf
            com.google.android.recaptcha.internal.zzbd r11 = r12.zze
            r12.zza = r6
            java.lang.Object r13 = r7.zzj(r8, r10, r11, r12)
            if (r13 == r4) goto L_0x0058
        L_0x0047:
            com.google.android.recaptcha.internal.zzaw r3 = r12.zzb
            com.google.android.recaptcha.RecaptchaAction r2 = r12.zzd
            com.google.android.recaptcha.internal.zzbd r1 = r12.zze
            com.google.android.recaptcha.internal.zzog r13 = (com.google.android.recaptcha.internal.zzog) r13
            r0 = 2
            r12.zza = r0
            java.lang.Object r13 = X.C30451dy.A00(r12, r3.zzl.zzd.getCoroutineContext(), new com.google.android.recaptcha.internal.zzav(r1, r3, r2, r13, (X.C30391dr) null))
            if (r13 != r4) goto L_0x000c
        L_0x0058:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzat.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzat) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
