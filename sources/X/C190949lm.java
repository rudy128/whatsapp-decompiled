package X;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.9lm  reason: invalid class name and case insensitive filesystem */
public final class C190949lm {
    public final C183019Wp A00;
    public final C170008nw A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1PP A03;

    public C190949lm(C170008nw r1, C183019Wp r2, AnonymousClass11P r3, AnonymousClass1PP r4) {
        C18070vi.A0s(r4, r3, r1, r2);
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r2;
    }

    public final C438721g A00(Context context, A2Y a2y, AnonymousClass1BI r10, String str, boolean z) {
        int i;
        Long l;
        boolean A1X = AnonymousClass8BU.A1X(r10);
        C438721g r2 = new C438721g(this.A03.A01(r10, A1X), System.currentTimeMillis());
        if (z == A1X) {
            i = 100;
        } else if (!z) {
            i = 6;
        } else {
            throw AnonymousClass3MW.A14();
        }
        r2.A0S = Integer.valueOf(i);
        JSONObject A002 = a2y.A00();
        C183019Wp r3 = this.A00;
        if (a2y.A00.ordinal() == 0 && (l = a2y.A01) != null) {
            Long A0o = C17880vN.A0o(AnonymousClass11P.A01(r3.A00), TimeUnit.SECONDS.toMillis(l.longValue()));
            if (A0o != null) {
                A002.put("permission_expiry_timestamp", TimeUnit.MILLISECONDS.toSeconds(A0o.longValue()));
            }
        }
        if (str != null) {
            A002.put("call_id", str);
        }
        r2.A00 = new C20268AEb((AnonymousClass9Je) null, new AE2((Integer) null, "call_permission_request", A002.toString()), C170008nw.A01(context, a2y));
        return r2;
    }
}
