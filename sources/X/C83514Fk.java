package X;

import org.json.JSONObject;

/* renamed from: X.4Fk  reason: invalid class name and case insensitive filesystem */
public abstract class C83514Fk {
    public static final C89504cZ A00(JSONObject jSONObject) {
        Float f;
        C18070vi.A0d(jSONObject, 0);
        AnonymousClass4DE valueOf = AnonymousClass4DE.valueOf(C18070vi.A0J("category", jSONObject));
        C89304cF r4 = new C89304cF(C18070vi.A0J("effectId", jSONObject));
        boolean z = jSONObject.getBoolean("isFromButton");
        if (!jSONObject.isNull("effectStrength")) {
            double optDouble = jSONObject.optDouble("effectStrength");
            if (Double.valueOf(optDouble) != null) {
                f = Float.valueOf((float) optDouble);
                return new C89504cZ(valueOf, r4, f, z);
            }
        }
        f = null;
        return new C89504cZ(valueOf, r4, f, z);
    }
}
