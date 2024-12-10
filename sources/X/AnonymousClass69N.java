package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.json.JSONObject;

/* renamed from: X.69N  reason: invalid class name */
public final class AnonymousClass69N extends AnonymousClass69a implements AnonymousClass3LH {
    public Drawable A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final String A08;
    public final int A09;
    public final Context A0A;
    public final C26631Sw A0B;

    private final void A00() {
        String str = this.A04;
        C17960vV.A07(str);
        String str2 = this.A05;
        C17960vV.A07(str2);
        int i = this.A09;
        C17960vV.A0D(AnonymousClass000.A1R(i));
        C1418377d A0a = C108985cd.A0a();
        int i2 = A0a.A01;
        A0a.A0B = str;
        A0a.A01 = i2;
        A0a.A0F = str2;
        A0a.A0Q = this.A07;
        A0a.A0N = this.A01;
        A0a.A0K = this.A02;
        A0a.A0L = this.A06;
        this.A0B.A05(this.A0A, A0a, this, i, i);
    }

    public void A0Q(JSONObject jSONObject) {
        String str;
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        String str2 = this.A04;
        if (!(str2 == null || (str = this.A05) == null)) {
            jSONObject.put("file_path", str2);
            jSONObject.put("plain_file_hash", str);
            jSONObject.put("file_storage_location", this.A03);
        }
        jSONObject.put("sticker_size", this.A09);
        jSONObject.put("content_description", this.A08);
        jSONObject.put("sticker_is_lottie", this.A07);
        jSONObject.put("sticker_is_avatar", this.A01);
        jSONObject.put("sticker_is_country_avatar", this.A02);
        jSONObject.put("sticker_is_instant_avatar", this.A06);
    }

    public void C6o(Drawable drawable) {
        this.A00 = drawable;
        RectF rectF = this.A06;
        A0O(rectF, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final void A01(Canvas canvas, AnonymousClass69N r6, int i, int i2) {
        RectF rectF = r6.A06;
        float width = rectF.width() / ((float) i);
        float height = rectF.height() / ((float) i2);
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.scale(width, height);
        canvas.rotate(r6.A02);
        float A022 = C108945cZ.A02(-i);
        canvas.translate(A022, A022);
    }

    public AnonymousClass69N(Context context, C26631Sw r6, JSONObject jSONObject) {
        this.A0A = context;
        this.A09 = jSONObject.getInt("sticker_size");
        this.A0B = r6;
        if (jSONObject.has("file_path") && jSONObject.has("plain_file_hash") && jSONObject.has("file_storage_location")) {
            this.A04 = jSONObject.getString("file_path");
            this.A05 = jSONObject.getString("plain_file_hash");
            this.A03 = jSONObject.getInt("file_storage_location");
            this.A07 = jSONObject.getBoolean("sticker_is_lottie");
            this.A01 = jSONObject.getBoolean("sticker_is_avatar");
            this.A02 = jSONObject.getBoolean("sticker_is_country_avatar");
            this.A06 = jSONObject.getBoolean("sticker_is_instant_avatar");
            A00();
        }
        this.A08 = C18070vi.A0J("content_description", jSONObject);
        A0R(jSONObject);
        if (this.A00 == null) {
            throw AnonymousClass000.A0k("loadedDrawable was not loaded correctly");
        }
    }

    public AnonymousClass69N(Context context, C1418377d r3, C26631Sw r4, int i) {
        C18070vi.A0f(r3, 2, r4);
        this.A0A = context;
        this.A04 = r3.A0B;
        this.A09 = i;
        this.A03 = r3.A01;
        this.A05 = r3.A0F;
        this.A07 = r3.A02();
        this.A08 = AnonymousClass73J.A00(context, r3);
        this.A0B = r4;
        this.A01 = r3.A0N;
        this.A02 = r3.A0K;
        this.A06 = r3.A0L;
        A00();
    }
}
