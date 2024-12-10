package X;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AVT implements B8D {
    public final int A00;
    public final Object A01;

    public AVT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.9tP, java.lang.Object] */
    public final A88 CGA(C191779nA r21) {
        C179449Hz r0;
        AUZ A002;
        C191779nA r3 = r21;
        if (this.A00 != 0) {
            String str = r3.A02;
            C24381Kc r4 = ((C24421Kg) this.A01).A0B;
            String str2 = r3.A07;
            C17900vP.A0f("prewarmer/sendrequest/checking authority ", str, AnonymousClass000.A10());
            try {
                TrafficStats.setThreadStatsTag(2);
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https").encodedAuthority(str).appendPath("prewarm");
                URL url = new URL(builder.build().toString());
                SystemClock.elapsedRealtime();
                C24371Kb r1 = r4.A00;
                r1.A00.A00();
                A002 = C24371Kb.A00(r1, str2, "POST", (String) null, url);
                SystemClock.elapsedRealtime();
                A002.A01.getResponseCode();
                A002.close();
            } catch (MalformedURLException e) {
                Log.e("prewarmer/sendrequest/error forming URL", e);
            } catch (IOException e2) {
                try {
                    AnonymousClass1KX r12 = r4.A01;
                    if (r12.A03(e2)) {
                        r12.A00();
                    }
                    Log.w("prewarmer/sendrequest/error opening connection", e2);
                } catch (Throwable th) {
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            TrafficStats.clearThreadStatsTag();
            return A88.A02(r3);
        }
        C191879nL r2 = (C191879nL) this.A01;
        C186819eo r13 = r2.A07;
        C24371Kb r5 = r2.A02;
        int i = r3.A00;
        r5.A01(r3, AnonymousClass000.A1P(i));
        Uri.Builder A012 = AnonymousClass99o.A01(r3, r2.A08);
        A012.appendQueryParameter("resume", "1");
        String A0H = C18070vi.A0H(A012.build());
        C24361Ka r9 = r2.A00;
        AnonymousClass1KX r11 = r2.A03;
        C20671AUd aUd = new C20671AUd(r9, r2.A01, r11, r2.A05, r2.A06, A0H, r2.A0A);
        aUd.A00 = new Object();
        AnonymousClass1SV r122 = aUd.A01;
        String str3 = aUd.A04;
        A7N A003 = r122.A00(aUd, (C184599bD) null, str3, aUd.A05, (String) null, 10, AnonymousClass000.A1P(i));
        try {
            int A04 = A003.A04(r3);
            C187309fb r7 = aUd.A03;
            r7.A00 = A003.A00;
            r7.A02 = A003.A01;
            r7.A01 = (long) A04;
            r7.A04 = A003.A03;
            r7.A03 = A003.A02;
            if (A04 < 0 || A04 >= 400) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("mediaupload/MMS upload resume form post failed/error=");
                A10.append(A04);
                C17900vP.A0g("; url=", str3, A10);
                C195479tP r42 = aUd.A00;
                r42.A00 = A04;
                r42.A02 = C179449Hz.FAILURE;
            }
        } catch (IOException e3) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("mediaupload/MMS upload resume form post failed; url=");
            C17890vO.A13(str3, A102, e3);
            boolean A03 = aUd.A02.A03(e3);
            C195479tP r32 = aUd.A00;
            if (A03) {
                r0 = C179449Hz.WATLS_ERROR;
            } else {
                r0 = C179449Hz.FAILURE;
            }
            r32.A02 = r0;
            C187309fb r6 = aUd.A03;
            r6.A00 = A003.A00;
            r6.A02 = A003.A01;
            r6.A03 = A003.A02;
        }
        C195479tP r43 = aUd.A00;
        r43.A03 = r2.A04.A00(r43.A03, false);
        C179449Hz r22 = r43.A02;
        if (r22 == null) {
            r22 = C179449Hz.FAILURE;
            r43.A02 = r22;
        }
        if (r22 == C179449Hz.WATLS_ERROR) {
            Log.i("resumecheck/attempting fallback MMS upload form post - watls error");
            r11.A00();
        } else if (r22 == C179449Hz.FAILURE) {
            Log.i("resumecheck/attempting fallback MMS upload form post");
        } else {
            if (r22 == C179449Hz.RESUME) {
                r13.A03 = C17880vN.A0n(r43.A01);
            }
            return A88.A02(r43);
        }
        return A88.A03(r43, r43.A00);
        throw th;
    }
}
