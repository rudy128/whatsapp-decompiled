package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1HF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass70N;
import X.AnonymousClass7J5;
import X.AnonymousClass7JK;
import X.AnonymousClass87O;
import X.AnonymousClass87Q;
import X.C136926ud;
import X.C137296vE;
import X.C1409773u;
import X.C18070vi;
import X.C29111bd;
import X.C72463Mc;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView;

public final class ColorPickerComponent extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass87O A00;
    public ColorPickerView A01;
    public UniversalToolPickerView A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public boolean A05;
    public float A06;
    public View A07;
    public ViewGroup A08;
    public C136926ud A09;
    public AnonymousClass87Q A0A;
    public final int A0B;

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A01(configuration.orientation);
    }

    public final void setInsets(Rect rect) {
        C18070vi.A0d(rect, 0);
        ViewGroup viewGroup = this.A08;
        if (viewGroup != null) {
            ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(viewGroup);
            A0P.leftMargin = rect.left;
            A0P.topMargin = rect.top;
            A0P.rightMargin = rect.right;
            A0P.bottomMargin = rect.bottom;
            viewGroup.setLayoutParams(A0P);
        }
    }

    private final void A00(int i) {
        ColorPickerView colorPickerView = this.A01;
        if (colorPickerView != null) {
            colorPickerView.clearAnimation();
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i);
            loadAnimation.setInterpolator(C29111bd.A00(0.5f, 1.35f, 0.4f, 1.0f));
            colorPickerView.startAnimation(loadAnimation);
        }
    }

    private final void A01(int i) {
        int i2;
        View view = this.A07;
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int A012 = AnonymousClass3MW.A01(getResources(), 2131165929);
            int paddingRight = view.getPaddingRight();
            if (i == 2) {
                i2 = AnonymousClass3MW.A01(getResources(), 2131165925);
            } else {
                i2 = 0;
            }
            view.setPadding(paddingLeft, A012, paddingRight, i2);
        }
    }

    public static final void A02(ColorPickerComponent colorPickerComponent) {
        UniversalToolPickerView universalToolPickerView = colorPickerComponent.A02;
        if (universalToolPickerView != null) {
            AnonymousClass87Q r2 = colorPickerComponent.A0A;
            if (r2 != null) {
                r2.CKu(universalToolPickerView.getViewModel().A01, colorPickerComponent.A06);
            }
            AnonymousClass87Q r0 = colorPickerComponent.A0A;
            if (r0 != null) {
                AnonymousClass70N r22 = ((DoodleView) r0).A0M;
                C1409773u r02 = r22.A02;
                C1409773u r1 = r22.A01;
                if (r02 != null && r02 == r1) {
                    AnonymousClass70N.A00(r22.A00, r1, r22);
                    r22.A02 = null;
                    r22.A00 = null;
                }
            }
            AnonymousClass87O r03 = colorPickerComponent.A00;
            if (r03 != null) {
                r03.C9Z();
            }
        }
    }

    public final void A04(C136926ud r12, AnonymousClass87O r13, AnonymousClass87Q r14, boolean z, boolean z2) {
        int selectedColor;
        this.A05 = z2;
        this.A0A = r14;
        this.A00 = r13;
        this.A09 = r12;
        LayoutInflater A0D = AnonymousClass3MZ.A0D(this);
        if (z) {
            View inflate = A0D.inflate(2131624556, this, true);
            C18070vi.A0z(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            if (this.A02 == null) {
                this.A02 = (UniversalToolPickerView) AnonymousClass1HF.A06(viewGroup, 2131436503);
                selectedColor = -16777216;
            } else {
                selectedColor = getSelectedColor();
            }
            UniversalToolPickerView universalToolPickerView = this.A02;
            if (universalToolPickerView != null) {
                universalToolPickerView.A05(new AnonymousClass7JK(this, 0), 1, 2, 1, selectedColor, 0, this.A05, false);
            }
            this.A08 = viewGroup;
        } else {
            View inflate2 = A0D.inflate(2131624557, this, true);
            C18070vi.A0z(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) inflate2;
            this.A01 = (ColorPickerView) AnonymousClass1HF.A06(viewGroup2, 2131429188);
            this.A07 = AnonymousClass1HF.A06(viewGroup2, 2131429191);
            this.A08 = viewGroup2;
            ColorPickerView colorPickerView = this.A01;
            if (colorPickerView != null) {
                colorPickerView.setImportantForAccessibility(1);
                C137296vE.A00(colorPickerView, colorPickerView.A01);
            }
            A01(getResources().getConfiguration().orientation);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = AnonymousClass3MW.A01(getResources(), 2131165926);
            setLayoutParams(layoutParams);
        }
        this.A09 = r12;
        this.A0A = r14;
        this.A00 = r13;
        if (r14 != null) {
            r14.CKu(getSelectedColor(), getSelectedStrokeSize());
        }
        ColorPickerView colorPickerView2 = this.A01;
        if (colorPickerView2 != null) {
            colorPickerView2.A04 = new AnonymousClass7J5(r13, this, r14);
        }
    }

    public final boolean A06() {
        ColorPickerView colorPickerView = this.A01;
        if (colorPickerView != null && colorPickerView.getVisibility() == 0) {
            return true;
        }
        UniversalToolPickerView universalToolPickerView = this.A02;
        if (universalToolPickerView == null || universalToolPickerView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final float getMinSize() {
        int i;
        ColorPickerView colorPickerView = this.A01;
        if (colorPickerView != null) {
            i = colorPickerView.A02;
        } else {
            i = this.A0B;
        }
        return (float) i;
    }

    public final int getSelectedColor() {
        ColorPickerView colorPickerView = this.A01;
        if (colorPickerView != null) {
            return colorPickerView.A01;
        }
        UniversalToolPickerView universalToolPickerView = this.A02;
        if (universalToolPickerView != null) {
            return universalToolPickerView.getViewModel().A01;
        }
        return -16777216;
    }

    public final float getSelectedStrokeSize() {
        ColorPickerView colorPickerView = this.A01;
        if (colorPickerView != null) {
            return colorPickerView.A00;
        }
        return this.A06;
    }

    public final void setColorAndInvalidate(int i) {
        ColorPickerView colorPickerView = this.A01;
        if (colorPickerView != null) {
            colorPickerView.setColorAndInvalidate(i);
        }
        UniversalToolPickerView universalToolPickerView = this.A02;
        if (universalToolPickerView != null) {
            universalToolPickerView.A03(i);
        }
    }

    public final void setSizeAndInvalidate(float f) {
        ColorPickerView colorPickerView = this.A01;
        if (colorPickerView != null) {
            colorPickerView.setSizeAndInvalidate(f);
        }
        this.A06 = f;
    }

    public ColorPickerComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        int A012 = AnonymousClass3MW.A01(getResources(), 2131166566);
        this.A0B = A012;
        this.A06 = (float) A012;
    }

    public final void A03() {
        if (!A06()) {
            ColorPickerView colorPickerView = this.A01;
            if (colorPickerView != null) {
                colorPickerView.setVisibility(0);
            }
            UniversalToolPickerView universalToolPickerView = this.A02;
            if (universalToolPickerView != null) {
                universalToolPickerView.A03(getSelectedColor());
            }
            UniversalToolPickerView universalToolPickerView2 = this.A02;
            if (universalToolPickerView2 != null) {
                universalToolPickerView2.setVisibility(0);
            }
            A00(2130772002);
        }
        C136926ud r0 = this.A09;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final void A05(boolean z) {
        if (A06()) {
            if (z) {
                A00(2130772003);
            }
            ColorPickerView colorPickerView = this.A01;
            if (colorPickerView != null) {
                colorPickerView.setVisibility(4);
            }
            UniversalToolPickerView universalToolPickerView = this.A02;
            if (universalToolPickerView != null) {
                universalToolPickerView.setVisibility(4);
            }
        }
    }

    public ColorPickerComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public /* synthetic */ ColorPickerComponent(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    public ColorPickerComponent(Context context) {
        this(context, (AttributeSet) null, 0);
    }
}
