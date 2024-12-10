package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.657  reason: invalid class name */
public class AnonymousClass657 extends AnonymousClass65J implements AnonymousClass854 {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public TextPaint A04;
    public C18000vb A05;
    public C88104Yi A06;
    public boolean A07;
    public Paint A08;
    public Drawable A09;
    public Drawable A0A;
    public Drawable A0B;
    public Drawable A0C;

    private TextPaint A03() {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AnonymousClass3MW.A00(AnonymousClass000.A0Y(this), 2131167687));
        return textPaint;
    }

    private void A04(Canvas canvas, AnonymousClass7H2 r9, float f) {
        String str;
        File file = r9.A02;
        if (file != null) {
            str = file.getName();
        } else {
            str = null;
        }
        if (r9.getType() == 4 && !TextUtils.isEmpty(str)) {
            if (this.A04 == null) {
                this.A04 = A03();
            }
            Drawable drawable = this.A09;
            if (drawable == null) {
                drawable = AnonymousClass3MX.A06(getContext(), 2131231530);
                this.A09 = drawable;
            }
            drawable.setBounds(0, getHeight() - ((int) (this.A04.getTextSize() * 2.0f)), getWidth(), getHeight());
            this.A09.draw(canvas);
            TextPaint textPaint = this.A04;
            canvas.drawText(TextUtils.ellipsize(str, textPaint, f - ((textPaint.getTextSize() / 3.0f) * 2.0f), TextUtils.TruncateAt.END).toString(), this.A04.getTextSize() / 3.0f, C108945cZ.A04(this) - (this.A04.getTextSize() / 3.0f), this.A04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r2 == 6) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r2 != 1) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.graphics.Canvas r13) {
        /*
            r12 = this;
            X.8B2 r0 = r12.A08
            if (r0 == 0) goto L_0x022f
            android.graphics.drawable.Drawable r0 = r12.getDrawable()
            if (r0 == 0) goto L_0x022f
            int r0 = r12.A00
            r4 = 3
            r6 = 2
            if (r0 == r4) goto L_0x00da
            X.8B2 r3 = r12.A08
            int r2 = r3.getType()
            r8 = 1
            r5 = 0
            r7 = 1
            if (r2 == r6) goto L_0x001f
            r7 = 0
            r1 = 1
            if (r2 == r8) goto L_0x026e
        L_0x001f:
            r1 = 0
            if (r2 == r4) goto L_0x026e
            r0 = 6
            if (r2 != r0) goto L_0x026e
        L_0x0025:
            r10 = 0
            if (r7 == 0) goto L_0x0268
            r2 = 0
        L_0x002b:
            if (r1 != 0) goto L_0x0255
            if (r7 != 0) goto L_0x0242
            if (r8 == 0) goto L_0x00da
            android.graphics.drawable.Drawable r8 = r12.A0B
            if (r8 != 0) goto L_0x0044
            android.content.Context r1 = r12.getContext()
            r0 = 2131232595(0x7f080753, float:1.8081304E38)
            android.graphics.drawable.Drawable r8 = X.C24261Jm.A00(r1, r0)
            r12.A0B = r8
        L_0x0042:
            if (r8 == 0) goto L_0x00da
        L_0x0044:
            android.graphics.drawable.Drawable r9 = r12.A09
            if (r9 != 0) goto L_0x0055
            android.content.Context r1 = r12.getContext()
            r0 = 2131231530(0x7f08032a, float:1.8079144E38)
            android.graphics.drawable.Drawable r9 = X.C24261Jm.A00(r1, r0)
            r12.A09 = r9
        L_0x0055:
            int r7 = r12.getHeight()
            int r0 = r8.getIntrinsicHeight()
            int r0 = r0 * 2
            int r7 = r7 - r0
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            r9.setBounds(r5, r7, r1, r0)
            android.graphics.drawable.Drawable r0 = r12.A09
            r0.draw(r13)
            int r0 = r8.getIntrinsicHeight()
            int r9 = r0 / 4
            X.C110785h5.A02(r8, r12, r9)
            r8.draw(r13)
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00da
            android.text.TextPaint r0 = r12.A04
            if (r0 != 0) goto L_0x008a
            android.text.TextPaint r0 = r12.A03()
            r12.A04 = r0
        L_0x008a:
            X.0vb r1 = r12.A05
            r0 = 0
            java.lang.String r7 = X.C64052u8.A0D(r1, r0, r2)
            android.text.TextPaint r10 = r12.A04
            boolean r5 = X.C18070vi.A15(r7, r10)
            int r3 = r7.length()
            java.util.Map r2 = X.C110785h5.A01(r12, r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x023c
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0271
            android.graphics.Rect r0 = (android.graphics.Rect) r0
        L_0x00b1:
            int r1 = r0.bottom
            int r0 = r0.top
            int r1 = r1 - r0
            float r5 = (float) r1
            r12.getWidth()
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r0
            int r0 = r8.getIntrinsicWidth()
            int r1 = r9 * 2
            int r0 = r0 + r1
            float r3 = (float) r0
            float r2 = X.C108945cZ.A04(r12)
            int r0 = r8.getIntrinsicHeight()
            int r0 = r0 + r1
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r0
            float r1 = r1 - r5
            float r1 = r1 / r0
            float r2 = r2 - r1
            android.text.TextPaint r0 = r12.A04
            r13.drawText(r7, r3, r2, r0)
        L_0x00da:
            X.8B2 r5 = r12.A08
            boolean r0 = r5 instanceof X.AnonymousClass7H2
            if (r0 == 0) goto L_0x022f
            X.7H2 r5 = (X.AnonymousClass7H2) r5
            int r0 = r12.A00
            if (r0 == r6) goto L_0x0173
            X.21V r0 = r5.A01
            if (r0 == 0) goto L_0x0173
            X.0vb r0 = r12.A05
            if (r0 == 0) goto L_0x0173
            android.text.TextPaint r0 = r12.A04
            if (r0 != 0) goto L_0x00f8
            android.text.TextPaint r0 = r12.A03()
            r12.A04 = r0
        L_0x00f8:
            int r0 = r5.getType()
            r9 = 1073741824(0x40000000, float:2.0)
            if (r0 == r4) goto L_0x0126
            android.graphics.drawable.Drawable r3 = r12.A03
            if (r3 != 0) goto L_0x0111
            android.content.Context r1 = r12.getContext()
            r0 = 2131231531(0x7f08032b, float:1.8079146E38)
            android.graphics.drawable.Drawable r3 = X.C24261Jm.A00(r1, r0)
            r12.A03 = r3
        L_0x0111:
            int r2 = r12.getWidth()
            android.text.TextPaint r0 = r12.A04
            float r0 = r0.getTextSize()
            float r0 = r0 * r9
            int r1 = (int) r0
            r0 = 0
            r3.setBounds(r0, r0, r2, r1)
            android.graphics.drawable.Drawable r0 = r12.A03
            r0.draw(r13)
        L_0x0126:
            X.0vb r3 = r12.A05
            X.21V r2 = r5.A01
            long r0 = r2.A01
            java.lang.String r8 = X.C88584aA.A02(r3, r0)
            android.text.TextPaint r0 = r12.A04
            float r3 = r0.getTextSize()
            r7 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r7
            android.text.TextPaint r0 = r12.A04
            float r0 = r0.getTextSize()
            r6 = 1068149419(0x3faaaaab, float:1.3333334)
            float r0 = r0 * r6
            int r0 = (int) r0
            float r1 = (float) r0
            android.text.TextPaint r0 = r12.A04
            r13.drawText(r8, r3, r1, r0)
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0173
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "fw score: "
            r1.append(r0)
            int r0 = r2.A06
            java.lang.String r3 = X.C17880vN.A0t(r1, r0)
            android.text.TextPaint r0 = r12.A04
            float r2 = r0.getTextSize()
            float r2 = r2 / r7
            android.text.TextPaint r0 = r12.A04
            float r0 = r0.getTextSize()
            float r0 = r0 * r6
            float r0 = r0 * r9
            int r0 = (int) r0
            float r1 = (float) r0
            android.text.TextPaint r0 = r12.A04
            r13.drawText(r3, r2, r1, r0)
        L_0x0173:
            int r0 = r12.A00
            if (r0 == r4) goto L_0x022f
            X.21V r4 = r5.A01
            if (r4 == 0) goto L_0x0234
            int r1 = r4.A0C()
            r0 = 1
            if (r0 != r1) goto L_0x0230
            android.graphics.drawable.Drawable r0 = r12.A01
            if (r0 != 0) goto L_0x0193
            android.content.Context r1 = r12.getContext()
            r0 = 2131232633(0x7f080779, float:1.808138E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r1, r0)
            r12.A01 = r0
        L_0x0193:
            int r6 = r12.getWidth()
            android.graphics.drawable.Drawable r0 = r12.A01
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r3 = r12.getHeight()
            android.graphics.drawable.Drawable r0 = r12.A01
            int r0 = r0.getIntrinsicHeight()
            int r3 = r3 - r0
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            android.graphics.drawable.Drawable r2 = r12.A01
            r2.setBounds(r6, r3, r1, r0)
            int r1 = r12.getWidth()
            int r0 = r2.getIntrinsicWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            r12.A04(r13, r5, r0)
            r2.draw(r13)
            r2 = 1
        L_0x01c7:
            boolean r0 = r4.A0q
            if (r0 == 0) goto L_0x0232
            android.graphics.drawable.Drawable r0 = r12.A02
            if (r0 != 0) goto L_0x01dc
            android.content.Context r1 = r12.getContext()
            r0 = 2131232638(0x7f08077e, float:1.808139E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r1, r0)
            r12.A02 = r0
        L_0x01dc:
            int r6 = r12.getWidth()
            android.graphics.drawable.Drawable r0 = r12.A02
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r4 = r12.getHeight()
            android.graphics.drawable.Drawable r0 = r12.A02
            int r0 = r0.getIntrinsicHeight()
            int r4 = r4 - r0
            int r3 = r12.getWidth()
            int r1 = r12.getHeight()
            if (r2 == 0) goto L_0x021a
            android.graphics.drawable.Drawable r0 = r12.A01
            if (r0 == 0) goto L_0x021a
            android.graphics.Rect r1 = r0.getBounds()
            int r6 = r1.left
            android.graphics.drawable.Drawable r0 = r12.A02
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r4 = r1.bottom
            android.graphics.drawable.Drawable r0 = r12.A02
            int r0 = r0.getIntrinsicHeight()
            int r4 = r4 - r0
            int r3 = r1.left
            int r1 = r1.bottom
        L_0x021a:
            android.graphics.drawable.Drawable r2 = r12.A02
            r2.setBounds(r6, r4, r3, r1)
            int r1 = r12.getWidth()
            int r0 = r2.getIntrinsicWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            r12.A04(r13, r5, r0)
            r2.draw(r13)
        L_0x022f:
            return
        L_0x0230:
            r2 = 0
            goto L_0x01c7
        L_0x0232:
            if (r2 != 0) goto L_0x022f
        L_0x0234:
            float r0 = X.C108945cZ.A03(r12)
            r12.A04(r13, r5, r0)
            return
        L_0x023c:
            android.graphics.Rect r0 = X.C110785h5.A00(r10, r1, r2, r3, r5)
            goto L_0x00b1
        L_0x0242:
            android.graphics.drawable.Drawable r8 = r12.A0A
            if (r8 != 0) goto L_0x0044
            android.content.Context r1 = r12.getContext()
            r0 = 2131232594(0x7f080752, float:1.8081302E38)
            android.graphics.drawable.Drawable r8 = X.C24261Jm.A00(r1, r0)
            r12.A0A = r8
            goto L_0x0042
        L_0x0255:
            android.graphics.drawable.Drawable r8 = r12.A0C
            if (r8 != 0) goto L_0x0044
            android.content.Context r1 = r12.getContext()
            r0 = 2131232596(0x7f080754, float:1.8081306E38)
            android.graphics.drawable.Drawable r8 = X.C24261Jm.A00(r1, r0)
            r12.A0C = r8
            goto L_0x0042
        L_0x0268:
            long r2 = r3.BQv()
            goto L_0x002b
        L_0x026e:
            r8 = 0
            goto L_0x0025
        L_0x0271:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass657.A08(android.graphics.Canvas):void");
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass8B2 r0 = this.A08;
        Canvas canvas2 = canvas;
        if (r0 != null && r0.getType() == 3) {
            if (this.A08 == null) {
                Paint A0A2 = AnonymousClass3MZ.A0A();
                A0A2.setColor(-16777216);
                A0A2.setAlpha(51);
                C108945cZ.A1L(A0A2);
                this.A08 = A0A2;
            }
            canvas2.drawRect(0.0f, 0.0f, C108945cZ.A03(this), C108945cZ.A04(this), this.A08);
        }
        super.onDraw(canvas);
    }

    public void setMediaItem(AnonymousClass8B2 r3) {
        super.setMediaItem(r3);
        AnonymousClass8B2 r1 = this.A08;
        if (r1 instanceof AnonymousClass7H2) {
            AnonymousClass1Xr.A04(this, AnonymousClass4W0.A01(((AnonymousClass7H2) r1).A01));
        }
    }

    public void setDetailsLevel(int i) {
        this.A00 = i;
    }

    public void setShowForwardScore(boolean z) {
        this.A07 = z;
    }
}
