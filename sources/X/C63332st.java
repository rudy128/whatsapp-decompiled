package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2st  reason: invalid class name and case insensitive filesystem */
public final class C63332st {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C71473Hd(this));

    public C63332st(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public final synchronized void A04(Collection collection) {
        C18070vi.A0d(collection, 0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C62302rB r6 = (C62302rB) it.next();
            C18070vi.A0d(r6, 0);
            C59592mZ r5 = r6.A05;
            int i = r5.A00;
            String valueOf = String.valueOf(i);
            JSONObject A15 = C17880vN.A15();
            try {
                A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, i);
                A15.put("text", r5.A03);
                A15.put("action", r5.A02);
                A15.put("badgeExpirationInHours", r6.A03);
                A15.put("enabled_time", r6.A01);
                A15.put("selected_time", r6.A02);
                A15.put("stage", r6.A00);
                A15.put("policy_version", r6.A04);
                C40861vP r52 = r5.A01;
                C40831vL r0 = r52.A02;
                if (r0 != null) {
                    A15.put("start_time", r0.A00);
                }
                C40841vM r02 = r52.A00;
                if (r02 != null) {
                    A15.put("static_duration", r02.A00);
                }
                C40831vL r03 = r52.A01;
                if (r03 != null) {
                    A15.put("end_time", r03.A00);
                }
                A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
                C17880vN.A1E(C17890vO.A0A(this.A01), AnonymousClass001.A1H("badged_notice_", valueOf, AnonymousClass000.A10()), A15.toString());
            } catch (JSONException e) {
                Log.e("UserNoticeBadgeContent/toJSON exception: ", e);
            }
        }
    }

    public final synchronized void A05(Collection collection) {
        C18070vi.A0d(collection, 0);
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C59762mq r2 = (C59762mq) it.next();
            JSONObject A15 = C17880vN.A15();
            int i = r2.A00;
            A15.put("notice_id", i);
            A15.put("policyVersion", r2.A01);
            A15.put("channel", r2.A06);
            C48252Lt r8 = r2.A02;
            if (r8 != null) {
                JSONObject A152 = C17880vN.A15();
                A152.put("text", r8.A04);
                A152.put("iconDescription", r8.A04);
                A152.put("action", r8.A01);
                A152.put("light", r8.A03);
                A152.put("dark", r8.A02);
                A152.put("iconRole", r8.A02);
                A152.put("iconStyle", r8.A03);
                A152.put("timing", r8.A00.A00());
                A15.put("banner", A152);
            }
            C48262Lu r0 = r2.A04;
            if (r0 != null) {
                A15.put("modal", r0.A01());
            }
            C48262Lu r02 = r2.A03;
            if (r02 != null) {
                A15.put("blocking-modal", r02.A01());
            }
            C59602ma r5 = r2.A05;
            if (r5 != null) {
                JSONObject A153 = C17880vN.A15();
                A153.put("text", r5.A03);
                A153.put("action", r5.A02);
                A153.put("badgeExpirationInHours", r5.A00);
                A153.put("timing", r5.A01.A00());
                A15.put("badged-notice", A153);
            }
            A13.put(String.valueOf(i), A15.toString());
        }
        C17880vN.A1E(C17890vO.A0A(this.A01), "user_notices_content", new JSONObject(A13).toString());
    }

    public final synchronized void A06(Collection collection) {
        C18070vi.A0d(collection, 0);
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C63592tN r0 = (C63592tN) it.next();
            JSONObject A012 = C63592tN.A01(r0);
            if (A012 != null) {
                A13.put(String.valueOf(r0.A01), A012.toString());
            }
        }
        C17880vN.A1E(C17890vO.A0A(this.A01), "user_notices_metadata", new JSONObject(A13).toString());
    }

    public final List A03() {
        C62302rB r9;
        C40831vL r11;
        C40841vM r4;
        C40831vL r2;
        Map<String, ?> all = C17880vN.A0C(this.A01).getAll();
        if (all == null) {
            return C18460wS.A00;
        }
        LinkedHashMap A13 = C17880vN.A13();
        Iterator A15 = AnonymousClass000.A15(all);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (A16.getValue() instanceof String) {
                Object key = A16.getKey();
                C18070vi.A0X(key);
                if (AnonymousClass1YE.A0A((String) key, "badged_notice_", false)) {
                    A13.put(A16.getKey(), A16.getValue());
                }
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator A152 = AnonymousClass000.A15(A13);
        while (A152.hasNext()) {
            Object A0P = C17890vO.A0P(A152);
            C18070vi.A0z(A0P, "null cannot be cast to non-null type kotlin.String");
            try {
                JSONObject A162 = C17880vN.A16((String) A0P);
                int i = C62302rB.A06;
                r9 = null;
                try {
                    long optLong = A162.optLong("start_time", -1);
                    long optLong2 = A162.optLong("static_duration", -1);
                    long optLong3 = A162.optLong("end_time", -1);
                    if (optLong == -1) {
                        r11 = null;
                    } else {
                        r11 = new C40831vL(optLong);
                    }
                    if (optLong2 == -1) {
                        r4 = null;
                    } else {
                        r4 = new C40841vM((long[]) null, optLong2);
                    }
                    if (optLong3 == -1) {
                        r2 = null;
                    } else {
                        r2 = new C40831vL(optLong3);
                    }
                    int i2 = C62302rB.A06;
                    int i3 = i2;
                    try {
                        i2 = A162.getInt("badgeExpirationInHours");
                        if (i2 < 0) {
                            i2 = i3;
                        }
                    } catch (JSONException unused) {
                    }
                    int i4 = A162.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    r9 = new C62302rB(new C40861vP(r4, r11, r2, "onDemand"), C18070vi.A0J("text", A162), C18070vi.A0J("action", A162), i4, A162.getInt("stage"), A162.getInt("policy_version"), i2, A162.getLong("enabled_time"), A162.getLong("selected_time"));
                } catch (JSONException e) {
                    Log.e("UserNoticeBadgeContent/fromJSON exception: ", e);
                }
            } catch (JSONException e2) {
                Log.e("UserNoticeCmsSharedPreferences/convertJsonStringToUserNoticeBadgeContent/parsing failed", e2);
                r9 = null;
            }
            if (r9 != null) {
                A132.add(r9);
            }
        }
        return A132;
    }

    public static final C40861vP A00(JSONObject jSONObject) {
        C40831vL r3;
        long[] jArr;
        Long l;
        C40841vM r2;
        C40831vL r4 = null;
        if (jSONObject.has("start")) {
            r3 = new C40831vL(jSONObject.getLong("start"));
        } else {
            r3 = null;
        }
        if (jSONObject.has("repeat")) {
            JSONArray jSONArray = jSONObject.getJSONArray("repeat");
            C18070vi.A0X(jSONArray);
            jArr = new long[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArray.getLong(i);
            }
        } else {
            jArr = null;
        }
        if (jSONObject.has("static")) {
            l = Long.valueOf(jSONObject.getLong("static"));
        } else {
            l = null;
        }
        if (jArr == null || l == null) {
            r2 = null;
        } else {
            r2 = new C40841vM(jArr, l.longValue());
        }
        if (jSONObject.has("end")) {
            r4 = new C40831vL(jSONObject.getLong("end"));
        }
        return new C40861vP(r2, r3, r4, "onDemand");
    }

    public static final C48262Lu A01(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject2 = jSONObject;
        String A0J = C18070vi.A0J("title", jSONObject2);
        String A0J2 = C18070vi.A0J("icon_description", jSONObject2);
        String A0J3 = C18070vi.A0J("agree_button_text", jSONObject2);
        String A0J4 = C18070vi.A0J("icon_light_url", jSONObject2);
        String A0J5 = C18070vi.A0J("icon_dark_url", jSONObject2);
        if (jSONObject2.has("icon_role")) {
            str = jSONObject2.getString("icon_role");
        } else {
            str = null;
        }
        if (jSONObject2.has("icon_style")) {
            str2 = jSONObject2.getString("icon_style");
        } else {
            str2 = null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("timing");
        C18070vi.A0X(jSONObject3);
        C40861vP A002 = A00(jSONObject3);
        String str5 = null;
        String str6 = null;
        String str7 = null;
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass4DO A003 = AnonymousClass4HG.A00(str);
        AnonymousClass4DP A004 = AnonymousClass4HH.A00(str2);
        JSONArray jSONArray = jSONObject2.getJSONArray("bullets");
        C18070vi.A0X(jSONArray);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            C18070vi.A0X(jSONObject4);
            String A0J6 = C18070vi.A0J("bullet_text_", jSONObject4);
            if (jSONObject4.has("bullet_icon_light_url_")) {
                str3 = jSONObject4.optString("bullet_icon_light_url_");
            } else {
                str3 = null;
            }
            if (jSONObject4.has("bullet_icon_dark_url_")) {
                str4 = jSONObject4.optString("bullet_icon_dark_url_");
            } else {
                str4 = null;
            }
            A13.add(new C59432mI(A0J6, str3, str4));
        }
        if (jSONObject2.has("body")) {
            str5 = C18070vi.A0J("body", jSONObject2);
        }
        if (jSONObject2.has("footer")) {
            str7 = C18070vi.A0J("footer", jSONObject2);
        }
        if (jSONObject2.has("dismiss_button_text")) {
            str6 = C18070vi.A0J("dismiss_button_text", jSONObject2);
        }
        return new C48262Lu(A002, A003, A004, A0J4, A0J5, A0J2, A0J, A0J3, str5, str7, str6, A13);
    }

    public final ArrayList A02() {
        C48252Lt r10;
        C48262Lu r16;
        C48262Lu r17;
        String str;
        ArrayList A13 = AnonymousClass000.A13();
        String A0r = C17880vN.A0r(C17880vN.A0C(this.A01), "user_notices_content");
        if (A0r != null) {
            try {
                JSONObject A16 = C17880vN.A16(A0r);
                Iterator<String> keys = A16.keys();
                while (keys.hasNext()) {
                    String obj = A16.get(C17880vN.A0v(keys)).toString();
                    C18070vi.A0d(obj, 0);
                    JSONObject A162 = C17880vN.A16(obj);
                    int i = A162.getInt("notice_id");
                    int i2 = A162.getInt("policyVersion");
                    String string = A162.getString("channel");
                    JSONObject optJSONObject = A162.optJSONObject("banner");
                    C59602ma r0 = null;
                    if (optJSONObject != null) {
                        String string2 = optJSONObject.getString("text");
                        String string3 = optJSONObject.getString("iconDescription");
                        String string4 = optJSONObject.getString("action");
                        String string5 = optJSONObject.getString("light");
                        String string6 = optJSONObject.getString("dark");
                        String str2 = null;
                        if (optJSONObject.has("iconRole")) {
                            str = optJSONObject.getString("iconRole");
                        } else {
                            str = null;
                        }
                        if (optJSONObject.has("iconStyle")) {
                            str2 = optJSONObject.getString("iconStyle");
                        }
                        JSONObject jSONObject = optJSONObject.getJSONObject("timing");
                        C18070vi.A0X(jSONObject);
                        C40861vP A002 = A00(jSONObject);
                        C18070vi.A0b(string2);
                        C18070vi.A0b(string5);
                        C18070vi.A0b(string6);
                        C18070vi.A0b(string3);
                        C18070vi.A0b(string4);
                        r10 = new C48252Lt(A002, AnonymousClass4HG.A00(str), AnonymousClass4HH.A00(str2), string2, string5, string6, string3, string4);
                    } else {
                        r10 = null;
                    }
                    JSONObject optJSONObject2 = A162.optJSONObject("modal");
                    if (optJSONObject2 != null) {
                        r16 = A01(optJSONObject2);
                    } else {
                        r16 = null;
                    }
                    JSONObject optJSONObject3 = A162.optJSONObject("blocking-modal");
                    if (optJSONObject3 != null) {
                        r17 = A01(optJSONObject3);
                    } else {
                        r17 = null;
                    }
                    JSONObject optJSONObject4 = A162.optJSONObject("badged-notice");
                    if (optJSONObject4 != null) {
                        String string7 = optJSONObject4.getString("text");
                        String string8 = optJSONObject4.getString("action");
                        int i3 = C62302rB.A06;
                        int i4 = i3;
                        try {
                            i3 = optJSONObject4.getInt("badgeExpirationInHours");
                            if (i3 < 0) {
                                i3 = i4;
                            }
                        } catch (JSONException unused) {
                        }
                        JSONObject jSONObject2 = optJSONObject4.getJSONObject("timing");
                        C18070vi.A0X(jSONObject2);
                        C40861vP A003 = A00(jSONObject2);
                        C18070vi.A0b(string7);
                        C18070vi.A0b(string8);
                        r0 = new C59602ma(A003, string7, string8, i3);
                    }
                    C18070vi.A0b(string);
                    A13.add(new C59762mq(r10, r16, r17, r0, string, i, i2));
                }
            } catch (JSONException e) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e);
            }
        }
        return A13;
    }
}
