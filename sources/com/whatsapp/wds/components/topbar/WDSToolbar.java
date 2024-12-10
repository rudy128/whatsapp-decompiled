package com.whatsapp.wds.components.topbar;

import X.AnonymousClass1DC;
import X.AnonymousClass1Y0;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y2;
import X.AnonymousClass1Y3;
import X.AnonymousClass1Y4;
import X.AnonymousClass1Y5;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18110vm;
import X.C19740yt;
import X.C22891Dp;
import X.C27711Xf;
import X.C27831Xu;
import X.C27841Xv;
import X.C27851Xw;
import X.C27871Xy;
import X.C27881Xz;
import X.C64702vC;
import X.C71013Dl;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;

public final class WDSToolbar extends C27711Xf {
    public int A00;
    public ColorStateList A01;
    public C27841Xv A02;
    public C18030ve A03;
    public AnonymousClass1DC A04;
    public C27881Xz A05;
    public C27871Xy A06;
    public AnonymousClass1Y3 A07;
    public C27851Xw A08;
    public boolean A09;
    public boolean A0A;
    public TextView A0B;
    public boolean A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSToolbar(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    public void A0P(Context context, int i) {
    }

    public void A0Q(Context context, int i) {
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        if (this.A06 == C27871Xy.VISIBLE) {
            canvas2.drawLine(0.0f, ((float) getHeight()) - getDividerHeight(), (float) getWidth(), (float) getHeight(), getDividerPaint());
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
    }

    public final void setDividerVisibility(C27871Xy r2) {
        C18070vi.A0d(r2, 0);
        if (C22891Dp.A02 && this.A06 != r2) {
            this.A06 = r2;
            invalidate();
        }
    }

    public void setNavigationIconTint(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (r1 != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setViewState(X.C27851Xw r4) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r3.A08 = r4
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x0058
            X.1Y3 r2 = r4.A00
            r0 = 0
            if (r2 == 0) goto L_0x0010
            r0 = 1
        L_0x0010:
            r3.A09 = r0
            if (r2 == 0) goto L_0x0036
            android.content.Context r1 = r3.getContext()
            X.C18070vi.A0X(r1)
            int r0 = r2.A00
            int r1 = X.C19740yt.A00(r1, r0)
            r3.A00 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r3.A01 = r0
            X.1Xz r0 = r2.A01
            r3.A05 = r0
            super.setTitleTextColor((int) r1)
            super.setSubtitleTextColor((int) r1)
            super.setNavigationIconTint(r1)
        L_0x0036:
            r0 = 2131898718(0x7f12315e, float:1.9432362E38)
            super.setNavigationContentDescription((int) r0)
            android.content.Context r2 = r3.getContext()
            X.1Xw r0 = r3.A08
            java.lang.CharSequence r0 = r0.A01
            if (r0 == 0) goto L_0x004f
            boolean r1 = X.AnonymousClass1YF.A0T(r0)
            r0 = 2132084449(0x7f1506e1, float:1.9809069E38)
            if (r1 == 0) goto L_0x0052
        L_0x004f:
            r0 = 2132084447(0x7f1506df, float:1.9809065E38)
        L_0x0052:
            super.A0Q(r2, r0)
            r3.invalidate()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.topbar.WDSToolbar.setViewState(X.1Xw):void");
    }

    private final float getDividerHeight() {
        return ((Number) this.A0D.getValue()).floatValue();
    }

    private final Paint getDividerPaint() {
        return (Paint) this.A0E.getValue();
    }

    public final void A0Y() {
        AnonymousClass1Y3 r0 = this.A08.A00;
        if (r0 != null) {
            Context context = getContext();
            C18070vi.A0X(context);
            super.setTitleTextColor(C19740yt.A00(context, r0.A00));
        }
    }

    public final void A0Z() {
        setViewState(C27851Xw.A04.A00(this));
    }

    public Drawable getBackground() {
        if (!this.A0C) {
            return AnonymousClass1Y2.A00;
        }
        return super.getBackground();
    }

    public final void setIconSet(AnonymousClass1Y3 r2) {
        if (!C18070vi.A18(this.A07, r2)) {
            this.A07 = r2;
            A0Z();
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        if (drawable != null && this.A09) {
            ColorStateList colorStateList = this.A01;
            C18070vi.A0d(colorStateList, 1);
            drawable = C27831Xu.A02(drawable.mutate());
            C18070vi.A0X(drawable);
            C27831Xu.A09(drawable);
            C27831Xu.A04(colorStateList, drawable);
        }
        super.setOverflowIcon(drawable);
    }

    public void setSubtitleTextColor(int i) {
        if (!this.A09) {
            super.setSubtitleTextColor(i);
        }
    }

    public void setTitleTextColor(int i) {
        if (!this.A09) {
            super.setTitleTextColor(i);
        }
    }

    public final void A0X() {
        super.setTitleTextColor(C19740yt.A00(getContext(), 2131101201));
    }

    public final C18030ve getAbProps() {
        return this.A03;
    }

    public final C27841Xv getBidiToolbarDelegate() {
        return this.A02;
    }

    public final C27871Xy getDividerVisibility() {
        return this.A06;
    }

    public final AnonymousClass1Y3 getIconSet() {
        return this.A07;
    }

    public Menu getMenu() {
        Menu menu = super.getMenu();
        if (!this.A0A) {
            this.A0A = true;
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new C64702vC(this, 2));
            } else {
                setOverflowIcon(getOverflowIcon());
            }
        }
        C18070vi.A0b(menu);
        return menu;
    }

    public final AnonymousClass1DC getSystemFeatures() {
        return this.A04;
    }

    public final C27851Xw getViewState() {
        return this.A08;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0A && this.A09) {
            AnonymousClass1Y4.A00(this.A01, getMenu(), this.A05, this.A00);
        }
    }

    public final void setAbProps(C18030ve r1) {
        this.A03 = r1;
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        A0Z();
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        A0Z();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A0Z();
    }

    public final void setBidiToolbarDelegate(C27841Xv r1) {
        this.A02 = r1;
    }

    public void setSubtitle(int i) {
        super.setSubtitle(i);
        A0Z();
    }

    public final void setSystemFeatures(AnonymousClass1DC r1) {
        this.A04 = r1;
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        super.setTitle(charSequence);
        if (this.A0B == null && charSequence != null && charSequence.length() != 0) {
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    textView = null;
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt instanceof TextView) {
                    textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), this.A0E)) {
                        break;
                    }
                }
                i++;
            }
            this.A0B = textView;
            if (textView != null) {
                AnonymousClass1Y5.A0A(textView, true);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        context.getTheme().applyStyle(2132084450, true);
        this.A08 = C27851Xw.A04.A00(this);
        this.A06 = C27871Xy.GONE;
        this.A0D = new C18110vm(new C71013Dl(this, 24));
        this.A0E = new C18110vm(new C71013Dl(context, 25));
        int A002 = C19740yt.A00(context, 2131103368);
        this.A00 = A002;
        ColorStateList valueOf = ColorStateList.valueOf(A002);
        C18070vi.A0X(valueOf);
        this.A01 = valueOf;
        this.A05 = C27881Xz.FILLED;
        this.A0C = true;
        C27841Xv r1 = this.A02;
        if (r1 != null && !isInEditMode()) {
            setLayoutDirection(C18000vb.A00(r1.A00).A06 ? 1 : 0);
        }
        super.setContentInsetStartWithNavigation(0);
        super.A0P(context, 2132084445);
        if (attributeSet != null) {
            Context context2 = getContext();
            C18070vi.A0X(context2);
            int[] iArr = AnonymousClass1Y0.A0J;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (C22891Dp.A02) {
                C18070vi.A0d(obtainStyledAttributes, 0);
                C27871Xy r3 = C27871Xy.VISIBLE;
                C27871Xy[] values = C27871Xy.values();
                int i = obtainStyledAttributes.getInt(0, 0);
                if (i >= 0 && i < values.length) {
                    r3 = values[i];
                }
                setDividerVisibility(r3);
            }
            obtainStyledAttributes.recycle();
        }
        setOutlineProvider((ViewOutlineProvider) null);
        A0Z();
    }

    public void setSubtitle(CharSequence charSequence) {
        super.setSubtitle(charSequence);
        A0Z();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSToolbar(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
