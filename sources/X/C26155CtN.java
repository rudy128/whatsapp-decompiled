package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;

/* renamed from: X.CtN  reason: case insensitive filesystem */
public abstract class C26155CtN {
    public static final Handler A0M = new Handler(Looper.getMainLooper(), new C26367CyT());
    public static final int[] A0N = {2130971313};
    public static final TimeInterpolator A0O = AnonymousClass1YW.A03;
    public static final TimeInterpolator A0P = AnonymousClass1YW.A04;
    public static final TimeInterpolator A0Q = AnonymousClass1YW.A02;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public D5E A06;
    public E2U A07 = new DLD(this);
    public List A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final TimeInterpolator A0D;
    public final TimeInterpolator A0E;
    public final TimeInterpolator A0F;
    public final Context A0G;
    public final ViewGroup A0H;
    public final AccessibilityManager A0I;
    public final BIE A0J;
    public final E2T A0K;
    public final Runnable A0L = new C27080DTf((Object) this, 21);

    public abstract int A05();

    public static void A03(C26155CtN ctN) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = ctN.A0I;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            ctN.A0J.post(new C27080DTf((Object) ctN, 23));
            return;
        }
        BIE bie = ctN.A0J;
        if (bie.getParent() != null) {
            bie.setVisibility(0);
        }
        ctN.A07();
    }

    public static void A04(C26155CtN ctN) {
        int i;
        BIE bie = ctN.A0J;
        ViewGroup.LayoutParams layoutParams = bie.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || bie.A02 == null) {
            Log.w("BaseTransientBottomBar", "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (bie.getParent() != null) {
            D5E d5e = ctN.A06;
            if (d5e == null || d5e.A00.get() == null) {
                i = ctN.A03;
            } else {
                i = ctN.A01;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = bie.A02;
            marginLayoutParams.bottomMargin = rect.bottom + i;
            marginLayoutParams.leftMargin = rect.left + ctN.A04;
            marginLayoutParams.rightMargin = rect.right + ctN.A05;
            marginLayoutParams.topMargin = rect.top;
            bie.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && ctN.A02 > 0) {
                ViewGroup.LayoutParams layoutParams2 = bie.getLayoutParams();
                if ((layoutParams2 instanceof C37891qK) && (((C37891qK) layoutParams2).A0A instanceof SwipeDismissBehavior)) {
                    Runnable runnable = ctN.A0L;
                    bie.removeCallbacks(runnable);
                    bie.post(runnable);
                }
            }
        }
    }

    public void A06() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.A0J.getRootWindowInsets()) != null) {
            this.A02 = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            A04(this);
        }
    }

    public void A0B(View view) {
        D5E d5e;
        D5E d5e2 = this.A06;
        if (d5e2 != null) {
            d5e2.A00();
        }
        if (view == null) {
            d5e = null;
        } else {
            d5e = new D5E(view, this);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(d5e);
            }
            view.addOnAttachStateChangeListener(d5e);
        }
        this.A06 = d5e;
    }

    public void A0C(C6J c6j) {
        if (c6j != null) {
            List list = this.A08;
            if (list == null) {
                list = AnonymousClass000.A13();
                this.A08 = list;
            }
            list.add(c6j);
        }
    }

    public C26155CtN(Context context, View view, ViewGroup viewGroup, E2T e2t) {
        if (view == null) {
            throw AnonymousClass000.A0k("Transient bottom bar must have non-null content");
        } else if (e2t != null) {
            this.A0H = viewGroup;
            this.A0K = e2t;
            this.A0G = context;
            C27791Xo.A04(context, "Theme.AppCompat", C27791Xo.A00);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = this.A0G.obtainStyledAttributes(A0N);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            BIE bie = (BIE) from.inflate(resourceId != -1 ? 2131626091 : 2131625072, viewGroup, false);
            this.A0J = bie;
            bie.A04 = this;
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                float f = bie.A07;
                if (f != 1.0f) {
                    snackbarContentLayout.A01.setTextColor(AnonymousClass1ZA.A00(f, AnonymousClass1ZA.A03(snackbarContentLayout, 2130969148), snackbarContentLayout.A01.getCurrentTextColor()));
                }
                snackbarContentLayout.A00 = bie.A09;
            }
            bie.addView(view);
            bie.setAccessibilityLiveRegion(1);
            bie.setImportantForAccessibility(1);
            bie.setFitsSystemWindows(true);
            AnonymousClass1HF.A0g(bie, new D6T(this, 3));
            AnonymousClass1HF.A0f(bie, new C22667BJi(this, 6));
            this.A0I = (AccessibilityManager) context.getSystemService("accessibility");
            this.A0C = AnonymousClass1Z9.A00(context, 2130970532, 250);
            this.A0A = AnonymousClass1Z9.A00(context, 2130970532, 150);
            this.A0B = AnonymousClass1Z9.A00(context, 2130970535, 75);
            this.A0D = C29101bc.A01(A0O, context, 2130970548);
            this.A0E = C29101bc.A01(A0P, context, 2130970548);
            this.A0F = C29101bc.A01(A0Q, context, 2130970548);
        } else {
            throw AnonymousClass000.A0k("Transient bottom bar must have non-null callback");
        }
    }

    public void A07() {
        C26218Cv5 A002 = C26218Cv5.A00();
        E2U e2u = this.A07;
        synchronized (A002.A03) {
            if (C26218Cv5.A03(e2u, A002)) {
                C26218Cv5.A01(A002.A00, A002);
            }
        }
        List list = this.A08;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C6J) this.A08.get(size)).A00(this);
                } else {
                    return;
                }
            }
        }
    }

    public void A08() {
        C26218Cv5 A002 = C26218Cv5.A00();
        int A052 = A05();
        E2U e2u = this.A07;
        synchronized (A002.A03) {
            if (C26218Cv5.A03(e2u, A002)) {
                CQC cqc = A002.A00;
                cqc.A00 = A052;
                A002.A02.removeCallbacksAndMessages(cqc);
                C26218Cv5.A01(A002.A00, A002);
            } else {
                CQC cqc2 = A002.A01;
                if (cqc2 == null || e2u == null || cqc2.A02.get() != e2u) {
                    A002.A01 = new CQC(e2u, A052);
                } else {
                    cqc2.A00 = A052;
                }
                CQC cqc3 = A002.A00;
                if (cqc3 == null || !C26218Cv5.A04(cqc3, A002, 4)) {
                    A002.A00 = null;
                    C26218Cv5.A02(A002);
                }
            }
        }
    }

    public void A09(int i) {
        C26218Cv5 A002 = C26218Cv5.A00();
        E2U e2u = this.A07;
        synchronized (A002.A03) {
            if (C26218Cv5.A03(e2u, A002)) {
                C26218Cv5.A04(A002.A00, A002, i);
            } else {
                CQC cqc = A002.A01;
                if (!(cqc == null || e2u == null || cqc.A02.get() != e2u)) {
                    C26218Cv5.A04(cqc, A002, i);
                }
            }
        }
    }

    public void A0A(int i) {
        C26218Cv5 A002 = C26218Cv5.A00();
        E2U e2u = this.A07;
        synchronized (A002.A03) {
            if (C26218Cv5.A03(e2u, A002)) {
                A002.A00 = null;
                if (A002.A01 != null) {
                    C26218Cv5.A02(A002);
                }
            }
        }
        List list = this.A08;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C6J) this.A08.get(size)).A01(this, i);
            }
        }
        BIE bie = this.A0J;
        ViewParent parent = bie.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(bie);
        }
    }

    public boolean A0D() {
        boolean A032;
        C26218Cv5 A002 = C26218Cv5.A00();
        E2U e2u = this.A07;
        synchronized (A002.A03) {
            A032 = C26218Cv5.A03(e2u, A002);
        }
        return A032;
    }
}
