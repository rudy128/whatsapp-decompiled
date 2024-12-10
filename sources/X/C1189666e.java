package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.66e  reason: invalid class name and case insensitive filesystem */
public final class C1189666e extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        if (jSONObject != null) {
            ArrayList A13 = AnonymousClass000.A13();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("xwa_genai_imagine_suggestions_for_intents_wa");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    C18070vi.A0b(jSONObject2);
                    String A02 = A6n.A02("image_uri", jSONObject2);
                    String A022 = A6n.A02("intent", jSONObject2);
                    String A023 = A6n.A02("prompt", jSONObject2);
                    String A024 = A6n.A02("short_prompt", jSONObject2);
                    if (A02 == null || A022 == null || A023 == null || A024 == null) {
                        StringBuilder sb = new StringBuilder("ImagineSuggestionsDataProcessor items that are null: ");
                        if (A02 == null) {
                            sb.append("imageUri ");
                        }
                        if (A022 == null) {
                            sb.append("intent ");
                        }
                        if (A023 == null) {
                            sb.append("prompt ");
                        }
                        if (A024 == null) {
                            sb.append("shortPrompt ");
                        }
                        C17890vO.A0w(sb);
                    } else {
                        A13.add(new C135716se(A02, A022, A023, A024));
                    }
                }
            } catch (JSONException e) {
                C17900vP.A0X(e, "ImagineSuggestionsDataProcessor JsonParsingException on RootResponse/", AnonymousClass000.A10());
            }
            this.A00 = new C134296qM(A13);
        }
    }
}
