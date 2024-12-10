package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A6z  reason: case insensitive filesystem */
public abstract class C20096A6z {
    public static final Map A00;
    public static final Map A01;
    public static final Map A02;
    public static final Map A03;
    public static final Map A04;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A00(X.C18030ve r4, java.lang.String r5) {
        /*
            r3 = 0
            if (r5 != 0) goto L_0x0004
            return r3
        L_0x0004:
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0029
            org.json.JSONObject r1 = X.C17880vN.A16(r5)     // Catch:{ JSONException -> 0x0023 }
            java.lang.String r0 = "payment_method"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x0023 }
            java.lang.String r0 = "payment_timestamp"
            long r0 = r1.getLong(r0)     // Catch:{ JSONException -> 0x0023 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x0023 }
            android.util.Pair r0 = X.C108945cZ.A0N(r2, r0)     // Catch:{ JSONException -> 0x0023 }
            goto L_0x002a
        L_0x0023:
            r1 = move-exception
            java.lang.String r0 = "CheckoutInfoContentParser/getCustomPaymentMethodStr failed to parse parameters json"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0029:
            r0 = r3
        L_0x002a:
            if (r0 == 0) goto L_0x002e
            java.lang.Object r3 = r0.first
        L_0x002e:
            int r0 = X.AnonymousClass8BX.A03(r4)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x0041
            java.util.Map r0 = A04
        L_0x003a:
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
        L_0x0041:
            boolean r0 = A03(r4)
            if (r0 == 0) goto L_0x004a
            java.util.Map r0 = A01
            goto L_0x003a
        L_0x004a:
            java.util.Map r0 = A00
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20096A6z.A00(X.0ve, java.lang.String):java.lang.Integer");
    }

    public static final String A02(String str) {
        if (!(str == null || str.length() == 0)) {
            try {
                return C17880vN.A16(str).getJSONObject("order").getString("status");
            } catch (JSONException e) {
                Log.e("CheckoutInfoContentParser/getOrderStatusStr failed to parse parameters json", e);
            }
        }
        return null;
    }

    public static final boolean A03(C18030ve r4) {
        JSONObject A0J = r4.A0J(4252);
        if (A0J.has("buyer_ed_order_message_content_update_enabled")) {
            try {
                return C108975cc.A1B(A0J.getInt("buyer_ed_order_message_content_update_enabled"));
            } catch (JSONException e) {
                Log.e("failed to parse config for ab prop BR_BUYER_ED_CAPABILITIES_CODE#buyer_ed_order_message_content_update_enabled", e);
            }
        }
        return false;
    }

    public static final String A01(C166418cr r2) {
        int i = r2.bitField1_;
        if ((i & 8) != 0) {
            C166398cp r0 = r2.interactiveMessage_;
            if (r0 == null) {
                r0 = C166398cp.DEFAULT_INSTANCE;
            }
            C164018Xf r02 = r0.body_;
            if (r02 == null) {
                r02 = C164018Xf.DEFAULT_INSTANCE;
            }
            return r02.text_;
        } else if ((i & 1) == 0) {
            return null;
        } else {
            C165858bs r03 = r2.buttonsMessage_;
            if (r03 == null) {
                r03 = C165858bs.DEFAULT_INSTANCE;
            }
            return r03.contentText_;
        }
    }

    static {
        HashMap A11 = C17880vN.A11();
        A02 = A11;
        HashMap A112 = C17880vN.A11();
        A03 = A112;
        HashMap A113 = C17880vN.A11();
        A00 = A113;
        HashMap A114 = C17880vN.A11();
        A01 = A114;
        HashMap A115 = C17880vN.A11();
        A04 = A115;
        A115.put("payment_instruction", 2131893287);
        A115.put("pix", 2131893283);
        A115.put("confirm", 2131893286);
        A115.put("captured", 2131893294);
        A115.put("pending", 2131893295);
        A114.put("payment_instruction", 2131893287);
        A114.put("pix", 2131893283);
        C17890vO.A0z("confirm", A114, 2131893285);
        A114.put("captured", 2131893294);
        A114.put("pending", 2131893295);
        A113.put("payment_instruction", 2131893287);
        A113.put("pix", 2131893283);
        C17890vO.A0z("confirm", A113, 2131893284);
        A113.put("captured", 2131893294);
        A113.put("pending", 2131893295);
        C17890vO.A0z("pending", A11, 2131893309);
        A11.put("processing", 2131893313);
        A11.put("completed", 2131893301);
        A11.put("canceled", 2131893299);
        A11.put("partially_shipped", 2131893305);
        A11.put("shipped", 2131893315);
        A11.put("payment_requested", 2131893307);
        A11.put("preparing_to_ship", 2131893311);
        A11.put("delivered", 2131893303);
        C17890vO.A0z("pending", A112, 2131893310);
        C17890vO.A0z("processing", A112, 2131893314);
        C17890vO.A0z("completed", A112, 2131893302);
        C17890vO.A0z("canceled", A112, 2131893300);
        C17890vO.A0z("partially_shipped", A112, 2131893306);
        C17890vO.A0z("shipped", A112, 2131893316);
        C17890vO.A0z("payment_requested", A112, 2131893308);
        C17890vO.A0z("preparing_to_ship", A112, 2131893312);
        C17890vO.A0z("delivered", A112, 2131893304);
    }
}
