package com.whatsapp.wds.components.profilephoto;

import X.AnonymousClass1Y0;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y5;
import X.AnonymousClass26o;
import X.AnonymousClass3Di;
import X.AnonymousClass3Dj;
import X.AnonymousClass3EW;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18110vm;
import X.C19740yt;
import X.C29431cG;
import X.C39131sX;
import X.C39141sY;
import X.C39181se;
import X.C39191sf;
import X.C39201sg;
import X.C39211sh;
import X.C39221si;
import X.C39231sj;
import X.C39241sk;
import X.C39351sv;
import X.C43081zE;
import X.C43101zG;
import X.C43111zH;
import X.C43121zI;
import X.C43131zJ;
import X.C43151zL;
import X.C43191zP;
import X.C43531zx;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class WDSProfilePhoto extends C39131sX implements C39141sY {
    public C18000vb A00;
    public C18030ve A01;
    public C39201sg A02;
    public C39191sf A03;
    public C39241sk A04;
    public boolean A05;
    public C39181se A06;
    public C39221si A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSProfilePhoto(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021b, code lost:
        if (r2 == false) goto L_0x021d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            r9 = 0
            X.C18070vi.A0d(r14, r9)
            X.1zE r1 = r13.getProfilePhotoRenderer()
            android.widget.ImageView$ScaleType r0 = r13.getScaleType()
            X.C18070vi.A0d(r0, r9)
            r1.A01 = r0
            X.1zE r1 = r13.getProfilePhotoRenderer()
            r0 = 0
            r1.A00 = r0
            android.graphics.drawable.Drawable r1 = r13.getDrawable()
            if (r1 == 0) goto L_0x002a
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x00df
            X.1zE r0 = r13.getProfilePhotoRenderer()
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            r0.A00 = r1
        L_0x002a:
            X.1zE r8 = r13.getProfilePhotoRenderer()
            android.graphics.RectF r1 = r8.A0E
            r1.setEmpty()
            X.1zG r7 = r8.A0L
            X.1sk r0 = r7.A06
            if (r0 == 0) goto L_0x0051
            boolean r2 = r0.A00
            r0 = 1
            if (r2 != r0) goto L_0x0051
            X.0vl r0 = r8.A0N
            java.lang.Object r2 = r0.getValue()
            android.graphics.Path r2 = (android.graphics.Path) r2
            X.0vl r0 = r7.A08
            java.lang.Object r0 = r0.getValue()
            android.graphics.Path r0 = (android.graphics.Path) r0
            r2.set(r0)
        L_0x0051:
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0108
            android.graphics.RectF r0 = r8.A0I
            r1.set(r0)
            X.1zK r0 = r8.A04
            float r2 = r0.A01
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            r1.inset(r2, r2)
            android.graphics.Path r5 = r8.A0B
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0079
            X.1sg r0 = r8.A02
            X.25S r0 = r0.A00()
            android.graphics.Path r0 = r0.A00(r1)
            r5.addPath(r0)
        L_0x0079:
            X.1sk r0 = r7.A06
            r4 = 0
            if (r0 == 0) goto L_0x0084
            boolean r2 = r0.A00
            r0 = 1
            if (r2 != r0) goto L_0x0084
            r4 = 1
        L_0x0084:
            X.1si r3 = r8.A05
            boolean r0 = r3 instanceof X.C39231sj
            if (r0 == 0) goto L_0x00ad
            if (r4 == 0) goto L_0x00f2
            X.0vl r0 = r8.A0N
            java.lang.Object r5 = r0.getValue()
            android.graphics.Path r5 = (android.graphics.Path) r5
            r0 = 9
            X.7S6 r4 = new X.7S6
            r4.<init>(r8, r0)
        L_0x009b:
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r3 = r14.save()
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L_0x00e4
            r14.clipOutPath(r5)
            goto L_0x00e9
        L_0x00ad:
            boolean r0 = r3 instanceof X.AnonymousClass2QH
            if (r0 == 0) goto L_0x00c8
            X.3Dk r2 = new X.3Dk
            r2.<init>(r14, r8, r3, r9)
            if (r4 == 0) goto L_0x00fe
            X.0vl r0 = r8.A0N
            java.lang.Object r5 = r0.getValue()
            android.graphics.Path r5 = (android.graphics.Path) r5
            r0 = 10
        L_0x00c2:
            X.7S6 r4 = new X.7S6
            r4.<init>(r2, r0)
            goto L_0x009b
        L_0x00c8:
            boolean r0 = r3 instanceof X.AnonymousClass2QI
            if (r0 == 0) goto L_0x0102
            r0 = 1
            X.3Dk r2 = new X.3Dk
            r2.<init>(r14, r8, r3, r0)
            if (r4 == 0) goto L_0x00fe
            X.0vl r0 = r8.A0N
            java.lang.Object r5 = r0.getValue()
            android.graphics.Path r5 = (android.graphics.Path) r5
            r0 = 11
            goto L_0x00c2
        L_0x00df:
            super.onDraw(r14)
            goto L_0x002a
        L_0x00e4:
            android.graphics.Region$Op r0 = android.graphics.Region.Op.DIFFERENCE
            r14.clipPath(r5, r0)
        L_0x00e9:
            r4.invoke(r14)     // Catch:{ all -> 0x00ed }
            goto L_0x010e
        L_0x00ed:
            r0 = move-exception
            r14.restoreToCount(r3)
            throw r0
        L_0x00f2:
            X.0vl r0 = r8.A0R
            java.lang.Object r0 = r0.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r14.drawPath(r5, r0)
            goto L_0x0111
        L_0x00fe:
            r2.invoke()
            goto L_0x0111
        L_0x0102:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x0108:
            android.graphics.RectF r0 = r8.A0G
            r1.set(r0)
            goto L_0x011d
        L_0x010e:
            r14.restoreToCount(r3)
        L_0x0111:
            android.graphics.RectF r0 = r8.A0G
            r1.set(r0)
            X.1zK r0 = r8.A04
            float r0 = r0.A00
            r1.inset(r0, r0)
        L_0x011d:
            android.graphics.Path r6 = r8.A0A
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0132
            X.1sg r0 = r8.A02
            X.25S r0 = r0.A00()
            android.graphics.Path r0 = r0.A00(r1)
            r6.addPath(r0)
        L_0x0132:
            android.graphics.drawable.BitmapDrawable r0 = r8.A00
            if (r0 == 0) goto L_0x01ef
            android.graphics.Bitmap r5 = r0.getBitmap()
            if (r5 == 0) goto L_0x01ef
            android.graphics.RectF r4 = r8.A0F
            r4.set(r1)
            int r12 = r5.getWidth()
            int r1 = r5.getHeight()
            android.graphics.Rect r3 = r8.A0C
            r3.set(r9, r9, r12, r1)
            android.widget.ImageView$ScaleType r0 = r8.A01
            int[] r2 = X.AnonymousClass2W8.A00
            int r0 = r0.ordinal()
            r10 = r2[r0]
            r2 = 1
            r0 = 2
            if (r10 == r2) goto L_0x026c
            if (r10 == r0) goto L_0x024e
            float r2 = (float) r12
            float r0 = r4.height()
            float r2 = r2 * r0
            float r1 = (float) r1
            float r0 = r4.width()
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x022b
            int r0 = r3.height()
            float r2 = (float) r0
            float r0 = r4.width()
            float r2 = r2 * r0
            float r0 = r4.height()
            float r2 = r2 / r0
            int r0 = r3.centerX()
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r0 = (int) r1
            r3.left = r0
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r3.right = r0
        L_0x018f:
            r0 = 31
            r10 = 0
            int r2 = r14.saveLayer(r4, r10, r0)
            r14.drawARGB(r9, r9, r9, r9)
            X.0vl r9 = r8.A0O
            java.lang.Object r0 = r9.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r14.drawPath(r6, r0)
            X.1sk r0 = r7.A06
            if (r0 == 0) goto L_0x01cf
            boolean r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x01cf
            java.lang.Object r1 = r9.getValue()
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            X.0vl r0 = X.C43081zE.A0T
            java.lang.Object r0 = r0.getValue()
            android.graphics.Xfermode r0 = (android.graphics.Xfermode) r0
            r1.setXfermode(r0)
            X.0vl r0 = r8.A0N
            java.lang.Object r1 = r0.getValue()
            android.graphics.Path r1 = (android.graphics.Path) r1
            java.lang.Object r0 = r9.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r14.drawPath(r1, r0)
        L_0x01cf:
            java.lang.Object r1 = r9.getValue()
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            android.graphics.PorterDuffXfermode r0 = X.C43081zE.A0S
            r1.setXfermode(r0)
            java.lang.Object r0 = r9.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r14.drawBitmap(r5, r3, r4, r0)
            java.lang.Object r0 = r9.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setXfermode(r10)
            r14.restoreToCount(r2)
        L_0x01ef:
            boolean r0 = r8.A06
            if (r0 == 0) goto L_0x01fe
            X.0vl r0 = r8.A0P
            java.lang.Object r0 = r0.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r14.drawPath(r6, r0)
        L_0x01fe:
            X.0vl r0 = r7.A0A
            java.lang.Object r0 = r0.getValue()
            X.1zP r0 = (X.C43191zP) r0
            boolean r0 = r0.A02()
            r2 = r0 ^ 1
            if (r2 != 0) goto L_0x0214
            X.1se r1 = r7.A00
            X.1se r0 = X.C39181se.CHECKED
            if (r1 != r0) goto L_0x021d
        L_0x0214:
            X.26o r0 = r7.A04
            if (r0 == 0) goto L_0x021b
            r0.draw(r14)
        L_0x021b:
            if (r2 != 0) goto L_0x0223
        L_0x021d:
            X.1se r1 = r7.A00
            X.1se r0 = X.C39181se.NONE
            if (r1 != r0) goto L_0x022a
        L_0x0223:
            X.26o r0 = r7.A03
            if (r0 == 0) goto L_0x022a
            r0.draw(r14)
        L_0x022a:
            return
        L_0x022b:
            int r0 = r3.width()
            float r2 = (float) r0
            float r0 = r4.height()
            float r2 = r2 * r0
            float r0 = r4.width()
            float r2 = r2 / r0
            int r0 = r3.centerY()
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r0 = (int) r1
            r3.top = r0
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r3.bottom = r0
            goto L_0x018f
        L_0x024e:
            float r11 = r4.centerX()
            float r2 = (float) r12
            r10 = 1073741824(0x40000000, float:2.0)
            float r0 = r2 / r10
            float r11 = r11 - r0
            r4.left = r11
            float r11 = r11 + r2
            r4.right = r11
            float r2 = r4.centerY()
            float r1 = (float) r1
            float r0 = r1 / r10
            float r2 = r2 - r0
            r4.top = r2
            float r2 = r2 + r1
            r4.bottom = r2
            goto L_0x018f
        L_0x026c:
            float r10 = (float) r12
            float r0 = r4.height()
            float r2 = r10 * r0
            float r1 = (float) r1
            float r0 = r4.width()
            float r0 = r0 * r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0293
            float r2 = r4.width()
            float r2 = r2 * r1
            float r2 = r2 / r10
            float r1 = r4.centerY()
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r2 / r0
            float r1 = r1 - r0
            r4.top = r1
            float r1 = r1 + r2
            r4.bottom = r1
            goto L_0x018f
        L_0x0293:
            float r2 = r4.height()
            float r2 = r2 * r10
            float r2 = r2 / r1
            float r1 = r4.centerX()
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r2 / r0
            float r1 = r1 - r0
            r4.left = r1
            float r1 = r1 + r2
            r4.right = r1
            goto L_0x018f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.profilephoto.WDSProfilePhoto.onDraw(android.graphics.Canvas):void");
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setProfilePhotoShape(C39201sg r4) {
        boolean z = false;
        C18070vi.A0d(r4, 0);
        if (r4 != this.A02) {
            z = true;
        }
        this.A02 = r4;
        if (z && this.A0B.Bf6()) {
            C43081zE profilePhotoRenderer = getProfilePhotoRenderer();
            C39201sg r1 = this.A02;
            C18070vi.A0d(r1, 0);
            profilePhotoRenderer.A02 = r1;
            profilePhotoRenderer.A0L.A01 = r1;
            requestLayout();
        }
    }

    public final void setProfilePhotoSize(C39191sf r7) {
        AnonymousClass26o r0;
        AnonymousClass26o r02;
        boolean z = false;
        C18070vi.A0d(r7, 0);
        if (r7 != this.A03) {
            z = true;
        }
        this.A03 = r7;
        if (z && this.A0B.Bf6()) {
            C43081zE profilePhotoRenderer = getProfilePhotoRenderer();
            C39191sf r2 = this.A03;
            C18070vi.A0d(r2, 0);
            profilePhotoRenderer.A03 = r2;
            profilePhotoRenderer.A04 = C43121zI.A00(profilePhotoRenderer.A08, C43111zH.A02(r2));
            C43081zE.A00(profilePhotoRenderer);
            C43101zG r4 = profilePhotoRenderer.A0L;
            boolean z2 = false;
            if (r4.A02 != r2) {
                z2 = true;
            }
            r4.A02 = r2;
            if (z2) {
                Context context = r4.A07;
                r4.A05 = C43111zH.A01(context, r2);
                if (r4.A04 != null) {
                    C39241sk r22 = (C39241sk) r4.A09.getValue();
                    C43151zL r1 = r4.A05;
                    C18070vi.A0d(r22, 0);
                    C18070vi.A0d(r1, 2);
                    r0 = new AnonymousClass26o(context, r1, r22);
                } else {
                    r0 = null;
                }
                r4.A04 = r0;
                C39241sk r23 = r4.A06;
                if (r23 != null) {
                    C43151zL r12 = r4.A05;
                    C18070vi.A0d(r12, 2);
                    r02 = new AnonymousClass26o(context, r12, r23);
                } else {
                    r02 = null;
                }
                r4.A03 = r02;
            }
            requestLayout();
        }
    }

    public final void setProfileStatus(C39221si r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
        C43081zE profilePhotoRenderer = getProfilePhotoRenderer();
        profilePhotoRenderer.A05 = r2;
        C43081zE.A00(profilePhotoRenderer);
        invalidate();
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final RectF getDrawRectF() {
        return (RectF) this.A08.getValue();
    }

    private final C39351sv getMarginOffsets() {
        return (C39351sv) this.A09.getValue();
    }

    private final C39351sv getOriginalMargins() {
        return (C39351sv) this.A0A.getValue();
    }

    private final C43081zE getProfilePhotoRenderer() {
        return (C43081zE) this.A0B.getValue();
    }

    public final void A00(C39181se r9, boolean z) {
        double d;
        this.A06 = r9;
        C43081zE profilePhotoRenderer = getProfilePhotoRenderer();
        C39181se r6 = this.A06;
        C18070vi.A0d(r6, 0);
        C43101zG r5 = profilePhotoRenderer.A0L;
        int ordinal = r6.ordinal();
        if (ordinal == 1) {
            AnonymousClass26o r0 = r5.A04;
            if (r0 == null) {
                C39241sk r3 = (C39241sk) r5.A09.getValue();
                Context context = r5.A07;
                C43151zL r1 = r5.A05;
                C18070vi.A0d(r3, 0);
                C18070vi.A0d(r1, 2);
                r0 = new AnonymousClass26o(context, r1, r3);
                r5.A04 = r0;
            }
            r0.A03 = true;
            d = 1.0d;
        } else if (ordinal == 0) {
            AnonymousClass26o r02 = r5.A04;
            if (r02 != null) {
                r02.A03 = false;
            }
            d = 0.0d;
        } else {
            throw new AnonymousClass3EW();
        }
        C43191zP r03 = (C43191zP) r5.A0A.getValue();
        if (z) {
            r03.A01(d);
            return;
        }
        r03.A00(d);
        r5.A00 = r6;
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("whatsAppLocale");
        throw null;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C39351sv originalMargins = getOriginalMargins();
            int i = marginLayoutParams.leftMargin;
            originalMargins.A01 = i;
            originalMargins.A03 = marginLayoutParams.topMargin;
            originalMargins.A02 = marginLayoutParams.rightMargin;
            originalMargins.A00 = marginLayoutParams.bottomMargin;
            marginLayoutParams.leftMargin = i + getMarginOffsets().A01;
            marginLayoutParams.topMargin += getMarginOffsets().A03;
            marginLayoutParams.rightMargin += getMarginOffsets().A02;
            marginLayoutParams.bottomMargin += getMarginOffsets().A00;
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setProfileBadge(C39241sk r6) {
        AnonymousClass26o r0;
        boolean z = true;
        boolean z2 = !C18070vi.A18(r6, this.A04);
        this.A04 = r6;
        if (z2 && this.A0B.Bf6()) {
            C43081zE profilePhotoRenderer = getProfilePhotoRenderer();
            if (r6 == null || !r6.A00) {
                z = false;
            }
            C39241sk r02 = profilePhotoRenderer.A0L.A06;
            if (r02 != null) {
                r02.A00 = z;
            }
            C43081zE profilePhotoRenderer2 = getProfilePhotoRenderer();
            C43101zG r3 = profilePhotoRenderer2.A0L;
            boolean z3 = !C18070vi.A18(r3.A06, r6);
            r3.A06 = r6;
            if (z3) {
                if (r6 != null) {
                    Context context = r3.A07;
                    C43151zL r1 = r3.A05;
                    C18070vi.A0d(r1, 2);
                    r0 = new AnonymousClass26o(context, r1, r6);
                } else {
                    r0 = null;
                }
                r3.A03 = r0;
            }
            r3.A01(profilePhotoRenderer2.A0G);
            invalidate();
        }
    }

    public final void setStatusIndicatorEnabled(boolean z) {
        boolean z2 = false;
        if (z != this.A05) {
            z2 = true;
        }
        this.A05 = z;
        if (z2 && this.A0B.Bf6()) {
            getProfilePhotoRenderer().A07 = z;
            requestLayout();
        }
    }

    public final C39241sk getProfileBadge() {
        return this.A04;
    }

    public final C39181se getProfilePhotoSelectionState() {
        return this.A06;
    }

    public final C39201sg getProfilePhotoShape() {
        return this.A02;
    }

    public final C39191sf getProfilePhotoSize() {
        return this.A03;
    }

    public final C39221si getProfileStatus() {
        return this.A07;
    }

    public final boolean getStatusIndicatorEnabled() {
        return this.A05;
    }

    public void onMeasure(int i, int i2) {
        float f;
        C43081zE profilePhotoRenderer = getProfilePhotoRenderer();
        C39191sf r2 = profilePhotoRenderer.A03;
        Context context = profilePhotoRenderer.A08;
        PointF A002 = C43111zH.A00(context, profilePhotoRenderer.A02, r2);
        float A003 = C43111zH.A01(context, profilePhotoRenderer.A03).A00();
        A002.offset(A003, A003);
        float dimension = context.getResources().getDimension(profilePhotoRenderer.A03.dimension);
        C43131zJ r0 = new C43131zJ(dimension, dimension);
        float f2 = r0.A01;
        A002.offset(f2, r0.A00);
        float f3 = (profilePhotoRenderer.A04.A02.A01 - f2) / 2.0f;
        A002.offset(f3, f3);
        C43131zJ r3 = profilePhotoRenderer.A04.A02;
        C43131zJ r02 = new C43131zJ(Math.max(r3.A01, A002.x), Math.max(r3.A00, A002.y));
        float f4 = r02.A00;
        int i3 = (int) f4;
        float f5 = r02.A01;
        int i4 = (int) f5;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        setMeasuredDimension(i4, i3);
        getDrawRectF().set(0.0f, 0.0f, f5, f4);
        C43081zE profilePhotoRenderer2 = getProfilePhotoRenderer();
        RectF drawRectF = getDrawRectF();
        C18070vi.A0d(drawRectF, 0);
        RectF rectF = profilePhotoRenderer2.A0D;
        rectF.set(drawRectF);
        RectF rectF2 = profilePhotoRenderer2.A0I;
        float f6 = rectF.top;
        rectF2.top = f6;
        rectF2.bottom = f6 + profilePhotoRenderer2.A04.A02.A00;
        if (C18000vb.A00(profilePhotoRenderer2.A0J).A06) {
            f = rectF.right - profilePhotoRenderer2.A04.A02.A01;
        } else {
            f = rectF.left;
        }
        rectF2.left = f;
        rectF2.right = f + profilePhotoRenderer2.A04.A02.A01;
        RectF rectF3 = profilePhotoRenderer2.A0G;
        rectF3.set(rectF2);
        float f7 = profilePhotoRenderer2.A04.A01;
        rectF3.inset(f7, f7);
        RectF rectF4 = profilePhotoRenderer2.A0H;
        rectF4.set(rectF3);
        if (profilePhotoRenderer2.A07) {
            float f8 = profilePhotoRenderer2.A04.A00;
            rectF4.inset(f8, f8);
        }
        profilePhotoRenderer2.A0L.A01(rectF3);
        profilePhotoRenderer2.A0A.reset();
        profilePhotoRenderer2.A09.reset();
        profilePhotoRenderer2.A0B.reset();
        C43081zE.A00(profilePhotoRenderer2);
        setBackgroundDrawable((Drawable) getProfilePhotoRenderer().A0M.getValue());
        RectF rectF5 = getProfilePhotoRenderer().A0G;
        C39351sv marginOffsets = getMarginOffsets();
        marginOffsets.A01 = (int) (getDrawRectF().left - rectF5.left);
        marginOffsets.A03 = (int) (getDrawRectF().top - rectF5.top);
        marginOffsets.A02 = (int) (rectF5.right - getDrawRectF().right);
        marginOffsets.A00 = (int) (rectF5.bottom - getDrawRectF().bottom);
        RectF rectF6 = getProfilePhotoRenderer().A0H;
        setPadding((int) (rectF6.left - getDrawRectF().left), (int) (rectF6.top - getDrawRectF().top), (int) (getDrawRectF().right - rectF6.right), (int) (getDrawRectF().bottom - rectF6.bottom));
        C43531zx.A03(this, getOriginalMargins());
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        C43081zE profilePhotoRenderer = getProfilePhotoRenderer();
        profilePhotoRenderer.A06 = z;
        if (z) {
            ((Paint) profilePhotoRenderer.A0P.getValue()).setColor(C19740yt.A00(profilePhotoRenderer.A08, 2131103387));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSProfilePhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A08 = new C18110vm(new AnonymousClass3Di(13));
        this.A0A = new C18110vm(new AnonymousClass3Di(14));
        this.A09 = new C18110vm(new AnonymousClass3Di(15));
        this.A0B = new C18110vm(new AnonymousClass3Dj(context, this, 1));
        this.A06 = C39181se.NONE;
        C39191sf r3 = C39191sf.MEDIUM;
        this.A03 = r3;
        C39201sg r7 = C39201sg.CIRCLE;
        this.A02 = r7;
        this.A07 = new C39231sj(C39211sh.UNSEEN);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A0D;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int i = obtainStyledAttributes.getInt(2, 2);
            C39191sf[] values = C39191sf.values();
            if (i >= 0 && i < values.length) {
                r3 = values[i];
            }
            setProfilePhotoSize(r3);
            int i2 = obtainStyledAttributes.getInt(1, -1);
            C39201sg[] values2 = C39201sg.values();
            if (i2 >= 0 && i2 < values2.length) {
                r7 = values2[i2];
            }
            setProfilePhotoShape(r7);
            setStatusIndicatorEnabled(obtainStyledAttributes.getBoolean(3, false));
            setProfileBadge((C39241sk) C29431cG.A0f((List) C39241sk.A03.getValue(), obtainStyledAttributes.getInt(0, -1)));
            obtainStyledAttributes.recycle();
        }
        AnonymousClass1Y5.A09(this, true);
        setCropToPadding(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSProfilePhoto(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
