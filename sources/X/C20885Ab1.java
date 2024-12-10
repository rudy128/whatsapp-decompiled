package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ab1  reason: case insensitive filesystem */
public final class C20885Ab1 implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        JSONObject A16 = C17880vN.A16(str);
        C22931Dv r2 = AnonymousClass1BI.A00;
        AnonymousClass1BI A02 = r2.A02(A16.getString("chat_jid_raw"));
        if (A02 == null) {
            throw new AnonymousClass2RU("Invalid ReadEventParams JSON");
        }
        int i = A16.getInt("read_source");
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass1BI A022 = r2.A02(A16.getString("chat_jid_raw"));
        JSONArray jSONArray = A16.getJSONArray("unread_messages");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            A13.add(AnonymousClass205.A01(A022, jSONObject.getString("message_key_id"), jSONObject.getBoolean("message_is_from_me")));
        }
        return new C195179sv(A02, A13, i, A16.getLong("event_time"), A16.getBoolean("is_bulk_action"));
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C195179sv r8 = (C195179sv) obj;
        JSONObject A0u = C108985cd.A0u(r8);
        A0u.put("chat_jid_raw", r8.A02.getRawString());
        A0u.put("read_source", r8.A00);
        JSONArray A1A = AnonymousClass8BR.A1A();
        for (AnonymousClass205 r3 : r8.A03) {
            JSONObject A15 = C17880vN.A15();
            A15.put("message_key_id", r3.A01);
            A15.put("message_is_from_me", r3.A02);
            A1A.put(A15);
        }
        A0u.put("unread_messages", A1A);
        A0u.put("is_bulk_action", r8.A04);
        A0u.put("event_time", r8.A01);
        return C18070vi.A0H(A0u);
    }
}
