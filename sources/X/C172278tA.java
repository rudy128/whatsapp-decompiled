package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8tA  reason: invalid class name and case insensitive filesystem */
public final class C172278tA extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        Integer num;
        Integer num2;
        String str;
        String str2;
        Double d;
        Double d2;
        JSONArray jSONArray;
        JSONObject jSONObject2 = jSONObject;
        C18070vi.A0d(jSONObject2, 0);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("xwa_search_businesses");
        boolean optBoolean = jSONObject3.optBoolean("see_more", false);
        ArrayList A13 = AnonymousClass000.A13();
        JSONArray jSONArray2 = jSONObject3.getJSONArray("businesses");
        int length = jSONArray2.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
            String string = jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String string2 = jSONObject4.getString("jid");
            String string3 = jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String optString = jSONObject4.optString("business_ranking_id");
            int optInt = jSONObject4.optInt("verified_level");
            JSONObject optJSONObject = jSONObject4.optJSONObject("ui_data");
            Object opt = jSONObject4.opt("ig_follower_count");
            if (opt == null || opt.equals(JSONObject.NULL)) {
                num = null;
            } else {
                num = (Integer) opt;
            }
            Object opt2 = jSONObject4.opt("fb_follower_count");
            if (opt2 == null || opt2.equals(JSONObject.NULL)) {
                num2 = null;
            } else {
                num2 = (Integer) opt2;
            }
            boolean optBoolean2 = jSONObject4.optBoolean("is_welcome_banner_eligible");
            Object opt3 = jSONObject4.opt("biz_creation_date");
            if (opt3 == null || opt3.equals(JSONObject.NULL)) {
                str = null;
            } else {
                str = (String) opt3;
            }
            String str3 = null;
            if (str != null) {
                try {
                    str3 = String.valueOf(((DateFormat) A87.A01.A01()).parse(str).getTime());
                } catch (ParseException e) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Date string '");
                    A10.append(str);
                    C108985cd.A1M("' not in format of <yyyy-MM-dd>", A10, e);
                }
            }
            if (optJSONObject != null) {
                str2 = null;
                String optString2 = optJSONObject.optString("subtitle");
                if (!(optString2 == null || optString2.length() == 0 || optString2.equalsIgnoreCase("null"))) {
                    str2 = optString2;
                }
            } else {
                str2 = null;
            }
            JSONObject optJSONObject2 = jSONObject4.optJSONObject("location");
            if (optJSONObject2 != null) {
                d = AnonymousClass8BU.A0h("latitude", optJSONObject2);
                d2 = AnonymousClass8BU.A0h("longitude", optJSONObject2);
            } else {
                d = null;
                d2 = null;
            }
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray("verified_name_highlight_ranges");
            } else {
                jSONArray = null;
            }
            ArrayList A132 = AnonymousClass000.A13();
            if (jSONArray != null) {
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i2);
                    A132.add(new C193639qQ(jSONObject5.getInt("start"), jSONObject5.getInt("end")));
                }
            }
            C18070vi.A0b(string);
            C18070vi.A0b(string2);
            C18070vi.A0b(string3);
            A13.add(new C195819tx(d, d2, Integer.valueOf(optInt), num, num2, string, string2, string3, str3, str2, optString, A132, optBoolean2));
        }
        this.A00 = new C193649qR(A13, optBoolean);
    }
}
