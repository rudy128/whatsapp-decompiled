package com.google.android.exoplayer2.ui;

import X.AnonymousClass000;
import X.BE6;
import X.BEA;
import X.BIT;
import X.C22640BHa;
import X.C25589CiU;
import X.E58;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout {
    public float A00;
    public boolean A01;
    public boolean A02;
    public float A03;
    public int A04;
    public View A05;
    public C25589CiU A06;
    public E58 A07;
    public List A08;

    private void A00() {
        this.A07.CQM(this.A06, getCuesWithStylingPreferencesApplied(), this.A00, this.A03);
    }

    private List getCuesWithStylingPreferencesApplied() {
        if (this.A02 && this.A01) {
            return this.A08;
        }
        ArrayList A14 = AnonymousClass000.A14(this.A08);
        if (0 >= this.A08.size()) {
            return A14;
        }
        this.A08.get(0);
        throw AnonymousClass000.A0s("text");
    }

    private float getUserCaptionFontScale() {
        CaptioningManager A0P;
        if (isInEditMode() || (A0P = BEA.A0P(this)) == null || !A0P.isEnabled()) {
            return 1.0f;
        }
        return A0P.getFontScale();
    }

    private void setView(View view) {
        removeView(this.A05);
        View view2 = this.A05;
        if (view2 instanceof BIT) {
            ((BIT) view2).A03.destroy();
        }
        this.A05 = view;
        this.A07 = (E58) view;
        addView(view);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.A01 = z;
        A00();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.A02 = z;
        A00();
    }

    public void setBottomPaddingFraction(float f) {
        this.A03 = f;
        A00();
    }

    public void setCues(List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.A08 = list;
        A00();
    }

    public void setFractionalTextSize(float f) {
        this.A00 = f;
        A00();
    }

    public void setStyle(C25589CiU ciU) {
        this.A06 = ciU;
        A00();
    }

    public void setViewType(int i) {
        View bHa;
        if (this.A04 != i) {
            if (i == 1) {
                bHa = new C22640BHa(getContext(), (AttributeSet) null);
            } else if (i == 2) {
                bHa = new BIT(getContext());
            } else {
                throw BE6.A0j();
            }
            setView(bHa);
            this.A04 = i;
        }
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08 = Collections.emptyList();
        this.A06 = C25589CiU.A05;
        this.A00 = 0.0533f;
        this.A03 = 0.08f;
        this.A02 = true;
        this.A01 = true;
        C22640BHa bHa = new C22640BHa(context, attributeSet);
        this.A07 = bHa;
        this.A05 = bHa;
        addView(bHa);
        this.A04 = 1;
    }

    private C25589CiU getUserCaptionStyle() {
        CaptioningManager A0P;
        int i;
        int i2;
        int i3;
        int i4;
        if (isInEditMode() || (A0P = BEA.A0P(this)) == null || !A0P.isEnabled()) {
            return C25589CiU.A05;
        }
        CaptioningManager.CaptionStyle userStyle = A0P.getUserStyle();
        if (userStyle.hasForegroundColor()) {
            i = userStyle.foregroundColor;
        } else {
            i = -1;
        }
        if (userStyle.hasBackgroundColor()) {
            i2 = userStyle.backgroundColor;
        } else {
            i2 = -16777216;
        }
        userStyle.hasWindowColor();
        if (userStyle.hasEdgeType()) {
            i3 = userStyle.edgeType;
        } else {
            i3 = 0;
        }
        if (userStyle.hasEdgeColor()) {
            i4 = userStyle.edgeColor;
        } else {
            i4 = -1;
        }
        return new C25589CiU(userStyle.getTypeface(), i, i2, i3, i4);
    }

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }
}
