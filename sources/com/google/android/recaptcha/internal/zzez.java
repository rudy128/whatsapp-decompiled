package com.google.android.recaptcha.internal;

import X.AnonymousClass3MX;
import X.BE6;
import X.BE7;
import X.C108935cY;
import X.C17880vN;
import X.C29431cG;
import X.C30391dr;
import X.C99814tV;
import android.content.Context;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzez implements zza {
    public static final zzep zza = new Object();
    public C108935cY zzb;
    public zzbu zzc;
    public final WebView zzd;
    public final String zze;
    public final Context zzf;
    public final zzab zzg;
    public final zzbd zzh;
    public final zzbg zzi;
    public final zzbq zzj;
    public final Map zzk = zzfa.zza();
    public final Map zzl;
    public final Map zzm;
    public final zzfh zzn;
    public final zzeq zzo;
    public final zzbd zzp;
    public final zzt zzq;

    public final WebView zzc() {
        return this.zzd;
    }

    public final zzbq zzf() {
        return this.zzj;
    }

    public final zzeq zzg() {
        return this.zzo;
    }

    public static final /* synthetic */ void zzl(zzez zzez, zzoe zzoe) {
        zzez.zzd.clearCache(true);
        zzbb zza2 = zzez.zzp.zza(zzne.INIT_NETWORK);
        zzez.zzi.zze.put(zza2, new zzbf(zza2, zzez.zzi.zza, new zzac()));
        AnonymousClass3MX.A1Q(new zzey(zzez, zzoe, zza2, (C30391dr) null), zzez.zzq.zzd);
    }

    public static final /* synthetic */ void zzm(zzez zzez, String str) {
        zzbb zza2 = zzez.zzp.zza(zzne.LOAD_WEBVIEW);
        try {
            zzez.zzi.zze.put(zza2, new zzbf(zza2, zzez.zzi.zza, new zzac()));
            zzez.zzd.loadDataWithBaseURL(zzez.zzg.zza, str, "text/html", "utf-8", (String) null);
        } catch (Exception unused) {
            zzp A0b = BE6.A0b(zzl.zzag, zzn.zzc, (String) null);
            zzez.zzi.zzb(zza2, A0b, (String) null);
            BE7.A0x(zzez).BFO(A0b);
        }
    }

    private final zzp zzp(Exception exc, zzp zzp2) {
        if (exc instanceof C99814tV) {
            return BE6.A0b(zzl.zzj, zzn.zzc, (String) null);
        } else if (exc instanceof zzp) {
            return (zzp) exc;
        } else {
            return zzp2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza(java.lang.String r7, long r8, X.C30391dr r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzer
            if (r0 == 0) goto L_0x0022
            r4 = r10
            com.google.android.recaptcha.internal.zzer r4 = (com.google.android.recaptcha.internal.zzer) r4
            int r2 = r4.zzc
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.zzc = r2
        L_0x0012:
            java.lang.Object r1 = r4.zza
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.zzc
            r2 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r2) goto L_0x0028
            java.lang.String r7 = r4.zze
            com.google.android.recaptcha.internal.zzez r5 = r4.zzd
            goto L_0x0045
        L_0x0022:
            com.google.android.recaptcha.internal.zzer r4 = new com.google.android.recaptcha.internal.zzer
            r4.<init>(r6, r10)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002d:
            X.C30691eM.A01(r1)
            r1 = 0
            com.google.android.recaptcha.internal.zzet r0 = new com.google.android.recaptcha.internal.zzet     // Catch:{ Exception -> 0x004b }
            r0.<init>(r7, r6, r1)     // Catch:{ Exception -> 0x004b }
            r4.zzd = r6     // Catch:{ Exception -> 0x004b }
            r4.zze = r7     // Catch:{ Exception -> 0x004b }
            r4.zzc = r2     // Catch:{ Exception -> 0x004b }
            java.lang.Object r1 = X.AnonymousClass4Z5.A00(r4, r0, r8)     // Catch:{ Exception -> 0x004b }
            if (r1 != r3) goto L_0x0043
            return r3
        L_0x0043:
            r5 = r6
            goto L_0x0048
        L_0x0045:
            X.C30691eM.A01(r1)     // Catch:{ Exception -> 0x004e }
        L_0x0048:
            com.google.android.recaptcha.internal.zzog r1 = (com.google.android.recaptcha.internal.zzog) r1     // Catch:{ Exception -> 0x004e }
            return r1
        L_0x004b:
            r4 = move-exception
            r5 = r6
            goto L_0x004f
        L_0x004e:
            r4 = move-exception
        L_0x004f:
            java.lang.Class r3 = r4.getClass()
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza
            com.google.android.recaptcha.internal.zzn r2 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r1 = com.google.android.recaptcha.internal.zzl.zzai
            java.lang.String r0 = r3.getSimpleName()
            com.google.android.recaptcha.internal.zzp r0 = X.BE6.A0b(r1, r2, r0)
            com.google.android.recaptcha.internal.zzp r1 = r5.zzp(r4, r0)
            java.util.Map r0 = r5.zzl
            java.lang.Object r0 = r0.remove(r7)
            X.5cY r0 = (X.C108935cY) r0
            if (r0 == 0) goto L_0x0072
            r0.BFO(r1)
        L_0x0072:
            X.1IU r1 = X.C30691eM.A00(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzez.zza(java.lang.String, long, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (r2.longValue() > (r9 - 2000)) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af A[LOOP:0: B:35:0x00a9->B:37:0x00af, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzb(long r9, com.google.android.recaptcha.internal.zzoe r11, X.C30391dr r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzev
            if (r0 == 0) goto L_0x0024
            r4 = r12
            com.google.android.recaptcha.internal.zzev r4 = (com.google.android.recaptcha.internal.zzev) r4
            int r2 = r4.zzd
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r4.zzd = r2
        L_0x0012:
            java.lang.Object r1 = r4.zzb
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.zzd
            r2 = 2
            r7 = 1
            r3 = 0
            if (r0 == 0) goto L_0x002f
            if (r0 != r7) goto L_0x002a
            long r9 = r4.zza
            com.google.android.recaptcha.internal.zzez r4 = r4.zze
            goto L_0x0069
        L_0x0024:
            com.google.android.recaptcha.internal.zzev r4 = new com.google.android.recaptcha.internal.zzev
            r4.<init>(r8, r12)
            goto L_0x0012
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002f:
            X.C30691eM.A01(r1)
            com.google.android.recaptcha.internal.zzbg r6 = r8.zzi     // Catch:{ Exception -> 0x0072 }
            com.google.android.recaptcha.internal.zzbd r1 = r8.zzp     // Catch:{ Exception -> 0x0072 }
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_NATIVE     // Catch:{ Exception -> 0x0072 }
            com.google.android.recaptcha.internal.zzbb r0 = r1.zza(r0)     // Catch:{ Exception -> 0x0072 }
            r6.zze.put(r0, new com.google.android.recaptcha.internal.zzbf(r0, r6.zza, new com.google.android.recaptcha.internal.zzac()))     // Catch:{ Exception -> 0x0072 }
            com.google.android.recaptcha.internal.zzgw r1 = r11.zzl     // Catch:{ Exception -> 0x0072 }
            com.google.android.recaptcha.internal.zzag r0 = new com.google.android.recaptcha.internal.zzag     // Catch:{ Exception -> 0x0072 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0072 }
            com.google.android.recaptcha.internal.zzca r0 = r8.zzo(r11, r0)     // Catch:{ Exception -> 0x0072 }
            r8.zzc = r0     // Catch:{ Exception -> 0x0072 }
            X.5WJ r0 = new X.5WJ     // Catch:{ Exception -> 0x0072 }
            r0.<init>()     // Catch:{ Exception -> 0x0072 }
            r8.zzb = r0     // Catch:{ Exception -> 0x0072 }
            r0.hashCode()     // Catch:{ Exception -> 0x0072 }
            com.google.android.recaptcha.internal.zzew r0 = new com.google.android.recaptcha.internal.zzew     // Catch:{ Exception -> 0x0072 }
            r0.<init>(r8, r11, r3)     // Catch:{ Exception -> 0x0072 }
            r4.zze = r8     // Catch:{ Exception -> 0x0072 }
            r4.zza = r9     // Catch:{ Exception -> 0x0072 }
            r4.zzd = r7     // Catch:{ Exception -> 0x0072 }
            java.lang.Object r1 = X.AnonymousClass4Z5.A00(r4, r0, r9)     // Catch:{ Exception -> 0x0072 }
            if (r1 == r5) goto L_0x0071
            r4 = r8
            goto L_0x006c
        L_0x0069:
            X.C30691eM.A01(r1)     // Catch:{ Exception -> 0x0075 }
        L_0x006c:
            X.1eK r1 = (X.C30671eK) r1     // Catch:{ Exception -> 0x0075 }
            java.lang.Object r0 = r1.value     // Catch:{ Exception -> 0x0075 }
            return r0
        L_0x0071:
            return r5
        L_0x0072:
            r5 = move-exception
            r4 = r8
            goto L_0x0076
        L_0x0075:
            r5 = move-exception
        L_0x0076:
            r5.getMessage()
            boolean r6 = r5 instanceof X.C99814tV
            if (r6 == 0) goto L_0x00d8
            com.google.android.recaptcha.internal.zzne[] r2 = new com.google.android.recaptcha.internal.zzne[r2]
            r1 = 0
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL
            r2[r1] = r0
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.LOAD_WEBVIEW
            java.util.List r7 = X.C18070vi.A0O(r0, r2, r7)
        L_0x008a:
            com.google.android.recaptcha.internal.zzeq r0 = r4.zzo
            java.lang.Long r2 = r0.zzb
            if (r6 == 0) goto L_0x00c1
            if (r2 == 0) goto L_0x009d
            r0 = -2000(0xfffffffffffff830, double:NaN)
            long r9 = r9 + r0
            long r1 = r2.longValue()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c1
        L_0x009d:
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zze
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzS
            com.google.android.recaptcha.internal.zzp r6 = X.BE6.A0b(r0, r1, r3)
        L_0x00a5:
            java.util.Iterator r5 = r7.iterator()
        L_0x00a9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r2 = r5.next()
            com.google.android.recaptcha.internal.zzne r2 = (com.google.android.recaptcha.internal.zzne) r2
            com.google.android.recaptcha.internal.zzbg r1 = r4.zzi
            com.google.android.recaptcha.internal.zzbd r0 = r4.zzp
            com.google.android.recaptcha.internal.zzbb r0 = r0.zza(r2)
            r1.zzb(r0, r6, r3)
            goto L_0x00a9
        L_0x00c1:
            java.lang.Class r6 = r5.getClass()
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza
            com.google.android.recaptcha.internal.zzn r2 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r1 = com.google.android.recaptcha.internal.zzl.zzah
            java.lang.String r0 = r6.getSimpleName()
            com.google.android.recaptcha.internal.zzp r0 = X.BE6.A0b(r1, r2, r0)
            com.google.android.recaptcha.internal.zzp r6 = r4.zzp(r5, r0)
            goto L_0x00a5
        L_0x00d8:
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL
            java.util.List r7 = X.C18070vi.A0M(r0)
            goto L_0x008a
        L_0x00df:
            com.google.android.recaptcha.RecaptchaException r0 = r6.zzc()
            X.1IU r0 = X.C30691eM.A00(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzez.zzb(long, com.google.android.recaptcha.internal.zzoe, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.android.recaptcha.internal.zzaa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.recaptcha.internal.zzed, java.lang.Object] */
    public final zzca zzo(zzoe zzoe, zzag zzag) {
        zzcd zzcd = new zzcd(this.zzd, this.zzq.zzb);
        zzef zzef = new zzef();
        zzef.zzb(C29431cG.A1C(zzoe.zzk));
        zzcl zzcl = new zzcl(zzcd, zzag, new Object());
        zzeg zzeg = new zzeg(zzef, new Object());
        zzcl.zzf(3, this.zzf);
        zzcl.zzf(5, zzen.class.getMethod("cs", new Class[]{new Object[0].getClass()}));
        zzcl.zzf(6, new zzeh(this.zzf));
        zzcl.zzf(7, new Object());
        zzcl.zzf(8, new zzeo(this.zzf));
        zzcl.zzf(9, new zzek(this.zzf));
        zzcl.zzf(10, new zzei(this.zzf));
        return new zzca(this.zzq.zzc, zzcl, zzeg, zzbt.zza());
    }

    public zzez(WebView webView, String str, Context context, zzab zzab, zzbd zzbd, zzt zzt, zzbg zzbg, zzbq zzbq) {
        this.zzd = webView;
        this.zze = str;
        this.zzf = context;
        this.zzg = zzab;
        this.zzh = zzbd;
        this.zzq = zzt;
        this.zzi = zzbg;
        this.zzj = zzbq;
        LinkedHashMap A13 = C17880vN.A13();
        this.zzl = A13;
        this.zzm = A13;
        this.zzn = new zzfh();
        zzeq zzeq = new zzeq(this);
        this.zzo = zzeq;
        zzbd zzbd2 = new zzbd(zzbd);
        zzbd2.zzd = zzbd.zzc;
        this.zzp = zzbd2;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzeq, "RN");
        webView.setWebViewClient(new zzeu(this));
    }

    public final C108935cY zzk() {
        return BE7.A0x(this);
    }
}
