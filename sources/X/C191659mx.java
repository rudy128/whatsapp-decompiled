package X;

import android.net.TrafficStats;
import android.text.TextUtils;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* renamed from: X.9mx  reason: invalid class name and case insensitive filesystem */
public class C191659mx {
    public final AnonymousClass181 A00;
    public final AnonymousClass11E A01;
    public final AnonymousClass2DU A02;
    public final C220418j A03;
    public final AnonymousClass11W A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass11P A07;

    public C198089xl A00(C20462ALz aLz, String str, String str2, String str3, JSONObject jSONObject, int i, int i2) {
        String str4;
        InputStream inflaterInputStream;
        C20462ALz aLz2 = aLz;
        String str5 = str2;
        if (!this.A01.A09()) {
            return new C198089xl(-1, 2);
        }
        TrafficStats.setThreadStatsTag(i);
        if (!str5.startsWith("https://")) {
            str5 = C17900vP.A0A("https://", str5);
        }
        String str6 = str;
        StringBuilder A0H = C17900vP.A0H(str5, str3, str6);
        A0H.append("?");
        A0H.append("access_token");
        A0H.append("=");
        A0H.append(C197569wu.A0D);
        A0H.append("|");
        URL url = new URL(AnonymousClass000.A0y(C197569wu.A0V, A0H));
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setSSLSocketFactory(this.A03.A00());
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setConnectTimeout(15000);
            httpsURLConnection.setReadTimeout(30000);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            AnonymousClass11W r1 = this.A04;
            synchronized (r1) {
                str4 = r1.A01;
                if (str4 == null) {
                    str4 = AnonymousClass11W.A01(r1, (Map) null);
                    r1.A01 = str4;
                }
            }
            httpsURLConnection.setRequestProperty("User-Agent", str4);
            httpsURLConnection.getURL();
            httpsURLConnection.getRequestProperties();
            jSONObject.toString();
            AnonymousClass00H r11 = this.A06;
            r11.get();
            AnonymousClass181 r7 = this.A00;
            Integer valueOf = Integer.valueOf(i2);
            JSONObject jSONObject2 = null;
            C179259He r2 = new C179259He(r7, httpsURLConnection.getOutputStream(), (Integer) null, valueOf);
            String obj = jSONObject.toString();
            if (TextUtils.isEmpty(obj)) {
                return new C198089xl(3, 1);
            }
            r2.write(AnonymousClass8BR.A1Z(obj));
            r2.flush();
            long currentTimeMillis = System.currentTimeMillis();
            httpsURLConnection.connect();
            int responseCode = httpsURLConnection.getResponseCode();
            httpsURLConnection.getResponseMessage();
            Integer valueOf2 = Integer.valueOf(responseCode);
            Long A1B = C108945cZ.A1B(System.currentTimeMillis(), currentTimeMillis);
            if (!(aLz2 instanceof C172198t2)) {
                ((C172208t3) aLz2).A01.BiV(valueOf2, C17890vO.A0L(), A1B, "HttpsUrlConnection", str6);
            }
            if (responseCode / 100 == 2) {
                String contentEncoding = httpsURLConnection.getContentEncoding();
                InputStream r12 = new C179229Hb(r7, httpsURLConnection.getInputStream(), (Integer) null, valueOf);
                if ("gzip".equalsIgnoreCase(contentEncoding)) {
                    inflaterInputStream = new GZIPInputStream(r12);
                } else {
                    if ("deflate".equalsIgnoreCase(contentEncoding)) {
                        inflaterInputStream = new InflaterInputStream(r12);
                    }
                    jSONObject2 = AnonymousClass1EY.A01(r12);
                }
                r12 = inflaterInputStream;
                jSONObject2 = AnonymousClass1EY.A01(r12);
            }
            httpsURLConnection.getHeaderFields();
            r11.get();
            httpsURLConnection.disconnect();
            return new C198089xl(jSONObject2, responseCode);
        }
        throw C17880vN.A0f(AnonymousClass001.A1E(url, "Failed to create a HTTPS connection with ", AnonymousClass000.A10()));
    }

    public C191659mx(AnonymousClass181 r1, AnonymousClass11E r2, AnonymousClass11P r3, AnonymousClass2DU r4, C220418j r5, AnonymousClass11W r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        this.A07 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = r1;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r2;
        this.A06 = r8;
    }
}
