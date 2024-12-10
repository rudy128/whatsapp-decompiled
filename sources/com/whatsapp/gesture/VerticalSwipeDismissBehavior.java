package com.whatsapp.gesture;

import X.AnonymousClass1HF;
import X.AnonymousClass1Xr;
import X.AnonymousClass3MW;
import X.BE6;
import X.BEA;
import X.BLD;
import X.C108945cZ;
import X.C146867Qx;
import X.C26281Cwc;
import X.C41501wV;
import X.E9X;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

public class VerticalSwipeDismissBehavior extends C41501wV {
    public float A00 = 0.0f;
    public int A01;
    public VelocityTracker A02;
    public C26281Cwc A03;
    public E9X A04;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public WeakReference A08;
    public boolean A09;
    public boolean A0A;
    public final float A0B;

    public boolean A0M(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        this.A0A = false;
        return (i & 2) != 0;
    }

    public void A0G(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        float yVelocity;
        WeakReference weakReference = this.A08;
        if (weakReference != null && view2 == weakReference.get() && this.A0A) {
            VelocityTracker velocityTracker = this.A02;
            if (velocityTracker == null) {
                yVelocity = 0.0f;
            } else {
                velocityTracker.computeCurrentVelocity(1000, this.A0B);
                yVelocity = this.A02.getYVelocity(this.A01);
            }
            if (Math.abs(yVelocity) <= ((float) (view.getHeight() * 2))) {
                int top = view.getTop();
                if (Math.abs(top) < BE6.A04(C108945cZ.A04(view), 0.2f)) {
                    if (this.A03.A0J(view, view.getLeft(), 0)) {
                        view.postOnAnimation(new C146867Qx(this, view, 0, false));
                    }
                    this.A0A = false;
                }
            }
            this.A04.Brt();
            this.A0A = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(android.view.View r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int[] r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.A08
            java.lang.Object r0 = r0.get()
            if (r6 != r0) goto L_0x003f
            int r2 = r5.getTop()
            r1 = 1
            if (r10 <= 0) goto L_0x0040
            boolean r0 = r6.canScrollVertically(r1)
            if (r0 == 0) goto L_0x0050
            if (r2 <= 0) goto L_0x0021
            int r0 = java.lang.Math.min(r10, r2)
        L_0x001b:
            r8[r1] = r0
            int r0 = -r0
            X.AnonymousClass1HF.A0a(r5, r0)
        L_0x0021:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x003f
            X.E9X r3 = r4.A04
            int r0 = r5.getTop()
            int r0 = java.lang.Math.abs(r0)
            float r2 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r1
            float r0 = X.C108945cZ.A04(r5)
            float r2 = r2 / r0
            float r0 = java.lang.Math.min(r1, r2)
            r3.C5n(r0)
        L_0x003f:
            return
        L_0x0040:
            if (r10 >= 0) goto L_0x0021
            r0 = -1
            boolean r0 = r6.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0050
            if (r2 >= 0) goto L_0x0021
            int r0 = java.lang.Math.max(r10, r2)
            goto L_0x001b
        L_0x0050:
            r8[r1] = r10
            int r0 = -r10
            X.AnonymousClass1HF.A0a(r5, r0)
            r4.A0A = r1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gesture.VerticalSwipeDismissBehavior.A0H(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int[], int, int, int):void");
    }

    public boolean A0N(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        this.A08.get();
        return false;
    }

    public VerticalSwipeDismissBehavior(Context context) {
        this.A0B = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private View A00(View view) {
        if (AnonymousClass1Xr.A06(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A002 = A00(viewGroup.getChildAt(i));
                if (A002 != null) {
                    return A002;
                }
            }
        }
        return null;
    }

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        View A0O;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A01 = -1;
            VelocityTracker velocityTracker = this.A02;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A02 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A02;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A02 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        boolean z = this.A09;
        if (actionMasked == 0) {
            z = BEA.A1W(motionEvent, view, coordinatorLayout);
            this.A09 = z;
            WeakReference weakReference = this.A08;
            if (!(weakReference == null || (A0O = C108945cZ.A0O(weakReference)) == null || !BEA.A1W(motionEvent, A0O, coordinatorLayout))) {
                this.A01 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.A07 = true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A07 = false;
            this.A09 = false;
            this.A01 = -1;
        }
        if (!z) {
            return false;
        }
        C26281Cwc cwc = this.A03;
        if (cwc == null) {
            if (this.A06) {
                float f = this.A00;
                cwc = C26281Cwc.A01(coordinatorLayout, new BLD(coordinatorLayout, this));
                cwc.A05 = (int) (((float) cwc.A05) * (1.0f / f));
            } else {
                cwc = C26281Cwc.A01(coordinatorLayout, new BLD(coordinatorLayout, this));
            }
            this.A03 = cwc;
        }
        return cwc.A0H(motionEvent);
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (motionEvent.getActionMasked() == 0) {
            this.A01 = -1;
            VelocityTracker velocityTracker = this.A02;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A02 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A02;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A02 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        C26281Cwc cwc = this.A03;
        if (cwc == null) {
            return false;
        }
        try {
            cwc.A0D(motionEvent);
            return true;
        } catch (IllegalArgumentException e) {
            Log.e("VerticalSwipeDismissBehavior/onTouchEvent", e);
            return false;
        }
    }

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        int top = view.getTop();
        coordinatorLayout.A0F(view, i);
        if (this.A0A) {
            AnonymousClass1HF.A0a(view, top - view.getTop());
        }
        this.A08 = AnonymousClass3MW.A0z(A00(view));
        return true;
    }
}
