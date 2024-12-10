package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.net.HttpURLConnection;

public final class DTX implements Runnable {
    public static final C25122CYv A02 = new C25122CYv("RevokeAccessOperation", new String[0]);
    public final BZJ A00 = new BasePendingResult((C25260Cbz) null);
    public final String A01;

    public final void run() {
        C25122CYv cYv;
        String str;
        String str2;
        Status status = Status.A06;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) AnonymousClass8BV.A0v(AnonymousClass001.A1H("https://accounts.google.com/o/oauth2/revoke?token=", this.A01, AnonymousClass000.A10()));
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.A08;
            } else {
                BE7.A1K(A02.A02, "Unable to revoke access!", "RevokeAccessOperation");
            }
            A02.A00(AnonymousClass001.A1I("Response Code: ", AnonymousClass000.A10(), responseCode));
        } catch (IOException e) {
            cYv = A02;
            str = String.valueOf(e.toString());
            str2 = "IOException when revoking access: ";
            BE7.A1K(cYv.A02, str2.concat(str), "RevokeAccessOperation");
            this.A00.A06(status);
        } catch (Exception e2) {
            cYv = A02;
            str = String.valueOf(e2.toString());
            str2 = "Exception when revoking access: ";
            BE7.A1K(cYv.A02, str2.concat(str), "RevokeAccessOperation");
            this.A00.A06(status);
        }
        this.A00.A06(status);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.BZJ, com.google.android.gms.common.api.internal.BasePendingResult] */
    public DTX(String str) {
        C18210vx.A03(str);
        this.A01 = str;
    }
}
