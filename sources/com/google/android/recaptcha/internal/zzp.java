package com.google.android.recaptcha.internal;

import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass8BW;
import X.BE6;
import X.BE8;
import X.BE9;
import X.C108985cd;
import X.C18070vi;
import X.C72463Mc;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;

public final class zzp extends Exception {
    public static final zzo zza = new Object();
    public static final Map zzb;
    public final zzn zzc;
    public final zzl zzd;
    public final String zze;
    public final Map zzf;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.google.android.recaptcha.internal.zzo] */
    static {
        AnonymousClass1D6[] r3 = new AnonymousClass1D6[7];
        C72463Mc.A1H(zzpb.JS_NETWORK_ERROR, BE6.A0b(zzl.zzm, zzn.zze, (String) null), r3);
        C108985cd.A1G(zzpb.JS_INTERNAL_ERROR, BE6.A0b(zzl.zzk, zzn.zzc, (String) null), r3);
        C72463Mc.A1I(zzpb.JS_INVALID_SITE_KEY, BE6.A0b(zzl.zzn, zzn.zzf, (String) null), r3);
        C72463Mc.A1J(zzpb.JS_INVALID_SITE_KEY_TYPE, BE6.A0b(zzl.zzo, zzn.zzg, (String) null), r3);
        AnonymousClass8BW.A1L(zzpb.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, BE6.A0b(zzl.zzp, zzn.zzh, (String) null), r3);
        BE9.A1E(zzpb.JS_INVALID_ACTION, BE6.A0b(zzl.zzq, zzn.zzi, (String) null), r3);
        BE9.A1F(zzpb.JS_PROGRAM_ERROR, BE6.A0b(zzl.zzu, zzn.zzc, (String) null), r3);
        zzb = AnonymousClass1D7.A0B(r3);
    }

    public final zzl zza() {
        return this.zzd;
    }

    public final zzn zzb() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zze;
    }

    public final RecaptchaException zzc() {
        if (C18070vi.A18(this.zzd, zzl.zzT)) {
            return BE8.A0O(RecaptchaErrorCode.INVALID_TIMEOUT);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        if (recaptchaException == null) {
            return BE8.A0O(RecaptchaErrorCode.INTERNAL_ERROR);
        }
        return recaptchaException;
    }

    public zzp(zzn zzn, zzl zzl, String str) {
        this.zzc = zzn;
        this.zzd = zzl;
        this.zze = str;
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[7];
        zzn zzn2 = zzn.zze;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        C72463Mc.A1H(zzn2, BE8.A0O(recaptchaErrorCode), r2);
        C108985cd.A1G(zzn.zzk, BE8.A0O(recaptchaErrorCode), r2);
        AnonymousClass1D6.A03(zzn.zzf, BE8.A0O(RecaptchaErrorCode.INVALID_SITEKEY), r2, 2);
        C72463Mc.A1J(zzn.zzg, BE8.A0O(RecaptchaErrorCode.INVALID_KEYTYPE), r2);
        AnonymousClass8BW.A1L(zzn.zzh, BE8.A0O(RecaptchaErrorCode.INVALID_PACKAGE_NAME), r2);
        BE9.A1E(zzn.zzi, BE8.A0O(RecaptchaErrorCode.INVALID_ACTION), r2);
        BE9.A1F(zzn.zzc, BE8.A0O(RecaptchaErrorCode.INTERNAL_ERROR), r2);
        this.zzf = AnonymousClass1D7.A0B(r2);
    }
}
