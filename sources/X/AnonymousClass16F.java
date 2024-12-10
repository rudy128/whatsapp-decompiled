package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16F  reason: invalid class name */
public final class AnonymousClass16F implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("tokens");
            C18070vi.A0X(jSONObject2);
            String string = jSONObject2.getString("brj");
            String A02 = A6n.A02("ctoken", jSONObject2);
            String A022 = A6n.A02("nctoken", jSONObject2);
            long j = jSONObject2.getLong("ct");
            C22941Dw r0 = UserJid.Companion;
            AnonymousClass8oP r5 = new AnonymousClass8oP(C22941Dw.A03(string), A02, A022, j);
            JSONObject jSONObject3 = jSONObject.getJSONObject("lt");
            C18070vi.A0X(jSONObject3);
            return new C46132Da(AnonymousClass9QF.A00(jSONObject3), r5, jSONObject.getLong("lit"));
        } catch (JSONException e) {
            throw new AnonymousClass2RU("OptimisedDelivery: ConversionInfoJsonTransformer/fromData/JSONException", e);
        } catch (IllegalArgumentException e2) {
            throw new AnonymousClass2RU("OptimisedDelivery: ConversionInfoJsonTransformer/fromData/JSONException", e2);
        } catch (AnonymousClass11T e3) {
            throw new AnonymousClass2RU("OptimisedDelivery: ConversionInfoJsonTransformer/fromData/JSONException", e3);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C46132Da r7 = (C46132Da) obj;
        C18070vi.A0d(r7, 0);
        try {
            JSONObject jSONObject = new JSONObject();
            AnonymousClass8oP r5 = r7.A02;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("brj", r5.A00.getRawString());
            jSONObject2.put("ctoken", r5.A01);
            jSONObject2.put("nctoken", r5.A02);
            jSONObject2.put("ct", r5.A00);
            jSONObject.put("tokens", jSONObject2);
            jSONObject.put("lt", r7.A01.A01());
            jSONObject.put("lit", r7.A00);
            String obj2 = jSONObject.toString();
            C18070vi.A0b(obj2);
            return obj2;
        } catch (JSONException e) {
            throw new AnonymousClass2RU("OptimisedDelivery: ConversionInfoJsonTransformer/toData/JSONException", e);
        }
    }
}
