package X;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DaK  reason: case insensitive filesystem */
public final class C27240DaK extends Thread {
    public final /* synthetic */ Map A00;

    public C27240DaK(Map map) {
        this.A00 = map;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        Map map = this.A00;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Iterator A0x = AnonymousClass8BU.A0x(map);
        while (A0x.hasNext()) {
            String A0v = C17880vN.A0v(A0x);
            buildUpon.appendQueryParameter(A0v, C17880vN.A0s(A0v, map));
        }
        String obj = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) AnonymousClass8BV.A0v(obj);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder A0t = BE6.A0t(BE8.A0C(obj) + 65);
                A0t.append("Received non-success response code ");
                A0t.append(responseCode);
                BEA.A1N(" from pinging URL: ", obj, "HttpUrlPinger", A0t);
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder A0s = BEA.A0s(message, BE8.A0C(obj) + 32);
            C17890vO.A10("Error while parsing ping URL: ", obj, ". ", A0s);
            Log.w("HttpUrlPinger", AnonymousClass000.A0y(message, A0s), e);
        } catch (IOException | RuntimeException e2) {
            String message2 = e2.getMessage();
            StringBuilder A0s2 = BEA.A0s(message2, BE8.A0C(obj) + 27);
            C17890vO.A10("Error while pinging URL: ", obj, ". ", A0s2);
            Log.w("HttpUrlPinger", AnonymousClass000.A0y(message2, A0s2), e2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
