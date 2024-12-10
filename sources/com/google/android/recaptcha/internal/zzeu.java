package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import X.BE7;
import X.C18070vi;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.concurrent.TimeUnit;

public final class zzeu extends WebViewClient {
    public final /* synthetic */ zzez zza;

    public zzeu(zzez zzez) {
        this.zza = zzez;
    }

    public final void onPageFinished(WebView webView, String str) {
        zzez zzez = this.zza;
        zzez.zzi.zza(zzez.zzp.zza(zzne.INIT_NETWORK));
        zzv.zza(zzx.zzl.zzn, this.zza.zzn.zza(TimeUnit.MICROSECONDS));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        zzo zzo = zzp.zza;
        zzn zzn = zzn.zze;
        zzl zzl = (zzl) AnonymousClass000.A0w(this.zza.zzk, i);
        if (zzl == null) {
            zzl = zzl.zzY;
        }
        zzp A0b = BE6.A0b(zzl, zzn, (String) null);
        BE7.A0x(this.zza).hashCode();
        A0b.getMessage();
        BE7.A0x(this.zza).BFO(A0b);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        zzfb zzfb = zzfb.zza;
        C18070vi.A0b(parse);
        if (!zzfb.zzd(parse) || zzfb.zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzp A0b = BE6.A0b(zzl.zzac, zzn.zzc, (String) null);
        BE7.A0x(this.zza).hashCode();
        parse.toString();
        BE7.A0x(this.zza).BFO(A0b);
        return new WebResourceResponse("text/plain", DefaultCrypto.UTF_8, BE6.A0h(new byte[0]));
    }

    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }
}
