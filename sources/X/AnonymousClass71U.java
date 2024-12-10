package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.71U  reason: invalid class name */
public final class AnonymousClass71U {
    public static final AnonymousClass71U A00 = new Object();

    public final ArrayList A01(JSONArray jSONArray) {
        String str;
        String str2;
        AnonymousClass775 r7;
        if (jSONArray == null) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("suggestion");
            if (jSONObject.has("query")) {
                str = jSONObject.getString("query");
            } else {
                str = null;
            }
            if (jSONObject.has("session_id")) {
                str2 = jSONObject.getString("session_id");
            } else {
                str2 = null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("imagine_data");
            if (optJSONObject == null) {
                r7 = null;
            } else {
                r7 = new AnonymousClass775((Bitmap) null, A6n.A02("image_data", optJSONObject), A6n.A02("image_id", optJSONObject));
            }
            C18070vi.A0b(string);
            A13.add(new AnonymousClass77E(r7, string, str, str2, (String) null));
        }
        return A13;
    }

    public static final JSONArray A00(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass77E r2 = (AnonymousClass77E) it.next();
            JSONObject A15 = C17880vN.A15();
            A15.put("suggestion", r2.A03);
            String str = r2.A01;
            if (str != null) {
                A15.put("query", str);
            }
            String str2 = r2.A02;
            if (str2 != null) {
                A15.put("session_id", str2);
            }
            AnonymousClass775 r0 = r2.A00;
            if (r0 != null) {
                String str3 = r0.A01;
                String str4 = r0.A02;
                JSONObject A152 = C17880vN.A15();
                if (str3 != null) {
                    A152.put("image_data", str3);
                }
                if (str4 != null) {
                    A152.put("image_id", str4);
                }
                A15.put("imagine_data", A152);
            }
            jSONArray.put(A15);
        }
        return jSONArray;
    }
}
