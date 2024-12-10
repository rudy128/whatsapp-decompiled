package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import org.json.JSONObject;

/* renamed from: X.69K  reason: invalid class name */
public final class AnonymousClass69K extends AnonymousClass69a {
    public float A00 = 1.0f;
    public Bitmap A01;
    public String A02;
    public final Paint A03;

    public AnonymousClass69K(C18030ve r3, C25291Nq r4, JSONObject jSONObject) {
        Bitmap bitmap;
        Paint A07 = AnonymousClass3Ma.A07();
        A07.setFilterBitmap(true);
        A07.setDither(true);
        this.A03 = A07;
        A0R(jSONObject);
        this.A02 = jSONObject.getString("file");
        this.A00 = ((float) jSONObject.optInt("initial_scale", 100)) / 100.0f;
        int A002 = C18020vd.A00(C18040vf.A02, r3, 2654);
        try {
            bitmap = r4.A07(Uri.parse(this.A02), A002, A002);
        } catch (Exception unused) {
            bitmap = null;
        }
        this.A01 = bitmap;
    }

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        jSONObject.put("file", this.A02);
        jSONObject.put("initial_scale", (int) (this.A00 * 100.0f));
    }

    public final boolean A0b() {
        float f = this.A00;
        float f2 = this.A03;
        if (f == f2 && this.A02 == 0.0f && ((f2 > 1.01f || f2 < 0.99f) && this.A00 == 0.0f && this.A01 == 0.0f)) {
            return true;
        }
        return false;
    }

    public final boolean A0c() {
        if (this.A02 == 0.0f) {
            float f = this.A03;
            if (f > 1.01f || f < 0.99f || this.A00 != 0.0f || this.A01 != 0.0f) {
                return true;
            }
            return false;
        }
        return true;
    }

    public AnonymousClass69K(Bitmap bitmap, String str) {
        Paint A07 = AnonymousClass3Ma.A07();
        A07.setFilterBitmap(true);
        A07.setDither(true);
        this.A03 = A07;
        this.A01 = bitmap;
        this.A02 = str;
    }
}
