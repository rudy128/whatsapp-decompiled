package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.9Qi  reason: invalid class name and case insensitive filesystem */
public abstract class C181399Qi {
    public static final C196009uJ A00(JSONObject jSONObject) {
        Integer num;
        Integer num2;
        String string = jSONObject.getString("business_jid");
        String string2 = jSONObject.getString("business_type");
        String string3 = jSONObject.getString("conversion_event_type");
        long j = jSONObject.getLong("conversion_event_timestamp");
        UserJid A0X = AnonymousClass8BR.A0X(string);
        C18070vi.A0b(string2);
        if (string2.equals("ENTERPRISE")) {
            num = AnonymousClass00R.A00;
        } else if (string2.equals("SMB")) {
            num = AnonymousClass00R.A01;
        } else {
            throw AnonymousClass000.A0k(string2);
        }
        C18070vi.A0b(string3);
        if (string3.equals("DEEP_CONVERSATION")) {
            num2 = AnonymousClass00R.A00;
        } else if (string3.equals("CALL_COMPLETE")) {
            num2 = AnonymousClass00R.A01;
        } else {
            throw AnonymousClass000.A0k(string3);
        }
        return new C196009uJ(A0X, num, num2, j);
    }
}
