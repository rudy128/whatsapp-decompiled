package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1QG  reason: invalid class name */
public final class AnonymousClass1QG {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C71023Dm(this, 42));

    public AnonymousClass1QG(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public void A05(C70513Bj r6) {
        LinkedHashMap A0C = AnonymousClass1D7.A0C(new AnonymousClass1D6(r6.A06, r6));
        LinkedHashMap A012 = A01();
        if (true ^ A012.isEmpty()) {
            A0C.putAll(A012);
        }
        A02(A0C);
    }

    public void A06(List list) {
        boolean z;
        C18070vi.A0d(list, 0);
        LinkedHashMap A012 = A01();
        if (!A012.isEmpty()) {
            Iterator it = list.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Object next = it.next();
                    if (!z) {
                        z = true;
                        if (A012.remove(next) == null) {
                        }
                    }
                }
            }
            if (z) {
                A02(A012);
            }
        }
    }

    public static final C70513Bj A00(String str) {
        C62372rI r3;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String string2 = jSONObject.getString("title");
        String string3 = jSONObject.getString("description");
        String string4 = jSONObject.getString("ctaText");
        String string5 = jSONObject.getString("scope");
        int i = jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        boolean optBoolean = jSONObject.optBoolean("isCancelable", true);
        String optString = jSONObject.optString("phoenix_flow");
        C18070vi.A0b(optString);
        ADT adt = null;
        if (optString.length() > 0) {
            String string6 = new JSONObject(optString).getString("config");
            C18070vi.A0X(string6);
            r3 = new C62372rI(string6);
        } else {
            r3 = null;
        }
        String optString2 = jSONObject.optString("legacy_payment_step_up_info");
        C18070vi.A0b(optString2);
        if (optString2.length() > 0) {
            adt = C196789ve.A01(optString2);
        }
        C18070vi.A0b(string);
        C18070vi.A0b(string2);
        C18070vi.A0b(string3);
        C18070vi.A0b(string4);
        C18070vi.A0b(string5);
        return new C70513Bj(r3, adt, string, string2, string3, string4, string5, i, optBoolean);
    }

    private final LinkedHashMap A01() {
        Object value = this.A01.getValue();
        C18070vi.A0X(value);
        String string = ((SharedPreferences) value).getString("framework_alert_list_info", (String) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            C18070vi.A0X(keys);
            while (keys.hasNext()) {
                String next = keys.next();
                String string2 = jSONObject.getString(next);
                C18070vi.A0X(string2);
                linkedHashMap.put(next, A00(string2));
            }
        }
        return linkedHashMap;
    }

    private final void A02(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C70513Bj r7 = (C70513Bj) entry.getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r7.A06);
            jSONObject.put("title", r7.A08);
            jSONObject.put("description", r7.A05);
            jSONObject.put("ctaText", r7.A04);
            jSONObject.put("scope", r7.A07);
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r7.A01);
            jSONObject.put("isCancelable", r7.A09);
            C62372rI r0 = r7.A02;
            if (r0 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("config", r0.A00);
                String obj = jSONObject2.toString();
                C18070vi.A0X(obj);
                jSONObject.put("phoenix_flow", obj);
            }
            ADT adt = r7.A03;
            if (adt != null) {
                jSONObject.put("legacy_payment_step_up_info", adt.A00().toString());
            }
            String obj2 = jSONObject.toString();
            C18070vi.A0X(obj2);
            linkedHashMap.put(key, obj2);
        }
        Object value = this.A01.getValue();
        C18070vi.A0X(value);
        SharedPreferences.Editor edit = ((SharedPreferences) value).edit();
        edit.putString("framework_alert_list_info", new JSONObject(linkedHashMap).toString());
        edit.apply();
    }

    public C70513Bj A03(String str) {
        Object value = this.A01.getValue();
        C18070vi.A0X(value);
        String string = ((SharedPreferences) value).getString("framework_alert_list_info", (String) null);
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            C18070vi.A0X(keys);
            while (keys.hasNext()) {
                String next = keys.next();
                if (C18070vi.A18(next, str)) {
                    String string2 = jSONObject.getString(next);
                    C18070vi.A0X(string2);
                    return A00(string2);
                }
            }
        }
        return null;
    }

    public ArrayList A04() {
        LinkedHashMap A012 = A01();
        ArrayList arrayList = new ArrayList();
        if (!A012.isEmpty()) {
            arrayList.addAll(A012.values());
        }
        return arrayList;
    }
}
