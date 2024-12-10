package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;

public class BEZ extends Dialog {
    public static final C28483E3n A0K = new D84(0);
    public static final C28483E3n A0L = new D84(2);
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public int A02 = -16777216;
    public Context A03;
    public FrameLayout A04;
    public CMX A05;
    public C28483E3n A06 = new D84(1);
    public C28483E3n A07 = A0L;
    public C22646BHi A08;
    public Float A09 = null;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A0C = true;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = true;
    public View A0H;
    public final Handler A0I = C17890vO.A0D();
    public final E7I A0J = new D88(this);

    public static C28483E3n[] A02(C28483E3n e3n, C28483E3n e3n2) {
        if (e3n == null && e3n2 == null) {
            return new C28483E3n[]{A0K};
        } else if (e3n == null) {
            return new C28483E3n[]{A0K, e3n2};
        } else if (e3n2 == null) {
            return new C28483E3n[]{A0K, e3n};
        } else {
            return new C28483E3n[]{A0K, e3n, e3n2};
        }
    }

    public void show() {
        C28483E3n e3n;
        AccessibilityManager accessibilityManager;
        this.A0E = false;
        C22646BHi bHi = this.A08;
        bHi.A05.A08();
        bHi.A0A = true;
        super.show();
        Context context = this.A03;
        if ((!Boolean.getBoolean("is_accessibility_enabled") && (context == null || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null || !accessibilityManager.isTouchExplorationEnabled())) || (e3n = this.A06) == null) {
            e3n = this.A07;
        }
        bHi.A02(e3n, -1, this.A0F);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.BEZ r4, float r5) {
        /*
            java.lang.Float r0 = r4.A09
            if (r0 == 0) goto L_0x0047
            float r5 = r0.floatValue()
        L_0x0008:
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L_0x003d
            android.view.View r3 = r0.getDecorView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r0 = X.AnonymousClass3MY.A0F(r3)
            if (r0 == 0) goto L_0x001b
            r3 = r0
        L_0x001b:
            int r2 = r4.A02
            r0 = 0
            float r1 = java.lang.Math.max(r0, r5)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = X.AnonymousClass1Z2.A06(r2, r0)
            android.graphics.drawable.Drawable r1 = r3.getBackground()
            boolean r0 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x003e
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
        L_0x003a:
            r1.setColor(r2)
        L_0x003d:
            return
        L_0x003e:
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>()
            r3.setBackground(r1)
            goto L_0x003a
        L_0x0047:
            float r0 = r4.A01
            float r5 = r5 * r0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BEZ.A01(X.BEZ, float):void");
    }

    public void A04(Integer num) {
        D8A d8a;
        CMX cmx = this.A05;
        if (cmx != null) {
            if (num != AnonymousClass00R.A01) {
                int intValue = num.intValue();
                int i = 3;
                if (intValue == 0) {
                    d8a = cmx.A01;
                } else if (intValue == 2) {
                    d8a = cmx.A01;
                    i = 4;
                } else if (intValue == 3) {
                    d8a = cmx.A01;
                    i = 5;
                }
                d8a.A00 = i;
            } else {
                D8A d8a2 = cmx.A01;
                d8a2.A05(cmx.A00);
                d8a2.A00 = 2;
                return;
            }
        }
        super.cancel();
    }

    public void cancel() {
        A04(AnonymousClass00R.A0Y);
    }

    public void onBackPressed() {
        if (this.A0B) {
            A04(AnonymousClass00R.A01);
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        View view2 = this.A0H;
        if (view2 != null) {
            this.A08.removeView(view2);
        }
        this.A0H = view;
        C22646BHi bHi = this.A08;
        if (layoutParams == null) {
            bHi.addView(view);
        } else {
            bHi.addView(view, layoutParams);
        }
    }

    public BEZ(Context context) {
        super(context, 2132083020);
        Context context2 = getContext();
        this.A03 = context2;
        C22646BHi bHi = new C22646BHi(context2);
        this.A08 = bHi;
        bHi.A0H.add(this.A0J);
        C22646BHi bHi2 = this.A08;
        bHi2.A00 = -1;
        bHi2.A03(new C28483E3n[]{A0K, this.A07, this.A06}, true);
        C22646BHi bHi3 = this.A08;
        bHi3.A03 = new CIo(this);
        bHi3.A05.A08();
        FrameLayout frameLayout = new FrameLayout(this.A03);
        this.A04 = frameLayout;
        Context context3 = getContext();
        C18070vi.A0d(context3, 0);
        if (Build.VERSION.SDK_INT >= 35 && context3.getApplicationInfo().targetSdkVersion >= 35) {
            AnonymousClass1HF.A0g(frameLayout, new C91314fU(0));
        }
        this.A04.addView(this.A08);
        super.setContentView(this.A04);
        AnonymousClass1HF.A0f(this.A08, new C22667BJi(this, 0));
    }

    public static void A00(BEZ bez) {
        InputMethodManager inputMethodManager;
        Window window = bez.getWindow();
        C22646BHi bHi = bez.A08;
        if (!bHi.hasWindowFocus() || bez.A0D) {
            bez.A03();
        }
        if (window != null) {
            window.setFlags(8, 8);
        }
        bez.A0E = true;
        if (!bez.A0A && bez.A01 != 0.0f) {
            bez.A01 = 0.0f;
            A01(bez, bez.A00);
        }
        bHi.A05.A08();
        bHi.A02(A0K, -1, false);
        bHi.setInteractable(false);
        View currentFocus = bez.getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) BE9.A0j(currentFocus)) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public void A03() {
        InputMethodManager inputMethodManager;
        View currentFocus = getCurrentFocus();
        if (!(currentFocus == null || (inputMethodManager = (InputMethodManager) BE9.A0j(currentFocus)) == null)) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        super.dismiss();
    }

    public void dismiss() {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0I;
        if (myLooper == handler.getLooper()) {
            A00(this);
        } else {
            handler.post(new C21466AkX((Object) this, 34));
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.A0B = z;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.A0C = z;
    }

    public void setContentView(int i) {
        setContentView(AnonymousClass3MX.A09(LayoutInflater.from(getContext()), this.A08, i), (ViewGroup.LayoutParams) null);
    }

    public void setContentView(View view) {
        setContentView(view, (ViewGroup.LayoutParams) null);
    }
}
