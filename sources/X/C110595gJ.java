package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.5gJ  reason: invalid class name and case insensitive filesystem */
public final class C110595gJ extends LinearLayout {
    public Drawable A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public C29341c3 A06;
    public C136836uU A07;
    public int A08 = 2;
    public View A09;
    public final /* synthetic */ TabLayout A0A;

    public int getContentHeight() {
        int i = 0;
        View[] viewArr = {this.A05, this.A03, this.A09};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getTop());
                    i2 = Math.max(i2, view.getBottom());
                } else {
                    i3 = view.getTop();
                    i2 = view.getBottom();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    public int getContentWidth() {
        int i = 0;
        View[] viewArr = {this.A05, this.A03, this.A09};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getLeft());
                    i2 = Math.max(i2, view.getRight());
                } else {
                    i3 = view.getLeft();
                    i2 = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110595gJ(Context context, TabLayout tabLayout) {
        super(context);
        this.A0A = tabLayout;
        A02(context, this);
        setPaddingRelative(tabLayout.A0D, tabLayout.A0E, tabLayout.A0C, tabLayout.A0B);
        setGravity(17);
        setOrientation(tabLayout.A0M ^ true ? 1 : 0);
        setClickable(true);
        AnonymousClass1HF.A0j(this, C29301bz.A00(getContext()));
    }

    private void A00() {
        if (this.A06 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.A01;
            if (view != null) {
                C60292nl.A01(view, this.A06);
                this.A01 = null;
            }
        }
    }

    private void A01() {
        TextView textView;
        C29341c3 r3 = this.A06;
        if (r3 == null) {
            return;
        }
        if (this.A09 != null || (textView = this.A05) == null || this.A07 == null) {
            A00();
        } else if (this.A01 != textView) {
            A00();
            TextView textView2 = this.A05;
            if (this.A06 != null && textView2 != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                C60292nl.A00(textView2, this.A06);
                this.A01 = textView2;
            }
        } else {
            Rect A072 = AnonymousClass3MW.A07();
            textView.getDrawingRect(A072);
            r3.setBounds(A072);
            r3.A08(textView, (FrameLayout) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r6, X.C110595gJ r7) {
        /*
            com.google.android.material.tabs.TabLayout r5 = r7.A0A
            int r0 = r5.A0b
            r4 = 0
            if (r0 == 0) goto L_0x0054
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r6, r0)
            r7.A00 = r0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r1 = r7.A00
            int[] r0 = r7.getDrawableState()
            r1.setState(r0)
        L_0x001e:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r0 = 0
            r3.setColor(r0)
            android.content.res.ColorStateList r0 = r5.A0H
            if (r0 == 0) goto L_0x004b
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            r2.setCornerRadius(r0)
            r0 = -1
            r2.setColor(r0)
            android.content.res.ColorStateList r0 = r5.A0H
            android.content.res.ColorStateList r1 = X.AnonymousClass1ZD.A01(r0)
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x0052
            r3 = r4
        L_0x0045:
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            r0.<init>(r1, r3, r4)
            r3 = r0
        L_0x004b:
            r7.setBackground(r3)
            r5.invalidate()
            return
        L_0x0052:
            r4 = r2
            goto L_0x0045
        L_0x0054:
            r7.A00 = r4
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110595gJ.A02(android.content.Context, X.5gJ):void");
    }

    public static void A03(ImageView imageView, TextView textView, C110595gJ r10, boolean z) {
        CharSequence charSequence;
        int i;
        C136836uU r0 = r10.A07;
        CharSequence charSequence2 = null;
        if (r0 != null) {
            charSequence = r0.A05;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable((Drawable) null);
        }
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            CharSequence charSequence3 = charSequence;
            if (!z3) {
                z2 = false;
                charSequence3 = null;
            }
            textView.setText(charSequence3);
            textView.setVisibility(C72453Mb.A0J(z2));
            if (z3) {
                r10.setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(imageView);
            if (!z2 || imageView.getVisibility() != 0) {
                i = 0;
            } else {
                i = (int) AnonymousClass1YU.A00(r10.getContext(), 8);
            }
            if (r10.A0A.A0M) {
                if (i != A0B.getMarginEnd()) {
                    A0B.setMarginEnd(i);
                    A0B.bottomMargin = 0;
                    imageView.setLayoutParams(A0B);
                    imageView.requestLayout();
                }
            } else if (i != A0B.bottomMargin) {
                A0B.bottomMargin = i;
                A0B.setMarginEnd(0);
                imageView.setLayoutParams(A0B);
                imageView.requestLayout();
            }
        }
        C136836uU r02 = r10.A07;
        if (r02 != null) {
            charSequence2 = r02.A04;
        }
        if (Build.VERSION.SDK_INT > 23) {
            if (!z3) {
                charSequence = charSequence2;
            }
            AnonymousClass03N.A00(r10, charSequence);
        }
    }

    private C29341c3 getOrCreateBadge() {
        if (this.A06 == null) {
            this.A06 = new C29341c3(getContext(), (C64542uw) null);
        }
        A01();
        C29341c3 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0n("Unable to create badge");
    }

    public final void A05() {
        TextView textView;
        int i;
        View view;
        ViewParent parent;
        C136836uU r3 = this.A07;
        ImageView imageView = null;
        if (r3 == null || (view = r3.A01) == null) {
            View view2 = this.A09;
            if (view2 != null) {
                removeView(view2);
                this.A09 = null;
            }
            this.A04 = null;
        } else {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view3 = this.A09;
                if (!(view3 == null || (parent = view3.getParent()) == null)) {
                    ((ViewGroup) parent).removeView(this.A09);
                }
                addView(view);
            }
            this.A09 = view;
            TextView textView2 = this.A05;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            ImageView imageView2 = this.A03;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                this.A03.setImageDrawable((Drawable) null);
            }
            TextView A0E = C17880vN.A0E(view, 16908308);
            this.A04 = A0E;
            if (A0E != null) {
                this.A08 = A0E.getMaxLines();
            }
            imageView = AnonymousClass3MW.A0H(view, 16908294);
        }
        this.A02 = imageView;
        if (this.A09 == null) {
            if (this.A03 == null) {
                ImageView imageView3 = (ImageView) AnonymousClass3MZ.A0D(this).inflate(2131625074, this, false);
                this.A03 = imageView3;
                addView(imageView3, 0);
            }
            if (this.A05 == null) {
                TextView textView3 = (TextView) AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(this), this, 2131625075);
                this.A05 = textView3;
                addView(textView3);
                this.A08 = this.A05.getMaxLines();
            }
            TextView textView4 = this.A05;
            TabLayout tabLayout = this.A0A;
            C29261bv.A08(textView4, tabLayout.A0a);
            if (!isSelected() || (i = tabLayout.A04) == -1) {
                textView = this.A05;
                i = tabLayout.A0c;
            } else {
                textView = this.A05;
            }
            C29261bv.A08(textView, i);
            ColorStateList colorStateList = tabLayout.A0I;
            if (colorStateList != null) {
                this.A05.setTextColor(colorStateList);
            }
            A03(this.A03, this.A05, this, true);
            A01();
            ImageView imageView4 = this.A03;
            if (imageView4 != null) {
                imageView4.addOnLayoutChangeListener(new AnonymousClass78Z(this, imageView4, 0));
            }
            TextView textView5 = this.A05;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new AnonymousClass78Z(this, textView5, 0));
            }
        } else {
            TextView textView6 = this.A04;
            if (!(textView6 == null && imageView == null)) {
                A03(imageView, textView6, this, false);
            }
        }
        if (r3 != null && !TextUtils.isEmpty(r3.A04)) {
            setContentDescription(r3.A04);
        }
    }

    public void setTab(C136836uU r2) {
        if (r2 != this.A07) {
            this.A07 = r2;
            A04();
        }
    }

    private C29341c3 getBadge() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r2 = this;
            r2.A05()
            X.6uU r0 = r2.A07
            if (r0 == 0) goto L_0x000e
            boolean r1 = r0.A03()
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r2.setSelected(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110595gJ.A04():void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful() && this.A00.setState(drawableState)) {
            invalidate();
            this.A0A.invalidate();
        }
    }

    public C136836uU getTab() {
        return this.A07;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C29341c3 r0 = this.A06;
        if (r0 != null && r0.isVisible()) {
            StringBuilder A0f = C17890vO.A0f(getContentDescription());
            A0f.append(", ");
            accessibilityNodeInfo.setContentDescription(C17890vO.A0V(this.A06.A06(), A0f));
        }
        C26228CvK cvK = new C26228CvK(accessibilityNodeInfo);
        cvK.A0a(C25476CgV.A00(0, 1, this.A07.A00, 1, false, isSelected()));
        if (isSelected()) {
            cvK.A0f(false);
            cvK.A0M(C26137Ct0.A08);
        }
        cvK.A0V(getResources().getString(2131899098));
    }

    public void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.A0A;
        int i3 = tabLayout.A0A;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.A05 != null) {
            float f = tabLayout.A01;
            int i4 = this.A08;
            ImageView imageView = this.A03;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.A05;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.A00;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.A05.getTextSize();
            int lineCount = this.A05.getLineCount();
            int maxLines = this.A05.getMaxLines();
            if (f == textSize && (maxLines < 0 || i4 == maxLines)) {
                return;
            }
            if (tabLayout.A03 != 1 || f <= textSize || lineCount != 1 || ((layout = this.A05.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= ((float) C72473Md.A07(this, getMeasuredWidth())))) {
                this.A05.setTextSize(0, f);
                this.A05.setMaxLines(i4);
                super.onMeasure(i, i2);
            }
        }
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.A07 == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.A07.A00();
        return true;
    }

    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.A05;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.A03;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.A09;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
