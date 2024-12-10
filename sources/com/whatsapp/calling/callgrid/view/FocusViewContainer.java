package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1F9;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass48l;
import X.AnonymousClass70A;
import X.C112285lE;
import X.C113615nN;
import X.C125666bS;
import X.C24921Me;
import X.C27691Xc;
import X.C91574fu;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

public class FocusViewContainer extends ConstraintLayout implements AnonymousClass009 {
    public C125666bS A00;
    public C112285lE A01;
    public C113615nN A02;
    public MenuBottomSheetViewModel A03;
    public C24921Me A04;
    public AnonymousClass031 A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;
    public final FrameLayout A09;
    public final LinearLayout A0A;
    public final WaTextView A0B;

    public FocusViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void A00(FocusViewContainer focusViewContainer) {
        FrameLayout frameLayout = focusViewContainer.A09;
        frameLayout.setScaleX(1.0f);
        frameLayout.setScaleY(1.0f);
        frameLayout.setTranslationX(0.0f);
        frameLayout.setTranslationY(0.0f);
        focusViewContainer.A0B.animate().alpha(1.0f);
        focusViewContainer.A0A.animate().alpha(1.0f);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public C113615nN getFocusViewHolder() {
        return this.A02;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A08.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public void setMenuViewModel(AnonymousClass1F9 r4, MenuBottomSheetViewModel menuBottomSheetViewModel) {
        this.A03 = menuBottomSheetViewModel;
        menuBottomSheetViewModel.A02.A0A(r4, new C91574fu(this, 10));
    }

    public UserJid getVisiblePeerJid() {
        C113615nN r0;
        AnonymousClass70A r1;
        if (getVisibility() != 0 || (r0 = this.A02) == null || (r1 = r0.A05) == null || r1.A0N) {
            return null;
        }
        return r1.A0h;
    }

    public FocusViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A06) {
            this.A06 = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass1K1 r1 = r2.A0z;
            this.A01 = (C112285lE) r1.A6M.get();
            this.A04 = AnonymousClass3MZ.A0g(r2.A10);
            this.A00 = (C125666bS) r1.A5q.get();
        }
        LayoutInflater.from(context).inflate(2131624428, this, true);
        this.A0B = AnonymousClass3MW.A0T(this, 2131433440);
        this.A09 = (FrameLayout) AnonymousClass1HF.A06(this, 2131433443);
        this.A0A = AnonymousClass3MX.A0K(this, 2131432510);
        setOnClickListener(new AnonymousClass48l(this, 11));
        this.A08 = AnonymousClass3MW.A07();
        View A062 = AnonymousClass1HF.A06(this, 2131430941);
        ViewGroup.LayoutParams layoutParams = A062.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = this.A00.A00;
            A062.setLayoutParams(marginLayoutParams);
        }
    }

    public FocusViewContainer(Context context) {
        this(context, (AttributeSet) null);
    }
}
