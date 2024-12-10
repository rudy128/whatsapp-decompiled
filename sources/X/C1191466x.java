package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.66x  reason: invalid class name and case insensitive filesystem */
public final class C1191466x extends AnonymousClass161 implements C18140vp {
    public final String A00;

    public void A02(JSONObject jSONObject, long j) {
        AnonymousClass775 r8;
        if (jSONObject != null) {
            ArrayList A13 = AnonymousClass000.A13();
            try {
                JSONArray jSONArray = jSONObject.getJSONObject(this.A00).getJSONArray("suggestions");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    C18070vi.A0b(jSONObject2);
                    String A02 = A6n.A02("query", jSONObject2);
                    String A022 = A6n.A02("session_id", jSONObject2);
                    String A023 = A6n.A02("context", jSONObject2);
                    JSONObject optJSONObject = jSONObject2.optJSONObject("imagine_data");
                    if (optJSONObject != null) {
                        r8 = new AnonymousClass775((Bitmap) null, A6n.A02("image_data", optJSONObject), A6n.A02("image_id", optJSONObject));
                    } else {
                        r8 = null;
                    }
                    A13.add(new AnonymousClass77E(r8, C18070vi.A0J("suggestion", jSONObject2), A02, A022, A023));
                }
                A13.isEmpty();
            } catch (JSONException unused) {
            }
            this.A00 = new C1417676w(A13);
        }
    }

    public C1191466x(String str) {
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object get() {
        return this;
    }
}
