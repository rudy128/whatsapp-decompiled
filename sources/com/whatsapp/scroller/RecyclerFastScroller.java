package com.whatsapp.scroller;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.BMB;
import X.C146777Qo;
import X.C22710BLv;
import X.C28538E6m;
import X.C37911qO;
import X.C38391rD;
import X.D52;
import X.DL4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

public class RecyclerFastScroller extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public View A01;
    public View A02;
    public CoordinatorLayout A03;
    public RecyclerView A04;
    public AppBarLayout A05;
    public C28538E6m A06;
    public AnonymousClass031 A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public C38391rD A0B;
    public boolean A0C;
    public final C37911qO A0D;
    public final Runnable A0E;

    public RecyclerFastScroller(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* access modifiers changed from: private */
    public int getVisibleHeight() {
        if (this.A03 == null || this.A05 == null) {
            return getHeight();
        }
        return Math.min(getHeight(), (this.A03.getHeight() - this.A05.getHeight()) + this.A00);
    }

    public void A02() {
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null && this.A0C) {
            Runnable runnable = this.A0E;
            recyclerView.removeCallbacks(runnable);
            this.A04.postDelayed(runnable, (long) this.A0A);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public int getHideDelay() {
        return this.A0A;
    }

    public void setAdapter(C38391rD r3) {
        C38391rD r0 = this.A0B;
        if (r0 != r3) {
            if (r0 != null) {
                r0.A01.unregisterObserver(this.A0D);
            }
            if (r3 != null) {
                r3.CDq(this.A0D);
            }
            this.A0B = r3;
        }
    }

    public void setAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.A03 = coordinatorLayout;
        this.A05 = appBarLayout;
        appBarLayout.A03(new DL4(this));
    }

    public void setBubbleView(View view, C28538E6m e6m) {
        this.A06 = e6m;
        this.A01 = view;
        view.setVisibility(4);
        addView(this.A01, -2, -2);
    }

    public void setHidingEnabled(boolean z) {
        this.A0C = z;
        if (z) {
            A02();
        }
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.A04 = recyclerView;
        recyclerView.A0t(new BMB(this, 4));
        C38391rD r0 = recyclerView.A0B;
        if (r0 != null) {
            setAdapter(r0);
        }
    }

    public void setThumbView(View view) {
        View view2 = this.A02;
        if (view2 != null) {
            removeView(view2);
        }
        this.A02 = view;
        view.setVisibility(4);
        this.A02.setOnTouchListener(new D52(this));
        addView(this.A02, -2, -2);
    }

    public static void A01(RecyclerFastScroller recyclerFastScroller) {
        recyclerFastScroller.requestLayout();
        if (recyclerFastScroller.A02.getVisibility() != 0) {
            recyclerFastScroller.A02.setVisibility(0);
            float f = 1.0f;
            if (recyclerFastScroller.A09) {
                f = -1.0f;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(200);
            recyclerFastScroller.A02.startAnimation(translateAnimation);
        }
        recyclerFastScroller.A02();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int totalScrollRange;
        int i5;
        int right;
        int left;
        int top;
        int left2;
        super.onLayout(z, i, i2, i3, i4);
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset() + this.A00;
            int computeVerticalScrollRange = this.A04.computeVerticalScrollRange();
            AppBarLayout appBarLayout = this.A05;
            int i6 = 0;
            if (appBarLayout == null) {
                totalScrollRange = 0;
            } else {
                totalScrollRange = appBarLayout.getTotalScrollRange();
            }
            int visibleHeight = getVisibleHeight();
            float paddingBottom = ((float) computeVerticalScrollOffset) / ((float) (((computeVerticalScrollRange + totalScrollRange) + this.A04.getPaddingBottom()) - visibleHeight));
            View view = this.A02;
            if (view != null) {
                float height = paddingBottom * ((float) (visibleHeight - view.getHeight()));
                boolean z2 = this.A09;
                View view2 = this.A02;
                if (z2) {
                    i5 = (int) height;
                    right = view2.getWidth();
                } else {
                    i6 = getRight() - this.A02.getWidth();
                    i5 = (int) height;
                    right = getRight();
                }
                view2.layout(i6, i5, right, AnonymousClass3MW.A02(this.A02, i5));
                View view3 = this.A01;
                if (view3 != null) {
                    boolean z3 = this.A09;
                    View view4 = this.A02;
                    if (z3) {
                        left = view4.getRight();
                        top = ((this.A02.getTop() + this.A02.getBottom()) - this.A01.getHeight()) / 2;
                        left2 = this.A02.getRight() + this.A01.getWidth();
                    } else {
                        left = view4.getLeft() - this.A01.getWidth();
                        top = ((this.A02.getTop() + this.A02.getBottom()) - this.A01.getHeight()) / 2;
                        left2 = this.A02.getLeft();
                    }
                    view3.layout(left, top, left2, AnonymousClass3MW.A02(this.A01, this.A02.getTop() + this.A02.getBottom()) / 2);
                }
            }
        }
    }

    public void setHideDelay(int i) {
        this.A0A = i;
    }

    public void setRtl(boolean z) {
        this.A09 = z;
    }

    public RecyclerFastScroller(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public RecyclerFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerFastScroller(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        if (!this.A08) {
            this.A08 = true;
            generatedComponent();
        }
        this.A0D = new C22710BLv(this, 2);
        this.A0E = new C146777Qo((Object) this, 4);
        this.A0A = 1500;
        this.A0C = true;
    }
}
