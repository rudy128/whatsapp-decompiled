package com.whatsapp.calling.views;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C110975ha;
import X.C1598986h;
import X.C26281Cwc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

public class CallResponseLayout extends FrameLayout implements AnonymousClass009 {
    public View A00;
    public View A01;
    public C1598986h A02;
    public AnonymousClass11C A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final ViewConfiguration A08;
    public final C26281Cwc A09;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.A09.A0D(motionEvent);
        return true;
    }

    public CallResponseLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A03 = AnonymousClass3Ma.A0a(AnonymousClass3MW.A0O(generatedComponent()));
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.A09.A0F()) {
            postInvalidateOnAnimation();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3 && actionMasked != 1) {
            return this.A09.A0H(motionEvent);
        }
        this.A09.A0B();
        return false;
    }

    public void onVisibilityChanged(View view, int i) {
        int height;
        super.onVisibilityChanged(view, i);
        if (this.A01 != null && i == 0 && (height = (getHeight() - this.A01.getHeight()) - ((int) this.A01.getY())) != 0) {
            AnonymousClass1HF.A0a(this.A01, height);
        }
    }

    public void setCallResponseSwipeUpHintView(View view) {
        this.A00 = view;
    }

    public void setCallResponseView(View view) {
        this.A01 = view;
    }

    public void setResponseListener(C1598986h r1) {
        this.A02 = r1;
    }

    public void setShowSwipeUpHintByDefault(boolean z) {
        this.A06 = z;
    }

    public void setTouchDownAfterDrag(boolean z) {
        this.A07 = z;
    }

    public CallResponseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A03 = AnonymousClass3Ma.A0a(AnonymousClass3MW.A0O(generatedComponent()));
        }
        this.A09 = C26281Cwc.A01(this, new C110975ha(this));
        this.A08 = ViewConfiguration.get(getContext());
    }

    public CallResponseLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
