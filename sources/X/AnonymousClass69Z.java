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

/* renamed from: X.69Z  reason: invalid class name */
public final class AnonymousClass69Z extends C24023Bu9 implements AnonymousClass87T {
    public float A00;
    public Picture A01;
    public String A02 = "";
    public String A03;
    public boolean A04;
    public C129106hG[] A05;
    public final TextPaint A06 = new TextPaint(1);
    public final boolean A07;
    public final Paint A08 = C108945cZ.A0K(1);
    public final C133696pL A09;
    public final String A0A;

    public AnonymousClass69Z(Context context, C18000vb r5, String str, boolean z) {
        super(context);
        this.A07 = z;
        this.A03 = str;
        Picture A0b = A0b("add_a_photo.svg");
        if (A0b != null) {
            this.A01 = A0b;
            C108995ce.A0o(this.A06, C108965cb.A07().density * 14.0f);
            A00(this);
            A01(this);
            this.A09 = new C133696pL(context, r5);
            this.A0A = "add-yours";
            return;
        }
        throw C17880vN.A0g();
    }

    public String A0E(Context context) {
        C18070vi.A0d(context, 0);
        return C18070vi.A0F(context, 2131886527);
    }

    public void A0I(float f) {
        A0L(2, f);
        this.A09.A00(f);
    }

    public void A0K(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = 0
            r7 = r18
            X.C18070vi.A0d(r7, r0)
            r7.save()
            r6 = r17
            android.graphics.RectF r5 = r6.A06
            r5.sort()
            float r0 = r6.A02
            X.C108985cd.A0w(r7, r5, r0)
            float r1 = r5.width()
            float r0 = r6.A00
            float r1 = r1 / r0
            float r0 = r5.height()
            boolean r4 = r6.A07
            r2 = 1128792064(0x43480000, float:200.0)
            if (r4 == 0) goto L_0x0028
            r2 = 1121058816(0x42d20000, float:105.0)
        L_0x0028:
            X.C1409773u.A07(r7, r5, r0, r2, r1)
            float r1 = r6.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.scale(r0, r0, r1, r2)
            X.6hG[] r12 = r6.A05
            if (r12 != 0) goto L_0x0041
            java.lang.String r0 = "lightThemeRects"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0041:
            int r10 = r12.length
            r11 = 0
            r9 = 0
        L_0x0044:
            if (r9 >= r10) goto L_0x0056
            r0 = r12[r9]
            android.graphics.RectF r8 = r0.A03
            float r3 = r0.A00
            float r1 = r0.A01
            android.graphics.Paint r0 = r0.A02
            r7.drawRoundRect(r8, r3, r1, r0)
            int r9 = r9 + 1
            goto L_0x0044
        L_0x0056:
            android.graphics.Picture r3 = r6.A01
            android.text.TextPaint r9 = r6.A06
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setColor(r0)
            if (r3 == 0) goto L_0x017c
            int r0 = r3.getWidth()
        L_0x0065:
            float r10 = (float) r0
            if (r3 == 0) goto L_0x006c
            int r11 = r3.getHeight()
        L_0x006c:
            float r8 = (float) r11
            if (r4 == 0) goto L_0x0178
            r0 = 1104150528(0x41d00000, float:26.0)
            float r10 = r10 + r0
            float r0 = r6.A00
            float r10 = r10 + r0
        L_0x0075:
            r0 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r0
            if (r4 == 0) goto L_0x0168
            float r1 = r9.descent()
            float r0 = r9.ascent()
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r1 = r2 - r1
        L_0x0088:
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r7.scale(r0, r0, r10, r1)
            java.lang.String r0 = r6.A02
            r7.drawText(r0, r10, r1, r9)
            r9 = 1067450368(0x3fa00000, float:1.25)
            r7.scale(r9, r9, r10, r1)
            if (r4 == 0) goto L_0x00bf
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r9
            float r8 = r8 / r0
            float r2 = r2 - r8
            if (r3 == 0) goto L_0x00b2
            r0 = 1108738048(0x42160000, float:37.5)
            r7.save()
            r7.translate(r0, r2)
        L_0x00a9:
            r7.scale(r9, r9)
            r7.drawPicture(r3)
            r7.restore()
        L_0x00b2:
            r7.restore()
            if (r4 != 0) goto L_0x00be
            X.6pL r1 = r6.A09
            float r0 = r6.A02
            r1.A01(r7, r5, r0)
        L_0x00be:
            return
        L_0x00bf:
            android.graphics.Paint r11 = X.AnonymousClass3MZ.A0A()
            android.util.DisplayMetrics r0 = X.C108965cb.A07()
            float r1 = r0.density
            r0 = 1094713344(0x41400000, float:12.0)
            float r1 = r1 * r0
            r11.setTextSize(r1)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r11.setTextAlign(r0)
            android.content.Context r1 = r6.A00
            android.graphics.Typeface r0 = X.C43421zm.A03()
            r11.setTypeface(r0)
            r0 = 2131103280(0x7f060e30, float:1.7819022E38)
            X.AnonymousClass3MX.A19(r1, r11, r0)
            float r10 = r6.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r0
            r8 = 1128792064(0x43480000, float:200.0)
            float r0 = r11.descent()
            float r8 = r8 - r0
            android.util.DisplayMetrics r0 = X.C108965cb.A07()
            float r2 = r0.density
            r0 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r0
            float r8 = r8 - r2
            r0 = 2131886528(0x7f1201c0, float:1.9407637E38)
            java.lang.String r16 = X.C18070vi.A0F(r1, r0)
            r0 = r16
            r7.drawText(r0, r10, r8, r11)
            float r15 = r11.ascent()
            float r15 = r15 + r8
            android.util.DisplayMetrics r0 = X.C108965cb.A07()
            float r2 = r0.density
            r0 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r0
            float r15 = r15 - r2
            r0 = 1
            android.graphics.Paint r14 = X.C108945cZ.A0K(r0)
            r0 = 2131103224(0x7f060df8, float:1.7818908E38)
            X.AnonymousClass3MX.A19(r1, r14, r0)
            android.util.DisplayMetrics r0 = X.C108965cb.A07()
            float r13 = r0.density
            r0 = 1090519040(0x41000000, float:8.0)
            float r13 = r13 * r0
            float r2 = r5.width()
            android.util.DisplayMetrics r0 = X.C108965cb.A07()
            float r1 = r0.density
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            float r1 = r1 + r15
            r0 = 0
            android.graphics.RectF r12 = new android.graphics.RectF
            r12.<init>(r0, r15, r2, r1)
            r7.drawRoundRect(r12, r13, r13, r14)
            r0 = r16
            float r1 = r11.measureText(r0)
            if (r3 == 0) goto L_0x00b2
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r10 = r10 - r1
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r10 = r10 - r0
            android.util.DisplayMetrics r0 = X.C108965cb.A07()
            float r1 = r0.density
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r0
            float r10 = r10 - r1
            float r0 = r11.ascent()
            float r8 = r8 + r0
            r7.save()
            r7.translate(r10, r8)
            goto L_0x00a9
        L_0x0168:
            android.util.DisplayMetrics r0 = X.C108965cb.A07()
            float r1 = r0.density
            r0 = 1096810496(0x41600000, float:14.0)
            float r1 = r1 * r0
            float r0 = r9.descent()
            float r1 = r1 + r0
            goto L_0x0088
        L_0x0178:
            float r10 = r6.A00
            goto L_0x0075
        L_0x017c:
            r0 = 0
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69Z.A0M(android.graphics.Canvas):void");
    }

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        C18070vi.A0d(rectF, 0);
        float f7 = f3 - f;
        float f8 = f4 - f2;
        boolean z = this.A07;
        if (z) {
            f5 = f7;
            f6 = C108945cZ.A01(105.0f * f7, this.A00, f7 / 3.0f);
        } else {
            f5 = this.A00;
            f6 = 200.0f;
            f = ((f7 / 2.0f) + f) - (f5 / 2.0f);
        }
        float f9 = f2 + ((f8 / 2.0f) - (f6 / 2.0f));
        RectF rectF2 = this.A06;
        rectF2.set(f, f9, f + f5, f6 + f9);
        float f10 = f7 * 2.0f;
        if (!z && f5 > f10) {
            A0H(f10 / (f5 + 75.0f));
        }
        rectF2.sort();
        this.A09.A00(rectF.width() / 1020.0f);
    }

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        jSONObject.put("promptText", this.A03);
        jSONObject.put("displayPromptText", this.A02);
        jSONObject.put("theme", this.A04);
    }

    public boolean A0S() {
        return false;
    }

    public boolean CNP() {
        return false;
    }

    public static final void A00(AnonymousClass69Z r4) {
        int i;
        Picture picture = r4.A01;
        if (picture != null) {
            i = picture.getWidth();
        } else {
            i = 0;
        }
        r4.A02 = TextUtils.ellipsize(r4.A03, r4.A06, ((1000.0f - ((float) i)) - 75.0f) - 26.0f, TextUtils.TruncateAt.END).toString();
    }

    public static final void A01(AnonymousClass69Z r10) {
        float width;
        Picture picture = r10.A01;
        if (picture == null) {
            Log.w("Location/initThemes/Error when loading pin");
            width = 0.0f;
        } else {
            width = ((float) picture.getWidth()) + 26.0f;
        }
        r10.A00 = Math.max(300.0f, width + 75.0f + r10.A06.measureText(r10.A02));
        float f = C108965cb.A07().density * 8.0f;
        Paint paint = r10.A08;
        paint.setColor(-1);
        C129106hG[] r1 = new C129106hG[1];
        float f2 = r10.A00;
        float f3 = 200.0f;
        if (r10.A07) {
            f3 = 105.0f;
        }
        r1[0] = new C129106hG(0.0f, 0.0f, f2, f3, f, f, paint);
        r10.A05 = r1;
    }

    public C129116hH A0C() {
        RectF rectF = this.A06;
        float f = this.A02;
        int color = this.A05.getColor();
        return new AnonymousClass69O(rectF, this.A03, f, A0B(), color);
    }

    public void A0F() {
        RectF rectF = this.A06;
        AnonymousClass69a.A02(rectF, (rectF.height() > C1409773u.A07 ? 1 : (rectF.height() == C1409773u.A07 ? 0 : -1)));
    }

    public void A0G() {
        this.A09.A00 = false;
    }

    public String A0D() {
        return this.A0A;
    }

    public void A0P(C129116hH r2) {
        super.A0P(r2);
        this.A03 = ((AnonymousClass69O) r2).A00;
    }

    public void A0H(float f) {
        C1409773u.A0A(this, f);
    }

    public void A0N(Canvas canvas) {
        C1409773u.A08(canvas, this);
    }
}
