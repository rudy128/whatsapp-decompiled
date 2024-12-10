package com.whatsapp.search.views.itemviews;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass4IZ;
import X.AnonymousClass4aX;
import X.AnonymousClass9RY;
import X.C17960vV;
import X.C18000vb;
import X.C19740yt;
import X.C24261Jm;
import X.C27641Ww;
import X.C27691Xc;
import X.C441822l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.wds.components.button.WDSButton;

public class VoiceNoteProfileAvatarView extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public int A01;
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public C18000vb A05;
    public WDSButton A06;
    public AnonymousClass031 A07;
    public int A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public void A02(int i, boolean z, boolean z2, boolean z3) {
        int i2 = 1;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                } else {
                    throw AnonymousClass001.A13("Unsupported FastPlaybackPlayerState ", AnonymousClass000.A10(), i);
                }
            }
        }
        A03(i2, z, z2, z3);
    }

    public void A01() {
        if (!this.A09) {
            this.A09 = true;
            this.A05 = AnonymousClass10E.A6R(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r4.A0B != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int r18, boolean r19, boolean r20, boolean r21) {
        /*
            r17 = this;
            r4 = r17
            int r0 = r4.A08
            r8 = 1
            r9 = 0
            r5 = r18
            boolean r10 = X.AnonymousClass000.A1S(r5, r0)
            r4.A08 = r5
            if (r20 != 0) goto L_0x010c
            if (r21 == 0) goto L_0x010c
            android.widget.ImageView r3 = r4.A02
        L_0x0014:
            if (r18 == 0) goto L_0x002c
            if (r5 == r8) goto L_0x00f6
            r7 = 2
            if (r5 == r7) goto L_0x00e4
            com.whatsapp.wds.components.button.WDSButton r6 = r4.A06
            android.content.Context r2 = r4.getContext()
            r1 = 2131890364(0x7f1210bc, float:1.9415418E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            X.C17880vN.A1T(r0, r7, r9)
            X.AnonymousClass3MY.A0y(r2, r6, r0, r1)
        L_0x002c:
            android.widget.ImageView r0 = r4.A04
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.A02
            r0.setVisibility(r2)
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0041
            boolean r0 = r4.A0B
            r1 = 1
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A06
            if (r18 != 0) goto L_0x007c
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.A03
            if (r1 != 0) goto L_0x004e
            r2 = 0
        L_0x004e:
            r0.setVisibility(r2)
            r3.setVisibility(r9)
            r4.setClickable(r9)
        L_0x0057:
            if (r19 == 0) goto L_0x007b
            if (r10 == 0) goto L_0x007b
            com.whatsapp.wds.components.button.WDSButton r2 = r4.A06
            if (r18 != 0) goto L_0x0110
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            X.BEB.A0q(r2, r1, r0)
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0075
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x0075
            android.widget.ImageView r2 = r4.A03
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.BEB.A0q(r2, r1, r0)
        L_0x0075:
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.BEB.A0q(r3, r1, r0)
        L_0x007b:
            return
        L_0x007c:
            r0.setVisibility(r9)
            android.widget.ImageView r1 = r4.A03
            r0 = 4
            r1.setVisibility(r0)
            r3.setVisibility(r0)
            r4.setClickable(r8)
            if (r21 == 0) goto L_0x00b0
            if (r20 != 0) goto L_0x00cb
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131169230(0x7f070fce, float:1.7952784E38)
            int r14 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131169227(0x7f070fcb, float:1.7952778E38)
            int r15 = r1.getDimensionPixelSize(r0)
            r13 = 0
            r16 = 0
        L_0x00a8:
            X.0vb r12 = r4.A05
            com.whatsapp.wds.components.button.WDSButton r11 = r4.A06
            X.C27641Ww.A06(r11, r12, r13, r14, r15, r16)
            goto L_0x0057
        L_0x00b0:
            if (r20 != 0) goto L_0x00cb
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131169228(0x7f070fcc, float:1.795278E38)
            int r15 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131169226(0x7f070fca, float:1.7952776E38)
            int r16 = r1.getDimensionPixelSize(r0)
            r13 = 0
            r14 = 0
            goto L_0x00a8
        L_0x00cb:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131169229(0x7f070fcd, float:1.7952782E38)
            int r13 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131169226(0x7f070fca, float:1.7952776E38)
            int r16 = r1.getDimensionPixelSize(r0)
            r14 = 0
            r15 = 0
            goto L_0x00a8
        L_0x00e4:
            com.whatsapp.wds.components.button.WDSButton r7 = r4.A06
            android.content.Context r6 = r4.getContext()
            r2 = 2131890365(0x7f1210bd, float:1.941542E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r0 = 1069547520(0x3fc00000, float:1.5)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0105
        L_0x00f6:
            com.whatsapp.wds.components.button.WDSButton r7 = r4.A06
            android.content.Context r6 = r4.getContext()
            r2 = 2131890364(0x7f1210bc, float:1.9415418E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x0105:
            r1[r9] = r0
            X.AnonymousClass3MY.A0y(r6, r7, r1, r2)
            goto L_0x002c
        L_0x010c:
            android.widget.ImageView r3 = r4.A04
            goto L_0x0014
        L_0x0110:
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.BEB.A0q(r2, r1, r0)
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0126
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x0126
            android.widget.ImageView r2 = r4.A03
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            X.BEB.A0q(r2, r1, r0)
        L_0x0126:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            X.BEB.A0q(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView.A03(int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r3.A0B != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(boolean r4, int r5) {
        /*
            r3 = this;
            r3.A0A = r4
            android.widget.ImageView r2 = r3.A04
            if (r4 == 0) goto L_0x0020
            r1 = 2131231034(0x7f08013a, float:1.8078138E38)
            r2.setImageResource(r1)
            android.widget.ImageView r0 = r3.A02
            r0.setImageResource(r1)
            boolean r0 = r3.A0B
            r1 = 1
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            android.widget.ImageView r0 = r3.A03
            if (r1 != 0) goto L_0x001c
            r5 = 0
        L_0x001c:
            r0.setVisibility(r5)
            return
        L_0x0020:
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            r2.setImageResource(r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView.A04(boolean, int):void");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public int getFastPlaybackViewState() {
        return this.A08;
    }

    public ImageView getGroupProfileImageView() {
        return this.A02;
    }

    public ImageView getProfileImageView() {
        return this.A04;
    }

    public void setIconColorTint(int i) {
        this.A03.setImageDrawable(AnonymousClass4aX.A02(getContext(), this.A01, i));
    }

    public void setIsForwardedByNonAuthorPttUi(boolean z) {
        A04(z, 8);
    }

    public VoiceNoteProfileAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A01();
    }

    private void A00(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        View.inflate(context2, 2131627462, this);
        this.A04 = AnonymousClass3MW.A0G(this, 2131433831);
        this.A02 = AnonymousClass3MW.A0G(this, 2131433837);
        this.A03 = AnonymousClass3MW.A0G(this, 2131432753);
        this.A06 = (WDSButton) AnonymousClass1HF.A06(this, 2131430795);
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, AnonymousClass4IZ.A08);
            View A062 = AnonymousClass1HF.A06(this, 2131433836);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(7, Integer.MIN_VALUE);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            C27641Ww.A07(A062, this.A05, dimensionPixelSize, dimensionPixelSize2, A062.getPaddingRight(), dimensionPixelSize3);
            int i = dimensionPixelSize4;
            int i2 = dimensionPixelSize4;
            int i3 = dimensionPixelSize4;
            C27641Ww.A07(this.A04, this.A05, dimensionPixelSize4, i3, i, i2);
            C27641Ww.A07(this.A02, this.A05, dimensionPixelSize4, i3, i, i2);
            if (dimensionPixelSize5 != Integer.MIN_VALUE) {
                ViewGroup.LayoutParams layoutParams = this.A04.getLayoutParams();
                layoutParams.height = dimensionPixelSize5;
                layoutParams.width = dimensionPixelSize5;
                this.A04.setLayoutParams(layoutParams);
                this.A02.setLayoutParams(layoutParams);
            }
            this.A01 = 2131232653;
            this.A00 = 2131232647;
            this.A03.setBackground(drawable);
            AnonymousClass1HF.A0L(colorStateList, this.A03);
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(this.A03);
            C18000vb r3 = this.A05;
            ImageView imageView = this.A03;
            ImageView imageView2 = imageView;
            C18000vb r17 = r3;
            C27641Ww.A06(imageView2, r17, dimensionPixelSize6, A0B2.topMargin, A0B2.rightMargin, dimensionPixelSize7);
        }
    }

    public void setIsNewsletterAudioOrPttUi(C441822l r10) {
        boolean z = true;
        this.A0C = !r10.A1L();
        if (AnonymousClass9RY.A00(r10) == null) {
            z = false;
        }
        this.A0B = z;
        ImageView A0H = AnonymousClass3MW.A0H(this, 2131431395);
        if (this.A0C && A0H != null) {
            this.A01 = 2131231589;
            this.A00 = 2131231576;
            Drawable A002 = C24261Jm.A00(getContext(), this.A00);
            C17960vV.A07(A002);
            Drawable mutate = A002.mutate();
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(this.A03);
            C27641Ww.A06(A0H, this.A05, A0B2.leftMargin, A0B2.topMargin, A0B2.rightMargin, A0B2.bottomMargin);
            AnonymousClass1HF.A0L(this.A03.getBackgroundTintList(), A0H);
            A0H.setBackground(mutate);
            A0H.setVisibility(0);
            this.A03.setVisibility(8);
            this.A03 = A0H;
        }
    }

    public void setOnFastPlaybackButtonClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        this.A06.setOnClickListener(onClickListener);
        if (this.A06.getVisibility() == 8 || this.A06.getVisibility() == 4) {
            setClickable(false);
        }
    }

    public void setupIconBackgroundColor(int i) {
        Context context = getContext();
        Drawable A002 = C24261Jm.A00(context, this.A00);
        C17960vV.A07(A002);
        Drawable mutate = A002.mutate();
        ColorStateList A032 = C19740yt.A03(context, i);
        this.A03.setBackground(mutate);
        AnonymousClass1HF.A0L(A032, this.A03);
    }

    public VoiceNoteProfileAvatarView(Context context) {
        super(context);
        A01();
        this.A0B = false;
        this.A0C = false;
        this.A08 = 0;
        A00(context, (AttributeSet) null);
    }

    public VoiceNoteProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A0B = false;
        this.A0C = false;
        this.A08 = 0;
        A00(context, attributeSet);
    }
}
