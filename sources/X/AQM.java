package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

public final /* synthetic */ class AQM implements AnonymousClass5ZL {
    public final /* synthetic */ AnonymousClass8nU A00;
    public final /* synthetic */ BDZ A01;
    public final /* synthetic */ AnonymousClass206 A02;
    public final /* synthetic */ AEY A03;

    public final void Bn2(int i) {
        AnonymousClass8nU r3 = this.A00;
        BDZ bdz = this.A01;
        AnonymousClass206 r6 = this.A02;
        AEY aey = this.A03;
        C18070vi.A0d(aey, 3);
        C18070vi.A0z(bdz, "null cannot be cast to non-null type com.whatsapp.protocol.CheckoutInfoContent.PaymentSettings.PaymentPixKey");
        C20934Abo abo = (C20934Abo) bdz;
        ClipboardManager A09 = r3.A0C.A09();
        if (A09 != null) {
            try {
                String A012 = A3V.A01(abo.A03, abo.A02);
                C18070vi.A0X(A012);
                A09.setPrimaryClip(ClipData.newPlainText("pix_key", A012));
            } catch (NullPointerException | SecurityException e) {
                Log.e("serializeAndCopyPixCodeToClipboard/clipboard/", e);
            }
        }
        C23520Bik A013 = C23520Bik.A01(r3.A0j, 2131894607, 0);
        BIE bie = A013.A0J;
        ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(bie);
        int dimensionPixelSize = r3.getResources().getDimensionPixelSize(2131168774);
        A0P.setMargins(dimensionPixelSize, A0P.topMargin, dimensionPixelSize, AnonymousClass3Ma.A02(r3, 2131168774));
        bie.setLayoutParams(A0P);
        A013.A08();
        AnonymousClass205 r2 = r6.A0v;
        if (!r2.A02) {
            JSONArray A1A = AnonymousClass8BR.A1A();
            A1A.put("pix");
            C18030ve r1 = r3.A0F;
            C18040vf r7 = C18040vf.A02;
            if (C18020vd.A05(r7, r1, 8038)) {
                String str = aey.A01;
                if (str == null || str.length() == 0) {
                    str = C17890vO.A0Q();
                }
                r3.A06 = str;
                r3.A1X.CGF(new C98714rb(aey, r3, r6, 9));
            }
            JSONObject A15 = C17880vN.A15();
            A15.put("cta", "quick_reply");
            A15.put("wa_pay_registered", r3.getPaymentsManager().A02("p2p_context").A0E());
            A15.put("p2m_type", "p2m_pro");
            boolean z = true;
            A15.put("is_cta_available", true);
            AnonymousClass8BS.A1C(A1A, "accepted_payment_method", A15);
            A15.put("payment_method_choice", "pix");
            String str2 = r3.A06;
            if (!(str2 == null || str2.length() == 0)) {
                A15.put("order_funnel_id", str2);
            }
            C22941Dw r0 = UserJid.Companion;
            AnonymousClass1BI r4 = r2.A00;
            UserJid A014 = C22941Dw.A01(r4);
            if (C18020vd.A05(r7, r3.A0F, 12571) && A014 != null) {
                if (r3.getCtwaAdsPrivateStatsConversionInfoStore().A02(A014) == null) {
                    z = false;
                }
                A15.put("is_ctwa_originated", z);
            }
            C17960vV.A07(r4);
            if (r4 != null) {
                r3.A1X.CGN(new C98714rb(r3, A15, r4, 10));
            }
        }
    }

    public /* synthetic */ AQM(AnonymousClass8nU r1, BDZ bdz, AnonymousClass206 r3, AEY aey) {
        this.A00 = r1;
        this.A01 = bdz;
        this.A02 = r3;
        this.A03 = aey;
    }
}
