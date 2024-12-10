package com.google.android.recaptcha.internal;

import X.AnonymousClass00R;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.AnonymousClass1Y1;
import X.C17890vO;
import X.C30391dr;
import X.C30451dy;
import X.C35911n2;
import X.C35921n3;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.List;

public final class zzam {
    public static final zzam zza = new Object();
    public static zzaw zzb;
    public static final String zzc = C17890vO.A0Q();
    public static final C35911n2 zzd = new C35921n3();
    public static final zzt zze = new zzt();
    public static zzg zzf = new zzg((List) null, 1, (AnonymousClass1Y1) null);

    public static final zzg zze() {
        return zzf;
    }

    public static final void zzf(zzg zzg) {
        zzf = zzg;
    }

    public static final Object zzc(Application application, String str, long j, zzbq zzbq, C30391dr r13) {
        return C30451dy.A00(r13, zze.zzb.getCoroutineContext(), new zzah(application, str, j, (zzbq) null, (C30391dr) null));
    }

    public static final Task zzd(Application application, String str, long j) {
        AnonymousClass1OX r2 = zze.zzb;
        zzak zzak = new zzak(application, str, j, (C30391dr) null);
        return zzj.zza(C30451dy.A01(AnonymousClass00R.A00, AnonymousClass1OR.A00, zzak, r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0075, code lost:
        if (r2.Bhx(r10) != r9) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0174, code lost:
        throw X.BE8.A0O(com.google.android.recaptcha.RecaptchaErrorCode.INTERNAL_ERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0177, code lost:
        r0 = th;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x016e */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b1 A[Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0150 A[Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016e A[PHI: r2 
      PHI: (r2v6 X.1n2) = (r2v9 X.1n2), (r2v9 X.1n2), (r2v9 X.1n2), (r2v13 X.1n2) binds: [B:16:0x0077, B:39:0x0136, B:29:0x0101, B:33:0x0120] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:46:0x016e] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x0176=Splitter:B:50:0x0176, B:46:0x016e=Splitter:B:46:0x016e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza(android.app.Application r27, java.lang.String r28, long r29, com.google.android.recaptcha.internal.zzab r31, android.webkit.WebView r32, com.google.android.recaptcha.internal.zzbq r33, com.google.android.recaptcha.internal.zzt r34, X.C30391dr r35) {
        /*
            r26 = this;
            r5 = r35
            r13 = r27
            r8 = r28
            r12 = r31
            r11 = r34
            r0 = r29
            boolean r2 = r5 instanceof com.google.android.recaptcha.internal.zzai
            if (r2 == 0) goto L_0x003b
            r10 = r5
            com.google.android.recaptcha.internal.zzai r10 = (com.google.android.recaptcha.internal.zzai) r10
            int r4 = r10.zzg
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x003b
            int r4 = r4 - r3
            r10.zzg = r4
        L_0x001e:
            java.lang.Object r7 = r10.zze
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r5 = r10.zzg
            r4 = 1
            r2 = 2
            r3 = 0
            if (r5 == 0) goto L_0x005e
            if (r5 == r4) goto L_0x0048
            if (r5 != r2) goto L_0x0043
            java.lang.Object r5 = r10.zzc
            com.google.android.recaptcha.internal.zzbg r5 = (com.google.android.recaptcha.internal.zzbg) r5
            java.lang.Object r4 = r10.zzb
            com.google.android.recaptcha.internal.zzbd r4 = (com.google.android.recaptcha.internal.zzbd) r4
            java.lang.Object r2 = r10.zza
            X.1n2 r2 = (X.C35911n2) r2
            goto L_0x0120
        L_0x003b:
            com.google.android.recaptcha.internal.zzai r10 = new com.google.android.recaptcha.internal.zzai
            r2 = r26
            r10.<init>(r2, r5)
            goto L_0x001e
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0048:
            long r0 = r10.zzd
            X.1n2 r2 = r10.zzh
            com.google.android.recaptcha.internal.zzt r11 = r10.zzi
            java.lang.Object r12 = r10.zzc
            com.google.android.recaptcha.internal.zzab r12 = (com.google.android.recaptcha.internal.zzab) r12
            java.lang.Object r8 = r10.zzb
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r13 = r10.zza
            android.app.Application r13 = (android.app.Application) r13
            X.C30691eM.A01(r7)
            goto L_0x0077
        L_0x005e:
            X.C30691eM.A01(r7)
            X.1n2 r2 = zzd
            r10.zza = r13
            r10.zzb = r8
            r10.zzc = r12
            r10.zzi = r11
            r10.zzh = r2
            r10.zzd = r0
            r10.zzg = r4
            java.lang.Object r4 = r2.Bhx(r10)
            if (r4 == r9) goto L_0x017e
        L_0x0077:
            java.lang.String r6 = X.C17890vO.A0Q()     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            java.lang.String r5 = zzc     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzbd r4 = new com.google.android.recaptcha.internal.zzbd     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r4.<init>(r5, r6)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r4.zzd = r6     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            java.lang.String r5 = r12.zzc     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzbo r7 = new com.google.android.recaptcha.internal.zzbo     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r7.<init>(r5)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            X.1OX r5 = r11.zzd     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzbm r6 = new com.google.android.recaptcha.internal.zzbm     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r6.<init>(r13, r7, r5)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzbg r5 = new com.google.android.recaptcha.internal.zzbg     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r15 = r8
            r16 = r13
            r17 = r12
            r18 = r11
            r19 = r6
            r14 = r5
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzne r6 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzbb r6 = r4.zza(r6)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r14 = 2
            r5.zze.put(r6, new com.google.android.recaptcha.internal.zzbf(r6, r5.zza, new com.google.android.recaptcha.internal.zzac()))     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r15 = 5000(0x1388, double:2.4703E-320)
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 < 0) goto L_0x0150
            java.lang.String r6 = "android.permission.INTERNET"
            int r6 = X.C19740yt.A01(r13, r6)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            if (r6 != 0) goto L_0x0136
            com.google.android.recaptcha.internal.zzy r7 = new com.google.android.recaptcha.internal.zzy     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r7.<init>(r13)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzbq r6 = new com.google.android.recaptcha.internal.zzbq     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r6.<init>(r7, r5)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzaw r7 = zzb     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            if (r7 == 0) goto L_0x00f5
            java.lang.String r0 = r7.zze     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            boolean r0 = X.C18070vi.A18(r0, r8)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            if (r0 == 0) goto L_0x00d9
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzbb r0 = r4.zza(r0)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r5.zza(r0)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            goto L_0x0130
        L_0x00d9:
            com.google.android.recaptcha.RecaptchaErrorCode r5 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_SITEKEY     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            java.lang.String r4 = r7.zze     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            java.lang.String r0 = "Only one site key can be used per runtime. The site key you provided "
            r1.append(r0)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r1.append(r8)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            java.lang.String r0 = " is different than "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.RecaptchaException r0 = new com.google.android.recaptcha.RecaptchaException     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r0.<init>(r5, r1)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            throw r0     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
        L_0x00f5:
            r10.zza = r2     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r10.zzb = r4     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r10.zzc = r5     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r10.zzi = r3     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r10.zzh = r3     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            r10.zzg = r14     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzaj r14 = new com.google.android.recaptcha.internal.zzaj     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            r21 = r3
            r23 = r0
            r25 = r3
            r22 = r5
            r19 = r4
            r20 = r11
            r18 = r6
            r17 = r8
            r16 = r12
            r15 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r25)     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            java.lang.Object r7 = X.AnonymousClass4Z5.A00(r10, r14, r0)     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            if (r7 == r9) goto L_0x017e
            goto L_0x0123
        L_0x0120:
            X.C30691eM.A01(r7)     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
        L_0x0123:
            com.google.android.recaptcha.internal.zzaw r7 = (com.google.android.recaptcha.internal.zzaw) r7     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
            zzb = r7     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
            com.google.android.recaptcha.internal.zzbb r0 = r4.zza(r0)     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
            r5.zza(r0)     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
        L_0x0130:
            r2.CQ9(r3)
            return r7
        L_0x0134:
            r0 = move-exception
            goto L_0x0176
        L_0x0136:
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.internal.zzbb r4 = r4.zza(r0)     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zze     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzv     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.internal.zzp r0 = X.BE6.A0b(r0, r1, r3)     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            r5.zzb(r4, r0, r3)     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.RecaptchaErrorCode r0 = com.google.android.recaptcha.RecaptchaErrorCode.NETWORK_ERROR     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.RecaptchaException r0 = X.BE8.A0O(r0)     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            throw r0     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
        L_0x0150:
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzm     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzT     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.internal.zzp r1 = X.BE6.A0b(r0, r1, r3)     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.internal.zzbb r0 = r4.zza(r0)     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            r5.zzb(r0, r1, r3)     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.RecaptchaErrorCode r0 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_TIMEOUT     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            com.google.android.recaptcha.RecaptchaException r0 = X.BE8.A0O(r0)     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
            throw r0     // Catch:{ RecaptchaException -> 0x016c, Exception -> 0x016e, all -> 0x016a }
        L_0x016a:
            r0 = move-exception
            goto L_0x017a
        L_0x016c:
            r0 = move-exception
            goto L_0x0176
        L_0x016e:
            com.google.android.recaptcha.RecaptchaErrorCode r0 = com.google.android.recaptcha.RecaptchaErrorCode.INTERNAL_ERROR     // Catch:{ all -> 0x0177 }
            com.google.android.recaptcha.RecaptchaException r0 = X.BE8.A0O(r0)     // Catch:{ all -> 0x0177 }
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0175:
            r0 = move-exception
        L_0x0176:
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            goto L_0x017a
        L_0x0179:
            r0 = move-exception
        L_0x017a:
            r2.CQ9(r3)
            throw r0
        L_0x017e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.zza(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzab, android.webkit.WebView, com.google.android.recaptcha.internal.zzbq, com.google.android.recaptcha.internal.zzt, X.1dr):java.lang.Object");
    }
}
