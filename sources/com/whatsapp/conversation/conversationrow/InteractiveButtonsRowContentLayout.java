package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1HF;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3SQ;
import X.AnonymousClass3uP;
import X.AnonymousClass4LK;
import X.C18000vb;
import X.C18030ve;
import X.C27691Xc;
import X.C27831Xu;
import X.C74743cP;
import X.C85524Ns;
import X.C88484Zw;
import X.C90104dX;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;

public class InteractiveButtonsRowContentLayout extends LinearLayout implements AnonymousClass009 {
    public C88484Zw A00;
    public C18000vb A01;
    public C18030ve A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public boolean A05;
    public final LinearLayout A06;
    public final LinearLayout.LayoutParams A07;
    public final LinearLayout.LayoutParams A08;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0083 A[LOOP:1: B:8:0x0081->B:9:0x0083, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass3uP r13, com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout r14, java.util.List r15, int r16) {
        /*
            r4 = r15
            int r0 = r15.size()
            r1 = r16
            int r3 = java.lang.Math.min(r0, r1)
            int r7 = r15.size()
            r12 = r14
            android.util.DisplayMetrics r1 = X.AnonymousClass3Ma.A09(r14)
            r14 = 1
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = android.util.TypedValue.applyDimension(r14, r0, r1)
            int r6 = (int) r0
            android.content.Context r1 = r12.getContext()
            r0 = 2132083476(0x7f150314, float:1.9807095E38)
            X.01k r5 = new X.01k
            r5.<init>(r1, r0)
            r10 = r13
            if (r7 <= r14) goto L_0x00a2
            java.util.Iterator r9 = r15.iterator()
        L_0x002f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r1 = r9.next()
            X.4Ns r1 = (X.C85524Ns) r1
            r0 = 0
            com.whatsapp.TextEmojiLabel r8 = new com.whatsapp.TextEmojiLabel
            r8.<init>(r5, r0)
            float r0 = r13.getTextFontSize()
            r8.setTextSize(r0)
            java.lang.String r0 = r1.A02
            r8.setText(r0)
            r8.setDrawingCacheEnabled(r14)
            r2 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r8.measure(r0, r0)
            int r1 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            r8.layout(r2, r2, r1, r0)
            int r2 = r8.getMeasuredWidth()
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131166243(0x7f070423, float:1.7946726E38)
            int r1 = X.AnonymousClass3MW.A01(r1, r0)
            int r1 = r1 / r7
            int r0 = r6 * r7
            int r1 = r1 - r0
            if (r2 <= r1) goto L_0x002f
        L_0x0078:
            android.widget.LinearLayout r2 = r12.A06
            r2.setOrientation(r14)
            r2.removeAllViews()
            r13 = 0
        L_0x0081:
            if (r13 >= r3) goto L_0x00b0
            java.lang.Object r11 = r4.get(r13)
            X.4Ns r11 = (X.C85524Ns) r11
            r15 = 1
            r16 = 0
            android.content.Context r1 = r12.getContext()
            r0 = 2131100252(0x7f06025c, float:1.781288E38)
            android.content.res.ColorStateList r8 = X.C19740yt.A03(r1, r0)
            r9 = r8
            android.view.View r0 = A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.addView(r0)
            int r13 = r13 + 1
            goto L_0x0081
        L_0x00a2:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x00ae
            int r1 = r15.size()
            r0 = 2
            if (r1 < r0) goto L_0x00ae
            goto L_0x0078
        L_0x00ae:
            r14 = 0
            goto L_0x0078
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A01(X.3uP, com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout, java.util.List, int):void");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public InteractiveButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc.A0s((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        this.A07 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        this.A08 = new LinearLayout.LayoutParams(-1, -2);
        View.inflate(context, 2131625721, this);
        this.A06 = AnonymousClass3MX.A0K(this, 2131428626);
    }

    public static View A00(ColorStateList colorStateList, ColorStateList colorStateList2, AnonymousClass3uP r11, C85524Ns r12, InteractiveButtonsRowContentLayout interactiveButtonsRowContentLayout, int i, boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        View inflate = AnonymousClass3MZ.A0D(interactiveButtonsRowContentLayout).inflate(2131625724, interactiveButtonsRowContentLayout, false);
        LinearLayout A0K = AnonymousClass3MX.A0K(inflate, 2131428616);
        View A062 = AnonymousClass1HF.A06(inflate, 2131428589);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(inflate, 2131428591);
        View A063 = AnonymousClass1HF.A06(inflate, 2131428597);
        View A064 = AnonymousClass1HF.A06(inflate, 2131428598);
        if (z3 && (A0V.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            interactiveButtonsRowContentLayout.setButtonTextLeftAligned(A0V);
        }
        interactiveButtonsRowContentLayout.setButtonText(r12, A0V, r11, colorStateList);
        int i3 = r12.A00;
        if (i3 != -1) {
            Drawable mutate = C27831Xu.A02(AnonymousClass3MZ.A0B(interactiveButtonsRowContentLayout, i3)).mutate();
            C27831Xu.A03(colorStateList2, mutate);
            A0V.A0P(new C74743cP(mutate, interactiveButtonsRowContentLayout.A01), 2131165569);
        }
        A0V.measure(0, 0);
        if (r12.A03) {
            A062.setClickable(false);
        } else {
            A062.setClickable(true);
            C90104dX.A00(A062, r12, i, 14);
        }
        C88484Zw r0 = interactiveButtonsRowContentLayout.A00;
        if (r0 != null && i == 0 && !C88484Zw.A02(r0)) {
            C88484Zw r7 = interactiveButtonsRowContentLayout.A00;
            r7.A01 = new AnonymousClass4LK(A062);
            if (r7.A03()) {
                A062.setVisibility(8);
            }
        }
        String str = r12.A02;
        A062.setContentDescription(str);
        AnonymousClass1Y5.A07(A062, "Button");
        A062.setLongClickable(true);
        AnonymousClass1HF.A0f(A062, new AnonymousClass3SQ(interactiveButtonsRowContentLayout, r12, 1));
        if (z) {
            A0K.setOrientation(1);
            A0K.setLayoutParams(interactiveButtonsRowContentLayout.A08);
            if (i > 0 && z2) {
                A063.setVisibility(0);
            }
        } else {
            A0K.setOrientation(0);
            A0K.setLayoutParams(interactiveButtonsRowContentLayout.A07);
            if (i > 0 && z2) {
                A064.setVisibility(0);
            }
        }
        if (TextUtils.isEmpty(str)) {
            i2 = 8;
        }
        inflate.setVisibility(i2);
        AnonymousClass1Y5.A07(inflate, "Button");
        return inflate;
    }

    private void setButtonText(C85524Ns r2, TextEmojiLabel textEmojiLabel, AnonymousClass3uP r4, ColorStateList colorStateList) {
        textEmojiLabel.setTextSize(r4.getTextFontSize());
        textEmojiLabel.setText(r2.A02);
        textEmojiLabel.setSelected(r2.A03);
        if (colorStateList != null) {
            textEmojiLabel.setTextColor(colorStateList);
        }
    }

    private void setButtonTextLeftAligned(TextEmojiLabel textEmojiLabel) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textEmojiLabel.getLayoutParams();
        layoutParams.gravity = 19;
        textEmojiLabel.setLayoutParams(layoutParams);
        textEmojiLabel.setGravity(19);
    }

    public void setDisplayButtonsInVertical(boolean z) {
        this.A04 = z;
    }

    public InteractiveButtonsRowContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc.A0s((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public InteractiveButtonsRowContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
