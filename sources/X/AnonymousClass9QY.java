package X;

import org.json.JSONObject;

/* renamed from: X.9QY  reason: invalid class name */
public abstract class AnonymousClass9QY {
    public static final C20271AEe A00(String str, String str2, String str3) {
        JSONObject A15 = C17880vN.A15();
        A15.put("screen", str3);
        JSONObject A0x = C108965cb.A0x((Object) null, "data", A15);
        A0x.put("flow_id", str);
        A0x.put("flow_cta", str2);
        A0x.put("flow_token", "");
        A0x.put("flow_message_version", "3");
        return new C20271AEe(str, AnonymousClass8BS.A0k(A15, "flow_action_payload", A0x));
    }
}
