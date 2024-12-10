package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.84U  reason: invalid class name */
public final class AnonymousClass84U extends JSONObject {
    public final void A01(String str, Object obj) {
        C18070vi.A0d(str, 0);
        put(str, obj);
    }

    public final void A02(String str, List list) {
        C18070vi.A0d(list, 1);
        JSONArray jSONArray = new JSONArray();
        for (Object put : list) {
            jSONArray.put(put);
        }
        put(str, jSONArray);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.json.JSONObject, java.lang.Object, X.84U] */
    public static AnonymousClass84U A00(C22821Di r1) {
        ? jSONObject = new JSONObject();
        r1.invoke(jSONObject);
        return jSONObject;
    }
}
