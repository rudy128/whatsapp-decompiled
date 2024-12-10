package X;

import org.json.JSONObject;

/* renamed from: X.16W  reason: invalid class name */
public abstract class AnonymousClass16W extends AnonymousClass161 {
    public C128776gf A03(JSONObject jSONObject) {
        String str;
        String string;
        if (jSONObject != null) {
            String string2 = jSONObject.getString("status");
            String A00 = C124286Xt.A00(string2);
            if (!A00.equals("UNKNOWN_IN_CLIENT")) {
                String str2 = null;
                if (jSONObject.isNull("reason") || (string = jSONObject.getString("reason")) == null) {
                    str = null;
                } else {
                    str = "OOPS";
                    if (!str.equals(string)) {
                        str = "OTHER";
                    }
                }
                if (!jSONObject.isNull("reason_url")) {
                    str2 = jSONObject.getString("reason_url");
                }
                return new C128776gf(A00, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("State is invalid in ban appeal status: ");
            sb.append(string2);
            sb.append(", ");
            sb.append(A04());
            throw new Exception(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Value of ");
        sb2.append(A04());
        sb2.append(" is null while submitting ban appeal");
        throw new Exception(sb2.toString());
    }

    public String A04() {
        if (this instanceof AnonymousClass16Y) {
            return "whatsapp_support_process_ban_appeal_request";
        }
        return "whatsapp_support_ban_appeal_status";
    }
}
