package com.google.android.material.sidesheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1HF;
import X.AnonymousClass1Xr;
import X.AnonymousClass1YT;
import X.AnonymousClass3MW;
import X.AnonymousClass8BX;
import X.BE8;
import X.BE9;
import X.BL4;
import X.BLB;
import X.C108945cZ;
import X.C17880vN;
import X.C24495C6n;
import X.C25072CWf;
import X.C25486Cgh;
import X.C26137Ct0;
import X.C26281Cwc;
import X.C27781Xn;
import X.C27801Xq;
import X.C28011Ym;
import X.C37891qK;
import X.C41501wV;
import X.C72453Mb;
import X.D6Z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

public class SideSheetBehavior extends C41501wV {
    public float A00 = 0.1f;
    public int A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05 = 5;
    public ColorStateList A06;
    public VelocityTracker A07;
    public C26281Cwc A08;
    public C27801Xq A09;
    public C28011Ym A0A;
    public C25486Cgh A0B;
    public WeakReference A0C;
    public WeakReference A0D;
    public boolean A0E = true;
    public float A0F;
    public boolean A0G;
    public final Set A0H = C17880vN.A14();
    public final C24495C6n A0I = new BLB(this, 1);
    public final C25072CWf A0J = new C25072CWf(this);

    public void A0E() {
        this.A0D = null;
        this.A08 = null;
    }

    public void A0J(C37891qK r2) {
        this.A0D = null;
        this.A08 = null;
    }

    private void A00() {
        View A0O;
        WeakReference weakReference = this.A0D;
        if (weakReference != null && (A0O = C108945cZ.A0O(weakReference)) != null) {
            AnonymousClass1HF.A0b(A0O, 262144);
            AnonymousClass1HF.A0b(A0O, 1048576);
            if (this.A05 != 5) {
                AnonymousClass1HF.A0m(A0O, C26137Ct0.A0D, new D6Z(this, 5, 1), (CharSequence) null);
            }
            if (this.A05 != 3) {
                AnonymousClass1HF.A0m(A0O, C26137Ct0.A0H, new D6Z(this, 3, 1), (CharSequence) null);
            }
        }
    }

    public static void A01(View view, SideSheetBehavior sideSheetBehavior, int i, boolean z) {
        int A042;
        boolean A0J2;
        SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior.A0B.A00;
        if (i == 3) {
            SideSheetBehavior sideSheetBehavior3 = sideSheetBehavior2.A0B.A00;
            A042 = BE8.A04(sideSheetBehavior3.A04, sideSheetBehavior3.A01);
        } else if (i == 5) {
            A042 = sideSheetBehavior2.A0B.A00.A04;
        } else {
            throw AnonymousClass001.A13("Invalid state to get outward edge offset: ", AnonymousClass000.A10(), i);
        }
        C26281Cwc cwc = sideSheetBehavior2.A08;
        if (cwc != null) {
            int top = view.getTop();
            if (z) {
                A0J2 = cwc.A0G(A042, top);
            } else {
                A0J2 = cwc.A0J(view, A042, top);
            }
            if (A0J2) {
                sideSheetBehavior.A0Q(2);
                sideSheetBehavior.A0J.A00(i);
                return;
            }
        }
        sideSheetBehavior.A0Q(i);
    }

    public Parcelable A0D(View view) {
        return new BL4((Parcelable) AbsSavedState.EMPTY_STATE, this);
    }

    public void A0F(Parcelable parcelable) {
        int i = ((BL4) parcelable).A00;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.A05 = i;
    }

    public void A0Q(int i) {
        View A0O;
        if (this.A05 != i) {
            this.A05 = i;
            WeakReference weakReference = this.A0D;
            if (weakReference != null && (A0O = C108945cZ.A0O(weakReference)) != null) {
                int i2 = 0;
                if (i == 5) {
                    i2 = 4;
                }
                if (A0O.getVisibility() != i2) {
                    A0O.setVisibility(i2);
                }
                Iterator it = this.A0H.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass000.A0s("onStateChanged");
                } else {
                    A00();
                }
            }
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27781Xn.A0e);
        if (obtainStyledAttributes.hasValue(3)) {
            this.A06 = AnonymousClass1YT.A01(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.A0A = new C28011Ym(C28011Ym.A01(context, attributeSet, 0, 2132084684));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.A02 = resourceId;
            WeakReference weakReference = this.A0C;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.A0C = null;
            WeakReference weakReference2 = this.A0D;
            if (weakReference2 != null) {
                View A0O = C108945cZ.A0O(weakReference2);
                if (resourceId != -1 && A0O.isLaidOut()) {
                    A0O.requestLayout();
                }
            }
        }
        C28011Ym r1 = this.A0A;
        if (r1 != null) {
            C27801Xq r0 = new C27801Xq(r1);
            this.A09 = r0;
            r0.A0E(context);
            ColorStateList colorStateList = this.A06;
            if (colorStateList != null) {
                this.A09.A0F(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.A09.setTint(typedValue.data);
            }
        }
        this.A0F = obtainStyledAttributes.getDimension(2, -1.0f);
        this.A0E = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.A0B == null) {
            this.A0B = new C25486Cgh(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r4.A0E == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(android.view.MotionEvent r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7) {
        /*
            r4 = this;
            boolean r0 = r6.isShown()
            if (r0 != 0) goto L_0x000c
            java.lang.CharSequence r0 = X.AnonymousClass1HF.A0H(r6)
            if (r0 == 0) goto L_0x0011
        L_0x000c:
            boolean r1 = r4.A0E
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            r4.A0G = r3
            return r2
        L_0x0019:
            int r1 = r5.getActionMasked()
            if (r1 != 0) goto L_0x0029
            android.view.VelocityTracker r0 = r4.A07
            if (r0 == 0) goto L_0x0029
            r0.recycle()
            r0 = 0
            r4.A07 = r0
        L_0x0029:
            android.view.VelocityTracker r0 = r4.A07
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.A07 = r0
        L_0x0033:
            r0.addMovement(r5)
            if (r1 == 0) goto L_0x0053
            if (r1 == r3) goto L_0x004c
            r0 = 3
            if (r1 == r0) goto L_0x004c
        L_0x003d:
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x005b
            X.Cwc r0 = r4.A08
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.A0H(r5)
            if (r0 == 0) goto L_0x005b
            return r3
        L_0x004c:
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x003d
            r4.A0G = r2
            return r2
        L_0x0053:
            float r0 = r5.getX()
            int r0 = (int) r0
            r4.A03 = r0
            goto L_0x003d
        L_0x005b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.A0K(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean z;
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.A05;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C26281Cwc cwc = this.A08;
        if (cwc != null && (this.A0E || i == 1)) {
            cwc.A0D(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.A07) != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
        VelocityTracker velocityTracker2 = this.A07;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A07 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (this.A08 != null && (((z = this.A0E) || this.A05 == 1) && actionMasked == 2 && !this.A0G && (z || this.A05 == 1))) {
            float A002 = C108945cZ.A00((float) this.A03, motionEvent.getX());
            C26281Cwc cwc2 = this.A08;
            if (A002 > ((float) cwc2.A05)) {
                cwc2.A0E(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0G;
    }

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        int left;
        int i2;
        View findViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.A0D == null) {
            this.A0D = AnonymousClass3MW.A0z(view);
            C27801Xq r3 = this.A09;
            if (r3 != null) {
                view.setBackground(r3);
                float f = this.A0F;
                if (f == -1.0f) {
                    f = AnonymousClass1Xr.A00(view);
                }
                r3.A0C(f);
            } else {
                ColorStateList colorStateList = this.A06;
                if (colorStateList != null) {
                    AnonymousClass1HF.A0L(colorStateList, view);
                }
            }
            int i3 = 0;
            if (this.A05 == 5) {
                i3 = 4;
            }
            if (view.getVisibility() != i3) {
                view.setVisibility(i3);
            }
            A00();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AnonymousClass1HF.A0H(view) == null) {
                AnonymousClass1HF.A0n(view, view.getResources().getString(2131899430));
            }
        }
        if (this.A08 == null) {
            this.A08 = C26281Cwc.A01(coordinatorLayout, this.A0I);
        }
        int left2 = view.getLeft();
        coordinatorLayout.A0F(view, i);
        this.A04 = coordinatorLayout.getWidth();
        this.A01 = view.getWidth();
        int i4 = this.A05;
        if (i4 == 1 || i4 == 2) {
            left = left2 - view.getLeft();
        } else if (i4 == 3) {
            left = 0;
        } else if (i4 == 5) {
            left = this.A0B.A00.A04;
        } else {
            throw AnonymousClass8BX.A0W("Unexpected value: ", AnonymousClass000.A10(), i4);
        }
        AnonymousClass1HF.A0Z(view, left);
        if (!(this.A0C != null || (i2 = this.A02) == -1 || (findViewById = coordinatorLayout.findViewById(i2)) == null)) {
            this.A0C = AnonymousClass3MW.A0z(findViewById);
        }
        Iterator it = this.A0H.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(view);
        view.measure(ViewGroup.getChildMeasureSpec(i, C72453Mb.A0C(coordinatorLayout) + A0B2.leftMargin + A0B2.rightMargin + i2, A0B2.width), ViewGroup.getChildMeasureSpec(i3, BE9.A08(coordinatorLayout) + A0B2.topMargin + A0B2.bottomMargin, A0B2.height));
        return true;
    }

    public SideSheetBehavior() {
    }
}
