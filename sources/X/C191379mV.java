package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9mV  reason: invalid class name and case insensitive filesystem */
public class C191379mV {
    public AnonymousClass1M9 A00;
    public C18000vb A01;
    public AW0 A02;
    public AnonymousClass1R2 A03;
    public String A04;

    public void A00(Context context) {
        AnonymousClass1M9 r0;
        try {
            C17960vV.A07(this.A04);
            C17960vV.A07(this.A01);
            JSONObject A15 = C17880vN.A15();
            A15.put("ref", this.A04);
            A15.put("locale", this.A01.A06());
            AW0 aw0 = this.A02;
            if (aw0 != null) {
                A15.put("transaction_id", aw0.A0K);
                AW0 aw02 = this.A02;
                AnonymousClass1KN r5 = aw02.A09;
                if (r5 != null) {
                    C18000vb r4 = this.A01;
                    AnonymousClass1KJ A012 = aw02.A01();
                    C18070vi.A0d(r4, 0);
                    A15.put("transaction_amount", A3U.A02(r4, A012, r5, 0, AnonymousClass8BU.A1X(A012)));
                }
                AnonymousClass1R2 r2 = this.A03;
                if (r2 != null) {
                    A15.put("transaction_status", this.A01.A0A(r2.A0G(this.A02)));
                }
                AW0 aw03 = this.A02;
                A15.put("transaction_status_enum", C20128A8n.A04(aw03.A03, aw03.A02));
                Boolean A05 = this.A02.A05();
                if (A05 != null) {
                    A15.put("is_transaction_sender", A05);
                }
                UserJid userJid = this.A02.A0D;
                if (!(userJid == null || (r0 = this.A00) == null)) {
                    A15.put("receiver_name", r0.A0H(userJid).A0L());
                }
            }
            context.startActivity(AnonymousClass1LU.A1T(context, "com.bloks.www.payments.whatsapp.f2care", C17880vN.A15().put("params", C17880vN.A15().put("server_params", A15)).toString()));
        } catch (JSONException unused) {
        }
    }
}
