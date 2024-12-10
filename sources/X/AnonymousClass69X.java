package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import java.util.Calendar;
import org.json.JSONObject;

/* renamed from: X.69X  reason: invalid class name */
public final class AnonymousClass69X extends C24023Bu9 {
    public int A00;
    public int A01;
    public Picture A02;
    public Picture A03;
    public C129106hG A04;
    public C129106hG A05;
    public C129106hG A06;
    public C129106hG A07;
    public boolean A08;
    public final Paint A09 = C108945cZ.A0K(1);
    public final Paint A0A = C108945cZ.A0K(1);
    public final C18000vb A0B;
    public final RectF A0C = AnonymousClass3MW.A08();
    public final C133536ov A0D = new C1196369f(this, 0);
    public final C133696pL A0E;
    public final String A0F;
    public final boolean A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass69X(Context context, C18000vb r10, boolean z) {
        super(context);
        C18070vi.A0e(context, 1, r10);
        this.A0B = r10;
        this.A0G = z;
        Calendar instance = Calendar.getInstance(this.A0B.A0N());
        this.A00 = instance.get(10);
        this.A01 = instance.get(12);
        this.A02 = A0b("clockDarkTheme.svg");
        Paint paint = this.A09;
        paint.setColor(Color.parseColor("#ECB439"));
        this.A04 = new C129106hG(190.0f, 249.0f, 398.0f, 263.0f, 7.0f, 7.0f, paint);
        this.A05 = new C129106hG(185.0f, 251.0f, 479.0f, 261.0f, 5.0f, 5.0f, paint);
        this.A03 = A0b("clockLightTheme.svg");
        Paint paint2 = this.A0A;
        paint2.setColor(Color.parseColor("#DC5842"));
        this.A06 = new C129106hG(201.0f, 248.0f, 370.0f, 264.0f, 8.0f, 8.0f, paint2);
        this.A07 = new C129106hG(185.0f, 251.0f, 479.0f, 262.0f, 5.5f, 5.5f, paint2);
        this.A0E = new C133696pL(context, r10);
        this.A0F = "analog-clock";
    }

    public String A0E(Context context) {
        C18070vi.A0d(context, 0);
        return C18070vi.A0F(context, 2131889551);
    }

    public void A0I(float f) {
        A0L(2, f);
        this.A0E.A00(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(android.graphics.Canvas r15) {
        /*
            r14 = this;
            r0 = 0
            X.C18070vi.A0d(r15, r0)
            boolean r9 = r14.A08
            X.6ov r2 = r14.A0D
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0015
            float r1 = r2.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            r9 = r9 ^ 1
        L_0x0015:
            if (r9 == 0) goto L_0x00f0
            android.graphics.Picture r7 = r14.A02
        L_0x0019:
            if (r7 == 0) goto L_0x0153
            boolean r6 = r14.A0G
            r4 = 1059816735(0x3f2b851f, float:0.67)
            if (r6 != 0) goto L_0x0032
            r15.save()
            android.graphics.RectF r0 = r14.A06
            float r1 = r0.centerX()
            float r0 = r0.centerY()
            r15.scale(r4, r4, r1, r0)
        L_0x0032:
            float r2 = r2.A00()
            android.graphics.RectF r5 = r14.A06
            r5.sort()
            r15.save()
            float r0 = r14.A02
            X.C108985cd.A0w(r15, r5, r0)
            float r3 = r5.width()
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r3 = r3 / r0
            float r1 = r5.height()
            int r0 = r7.getWidth()
            float r0 = (float) r0
            X.C1409773u.A07(r15, r5, r1, r0, r3)
            int r0 = r7.getWidth()
            r13 = 2
            int r0 = r0 / r13
            float r1 = (float) r0
            int r0 = r7.getHeight()
            int r0 = r0 / r13
            float r0 = (float) r0
            r15.scale(r2, r2, r1, r0)
            r15.save()
            r15.drawPicture(r7)
            r15.restore()
            int r0 = r7.getWidth()
            int r0 = r0 / r13
            float r3 = (float) r0
            int r0 = r7.getHeight()
            int r0 = r0 / r13
            float r2 = (float) r0
            if (r9 == 0) goto L_0x00ed
            android.graphics.Paint r1 = r14.A09
        L_0x0082:
            r0 = 1104150528(0x41d00000, float:26.0)
            r15.drawCircle(r3, r2, r0, r1)
            r15.save()
            if (r9 == 0) goto L_0x0097
            X.6hG r10 = r14.A04
            if (r10 != 0) goto L_0x009e
            java.lang.String r0 = "darkThemeHour"
        L_0x0092:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0097:
            X.6hG r10 = r14.A06
            if (r10 != 0) goto L_0x009e
            java.lang.String r0 = "lightThemeHour"
            goto L_0x0092
        L_0x009e:
            r2 = 4645040803167600640(0x4076800000000000, double:360.0)
            int r0 = r14.A00
            int r0 = r0 + 9
            double r0 = (double) r0
            r11 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r0 = r0 % r11
            double r0 = r0 / r11
            double r2 = r2 * r0
            int r0 = r14.A01
            int r0 = r0 * 30
            double r0 = (double) r0
            r11 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r0 = r0 / r11
            double r2 = r2 + r0
            android.graphics.RectF r8 = r14.A0C
            android.graphics.RectF r0 = r10.A03
            r8.set(r0)
            int r0 = (int) r2
            float r2 = (float) r0
            int r0 = r7.getWidth()
            int r0 = r0 / r13
            float r1 = (float) r0
            int r0 = r7.getHeight()
            int r0 = r0 / r13
            float r0 = (float) r0
            r15.rotate(r2, r1, r0)
            float r2 = r10.A00
            float r1 = r10.A01
            android.graphics.Paint r0 = r10.A02
            r15.drawRoundRect(r8, r2, r1, r0)
            r15.restore()
            r15.save()
            if (r9 == 0) goto L_0x00e6
            X.6hG r9 = r14.A05
            if (r9 != 0) goto L_0x00f4
            java.lang.String r0 = "darkThemeMinute"
            goto L_0x0092
        L_0x00e6:
            X.6hG r9 = r14.A07
            if (r9 != 0) goto L_0x00f4
            java.lang.String r0 = "lightThemeMinute"
            goto L_0x0092
        L_0x00ed:
            android.graphics.Paint r1 = r14.A0A
            goto L_0x0082
        L_0x00f0:
            android.graphics.Picture r7 = r14.A03
            goto L_0x0019
        L_0x00f4:
            r2 = 4645040803167600640(0x4076800000000000, double:360.0)
            int r0 = r14.A01
            int r0 = r0 + 45
            double r0 = (double) r0
            double r0 = r0 % r11
            double r0 = r0 / r11
            double r2 = r2 * r0
            android.graphics.RectF r0 = r9.A03
            r8.set(r0)
            int r0 = (int) r2
            float r2 = (float) r0
            int r0 = r7.getWidth()
            int r0 = r0 / r13
            float r1 = (float) r0
            int r0 = r7.getHeight()
            int r0 = r0 / r13
            float r0 = (float) r0
            r15.rotate(r2, r1, r0)
            float r2 = r9.A00
            float r1 = r9.A01
            android.graphics.Paint r0 = r9.A02
            r15.drawRoundRect(r8, r2, r1, r0)
            r15.restore()
            r15.restore()
            if (r6 != 0) goto L_0x0153
            r15.restore()
            float r2 = r5.width()
            float r2 = r2 * r4
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r4 = r5.centerX()
            float r4 = r4 - r2
            float r3 = r5.centerY()
            float r3 = r3 - r2
            float r1 = r5.centerX()
            float r1 = r1 + r2
            float r0 = r5.centerY()
            float r0 = r0 + r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r4, r3, r1, r0)
            X.6pL r1 = r14.A0E
            float r0 = r14.A02
            r1.A01(r15, r2, r0)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69X.A0M(android.graphics.Canvas):void");
    }

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        C18070vi.A0d(rectF, 0);
        super.A0O(rectF, f, f2, f3, f4);
        this.A0E.A00(rectF.width() / 1020.0f);
    }

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        jSONObject.put("hour", this.A00);
        jSONObject.put("minute", this.A01);
        jSONObject.put("theme", this.A08);
    }

    public boolean A0S() {
        return false;
    }

    public boolean A0U() {
        return true;
    }

    public void A0G() {
        this.A0E.A00 = false;
    }

    public boolean A0V() {
        return this.A0D.A01;
    }

    public boolean A0Y() {
        int i = this.A01;
        int i2 = this.A00;
        Calendar instance = Calendar.getInstance(this.A0B.A0N());
        this.A00 = instance.get(10);
        int i3 = instance.get(12);
        this.A01 = i3;
        if (i == i3 && i2 == this.A00) {
            return false;
        }
        return true;
    }

    public boolean A0Z() {
        C123946Wl.A00(this.A0D);
        return true;
    }

    public float A0a() {
        Picture picture = this.A02;
        if ((picture == null && (picture = this.A03) == null) || picture.getHeight() == 0) {
            return 0.0f;
        }
        return ((float) picture.getWidth()) / ((float) picture.getHeight());
    }

    public String A0D() {
        return this.A0F;
    }

    public void A0N(Canvas canvas) {
        C1409773u.A08(canvas, this);
    }
}
