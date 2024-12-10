package com.google.android.recaptcha.internal;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;

public final class zzf extends C30431dv implements AnonymousClass1OS {
    public int zza;
    public final /* synthetic */ zzg zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzoe zzd;
    public /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzg, long j, zzoe zzoe, C30391dr r6) {
        super(2, r6);
        this.zzb = zzg;
        this.zzc = j;
        this.zzd = zzoe;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        zzf zzf = new zzf(this.zzb, this.zzc, this.zzd, r8);
        zzf.zze = obj;
        return zzf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.4rF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.android.recaptcha.internal.zzp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.google.android.recaptcha.internal.zzp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.recaptcha.internal.zzp} */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.zza
            if (r0 == 0) goto L_0x003d
            java.lang.Object r3 = r12.zze
            X.4rF r3 = (X.C98494rF) r3
            X.C30691eM.A01(r13)
        L_0x000d:
            java.util.Iterator r5 = X.AnonymousClass8BR.A13(r13)
        L_0x0011:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009f
            java.lang.Object r0 = r5.next()
            X.1eK r0 = (X.C30671eK) r0
            java.lang.Object r0 = r0.value
            java.lang.Throwable r1 = X.C30671eK.A00(r0)
            if (r1 == 0) goto L_0x0011
            java.lang.Object r0 = r3.element
            r4 = 0
            if (r0 != 0) goto L_0x0032
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzp
            if (r0 == 0) goto L_0x002f
            r4 = r1
        L_0x002f:
            r3.element = r4
            goto L_0x0011
        L_0x0032:
            com.google.android.recaptcha.internal.zzn r2 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r1 = com.google.android.recaptcha.internal.zzl.zzal
            com.google.android.recaptcha.internal.zzp r0 = new com.google.android.recaptcha.internal.zzp
            r0.<init>(r2, r1, r4)
            r4 = r0
            goto L_0x002f
        L_0x003d:
            X.C30691eM.A01(r13)
            java.lang.Object r5 = r12.zze
            X.1OX r5 = (X.AnonymousClass1OX) r5
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            com.google.android.recaptcha.internal.zzg r0 = r12.zzb
            java.util.List r0 = r0.zza
            java.util.Iterator r3 = r0.iterator()
        L_0x0050:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r7 = r3.next()
            com.google.android.recaptcha.internal.zza r7 = (com.google.android.recaptcha.internal.zza) r7
            long r8 = r12.zzc
            com.google.android.recaptcha.internal.zzoe r10 = r12.zzd
            r11 = 0
            com.google.android.recaptcha.internal.zze r6 = new com.google.android.recaptcha.internal.zze
            r6.<init>(r7, r8, r10, r11)
            X.1OR r1 = X.AnonymousClass1OR.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.5WH r0 = X.C30451dy.A01(r0, r1, r6, r5)
            r4.add(r0)
            goto L_0x0050
        L_0x0072:
            X.4rF r3 = new X.4rF
            r3.<init>()
            r0 = 0
            X.EEF[] r0 = new X.EEF[r0]
            java.lang.Object[] r1 = r4.toArray(r0)
            X.EEF[] r1 = (X.EEF[]) r1
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            X.EEF[] r1 = (X.EEF[]) r1
            r12.zze = r3
            r0 = 1
            r12.zza = r0
            int r0 = r1.length
            if (r0 != 0) goto L_0x0095
            X.0wS r13 = X.C18460wS.A00
        L_0x0091:
            if (r13 == r2) goto L_0x00ae
            goto L_0x000d
        L_0x0095:
            X.9zc r0 = new X.9zc
            r0.<init>(r1)
            java.lang.Object r13 = r0.A00(r12)
            goto L_0x0091
        L_0x009f:
            java.lang.Object r0 = r3.element
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x00af
            X.1IU r0 = X.C108945cZ.A1J(r0)
        L_0x00a9:
            X.1eK r2 = new X.1eK
            r2.<init>(r0)
        L_0x00ae:
            return r2
        L_0x00af:
            X.1Wu r0 = X.C27621Wu.A00
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
