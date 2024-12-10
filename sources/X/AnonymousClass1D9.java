package X;

import android.net.Network;
import android.net.Uri;
import android.util.Pair;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.1D9  reason: invalid class name */
public class AnonymousClass1D9 {
    public final AnonymousClass181 A00;
    public final AnonymousClass11W A01;
    public final C18030ve A02;
    public final JniBridge A03;

    public AUZ A06(C220418j r2, String str) {
        return A05((Pair) null, r2, str, (String) null);
    }

    public AUZ A08(Integer num, String str) {
        return A00(this, num, str, (String) null, (String) null, (String) null, (Map) null, (byte[]) null, false, false, false);
    }

    public static AUZ A00(AnonymousClass1D9 r5, Integer num, String str, String str2, String str3, String str4, Map map, byte[] bArr, boolean z, boolean z2, boolean z3) {
        GZIPOutputStream gZIPOutputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        if (str3 == null) {
            str3 = r5.A01.A02();
        }
        httpURLConnection.setRequestProperty("User-Agent", str3);
        if (z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (str2 != null || bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            if (str4 == null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            } else {
                httpURLConnection.setRequestProperty("Content-Type", str4);
            }
            if (z2) {
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        } else if (z3) {
            httpURLConnection.setRequestMethod("DELETE");
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        A04(r5, httpURLConnection);
        if (!(str2 == null && bArr == null)) {
            C179259He r2 = new C179259He(r5.A00, httpURLConnection.getOutputStream(), (Integer) null, num);
            if (bArr == null) {
                try {
                    bArr = str2.getBytes(C19620yd.A0A);
                } catch (Throwable th) {
                    try {
                        r2.close();
                        throw th;
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                        throw th;
                    }
                }
            }
            if (z2) {
                gZIPOutputStream = new GZIPOutputStream(r2);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
            } else {
                r2.write(bArr);
            }
            r2.close();
        }
        httpURLConnection.connect();
        return new AUZ((Boolean) null, httpURLConnection);
        throw th;
    }

    public static HttpURLConnection A01(Network network, AnonymousClass1D9 r2, String str) {
        URLConnection openConnection;
        URL url = new URL(str);
        if (network == null) {
            openConnection = url.openConnection();
        } else {
            openConnection = network.openConnection(url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        A04(r2, httpURLConnection);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public static void A04(AnonymousClass1D9 r11, HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getRequestProperty("X-FB-Request-Analytics-Tags") == null) {
                boolean z = false;
                for (StackTraceElement className : Thread.currentThread().getStackTrace()) {
                    String className2 = className.getClassName();
                    if (className2.contains("com.whatsapp.http")) {
                        z = true;
                    } else if (z) {
                        String replaceAll = className2.replaceAll("com.whatsapp.", "");
                        if (replaceAll != null) {
                            C58092k8 r3 = new C58092k8(r11.A02, r11.A03, 0, "to_be_tagged", "unknown", "unknown", replaceAll, false);
                            StringBuilder sb = new StringBuilder();
                            sb.append("WaHttpUrlConnectionClient/setDefaultTrafficAttributionHeader/missing traffic attribution header. Classname: ");
                            sb.append(replaceAll);
                            Log.i(sb.toString());
                            httpURLConnection.setRequestProperty("X-FB-Request-Analytics-Tags", r3.A00());
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (IllegalStateException e) {
            Log.e("WaHttpUrlConnectionClient/setDefaultTrafficAttributionHeader/failed to set header", e);
        }
    }

    public AUZ A05(Pair pair, C220418j r7, String str, String str2) {
        int i;
        try {
            try {
                URLConnection openConnection = new URL(Uri.parse(str).toString()).openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setSSLSocketFactory(r7.A02());
                    httpsURLConnection.setConnectTimeout(15000);
                    httpsURLConnection.setReadTimeout(30000);
                    if (str2 != null) {
                        httpsURLConnection.addRequestProperty("If-None-Match", str2);
                    }
                    if (pair != null) {
                        StringBuilder sb = new StringBuilder("bytes=");
                        Object obj = pair.first;
                        if (obj == null || (i = ((Number) obj).intValue()) <= 0) {
                            i = 0;
                        }
                        sb.append(i);
                        sb.append("-");
                        Object obj2 = pair.second;
                        if (!(obj2 == null || ((Number) obj2).intValue() == -1)) {
                            sb.append(obj2);
                        }
                        httpsURLConnection.setRequestProperty("Range", sb.toString());
                    }
                    httpsURLConnection.setRequestProperty("User-Agent", this.A01.A02());
                    A04(this, httpsURLConnection);
                    return new AUZ((Boolean) null, httpsURLConnection);
                }
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection");
            } catch (IOException e) {
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection", e);
            }
        } catch (MalformedURLException e2) {
            Log.e("WaHttpUrlConnectionClient/createDownloadableFilesConnection/malformed-url : ", e2);
            throw e2;
        }
    }

    public AUZ A07(C220418j r4, String str, String str2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        if (str2 != null) {
            httpURLConnection.setRequestProperty("X-FB-Request-Analytics-Tags", str2);
        }
        A04(this, httpURLConnection);
        if ((httpURLConnection instanceof HttpsURLConnection) && r4 != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(r4.A02());
        }
        httpURLConnection.connect();
        return new AUZ((Boolean) null, httpURLConnection);
    }

    public AUZ A09(Integer num, String str, String str2, String str3, Map map, boolean z, boolean z2) {
        String str4 = str3;
        if (str3 == null) {
            AnonymousClass11W r1 = this.A01;
            synchronized (r1) {
                str4 = r1.A01;
                if (str4 == null) {
                    str4 = AnonymousClass11W.A01(r1, (Map) null);
                    r1.A01 = str4;
                }
            }
        }
        return A00(this, num, str, str2, str4, (String) null, map, (byte[]) null, z, z2, false);
    }

    public AnonymousClass1D9(AnonymousClass181 r1, C18030ve r2, AnonymousClass11W r3, JniBridge jniBridge) {
        this.A02 = r2;
        this.A03 = jniBridge;
        this.A01 = r3;
        this.A00 = r1;
    }

    public static URLConnection A02(URL url) {
        return url.openConnection();
    }

    public static HttpsURLConnection A03(URL url) {
        return (HttpsURLConnection) url.openConnection();
    }

    public AnonymousClass1D9() {
    }
}
