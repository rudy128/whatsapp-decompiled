package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9kI  reason: invalid class name and case insensitive filesystem */
public final class C190049kI {
    public JSONObject A00;
    public final Map A01;

    public final C27354DcQ A00(JSONObject jSONObject, JSONObject jSONObject2) {
        this.A00 = jSONObject2;
        String optString = jSONObject.optString("version");
        C18070vi.A0b(optString);
        Integer A03 = AnonymousClass1YD.A03(optString);
        if (A03 == null || A03.intValue() > 1) {
            throw AnonymousClass8BR.A0p(AnonymousClass001.A1H("Unsupported layout version: ", optString, AnonymousClass000.A10()), 26);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("layout");
        if (optJSONArray == null) {
            return null;
        }
        C27354DcQ A012 = AnonymousClass1ZT.A01();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            C22821Di r0 = (C22821Di) this.A01.get(optJSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
            if (r0 != null) {
                A012.add(r0.invoke(optJSONObject));
            }
        }
        return AnonymousClass1ZT.A02(A012);
    }

    public C190049kI() {
        LinkedHashMap A13 = C17880vN.A13();
        this.A01 = A13;
        A13.put("Rating", new C21728Are(this, 23));
    }
}
