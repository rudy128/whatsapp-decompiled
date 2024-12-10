package X;

import android.app.PendingIntent;
import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.1Vq  reason: invalid class name and case insensitive filesystem */
public class C27321Vq {
    public String A00 = "";
    public final AnonymousClass118 A01;
    public final C27301Vn A02;
    public final AnonymousClass1LU A03;

    public void A00(String str) {
        A01(this.A01.A01(2131889995), str, 2, false);
    }

    public void A01(String str, String str2, int i, boolean z) {
        boolean equals;
        Log.i("errorreporter/reporterror");
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(i);
            String A04 = C17970vW.A04(sb.toString());
            if (A04 == null) {
                A04 = "invalid";
            }
            equals = this.A00.equals(A04);
            if (!equals) {
                this.A00 = A04;
            }
        }
        if (equals) {
            Log.e("Same as the last shown notification; skipping");
            return;
        }
        Context context = this.A01.A00;
        PendingIntent A002 = C1408573i.A00(context, 1, AnonymousClass1LU.A0A(context), 0);
        C1409673t A032 = C217217d.A03(context);
        A032.A0M = "critical_app_alerts@1";
        A032.A0L = "err";
        A032.A03 = 1;
        A032.A0F(str);
        A032.A0E(str);
        A032.A0D(str2);
        A032.A0Z = z;
        A032.A0A = A002;
        A032.A08.icon = 2131232441;
        A032.A06 = 1;
        this.A02.BkR(i, A032.A05());
    }

    public C27321Vq(AnonymousClass118 r2, C27301Vn r3, AnonymousClass1LU r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
