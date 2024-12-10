package X;

import java.util.HashMap;

/* renamed from: X.3El  reason: invalid class name and case insensitive filesystem */
public class C71233El extends HashMap {
    public final int A00;

    public C71233El(int i) {
        int i2;
        String str;
        this.A00 = i;
        switch (i) {
            case 0:
                put("offer", 0);
                put("accept", C17880vN.A0h());
                put("reject", C17880vN.A0i());
                put("video", C17880vN.A0j());
                put("terminate", C17880vN.A0k());
                put("enc_rekey", C17880vN.A0l());
                put("relaylatency", C17880vN.A0m());
                put("transport", 7);
                put("preaccept", 8);
                put("group_update", 9);
                put("mute_v2", 10);
                put("interruption", 11);
                put("flowcontrol", 12);
                put("notify", 13);
                put("offer_notice", 14);
                put("call_relay", 15);
                put("mute", 16);
                put("screen_share", 17);
                i2 = 18;
                put("reminder", 18);
                put("bcall_update", 18);
                put("bcall_end", 18);
                put("bcall_join", 18);
                put("bcall_leave", 18);
                str = "bcall_notify";
                break;
            case 1:
                put("com.bloks.www.whatsapp.payments.br.p2m_tos", "merchant_payments_tos");
                put("com.bloks.www.whatsapp.payments.br.p2m_value_props", "merchant_value_prop");
                put("com.bloks.www.whatsapp.payments.br.p2m_partner_login", "merchant_partner_login");
                put("com.bloks.www.whatsapp.payments.br.p2m_confirm_code", "merchant_partner_login_confirm");
                put("com.bloks.www.whatsapp.payments.br.p2m_partner_picker_link_account", "merchant_partner_select");
                put("com.bloks.www.whatsapp.payments.br.p2m_partner_confirm_account", "merchant_partner_account_select");
                put("com.bloks.www.whatsapp.payments.br.p2m_partner_create_account", "merchant_new_account_partner_select");
                put("com.bloks.www.whatsapp.payments.br.p2m_account_activated_confirmation", "merchant_partner_account_confirm");
                return;
            default:
                put("BACK", C17880vN.A0h());
                i2 = C17880vN.A0j();
                str = "CLOSE";
                break;
        }
        put(str, i2);
    }
}
