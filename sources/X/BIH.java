package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;

public final class BIH extends FrameLayout {
    public int A00;
    public FrameLayout A01;
    public BHQ A02;
    public BF1 A03;
    public BF1 A04;
    public C22658BIj A05;
    public C0B A06;
    public boolean A07;
    public float[] A08;
    public int A09;
    public int A0A;
    public int A0B;
    public BF1 A0C;
    public final float A0D = 0.08f;
    public final BI8 A0E;
    public final D3N A0F;
    public final D3N A0G;
    public final C08 A0H;
    public final D8F A0I;
    public final E6Q A0J;
    public final boolean A0K;
    public final boolean A0L = true;
    public final float[] A0M;

    public static final void A01(BIH bih) {
        bih.A09 = 0;
        bih.A0B = 0;
        bih.A0A = 0;
        bih.A07 = false;
        bih.A0C = null;
        bih.A00 = 0;
        float[] fArr = new float[8];
        fArr[0] = 0.0f;
        C72483Me.A19(fArr, 0.0f);
        bih.A08 = fArr;
    }

    public void dispatchDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.dispatchDraw(canvas);
        if (this.A06 != C0B.FULL_SCREEN && this.A0C != null && this.A07) {
            int A032 = (int) (C108945cZ.A03(this) / 2.0f);
            BF1 bf1 = this.A0C;
            if (bf1 != null) {
                int i = this.A09;
                bf1.setBounds(A032 - i, this.A0B, A032 + i, this.A0A);
            }
            BF1 bf12 = this.A0C;
            if (bf12 != null) {
                bf12.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cb, code lost:
        if (r1 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BIH(android.content.Context r23, X.BI8 r24, X.D3N r25, X.D3N r26, X.D8F r27, X.E6Q r28, float[] r29) {
        /*
            r22 = this;
            r4 = r22
            r15 = r23
            r4.<init>(r15)
            r6 = r28
            r4.A0J = r6
            r5 = r24
            r4.A0E = r5
            r7 = r27
            r4.A0I = r7
            r0 = r29
            r4.A0M = r0
            r0 = 1034147594(0x3da3d70a, float:0.08)
            r4.A0D = r0
            r0 = 1
            r4.A0L = r0
            r1 = r25
            r4.A0G = r1
            r1 = r26
            r4.A0F = r1
            r4.A0K = r0
            X.C0B r1 = r7.A0D
            r4.A06 = r1
            X.C08 r0 = r7.A08
            r4.A0H = r0
            boolean r0 = r1.fullScreenStyle
            if (r0 == 0) goto L_0x015c
            A01(r4)
        L_0x0038:
            X.C08 r8 = r4.A0H
            X.C08 r0 = X.C08.DISABLED
            r13 = 6
            r12 = 4
            r11 = 2
            r9 = 0
            java.lang.String r10 = "cornerRadii"
            if (r8 != r0) goto L_0x0121
            boolean r1 = r6.BeR()
            if (r1 == 0) goto L_0x011d
            X.C0J r0 = X.C0J.A2T
        L_0x004c:
            int r1 = X.C25867Cna.A01(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.C199610h.A04(r0)
            X.BF1 r8 = new X.BF1
            r8.<init>()
            r8.A01(r1)
        L_0x005f:
            float[] r0 = r4.A08
            if (r0 == 0) goto L_0x0161
            r3 = r0[r9]
            r2 = r0[r11]
            r1 = r0[r12]
            r0 = r0[r13]
            r8.A00(r3, r2, r1, r0)
            r4.setBackground(r8)
            float[] r0 = r4.A08
            if (r0 == 0) goto L_0x0161
            X.BIj r1 = new X.BIj
            r1.<init>(r15, r0)
            r4.A05 = r1
            r0 = -1
            X.C108965cb.A12(r1, r0)
            X.BIj r1 = r4.A05
            if (r1 == 0) goto L_0x0089
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r1.setScaleType(r0)
        L_0x0089:
            X.BIj r1 = r4.A05
            if (r1 == 0) goto L_0x0092
            r0 = 8
            r1.setVisibility(r0)
        L_0x0092:
            X.BIj r0 = r4.A05
            r4.addView(r0)
            X.D3N r9 = r7.A04
            X.BF1 r8 = new X.BF1
            r8.<init>()
            r4.A03 = r8
            float[] r7 = r4.A08
            if (r7 == 0) goto L_0x0161
            r0 = 0
            r3 = r7[r0]
            r2 = r7[r11]
            r1 = r7[r12]
            r0 = r7[r13]
            r8.A00(r3, r2, r1, r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r15)
            r4.A01 = r0
            r4.addView(r0)
            if (r9 == 0) goto L_0x00cd
            boolean r0 = r6.BeR()
            if (r0 == 0) goto L_0x011a
            int r1 = r9.A00
        L_0x00c4:
            X.BF1 r0 = r4.A03
            if (r0 != 0) goto L_0x010d
            android.widget.FrameLayout r1 = r4.A01
            r0 = 0
            if (r1 != 0) goto L_0x0116
        L_0x00cd:
            r0 = -1
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r2.<init>(r0, r0)
            r1 = 0
            int r0 = r4.A00
            r2.setMargins(r1, r0, r1, r1)
            r4.addView(r5, r2)
            X.BF1 r5 = new X.BF1
            r5.<init>()
            r4.A04 = r5
            float[] r0 = r4.A08
            if (r0 == 0) goto L_0x0161
            r3 = r0[r1]
            r2 = r0[r11]
            r1 = r0[r12]
            r0 = r0[r13]
            r5.A00(r3, r2, r1, r0)
            X.D3N r1 = r4.A0G
            X.E6Q r0 = r4.A0J
            boolean r0 = r0.BeR()
            if (r0 == 0) goto L_0x010a
            int r0 = r1.A00
        L_0x00fe:
            android.graphics.Color.alpha(r0)
            X.BF1 r0 = r4.A04
            if (r0 == 0) goto L_0x0109
            r0 = 0
            r4.setForeground(r0)
        L_0x0109:
            return
        L_0x010a:
            int r0 = r1.A01
            goto L_0x00fe
        L_0x010d:
            r0.A01(r1)
            android.widget.FrameLayout r1 = r4.A01
            if (r1 == 0) goto L_0x00cd
            X.BF1 r0 = r4.A03
        L_0x0116:
            r1.setForeground(r0)
            goto L_0x00cd
        L_0x011a:
            int r1 = r9.A01
            goto L_0x00c4
        L_0x011d:
            X.C0J r0 = X.C0J.A0A
            goto L_0x004c
        L_0x0121:
            X.D3N r1 = r4.A0F
            boolean r0 = r6.BeR()
            if (r0 == 0) goto L_0x0159
            int r3 = r1.A00
        L_0x012b:
            float[] r2 = r4.A08
            if (r2 == 0) goto L_0x0161
            boolean r1 = r4.A0L
            float r0 = r4.A0D
            X.BHQ r14 = new X.BHQ
            r18 = r2
            r19 = r0
            r20 = r3
            r21 = r1
            r17 = r6
            r16 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r4.A02 = r14
            r0 = -1
            X.C108965cb.A12(r14, r0)
            X.BHQ r0 = r4.A02
            r4.addView(r0)
            X.BF1 r8 = new X.BF1
            r8.<init>()
            r8.A01(r3)
            goto L_0x005f
        L_0x0159:
            int r3 = r1.A01
            goto L_0x012b
        L_0x015c:
            A00(r15, r4)
            goto L_0x0038
        L_0x0161:
            X.C18070vi.A11(r10)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIH.<init>(android.content.Context, X.BI8, X.D3N, X.D3N, X.D8F, X.E6Q, float[]):void");
    }

    public static final void A00(Context context, BIH bih) {
        bih.A08 = bih.A0M;
        bih.A09 = (int) C24515C7j.A00(context, 18.0f);
        bih.A0B = (int) C24515C7j.A00(context, 6.0f);
        bih.A0A = (int) C24515C7j.A00(context, 10.0f);
        D8F d8f = bih.A0I;
        C0B c0b = d8f.A0D;
        C07 c07 = d8f.A0C;
        boolean z = true;
        if (c07 != C07.AUTO ? c07 != C07.DISABLED : !(c0b == C0B.FULL_SHEET || c0b == C0B.FULL_SCREEN)) {
            z = false;
        }
        bih.A07 = !z;
        BF1 bf1 = new BF1();
        bf1.A01(C24541C8m.A00(context, bih.A0J, AnonymousClass00R.A0C));
        Arrays.fill(bf1.A03, (float) ((int) C24515C7j.A00(context, 2.0f)));
        bf1.A00 = true;
        bf1.invalidateSelf();
        bih.A0C = bf1;
        bih.A00 = (int) C24515C7j.A00(context, 16.0f);
    }

    public final D8F getConfig() {
        return this.A0I;
    }

    public final void setCustomBackgroundDrawable(Drawable drawable) {
        if (drawable == null) {
            BHQ bhq = this.A02;
            if (bhq != null) {
                bhq.setVisibility(0);
            }
            BHQ bhq2 = this.A02;
            if (bhq2 != null) {
                Drawable drawable2 = bhq2.A00;
                if (drawable2 instanceof BF8) {
                    drawable2.setVisible(true, true);
                }
            }
            C22658BIj bIj = this.A05;
            if (bIj != null) {
                bIj.setImageDrawable((Drawable) null);
                bIj.setVisibility(8);
                return;
            }
            return;
        }
        C22658BIj bIj2 = this.A05;
        if (bIj2 != null) {
            bIj2.setImageDrawable(drawable);
            bIj2.setVisibility(0);
        }
        BHQ bhq3 = this.A02;
        if (bhq3 != null) {
            bhq3.setVisibility(8);
        }
        BHQ bhq4 = this.A02;
        if (bhq4 != null) {
            Drawable drawable3 = bhq4.A00;
            if (drawable3 instanceof BF8) {
                drawable3.setVisible(false, true);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int size = View.MeasureSpec.getSize(i2);
        if (this.A06.wrapsContent) {
            i3 = Integer.MIN_VALUE;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, i3));
        BI8 bi8 = this.A0E;
        int measuredWidth = bi8.getMeasuredWidth();
        int measuredHeight = bi8.getMeasuredHeight() + this.A00;
        BHQ bhq = this.A02;
        if (bhq != null) {
            bhq.A00(measuredWidth, measuredHeight);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
