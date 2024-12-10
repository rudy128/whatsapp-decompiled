package X;

import android.net.Uri;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.1vD  reason: invalid class name and case insensitive filesystem */
public class C40751vD {
    public static URL A0B;
    public static URL A0C;
    public static URL A0D;
    public boolean A00;
    public final AnonymousClass181 A01;
    public final AnonymousClass11E A02;
    public final AnonymousClass1L7 A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass118 A05;
    public final C19830z4 A06;
    public final AnonymousClass10I A07;
    public final C220418j A08;
    public final AnonymousClass1DC A09;
    public final AnonymousClass11W A0A;

    public static String A00(C40751vD r7, URL url) {
        InputStreamReader inputStreamReader;
        try {
            HttpsURLConnection A012 = A01(r7, url);
            if (A012 == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[ZipDecompressor.UNZIP_BUFFER_SIZE];
            inputStreamReader = new InputStreamReader(new C179229Hb(r7.A01, A012.getInputStream(), (Integer) null, 18), C19620yd.A0A);
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read >= 0) {
                    sb.append(cArr, 0, read);
                } else {
                    inputStreamReader.close();
                    return sb.toString().trim();
                }
            }
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IO exception during upgrade url fetch; url=");
            sb2.append(url);
            Log.w(sb2.toString(), e);
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static byte[] A02(File file) {
        FileInputStream fileInputStream;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            try {
                fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read >= 0) {
                        instance.update(bArr, 0, read);
                    } else {
                        byte[] digest = instance.digest();
                        fileInputStream.close();
                        return digest;
                    }
                }
            } catch (IOException e) {
                Log.w((Throwable) e);
                return null;
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
            throw th;
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public Uri A03() {
        String str;
        URL url = A0B;
        if (url != null) {
            str = url.toString();
        } else {
            str = "https://www.whatsapp.com/android/current/WhatsApp.apk";
        }
        return Uri.parse(str);
    }

    public void A04() {
        try {
            boolean createNewFile = this.A03.A08("WhatsApp.upgrade").createNewFile();
            StringBuilder sb = new StringBuilder();
            sb.append("upgrade sentinel file created; success=");
            sb.append(createNewFile);
            Log.i(sb.toString());
        } catch (IOException e) {
            Log.e("upgrade/sentinel/fail", e);
        }
    }

    public void A05() {
        AnonymousClass1L7 r2 = this.A03;
        File A082 = r2.A08("WhatsApp.download");
        if (A082.exists()) {
            Log.a(A082.delete());
        }
        if (!r2.A08("WhatsApp.upgrade").exists()) {
            File A083 = r2.A08("WhatsApp.apk");
            if (A083.exists()) {
                Log.a(A083.delete());
            }
            C19830z4.A00(this.A06).remove("last_upgrade_remote_sha256").apply();
        }
    }

    public C40751vD(AnonymousClass181 r1, AnonymousClass11E r2, AnonymousClass1L7 r3, AnonymousClass11P r4, AnonymousClass118 r5, C19830z4 r6, C220418j r7, AnonymousClass1DC r8, AnonymousClass11W r9, AnonymousClass10I r10) {
        this.A05 = r5;
        this.A04 = r4;
        this.A0A = r9;
        this.A07 = r10;
        this.A01 = r1;
        this.A03 = r3;
        this.A08 = r7;
        this.A06 = r6;
        this.A02 = r2;
        this.A09 = r8;
    }

    public static HttpsURLConnection A01(C40751vD r5, URL url) {
        HttpsURLConnection httpsURLConnection;
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpsURLConnection) || (httpsURLConnection = (HttpsURLConnection) openConnection) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("non https url provided to upgrade url fetch; url=");
            sb.append(url);
            Log.w(sb.toString());
            return null;
        }
        httpsURLConnection.setSSLSocketFactory(r5.A08.A02());
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestProperty("User-Agent", r5.A0A.A02());
        httpsURLConnection.setRequestProperty("Accept-Charset", C19620yd.A0A);
        int responseCode = httpsURLConnection.getResponseCode();
        if (responseCode == 200) {
            return httpsURLConnection;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unexpected response code during upgrade url fetch; url=");
        sb2.append(url);
        sb2.append("; responseCode=");
        sb2.append(responseCode);
        Log.w(sb2.toString());
        httpsURLConnection.disconnect();
        return null;
    }
}
