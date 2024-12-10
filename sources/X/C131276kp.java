package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6kp  reason: invalid class name and case insensitive filesystem */
public final class C131276kp {
    public final C18030ve A00;

    public C131276kp(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final C20271AEe A00(String str, String str2) {
        List list;
        Object obj;
        ArrayList A0s = C72463Mc.A0s(str);
        try {
            JSONObject jSONObject = C17880vN.A16(C18020vd.A01(C18040vf.A02, this.A00, 7502)).getJSONObject("businesses");
            Iterator<String> keys = jSONObject.keys();
            C18070vi.A0X(keys);
            while (keys.hasNext()) {
                String A0v = C17880vN.A0v(keys);
                JSONObject jSONObject2 = jSONObject.getJSONObject(A0v);
                Iterator<String> keys2 = jSONObject2.keys();
                C18070vi.A0X(keys2);
                while (keys2.hasNext()) {
                    String A0v2 = C17880vN.A0v(keys2);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(A0v2);
                    String string = jSONObject3.getString("flow_id");
                    String string2 = jSONObject3.getString("flow_start_screen");
                    C108995ce.A1H(A0v, A0v2, string, string2);
                    A0s.add(new C135606sT(A0v, A0v2, string, string2));
                }
            }
            list = A0s;
        } catch (JSONException e) {
            Log.w("BotFlowsCommandUtil: failed to parse JSON", e);
            list = C18460wS.A00;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C135606sT r1 = (C135606sT) obj;
            if (C18070vi.A18(r1.A01, str2)) {
                String str3 = r1.A00;
                String str4 = str;
                int A0F = AnonymousClass1YF.A0F(str, "@", 0, false);
                if (A0F != -1) {
                    str4 = C108955ca.A0q(0, A0F, str);
                }
                if (C18070vi.A18(str3, str4)) {
                    break;
                }
            }
        }
        C135606sT r5 = (C135606sT) obj;
        if (r5 != null) {
            return AnonymousClass9QY.A00(r5.A02, "", r5.A03);
        }
        return null;
    }
}
