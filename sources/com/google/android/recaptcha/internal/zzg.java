package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass1OW;
import X.AnonymousClass1Y1;
import X.C18460wS;
import X.C30391dr;
import java.util.ArrayList;
import java.util.List;

public final class zzg {
    public final List zza;

    public zzg() {
        this((List) null, 1, (AnonymousClass1Y1) null);
    }

    public final Object zza(String str, long j, C30391dr r10) {
        return AnonymousClass1OW.A00(r10, new zzc(this, str, j, (C30391dr) null));
    }

    public final List zzc() {
        return this.zza;
    }

    public /* synthetic */ zzg(List list, int i, AnonymousClass1Y1 r5) {
        C18460wS r1 = C18460wS.A00;
        ArrayList A13 = AnonymousClass000.A13();
        this.zza = A13;
        A13.addAll(r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzb(long r7, com.google.android.recaptcha.internal.zzoe r9, X.C30391dr r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzd
            if (r0 == 0) goto L_0x0037
            r4 = r10
            com.google.android.recaptcha.internal.zzd r4 = (com.google.android.recaptcha.internal.zzd) r4
            int r2 = r4.zzc
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r4.zzc = r2
        L_0x0012:
            java.lang.Object r3 = r4.zza
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.zzc
            r0 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r0) goto L_0x003d
            X.C30691eM.A01(r3)
        L_0x0020:
            X.1eK r3 = (X.C30671eK) r3
            java.lang.Object r0 = r3.value
            return r0
        L_0x0025:
            X.C30691eM.A01(r3)
            r10 = 0
            com.google.android.recaptcha.internal.zzf r5 = new com.google.android.recaptcha.internal.zzf
            r5.<init>(r6, r7, r9, r10)
            r4.zzc = r0
            java.lang.Object r3 = X.AnonymousClass1OW.A00(r4, r5)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0037:
            com.google.android.recaptcha.internal.zzd r4 = new com.google.android.recaptcha.internal.zzd
            r4.<init>(r6, r10)
            goto L_0x0012
        L_0x003d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzg.zzb(long, com.google.android.recaptcha.internal.zzoe, X.1dr):java.lang.Object");
    }

    public final void zzd(zza zza2) {
        this.zza.add(zza2);
    }
}
