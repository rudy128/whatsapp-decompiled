package com.whatsapp.wds.components.actiontile;

import X.AnonymousClass03S;
import X.AnonymousClass1Y0;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3QW;
import X.C18030ve;
import X.C18070vi;
import X.C28081Yu;
import X.C29261bv;
import X.C72463Mc;
import X.C86044Py;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Space;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WDSActionTile extends AnonymousClass3QW {
    public int A00;
    public int A01;
    public WaImageView A02;
    public WaTextView A03;
    public C18030ve A04;
    public C86044Py A05;
    public boolean A06 = true;
    public Space A07;
    public boolean A08 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSActionTile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A00;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                this.A01 = resourceId;
            }
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            this.A06 = obtainStyledAttributes.getBoolean(1, true);
            super.setOrientation(obtainStyledAttributes.getInt(2, 1));
            obtainStyledAttributes.recycle();
        }
        LayoutInflater.from(context).inflate(2131627549, this);
        this.A02 = AnonymousClass3MW.A0S(this, 2131427531);
        WaTextView A0U = AnonymousClass3MW.A0U(this, 2131427532);
        this.A03 = A0U;
        if (A0U != null) {
            A0U.setMaxLines(getResources().getInteger(2131492942));
        }
        this.A07 = (Space) findViewById(2131427533);
        setClickable(this.A06);
        setFocusable(this.A06);
        A00();
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    private final void A00() {
        if (this.A08) {
            this.A05 = new C86044Py(AnonymousClass3MY.A04(this));
            WaTextView waTextView = this.A03;
            if (waTextView != null) {
                waTextView.setEnabled(this.A06);
            }
            int i = this.A01;
            if (i != 0) {
                setText(i);
            }
            A01();
            A04();
            A05();
            WaImageView waImageView = this.A02;
            if (waImageView != null) {
                waImageView.setEnabled(this.A06);
                waImageView.setImageResource(this.A00);
                C86044Py r8 = this.A05;
                if (r8 != null) {
                    Context context = r8.A00;
                    C18070vi.A0d(context, 0);
                    C28081Yu.A00(new ColorStateList(new int[][]{new int[]{16842910}, new int[0]}, new int[]{AnonymousClass3Ma.A00(context, 2130971952, 2131103094), AnonymousClass3Ma.A00(context, 2130971980, 2131103157)}), waImageView);
                }
                AnonymousClass3MW.A19();
                throw null;
            }
            A03();
            C86044Py r1 = this.A05;
            if (r1 != null) {
                setBackground(r1.A00(this.A06));
                A02();
                AnonymousClass3MW.A1Q(this);
                return;
            }
            AnonymousClass3MW.A19();
            throw null;
        }
    }

    private final void A01() {
        WaTextView waTextView = this.A03;
        if (waTextView == null) {
            return;
        }
        if (this.A05 == null) {
            AnonymousClass3MW.A19();
            throw null;
        }
        int i = 2132084419;
        if (getOrientation() == 1) {
            i = 2132084414;
        }
        C29261bv.A08(waTextView, i);
    }

    private final void A02() {
        int i;
        int dimensionPixelSize;
        int A012;
        int A013;
        C86044Py r2 = this.A05;
        if (r2 == null) {
            AnonymousClass3MW.A19();
            throw null;
        }
        int orientation = getOrientation();
        Context context = r2.A00;
        if (orientation == 1) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169535);
            i = 2131169545;
            A012 = context.getResources().getDimensionPixelSize(2131169545);
            A013 = AnonymousClass3MZ.A01(context, 2131169535);
        } else {
            i = 2131169545;
            dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169545);
            A012 = AnonymousClass3MZ.A01(context, 2131169545);
            A013 = AnonymousClass3MZ.A01(context, 2131169545);
        }
        setPadding(dimensionPixelSize, A012, A013, AnonymousClass3MZ.A01(context, i));
    }

    private final void A03() {
        if (this.A05 == null) {
            AnonymousClass3MW.A19();
            throw null;
        }
        int i = 2131169544;
        if (getOrientation() == 1) {
            i = 2131169535;
        }
        Space space = this.A07;
        if (space != null) {
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = AnonymousClass3Ma.A02(this, i);
            }
            space.requestLayout();
        }
    }

    private final void A04() {
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            C86044Py r1 = this.A05;
            if (r1 == null) {
                AnonymousClass3MW.A19();
                throw null;
            }
            boolean z = this.A06;
            Context context = r1.A00;
            int i = 2130971980;
            int i2 = 2131103157;
            if (z) {
                i = 2130971979;
                i2 = 2131103155;
            }
            C18070vi.A0d(context, 0);
            C72463Mc.A0y(context, waTextView, i, i2);
        }
    }

    private final void A05() {
        WaTextView waTextView = this.A03;
        if (waTextView == null) {
            return;
        }
        if (this.A05 == null) {
            AnonymousClass3MW.A19();
            throw null;
        }
        int i = 1;
        if (getOrientation() != 1) {
            i = 8388611;
        }
        waTextView.setGravity(i);
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final WaTextView getLabelView$app_ui_wds_wds() {
        return this.A03;
    }

    public final void setIcon(int i) {
        WaImageView waImageView = this.A02;
        if (waImageView != null) {
            waImageView.setImageDrawable(AnonymousClass03S.A01(getContext(), i));
        }
    }

    public final void setText(int i) {
        this.A01 = i;
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            waTextView.setText(i);
        }
        AnonymousClass1Y5.A03(this, this.A01);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A06 = z;
        A04();
        C86044Py r1 = this.A05;
        if (r1 == null) {
            AnonymousClass3MW.A19();
            throw null;
        }
        setBackground(r1.A00(this.A06));
        setClickable(z);
        setFocusable(z);
    }

    public void setOrientation(int i) {
        super.setOrientation(i);
        if (!this.A08) {
            return;
        }
        if (this.A05 == null) {
            A00();
            return;
        }
        A01();
        A05();
        A03();
        A02();
    }

    public final void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A02;
        if (waImageView != null) {
            waImageView.setImageDrawable(drawable);
        }
    }

    public final void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            waTextView.setText(charSequence);
        }
        setContentDescription(charSequence);
    }
}
