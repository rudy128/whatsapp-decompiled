package X;

import android.net.TrafficStats;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1El  reason: invalid class name and case insensitive filesystem */
public class C23081El implements C23071Ek {
    public int A00;
    public final DataTaskListener A01;
    public final AnonymousClass181 A02;
    public final AnonymousClass10I A03;
    public final File A04;
    public final Map A05 = Collections.synchronizedMap(new HashMap());
    public final AnonymousClass19D A06;
    public final AnonymousClass1D9 A07;
    public final C220418j A08;
    public final AnonymousClass11W A09;

    public static void A02(NetworkSession networkSession, C23081El r12, OutputStream outputStream, String str, HttpURLConnection httpURLConnection, boolean z) {
        C179229Hb r2;
        C23081El r5 = r12;
        try {
            r2 = new C179229Hb(r12.A02, httpURLConnection.getInputStream(), (Integer) null, 29);
            int contentLength = httpURLConnection.getContentLength();
            byte[] bArr = new byte[10240];
            int i = 0;
            while (true) {
                int read = r2.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    i += read;
                    if (z) {
                        Execution.executeAsyncWithPriority(new AnonymousClass2A3(networkSession, r5, str, read, i, contentLength, 0), 3, 0);
                    }
                } else {
                    r2.close();
                    return;
                }
            }
        } catch (IOException unused) {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 400 && responseCode <= 500) {
                String format = String.format((Locale) null, "[HTTP status=%d] Error Content = ", new Object[]{Integer.valueOf(responseCode)});
                try {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append(format);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr2 = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                            while (true) {
                                int read2 = errorStream.read(bArr2);
                                if (read2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read2);
                            }
                            sb.append(byteArrayOutputStream.toString());
                            format = sb.toString();
                            errorStream.close();
                        } catch (Throwable th) {
                            errorStream.close();
                            throw th;
                        }
                    }
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
                throw new IOException(format);
            }
            return;
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new IOException("Malformed Http Response", e);
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th, th3);
        }
        throw th;
    }

    public static UrlResponse A00(NetworkSession networkSession, UrlRequest urlRequest, C23081El r18, FileInputStream fileInputStream, OutputStream outputStream, String str, boolean z, boolean z2) {
        DataOutputStream dataOutputStream;
        int read;
        UrlRequest urlRequest2 = urlRequest;
        byte[] httpBody = urlRequest2.getHttpBody();
        if (httpBody != null) {
            httpBody.toString();
        }
        urlRequest2.getUrl();
        urlRequest2.getHttpMethod();
        urlRequest2.getHttpHeaders().toString();
        Boolean bool = C17970vW.A03;
        byte[] httpBody2 = urlRequest2.getHttpBody();
        C23081El r10 = r18;
        FileInputStream fileInputStream2 = fileInputStream;
        HttpsURLConnection A012 = A01(urlRequest2, r10, fileInputStream2, httpBody2);
        try {
            TrafficStats.setThreadStatsTag(28);
            NetworkSession networkSession2 = networkSession;
            String str2 = str;
            if (A012.getDoOutput()) {
                try {
                    dataOutputStream = new DataOutputStream(new C179259He(r10.A02, A012.getOutputStream(), (Integer) null, 29));
                    int i = 0;
                    if (fileInputStream2 != null) {
                        int available = fileInputStream2.available();
                        int min = Math.min(10240, available);
                        byte[] bArr = new byte[min];
                        do {
                            read = fileInputStream2.read(bArr, 0, min);
                            dataOutputStream.write(bArr, 0, read);
                            int available2 = fileInputStream2.available();
                            min = Math.min(10240, available2);
                            int i2 = available - available2;
                            if (z) {
                                Execution.executeAsyncWithPriority(new AnonymousClass2A3(networkSession2, r10, str2, read, i2, available, 1), 3, 0);
                                continue;
                            }
                        } while (read > 0);
                    } else {
                        int length = httpBody2.length;
                        int i3 = length;
                        while (i < i3) {
                            int min2 = Math.min(10240, length);
                            dataOutputStream.write(httpBody2, i, min2);
                            length -= min2;
                            i += min2;
                            if (z) {
                                Execution.executeAsyncWithPriority(new AnonymousClass2A1(networkSession2, r10, str2, httpBody2, min2, i), 3, 0);
                            }
                        }
                    }
                    dataOutputStream.close();
                } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                    throw new IOException("Failed to setup connection", e);
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                }
            }
            A02(networkSession2, r10, outputStream, str2, A012, z2);
            UrlResponse urlResponse = new UrlResponse(urlRequest2, A012.getResponseCode(), NetworkUtils.flattenHeaders((Map) A012.getHeaderFields()));
            A012.getResponseCode();
            return urlResponse;
            throw th;
        } finally {
            TrafficStats.clearThreadStatsTag();
            A012.disconnect();
        }
    }

    public C23081El(AnonymousClass181 r2, AnonymousClass19D r3, AnonymousClass1D9 r4, C220418j r5, AnonymousClass11W r6, AnonymousClass10I r7, File file) {
        this.A09 = r6;
        this.A03 = r7;
        this.A02 = r2;
        this.A07 = r4;
        this.A06 = r3;
        this.A08 = r5;
        this.A04 = file;
        this.A01 = new C23091En(this);
    }

    public static HttpsURLConnection A01(UrlRequest urlRequest, C23081El r7, FileInputStream fileInputStream, byte[] bArr) {
        SSLSocketFactory A022;
        int length;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(urlRequest.getUrl()).openConnection();
        Map httpHeaders = urlRequest.getHttpHeaders();
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setRequestMethod(urlRequest.getHttpMethod());
        httpsURLConnection.setRequestProperty("User-Agent", r7.A09.A02());
        httpsURLConnection.setRequestProperty("WaMsysRequest", "1");
        if (httpHeaders.containsKey("X-Forwarded-Host")) {
            A022 = (SSLSocketFactory) SSLSocketFactory.getDefault();
        } else {
            if (httpHeaders.containsKey("Host")) {
                httpsURLConnection.setHostnameVerifier(new C21518AlR((String) httpHeaders.get("Host"), HttpsURLConnection.getDefaultHostnameVerifier()));
            }
            A022 = r7.A08.A02();
        }
        httpsURLConnection.setSSLSocketFactory(A022);
        int i = r7.A00;
        if (i > 0) {
            httpsURLConnection.setConnectTimeout(i);
            httpsURLConnection.setReadTimeout(r7.A00);
        }
        if (!(bArr == null && fileInputStream == null)) {
            httpsURLConnection.setDoOutput(true);
            if (fileInputStream != null) {
                length = fileInputStream.available();
            } else {
                C17960vV.A07(bArr);
                length = bArr.length;
            }
            httpsURLConnection.setFixedLengthStreamingMode(length);
        }
        for (Map.Entry entry : httpHeaders.entrySet()) {
            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return httpsURLConnection;
    }
}
