package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16G  reason: invalid class name */
public final class AnonymousClass16G implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("ep");
            C18070vi.A0X(jSONObject2);
            AnonymousClass2DX A00 = AnonymousClass2TE.A00(jSONObject2);
            JSONObject jSONObject3 = jSONObject.getJSONObject("lt");
            C18070vi.A0X(jSONObject3);
            return new C46142Db(A00, AnonymousClass9QF.A00(jSONObject3), jSONObject.getLong("lit"));
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: OrganicConversionInfoTransformer/fromData/JSONException", e);
        } catch (AnonymousClass11T e2) {
            throw new AnonymousClass2RU("CTWA: OrganicConversionInfoTransformer/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C46142Db r5 = (C46142Db) obj;
        C18070vi.A0d(r5, 0);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ep", r5.A01.A02());
            jSONObject.put("lt", r5.A02.A01());
            jSONObject.put("lit", r5.A00);
            String obj2 = jSONObject.toString();
            C18070vi.A0X(obj2);
            return obj2;
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: OrganicConversionInfoTransformer/toData/JSONException", e);
        }
    }
}
