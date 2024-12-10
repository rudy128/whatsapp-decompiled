package com.whatsapp.status.playback.widget;

import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C109925eO;
import X.C1596985n;
import X.C17880vN;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.util.Set;

public final class StatusPlaybackProgressView extends C109925eO {
    public C1596985n A00;
    public float A01;
    public int A02;
    public int A03;
    public final Set A04;
    public final Paint A05;
    public final RectF A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.6GW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.6GU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.6GV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.6GU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.6GU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: X.6GU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: X.6GU} */
    /* JADX WARNING: type inference failed for: r4v7, types: [X.6GT] */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024b, code lost:
        if (r14.A02 == null) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c6, code lost:
        if (r1 >= 100.0f) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e7, code lost:
        if (r1 >= 100.0f) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0106, code lost:
        if (r1 >= 100.0f) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0131, code lost:
        if (r1 >= 100.0f) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0184, code lost:
        if (r1.A02 == null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0208, code lost:
        if (((long) X.AnonymousClass6Ga.A01(r4)) >= X.C17890vO.A03(X.C18020vd.A00(X.C18040vf.A02, r4.A0K, 7902))) goto L_0x020a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = 0
            r10 = r20
            X.C18070vi.A0d(r10, r0)
            r8 = r19
            super.onDraw(r10)
            int r0 = r8.A02
            if (r0 == 0) goto L_0x02ac
            int r0 = X.C108995ce.A03(r8)
            int r12 = X.C72473Md.A04(r8)
            float r7 = (float) r0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r7 * r5
            int r3 = r8.A02
            float r2 = (float) r3
            float r4 = r4 / r2
            int r0 = r12 * 2
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r17 = X.C108945cZ.A01(r4, r0, r1)
            int r0 = r3 + -1
            float r0 = (float) r0
            float r0 = r0 * r17
            float r7 = r7 - r0
            float r7 = r7 * r5
            float r7 = r7 / r2
            android.graphics.Paint r9 = r8.A05
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r9.setStrokeCap(r0)
            X.C108945cZ.A1L(r9)
            int r0 = r8.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r8.getPaddingTop()
            float r0 = (float) r0
            r10.translate(r1, r0)
            int r0 = r8.A02
            r18 = r0
            r11 = 0
            r6 = 0
            r5 = 0
        L_0x004f:
            r0 = r18
            if (r6 >= r0) goto L_0x02a5
            int r2 = r8.A03
            r16 = 1073741824(0x40000000, float:2.0)
            if (r6 != r2) goto L_0x027c
            X.85n r0 = r8.A00
            if (r0 == 0) goto L_0x006f
            X.7MF r0 = (X.AnonymousClass7MF) r0
            X.6Gp r0 = r0.A00
            X.70O r4 = r0.A0K()
            boolean r0 = r4 instanceof X.AnonymousClass6GX
            if (r0 == 0) goto L_0x00ad
            X.6GX r4 = (X.AnonymousClass6GX) r4
            float r1 = r4.A00
        L_0x006d:
            r8.A01 = r1
        L_0x006f:
            float r13 = r8.A01
            float r13 = r13 * r7
            r0 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 / r0
            java.util.Set r14 = r8.A04
            boolean r1 = X.C108965cb.A1b(r14, r6)
            r0 = 1728053247(0x66ffffff, float:6.0446287E23)
            if (r1 == 0) goto L_0x0083
            r0 = 1727676737(0x66fa4141, float:5.9089767E23)
        L_0x0083:
            r9.setColor(r0)
            android.graphics.RectF r4 = r8.A06
            float r0 = r5 + r7
            float r3 = (float) r12
            r4.set(r5, r11, r0, r3)
            float r2 = r3 / r16
            r10.drawRoundRect(r4, r2, r2, r9)
            boolean r1 = X.C108965cb.A1b(r14, r6)
            r0 = -1
            if (r1 == 0) goto L_0x009d
            r0 = -376511(0xfffffffffffa4141, float:NaN)
        L_0x009d:
            r9.setColor(r0)
            float r13 = r13 + r5
            r4.set(r5, r11, r13, r3)
            r10.drawRoundRect(r4, r2, r2, r9)
        L_0x00a7:
            float r0 = r7 + r17
            float r5 = r5 + r0
            int r6 = r6 + 1
            goto L_0x004f
        L_0x00ad:
            boolean r0 = r4 instanceof X.AnonymousClass6GV
            if (r0 == 0) goto L_0x00ce
            X.6GV r4 = (X.AnonymousClass6GV) r4
            X.6t9 r2 = r4.A06
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r1 = X.C108945cZ.A01(r13, r2, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006d
        L_0x00c8:
            X.6oj r0 = r4.A05
            r0.A00()
            goto L_0x006d
        L_0x00ce:
            boolean r0 = r4 instanceof X.AnonymousClass6GW
            if (r0 == 0) goto L_0x00ea
            X.6GW r4 = (X.AnonymousClass6GW) r4
            X.6t9 r2 = r4.A0F
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r1 = X.C108945cZ.A01(r13, r2, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006d
            goto L_0x00c8
        L_0x00ea:
            boolean r0 = r4 instanceof X.AnonymousClass6GT
            if (r0 == 0) goto L_0x0109
            X.6GT r4 = (X.AnonymousClass6GT) r4
            r0 = r4
            X.6GY r0 = (X.AnonymousClass6GY) r0
            X.6t9 r2 = r0.A0B
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r1 = X.C108945cZ.A01(r13, r2, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006d
            goto L_0x00c8
        L_0x0109:
            boolean r0 = r4 instanceof X.AnonymousClass6Ga
            if (r0 == 0) goto L_0x011c
            X.6Ga r4 = (X.AnonymousClass6Ga) r4
            boolean r0 = r4 instanceof X.AnonymousClass6GZ
            if (r0 == 0) goto L_0x01d3
            X.6GZ r4 = (X.AnonymousClass6GZ) r4
            X.70X r14 = r4.A04
            if (r14 != 0) goto L_0x0134
            r1 = 0
            goto L_0x006d
        L_0x011c:
            X.6GU r4 = (X.AnonymousClass6GU) r4
            X.6t9 r2 = r4.A01
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r1 = X.C108945cZ.A01(r13, r2, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006d
            goto L_0x00c8
        L_0x0134:
            int r1 = r4.A04
            int r0 = r4.A02
            r13 = 1120403456(0x42c80000, float:100.0)
            if (r1 < r0) goto L_0x0140
            r1 = 1120403456(0x42c80000, float:100.0)
            goto L_0x006d
        L_0x0140:
            boolean r0 = r14.A0a()
            if (r0 != 0) goto L_0x014e
            X.6oj r0 = r4.A05
            X.6Gp r0 = r0.A00
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x01ad
        L_0x014e:
            int r0 = r14.A05()
            long r2 = (long) r0
            com.whatsapp.mediaview.PhotoView r15 = r4.A0N
            int r1 = r15.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0186
            X.70X r0 = r4.A04
            if (r0 == 0) goto L_0x0186
            boolean r1 = r0.A0b()
            r0 = 1
            if (r1 != r0) goto L_0x0186
            X.70X r0 = r4.A04
            if (r0 == 0) goto L_0x0172
            android.view.View r0 = r0.A09()
            if (r0 == r15) goto L_0x0186
        L_0x0172:
            X.21X r0 = r4.A0O
            X.2rc r1 = r0.A02
            if (r1 == 0) goto L_0x01c1
            boolean r0 = r1.A0U
            if (r0 != 0) goto L_0x01c1
            X.2ra r1 = r1.A0F
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0186
            android.graphics.RectF r0 = r1.A02
            if (r0 == 0) goto L_0x01c1
        L_0x0186:
            int r15 = r4.A03
            r1 = 0
            if (r15 != 0) goto L_0x019b
            int r15 = r14.A06()
            r4.A03 = r15
            r0 = 1
            if (r15 <= r0) goto L_0x01ba
            long r0 = (long) r15
            int r0 = X.AnonymousClass6GZ.A00(r4, r0)
            r4.A02 = r0
        L_0x019b:
            long r0 = (long) r15
            long r2 = r2 / r0
            float r0 = (float) r2
            float r0 = r0 * r13
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x01a3:
            float r0 = X.AnonymousClass000.A04(r0)
            float r0 = java.lang.Math.min(r13, r0)
            r4.A00 = r0
        L_0x01ad:
            int r0 = r4.A04
            float r1 = (float) r0
            float r1 = r1 * r13
            float r0 = r4.A00
            float r1 = r1 + r0
            int r0 = r4.A02
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x006d
        L_0x01ba:
            r4.A03 = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x01a3
        L_0x01c1:
            X.AnonymousClass6Ga.A05(r4)
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x0186
            r1 = 8
            r15.setVisibility(r1)
            android.view.View r0 = r4.A0F
            r0.setVisibility(r1)
            goto L_0x0186
        L_0x01d3:
            X.70X r0 = r4.A04
            if (r0 == 0) goto L_0x020f
            r3 = 1
            r2 = 1120403456(0x42c80000, float:100.0)
            boolean r0 = r0.A0a()
            if (r0 == r3) goto L_0x0216
            X.6oj r0 = r4.A05
            X.6Gp r0 = r0.A00
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x0216
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0213
            r0 = 0
        L_0x01ed:
            r4.A00 = r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x020a
            int r0 = X.AnonymousClass6Ga.A01(r4)
            long r0 = (long) r0
            X.0ve r13 = r4.A0K
            r3 = 7902(0x1ede, float:1.1073E-41)
            X.0vf r2 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r2, r13, r3)
            long r13 = X.C17890vO.A03(r2)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x020f
        L_0x020a:
            X.6oj r0 = r4.A05
            r0.A00()
        L_0x020f:
            float r1 = r4.A00
            goto L_0x006d
        L_0x0213:
            r4.A00 = r2
            goto L_0x020a
        L_0x0216:
            int r0 = X.AnonymousClass6Ga.A01(r4)
            long r0 = (long) r0
            com.whatsapp.mediaview.PhotoView r15 = r4.A0N
            int r14 = r15.getVisibility()
            r13 = 8
            if (r14 == r13) goto L_0x024d
            X.70X r13 = r4.A04
            if (r13 == 0) goto L_0x024d
            boolean r13 = r13.A0b()
            if (r13 != r3) goto L_0x024d
            X.70X r13 = r4.A04
            if (r13 == 0) goto L_0x0239
            android.view.View r13 = r13.A09()
            if (r13 == r15) goto L_0x024d
        L_0x0239:
            X.21X r13 = r4.A0O
            X.2rc r14 = r13.A02
            if (r14 == 0) goto L_0x0267
            boolean r13 = r14.A0U
            if (r13 != 0) goto L_0x0267
            X.2ra r14 = r14.A0F
            boolean r13 = r14.A07
            if (r13 != 0) goto L_0x024d
            android.graphics.RectF r13 = r14.A02
            if (r13 == 0) goto L_0x0267
        L_0x024d:
            X.70X r13 = r4.A04
            if (r13 == 0) goto L_0x0265
            boolean r13 = r13.A0a()
            if (r13 != 0) goto L_0x0265
        L_0x0257:
            r4.A0B = r3
            float r13 = (float) r0
            float r13 = r13 * r2
            long r0 = r4.A0A()
            float r3 = (float) r0
            float r0 = X.C108945cZ.A01(r13, r3, r2)
            goto L_0x01ed
        L_0x0265:
            r3 = 0
            goto L_0x0257
        L_0x0267:
            X.AnonymousClass6Ga.A05(r4)
            X.AnonymousClass6Ga.A05(r4)
            boolean r13 = r4.A07
            if (r13 != 0) goto L_0x024d
            r14 = 8
            r15.setVisibility(r14)
            android.view.View r13 = r4.A0F
            r13.setVisibility(r14)
            goto L_0x024d
        L_0x027c:
            java.util.Set r0 = r8.A04
            boolean r1 = X.C108965cb.A1b(r0, r6)
            if (r6 >= r2) goto L_0x029c
            r0 = -1
            if (r1 == 0) goto L_0x028a
            r0 = -376511(0xfffffffffffa4141, float:NaN)
        L_0x028a:
            r9.setColor(r0)
            android.graphics.RectF r2 = r8.A06
            float r1 = r5 + r7
            float r0 = (float) r12
            r2.set(r5, r11, r1, r0)
            float r0 = r0 / r16
            r10.drawRoundRect(r2, r0, r0, r9)
            goto L_0x00a7
        L_0x029c:
            r0 = 1728053247(0x66ffffff, float:6.0446287E23)
            if (r1 == 0) goto L_0x028a
            r0 = 1727676737(0x66fa4141, float:5.9089767E23)
            goto L_0x028a
        L_0x02a5:
            X.85n r0 = r8.A00
            if (r0 == 0) goto L_0x02ac
            r8.invalidate()
        L_0x02ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.widget.StatusPlaybackProgressView.onDraw(android.graphics.Canvas):void");
    }

    public final void setCount(int i) {
        this.A02 = i;
        invalidate();
    }

    public final void setPosition(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            this.A01 = 0.0f;
            invalidate();
        }
    }

    public final void setProgressProvider(C1596985n r1) {
        this.A00 = r1;
        invalidate();
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A04 = C17880vN.A14();
        this.A06 = AnonymousClass3MW.A08();
        this.A05 = AnonymousClass3MZ.A0A();
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A04 = C17880vN.A14();
        this.A06 = AnonymousClass3MW.A08();
        this.A05 = AnonymousClass3MZ.A0A();
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = C17880vN.A14();
        this.A06 = AnonymousClass3MW.A08();
        this.A05 = AnonymousClass3MZ.A0A();
    }

    public StatusPlaybackProgressView(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A04 = C17880vN.A14();
        this.A06 = AnonymousClass3MW.A08();
        this.A05 = AnonymousClass3MZ.A0A();
    }
}
