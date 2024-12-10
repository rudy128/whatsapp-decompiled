package X;

import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.69e  reason: invalid class name */
public final class AnonymousClass69e extends C1409773u implements AnonymousClass87T {
    public final int A00;
    public final AnonymousClass9Id A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        jSONObject.put("skipConfirmation", this.A05);
        jSONObject.put("newsletterJid", this.A03);
        jSONObject.put("serverMessageId", this.A00);
        jSONObject.put("newsletterName", this.A04);
        AnonymousClass9Id r0 = this.A01;
        if (r0 != null) {
            jSONObject.put("contentType", r0.value);
        }
        String str = this.A02;
        if (str != null) {
            jSONObject.put("accessibilityText", str);
        }
    }

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        RectF rectF2 = this.A06;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
    }

    public AnonymousClass69e(JSONObject jSONObject) {
        A0R(jSONObject);
        this.A05 = jSONObject.getBoolean("skipConfirmation");
        this.A03 = C18070vi.A0J("newsletterJid", jSONObject);
        this.A00 = jSONObject.getInt("serverMessageId");
        this.A04 = C18070vi.A0J("newsletterName", jSONObject);
        this.A01 = AnonymousClass9RX.A00(Integer.valueOf(jSONObject.optInt("contentType")));
        this.A02 = jSONObject.optString("accessibilityText");
    }

    public boolean CNP() {
        return this.A05;
    }

    public AnonymousClass69e(AnonymousClass9Id r2, String str, String str2, String str3, int i, boolean z) {
        C18070vi.A0d(str, 2);
        this.A05 = z;
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A01 = r2;
        this.A02 = str3;
    }
}
