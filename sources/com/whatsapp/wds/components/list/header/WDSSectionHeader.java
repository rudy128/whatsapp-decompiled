package com.whatsapp.wds.components.list.header;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass6Pj;
import X.AnonymousClass6Pk;
import X.AnonymousClass6Pl;
import X.AnonymousClass6U7;
import X.C108945cZ;
import X.C110845hF;
import X.C122656Rf;
import X.C129456hp;
import X.C136086tF;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class WDSSectionHeader extends C110845hF {
    public C18000vb A00;
    public C18030ve A01;
    public AnonymousClass6U7 A02;
    public C136086tF A03;
    public ConstraintLayout A04;
    public C122656Rf A05;
    public Integer A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ab, code lost:
        r0 = r2.A0E(r7, 7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WDSSectionHeader(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r5 = 1
            X.C18070vi.A0d(r10, r5)
            r9.<init>(r10, r11)
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r0 = 33
            X.0vl r0 = X.AnonymousClass7S4.A01(r1, r10, r0)
            r9.A0D = r0
            r0 = 34
            X.0vl r0 = X.AnonymousClass7S4.A01(r1, r9, r0)
            r9.A0B = r0
            r0 = 35
            X.0vl r0 = X.AnonymousClass7S4.A01(r1, r10, r0)
            r9.A0C = r0
            r1 = 0
            r9.setWillNotDraw(r1)
            r9.setClipToPadding(r1)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r10)
            r0 = 2131627595(0x7f0e0e4b, float:1.8882459E38)
            android.view.View r3 = r2.inflate(r0, r9)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.C18070vi.A0z(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r9.A04 = r3
            X.0ve r2 = r9.A01
            X.6tF r0 = new X.6tF
            r0.<init>(r3, r2)
            r9.A03 = r0
            X.6hp r8 = r9.getStyle()
            X.6tF r0 = r9.A03
            if (r0 == 0) goto L_0x0069
            androidx.constraintlayout.widget.ConstraintLayout r7 = r0.A03
            int r6 = r7.getPaddingLeft()
            int r4 = r7.getPaddingTop()
            int r3 = r7.getPaddingRight()
            int r2 = r7.getPaddingBottom()
            X.0vl r0 = r8.A03
            int r0 = X.C72453Mb.A0I(r0)
            int r2 = r2 + r0
            r7.setPadding(r6, r4, r3, r2)
        L_0x0069:
            r9.getStyle()
            X.6tF r6 = r9.A03
            if (r6 == 0) goto L_0x009c
            com.whatsapp.WaTextView r2 = r6.A00()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            r3 = 0
            if (r2 == 0) goto L_0x0086
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L_0x0151
            X.1sZ r0 = (X.C39151sZ) r0
            r0.A02 = r3
            r2.setLayoutParams(r0)
        L_0x0086:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r6.A03
            r0 = 2131435858(0x7f0b2152, float:1.849357E38)
            android.view.View r2 = X.AnonymousClass3MX.A0C(r2, r0)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L_0x014c
            X.1sZ r0 = (X.C39151sZ) r0
            r0.A02 = r3
            r2.setLayoutParams(r0)
        L_0x009c:
            if (r11 == 0) goto L_0x0136
            int[] r0 = X.AnonymousClass1Y0.A0H
            X.C18070vi.A0Z(r0)
            android.content.res.TypedArray r7 = r10.obtainStyledAttributes(r11, r0, r1, r1)
            X.0vb r2 = r9.A00
            if (r2 == 0) goto L_0x00b2
            r0 = 7
            java.lang.String r0 = r2.A0E(r7, r0)
            if (r0 != 0) goto L_0x00b7
        L_0x00b2:
            r0 = 7
            java.lang.String r0 = r7.getString(r0)
        L_0x00b7:
            r9.setHeaderText((java.lang.String) r0)
            X.0vb r2 = r9.A00
            if (r2 == 0) goto L_0x00c6
            r0 = 9
            java.lang.String r0 = r2.A0E(r7, r0)
            if (r0 != 0) goto L_0x00cc
        L_0x00c6:
            r0 = 9
            java.lang.String r0 = r7.getString(r0)
        L_0x00cc:
            r9.setSubHeaderText((java.lang.String) r0)
            r0 = 8
            int r3 = r7.getInt(r0, r1)
            X.0z2 r2 = X.C122656Rf.A00
            if (r3 < 0) goto L_0x0149
            int r0 = r2.size()
            if (r3 >= r0) goto L_0x0149
            java.lang.Object r0 = r2.get(r3)
        L_0x00e3:
            X.6Rf r0 = (X.C122656Rf) r0
            r9.setHeaderVariant(r0)
            r2 = 6
            r0 = -1
            int r0 = r7.getInt(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.setHeaderMaxLines(r0)
            r0 = 5
            boolean r0 = r7.getBoolean(r0, r1)
            r9.setDividerVisibility(r0)
            r0 = 4
            int r8 = r7.getInt(r0, r1)
            int r6 = r7.getResourceId(r1, r1)
            X.0vb r0 = r9.A00
            if (r0 == 0) goto L_0x0110
            java.lang.String r4 = r0.A0E(r7, r5)
            if (r4 != 0) goto L_0x0114
        L_0x0110:
            java.lang.String r4 = r7.getString(r5)
        L_0x0114:
            r0 = 2
            boolean r3 = r7.getBoolean(r0, r1)
            X.0vb r1 = r9.A00
            if (r1 == 0) goto L_0x0124
            r0 = 3
            java.lang.String r2 = r1.A0E(r7, r0)
            if (r2 != 0) goto L_0x0129
        L_0x0124:
            r0 = 3
            java.lang.String r2 = r7.getString(r0)
        L_0x0129:
            if (r8 == r5) goto L_0x0141
            r0 = 2
            if (r8 == r0) goto L_0x0139
            X.6Pj r1 = X.AnonymousClass6Pj.A00
        L_0x0130:
            r9.setAddOnType(r1)
            r7.recycle()
        L_0x0136:
            r9.A0A = r5
            return
        L_0x0139:
            X.1Xz r0 = X.C27881Xz.TONAL
            X.6Pk r1 = new X.6Pk
            r1.<init>(r0, r2)
            goto L_0x0130
        L_0x0141:
            X.1Xz r0 = X.C27881Xz.TONAL
            X.6Pl r1 = new X.6Pl
            r1.<init>(r0, r4, r6, r3)
            goto L_0x0130
        L_0x0149:
            X.6Rf r0 = X.C122656Rf.DEFAULT
            goto L_0x00e3
        L_0x014c:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r4)
            throw r0
        L_0x0151:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.list.header.WDSSectionHeader.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static /* synthetic */ void getAddOnType$annotations() {
    }

    public static /* synthetic */ void getDividerVisibility$annotations() {
    }

    public static /* synthetic */ void getHeaderMaxLines$annotations() {
    }

    public static /* synthetic */ void getHeaderText$annotations() {
    }

    public static /* synthetic */ void getHeaderVariant$annotations() {
    }

    public static /* synthetic */ void getSubHeaderText$annotations() {
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        if (this.A09) {
            canvas2.drawLine(0.0f, 0.0f, C108945cZ.A03(this), C72453Mb.A00(this.A0B), getDividerPaint());
        }
    }

    private final float getDividerHeight() {
        return C72453Mb.A00(this.A0B);
    }

    private final Paint getDividerPaint() {
        return (Paint) this.A0C.getValue();
    }

    private final C129456hp getStyle() {
        return (C129456hp) this.A0D.getValue();
    }

    public final WDSButton A07(boolean z) {
        C136086tF r0 = this.A03;
        if (r0 != null) {
            return r0.A02(z);
        }
        return null;
    }

    public final int getAddOnVisibility() {
        WDSButton wDSButton;
        AnonymousClass6U7 r1 = this.A02;
        if ((r1 instanceof AnonymousClass6Pj) || r1 == null) {
            return 8;
        }
        if ((r1 instanceof AnonymousClass6Pl) || (r1 instanceof AnonymousClass6Pk)) {
            C136086tF r0 = this.A03;
            if (r0 == null || (wDSButton = r0.A00) == null) {
                return 8;
            }
            return wDSButton.getVisibility();
        }
        throw AnonymousClass3MW.A14();
    }

    public final int getHeaderTextVisibility() {
        WaTextView A002;
        C136086tF r0 = this.A03;
        if (r0 == null || (A002 = r0.A00()) == null) {
            return 8;
        }
        return A002.getVisibility();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setAddOnType(X.AnonymousClass6U7 r6) {
        /*
            r5 = this;
            X.6U7 r0 = r5.A02
            boolean r0 = X.C18070vi.A18(r0, r6)
            r1 = 1
            r0 = r0 ^ 1
            r5.A02 = r6
            if (r0 != 0) goto L_0x0011
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x0091
        L_0x0011:
            boolean r0 = r6 instanceof X.AnonymousClass6Pj
            r2 = 0
            if (r0 != 0) goto L_0x00bc
            if (r6 == 0) goto L_0x00bc
            boolean r0 = r6 instanceof X.AnonymousClass6Pl
            r3 = 0
            if (r0 == 0) goto L_0x0098
            r5.setAddOnVisibility(r2)
            X.6tF r2 = r5.A03
            if (r2 == 0) goto L_0x0050
            com.whatsapp.wds.components.button.WDSButton r4 = r2.A02(r1)
            if (r4 == 0) goto L_0x0050
            r4.setText(r3)
            X.6Pl r6 = (X.AnonymousClass6Pl) r6
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0092
            int r3 = r6.A00
            if (r3 == 0) goto L_0x0092
            X.0vb r1 = r4.A01
            if (r1 == 0) goto L_0x0046
            android.content.Context r0 = r4.getContext()
            X.3cP r0 = X.AnonymousClass3NL.A00(r0, r1, r3)
            r4.setIcon((android.graphics.drawable.Drawable) r0)
        L_0x0046:
            java.lang.String r0 = r6.A02
            r4.setContentDescription(r0)
            X.1Xz r0 = r6.A01
            r4.setVariant(r0)
        L_0x0050:
            X.6hp r0 = r5.getStyle()
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131169536(0x7f071100, float:1.7953405E38)
            int r1 = r1.getDimensionPixelSize(r0)
            if (r2 == 0) goto L_0x007e
            com.whatsapp.WaTextView r0 = r2.A00()
            if (r0 == 0) goto L_0x007e
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            if (r3 == 0) goto L_0x007e
            r0 = r3
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.setMarginEnd(r1)
            com.whatsapp.WaTextView r0 = r2.A00()
        L_0x0079:
            if (r0 == 0) goto L_0x007e
            r0.setLayoutParams(r3)
        L_0x007e:
            X.0ve r0 = r5.A01
            boolean r0 = X.AnonymousClass1J8.A05(r0)
            if (r0 != 0) goto L_0x0091
            int r1 = r5.getPaddingLeft()
            int r0 = r5.getPaddingTop()
            X.C72463Mc.A14(r5, r1, r0)
        L_0x0091:
            return
        L_0x0092:
            int r0 = r6.A00
            r4.setIcon((int) r0)
            goto L_0x0046
        L_0x0098:
            boolean r0 = r6 instanceof X.AnonymousClass6Pk
            if (r0 == 0) goto L_0x00df
            r5.setAddOnVisibility(r2)
            X.6tF r2 = r5.A03
            if (r2 == 0) goto L_0x0050
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x0050
            X.6Pk r6 = (X.AnonymousClass6Pk) r6
            java.lang.String r0 = r6.A01
            r1.setText(r0)
            r1.setIcon((android.graphics.drawable.Drawable) r3)
            X.1Xz r0 = r6.A00
            r1.setVariant(r0)
            r1.setContentDescription(r3)
            goto L_0x0050
        L_0x00bc:
            r0 = 8
            r5.setAddOnVisibility(r0)
            r5.getStyle()
            X.6tF r1 = r5.A03
            if (r1 == 0) goto L_0x007e
            com.whatsapp.WaTextView r0 = r1.A00()
            if (r0 == 0) goto L_0x007e
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            if (r3 == 0) goto L_0x007e
            r0 = r3
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.setMarginEnd(r2)
            com.whatsapp.WaTextView r0 = r1.A00()
            goto L_0x0079
        L_0x00df:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.list.header.WDSSectionHeader.setAddOnType(X.6U7):void");
    }

    public final void setAddOnVisibility(int i) {
        WDSButton A022;
        boolean A1S = AnonymousClass000.A1S(i, 8);
        AnonymousClass6U7 r1 = this.A02;
        if (!(r1 instanceof AnonymousClass6Pj) && r1 != null) {
            if ((r1 instanceof AnonymousClass6Pl) || (r1 instanceof AnonymousClass6Pk)) {
                C136086tF r0 = this.A03;
                if (r0 != null && (A022 = r0.A02(A1S)) != null) {
                    A022.setVisibility(i);
                    return;
                }
                return;
            }
            throw AnonymousClass3MW.A14();
        }
    }

    public final void setDividerVisibility(boolean z) {
        boolean z2 = this.A09;
        boolean A1S = AnonymousClass000.A1S(z2 ? 1 : 0, z ? 1 : 0);
        this.A09 = z;
        if (A1S || !this.A0A) {
            invalidate();
        }
    }

    public final void setHeaderMaxLines(Integer num) {
        C136086tF r0;
        WaTextView A002;
        int intValue;
        boolean z = !C18070vi.A18(this.A06, num);
        this.A06 = num;
        if ((z || !this.A0A) && (r0 = this.A03) != null && (A002 = r0.A00()) != null && num != null && (intValue = num.intValue()) > 0) {
            A002.setMaxLines(intValue);
        }
    }

    public final void setHeaderText(String str) {
        WaTextView A002;
        boolean z = !C18070vi.A18(this.A07, str);
        this.A07 = str;
        if (z || !this.A0A) {
            C136086tF r0 = this.A03;
            if (!(r0 == null || (A002 = r0.A00()) == null)) {
                A002.setText(str);
            }
            if (this.A05 == null) {
                setHeaderVariant(C122656Rf.DEFAULT);
            }
        }
    }

    public final void setHeaderTextVisibility(int i) {
        WaTextView A002;
        C136086tF r0 = this.A03;
        if (r0 != null && (A002 = r0.A00()) != null) {
            A002.setVisibility(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setHeaderVariant(X.C122656Rf r10) {
        /*
            r9 = this;
            X.6Rf r0 = r9.A05
            boolean r0 = X.AnonymousClass3Ma.A1Z(r0, r10)
            r9.A05 = r10
            if (r0 != 0) goto L_0x000e
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x00e9
        L_0x000e:
            X.6tF r5 = r9.A03
            if (r5 == 0) goto L_0x00e9
            com.whatsapp.WaTextView r6 = r5.A00()
            if (r6 == 0) goto L_0x00e9
            X.6hp r7 = r9.getStyle()
            if (r10 != 0) goto L_0x00aa
            X.6Rf r4 = X.C122656Rf.DEFAULT
        L_0x0020:
            X.0ve r3 = r6.getAbProps()
            int r0 = r4.headerTextAppearance
            X.C29261bv.A08(r6, r0)
            android.content.Context r2 = r7.A00
            int r1 = r4.headerTextColor
            int r0 = r4.headerTextColorLegacy
            X.C72463Mc.A0y(r2, r6, r1, r0)
            X.0vf r8 = X.C18040vf.A01
            r0 = 11203(0x2bc3, float:1.5699E-41)
            boolean r1 = X.C18020vd.A05(r8, r3, r0)
            r0 = 1
            if (r1 != r0) goto L_0x00a7
            X.0vl r0 = r7.A02
        L_0x003f:
            int r4 = X.C72453Mb.A0I(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.C108995ce.A0L(r6)
            if (r0 == 0) goto L_0x00a5
            int r3 = r0.leftMargin
        L_0x004b:
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00a3
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x00a3
            int r2 = r1.rightMargin
        L_0x0059:
            int r1 = X.C108995ce.A02(r6)
            X.1sv r0 = new X.1sv
            r0.<init>(r3, r4, r2, r1)
            X.C43531zx.A03(r6, r0)
            if (r10 == 0) goto L_0x00e9
            r9.getStyle()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            r0 = 2131427666(0x7f0b0152, float:1.8476955E38)
            android.view.View r5 = X.AnonymousClass3MX.A0C(r1, r0)
            X.0ve r1 = r6.getAbProps()
            android.view.ViewGroup$MarginLayoutParams r0 = X.C108995ce.A0L(r5)
            r7 = 0
            if (r0 == 0) goto L_0x00a1
            int r4 = r0.leftMargin
        L_0x0080:
            android.content.res.Resources r6 = X.AnonymousClass000.A0Y(r5)
            r3 = 0
            r0 = 11203(0x2bc3, float:1.5699E-41)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            r2 = 1
            if (r0 != r2) goto L_0x008f
            r3 = 1
        L_0x008f:
            r1 = 2
            int r0 = r10.ordinal()
            if (r3 == 0) goto L_0x00b1
            if (r0 == r7) goto L_0x00c8
            if (r0 == r2) goto L_0x00ad
            if (r0 == r1) goto L_0x00c0
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00a1:
            r4 = 0
            goto L_0x0080
        L_0x00a3:
            r2 = 0
            goto L_0x0059
        L_0x00a5:
            r3 = 0
            goto L_0x004b
        L_0x00a7:
            X.0vl r0 = r7.A01
            goto L_0x003f
        L_0x00aa:
            r4 = r10
            goto L_0x0020
        L_0x00ad:
            r0 = 2131169535(0x7f0710ff, float:1.7953403E38)
            goto L_0x00cb
        L_0x00b1:
            if (r0 == r7) goto L_0x00c4
            if (r0 == r2) goto L_0x00c0
            if (r0 != r1) goto L_0x00bb
            r0 = 2131169545(0x7f071109, float:1.7953423E38)
            goto L_0x00cb
        L_0x00bb:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00c0:
            r0 = 2131169544(0x7f071108, float:1.7953421E38)
            goto L_0x00cb
        L_0x00c4:
            r0 = 2131169536(0x7f071100, float:1.7953405E38)
            goto L_0x00cb
        L_0x00c8:
            r0 = 2131169540(0x7f071104, float:1.7953413E38)
        L_0x00cb:
            int r3 = r6.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00ea
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x00ea
            int r2 = r1.rightMargin
        L_0x00dd:
            int r1 = X.C108995ce.A02(r5)
            X.1sv r0 = new X.1sv
            r0.<init>(r4, r3, r2, r1)
            X.C43531zx.A03(r5, r0)
        L_0x00e9:
            return
        L_0x00ea:
            r2 = 0
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.list.header.WDSSectionHeader.setHeaderVariant(X.6Rf):void");
    }

    public final void setSubHeaderText(String str) {
        C136086tF r0;
        boolean z = true;
        boolean z2 = !C18070vi.A18(this.A08, str);
        this.A08 = str;
        if ((z2 || !this.A0A) && (r0 = this.A03) != null) {
            if (str == null) {
                z = false;
            }
            WaTextView A012 = r0.A01(z);
            if (A012 != null) {
                A012.setText(str);
            }
        }
    }

    public final C18030ve getAbProps() {
        return this.A01;
    }

    public final AnonymousClass6U7 getAddOnType() {
        return this.A02;
    }

    public final boolean getDividerVisibility() {
        return this.A09;
    }

    public final Integer getHeaderMaxLines() {
        return this.A06;
    }

    public final String getHeaderText() {
        return this.A07;
    }

    public final C122656Rf getHeaderVariant() {
        return this.A05;
    }

    public final String getSubHeaderText() {
        return this.A08;
    }

    public final C18000vb getWhatsAppLocale() {
        return this.A00;
    }

    public final void setAbProps(C18030ve r1) {
        this.A01 = r1;
    }

    public final void setWhatsAppLocale(C18000vb r1) {
        this.A00 = r1;
    }

    public /* synthetic */ WDSSectionHeader(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    public final void setHeaderText(int i) {
        setHeaderText(getResources().getString(i));
    }

    public final void setSubHeaderText(int i) {
        setSubHeaderText(getResources().getString(i));
    }
}
