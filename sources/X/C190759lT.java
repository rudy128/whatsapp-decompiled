package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9lT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C190759lT {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ Map A02;

    public final void A00(C188059go r17) {
        String str;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        Map map = this.A02;
        C194839sN r2 = this.A00;
        C188059go r5 = r17;
        if (r17 != null) {
            map.put("network_name", C20085A6m.A03(r5.A00));
        }
        r2.A01("on_success", map);
        C191949nS r1 = brazilPayBloksActivity.A0B;
        r1.A00 = r5;
        if (r17 == null || r5.A00 != 5 || (str = r5.A04) == null || !str.equals("0")) {
            C17890vO.A0s(C17880vN.A0V(r1.A0E), r1.A00, 23);
            r1.A03 = false;
            return;
        }
        String str2 = r5.A06;
        if (str2 != null) {
            AnonymousClass1QD r52 = r1.A0A;
            String A0r = C17880vN.A0r(r52.A03(), "payment_trusted_device_elo_wallet_store");
            JSONObject jSONObject = null;
            if (A0r != null) {
                try {
                    jSONObject = C17880vN.A16(A0r);
                } catch (JSONException unused) {
                    r52.A02.A06("Failed to updated the wallet_id");
                }
            } else {
                jSONObject = C17880vN.A15();
            }
            jSONObject.put("wallet_id", str2);
            C17880vN.A1E(AnonymousClass8BU.A07(r52), "payment_trusted_device_elo_wallet_store", jSONObject.toString());
        }
        AnonymousClass11P r7 = r1.A06;
        C191889nM r3 = new C191889nM(r1.A07.A00, r1.A04, r1.A05, r7, C17880vN.A0U(r1.A0F), r1.A09, AnonymousClass8BR.A0a(r1.A0G), r1.A0A, r1.A0B, r1.A0C, new C189519jN(r1), r1.A0D);
        A54 a54 = r3.A05;
        AZ2 A012 = a54.A01("ELO", "ADD-CARD");
        if (A012 == null) {
            new C191619mt(r3.A00, r3.A01, r3.A03, r3.A04, a54, "ADD-CARD").A00(new C20771AYa(r3, 0), "ELO");
            return;
        }
        r3.A00((A7B) null, A012);
    }

    public /* synthetic */ C190759lT(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity, Map map) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = map;
        this.A00 = r1;
    }
}
