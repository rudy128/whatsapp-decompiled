package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.69Y  reason: invalid class name */
public final class AnonymousClass69Y extends C24023Bu9 implements AnonymousClass87T {
    public double A00;
    public double A01;
    public Picture A02;
    public Picture A03;
    public String A04;
    public String A05;
    public boolean A06;
    public float A07;
    public C129106hG[] A08;
    public C129106hG[] A09;
    public final Paint A0A = C108945cZ.A0K(1);
    public final TextPaint A0B;
    public final Paint A0C = C108945cZ.A0K(1);
    public final Paint A0D = C108945cZ.A0K(1);
    public final C133536ov A0E;
    public final C133696pL A0F;
    public final String A0G;
    public final boolean A0H;

    public AnonymousClass69Y(Context context, C18000vb r6, String str, boolean z) {
        super(context);
        int i;
        this.A0H = z;
        TextPaint textPaint = new TextPaint(1);
        this.A0B = textPaint;
        this.A0E = new C1196369f(this, 2);
        Picture A0b = A0b("ic_content_sticker_location_emerald.svg");
        if (A0b != null) {
            Picture A0b2 = A0b("ic_content_sticker_location.svg");
            if (A0b2 != null) {
                this.A02 = A0b;
                this.A03 = A0b2;
                if (A0b.getWidth() == A0b2.getWidth()) {
                    C108995ce.A0o(this.A0B, 46.0f);
                    this.A05 = str;
                    Picture picture = this.A03;
                    if (picture != null) {
                        i = picture.getWidth();
                    } else {
                        i = 0;
                    }
                    this.A04 = TextUtils.ellipsize(str, textPaint, ((1000.0f - ((float) i)) - 75.0f) - 26.0f, TextUtils.TruncateAt.END).toString();
                    A00(this);
                    this.A0F = new C133696pL(context, r6);
                    this.A0G = "location";
                    return;
                }
                throw AnonymousClass000.A0n("Check failed.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public String A0E(Context context) {
        C18070vi.A0d(context, 0);
        return C18070vi.A0F(context, 2131889554);
    }

    public void A0I(float f) {
        A0L(2, f);
        this.A0F.A00(f);
    }

    public void A0K(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[LOOP:0: B:16:0x0057->B:17:0x0059, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(android.graphics.Canvas r12) {
        /*
            r11 = this;
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            X.6ov r1 = r11.A0E
            float r3 = r1.A00()
            boolean r10 = r11.A06
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0019
            float r1 = r1.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0019
            r10 = r10 ^ 1
        L_0x0019:
            r12.save()
            android.graphics.RectF r6 = r11.A06
            r6.sort()
            float r0 = r11.A02
            X.C108985cd.A0w(r12, r6, r0)
            float r2 = r6.width()
            float r0 = r11.A07
            float r2 = r2 / r0
            float r1 = r6.height()
            r0 = 1121058816(0x42d20000, float:105.0)
            X.C1409773u.A07(r12, r6, r1, r0, r2)
            float r1 = r11.A07
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r4 = 1112670208(0x42520000, float:52.5)
            r12.scale(r3, r3, r1, r4)
            if (r10 == 0) goto L_0x004d
            X.6hG[] r9 = r11.A08
            if (r9 != 0) goto L_0x0054
            java.lang.String r0 = "darkThemeRects"
        L_0x0048:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x004d:
            X.6hG[] r9 = r11.A09
            if (r9 != 0) goto L_0x0054
            java.lang.String r0 = "lightThemeRects"
            goto L_0x0048
        L_0x0054:
            int r8 = r9.length
            r7 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r8) goto L_0x0069
            r0 = r9[r5]
            android.graphics.RectF r3 = r0.A03
            float r2 = r0.A00
            float r1 = r0.A01
            android.graphics.Paint r0 = r0.A02
            r12.drawRoundRect(r3, r2, r1, r0)
            int r5 = r5 + 1
            goto L_0x0057
        L_0x0069:
            if (r10 == 0) goto L_0x00f9
            android.graphics.Picture r3 = r11.A03
            android.text.TextPaint r9 = r11.A0B
            r0 = -1
        L_0x0070:
            r9.setColor(r0)
            if (r3 == 0) goto L_0x00f7
            int r0 = r3.getWidth()
        L_0x0079:
            float r2 = (float) r0
            if (r3 == 0) goto L_0x0080
            int r7 = r3.getHeight()
        L_0x0080:
            float r7 = (float) r7
            r5 = 1104150528(0x41d00000, float:26.0)
            float r5 = r5 + r2
            float r0 = r11.A07
            float r5 = r5 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r1 = r9.descent()
            float r0 = r9.ascent()
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r1 = r4 - r1
            boolean r8 = r11.A0H
            if (r8 != 0) goto L_0x00a1
            java.lang.String r0 = r11.A04
            r12.drawText(r0, r5, r1, r9)
        L_0x00a1:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r7
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r4 = r4 - r1
            if (r3 == 0) goto L_0x00bd
            r0 = 1108738048(0x42160000, float:37.5)
            r12.save()
            r12.translate(r0, r4)
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.scale(r0, r0)
            r12.drawPicture(r3)
            r12.restore()
        L_0x00bd:
            if (r8 == 0) goto L_0x00ea
            r7 = 1108738048(0x42160000, float:37.5)
            android.graphics.Paint r5 = r11.A0A
            android.content.Context r1 = r11.A00
            r0 = 2131103224(0x7f060df8, float:1.7818908E38)
            X.AnonymousClass3MX.A19(r1, r5, r0)
            r4 = 1090519040(0x41000000, float:8.0)
            android.util.DisplayMetrics r0 = X.C108965cb.A07()
            float r0 = r0.density
            float r4 = r4 * r0
            float r7 = r7 + r2
            r0 = 1104150528(0x41d00000, float:26.0)
            float r7 = r7 + r0
            r0 = 1126825984(0x432a0000, float:170.0)
            float r3 = r7 + r0
            r0 = 1106247680(0x41f00000, float:30.0)
            r2 = 1108738048(0x42160000, float:37.5)
            float r1 = r2 + r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7, r2, r3, r1)
            r12.drawRoundRect(r0, r4, r4, r5)
        L_0x00ea:
            r12.restore()
            if (r8 != 0) goto L_0x00f6
            X.6pL r1 = r11.A0F
            float r0 = r11.A02
            r1.A01(r12, r6, r0)
        L_0x00f6:
            return
        L_0x00f7:
            r0 = 0
            goto L_0x0079
        L_0x00f9:
            android.graphics.Picture r3 = r11.A02
            android.text.TextPaint r9 = r11.A0B
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69Y.A0M(android.graphics.Canvas):void");
    }

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        float f5;
        C18070vi.A0d(rectF, 0);
        float f6 = f3 - f;
        float f7 = f4 - f2;
        boolean z = this.A0H;
        if (z) {
            f5 = f6;
        } else {
            f5 = this.A07;
        }
        float f8 = 105.0f;
        if (z) {
            f8 = C108945cZ.A01(105.0f * f6, this.A07, f6 / 3.0f);
        } else {
            f = ((f6 / 2.0f) + f) - (f5 / 2.0f);
        }
        float f9 = f2 + ((f7 / 2.0f) - (f8 / 2.0f));
        RectF rectF2 = this.A06;
        rectF2.set(f, f9, f + f5, f8 + f9);
        float f10 = f6 * 2.0f;
        if (!z && f5 > f10) {
            A0H(f10 / (f5 + 75.0f));
        }
        rectF2.sort();
        this.A0F.A00(rectF.width() / 1020.0f);
    }

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        jSONObject.put("latitude", this.A00);
        jSONObject.put("longitude", this.A01);
        jSONObject.put("Location", this.A05);
        jSONObject.put("displayLocation", this.A04);
        jSONObject.put("theme", this.A06);
    }

    public boolean A0S() {
        return false;
    }

    public boolean CNP() {
        return false;
    }

    public static final void A00(AnonymousClass69Y r12) {
        float f;
        Picture picture = r12.A03;
        float f2 = 0.0f;
        if (r12.A02 == null || picture == null) {
            Log.w("Location/initThemes/Error when loading pin");
            f = 0.0f;
        } else {
            f = ((float) picture.getWidth()) + 26.0f;
        }
        if (!r12.A0H) {
            f2 = r12.A0B.measureText(r12.A04);
        }
        r12.A07 = Math.max(300.0f, f + 75.0f + f2);
        float f3 = C108965cb.A07().density * 8.0f;
        Paint paint = r12.A0D;
        paint.setColor(-1);
        float f4 = f3;
        r12.A09 = new C129106hG[]{new C129106hG(0.0f, 0.0f, r12.A07, 105.0f, f3, f4, paint)};
        Paint paint2 = r12.A0C;
        AnonymousClass3MX.A19(r12.A00, paint2, 2131103238);
        r12.A08 = new C129106hG[]{new C129106hG(0.0f, 0.0f, r12.A07, 105.0f, f3, f4, paint2)};
    }

    public void A0F() {
        RectF rectF = this.A06;
        AnonymousClass69a.A02(rectF, (rectF.height() > C1409773u.A07 ? 1 : (rectF.height() == C1409773u.A07 ? 0 : -1)));
    }

    public void A0G() {
        this.A0F.A00 = false;
    }

    public boolean A0V() {
        return this.A0E.A01;
    }

    public boolean A0Z() {
        C123946Wl.A00(this.A0E);
        return true;
    }

    public String A0D() {
        return this.A0G;
    }

    public void A0H(float f) {
        C1409773u.A0A(this, f);
    }

    public void A0N(Canvas canvas) {
        C1409773u.A08(canvas, this);
    }
}
