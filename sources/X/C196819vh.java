package X;

import android.app.Activity;
import android.content.res.Resources;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.9vh  reason: invalid class name and case insensitive filesystem */
public abstract class C196819vh {
    public static final String A00(Activity activity, C186959f2 r4) {
        C18070vi.A0d(activity, 0);
        String str = r4.A01;
        if (str != null && str.length() > 0) {
            return str;
        }
        boolean A18 = C18070vi.A18(r4.A02, "extensions-no-network-error");
        Resources resources = activity.getResources();
        int i = 2131894220;
        if (A18) {
            i = 2131894202;
        }
        String string = resources.getString(i);
        C18070vi.A0b(string);
        return string;
    }

    public static final JSONObject A01(AEV aev, UserJid userJid, C20279AEn aEn, Integer num, String str, String str2) {
        String str3;
        C18070vi.A0d(userJid, 0);
        JSONObject A15 = C17880vN.A15();
        JSONObject A152 = C17880vN.A15();
        C20122A8h.A07(C20122A8h.A00, aEn, A152, true, true);
        JSONObject A0x = C108965cb.A0x(A152, "order_details", A15);
        A0x.put("user_id", userJid.user);
        if (!(str2 == null || str2.length() == 0)) {
            JSONObject A153 = C17880vN.A15();
            A153.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
            A153.put("code", str2);
            A0x.put("coupon", A153);
        }
        if (aev != null) {
            A0x.put("selected_address", aev.A00());
        }
        JSONObject A0x2 = C108965cb.A0x(A0x, "input", A15);
        A0x2.put("data", A15);
        A0x2.put("action", "data_exchange");
        switch (num.intValue()) {
            case 0:
                str3 = "get_coupons";
                break;
            case 1:
                str3 = "apply_coupon";
                break;
            case 2:
                str3 = "remove_coupon";
                break;
            default:
                str3 = "apply_shipping";
                break;
        }
        A0x2.put("sub_action", str3);
        A0x2.put("version", 1);
        return A0x2;
    }
}
