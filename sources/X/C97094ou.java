package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4ou  reason: invalid class name and case insensitive filesystem */
public final class C97094ou implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        try {
            JSONObject A16 = C17880vN.A16(str);
            String string = A16.getString("business_id");
            C22941Dw r0 = UserJid.Companion;
            return new AnonymousClass4V3(C22941Dw.A03(string), C18070vi.A0J("flow_message_id", A16), C18070vi.A0J("flow_id", A16), C18070vi.A0J("flow_token", A16), C18070vi.A0J("flow_action", A16), A6n.A02("flow_action_payload", A16));
        } catch (JSONException e) {
            throw new AnonymousClass2RU("ShoppingFlows: ShoppingFlowContextDataTransformer/fromData/JSONException", e);
        } catch (AnonymousClass11T e2) {
            throw new AnonymousClass2RU("ShoppingFlows: ShoppingFlowContextDataTransformer/fromData/InvalidJidException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C18070vi.A0d(obj, 0);
        C99244sV A00 = C99244sV.A00(obj, 28);
        JSONObject jSONObject = new JSONObject();
        A00.invoke(jSONObject);
        return C18070vi.A0H(jSONObject);
    }
}
