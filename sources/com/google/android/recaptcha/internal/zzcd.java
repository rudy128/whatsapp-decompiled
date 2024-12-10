package com.google.android.recaptcha.internal;

import X.AnonymousClass1OX;
import X.AnonymousClass3MX;
import X.C30391dr;
import android.webkit.WebView;
import java.util.Arrays;

public final class zzcd {
    public final WebView zza;
    public final AnonymousClass1OX zzb;

    public zzcd(WebView webView, AnonymousClass1OX r2) {
        this.zza = webView;
        this.zzb = r2;
    }

    public final void zzb(String str, String... strArr) {
        AnonymousClass3MX.A1Q(new zzcc((String[]) Arrays.copyOf(strArr, strArr.length), this, str, (C30391dr) null), this.zzb);
    }
}
