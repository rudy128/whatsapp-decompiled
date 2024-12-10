package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7Ch  reason: invalid class name and case insensitive filesystem */
public final class C143177Ch implements AnonymousClass86Y {
    public final Map A00;

    public C143177Ch(Map map) {
        C18070vi.A0d(map, 1);
        this.A00 = map;
    }

    public void CBw(C133786pU r15, String str, String str2) {
        String str3;
        String str4;
        String str5;
        Integer num;
        Object obj;
        String str6 = str;
        C18070vi.A0d(str6, 0);
        String str7 = "";
        String str8 = str7;
        int i = -1;
        String str9 = null;
        C133786pU r5 = r15;
        if (str2 != null) {
            try {
                JSONObject A16 = C17880vN.A16(str2);
                JSONObject optJSONObject = A16.optJSONObject("server_params");
                JSONObject optJSONObject2 = A16.optJSONObject("client_input_params");
                if (optJSONObject != null) {
                    str7 = A00(optJSONObject);
                    int optInt = optJSONObject.optInt("target_acct_type", -1);
                    if (-1 == optInt) {
                        optInt = optJSONObject.optInt("account_type", -1);
                    }
                    if (-1 == optInt) {
                        optInt = optJSONObject.optInt("target_account_type", -1);
                    }
                    i = optInt;
                    str4 = optJSONObject.optString("logging_event");
                    if (str4 == null || str4.length() == 0) {
                        str4 = optJSONObject.optString("event");
                    }
                    if (C108955ca.A05(str4) == 0) {
                        str4 = null;
                    }
                    str3 = optJSONObject.optString("opaque_target");
                    if (C108955ca.A05(str3) == 0) {
                        str3 = null;
                    }
                    String optString = optJSONObject.optString("marker_id", str8);
                    C18070vi.A0X(optString);
                    num = AnonymousClass1YD.A03(optString);
                } else {
                    str4 = null;
                    str3 = null;
                    num = null;
                }
                if (optJSONObject2 != null) {
                    str9 = optJSONObject2.optString("web_auth_data");
                    if (C108955ca.A05(str9) == 0) {
                        str9 = null;
                    }
                    if (str7.length() == 0) {
                        str7 = A00(optJSONObject2);
                    }
                    if (str4 == null || str4.length() == 0) {
                        String optString2 = optJSONObject2.optString("logging_event");
                        if (optString2 == null || optString2.length() == 0) {
                            optString2 = optJSONObject2.optString("event");
                        }
                        if (C108955ca.A05(str4) == 0) {
                            str4 = null;
                        }
                    }
                }
                if (!((optJSONObject == null || (str5 = optJSONObject.optString("access_token")) == null || str5.length() == 0) && (optJSONObject2 == null || (str5 = optJSONObject2.optString("access_token")) == null))) {
                    if (str5.length() == 0) {
                    }
                }
                str5 = str8;
            } catch (JSONException e) {
                r15.A01(e);
                return;
            }
        } else {
            str5 = str7;
            str4 = null;
            str3 = null;
            num = null;
        }
        C18070vi.A0d(AnonymousClass001.A1H("AccountLinkingCustomBloksRequest/post appId: ", str6, AnonymousClass000.A10()), 0);
        if (str6.equals("com.bloks.www.fxcal.waffle.nta.reg.async") || str6.equals("com.bloks.www.fx.waffle.reg") || AnonymousClass1YF.A0Y(str6, "nta", false)) {
            C31081ez.A02("AccountLinkingCustomBloksRequest/fetchV3/NTA");
            obj = this.A00.get("DI_KEY_NTA_BLOKS_FETCHER");
            if (obj == null) {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        } else {
            C31081ez.A02("AccountLinkingCustomBloksRequest/fetchV3/default");
            obj = this.A00.get("DI_KEY_PRE_CONSENT_BLOKS_FETCHER");
            if (obj == null) {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        }
        ((C1603588d) obj).BKy(new C136526tx(r5, num, str6, str7, str5, str4, str9, str3, i));
    }

    public static final String A00(JSONObject jSONObject) {
        String optString = jSONObject.optString("flow");
        if (((((((optString == null || optString.length() == 0) && (optString = jSONObject.optString("linking_entry_point")) == null) || optString.length() == 0) && (optString = jSONObject.optString("entryPoint")) == null) || optString.length() == 0) && (optString = jSONObject.optString("entrypoint")) == null) || optString.length() == 0) {
            optString = jSONObject.optString("entry_point");
        }
        C18070vi.A0b(optString);
        return optString;
    }
}
