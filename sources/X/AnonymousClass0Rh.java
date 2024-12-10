package X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewManager;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0Rh  reason: invalid class name */
public class AnonymousClass0Rh implements View.OnLongClickListener, View.OnAttachStateChangeListener, View.OnHoverListener {
    public static AnonymousClass0Rh A0A;
    public static AnonymousClass0Rh A0B;
    public int A00;
    public int A01;
    public boolean A02;
    public C03350Hs A03;
    public boolean A04;
    public final int A05;
    public final View A06;
    public final Runnable A07 = new C06560Yu(this);
    public final CharSequence A08;
    public final Runnable A09 = new C06570Yv(this);

    public void onViewAttachedToWindow(View view) {
    }

    public static void A00(AnonymousClass0Rh r4) {
        AnonymousClass0Rh r0 = A0B;
        if (r0 != null) {
            r0.A06.removeCallbacks(r0.A07);
        }
        A0B = r4;
        if (r4 != null) {
            r4.A06.postDelayed(r4.A07, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public void A01() {
        if (A0A == this) {
            A0A = null;
            C03350Hs r1 = this.A03;
            if (r1 != null) {
                View view = r1.A02;
                if (view.getParent() != null) {
                    ((ViewManager) r1.A00.getSystemService("window")).removeView(view);
                }
                this.A03 = null;
                this.A02 = true;
                this.A06.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (A0B == this) {
            A00((AnonymousClass0Rh) null);
        }
        this.A06.removeCallbacks(this.A09);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(boolean r19) {
        /*
            r18 = this;
            r5 = r18
            android.view.View r4 = r5.A06
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L_0x0131
            r0 = 0
            A00(r0)
            X.0Rh r0 = A0A
            if (r0 == 0) goto L_0x0015
            r0.A01()
        L_0x0015:
            A0A = r18
            r0 = r19
            r5.A04 = r0
            android.content.Context r0 = r4.getContext()
            X.0Hs r12 = new X.0Hs
            r12.<init>(r0)
            r5.A03 = r12
            int r11 = r5.A00
            int r8 = r5.A01
            boolean r9 = r5.A04
            java.lang.CharSequence r2 = r5.A08
            android.view.View r6 = r12.A02
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L_0x0049
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L_0x0049
            android.content.Context r1 = r12.A00
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.ViewManager r0 = (android.view.ViewManager) r0
            r0.removeView(r6)
        L_0x0049:
            android.widget.TextView r0 = r12.A04
            r0.setText(r2)
            android.view.WindowManager$LayoutParams r3 = r12.A03
            android.os.IBinder r0 = r4.getApplicationWindowToken()
            r3.token = r0
            android.content.Context r7 = r12.A00
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131169055(0x7f070f1f, float:1.795243E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            int r0 = r4.getWidth()
            if (r0 >= r1) goto L_0x006f
            int r0 = r4.getWidth()
            int r11 = r0 / 2
        L_0x006f:
            int r0 = r4.getHeight()
            r2 = 0
            if (r0 < r1) goto L_0x017b
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131169054(0x7f070f1e, float:1.7952427E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r17 = r8 + r0
            int r8 = r8 - r0
        L_0x0084:
            r0 = 49
            r3.gravity = r0
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131169059(0x7f070f23, float:1.7952437E38)
            if (r9 == 0) goto L_0x0094
            r0 = 2131169060(0x7f070f24, float:1.795244E38)
        L_0x0094:
            int r16 = r1.getDimensionPixelOffset(r0)
            android.view.View r13 = r4.getRootView()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            boolean r0 = r1 instanceof android.view.WindowManager.LayoutParams
            if (r0 == 0) goto L_0x0154
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            int r1 = r1.type
            r0 = 2
            if (r1 != r0) goto L_0x0154
        L_0x00ab:
            android.graphics.Rect r10 = r12.A01
            r13.getWindowVisibleDisplayFrame(r10)
            int r0 = r10.left
            if (r0 >= 0) goto L_0x00d7
            int r0 = r10.top
            if (r0 >= 0) goto L_0x00d7
            android.content.res.Resources r1 = r7.getResources()
            java.lang.String r15 = "dimen"
            java.lang.String r14 = "android"
            java.lang.String r0 = "status_bar_height"
            int r0 = r1.getIdentifier(r0, r15, r14)
            if (r0 == 0) goto L_0x0151
            int r14 = r1.getDimensionPixelSize(r0)
        L_0x00cc:
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            r10.set(r2, r14, r1, r0)
        L_0x00d7:
            int[] r0 = r12.A06
            r13.getLocationOnScreen(r0)
            int[] r1 = r12.A05
            r4.getLocationOnScreen(r1)
            r12 = r1[r2]
            r14 = r0[r2]
            int r12 = r12 - r14
            r1[r2] = r12
            r15 = 1
            r14 = r1[r15]
            r0 = r0[r15]
            int r14 = r14 - r0
            r1[r15] = r14
            int r12 = r12 + r11
            int r0 = r13.getWidth()
            int r0 = r0 / 2
            int r12 = r12 - r0
            r3.x = r12
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r6.measure(r0, r0)
            int r2 = r6.getMeasuredHeight()
            r1 = r1[r15]
            int r8 = r8 + r1
            int r8 = r8 - r16
            int r8 = r8 - r2
            int r1 = r1 + r17
            int r1 = r1 + r16
            if (r9 == 0) goto L_0x0147
            if (r8 < 0) goto L_0x014e
        L_0x0113:
            r3.y = r8
        L_0x0115:
            java.lang.String r0 = "window"
            java.lang.Object r0 = r7.getSystemService(r0)
            android.view.ViewManager r0 = (android.view.ViewManager) r0
            r0.addView(r6, r3)
            r4.addOnAttachStateChangeListener(r5)
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0132
            r0 = 2500(0x9c4, double:1.235E-320)
        L_0x0129:
            java.lang.Runnable r2 = r5.A09
            r4.removeCallbacks(r2)
            r4.postDelayed(r2, r0)
        L_0x0131:
            return
        L_0x0132:
            int r0 = r4.getWindowSystemUiVisibility()
            r6 = r0 & 1
            r1 = 1
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r0
            if (r6 != r1) goto L_0x0144
            r0 = 3000(0xbb8, double:1.482E-320)
        L_0x0142:
            long r0 = r0 - r2
            goto L_0x0129
        L_0x0144:
            r0 = 15000(0x3a98, double:7.411E-320)
            goto L_0x0142
        L_0x0147:
            int r2 = r2 + r1
            int r0 = r10.height()
            if (r2 > r0) goto L_0x0113
        L_0x014e:
            r3.y = r1
            goto L_0x0115
        L_0x0151:
            r14 = 0
            goto L_0x00cc
        L_0x0154:
            android.content.Context r1 = r4.getContext()
        L_0x0158:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0174
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r0 = r1.getWindow()
            android.view.View r13 = r0.getDecorView()
            if (r13 != 0) goto L_0x00ab
            java.lang.String r1 = "TooltipPopup"
            java.lang.String r0 = "Cannot find app view"
            android.util.Log.e(r1, r0)
            goto L_0x0115
        L_0x0174:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0158
        L_0x017b:
            int r17 = r4.getHeight()
            r8 = 0
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Rh.A02(boolean):void");
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        int i;
        if (this.A03 == null || !this.A04) {
            View view2 = this.A06;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    this.A02 = true;
                    A01();
                    return false;
                }
            } else if (view2.isEnabled() && this.A03 == null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (this.A02 || Math.abs(x - this.A00) > (i = this.A05) || Math.abs(y - this.A01) > i) {
                    this.A00 = x;
                    this.A01 = y;
                    this.A02 = false;
                    A00(this);
                    return false;
                }
            }
        }
        return false;
    }

    public AnonymousClass0Rh(View view, CharSequence charSequence) {
        this.A06 = view;
        this.A08 = charSequence;
        this.A05 = C28971bN.A05(ViewConfiguration.get(view.getContext()));
        this.A02 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public boolean onLongClick(View view) {
        this.A00 = view.getWidth() / 2;
        this.A01 = view.getHeight() / 2;
        A02(true);
        return true;
    }

    public void onViewDetachedFromWindow(View view) {
        A01();
    }
}
