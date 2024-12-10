package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.5gz  reason: invalid class name and case insensitive filesystem */
public class C110745gz extends AnonymousClass02A {
    public FrameLayout A00;
    public BottomSheetBehavior A01;
    public C114325qW A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public FrameLayout A07;
    public CoordinatorLayout A08;
    public C6X A09;

    public void setContentView(View view) {
        super.setContentView((View) A00(view, (ViewGroup.LayoutParams) null, 0));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110745gz(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0017
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 2130968834(0x7f040102, float:1.7546333E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r3, r0)
            if (r0 == 0) goto L_0x0044
            int r6 = r3.resourceId
        L_0x0017:
            r4.<init>(r5, r6)
            r1 = 1
            r4.A03 = r1
            r4.A04 = r1
            r3 = 0
            X.5qV r0 = new X.5qV
            r0.<init>(r4, r3)
            r4.A09 = r0
            r4.A05()
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            int[] r1 = new int[r1]
            r0 = 2130969449(0x7f040369, float:1.754758E38)
            r1[r3] = r0
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r1)
            boolean r0 = r0.getBoolean(r3, r3)
            r4.A06 = r0
            return
        L_0x0044:
            r6 = 2132084062(0x7f15055e, float:1.9808284E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110745gz.<init>(android.content.Context, int):void");
    }

    public static void A02(C110745gz r3) {
        if (r3.A07 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(r3.getContext(), 2131625071, (ViewGroup) null);
            r3.A07 = frameLayout;
            r3.A08 = (CoordinatorLayout) frameLayout.findViewById(2131429666);
            FrameLayout frameLayout2 = (FrameLayout) r3.A07.findViewById(2131429948);
            r3.A00 = frameLayout2;
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(frameLayout2);
            r3.A01 = A022;
            A022.A0Z(r3.A09);
            r3.A01.A0d(r3.A03);
        }
    }

    public void cancel() {
        if (this.A01 == null) {
            A02(this);
        }
        super.cancel();
    }

    public void onDetachedFromWindow() {
        C114325qW r1 = this.A02;
        if (r1 != null) {
            r1.A04((Window) null);
        }
    }

    private FrameLayout A00(View view, ViewGroup.LayoutParams layoutParams, int i) {
        A02(this);
        ViewGroup A0D = AnonymousClass3MW.A0D(this.A07, 2131429666);
        if (i != 0 && view == null) {
            view = AnonymousClass3MX.A09(getLayoutInflater(), A0D, i);
        }
        if (this.A06) {
            AnonymousClass1HF.A0g(this.A00, new C1425779z(this, 0));
        }
        this.A00.removeAllViews();
        FrameLayout frameLayout = this.A00;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        AnonymousClass3MZ.A1N(A0D.findViewById(2131436333), this, 10);
        C108955ca.A1K(this.A00, this, 0);
        this.A00.setOnTouchListener(new C1422678u(this, 0));
        return this.A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (android.graphics.Color.alpha(r3.getNavigationBarColor()) >= 255) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            android.view.Window r3 = r4.getWindow()
            if (r3 == 0) goto L_0x0039
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x001a
            int r0 = r3.getNavigationBarColor()
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 < r0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            android.widget.FrameLayout r1 = r4.A07
            if (r1 == 0) goto L_0x0024
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L_0x0024:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.A08
            if (r1 == 0) goto L_0x002d
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L_0x002d:
            r0 = r2 ^ 1
            X.AnonymousClass6VM.A00(r3, r0)
            X.5qW r0 = r4.A02
            if (r0 == 0) goto L_0x0039
            r0.A04(r3)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110745gz.onAttachedToWindow():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0J == 5) {
            bottomSheetBehavior.A0W(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.A03 != z) {
            this.A03 = z;
            BottomSheetBehavior bottomSheetBehavior = this.A01;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0d(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.A03) {
            this.A03 = true;
        }
        this.A04 = z;
        this.A05 = true;
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView((View) A00(view, layoutParams, 0));
    }

    public void setContentView(int i) {
        super.setContentView((View) A00((View) null, (ViewGroup.LayoutParams) null, i));
    }
}
