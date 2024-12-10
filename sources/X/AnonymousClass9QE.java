package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9QE  reason: invalid class name */
public abstract class AnonymousClass9QE {
    public static final AnonymousClass8oR A00(JSONObject jSONObject) {
        AnonymousClass9IQ r11;
        AnonymousClass1E2 r12;
        JSONObject jSONObject2 = jSONObject;
        String string = jSONObject2.getString("brj");
        String string2 = jSONObject2.getString("ap");
        String string3 = jSONObject2.getString("s");
        List list = null;
        String A01 = C20064A5n.A01("sg", (String) null, jSONObject2);
        long j = jSONObject2.getLong("ct");
        String A012 = C20064A5n.A01("tb_t", (String) null, jSONObject2);
        int optInt = jSONObject2.optInt("tb_a", -1);
        JSONArray optJSONArray = jSONObject2.optJSONArray("cf");
        boolean optBoolean = jSONObject2.optBoolean("lrt");
        boolean optBoolean2 = jSONObject2.optBoolean("aae");
        AnonymousClass4DN A00 = AnonymousClass4GV.A00(AnonymousClass8BT.A0k("cdv", jSONObject2));
        if (A00 == null) {
            A00 = AnonymousClass4DN.DEFAULT;
        }
        int optInt2 = jSONObject2.optInt("cs");
        Integer valueOf = Integer.valueOf(optInt2);
        AnonymousClass9IQ[] values = AnonymousClass9IQ.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r11 = AnonymousClass9IQ.EXTERNAL;
                break;
            }
            r11 = values[i];
            int i2 = r11.value;
            if (valueOf != null && i2 == optInt2) {
                break;
            }
            i++;
        }
        String A013 = C20064A5n.A01("ad_id", (String) null, jSONObject2);
        String A014 = C20064A5n.A01("adg_id", (String) null, jSONObject2);
        String A015 = C20064A5n.A01("lid", (String) null, jSONObject2);
        if (A015 != null) {
            r12 = AnonymousClass1E2.A01.A03(A015);
        } else {
            r12 = null;
        }
        if (optJSONArray != null) {
            list = AnonymousClass4GW.A00(optJSONArray);
        }
        UserJid A0X = AnonymousClass8BR.A0X(string);
        C18070vi.A0b(string2);
        C18070vi.A0b(string3);
        if (A012 == null) {
            A012 = "";
        }
        return new AnonymousClass8oR(A00, r11, r12, A0X, string2, string3, A012, A013, A014, A01, list, optInt, j, optBoolean, optBoolean2);
    }
}
