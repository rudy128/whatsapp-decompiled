package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4ot  reason: invalid class name and case insensitive filesystem */
public final class C97084ot implements AnonymousClass16B {
    /* JADX WARNING: type inference failed for: r0v19, types: [X.4FP, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        Boolean bool;
        Boolean bool2;
        String str2 = str;
        C18070vi.A0d(str2, 0);
        try {
            JSONObject A16 = C17880vN.A16(str2);
            if (A16.has("has_ice_breakers")) {
                bool = Boolean.valueOf(A16.getBoolean("has_ice_breakers"));
            } else {
                bool = null;
            }
            if (A16.has("has_welcome_message")) {
                bool2 = Boolean.valueOf(A16.getBoolean("has_welcome_message"));
            } else {
                bool2 = null;
            }
            C22941Dw r0 = UserJid.Companion;
            UserJid A03 = C22941Dw.A03(A16.getString("user_jid"));
            String A0J = C18070vi.A0J("ctwa_context_phone_number", A16);
            String A0J2 = C18070vi.A0J("flow_cta", A16);
            String optString = A16.optString("flow_id", (String) null);
            String optString2 = A16.optString("flow_start_screen", (String) null);
            String optString3 = A16.optString("ctwa_code", (String) null);
            String optString4 = A16.optString("source_url", (String) null);
            boolean optBoolean = A16.optBoolean("has_logged_for_analytics");
            boolean optBoolean2 = A16.optBoolean("is_flow_completed");
            AnonymousClass1E2 A032 = AnonymousClass1E2.A01.A03(C20064A5n.A01("user_lid", (String) null, A16));
            Boolean valueOf = Boolean.valueOf(A16.optBoolean("should_show_automated_greeting_message"));
            ? obj = new Object();
            obj.A01 = A03;
            obj.A06 = A0J;
            obj.A07 = A0J2;
            obj.A08 = optString;
            obj.A09 = optString2;
            obj.A05 = optString3;
            obj.A0A = optString4;
            obj.A02 = bool;
            obj.A03 = bool2;
            obj.A0B = optBoolean;
            obj.A0C = optBoolean2;
            obj.A00 = A032;
            obj.A04 = valueOf;
            return obj;
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: CtwaFlowContextTransformer/fromData/JSONException", e);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        AnonymousClass4FP r4 = (AnonymousClass4FP) obj;
        C18070vi.A0d(r4, 0);
        try {
            AnonymousClass5SH r1 = new AnonymousClass5SH(r4);
            JSONObject jSONObject = new JSONObject();
            r1.invoke(jSONObject);
            return C18070vi.A0H(jSONObject);
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: CtwaFlowContextTransformer/toData/JSONException", e);
        }
    }
}
