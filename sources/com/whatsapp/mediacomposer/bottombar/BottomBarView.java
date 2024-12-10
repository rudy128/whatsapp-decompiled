package com.whatsapp.mediacomposer.bottombar;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass3MW;
import X.AnonymousClass78K;
import X.C108945cZ;
import X.C109195cy;
import X.C18030ve;
import X.C18070vi;
import X.C24641Lc;
import X.C27691Xc;
import X.C28931bI;
import X.C72453Mb;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.WaImageButton;

public final class BottomBarView extends RelativeLayout implements AnonymousClass009 {
    public C18030ve A00;
    public C24641Lc A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public final WaImageButton A04;
    public final C28931bI A05;
    public final C28931bI A06;

    public static final void setStatusMentionsToolTipVisible$lambda$1(BottomBarView bottomBarView, View view) {
        C18070vi.A0d(bottomBarView, 0);
        bottomBarView.A06.A04(8);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setAddStandaloneButtonClick(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        this.A04.setOnClickListener(onClickListener);
    }

    public final void setMuteButtonClickListener(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        this.A05.A02().findViewById(2131432886).setOnClickListener(onClickListener);
    }

    public final void setStatusConfig(C24641Lc r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setTrimButtonClickLister(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        this.A05.A02().findViewById(2131436447).setOnClickListener(onClickListener);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final Animator getBottomBarHideAnimator() {
        Property property = View.ALPHA;
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 1065353216;
        A1V[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property, A1V);
        C109195cy.A02(ofFloat, this, 14);
        return ofFloat;
    }

    public final Animator getBottomBarShowAnimator() {
        Property property = View.ALPHA;
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property, A1V);
        C109195cy.A02(ofFloat, this, 15);
        return ofFloat;
    }

    public final C24641Lc getStatusConfig() {
        C24641Lc r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusConfig");
        throw null;
    }

    public final void setAddStandaloneButtonVisibility(int i) {
        this.A04.setVisibility(i);
    }

    public final void setStatusMentionsToolTipVisible(boolean z) {
        C28931bI r1 = this.A06;
        r1.A04(C72453Mb.A07(z ? 1 : 0));
        if (r1.A01() == 0) {
            AnonymousClass78K.A00(r1.A02(), this, 22);
        }
    }

    public BottomBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            C27691Xc.A0z((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public BottomBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            C27691Xc.A0z((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        View.inflate(context, 2131625954, this);
        this.A04 = (WaImageButton) C18070vi.A05(this, 2131427583);
        this.A06 = C28931bI.A00(this, 2131432491);
        this.A05 = C28931bI.A00(this, 2131428321);
    }
}
