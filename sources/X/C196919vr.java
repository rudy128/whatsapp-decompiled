package X;

import com.whatsapp.util.Log;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9vr  reason: invalid class name and case insensitive filesystem */
public abstract class C196919vr {
    public static final String A00(C18030ve r8, AnonymousClass1BI r9, String str) {
        JSONArray optJSONArray;
        C18070vi.A0d(r9, 1);
        C18070vi.A0d(str, 2);
        if (C18020vd.A05(C18040vf.A02, r8, 4603)) {
            String A0v = C108955ca.A0v(r8, 4602);
            String str2 = r9.user;
            if (A0v.length() > 0) {
                try {
                    JSONObject optJSONObject = C17880vN.A16(A0v).optJSONObject("merchant_config");
                    if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(str2)) != null) {
                        int length = optJSONArray.length();
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            JSONObject jSONObject = optJSONArray.getJSONObject(i);
                            String optString = jSONObject.optString("url");
                            if (AnonymousClass1EG.A0H(optString) || !AnonymousClass8BU.A1V(str, Pattern.compile(optString))) {
                                i++;
                            } else {
                                String optString2 = jSONObject.optString("experience");
                                if ("webview".equalsIgnoreCase(optString2) || "browser_tab".equalsIgnoreCase(optString2)) {
                                    C18070vi.A0b(optString2);
                                    return optString2;
                                }
                            }
                        }
                    }
                } catch (JSONException unused) {
                    Log.e("TemplateMessageUrlWebViewUtils/isExperienceEnabled json exception");
                }
            }
        }
        return "external_browser";
    }

    public static final boolean A01(C18030ve r9, AnonymousClass1BI r10, String str) {
        boolean A1X = AnonymousClass8BU.A1X(str);
        if (C18020vd.A05(C18040vf.A02, r9, 3609)) {
            try {
                String A0v = C108955ca.A0v(r9, 3606);
                if (A0v.length() > 0) {
                    JSONObject A16 = C17880vN.A16(A0v);
                    JSONArray jSONArray = A16.getJSONArray("merchant_list");
                    JSONArray jSONArray2 = A16.getJSONArray("url_regex_list");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        if (C18070vi.A18(r10.user, jSONArray.getString(i))) {
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                if (AnonymousClass8BU.A1V(str, Pattern.compile(jSONArray2.getString(i2)))) {
                                    return A1X;
                                }
                            }
                            continue;
                        }
                    }
                }
            } catch (JSONException unused) {
                Log.e("TemplateMessageUrlWebViewUtils/isButtonUrlOpenInWebviewEnabled JSONException");
            } catch (PatternSyntaxException unused2) {
                Log.e("TemplateMessageUrlWebViewUtils/isButtonUrlOpenInWebviewEnabled PatternSyntaxException");
                return false;
            }
        }
        return false;
    }
}
