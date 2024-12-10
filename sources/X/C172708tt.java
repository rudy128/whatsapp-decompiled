package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.8tt  reason: invalid class name and case insensitive filesystem */
public final class C172708tt extends AUZ implements AnonymousClass8BJ {
    public boolean A00;
    public boolean A01 = true;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C21839AtR(this));
    public final C18100vl A03 = AnonymousClass1DF.A01(new C21840AtS(this));
    public final C195939uB A04;
    public final Integer A05;

    public C172708tt(C195939uB r3, Integer num, HttpsURLConnection httpsURLConnection) {
        super((Boolean) null, httpsURLConnection);
        this.A04 = r3;
        this.A05 = num;
    }

    public void close() {
        C195939uB r4;
        try {
            Integer num = this.A05;
            if (!(num == null || (r4 = this.A04) == null || !this.A01)) {
                r4.A01(num.intValue(), this.A01.getResponseCode(), AnonymousClass3MW.A0y(this.A03), this.A00);
            }
        } catch (IOException e) {
            Log.e("GoogleBackupUrlConnectionResponse/faile to report", e);
        } catch (Throwable th) {
            super.close();
            throw th;
        }
        super.close();
    }
}
