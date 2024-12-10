package X;

import android.graphics.Paint;
import org.json.JSONObject;

/* renamed from: X.69W  reason: invalid class name */
public final class AnonymousClass69W extends C1409773u {
    public final Paint A00;
    public final String A01;

    public AnonymousClass69W(JSONObject jSONObject) {
        Paint A07 = AnonymousClass3Ma.A07();
        A07.setFilterBitmap(true);
        A07.setDither(true);
        this.A00 = A07;
        A0R(jSONObject);
        this.A01 = C18070vi.A0J("file", jSONObject);
    }

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        jSONObject.put("file", this.A01);
    }

    public AnonymousClass69W(String str) {
        Paint A07 = AnonymousClass3Ma.A07();
        A07.setFilterBitmap(true);
        A07.setDither(true);
        this.A00 = A07;
        this.A01 = str;
    }
}
