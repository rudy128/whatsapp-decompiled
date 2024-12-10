package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass8BV;
import X.C17880vN;
import X.C18070vi;
import android.net.TrafficStats;
import android.webkit.URLUtil;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public final class zzbo implements zzbn {
    public final String zza;

    public zzbo(String str) {
        this.zza = str;
    }

    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection A0v = AnonymousClass8BV.A0v(this.zza);
                C18070vi.A0z(A0v, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) A0v;
            } else if (URLUtil.isHttpsUrl(this.zza)) {
                URLConnection A0v2 = AnonymousClass8BV.A0v(this.zza);
                C18070vi.A0z(A0v2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                httpURLConnection = (HttpsURLConnection) A0v2;
            } else {
                throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            return httpURLConnection.getResponseCode() == 200;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public static final void zzb(byte[] bArr) {
        for (zznf zznf : zzni.zzk(bArr).zzd) {
            String[] A1Z = C17880vN.A1Z();
            A1Z[0] = "INIT_TOTAL";
            if (!C18070vi.A0O("EXECUTE_TOTAL", A1Z, 1).contains(zznf.zzj().name()) || AnonymousClass000.A1O(zznf.zzd & 2)) {
            }
        }
    }
}
