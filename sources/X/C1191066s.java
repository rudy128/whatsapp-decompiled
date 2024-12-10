package X;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.66s  reason: invalid class name and case insensitive filesystem */
public final class C1191066s extends AnonymousClass161 {
    public final AnonymousClass00H A00;

    public C1191066s(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void A02(JSONObject jSONObject, long j) {
        String string;
        C136936ue A0p;
        String str;
        if (jSONObject != null) {
            if (!jSONObject.has("fetch__WAAvatar")) {
                A0p = C108945cZ.A0p(this.A00);
                str = "missing envelope (fetch__WAAvatar)";
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("fetch__WAAvatar");
                if (!jSONObject2.has("wa_stickers_v2")) {
                    A0p = C108945cZ.A0p(this.A00);
                    str = "missing key (wa_stickers)";
                } else {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("wa_stickers_v2");
                    if (!jSONObject3.has("stickers")) {
                        A0p = C108945cZ.A0p(this.A00);
                        str = "missing key (stickers)";
                    } else {
                        JSONArray jSONArray = jSONObject3.getJSONArray("stickers");
                        if (jSONArray.length() == 0) {
                            C108945cZ.A0p(this.A00).A02(6, "empty_profile_pictures_response", "Empty profile picture sticker list");
                            return;
                        }
                        ArrayList A13 = AnonymousClass000.A13();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                            String A0J = C18070vi.A0J("url", jSONObject4);
                            JSONArray jSONArray2 = jSONObject4.getJSONArray("emojis");
                            ArrayList A132 = AnonymousClass000.A13();
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                String string2 = jSONArray2.getString(i2);
                                C18070vi.A0X(string2);
                                A132.add(string2);
                            }
                            C18070vi.A0d(A132, 0);
                            String join = TextUtils.join(" ", A132);
                            C18070vi.A0X(join);
                            if (!jSONObject4.has("accessibility_label")) {
                                string = null;
                            } else {
                                string = jSONObject4.getString("accessibility_label");
                            }
                            A13.add(new AnonymousClass777(A0J, join, string));
                        }
                        this.A00 = new C1417876y(A13);
                        return;
                    }
                }
            }
            A0p.A02(6, "malformed_profile_pictures_json_response", str);
        }
    }
}
