package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.01s  reason: invalid class name and case insensitive filesystem */
public class C003901s extends C003401n implements C003801r {
    public static final Interpolator A0R = new AccelerateInterpolator();
    public static final Interpolator A0S = new DecelerateInterpolator();
    public int A00 = 0;
    public Context A01;
    public View A02;
    public AnonymousClass064 A03;
    public AnonymousClass02H A04;
    public AnonymousClass02B A05;
    public AnonymousClass0KW A06;
    public ActionBarContainer A07;
    public ActionBarContextView A08;
    public ActionBarOverlayLayout A09;
    public AnonymousClass03J A0A;
    public boolean A0B = true;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public Activity A0G;
    public Context A0H;
    public ArrayList A0I = new ArrayList();
    public ArrayList A0J = new ArrayList();
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = true;
    public boolean A0N;
    public final AnonymousClass1HM A0O = new AnonymousClass0Bi(this, 2);
    public final AnonymousClass1HM A0P = new AnonymousClass0Bi(this, 3);
    public final AnonymousClass5WU A0Q = new AnonymousClass0Y1(this);

    public void A0H() {
        AnonymousClass03K r0 = (AnonymousClass03K) this.A0A;
        r0.A04 = null;
        AnonymousClass03K.A00(r0);
    }

    public void A0W(boolean z) {
        int i = 0;
        if (z) {
            i = 4;
        }
        A0c(i, 4);
    }

    public void A0X(boolean z) {
        int i = 0;
        if (z) {
            i = 2;
        }
        A0c(i, 2);
    }

    public static void A01(C003901s r3, boolean z) {
        boolean z2;
        boolean z3 = r3.A0C;
        boolean z4 = r3.A0D;
        if (r3.A0F || (!z3 && !z4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = r3.A0M;
        if (z2) {
            if (!z5) {
                r3.A0M = true;
                r3.A0f(z);
            }
        } else if (z5) {
            r3.A0M = false;
            r3.A0e(z);
        }
    }

    public float A07() {
        return AnonymousClass1HF.A00(this.A07);
    }

    public int A08() {
        return ((AnonymousClass03K) this.A0A).A01;
    }

    public int A09() {
        return this.A07.getHeight();
    }

    public Context A0A() {
        Context context = this.A0H;
        if (context == null) {
            TypedValue typedValue = new TypedValue();
            this.A01.getTheme().resolveAttribute(2130968599, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                context = new ContextThemeWrapper(this.A01, i);
            } else {
                context = this.A01;
            }
            this.A0H = context;
        }
        return context;
    }

    public View A0B() {
        return ((AnonymousClass03K) this.A0A).A06;
    }

    public AnonymousClass02B A0C(AnonymousClass02H r3) {
        AnonymousClass064 r0 = this.A03;
        if (r0 != null) {
            r0.A05();
        }
        this.A09.setHideOnContentScrollEnabled(false);
        this.A08.A05();
        AnonymousClass064 r1 = new AnonymousClass064(this.A08.getContext(), this, r3);
        if (!r1.A0E()) {
            return null;
        }
        this.A03 = r1;
        r1.A06();
        this.A08.A07(r1);
        A0d(true);
        return r1;
    }

    public void A0D() {
        this.A01.getResources().getBoolean(2131034112);
        this.A07.setTabContainer((AnonymousClass05X) null);
        this.A0A.CIN();
        this.A09.setHasNonEmbeddedTabs(false);
    }

    public void A0E() {
        if (!this.A0C) {
            this.A0C = true;
            A01(this, false);
        }
    }

    public void A0F() {
        this.A0A.CIk(16);
    }

    public void A0G() {
        A0c(16, 16);
    }

    public void A0I() {
        if (this.A0C) {
            this.A0C = false;
            A01(this, false);
        }
    }

    public void A0J(float f) {
        AnonymousClass1HF.A0W(this.A07, f);
    }

    public void A0K(int i) {
        this.A0A.CJZ(i);
    }

    public void A0L(int i) {
        A0R(this.A01.getString(i));
    }

    public void A0M(int i) {
        A0S(this.A01.getString(i));
    }

    public void A0N(Drawable drawable) {
        this.A07.setPrimaryBackground(drawable);
    }

    public void A0O(Drawable drawable) {
        this.A0A.CJa(drawable);
    }

    public void A0P(View view) {
        this.A0A.CIc(view);
    }

    public void A0R(CharSequence charSequence) {
        this.A0A.CKz(charSequence);
    }

    public void A0S(CharSequence charSequence) {
        AnonymousClass03K r1 = (AnonymousClass03K) this.A0A;
        r1.A0D = true;
        AnonymousClass03K.A01(r1, charSequence);
    }

    public void A0T(CharSequence charSequence) {
        AnonymousClass03K r1 = (AnonymousClass03K) this.A0A;
        if (!r1.A0D) {
            AnonymousClass03K.A01(r1, charSequence);
        }
    }

    public void A0U(boolean z) {
        if (z != this.A0L) {
            this.A0L = z;
            ArrayList arrayList = this.A0I;
            if (0 < arrayList.size()) {
                arrayList.get(0);
                throw new NullPointerException("onMenuVisibilityChanged");
            }
        }
    }

    public void A0V(boolean z) {
        if (!this.A0K) {
            A0W(z);
        }
    }

    public void A0Y(boolean z) {
        int i = 0;
        if (z) {
            i = 8;
        }
        A0c(i, 8);
    }

    public void A0Z(boolean z) {
        AnonymousClass0KW r0;
        this.A0N = z;
        if (!z && (r0 = this.A06) != null) {
            r0.A00();
        }
    }

    public boolean A0a() {
        AnonymousClass03J r1 = this.A0A;
        if (r1 == null || !r1.Bcb()) {
            return false;
        }
        r1.BFA();
        return true;
    }

    public boolean A0b(int i, KeyEvent keyEvent) {
        AnonymousClass064 r0 = this.A03;
        if (r0 == null) {
            return false;
        }
        C003301m A022 = r0.A02();
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z = false;
        }
        A022.setQwertyMode(z);
        return A022.performShortcut(i, keyEvent, 0);
    }

    public void A0c(int i, int i2) {
        AnonymousClass03J r2 = this.A0A;
        int i3 = ((AnonymousClass03K) r2).A01;
        if ((i2 & 4) != 0) {
            this.A0K = true;
        }
        r2.CIk((i & i2) | ((i2 ^ -1) & i3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0d(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0F
            if (r9 == 0) goto L_0x0042
            if (r0 != 0) goto L_0x000d
            r0 = 1
            r8.A0F = r0
            r0 = 0
        L_0x000a:
            A01(r8, r0)
        L_0x000d:
            androidx.appcompat.widget.ActionBarContainer r0 = r8.A07
            boolean r0 = r0.isLaidOut()
            r7 = 4
            r6 = 8
            r1 = 0
            if (r0 == 0) goto L_0x0048
            r2 = 100
            r4 = 200(0xc8, double:9.9E-322)
            X.03J r0 = r8.A0A
            if (r9 == 0) goto L_0x0037
            X.1HC r2 = r0.CLZ(r7, r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A08
            X.1HC r1 = r0.A04(r1, r4)
        L_0x002b:
            X.0KW r0 = new X.0KW
            r0.<init>()
            r0.A02(r2, r1)
            r0.A01()
            return
        L_0x0037:
            X.1HC r1 = r0.CLZ(r1, r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A08
            X.1HC r2 = r0.A04(r6, r2)
            goto L_0x002b
        L_0x0042:
            if (r0 == 0) goto L_0x000d
            r0 = 0
            r8.A0F = r0
            goto L_0x000a
        L_0x0048:
            X.03J r0 = r8.A0A
            if (r9 == 0) goto L_0x0055
            r0.setVisibility(r7)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A08
            r0.setVisibility(r1)
            return
        L_0x0055:
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A08
            r0.setVisibility(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003901s.A0d(boolean):void");
    }

    public void A0e(boolean z) {
        View view;
        AnonymousClass0KW r0 = this.A06;
        if (r0 != null) {
            r0.A00();
        }
        if (this.A00 != 0 || (!this.A0N && !z)) {
            this.A0O.BlP((View) null);
            return;
        }
        this.A07.setAlpha(1.0f);
        this.A07.setTransitioning(true);
        AnonymousClass0KW r2 = new AnonymousClass0KW();
        float f = (float) (-this.A07.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.A07.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        AnonymousClass1HC A0B2 = AnonymousClass1HF.A0B(this.A07);
        A0B2.A07(f);
        A0B2.A0C(this.A0Q);
        if (!r2.A03) {
            r2.A04.add(A0B2);
        }
        if (this.A0B && (view = this.A02) != null) {
            AnonymousClass1HC A0B3 = AnonymousClass1HF.A0B(view);
            A0B3.A07(f);
            if (!r2.A03) {
                r2.A04.add(A0B3);
            }
        }
        Interpolator interpolator = A0R;
        if (!r2.A03) {
            r2.A01 = interpolator;
            r2.A00 = 250;
        }
        r2.A03(this.A0O);
        this.A06 = r2;
        r2.A01();
    }

    public void A0f(boolean z) {
        View view;
        View view2;
        AnonymousClass0KW r0 = this.A06;
        if (r0 != null) {
            r0.A00();
        }
        this.A07.setVisibility(0);
        if (this.A00 != 0 || (!this.A0N && !z)) {
            this.A07.setAlpha(1.0f);
            this.A07.setTranslationY(0.0f);
            if (this.A0B && (view = this.A02) != null) {
                view.setTranslationY(0.0f);
            }
            this.A0P.BlP((View) null);
        } else {
            this.A07.setTranslationY(0.0f);
            float f = (float) (-this.A07.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.A07.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.A07.setTranslationY(f);
            AnonymousClass0KW r2 = new AnonymousClass0KW();
            AnonymousClass1HC A0B2 = AnonymousClass1HF.A0B(this.A07);
            A0B2.A07(0.0f);
            A0B2.A0C(this.A0Q);
            if (!r2.A03) {
                r2.A04.add(A0B2);
            }
            if (this.A0B && (view2 = this.A02) != null) {
                view2.setTranslationY(f);
                AnonymousClass1HC A0B3 = AnonymousClass1HF.A0B(view2);
                A0B3.A07(0.0f);
                if (!r2.A03) {
                    r2.A04.add(A0B3);
                }
            }
            Interpolator interpolator = A0S;
            if (!r2.A03) {
                r2.A01 = interpolator;
                r2.A00 = 250;
            }
            r2.A03(this.A0P);
            this.A06 = r2;
            r2.A01();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.A09;
        if (actionBarOverlayLayout != null) {
            AnonymousClass1HF.A0T(actionBarOverlayLayout);
        }
    }

    public C003901s(Activity activity, boolean z) {
        this.A0G = activity;
        View decorView = activity.getWindow().getDecorView();
        A00(decorView);
        if (!z) {
            this.A02 = decorView.findViewById(16908290);
        }
    }

    private void A00(View view) {
        String str;
        AnonymousClass03J wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131429843);
        this.A09 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131427472);
        if (findViewById instanceof AnonymousClass03J) {
            wrapper = (AnonymousClass03J) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't make a decor toolbar out of ");
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        this.A0A = wrapper;
        this.A08 = (ActionBarContextView) view.findViewById(2131427491);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131427474);
        this.A07 = actionBarContainer;
        AnonymousClass03J r1 = this.A0A;
        if (r1 == null || this.A08 == null || actionBarContainer == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb2.toString());
        }
        Context context = r1.getContext();
        this.A01 = context;
        if ((((AnonymousClass03K) this.A0A).A01 & 4) != 0) {
            this.A0K = true;
        }
        context.getApplicationInfo();
        context.getResources().getBoolean(2131034112);
        this.A07.setTabContainer((AnonymousClass05X) null);
        this.A0A.CIN();
        this.A09.setHasNonEmbeddedTabs(false);
        TypedArray obtainStyledAttributes = this.A01.obtainStyledAttributes((AttributeSet) null, C002501d.A00, 2130968594, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.A09;
            if (actionBarOverlayLayout2.A03()) {
                this.A0E = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            A0J((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void A0Q(View view, AnonymousClass039 r3) {
        view.setLayoutParams(r3);
        this.A0A.CIc(view);
    }

    public C003901s(Dialog dialog) {
        A00(dialog.getWindow().getDecorView());
    }
}
