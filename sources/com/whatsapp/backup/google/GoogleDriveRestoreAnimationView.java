package com.whatsapp.backup.google;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4aX;
import X.C110055er;
import X.C18000vb;
import X.C72473Md;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

public class GoogleDriveRestoreAnimationView extends View implements AnonymousClass009 {
    public float A00;
    public int A01;
    public C110055er A02;
    public C18000vb A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public Resources A09;
    public Paint A0A;
    public Drawable A0B;
    public Drawable A0C;
    public Drawable A0D;
    public boolean A0E;
    public boolean A0F;
    public final DecelerateInterpolator A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r0 != null) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            r3 = 0
            if (r8 == 0) goto L_0x005d
            android.content.res.Resources$Theme r1 = X.AnonymousClass3Ma.A06(r6)
            int[] r0 = X.AnonymousClass6YU.A00
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r0, r3, r3)
            r5 = 0
            r4 = 1
            X.0vb r0 = r6.A03     // Catch:{ all -> 0x0055 }
            boolean r1 = X.AnonymousClass3MW.A1Z(r0)     // Catch:{ all -> 0x0055 }
            r0 = 0
            if (r1 == 0) goto L_0x0019
            r0 = 3
        L_0x0019:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)     // Catch:{ all -> 0x0055 }
            r6.A0D = r0     // Catch:{ all -> 0x0055 }
            X.0vb r0 = r6.A03     // Catch:{ all -> 0x0055 }
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0028
            r5 = 3
        L_0x0028:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r5)     // Catch:{ all -> 0x0055 }
            r6.A0B = r0     // Catch:{ all -> 0x0055 }
            r0 = 2
            boolean r0 = r2.getBoolean(r0, r3)     // Catch:{ all -> 0x0055 }
            r6.A0F = r0     // Catch:{ all -> 0x0055 }
            X.0vb r0 = r6.A03     // Catch:{ all -> 0x0055 }
            boolean r1 = X.AnonymousClass3MW.A1Z(r0)     // Catch:{ all -> 0x0055 }
            r0 = 1
            if (r1 == 0) goto L_0x003f
            r0 = 4
        L_0x003f:
            int r0 = r2.getColor(r0, r3)     // Catch:{ all -> 0x0055 }
            r6.A07 = r0     // Catch:{ all -> 0x0055 }
            X.0vb r0 = r6.A03     // Catch:{ all -> 0x0055 }
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x004e
            r4 = 4
        L_0x004e:
            int r0 = r2.getColor(r4, r3)     // Catch:{ all -> 0x0055 }
            r6.A06 = r0     // Catch:{ all -> 0x0055 }
            goto L_0x005a
        L_0x0055:
            r0 = move-exception
            r2.recycle()
            throw r0
        L_0x005a:
            r2.recycle()
        L_0x005d:
            android.content.res.Resources r2 = r7.getResources()
            r6.A09 = r2
            android.graphics.drawable.Drawable r0 = r6.A0D
            if (r0 != 0) goto L_0x007d
            X.0vb r0 = r6.A03
            boolean r1 = X.AnonymousClass3MW.A1Z(r0)
            r0 = 2131231973(0x7f0804e5, float:1.8080042E38)
            if (r1 == 0) goto L_0x0075
            r0 = 2131232187(0x7f0805bb, float:1.8080476E38)
        L_0x0075:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r6.A0D = r0
            if (r0 == 0) goto L_0x0081
        L_0x007d:
            int r3 = r0.getIntrinsicWidth()
        L_0x0081:
            r6.A08 = r3
            android.graphics.drawable.Drawable r0 = r6.A0B
            if (r0 != 0) goto L_0x009d
            android.content.res.Resources r2 = r6.A09
            X.0vb r0 = r6.A03
            boolean r1 = X.AnonymousClass3MW.A1Z(r0)
            r0 = 2131232187(0x7f0805bb, float:1.8080476E38)
            if (r1 == 0) goto L_0x0097
            r0 = 2131231973(0x7f0804e5, float:1.8080042E38)
        L_0x0097:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r6.A0B = r0
        L_0x009d:
            android.graphics.drawable.Drawable r1 = r6.A0D
            if (r1 == 0) goto L_0x00a9
            int r0 = r6.A07
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A08(r1, r0)
            r6.A0D = r0
        L_0x00a9:
            android.graphics.drawable.Drawable r1 = r6.A0B
            int r0 = r6.A06
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A08(r1, r0)
            r6.A0B = r0
            android.graphics.Paint r0 = X.AnonymousClass3MW.A06()
            r6.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleDriveRestoreAnimationView.A00(android.content.Context, android.util.AttributeSet):void");
    }

    public void A01() {
        if (this.A02 == null) {
            C110055er.A00(this);
        }
        this.A01 = 1;
        startAnimation(this.A02);
    }

    public void A02() {
        if (!this.A0E) {
            this.A0E = true;
            this.A03 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public void A03(boolean z) {
        int i;
        if (this.A02 == null) {
            C110055er.A00(this);
        }
        clearAnimation();
        Resources resources = this.A09;
        if (z) {
            this.A0C = AnonymousClass4aX.A08(resources.getDrawable(2131232247), AnonymousClass3MZ.A02(getContext(), getContext(), 2130970004, 2131101092));
            i = 3;
        } else {
            this.A0D = AnonymousClass4aX.A08(resources.getDrawable(2131232465), this.A07);
            this.A0C = AnonymousClass4aX.A08(this.A09.getDrawable(2131231802), AnonymousClass3MZ.A02(getContext(), getContext(), 2130970005, 2131101093));
            i = 2;
        }
        this.A01 = i;
        C110055er r2 = this.A02;
        if (r2 != null) {
            r2.setDuration(800);
            startAnimation(this.A02);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01d2, code lost:
        if (r2 < (r0 - 0.5d)) goto L_0x01d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r25) {
        /*
            r24 = this;
            r11 = r24
            int r5 = X.C108995ce.A03(r11)
            int r1 = r11.getWidth()
            int r0 = r11.getHeight()
            float r1 = (float) r1
            r15 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r15
            float r0 = (float) r0
            float r0 = r0 / r15
            r14 = r25
            r14.translate(r1, r0)
            android.graphics.drawable.Drawable r0 = r11.A0D
            int r0 = r0.getIntrinsicWidth()
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = -r5
            float r8 = (float) r0
            float r8 = r8 / r15
            float r9 = (float) r1
            float r9 = r9 / r15
            float r8 = r8 + r9
            int r0 = r11.A01
            r4 = 3
            r6 = 1056964608(0x3f000000, float:0.5)
            r10 = 1058642330(0x3f19999a, float:0.6)
            r2 = 1
            r3 = 2
            r7 = 0
            if (r0 == r3) goto L_0x023a
            if (r0 == r4) goto L_0x003a
            r6 = 0
        L_0x003a:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x003c:
            android.graphics.drawable.Drawable r0 = r11.A0D
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 * r7
            int r9 = (int) r0
            android.graphics.drawable.Drawable r0 = r11.A0D
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r7 = r7 * r0
            float r7 = r7 / r15
            int r13 = (int) r7
            android.graphics.drawable.Drawable r12 = r11.A0D
            int r0 = r9 / 2
            float r10 = (float) r0
            float r0 = r8 - r10
            int r7 = (int) r0
            int r1 = -r13
            float r8 = r8 + r10
            int r0 = (int) r8
            r12.setBounds(r7, r1, r0, r13)
            android.graphics.drawable.Drawable r0 = r11.A0D
            r0.draw(r14)
            double r0 = (double) r6
            r17 = 0
            int r7 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r7 <= 0) goto L_0x008d
            android.graphics.drawable.Drawable r0 = r11.A0C
            if (r0 == 0) goto L_0x008d
            int r0 = r0.getIntrinsicWidth()
            float r1 = (float) r0
            float r1 = r1 * r6
            android.graphics.drawable.Drawable r0 = r11.A0C
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r6 = r6 * r0
            android.graphics.drawable.Drawable r10 = r11.A0C
            int r8 = (int) r1
            int r7 = -r8
            int r7 = r7 / r3
            int r1 = (int) r6
            int r0 = -r1
            int r0 = r0 / r3
            int r8 = r8 / r3
            int r1 = r1 / r3
            r10.setBounds(r7, r0, r8, r1)
            android.graphics.drawable.Drawable r0 = r11.A0C
            r0.draw(r14)
        L_0x008d:
            android.graphics.drawable.Drawable r0 = r11.A0B
            int r8 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r0 = r11.A0B
            int r10 = r0.getIntrinsicHeight()
            int r10 = r10 / r3
            int r0 = r11.A01
            if (r0 == r3) goto L_0x00ad
            android.graphics.drawable.Drawable r7 = r11.A0B
            int r6 = r5 / 2
            int r1 = r6 - r8
            int r0 = -r10
            r7.setBounds(r1, r0, r6, r10)
            android.graphics.drawable.Drawable r0 = r11.A0B
            r0.draw(r14)
        L_0x00ad:
            int r0 = r11.A01
            if (r0 == r3) goto L_0x019c
            if (r0 == r4) goto L_0x019c
            float r3 = (float) r5
            float r1 = -r3
            float r1 = r1 / r15
            float r0 = (float) r9
            float r1 = r1 + r0
            double r6 = (double) r1
            float r3 = r3 / r15
            float r0 = (float) r8
            float r3 = r3 - r0
            double r0 = (double) r3
            double r3 = r6 - r0
            double r3 = r3 * r3
            double r3 = r3 + r17
            double r3 = java.lang.Math.sqrt(r3)
            float r5 = (float) r3
            double r4 = (double) r5
            r15 = 4599526299433487565(0x3fd4cccccccccccd, double:0.325)
            double r12 = java.lang.Math.sin(r15)
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r12 * r8
            double r4 = r4 / r12
            double r6 = r6 + r0
            double r6 = r6 / r8
            double r20 = java.lang.Math.cos(r15)
            double r20 = r20 * r4
            double r20 = r20 + r17
            android.graphics.Paint r0 = r11.A0A
            r0.setAntiAlias(r2)
            r10 = 0
        L_0x00e5:
            double r2 = (double) r10
            r12 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            double r2 = r2 * r12
            r16 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r2 = r2 / r16
            r8 = -4623935809413835653(0xbfd47ae147ae147b, double:-0.32)
            double r2 = r2 + r8
            int r0 = r10 + 1
            double r0 = (double) r0
            double r0 = r0 * r12
            double r0 = r0 / r16
            double r0 = r0 + r8
            boolean r8 = r11.A0F
            if (r8 == 0) goto L_0x0236
            r9 = 0
        L_0x0102:
            float r8 = (float) r2
            float r2 = (float) r0
            r22 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r8
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0112
            int r0 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x022f
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0112:
            float r2 = r2 * r1
            float r8 = r8 + r2
            double r2 = (double) r8
            double r8 = java.lang.Math.sin(r2)
            double r8 = r8 * r4
            X.0vb r0 = r11.A03
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            short r0 = X.C108975cc.A0m(r0)
            double r0 = (double) r0
            double r8 = r8 * r0
            double r12 = r6 + r8
            boolean r0 = r11.A0F
            if (r0 == 0) goto L_0x0226
            r8 = 0
        L_0x012e:
            android.graphics.Paint r3 = r11.A0A
            android.content.res.Resources r15 = r11.getResources()
            boolean r0 = r11.A0F
            android.content.Context r2 = r11.getContext()
            if (r0 == 0) goto L_0x021e
            r1 = 2130969996(0x7f04058c, float:1.754869E38)
            r0 = 2131101081(0x7f060599, float:1.7814562E38)
        L_0x0142:
            int r0 = X.AnonymousClass3Ma.A01(r2, r15, r1, r0)
            r3.setColor(r0)
            android.graphics.Paint r0 = r11.A0A
            X.C108945cZ.A1L(r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131168481(0x7f070ce1, float:1.7951265E38)
            float r15 = r1.getDimension(r0)
            boolean r0 = r11.A0F
            if (r0 == 0) goto L_0x019d
            if (r10 == 0) goto L_0x018a
            float r0 = r11.A00
            float r0 = -r0
            double r2 = (double) r0
            r0 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r2 = r2 * r0
            double r0 = (double) r10
            r16 = 4602891378046628709(0x3fe0c152382d7365, double:0.5235987755982988)
            double r0 = r0 * r16
            double r2 = r2 + r0
            double r0 = java.lang.Math.cos(r2)
            r2 = 4638637247447433216(0x405fc00000000000, double:127.0)
            double r0 = r0 * r2
            double r0 = r0 + r2
            android.graphics.Paint r3 = r11.A0A
            int r2 = (int) r0
            r3.setAlpha(r2)
            float r2 = (float) r12
            float r1 = (float) r8
            android.graphics.Paint r0 = r11.A0A
            r14.drawCircle(r2, r1, r15, r0)
        L_0x018a:
            int r10 = r10 + 1
            r0 = 12
            if (r10 < r0) goto L_0x00e5
            int r1 = r11.A01
            r0 = 4
            if (r1 != r0) goto L_0x019c
            X.5er r0 = r11.A02
            if (r0 == 0) goto L_0x019c
            r0.cancel()
        L_0x019c:
            return
        L_0x019d:
            float r2 = (float) r12
            float r0 = (float) r8
            r23 = r0
            android.graphics.Paint r1 = r11.A0A
            r14.drawCircle(r2, r0, r15, r1)
            r2 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r0 = (double) r10
            double r0 = r0 * r2
            double r0 = r0 / r16
            double r2 = java.lang.Math.sin(r0)
            float r9 = r11.A00
            r0 = 1058642330(0x3f19999a, float:0.6)
            float r0 = r9 - r0
            double r0 = (double) r0
            r16 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r0 = r0 * r16
            r16 = 4600877378892201984(0x3fd9999980000000, double:0.3999999761581421)
            double r0 = r0 / r16
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 > 0) goto L_0x01d4
            double r16 = r0 - r18
            int r8 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r16 = 1
            if (r8 >= 0) goto L_0x01d6
        L_0x01d4:
            r16 = 0
        L_0x01d6:
            r8 = 1058642330(0x3f19999a, float:0.6)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x018a
            int r8 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r8 >= 0) goto L_0x018a
            if (r16 == 0) goto L_0x018a
            double r0 = r0 - r18
            double r2 = r2 - r0
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r2 = r2 * r0
            r0 = 4634204016564240384(0x4050000000000000, double:64.0)
            double r2 = r2 + r0
            int r1 = (int) r2
            r0 = 255(0xff, float:3.57E-43)
            if (r1 < r0) goto L_0x01f3
            r1 = 255(0xff, float:3.57E-43)
        L_0x01f3:
            android.graphics.Paint r8 = r11.A0A
            android.content.res.Resources r9 = r11.getResources()
            android.content.Context r3 = r11.getContext()
            r2 = 2130969995(0x7f04058b, float:1.7548688E38)
            r0 = 2131101080(0x7f060598, float:1.781456E38)
            int r0 = X.AnonymousClass3Ma.A01(r3, r9, r2, r0)
            r8.setColor(r0)
            android.graphics.Paint r0 = r11.A0A
            X.C108945cZ.A1L(r0)
            android.graphics.Paint r0 = r11.A0A
            r0.setAlpha(r1)
            float r2 = (float) r12
            android.graphics.Paint r1 = r11.A0A
            r0 = r23
            r14.drawCircle(r2, r0, r15, r1)
            goto L_0x018a
        L_0x021e:
            r1 = 2130969994(0x7f04058a, float:1.7548686E38)
            r0 = 2131101079(0x7f060597, float:1.7814558E38)
            goto L_0x0142
        L_0x0226:
            double r0 = java.lang.Math.cos(r2)
            double r0 = r0 * r4
            double r8 = r20 - r0
            goto L_0x012e
        L_0x022f:
            float r9 = r9 - r1
            float r0 = r22 - r1
            float r9 = r9 / r0
            r1 = r9
            goto L_0x0112
        L_0x0236:
            float r9 = r11.A00
            goto L_0x0102
        L_0x023a:
            boolean r0 = r11.A05
            if (r0 != 0) goto L_0x0299
            float r1 = r11.A00
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x027e
            android.view.animation.DecelerateInterpolator r0 = r11.A0G
            float r1 = r1 / r10
            float r8 = r0.getInterpolation(r1)
            android.graphics.drawable.Drawable r0 = r11.A0D
            int r1 = r0.getIntrinsicWidth()
            int r0 = r11.A08
            float r7 = (float) r0
            android.graphics.drawable.Drawable r0 = r11.A0D
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r7 = r7 / r0
            float r1 = (float) r1
            int r0 = r11.A08
            float r0 = (float) r0
            float r1 = r1 - r0
            float r1 = r1 * r8
            android.graphics.drawable.Drawable r0 = r11.A0D
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r7 = r7 + r1
            float r1 = (float) r5
            float r0 = r1 / r15
            float r9 = r9 - r0
            android.graphics.drawable.Drawable r0 = r11.A0D
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 * r7
            float r1 = r1 - r0
            float r8 = r8 * r1
            float r8 = r8 / r15
            float r8 = r8 + r9
            r6 = 0
            goto L_0x003c
        L_0x027e:
            float r1 = r1 - r10
            float r1 = java.lang.Math.max(r7, r1)
            r0 = 1053609164(0x3ecccccc, float:0.39999998)
            float r1 = r1 / r0
            android.view.animation.DecelerateInterpolator r0 = r11.A0G
            float r0 = r0.getInterpolation(r1)
            float r6 = r6 * r0
            float r1 = r11.A00
            r0 = 1065185444(0x3f7d70a4, float:0.99)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0299
            r11.A05 = r2
        L_0x0299:
            r8 = 0
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleDriveRestoreAnimationView.onDraw(android.graphics.Canvas):void");
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A0G = new DecelerateInterpolator();
        this.A01 = 0;
        A00(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C110055er.A00(this);
        startAnimation(this.A02);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public void onVisibilityChanged(View view, int i) {
        C110055er r0;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (r0 = this.A02) != null) {
            startAnimation(r0);
        }
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0G = new DecelerateInterpolator();
        this.A01 = 0;
        A00(context, attributeSet);
    }

    public GoogleDriveRestoreAnimationView(Context context) {
        super(context);
        A02();
        this.A0G = new DecelerateInterpolator();
        this.A01 = 0;
        A00(context, (AttributeSet) null);
    }
}
