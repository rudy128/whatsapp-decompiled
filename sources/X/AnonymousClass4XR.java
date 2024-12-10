package X;

import android.net.TrafficStats;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.HttpURLConnection;
import java.util.HashMap;

/* renamed from: X.4XR  reason: invalid class name */
public class AnonymousClass4XR {
    public final AnonymousClass118 A00;
    public final C18030ve A01;
    public final AnonymousClass1D9 A02;
    public final C24481Km A03;
    public final C220418j A04;

    /* JADX INFO: finally extract failed */
    public static AUZ A00(AnonymousClass1D9 r6, AnonymousClass4XR r7, String str) {
        try {
            TrafficStats.setThreadStatsTag(29);
            AUZ A06 = r6.A06(r7.A04, str);
            HttpURLConnection httpURLConnection = A06.A01;
            if (httpURLConnection.getResponseCode() >= 400) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("WallpaperDownloader/download/Error, code=");
                A10.append(httpURLConnection.getResponseCode());
                C17890vO.A0w(A10);
                TrafficStats.setThreadStatsTag(29);
                return null;
            }
            httpURLConnection.getResponseCode();
            TrafficStats.setThreadStatsTag(29);
            return A06;
        } catch (Throwable th) {
            TrafficStats.setThreadStatsTag(29);
            throw th;
        }
    }

    public AnonymousClass4XR(AnonymousClass118 r1, C18030ve r2, AnonymousClass1D9 r3, C24481Km r4, C220418j r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    public AnonymousClass8BJ A01() {
        HashMap A11 = C17880vN.A11();
        A11.put("category", "wallpaper");
        C18030ve r2 = this.A01;
        if (AnonymousClass1J8.A01(r2)) {
            A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "thumbnails-v3");
        }
        return A00(this.A02, this, C88574a9.A02(C88574a9.A00(r2, this.A03, "wa/static/downloadable"), A11));
    }
}
