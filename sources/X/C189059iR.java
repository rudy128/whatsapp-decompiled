package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.9iR  reason: invalid class name and case insensitive filesystem */
public final class C189059iR {
    public final A2Y A00(JSONObject jSONObject) {
        Object obj;
        C18070vi.A0d(jSONObject, 0);
        String A0J = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject);
        Iterator it = AnonymousClass9IT.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C18070vi.A18(((AnonymousClass9IT) obj).value, A0J)) {
                break;
            }
        }
        AnonymousClass9IT r4 = (AnonymousClass9IT) obj;
        Long l = null;
        if (r4 == null) {
            return null;
        }
        if (jSONObject.has("permission_days")) {
            l = Long.valueOf(((long) jSONObject.getInt("permission_days")) * 86400);
        }
        if (jSONObject.has("permission_seconds")) {
            l = Long.valueOf(jSONObject.getLong("permission_seconds"));
        }
        return new A2Y(r4, l);
    }
}
