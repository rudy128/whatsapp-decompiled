package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.6uM  reason: invalid class name and case insensitive filesystem */
public final class C136766uM {
    public JSONArray A00;
    public final C19830z4 A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass00H A03;

    public final void A02(int i) {
        AnonymousClass00H r4;
        synchronized (this) {
            C19830z4 r3 = this.A01;
            synchronized (r3.A01) {
                r4 = r3.A00;
                C17880vN.A1C(C19830z4.A00(r3), "sticker_suggestion_triggered_count", C17890vO.A00(C17880vN.A0B(r4), "sticker_suggestion_triggered_count") + 1);
            }
            JSONArray jSONArray = this.A00;
            if (jSONArray == null) {
                String string = C17880vN.A0B(r4).getString("sticker_suggestion_num_suggestions_array", "[]");
                C18070vi.A0X(string);
                try {
                    jSONArray = new JSONArray(string);
                } catch (JSONException e) {
                    Log.e("StickerSuggestionLogger/getNumStickerSuggestionsJsonArray Error getting JSONArray", e);
                    jSONArray = new JSONArray();
                }
                this.A00 = jSONArray;
            }
            jSONArray.put(i);
            C17880vN.A1E(C19830z4.A00(r3), "sticker_suggestion_num_suggestions_array", String.valueOf(this.A00));
        }
    }

    public final void A00() {
        C19830z4 r1 = this.A01;
        synchronized (r1.A01) {
            C17880vN.A1C(C19830z4.A00(r1), "sticker_suggestion_icon_clicked_count", C17890vO.A00(C17890vO.A0B(r1), "sticker_suggestion_icon_clicked_count") + 1);
        }
    }

    public final void A01() {
        C19830z4 r1 = this.A01;
        synchronized (r1.A01) {
            C17880vN.A1C(C19830z4.A00(r1), "sticker_suggestion_sticker_sent_count", C17890vO.A00(C17890vO.A0B(r1), "sticker_suggestion_sticker_sent_count") + 1);
        }
    }

    public final void A03(Integer num, int i, int i2) {
        C1182162p r1 = new C1182162p();
        r1.A00 = num;
        r1.A01 = C17880vN.A0n(i);
        r1.A02 = C17880vN.A0n(i2);
        this.A02.CC7(r1);
    }

    public C136766uM(C19830z4 r1, AnonymousClass18K r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }
}
