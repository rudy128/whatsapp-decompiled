package X;

import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.6nM  reason: invalid class name */
public final class AnonymousClass6nM {
    public final AnonymousClass11P A00;
    public final C24621La A01;
    public final int A02;
    public final long A03;

    public final void A00(Map map) {
        int i;
        long j = this.A03;
        if (j != 0 && (i = this.A02) != 0) {
            Map A0D = AnonymousClass1D7.A0D(C29431cG.A0v(C147027Rn.A00(C99834tX.A0L(map), 41), i));
            LinkedHashMap A0b = C108995ce.A0b(A0D);
            Iterator A15 = AnonymousClass000.A15(A0D);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                A0b.put(((Jid) A16.getKey()).getRawString(), A16.getValue());
            }
            long A012 = AnonymousClass11P.A01(this.A00) + j;
            String A0H = C18070vi.A0H(new JSONObject(A0b));
            C24621La r1 = this.A01;
            r1.A06("status_ranking_map", A0H);
            r1.A05("status_ranking_map_expiration", A012);
        }
    }

    public AnonymousClass6nM(AnonymousClass11P r5, C24621La r6, C18030ve r7) {
        C18070vi.A0o(r7, r6, r5);
        this.A01 = r6;
        this.A00 = r5;
        TimeUnit timeUnit = TimeUnit.HOURS;
        C18040vf r2 = C18040vf.A02;
        this.A03 = timeUnit.toMillis((long) C18020vd.A00(r2, r7, 6690));
        this.A02 = C18020vd.A00(r2, r7, 6691);
    }
}
