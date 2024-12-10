package X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1Kb  reason: invalid class name and case insensitive filesystem */
public class C24371Kb {
    public final C24361Ka A00;
    public final C18030ve A01;
    public final AnonymousClass11W A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass11E A04;
    public final AnonymousClass1KX A05;
    public final C220418j A06;
    public final AnonymousClass00H A07;

    public AUZ A02(C191779nA r17, String str, URL url, long j, long j2, boolean z) {
        Throwable th;
        B9R b9r;
        AnonymousClass6QY r6;
        TrafficStats.setThreadStatsTag(7);
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A01, 72);
        C191779nA r9 = r17;
        if (z && r9.A00 == 0) {
            this.A00.A00();
        }
        AnonymousClass1KX r0 = this.A05;
        boolean A022 = r0.A02();
        boolean A012 = r0.A01();
        String A023 = this.A02.A02();
        C220418j r1 = this.A06;
        AnonymousClass11E r3 = this.A04;
        this.A07.get();
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            boolean z2 = false;
            if (A022) {
                b9r = r1.A01(false);
                if (A012) {
                    httpsURLConnection.setHostnameVerifier(new C21518AlR(r9.A07, HttpsURLConnection.getDefaultHostnameVerifier()));
                }
            } else {
                b9r = r1.A02();
            }
            int BPF = b9r.BPF();
            httpsURLConnection.setSSLSocketFactory((SSLSocketFactory) b9r);
            httpsURLConnection.setConnectTimeout(15000);
            httpsURLConnection.setReadTimeout(30000);
            httpsURLConnection.setRequestProperty("User-Agent", A023);
            httpsURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpsURLConnection.setRequestProperty("Host", r9.A07);
            long j3 = j;
            long j4 = j2;
            if (!(j == 0 && j2 == -1)) {
                StringBuilder sb = new StringBuilder();
                sb.append("bytes=");
                sb.append(j3);
                sb.append("-");
                String obj = sb.toString();
                if (j2 != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append(j4);
                    obj = sb2.toString();
                }
                httpsURLConnection.setRequestProperty("Range", obj);
            }
            if (A052) {
                httpsURLConnection.setRequestProperty("X-FB-Socket-Option", "TCP_CONGESTION=bbr");
            }
            String str2 = str;
            if (str != null) {
                httpsURLConnection.setRequestProperty("X-FB-Request-Analytics-Tags", str2);
            }
            String str3 = r9.A06;
            if (!TextUtils.isEmpty(str3)) {
                httpsURLConnection.setRequestProperty("X-FB-nc-oc", str3);
            }
            try {
                int responseCode = httpsURLConnection.getResponseCode();
                if (b9r.BPF() == BPF) {
                    z2 = true;
                }
                C24521Kq r02 = C24521Kq.$redex_init_class;
                if (!(responseCode == 200 || responseCode == 206)) {
                    String str4 = null;
                    if (httpsURLConnection.getErrorStream() != null) {
                        try {
                            InputStream errorStream = httpsURLConnection.getErrorStream();
                            try {
                                r6 = new AnonymousClass6QY(errorStream, 1024);
                                str4 = AnonymousClass1EY.A00(r6);
                                if (!"".isEmpty()) {
                                    str4 = "";
                                }
                                r6.close();
                                if (errorStream != null) {
                                    errorStream.close();
                                }
                            } catch (Throwable th2) {
                                if (errorStream != null) {
                                    errorStream.close();
                                }
                                throw th2;
                            }
                        } catch (IOException e) {
                            Log.e("MediaDownloadConnection/download/can't get string from error stream", e);
                        } catch (Throwable th3) {
                            AnonymousClass0DT.A00(th2, th3);
                        }
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("MediaDownloadConnection/download failed; url=");
                    sb3.append(C137256vA.A01(url));
                    sb3.append(" responseCode=");
                    sb3.append(responseCode);
                    sb3.append(" responseBody=");
                    sb3.append(str4);
                    Log.w(sb3.toString());
                    if (responseCode == 416) {
                        String headerField = httpsURLConnection.getHeaderField("Content-Range");
                        if (TextUtils.isEmpty(headerField) || !headerField.contains("*/")) {
                            th = new AnonymousClass68O(responseCode, str4);
                        }
                    } else {
                        th = new AnonymousClass68O(responseCode, str4);
                    }
                    throw th;
                }
                Pair pair = new Pair(httpsURLConnection, Boolean.valueOf(z2));
                AUZ auz = new AUZ((Boolean) pair.second, (HttpURLConnection) pair.first);
                TrafficStats.clearThreadStatsTag();
                return auz;
                throw th;
            } catch (IllegalArgumentException e2) {
                throw new AnonymousClass68P("failed with IllegalArgumentException while retrieving response", e2);
            } catch (IOException e3) {
                Log.w("MediaDownloadConnection/exception while getting response code", e3);
                if (!r3.A09()) {
                    th = new AnonymousClass68P();
                } else {
                    th = new AnonymousClass68P("failed with IOException while retrieving response", e3);
                }
            } catch (Throwable th4) {
                TrafficStats.clearThreadStatsTag();
                throw th4;
            }
        } catch (IOException e4) {
            if (!r3.A09()) {
                th = new AnonymousClass68P();
            } else {
                th = new AnonymousClass68P("failed to open http url connection", e4);
            }
        }
    }

    public int A01(C191779nA r3, boolean z) {
        if (z && r3.A00 == 0) {
            this.A00.A00();
        }
        if (this.A05.A02()) {
            return 4;
        }
        return 0;
    }

    public C24371Kb(AnonymousClass11E r1, C24361Ka r2, C18030ve r3, AnonymousClass1KX r4, C220418j r5, AnonymousClass11W r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        this.A01 = r3;
        this.A02 = r6;
        this.A00 = r2;
        this.A06 = r5;
        this.A03 = r7;
        this.A05 = r4;
        this.A04 = r1;
        this.A07 = r8;
    }

    public static AUZ A00(C24371Kb r6, String str, String str2, String str3, URL url) {
        B9R A022;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        AnonymousClass1KX r3 = r6.A05;
        boolean A023 = r3.A02();
        boolean z = false;
        C220418j r0 = r6.A06;
        if (A023) {
            A022 = r0.A01(false);
            if (r3.A01()) {
                httpsURLConnection.setHostnameVerifier(new C21518AlR(str, HttpsURLConnection.getDefaultHostnameVerifier()));
            }
        } else {
            A022 = r0.A02();
        }
        int BPF = A022.BPF();
        httpsURLConnection.setSSLSocketFactory((SSLSocketFactory) A022);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod(str2);
        httpsURLConnection.setRequestProperty("Host", str);
        httpsURLConnection.setRequestProperty("User-Agent", r6.A02.A02());
        if (!TextUtils.isEmpty(str3)) {
            httpsURLConnection.setRequestProperty("Companion_User_Secret", str3);
        }
        try {
            httpsURLConnection.connect();
            if (A022.BPF() == BPF) {
                z = true;
            }
            return new AUZ(Boolean.valueOf(z), httpsURLConnection);
        } catch (IllegalArgumentException e) {
            throw new IOException(e);
        }
    }
}
